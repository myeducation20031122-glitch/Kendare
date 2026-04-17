package c4;

import com.google.android.gms.internal.ads.fz0;
import com.google.android.gms.internal.ads.gz0;
import com.google.android.gms.internal.ads.xy0;
import java.util.Collections;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2098b;

    public static Set m(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        Intrinsics.e(setSingleton, "singleton(element)");
        return setSingleton;
    }

    public static Set n(Object... objArr) {
        return objArr.length > 0 ? ArraysKt.K3(objArr) : EmptySet.f14122b;
    }

    public abstract void j(float f10, float f11, v6.t tVar);

    public abstract void k(l lVar);

    public abstract void l(Object obj);

    public abstract xy0 o(gz0 gz0Var);

    public abstract Object p();

    public abstract fz0 q(gz0 gz0Var);

    public abstract void r(fz0 fz0Var, fz0 fz0Var2);

    public abstract void s(fz0 fz0Var, Thread thread);

    public abstract boolean t(gz0 gz0Var, xy0 xy0Var, xy0 xy0Var2);

    public String toString() {
        switch (this.f2098b) {
            case 2:
                return p().toString();
            default:
                return super.toString();
        }
    }

    public abstract boolean u(gz0 gz0Var, Object obj, Object obj2);

    public abstract boolean v(gz0 gz0Var, fz0 fz0Var, fz0 fz0Var2);

    public c(int i10) {
        this.f2098b = i10;
    }

    public /* synthetic */ c(int i10, int i11) {
        this.f2098b = i10;
    }
}