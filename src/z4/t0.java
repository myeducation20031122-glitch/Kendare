package z4;

import android.app.NotificationManager;
import android.content.Context;
import android.util.Log;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19706b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19707e;

    public /* synthetic */ t0(Object obj, int i10) {
        this.f19706b = i10;
        this.f19707e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f19706b;
        Object obj = this.f19707e;
        switch (i10) {
            case 0:
                ((v0) obj).f19724u.b(new x4.b(4));
                break;
            case QueueFuseable.SYNC /* 1 */:
                y yVar = (y) obj;
                x4.g gVar = yVar.f19733j;
                Context context = yVar.f19732f;
                gVar.getClass();
                if (!x4.j.f18966a.getAndSet(true)) {
                    try {
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                        if (notificationManager != null) {
                            notificationManager.cancel(10436);
                            break;
                        }
                    } catch (SecurityException e10) {
                        Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e10);
                        return;
                    }
                }
                break;
            case 2:
                ((i0) obj).e();
                break;
            default:
                a5.k kVar = ((i0) ((d9.c) obj).f12366b).f19650e;
                kVar.g(kVar.getClass().getName().concat(" disconnecting because it was signed out."));
                break;
        }
    }
}