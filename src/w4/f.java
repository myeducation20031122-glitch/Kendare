package w4;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18660b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f18661e;

    public /* synthetic */ f(g gVar, int i10) {
        this.f18660b = i10;
        this.f18661e = gVar;
    }

    private final void a() throws RemoteException {
        boolean z7;
        g gVar = this.f18661e;
        while (true) {
            synchronized (gVar) {
                try {
                    if (gVar.f18662b != 2) {
                        return;
                    }
                    if (gVar.f18665j.isEmpty()) {
                        gVar.c();
                        return;
                    }
                    i iVar = (i) gVar.f18665j.poll();
                    gVar.f18666m.put(iVar.f18669a, iVar);
                    ((ScheduledExecutorService) gVar.f18667n.f18677d).schedule(new m.k(gVar, iVar, 27), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String strValueOf = String.valueOf(iVar);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
                        sb.append("Sending ");
                        sb.append(strValueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context context = (Context) gVar.f18667n.f18676c;
                    Messenger messenger = gVar.f18663e;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = iVar.f18671c;
                    messageObtain.arg1 = iVar.f18669a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    switch (((h) iVar).f18668e) {
                        case 0:
                            z7 = true;
                            break;
                        default:
                            z7 = false;
                            break;
                    }
                    bundle.putBoolean("oneWay", z7);
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", iVar.f18672d);
                    messageObtain.setData(bundle);
                    try {
                        d3.d dVar = gVar.f18664f;
                        Messenger messenger2 = (Messenger) dVar.f12309e;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            e eVar = (e) dVar.f12310f;
                            if (eVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = eVar.f18659b;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e10) {
                        gVar.a(2, e10.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        switch (this.f18660b) {
            case 0:
                this.f18661e.a(2, "Service disconnected");
                return;
            case QueueFuseable.SYNC /* 1 */:
                a();
                return;
            default:
                g gVar = this.f18661e;
                synchronized (gVar) {
                    if (gVar.f18662b == 1) {
                        gVar.a(1, "Timed out while binding");
                    }
                }
                return;
        }
    }
}