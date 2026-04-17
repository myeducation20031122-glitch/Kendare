package t5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r3 implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final String f17589b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s3 f17590e;

    public r3(s3 s3Var, String str) {
        this.f17590e = s3Var;
        this.f17589b = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        s3 s3Var = this.f17590e;
        if (iBinder == null) {
            i3 i3Var = s3Var.f17603a.f17251w;
            b4.i(i3Var);
            i3Var.f17400w.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i10 = com.google.android.gms.internal.measurement.a0.f10662b;
            String str = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            Object zVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.b0 ? (com.google.android.gms.internal.measurement.b0) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.measurement.z(iBinder, str, 4);
            if (zVar == null) {
                i3 i3Var2 = s3Var.f17603a.f17251w;
                b4.i(i3Var2);
                i3Var2.f17400w.a("Install Referrer Service implementation was not found");
            } else {
                i3 i3Var3 = s3Var.f17603a.f17251w;
                b4.i(i3Var3);
                i3Var3.Q.a("Install Referrer Service connected");
                a4 a4Var = s3Var.f17603a.M;
                b4.i(a4Var);
                a4Var.x(new l0.a(this, zVar, this, 17));
            }
        } catch (RuntimeException e10) {
            i3 i3Var4 = s3Var.f17603a.f17251w;
            b4.i(i3Var4);
            i3Var4.f17400w.b(e10, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        i3 i3Var = this.f17590e.f17603a.f17251w;
        b4.i(i3Var);
        i3Var.Q.a("Install Referrer Service disconnected");
    }
}