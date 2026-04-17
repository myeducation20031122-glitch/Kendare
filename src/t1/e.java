package t1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import m.b3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends t {

    /* renamed from: e0, reason: collision with root package name */
    public static final String[] f17027e0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: f0, reason: collision with root package name */
    public static final b3 f17028f0 = new b3(1, PointF.class, "topLeft");

    /* renamed from: g0, reason: collision with root package name */
    public static final b3 f17029g0 = new b3(2, PointF.class, "bottomRight");

    /* renamed from: h0, reason: collision with root package name */
    public static final b3 f17030h0 = new b3(3, PointF.class, "bottomRight");

    /* renamed from: i0, reason: collision with root package name */
    public static final b3 f17031i0 = new b3(4, PointF.class, "topLeft");

    /* renamed from: j0, reason: collision with root package name */
    public static final b3 f17032j0 = new b3(5, PointF.class, "position");

    public static void M(c0 c0Var) {
        View view = c0Var.f17018b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = c0Var.f17017a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c0Var.f17018b.getParent());
    }

    @Override // t1.t
    public final void e(c0 c0Var) {
        M(c0Var);
    }

    @Override // t1.t
    public final void i(c0 c0Var) {
        M(c0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    @Override // t1.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator m(ViewGroup viewGroup, c0 c0Var, c0 c0Var2) {
        int i10;
        Path pathC;
        b3 b3Var;
        ObjectAnimator objectAnimatorA;
        if (c0Var == null || c0Var2 == null) {
            return null;
        }
        HashMap map = c0Var.f17017a;
        HashMap map2 = c0Var2.f17017a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i11 = rect.left;
        int i12 = rect2.left;
        int i13 = rect.top;
        int i14 = rect2.top;
        int i15 = rect.right;
        int i16 = rect2.right;
        int i17 = rect.bottom;
        int i18 = rect2.bottom;
        int i19 = i15 - i11;
        int i20 = i17 - i13;
        int i21 = i16 - i12;
        int i22 = i18 - i14;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
            i10 = 0;
        } else {
            i10 = (i11 == i12 && i13 == i14) ? 0 : 1;
            if (i15 != i16 || i17 != i18) {
                i10++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i10++;
        }
        int i23 = i10;
        if (i23 <= 0) {
            return null;
        }
        View view = c0Var2.f17018b;
        e0.a(view, i11, i13, i15, i17);
        if (i23 == 2) {
            if (i19 != i21 || i20 != i22) {
                d dVar = new d(view);
                this.Z.getClass();
                ObjectAnimator objectAnimatorA2 = n.a(dVar, f17028f0, g8.e.C(i11, i13, i12, i14));
                this.Z.getClass();
                ObjectAnimator objectAnimatorA3 = n.a(dVar, f17029g0, g8.e.C(i15, i17, i16, i18));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new b(dVar));
                objectAnimatorA = animatorSet;
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    i5.h.c(viewGroup4, true);
                    q().b(new c(viewGroup4));
                }
                return objectAnimatorA;
            }
            this.Z.getClass();
            pathC = g8.e.C(i11, i13, i12, i14);
            b3Var = f17032j0;
        } else if (i11 == i12 && i13 == i14) {
            this.Z.getClass();
            pathC = g8.e.C(i15, i17, i16, i18);
            b3Var = f17030h0;
        } else {
            this.Z.getClass();
            pathC = g8.e.C(i11, i13, i12, i14);
            b3Var = f17031i0;
        }
        objectAnimatorA = n.a(view, b3Var, pathC);
        if (view.getParent() instanceof ViewGroup) {
        }
        return objectAnimatorA;
    }

    @Override // t1.t
    public final String[] s() {
        return f17027e0;
    }
}