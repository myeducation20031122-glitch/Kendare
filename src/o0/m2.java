package o0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m2 {

    /* renamed from: b, reason: collision with root package name */
    public static final m2 f15584b;

    /* renamed from: a, reason: collision with root package name */
    public final j2 f15585a;

    static {
        f15584b = Build.VERSION.SDK_INT >= 30 ? i2.f15565q : j2.f15573b;
    }

    public m2() {
        this.f15585a = new j2(this);
    }

    public static h0.c e(h0.c cVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, cVar.f13144a - i10);
        int iMax2 = Math.max(0, cVar.f13145b - i11);
        int iMax3 = Math.max(0, cVar.f13146c - i12);
        int iMax4 = Math.max(0, cVar.f13147d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? cVar : h0.c.b(iMax, iMax2, iMax3, iMax4);
    }

    public static m2 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        m2 m2Var = new m2(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            m2 m2VarI = c1.i(view);
            j2 j2Var = m2Var.f15585a;
            j2Var.p(m2VarI);
            j2Var.d(view.getRootView());
        }
        return m2Var;
    }

    public final int a() {
        return this.f15585a.j().f13147d;
    }

    public final int b() {
        return this.f15585a.j().f13144a;
    }

    public final int c() {
        return this.f15585a.j().f13146c;
    }

    public final int d() {
        return this.f15585a.j().f13145b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        return Objects.equals(this.f15585a, ((m2) obj).f15585a);
    }

    public final WindowInsets f() {
        j2 j2Var = this.f15585a;
        if (j2Var instanceof e2) {
            return ((e2) j2Var).f15536c;
        }
        return null;
    }

    public final int hashCode() {
        j2 j2Var = this.f15585a;
        if (j2Var == null) {
            return 0;
        }
        return j2Var.hashCode();
    }

    public m2(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f15585a = i10 >= 30 ? new i2(this, windowInsets) : i10 >= 29 ? new h2(this, windowInsets) : i10 >= 28 ? new g2(this, windowInsets) : new f2(this, windowInsets);
    }
}