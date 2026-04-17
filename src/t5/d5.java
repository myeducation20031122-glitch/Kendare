package t5;

import android.os.RemoteException;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17303b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d6 f17304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i5 f17305f;

    public /* synthetic */ d5(i5 i5Var, d6 d6Var, int i10) {
        this.f17303b = i10;
        this.f17305f = i5Var;
        this.f17304e = d6Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f17303b;
        i5 i5Var = this.f17305f;
        d6 d6Var = this.f17304e;
        switch (i10) {
            case 0:
                c3 c3Var = i5Var.f17428j;
                Object obj = i5Var.f15046b;
                if (c3Var != null) {
                    try {
                        fc.t.k(d6Var);
                        c3Var.F1(d6Var);
                    } catch (RemoteException e10) {
                        i3 i3Var = ((b4) obj).f17251w;
                        b4.i(i3Var);
                        i3Var.f17397n.b(e10, "Failed to reset data on the service: remote exception");
                    }
                    i5Var.A();
                    break;
                } else {
                    i3 i3Var2 = ((b4) obj).f17251w;
                    b4.i(i3Var2);
                    i3Var2.f17397n.a("Failed to reset data on the service: not connected to service");
                    break;
                }
            case QueueFuseable.SYNC /* 1 */:
                c3 c3Var2 = i5Var.f17428j;
                Object obj2 = i5Var.f15046b;
                if (c3Var2 == null) {
                    i3 i3Var3 = ((b4) obj2).f17251w;
                    b4.i(i3Var3);
                    i3Var3.f17397n.a("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        fc.t.k(d6Var);
                        c3Var2.Y(d6Var);
                        ((b4) obj2).o().u();
                        i5Var.s(c3Var2, null, d6Var);
                        i5Var.A();
                        break;
                    } catch (RemoteException e11) {
                        i3 i3Var4 = ((b4) obj2).f17251w;
                        b4.i(i3Var4);
                        i3Var4.f17397n.b(e11, "Failed to send app launch to the service");
                        return;
                    }
                }
            case 2:
                c3 c3Var3 = i5Var.f17428j;
                Object obj3 = i5Var.f15046b;
                if (c3Var3 == null) {
                    i3 i3Var5 = ((b4) obj3).f17251w;
                    b4.i(i3Var5);
                    i3Var5.f17397n.a("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        fc.t.k(d6Var);
                        c3Var3.Y2(d6Var);
                        i5Var.A();
                        break;
                    } catch (RemoteException e12) {
                        i3 i3Var6 = ((b4) obj3).f17251w;
                        b4.i(i3Var6);
                        i3Var6.f17397n.b(e12, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
            default:
                c3 c3Var4 = i5Var.f17428j;
                Object obj4 = i5Var.f15046b;
                if (c3Var4 == null) {
                    i3 i3Var7 = ((b4) obj4).f17251w;
                    b4.i(i3Var7);
                    i3Var7.f17397n.a("Failed to send consent settings to service");
                    break;
                } else {
                    try {
                        fc.t.k(d6Var);
                        c3Var4.l2(d6Var);
                        i5Var.A();
                        break;
                    } catch (RemoteException e13) {
                        i3 i3Var8 = ((b4) obj4).f17251w;
                        b4.i(i3Var8);
                        i3Var8.f17397n.b(e13, "Failed to send consent settings to the service");
                    }
                }
        }
    }
}