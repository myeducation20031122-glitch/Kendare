package w3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import o5.y;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18610a;

    /* renamed from: b, reason: collision with root package name */
    public final x3.d f18611b;

    /* renamed from: c, reason: collision with root package name */
    public final b f18612c;

    public d(Context context, x3.d dVar, b bVar) {
        this.f18610a = context;
        this.f18611b = dVar;
        this.f18612c = bVar;
    }

    public final void a(r3.i iVar, int i10, boolean z7) {
        Context context = this.f18610a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(iVar.f16409a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        o3.d dVar = iVar.f16411c;
        adler32.update(byteBufferAllocate.putInt(a4.a.a(dVar)).array());
        byte[] bArr = iVar.f16410b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z7) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        y.g(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseA = ((x3.l) this.f18611b).a();
        String strValueOf = String.valueOf(a4.a.a(dVar));
        String str = iVar.f16409a;
        long jLongValue = ((Long) x3.l.h(sQLiteDatabaseA.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf}), new o0.h(11))).longValue();
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        b bVar = this.f18612c;
        builder.setMinimumLatency(bVar.a(dVar, jLongValue, i10));
        Set set = ((c) bVar.f18606b.get(dVar)).f18609c;
        if (set.contains(e.f18613b)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(e.f18615f)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(e.f18614e)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", str);
        persistableBundle.putInt("priority", a4.a.a(dVar));
        if (bArr != null) {
            persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(bVar.a(dVar, jLongValue, i10)), Long.valueOf(jLongValue), Integer.valueOf(i10)};
        String strM = y.m("JobInfoScheduler");
        if (Log.isLoggable(strM, 3)) {
            Log.d(strM, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }
}