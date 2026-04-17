package w4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import x5.s;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static int f18648h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f18649i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f18650j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a, reason: collision with root package name */
    public final t.k f18651a = new t.k();

    /* renamed from: b, reason: collision with root package name */
    public final Context f18652b;

    /* renamed from: c, reason: collision with root package name */
    public final z0.b f18653c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f18654d;

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f18655e;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f18656f;

    /* renamed from: g, reason: collision with root package name */
    public e f18657g;

    public b(Context context) {
        this.f18652b = context;
        z0.b bVar = new z0.b();
        bVar.f19425b = 0;
        bVar.f19426c = context;
        this.f18653c = bVar;
        this.f18655e = new Messenger(new c(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f18654d = scheduledThreadPoolExecutor;
    }

    public static synchronized String b() {
        int i10;
        i10 = f18648h;
        f18648h = i10 + 1;
        return Integer.toString(i10);
    }

    public static synchronized void c(Context context, Intent intent) {
        try {
            if (f18649i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f18649i = PendingIntent.getBroadcast(context, 0, intent2, m5.a.f15183a);
            }
            intent.putExtra("app", f18649i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final s a(Bundle bundle) throws RemoteException {
        String strB = b();
        x5.l lVar = new x5.l();
        synchronized (this.f18651a) {
            this.f18651a.put(strB, lVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f18653c.b() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        c(this.f18652b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 5);
        sb.append("|ID|");
        sb.append(strB);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(strValueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f18655e);
        if (this.f18656f != null || this.f18657g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f18656f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f18657g.f18659b;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
        } else if (this.f18653c.b() == 2) {
            this.f18652b.sendBroadcast(intent);
        } else {
            this.f18652b.startService(intent);
        }
        lVar.f19011a.a(l.f18681b, new g.e(this, strB, this.f18654d.schedule(new androidx.activity.i(lVar, 25), 30L, TimeUnit.SECONDS), 29, 0));
        return lVar.f19011a;
    }

    public final void d(String str, Bundle bundle) {
        synchronized (this.f18651a) {
            try {
                x5.l lVar = (x5.l) this.f18651a.remove(str);
                if (lVar != null) {
                    lVar.b(bundle);
                } else {
                    String strValueOf = String.valueOf(str);
                    Log.w("Rpc", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}