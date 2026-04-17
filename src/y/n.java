package y;

import a0.u;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f19165a;

    /* renamed from: b, reason: collision with root package name */
    public int f19166b;

    /* renamed from: c, reason: collision with root package name */
    public int f19167c;

    /* renamed from: d, reason: collision with root package name */
    public int f19168d;

    /* renamed from: e, reason: collision with root package name */
    public int f19169e;

    /* renamed from: f, reason: collision with root package name */
    public int f19170f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f19171g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f19172h;

    public n(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f19172h = constraintLayout;
        this.f19171g = constraintLayout2;
    }

    public static boolean a(int i10, int i11, int i12) {
        if (i10 == i11) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i10);
        View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9 A[PHI: r7
      0x00f9: PHI (r7v1 int) = (r7v0 int), (r7v10 int) binds: [B:48:0x00a1, B:79:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(x.d dVar, b bVar) {
        int iMakeMeasureSpec;
        int iB;
        int iMakeMeasureSpec2;
        x.e eVar;
        int iMax;
        int i10;
        int iMakeMeasureSpec3;
        boolean z7;
        int measuredWidth;
        int i11;
        if (dVar == null) {
            return;
        }
        int baseline = 0;
        if (dVar.f18779g0 == 8) {
            bVar.f19129e = 0;
            bVar.f19130f = 0;
        } else {
            if (dVar.T == null) {
                return;
            }
            int i12 = bVar.f19125a;
            int i13 = bVar.f19126b;
            int iR = bVar.f19127c;
            int iL = bVar.f19128d;
            int i14 = this.f19165a + this.f19166b;
            int i15 = this.f19167c;
            View view = (View) dVar.f18777f0;
            int iB2 = v.h.b(i12);
            x.c cVar = dVar.K;
            x.c cVar2 = dVar.I;
            if (iB2 == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iR, 1073741824);
                iB = v.h.b(i13);
                if (iB == 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iL, 1073741824);
                    eVar = (x.e) dVar.T;
                    Object obj = this.f19172h;
                    if (eVar == null && x.k.b(((ConstraintLayout) obj).f778w, 256) && view.getMeasuredWidth() == dVar.r() && view.getMeasuredWidth() < eVar.r() && view.getMeasuredHeight() == dVar.l() && view.getMeasuredHeight() < eVar.l() && view.getBaseline() == dVar.f18767a0 && !dVar.A() && a(dVar.G, iMakeMeasureSpec, dVar.r()) && a(dVar.H, iMakeMeasureSpec2, dVar.l())) {
                        bVar.f19129e = dVar.r();
                        bVar.f19130f = dVar.l();
                        bVar.f19131g = dVar.f18767a0;
                        return;
                    }
                    boolean z10 = i12 != 3;
                    boolean z11 = i13 != 3;
                    boolean z12 = i13 != 4 || i13 == 1;
                    boolean z13 = i12 != 4 || i12 == 1;
                    boolean z14 = !z10 && dVar.W > 0.0f;
                    boolean z15 = !z11 && dVar.W > 0.0f;
                    if (view != null) {
                        return;
                    }
                    a0.e eVar2 = (a0.e) view.getLayoutParams();
                    int i16 = bVar.f19134j;
                    if (i16 != 1 && i16 != 2 && z10 && dVar.f18799r == 0 && z11 && dVar.f18800s == 0) {
                        z7 = false;
                        measuredWidth = 0;
                        i11 = -1;
                        baseline = 0;
                        iMax = 0;
                    } else {
                        if ((view instanceof u) && (dVar instanceof x.g)) {
                            ((u) view).j((x.g) dVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        dVar.G = iMakeMeasureSpec;
                        dVar.H = iMakeMeasureSpec2;
                        dVar.f18778g = false;
                        int measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight = view.getMeasuredHeight();
                        int baseline2 = view.getBaseline();
                        int i17 = dVar.f18802u;
                        int iMax2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
                        int i18 = dVar.f18803v;
                        if (i18 > 0) {
                            iMax2 = Math.min(i18, iMax2);
                        }
                        int i19 = dVar.f18805x;
                        iMax = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
                        int i20 = iMakeMeasureSpec;
                        int i21 = dVar.f18806y;
                        if (i21 > 0) {
                            iMax = Math.min(i21, iMax);
                        }
                        if (!x.k.b(((ConstraintLayout) obj).f778w, 1)) {
                            if (z14 && z12) {
                                iMax2 = (int) ((iMax * dVar.W) + 0.5f);
                            } else if (z15 && z13) {
                                iMax = (int) ((iMax2 / dVar.W) + 0.5f);
                            }
                        }
                        if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                            baseline = baseline2;
                            measuredWidth = iMax2;
                            z7 = false;
                        } else {
                            if (measuredWidth2 != iMax2) {
                                i10 = 1073741824;
                                iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                            } else {
                                i10 = 1073741824;
                                iMakeMeasureSpec3 = i20;
                            }
                            if (measuredHeight != iMax) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, i10);
                            }
                            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                            dVar.G = iMakeMeasureSpec3;
                            dVar.H = iMakeMeasureSpec2;
                            z7 = false;
                            dVar.f18778g = false;
                            measuredWidth = view.getMeasuredWidth();
                            int measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            iMax = measuredHeight2;
                        }
                        i11 = -1;
                    }
                    boolean z16 = baseline != i11;
                    if (measuredWidth != bVar.f19127c || iMax != bVar.f19128d) {
                        z7 = true;
                    }
                    bVar.f19133i = z7;
                    boolean z17 = eVar2.f24c0 ? true : z16;
                    if (z17 && baseline != -1 && dVar.f18767a0 != baseline) {
                        bVar.f19133i = true;
                    }
                    bVar.f19129e = measuredWidth;
                    bVar.f19130f = iMax;
                    bVar.f19132h = z17;
                } else {
                    if (iB == 1) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f19170f, i14, -2);
                    } else if (iB == 2) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f19170f, i14, -2);
                        boolean z18 = dVar.f18800s == 1;
                        int i22 = bVar.f19134j;
                        if (i22 == 1 || i22 == 2) {
                            boolean z19 = view.getMeasuredWidth() == dVar.r();
                            if (bVar.f19134j == 2 || !z18 || ((z18 && z19) || dVar.C())) {
                                iL = dVar.l();
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iL, 1073741824);
                            }
                        }
                    } else if (iB != 3) {
                        iMakeMeasureSpec2 = 0;
                    } else {
                        int i23 = this.f19170f;
                        int i24 = cVar2 != null ? dVar.J.f18763g : 0;
                        if (cVar != null) {
                            i24 += dVar.L.f18763g;
                        }
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i23, i14 + i24, -1);
                    }
                    eVar = (x.e) dVar.T;
                    Object obj2 = this.f19172h;
                    if (eVar == null) {
                    }
                    if (i12 != 3) {
                    }
                    if (i13 != 3) {
                    }
                    if (i13 != 4) {
                        if (i12 != 4) {
                            if (z10) {
                                if (z11) {
                                    if (view != null) {
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (iB2 == 1) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f19169e, i15, -2);
                } else if (iB2 == 2) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f19169e, i15, -2);
                    boolean z20 = dVar.f18799r == 1;
                    int i25 = bVar.f19134j;
                    if (i25 == 1 || i25 == 2) {
                        boolean z21 = view.getMeasuredHeight() == dVar.l();
                        if (bVar.f19134j == 2 || !z20 || ((z20 && z21) || dVar.B())) {
                            iR = dVar.r();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iR, 1073741824);
                        }
                    }
                } else if (iB2 != 3) {
                    iMakeMeasureSpec = 0;
                } else {
                    int i26 = this.f19169e;
                    int i27 = cVar2 != null ? cVar2.f18763g : 0;
                    if (cVar != null) {
                        i27 += cVar.f18763g;
                    }
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i26, i15 + i27, -1);
                }
                iB = v.h.b(i13);
                if (iB == 0) {
                }
            }
        }
        bVar.f19131g = baseline;
    }

    public n(o oVar, x.d dVar, v.d dVar2, int i10) {
        this.f19172h = oVar;
        this.f19171g = new WeakReference(dVar);
        x.c cVar = dVar.I;
        dVar2.getClass();
        this.f19165a = v.d.n(cVar);
        this.f19166b = v.d.n(dVar.J);
        this.f19167c = v.d.n(dVar.K);
        this.f19168d = v.d.n(dVar.L);
        this.f19169e = v.d.n(dVar.M);
        this.f19170f = i10;
    }
}