package o0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f15630a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f15631b;

    /* renamed from: c, reason: collision with root package name */
    public final View f15632c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15633d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f15634e;

    public v(View view) {
        this.f15632c = view;
    }

    public final boolean a(float f10, float f11, boolean z7) {
        ViewParent viewParentF;
        if (!this.f15633d || (viewParentF = f(0)) == null) {
            return false;
        }
        try {
            return l1.a(viewParentF, this.f15632c, f10, f11, z7);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public final boolean b(float f10, float f11) {
        ViewParent viewParentF;
        if (!this.f15633d || (viewParentF = f(0)) == null) {
            return false;
        }
        try {
            return l1.b(viewParentF, this.f15632c, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public final boolean c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent viewParentF;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f15633d || (viewParentF = f(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f15632c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f15634e == null) {
                this.f15634e = new int[2];
            }
            iArr3 = this.f15634e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.f15632c;
        if (viewParentF instanceof w) {
            ((w) viewParentF).c(view2, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                l1.c(viewParentF, view2, i10, i11, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final void d(int i10, int i11, int i12, int[] iArr) {
        e(0, i10, 0, i11, null, i12, iArr);
    }

    public final boolean e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentF;
        int i15;
        int i16;
        int[] iArr3;
        if (!this.f15633d || (viewParentF = f(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f15632c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            if (this.f15634e == null) {
                this.f15634e = new int[2];
            }
            int[] iArr4 = this.f15634e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f15632c;
        if (viewParentF instanceof x) {
            ((x) viewParentF).d(view2, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (viewParentF instanceof w) {
                ((w) viewParentF).e(view2, i10, i11, i12, i13, i14);
            } else if (i14 == 0) {
                try {
                    l1.d(viewParentF, view2, i10, i11, i12, i13);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    public final ViewParent f(int i10) {
        if (i10 == 0) {
            return this.f15630a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f15631b;
    }

    public final boolean g(int i10) {
        return f(i10) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i10, int i11) {
        boolean zF;
        if (g(i11)) {
            return true;
        }
        if (!this.f15633d) {
            return false;
        }
        View view = this.f15632c;
        View view2 = view;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            boolean z7 = parent instanceof w;
            if (z7) {
                zF = ((w) parent).f(view2, view, i10, i11);
            } else {
                if (i11 == 0) {
                    try {
                        zF = l1.f(parent, view2, view, i10);
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                    }
                }
                if (!(parent instanceof View)) {
                    view2 = parent;
                }
            }
            if (zF) {
                if (i11 == 0) {
                    this.f15630a = parent;
                } else if (i11 == 1) {
                    this.f15631b = parent;
                }
                if (z7) {
                    ((w) parent).a(view2, view, i10, i11);
                } else if (i11 == 0) {
                    try {
                        l1.e(parent, view2, view, i10);
                    } catch (AbstractMethodError e11) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                    }
                }
                return true;
            }
            if (!(parent instanceof View)) {
            }
        }
        return false;
    }

    public final void i(int i10) {
        ViewParent viewParentF = f(i10);
        if (viewParentF != null) {
            boolean z7 = viewParentF instanceof w;
            View view = this.f15632c;
            if (z7) {
                ((w) viewParentF).b(view, i10);
            } else if (i10 == 0) {
                try {
                    l1.g(viewParentF, view);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 == 0) {
                this.f15630a = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f15631b = null;
            }
        }
    }
}