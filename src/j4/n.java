package j4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.cf;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.qf;
import com.google.android.gms.internal.ads.sr;
import com.google.android.gms.internal.ads.uw;
import com.google.android.gms.internal.ads.wr;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f13766a;

    static {
        String str = "com.google.android.gms.ads.internal.client.IClientApi";
        s0 q0Var = null;
        try {
            int i10 = 0;
            Object objNewInstance = android.support.v4.media.b.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    q0Var = iInterfaceQueryLocalInterface instanceof s0 ? (s0) iInterfaceQueryLocalInterface : new q0(iBinder, str, i10);
                }
            } else {
                wr.g("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            wr.g("Failed to instantiate ClientApi class.");
        }
        f13766a = q0Var;
    }

    public abstract Object a();

    public abstract Object b(s0 s0Var);

    public abstract Object c();

    public final Object d(Context context, boolean z7) {
        boolean z10;
        Object objC;
        Object objB;
        if (!z7) {
            sr srVar = o.f13771f.f13772a;
            if (x4.g.f18964b.d(context, 12451000) != 0) {
                wr.b("Google Play Services is not available.");
                z7 = true;
            }
        }
        boolean z11 = false;
        boolean z12 = !(i5.f.a(context, ModuleDescriptor.MODULE_ID) <= i5.f.d(context, ModuleDescriptor.MODULE_ID, false));
        ge.a(context);
        if (((Boolean) cf.f3337a.k()).booleanValue()) {
            z10 = false;
        } else if (((Boolean) cf.f3338b.k()).booleanValue()) {
            z10 = true;
            z11 = true;
        } else {
            z11 = z7 | z12;
            z10 = false;
        }
        s0 s0Var = f13766a;
        Object objB2 = null;
        if (z11) {
            if (s0Var != null) {
                try {
                    objB = b(s0Var);
                } catch (RemoteException e10) {
                    wr.h("Cannot invoke local loader using ClientApi class.", e10);
                }
                if (objB == null && !z10) {
                    try {
                        objB2 = c();
                    } catch (RemoteException e11) {
                        wr.h("Cannot invoke remote loader.", e11);
                    }
                    objB = objB2;
                }
            } else {
                wr.g("ClientApi class cannot be loaded.");
            }
            objB = null;
            if (objB == null) {
                objB2 = c();
                objB = objB2;
            }
        } else {
            try {
                objC = c();
            } catch (RemoteException e12) {
                wr.h("Cannot invoke remote loader.", e12);
                objC = null;
            }
            if (objC == null) {
                int iIntValue = ((Long) qf.f7722a.k()).intValue();
                o oVar = o.f13771f;
                if (oVar.f13776e.nextInt(iIntValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    String str = oVar.f13775d.f10587b;
                    sr srVar2 = oVar.f13772a;
                    srVar2.getClass();
                    sr.k(context, str, bundle, new uw(srVar2, 5));
                }
            }
            if (objC == null) {
                if (s0Var != null) {
                    try {
                        objB2 = b(s0Var);
                    } catch (RemoteException e13) {
                        wr.h("Cannot invoke local loader using ClientApi class.", e13);
                    }
                } else {
                    wr.g("ClientApi class cannot be loaded.");
                }
                objB = objB2;
            } else {
                objB = objC;
            }
        }
        return objB == null ? a() : objB;
    }
}