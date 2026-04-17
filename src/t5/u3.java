package t5;

import com.google.android.gms.internal.measurement.l9;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class u3 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17625b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w3 f17626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f17627f;

    public /* synthetic */ u3(w3 w3Var, String str, int i10) {
        this.f17625b = i10;
        this.f17626e = w3Var;
        this.f17627f = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        int i10 = 0;
        int i11 = this.f17625b;
        String str = this.f17627f;
        w3 w3Var = this.f17626e;
        switch (i11) {
            case 0:
                k kVar = w3Var.f17607e.f17666f;
                w5.F(kVar);
                i4 i4VarJ = kVar.J(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((b4) w3Var.f15046b).f17249t.t();
                map.put("gmp_version", 68000L);
                if (i4VarJ != null) {
                    String strG = i4VarJ.G();
                    if (strG != null) {
                        map.put("app_version", strG);
                    }
                    map.put("app_version_int", Long.valueOf(i4VarJ.A()));
                    map.put("dynamite_version", Long.valueOf(i4VarJ.B()));
                }
                return map;
            case QueueFuseable.SYNC /* 1 */:
                return new com.google.android.gms.internal.measurement.f6(new l9(1, w3Var, str), 0);
            default:
                return new com.google.android.gms.internal.measurement.u4(new u3(w3Var, str, i10));
        }
    }
}