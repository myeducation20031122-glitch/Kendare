package v2;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.internal.ads.yr;
import com.google.android.gms.internal.measurement.l9;
import com.onesignal.OSFocusHandler$OnLostFocusWorker;
import com.onesignal.e;
import com.onesignal.f0;
import com.onesignal.g1;
import com.onesignal.l;
import com.onesignal.q3;
import com.onesignal.s;
import com.onesignal.z3;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import z1.p;
import z1.q;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18374b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18375e;

    public /* synthetic */ a(int i10, Object obj) {
        this.f18374b = i10;
        this.f18375e = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        StringBuilder sb;
        switch (this.f18374b) {
            case 0:
                Process.setThreadPriority(9);
                super.run();
                return;
            case QueueFuseable.SYNC /* 1 */:
                Map map = (Map) this.f18375e;
                Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String str : map.keySet()) {
                    builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
                }
                String string = builderBuildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 65);
                            sb2.append("Received non-success response code ");
                            sb2.append(responseCode);
                            sb2.append(" from pinging URL: ");
                            sb2.append(string);
                            Log.w("HttpUrlPinger", sb2.toString());
                        }
                        httpURLConnection.disconnect();
                        return;
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (IOException e10) {
                    e = e10;
                    String message = e.getMessage();
                    sb = new StringBuilder(String.valueOf(message).length() + String.valueOf(string).length() + 27);
                    sb.append("Error while pinging URL: ");
                    sb.append(string);
                    sb.append(". ");
                    sb.append(message);
                    Log.w("HttpUrlPinger", sb.toString(), e);
                    return;
                } catch (IndexOutOfBoundsException e11) {
                    e = e11;
                    String message2 = e.getMessage();
                    sb = new StringBuilder(String.valueOf(message2).length() + String.valueOf(string).length() + 32);
                    sb.append("Error while parsing ping URL: ");
                    sb.append(string);
                    sb.append(". ");
                    sb.append(message2);
                    Log.w("HttpUrlPinger", sb.toString(), e);
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                    String message3 = e.getMessage();
                    sb = new StringBuilder(String.valueOf(message3).length() + String.valueOf(string).length() + 27);
                    sb.append("Error while pinging URL: ");
                    sb.append(string);
                    sb.append(". ");
                    sb.append(message3);
                    Log.w("HttpUrlPinger", sb.toString(), e);
                    return;
                } finally {
                }
            case 2:
                new yr(null).mo13zza((String) this.f18375e);
                return;
            default:
                s sVarM = z3.m();
                Long lC = sVarM.c();
                synchronized (sVarM.f12107c) {
                    l lVar = sVarM.f12105a;
                    String str2 = "Application stopped focus time: " + ((Long) sVarM.f12106b) + " timeElapsed: " + lC;
                    lVar.getClass();
                    l.d(str2);
                }
                if (lC != null) {
                    Collection collectionValues = ((ConcurrentHashMap) ((l9) z3.B.f12054b).f10881e).values();
                    Intrinsics.e(collectionValues, "trackers.values");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : collectionValues) {
                        if (!Intrinsics.a(((w9.a) obj).d(), v9.a.f18516a)) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(fa.d.f3(arrayList));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((w9.a) it.next()).c());
                    }
                    ((f0) sVarM.f12108d).b(arrayList2).g(lC.longValue(), arrayList2);
                }
                g1 g1Var = ((e) this.f18375e).f11769a;
                Context context = z3.f12248b;
                g1Var.getClass();
                Intrinsics.f(context, "context");
                p pVar = p.f19482b;
                z1.e eVar = new z1.e();
                p pVar2 = p.f19483e;
                z1.c cVar = new z1.c();
                cVar.f19459a = pVar;
                cVar.f19464f = -1L;
                cVar.f19465g = -1L;
                cVar.f19466h = new z1.e();
                cVar.f19460b = false;
                int i10 = Build.VERSION.SDK_INT;
                cVar.f19461c = false;
                cVar.f19459a = pVar2;
                cVar.f19462d = false;
                cVar.f19463e = false;
                if (i10 >= 24) {
                    cVar.f19466h = eVar;
                    cVar.f19464f = -1L;
                    cVar.f19465g = -1L;
                }
                q qVar = new q(OSFocusHandler$OnLostFocusWorker.class);
                qVar.f19498b.f13267j = cVar;
                q qVarB = qVar.b(2000L, TimeUnit.MILLISECONDS);
                qVarB.f19499c.add("FOCUS_LOST_WORKER_TAG");
                q3.s(context).q("FOCUS_LOST_WORKER_TAG", Collections.singletonList(qVarB.a()));
                return;
        }
    }

    public a(e eVar) {
        this.f18374b = 3;
        this.f18375e = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s2.a aVar, Runnable runnable) {
        super(runnable);
        this.f18374b = 0;
        this.f18375e = aVar;
    }
}