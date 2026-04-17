package b4;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.m1;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.internal.ads.yl0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kc.r;
import o0.c1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f1904a;

    /* renamed from: b, reason: collision with root package name */
    public boolean[] f1905b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1906c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f1907d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f1908e;

    public d(a aVar) {
        this.f1904a = aVar;
    }

    public final void a(List list, c cVar, int i10, int i11) {
        cVar.f1898i = i11;
        this.f1904a.getClass();
        cVar.f1901l = i10;
        list.add(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0458 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(yl0 yl0Var, int i10, int i11, int i12, int i13, int i14, List list) {
        int iL;
        int I;
        int paddingStart;
        int paddingEnd;
        yl0 yl0Var2;
        Object obj;
        List list2;
        int i15;
        int i16;
        int iRound;
        boolean z7;
        int i17;
        int i18;
        c cVar;
        int iX;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int[] iArr;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int measuredHeight;
        int i32;
        int minimumHeight;
        int i33;
        Object obj2 = this.f1904a;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) obj2;
        boolean zB1 = flexboxLayoutManager.b1();
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        List arrayList = list == null ? new ArrayList() : list;
        yl0Var.f10133f = arrayList;
        boolean z10 = i14 == -1;
        l1 l1Var = (l1) obj2;
        if (zB1) {
            RecyclerView recyclerView = l1Var.f1538b;
            if (recyclerView != null) {
                WeakHashMap weakHashMap = c1.f15515a;
                iL = recyclerView.getPaddingStart();
            } else {
                iL = 0;
            }
        } else {
            iL = l1Var.L();
        }
        l1 l1Var2 = (l1) obj2;
        if (zB1) {
            RecyclerView recyclerView2 = l1Var2.f1538b;
            if (recyclerView2 != null) {
                WeakHashMap weakHashMap2 = c1.f15515a;
                I = recyclerView2.getPaddingEnd();
            } else {
                I = 0;
            }
        } else {
            I = l1Var2.I();
        }
        l1 l1Var3 = (l1) obj2;
        if (zB1) {
            paddingStart = l1Var3.L();
        } else {
            RecyclerView recyclerView3 = l1Var3.f1538b;
            if (recyclerView3 != null) {
                WeakHashMap weakHashMap3 = c1.f15515a;
                paddingStart = recyclerView3.getPaddingStart();
            } else {
                paddingStart = 0;
            }
        }
        if (zB1) {
            paddingEnd = ((l1) obj2).I();
        } else {
            RecyclerView recyclerView4 = ((l1) obj2).f1538b;
            if (recyclerView4 != null) {
                WeakHashMap weakHashMap4 = c1.f15515a;
                paddingEnd = recyclerView4.getPaddingEnd();
            } else {
                paddingEnd = 0;
            }
        }
        c cVar2 = new c();
        int i34 = i13;
        cVar2.f1900k = i34;
        int i35 = iL + I;
        cVar2.f1890a = i35;
        int iB = flexboxLayoutManager.f2436z.b();
        int i36 = 0;
        int i37 = 0;
        int i38 = Integer.MIN_VALUE;
        while (true) {
            if (i34 >= iB) {
                yl0Var2 = yl0Var;
                break;
            }
            boolean z11 = z10;
            View viewX0 = flexboxLayoutManager.X0(i34);
            if (viewX0 == null) {
                if (i34 == iB - 1 && cVar2.f1893d - cVar2.f1894e != 0) {
                    a(arrayList, cVar2, i34, i37);
                }
                obj = obj2;
            } else {
                obj = obj2;
                if (viewX0.getVisibility() == 8) {
                    int i39 = cVar2.f1894e + 1;
                    cVar2.f1894e = i39;
                    int i40 = cVar2.f1893d + 1;
                    cVar2.f1893d = i40;
                    if (i34 == iB - 1 && i40 - i39 != 0) {
                        a(arrayList, cVar2, i34, i37);
                    }
                } else {
                    if (viewX0 instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) viewX0;
                        f fVar = (f) ((b) compoundButton.getLayoutParams());
                        i15 = iB;
                        int i41 = fVar.f1921w;
                        list2 = arrayList;
                        int i42 = fVar.M;
                        Drawable drawableR = com.bumptech.glide.d.r(compoundButton);
                        int minimumWidth = drawableR == null ? 0 : drawableR.getMinimumWidth();
                        if (drawableR == null) {
                            i33 = -1;
                            minimumHeight = 0;
                        } else {
                            minimumHeight = drawableR.getMinimumHeight();
                            i33 = -1;
                        }
                        if (i41 == i33) {
                            i41 = minimumWidth;
                        }
                        fVar.f1921w = i41;
                        if (i42 == i33) {
                            i42 = minimumHeight;
                        }
                        fVar.M = i42;
                    } else {
                        list2 = arrayList;
                        i15 = iB;
                    }
                    b bVar = (b) viewX0.getLayoutParams();
                    f fVar2 = (f) bVar;
                    if (fVar2.f1919t == 4) {
                        cVar2.f1899j.add(Integer.valueOf(i34));
                    }
                    int i43 = zB1 ? ((ViewGroup.MarginLayoutParams) fVar2).width : ((ViewGroup.MarginLayoutParams) fVar2).height;
                    float f10 = fVar2.f1920u;
                    if (f10 != -1.0f) {
                        i16 = i43;
                        if (mode == 1073741824) {
                            iRound = Math.round(size * f10);
                        }
                        if (zB1) {
                            z7 = zB1;
                            i17 = mode;
                            i18 = size;
                            cVar = cVar2;
                            int iX2 = l1.x(flexboxLayoutManager.f1550n, flexboxLayoutManager.f1548l, ((ViewGroup.MarginLayoutParams) ((f) bVar)).rightMargin + ((ViewGroup.MarginLayoutParams) fVar2).leftMargin + paddingStart + paddingEnd + i37, ((ViewGroup.MarginLayoutParams) ((f) bVar)).width, flexboxLayoutManager.e());
                            int iX3 = l1.x(flexboxLayoutManager.f1551o, flexboxLayoutManager.f1549m, ((ViewGroup.MarginLayoutParams) ((f) bVar)).bottomMargin + ((ViewGroup.MarginLayoutParams) ((f) bVar)).topMargin + i35, iRound, flexboxLayoutManager.f());
                            viewX0.measure(iX2, iX3);
                            r(viewX0, i34, iX2, iX3);
                            iX = iX3;
                        } else {
                            i18 = size;
                            i17 = mode;
                            z7 = zB1;
                            iX = l1.x(flexboxLayoutManager.f1550n, flexboxLayoutManager.f1548l, ((ViewGroup.MarginLayoutParams) ((f) bVar)).rightMargin + ((ViewGroup.MarginLayoutParams) fVar2).leftMargin + i35, iRound, flexboxLayoutManager.e());
                            cVar = cVar2;
                            int iX4 = l1.x(flexboxLayoutManager.f1551o, flexboxLayoutManager.f1549m, ((ViewGroup.MarginLayoutParams) ((f) bVar)).bottomMargin + ((ViewGroup.MarginLayoutParams) ((f) bVar)).topMargin + paddingStart + paddingEnd + i37, ((ViewGroup.MarginLayoutParams) ((f) bVar)).height, flexboxLayoutManager.f());
                            viewX0.measure(iX, iX4);
                            r(viewX0, i34, iX, iX4);
                        }
                        flexboxLayoutManager.k1(viewX0, i34);
                        c(viewX0, i34);
                        int iCombineMeasuredStates = View.combineMeasuredStates(i36, viewX0.getMeasuredState());
                        cVar2 = cVar;
                        int i44 = cVar2.f1890a;
                        int measuredWidth = (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).rightMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).bottomMargin) + (!z7 ? ((ViewGroup.MarginLayoutParams) fVar2).leftMargin : ((ViewGroup.MarginLayoutParams) fVar2).topMargin) + (!z7 ? viewX0.getMeasuredWidth() : viewX0.getMeasuredHeight());
                        int size2 = list2.size();
                        if (flexboxLayoutManager.f2427q != 0) {
                            if (fVar2.P) {
                                i19 = iCombineMeasuredStates;
                                i22 = i18;
                            } else {
                                if (i17 != 0) {
                                    int i45 = flexboxLayoutManager.f2430t;
                                    i19 = iCombineMeasuredStates;
                                    if (i45 == -1 || i45 > size2 + 1) {
                                        if (flexboxLayoutManager.b1()) {
                                            i20 = ((m1) viewX0.getLayoutParams()).f1568e.left;
                                            i21 = ((m1) viewX0.getLayoutParams()).f1568e.right;
                                        } else {
                                            i20 = ((m1) viewX0.getLayoutParams()).f1568e.top;
                                            i21 = ((m1) viewX0.getLayoutParams()).f1568e.bottom;
                                        }
                                        int i46 = i20 + i21;
                                        if (i46 > 0) {
                                            measuredWidth += i46;
                                        }
                                        int i47 = i44 + measuredWidth;
                                        i22 = i18;
                                        if (i22 >= i47) {
                                            i18 = i22;
                                        }
                                    }
                                }
                                arrayList = list2;
                                cVar2.f1893d++;
                                i23 = i38;
                                boolean z12 = cVar2.f1902m;
                                float f11 = fVar2.f1917m;
                                cVar2.f1902m = z12 | (f11 == 0.0f);
                                boolean z13 = cVar2.f1903n;
                                float f12 = fVar2.f1918n;
                                cVar2.f1903n = z13 | (f12 == 0.0f);
                                iArr = this.f1906c;
                                if (iArr != null) {
                                    iArr[i34] = arrayList.size();
                                }
                                int i48 = cVar2.f1890a;
                                int measuredWidth2 = !z7 ? viewX0.getMeasuredWidth() : viewX0.getMeasuredHeight();
                                if (z7) {
                                    i25 = i35;
                                    i26 = ((ViewGroup.MarginLayoutParams) ((f) bVar)).topMargin;
                                } else {
                                    i25 = i35;
                                    i26 = ((ViewGroup.MarginLayoutParams) ((f) bVar)).leftMargin;
                                }
                                cVar2.f1890a = (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).rightMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).bottomMargin) + i26 + measuredWidth2 + i48;
                                cVar2.f1895f += f11;
                                cVar2.f1896g += f12;
                                flexboxLayoutManager.d(FlexboxLayoutManager.O, viewX0);
                                if (flexboxLayoutManager.b1()) {
                                    i27 = ((m1) viewX0.getLayoutParams()).f1568e.top;
                                    i28 = ((m1) viewX0.getLayoutParams()).f1568e.bottom;
                                } else {
                                    i27 = ((m1) viewX0.getLayoutParams()).f1568e.left;
                                    i28 = ((m1) viewX0.getLayoutParams()).f1568e.right;
                                }
                                int i49 = i27 + i28;
                                cVar2.f1890a += i49;
                                cVar2.f1891b += i49;
                                int iMax = Math.max(i23, flexboxLayoutManager.W0(viewX0) + (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).bottomMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).rightMargin) + (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).topMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).leftMargin) + (!z7 ? viewX0.getMeasuredHeight() : viewX0.getMeasuredWidth()));
                                cVar2.f1892c = Math.max(cVar2.f1892c, iMax);
                                if (z7) {
                                    if (flexboxLayoutManager.f2427q != 2) {
                                        i31 = cVar2.f1897h;
                                        measuredHeight = viewX0.getBaseline();
                                        i32 = ((ViewGroup.MarginLayoutParams) fVar2).topMargin;
                                    } else {
                                        i31 = cVar2.f1897h;
                                        measuredHeight = viewX0.getMeasuredHeight() - viewX0.getBaseline();
                                        i32 = ((ViewGroup.MarginLayoutParams) fVar2).bottomMargin;
                                    }
                                    cVar2.f1897h = Math.max(i31, measuredHeight + i32);
                                }
                                if (i34 == i15 - 1 && cVar2.f1893d - cVar2.f1894e != 0) {
                                    a(arrayList, cVar2, i34, i37);
                                    i37 += cVar2.f1892c;
                                }
                                if (i14 == -1 && arrayList.size() > 0) {
                                    if (((c) arrayList.get(arrayList.size() - 1)).f1901l >= i14 && i34 >= i14 && !z11) {
                                        i37 = -cVar2.f1892c;
                                        z10 = true;
                                        i29 = i12;
                                    }
                                    if (i37 <= i29 && z10) {
                                        yl0Var2 = yl0Var;
                                        i36 = i19;
                                        break;
                                    }
                                    i30 = iMax;
                                    i36 = i19;
                                    i34++;
                                    i35 = i25;
                                    obj2 = obj;
                                    iB = i15;
                                    mode = i17;
                                    zB1 = z7;
                                    i38 = i30;
                                    size = i18;
                                }
                                i29 = i12;
                                z10 = z11;
                                if (i37 <= i29) {
                                }
                                i30 = iMax;
                                i36 = i19;
                                i34++;
                                i35 = i25;
                                obj2 = obj;
                                iB = i15;
                                mode = i17;
                                zB1 = z7;
                                i38 = i30;
                                size = i18;
                            }
                            if (cVar2.f1893d - cVar2.f1894e > 0) {
                                if (i34 > 0) {
                                    i24 = i34 - 1;
                                    arrayList = list2;
                                } else {
                                    arrayList = list2;
                                    i24 = 0;
                                }
                                a(arrayList, cVar2, i24, i37);
                                i37 += cVar2.f1892c;
                            } else {
                                arrayList = list2;
                            }
                            if (!z7) {
                                i18 = i22;
                                if (((ViewGroup.MarginLayoutParams) fVar2).width == -1) {
                                    l1 l1Var4 = (l1) obj;
                                    viewX0.measure(l1.x(flexboxLayoutManager.f1550n, flexboxLayoutManager.f1548l, l1Var4.K() + l1Var4.J() + ((ViewGroup.MarginLayoutParams) fVar2).leftMargin + ((ViewGroup.MarginLayoutParams) fVar2).rightMargin + i37, ((ViewGroup.MarginLayoutParams) fVar2).width, flexboxLayoutManager.e()), iX);
                                    c(viewX0, i34);
                                }
                                cVar2 = new c();
                                cVar2.f1893d = 1;
                                cVar2.f1890a = i35;
                                cVar2.f1900k = i34;
                                i23 = Integer.MIN_VALUE;
                                boolean z122 = cVar2.f1902m;
                                float f112 = fVar2.f1917m;
                                cVar2.f1902m = z122 | (f112 == 0.0f);
                                boolean z132 = cVar2.f1903n;
                                float f122 = fVar2.f1918n;
                                cVar2.f1903n = z132 | (f122 == 0.0f);
                                iArr = this.f1906c;
                                if (iArr != null) {
                                }
                                int i482 = cVar2.f1890a;
                                if (!z7) {
                                }
                                if (z7) {
                                }
                                cVar2.f1890a = (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).rightMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).bottomMargin) + i26 + measuredWidth2 + i482;
                                cVar2.f1895f += f112;
                                cVar2.f1896g += f122;
                                flexboxLayoutManager.d(FlexboxLayoutManager.O, viewX0);
                                if (flexboxLayoutManager.b1()) {
                                }
                                int i492 = i27 + i28;
                                cVar2.f1890a += i492;
                                cVar2.f1891b += i492;
                                if (!z7) {
                                }
                                if (!z7) {
                                }
                                int iMax2 = Math.max(i23, flexboxLayoutManager.W0(viewX0) + (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).bottomMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).rightMargin) + (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).topMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).leftMargin) + (!z7 ? viewX0.getMeasuredHeight() : viewX0.getMeasuredWidth()));
                                cVar2.f1892c = Math.max(cVar2.f1892c, iMax2);
                                if (z7) {
                                }
                                if (i34 == i15 - 1) {
                                }
                                if (i14 == -1) {
                                }
                                i29 = i12;
                                z10 = z11;
                                if (i37 <= i29) {
                                }
                                i30 = iMax2;
                                i36 = i19;
                                i34++;
                                i35 = i25;
                                obj2 = obj;
                                iB = i15;
                                mode = i17;
                                zB1 = z7;
                                i38 = i30;
                                size = i18;
                            } else if (((ViewGroup.MarginLayoutParams) fVar2).height == -1) {
                                l1 l1Var5 = (l1) obj;
                                i18 = i22;
                                viewX0.measure(iX, l1.x(flexboxLayoutManager.f1551o, flexboxLayoutManager.f1549m, l1Var5.I() + l1Var5.L() + ((ViewGroup.MarginLayoutParams) fVar2).topMargin + ((ViewGroup.MarginLayoutParams) fVar2).bottomMargin + i37, ((ViewGroup.MarginLayoutParams) fVar2).height, flexboxLayoutManager.f()));
                                c(viewX0, i34);
                                cVar2 = new c();
                                cVar2.f1893d = 1;
                                cVar2.f1890a = i35;
                                cVar2.f1900k = i34;
                                i23 = Integer.MIN_VALUE;
                                boolean z1222 = cVar2.f1902m;
                                float f1122 = fVar2.f1917m;
                                cVar2.f1902m = z1222 | (f1122 == 0.0f);
                                boolean z1322 = cVar2.f1903n;
                                float f1222 = fVar2.f1918n;
                                cVar2.f1903n = z1322 | (f1222 == 0.0f);
                                iArr = this.f1906c;
                                if (iArr != null) {
                                }
                                int i4822 = cVar2.f1890a;
                                if (!z7) {
                                }
                                if (z7) {
                                }
                                cVar2.f1890a = (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).rightMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).bottomMargin) + i26 + measuredWidth2 + i4822;
                                cVar2.f1895f += f1122;
                                cVar2.f1896g += f1222;
                                flexboxLayoutManager.d(FlexboxLayoutManager.O, viewX0);
                                if (flexboxLayoutManager.b1()) {
                                }
                                int i4922 = i27 + i28;
                                cVar2.f1890a += i4922;
                                cVar2.f1891b += i4922;
                                if (!z7) {
                                }
                                if (!z7) {
                                }
                                int iMax22 = Math.max(i23, flexboxLayoutManager.W0(viewX0) + (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).bottomMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).rightMargin) + (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).topMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).leftMargin) + (!z7 ? viewX0.getMeasuredHeight() : viewX0.getMeasuredWidth()));
                                cVar2.f1892c = Math.max(cVar2.f1892c, iMax22);
                                if (z7) {
                                }
                                if (i34 == i15 - 1) {
                                    a(arrayList, cVar2, i34, i37);
                                    i37 += cVar2.f1892c;
                                }
                                if (i14 == -1) {
                                }
                                i29 = i12;
                                z10 = z11;
                                if (i37 <= i29) {
                                }
                                i30 = iMax22;
                                i36 = i19;
                                i34++;
                                i35 = i25;
                                obj2 = obj;
                                iB = i15;
                                mode = i17;
                                zB1 = z7;
                                i38 = i30;
                                size = i18;
                            } else {
                                i18 = i22;
                                cVar2 = new c();
                                cVar2.f1893d = 1;
                                cVar2.f1890a = i35;
                                cVar2.f1900k = i34;
                                i23 = Integer.MIN_VALUE;
                                boolean z12222 = cVar2.f1902m;
                                float f11222 = fVar2.f1917m;
                                cVar2.f1902m = z12222 | (f11222 == 0.0f);
                                boolean z13222 = cVar2.f1903n;
                                float f12222 = fVar2.f1918n;
                                cVar2.f1903n = z13222 | (f12222 == 0.0f);
                                iArr = this.f1906c;
                                if (iArr != null) {
                                }
                                int i48222 = cVar2.f1890a;
                                if (!z7) {
                                }
                                if (z7) {
                                }
                                cVar2.f1890a = (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).rightMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).bottomMargin) + i26 + measuredWidth2 + i48222;
                                cVar2.f1895f += f11222;
                                cVar2.f1896g += f12222;
                                flexboxLayoutManager.d(FlexboxLayoutManager.O, viewX0);
                                if (flexboxLayoutManager.b1()) {
                                }
                                int i49222 = i27 + i28;
                                cVar2.f1890a += i49222;
                                cVar2.f1891b += i49222;
                                if (!z7) {
                                }
                                if (!z7) {
                                }
                                int iMax222 = Math.max(i23, flexboxLayoutManager.W0(viewX0) + (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).bottomMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).rightMargin) + (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).topMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).leftMargin) + (!z7 ? viewX0.getMeasuredHeight() : viewX0.getMeasuredWidth()));
                                cVar2.f1892c = Math.max(cVar2.f1892c, iMax222);
                                if (z7) {
                                }
                                if (i34 == i15 - 1) {
                                }
                                if (i14 == -1) {
                                }
                                i29 = i12;
                                z10 = z11;
                                if (i37 <= i29) {
                                }
                                i30 = iMax222;
                                i36 = i19;
                                i34++;
                                i35 = i25;
                                obj2 = obj;
                                iB = i15;
                                mode = i17;
                                zB1 = z7;
                                i38 = i30;
                                size = i18;
                            }
                        }
                        i19 = iCombineMeasuredStates;
                        arrayList = list2;
                        cVar2.f1893d++;
                        i23 = i38;
                        boolean z122222 = cVar2.f1902m;
                        float f112222 = fVar2.f1917m;
                        cVar2.f1902m = z122222 | (f112222 == 0.0f);
                        boolean z132222 = cVar2.f1903n;
                        float f122222 = fVar2.f1918n;
                        cVar2.f1903n = z132222 | (f122222 == 0.0f);
                        iArr = this.f1906c;
                        if (iArr != null) {
                        }
                        int i482222 = cVar2.f1890a;
                        if (!z7) {
                        }
                        if (z7) {
                        }
                        cVar2.f1890a = (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).rightMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).bottomMargin) + i26 + measuredWidth2 + i482222;
                        cVar2.f1895f += f112222;
                        cVar2.f1896g += f122222;
                        flexboxLayoutManager.d(FlexboxLayoutManager.O, viewX0);
                        if (flexboxLayoutManager.b1()) {
                        }
                        int i492222 = i27 + i28;
                        cVar2.f1890a += i492222;
                        cVar2.f1891b += i492222;
                        if (!z7) {
                        }
                        if (!z7) {
                        }
                        int iMax2222 = Math.max(i23, flexboxLayoutManager.W0(viewX0) + (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).bottomMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).rightMargin) + (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).topMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).leftMargin) + (!z7 ? viewX0.getMeasuredHeight() : viewX0.getMeasuredWidth()));
                        cVar2.f1892c = Math.max(cVar2.f1892c, iMax2222);
                        if (z7) {
                        }
                        if (i34 == i15 - 1) {
                        }
                        if (i14 == -1) {
                        }
                        i29 = i12;
                        z10 = z11;
                        if (i37 <= i29) {
                        }
                        i30 = iMax2222;
                        i36 = i19;
                        i34++;
                        i35 = i25;
                        obj2 = obj;
                        iB = i15;
                        mode = i17;
                        zB1 = z7;
                        i38 = i30;
                        size = i18;
                    } else {
                        i16 = i43;
                    }
                    iRound = i16;
                    if (zB1) {
                    }
                    flexboxLayoutManager.k1(viewX0, i34);
                    c(viewX0, i34);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i36, viewX0.getMeasuredState());
                    cVar2 = cVar;
                    int i442 = cVar2.f1890a;
                    if (!z7) {
                    }
                    int measuredWidth3 = (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).rightMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).bottomMargin) + (!z7 ? ((ViewGroup.MarginLayoutParams) fVar2).leftMargin : ((ViewGroup.MarginLayoutParams) fVar2).topMargin) + (!z7 ? viewX0.getMeasuredWidth() : viewX0.getMeasuredHeight());
                    int size22 = list2.size();
                    if (flexboxLayoutManager.f2427q != 0) {
                    }
                    i19 = iCombineMeasuredStates2;
                    arrayList = list2;
                    cVar2.f1893d++;
                    i23 = i38;
                    boolean z1222222 = cVar2.f1902m;
                    float f1122222 = fVar2.f1917m;
                    cVar2.f1902m = z1222222 | (f1122222 == 0.0f);
                    boolean z1322222 = cVar2.f1903n;
                    float f1222222 = fVar2.f1918n;
                    cVar2.f1903n = z1322222 | (f1222222 == 0.0f);
                    iArr = this.f1906c;
                    if (iArr != null) {
                    }
                    int i4822222 = cVar2.f1890a;
                    if (!z7) {
                    }
                    if (z7) {
                    }
                    cVar2.f1890a = (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).rightMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).bottomMargin) + i26 + measuredWidth2 + i4822222;
                    cVar2.f1895f += f1122222;
                    cVar2.f1896g += f1222222;
                    flexboxLayoutManager.d(FlexboxLayoutManager.O, viewX0);
                    if (flexboxLayoutManager.b1()) {
                    }
                    int i4922222 = i27 + i28;
                    cVar2.f1890a += i4922222;
                    cVar2.f1891b += i4922222;
                    if (!z7) {
                    }
                    if (!z7) {
                    }
                    int iMax22222 = Math.max(i23, flexboxLayoutManager.W0(viewX0) + (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).bottomMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).rightMargin) + (!z7 ? ((ViewGroup.MarginLayoutParams) ((f) bVar)).topMargin : ((ViewGroup.MarginLayoutParams) ((f) bVar)).leftMargin) + (!z7 ? viewX0.getMeasuredHeight() : viewX0.getMeasuredWidth()));
                    cVar2.f1892c = Math.max(cVar2.f1892c, iMax22222);
                    if (z7) {
                    }
                    if (i34 == i15 - 1) {
                    }
                    if (i14 == -1) {
                    }
                    i29 = i12;
                    z10 = z11;
                    if (i37 <= i29) {
                    }
                    i30 = iMax22222;
                    i36 = i19;
                    i34++;
                    i35 = i25;
                    obj2 = obj;
                    iB = i15;
                    mode = i17;
                    zB1 = z7;
                    i38 = i30;
                    size = i18;
                }
            }
            z10 = z11;
            z7 = zB1;
            i17 = mode;
            i18 = size;
            i15 = iB;
            i30 = i38;
            i25 = i35;
            i34++;
            i35 = i25;
            obj2 = obj;
            iB = i15;
            mode = i17;
            zB1 = z7;
            i38 = i30;
            size = i18;
        }
        yl0Var2.f10132e = i36;
    }

    public final void c(View view, int i10) {
        boolean z7;
        b bVar = (b) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        f fVar = (f) bVar;
        int i11 = fVar.f1921w;
        boolean z10 = true;
        if (measuredWidth >= i11 && measuredWidth <= (i11 = fVar.N)) {
            z7 = false;
        } else {
            measuredWidth = i11;
            z7 = true;
        }
        int i12 = fVar.M;
        if (measuredHeight < i12) {
            measuredHeight = i12;
        } else {
            int i13 = fVar.O;
            if (measuredHeight > i13) {
                measuredHeight = i13;
            } else {
                z10 = z7;
            }
        }
        if (z10) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            r(view, i10, iMakeMeasureSpec, iMakeMeasureSpec2);
            ((FlexboxLayoutManager) this.f1904a).k1(view, i10);
        }
    }

    public final void d(int i10, List list) {
        int i11 = this.f1906c[i10];
        if (i11 == -1) {
            i11 = 0;
        }
        if (list.size() > i11) {
            list.subList(i11, list.size()).clear();
        }
        int[] iArr = this.f1906c;
        int length = iArr.length - 1;
        if (i10 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i10, length, -1);
        }
        long[] jArr = this.f1907d;
        int length2 = jArr.length - 1;
        if (i10 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i10, length2, 0L);
        }
    }

    public final void e(int i10, int i11, int i12) {
        int size;
        int iJ;
        int iK;
        Object obj = this.f1904a;
        int iB = ((FlexboxLayoutManager) obj).f2436z.b();
        boolean[] zArr = this.f1905b;
        if (zArr == null) {
            this.f1905b = new boolean[Math.max(iB, 10)];
        } else if (zArr.length < iB) {
            this.f1905b = new boolean[Math.max(zArr.length * 2, iB)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i12 >= ((FlexboxLayoutManager) obj).f2436z.b()) {
            return;
        }
        int i13 = ((FlexboxLayoutManager) obj).f2426p;
        int i14 = ((FlexboxLayoutManager) obj).f2426p;
        if (i14 == 0 || i14 == 1) {
            int mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int iY0 = ((FlexboxLayoutManager) obj).Y0();
            if (mode != 1073741824) {
                size = Math.min(iY0, size);
            }
            iJ = ((l1) obj).J();
            iK = ((l1) obj).K();
        } else {
            if (i14 != 2 && i14 != 3) {
                throw new IllegalArgumentException(r.d("Invalid flex direction: ", i13));
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                size = ((FlexboxLayoutManager) obj).Y0();
            }
            iJ = ((l1) obj).L();
            iK = ((l1) obj).I();
        }
        int i15 = iK + iJ;
        int[] iArr = this.f1906c;
        List list = ((FlexboxLayoutManager) obj).f2433w;
        int size2 = list.size();
        for (int i16 = iArr != null ? iArr[i12] : 0; i16 < size2; i16++) {
            c cVar = (c) list.get(i16);
            int i17 = cVar.f1890a;
            if (i17 < size && cVar.f1902m) {
                i(i10, i11, cVar, size, i15, false);
            } else if (i17 > size && cVar.f1903n) {
                n(i10, i11, cVar, size, i15, false);
            }
        }
    }

    public final void f(int i10) {
        int[] iArr = this.f1906c;
        if (iArr == null) {
            this.f1906c = new int[Math.max(i10, 10)];
        } else if (iArr.length < i10) {
            this.f1906c = Arrays.copyOf(this.f1906c, Math.max(iArr.length * 2, i10));
        }
    }

    public final void g(int i10) {
        long[] jArr = this.f1907d;
        if (jArr == null) {
            this.f1907d = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.f1907d = Arrays.copyOf(this.f1907d, Math.max(jArr.length * 2, i10));
        }
    }

    public final void h(int i10) {
        long[] jArr = this.f1908e;
        if (jArr == null) {
            this.f1908e = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.f1908e = Arrays.copyOf(this.f1908e, Math.max(jArr.length * 2, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i10, int i11, c cVar, int i12, int i13, boolean z7) {
        int i14;
        int i15;
        float f10;
        int iMax;
        double d10;
        double d11;
        float f11 = cVar.f1895f;
        if (f11 <= 0.0f || i12 < (i14 = cVar.f1890a)) {
            return;
        }
        float f12 = (i12 - i14) / f11;
        cVar.f1890a = i13 + cVar.f1891b;
        if (!z7) {
            cVar.f1892c = Integer.MIN_VALUE;
        }
        int i16 = 0;
        boolean z10 = false;
        int i17 = 0;
        float f13 = 0.0f;
        while (i16 < cVar.f1893d) {
            int i18 = cVar.f1900k + i16;
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f1904a;
            View viewX0 = flexboxLayoutManager.X0(i18);
            if (viewX0 == null || viewX0.getVisibility() == 8) {
                i15 = i14;
                f10 = f12;
            } else {
                b bVar = (b) viewX0.getLayoutParams();
                int i19 = flexboxLayoutManager.f2426p;
                if (i19 == 0 || i19 == 1) {
                    i15 = i14;
                    f10 = f12;
                    int measuredWidth = viewX0.getMeasuredWidth();
                    long[] jArr = this.f1908e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i18];
                    }
                    int measuredHeight = viewX0.getMeasuredHeight();
                    long[] jArr2 = this.f1908e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i18] >> 32);
                    }
                    if (!this.f1905b[i18]) {
                        f fVar = (f) bVar;
                        float f14 = fVar.f1917m;
                        if (f14 > 0.0f) {
                            float f15 = (f10 * f14) + measuredWidth;
                            if (i16 == cVar.f1893d - 1) {
                                f15 += f13;
                                f13 = 0.0f;
                            }
                            int iRound = Math.round(f15);
                            int i20 = fVar.N;
                            if (iRound > i20) {
                                this.f1905b[i18] = true;
                                cVar.f1895f -= f14;
                                iRound = i20;
                                z10 = true;
                            } else {
                                float f16 = (f15 - iRound) + f13;
                                double d12 = f16;
                                if (d12 > 1.0d) {
                                    iRound++;
                                    d10 = d12 - 1.0d;
                                } else {
                                    if (d12 < -1.0d) {
                                        iRound--;
                                        d10 = d12 + 1.0d;
                                    }
                                    f13 = f16;
                                }
                                f16 = (float) d10;
                                f13 = f16;
                            }
                            int iJ = j(i11, bVar, cVar.f1898i);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                            viewX0.measure(iMakeMeasureSpec, iJ);
                            int measuredWidth2 = viewX0.getMeasuredWidth();
                            int measuredHeight2 = viewX0.getMeasuredHeight();
                            r(viewX0, i18, iMakeMeasureSpec, iJ);
                            flexboxLayoutManager.k1(viewX0, i18);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                    }
                    f fVar2 = (f) bVar;
                    int iMax2 = Math.max(i17, flexboxLayoutManager.W0(viewX0) + measuredHeight + ((ViewGroup.MarginLayoutParams) fVar2).topMargin + ((ViewGroup.MarginLayoutParams) fVar2).bottomMargin);
                    cVar.f1890a = measuredWidth + ((ViewGroup.MarginLayoutParams) fVar2).leftMargin + ((ViewGroup.MarginLayoutParams) fVar2).rightMargin + cVar.f1890a;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewX0.getMeasuredHeight();
                    long[] jArr3 = this.f1908e;
                    if (jArr3 != null) {
                        i15 = i14;
                        measuredHeight3 = (int) (jArr3[i18] >> 32);
                    } else {
                        i15 = i14;
                    }
                    int measuredWidth3 = viewX0.getMeasuredWidth();
                    long[] jArr4 = this.f1908e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i18];
                    }
                    if (!this.f1905b[i18]) {
                        f fVar3 = (f) bVar;
                        float f17 = fVar3.f1917m;
                        if (f17 > 0.0f) {
                            float f18 = (f12 * f17) + measuredHeight3;
                            if (i16 == cVar.f1893d - 1) {
                                f18 += f13;
                                f13 = 0.0f;
                            }
                            int iRound2 = Math.round(f18);
                            int i21 = fVar3.O;
                            if (iRound2 > i21) {
                                this.f1905b[i18] = true;
                                cVar.f1895f -= f17;
                                iRound2 = i21;
                                f10 = f12;
                                z10 = true;
                            } else {
                                float f19 = (f18 - iRound2) + f13;
                                f10 = f12;
                                double d13 = f19;
                                if (d13 > 1.0d) {
                                    iRound2++;
                                    d11 = d13 - 1.0d;
                                } else if (d13 < -1.0d) {
                                    iRound2--;
                                    d11 = d13 + 1.0d;
                                } else {
                                    f13 = f19;
                                }
                                f13 = (float) d11;
                            }
                            int iK = k(i10, bVar, cVar.f1898i);
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                            viewX0.measure(iK, iMakeMeasureSpec2);
                            int measuredWidth4 = viewX0.getMeasuredWidth();
                            int measuredHeight4 = viewX0.getMeasuredHeight();
                            r(viewX0, i18, iK, iMakeMeasureSpec2);
                            flexboxLayoutManager.k1(viewX0, i18);
                            measuredWidth3 = measuredWidth4;
                            measuredHeight3 = measuredHeight4;
                        } else {
                            f10 = f12;
                        }
                        f fVar4 = (f) bVar;
                        iMax = Math.max(i17, flexboxLayoutManager.W0(viewX0) + measuredWidth3 + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin + ((ViewGroup.MarginLayoutParams) fVar4).rightMargin);
                        cVar.f1890a = measuredHeight3 + ((ViewGroup.MarginLayoutParams) fVar4).topMargin + ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin + cVar.f1890a;
                    }
                }
                cVar.f1892c = Math.max(cVar.f1892c, iMax);
                i17 = iMax;
            }
            i16++;
            f12 = f10;
            i14 = i15;
        }
        int i22 = i14;
        if (!z10 || i22 == cVar.f1890a) {
            return;
        }
        i(i10, i11, cVar, i12, i13, true);
    }

    public final int j(int i10, b bVar, int i11) {
        Object obj = this.f1904a;
        l1 l1Var = (l1) obj;
        f fVar = (f) bVar;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) obj;
        int iX = l1.x(flexboxLayoutManager.f1551o, flexboxLayoutManager.f1549m, l1Var.I() + l1Var.L() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) fVar).height, flexboxLayoutManager.f());
        int size = View.MeasureSpec.getSize(iX);
        int i12 = fVar.O;
        if (size > i12) {
            return View.MeasureSpec.makeMeasureSpec(i12, View.MeasureSpec.getMode(iX));
        }
        int i13 = fVar.M;
        return size < i13 ? View.MeasureSpec.makeMeasureSpec(i13, View.MeasureSpec.getMode(iX)) : iX;
    }

    public final int k(int i10, b bVar, int i11) {
        Object obj = this.f1904a;
        l1 l1Var = (l1) obj;
        f fVar = (f) bVar;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) obj;
        int iX = l1.x(flexboxLayoutManager.f1550n, flexboxLayoutManager.f1548l, l1Var.K() + l1Var.J() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin + i11, ((ViewGroup.MarginLayoutParams) fVar).width, flexboxLayoutManager.e());
        int size = View.MeasureSpec.getSize(iX);
        int i12 = fVar.N;
        if (size > i12) {
            return View.MeasureSpec.makeMeasureSpec(i12, View.MeasureSpec.getMode(iX));
        }
        int i13 = fVar.f1921w;
        return size < i13 ? View.MeasureSpec.makeMeasureSpec(i13, View.MeasureSpec.getMode(iX)) : iX;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(View view, c cVar, int i10, int i11, int i12, int i13) {
        int iMax;
        int iMax2;
        int i14;
        int i15;
        int measuredHeight;
        int measuredHeight2;
        b bVar = (b) view.getLayoutParams();
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f1904a;
        int i16 = flexboxLayoutManager.f2429s;
        f fVar = (f) bVar;
        int i17 = fVar.f1919t;
        if (i17 != -1) {
            i16 = i17;
        }
        int i18 = cVar.f1892c;
        if (i16 == 0) {
            if (flexboxLayoutManager.f2427q == 2) {
                iMax2 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                i14 = i11 + iMax2;
                i15 = i13 + iMax2;
            } else {
                iMax = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                i14 = i11 - iMax;
                i15 = i13 - iMax;
            }
        } else {
            if (i16 == 1) {
                if (flexboxLayoutManager.f2427q != 2) {
                    int i19 = i11 + i18;
                    int measuredHeight3 = i19 - view.getMeasuredHeight();
                    int i20 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                    measuredHeight = measuredHeight3 - i20;
                    measuredHeight2 = i19 - i20;
                } else {
                    measuredHeight = view.getMeasuredHeight() + (i11 - i18) + ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                    measuredHeight2 = view.getMeasuredHeight() + (i13 - i18) + ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                }
                view.layout(i10, measuredHeight, i12, measuredHeight2);
                return;
            }
            if (i16 == 2) {
                int measuredHeight4 = (((i18 - view.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) / 2;
                int i21 = flexboxLayoutManager.f2427q != 2 ? i11 + measuredHeight4 : i11 - measuredHeight4;
                view.layout(i10, i21, i12, view.getMeasuredHeight() + i21);
                return;
            } else if (i16 != 3) {
                if (i16 != 4) {
                    return;
                }
                if (flexboxLayoutManager.f2427q == 2) {
                }
            } else {
                int i22 = flexboxLayoutManager.f2427q;
                int i23 = cVar.f1897h;
                if (i22 != 2) {
                    iMax2 = Math.max(i23 - view.getBaseline(), ((ViewGroup.MarginLayoutParams) fVar).topMargin);
                    i14 = i11 + iMax2;
                    i15 = i13 + iMax2;
                } else {
                    iMax = Math.max(view.getBaseline() + (i23 - view.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    i14 = i11 - iMax;
                    i15 = i13 - iMax;
                }
            }
        }
        view.layout(i10, i14, i12, i15);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(View view, c cVar, boolean z7, int i10, int i11, int i12, int i13) {
        int i14;
        int measuredWidth;
        int i15;
        b bVar = (b) view.getLayoutParams();
        int i16 = ((FlexboxLayoutManager) this.f1904a).f2429s;
        f fVar = (f) bVar;
        int i17 = fVar.f1919t;
        if (i17 != -1) {
            i16 = i17;
        }
        int i18 = cVar.f1892c;
        if (i16 == 0) {
            if (z7) {
                int i19 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                measuredWidth = i10 + i19;
                i15 = i12 + i19;
            } else {
                i14 = ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
                measuredWidth = i10 - i14;
                i15 = i12 - i14;
            }
        } else if (i16 != 1) {
            if (i16 != 2) {
                if (i16 != 3 && i16 != 4) {
                    return;
                }
                if (z7) {
                }
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i18 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z7) {
                    measuredWidth = i10 - marginStart;
                    i15 = i12 - marginStart;
                } else {
                    measuredWidth = i10 + marginStart;
                    i15 = i12 + marginStart;
                }
            }
        } else if (z7) {
            view.layout(view.getMeasuredWidth() + (i10 - i18) + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, i11, view.getMeasuredWidth() + (i12 - i18) + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, i13);
            return;
        } else {
            measuredWidth = ((i10 + i18) - view.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
            i12 = (i12 + i18) - view.getMeasuredWidth();
            i14 = ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
            i15 = i12 - i14;
        }
        view.layout(measuredWidth, i11, i15, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i10, int i11, c cVar, int i12, int i13, boolean z7) {
        int i14;
        int i15;
        int iMax;
        int i16;
        float f10;
        int i17;
        float f11;
        int i18 = cVar.f1890a;
        float f12 = cVar.f1896g;
        if (f12 <= 0.0f || i12 > i18) {
            return;
        }
        float f13 = (i18 - i12) / f12;
        cVar.f1890a = i13 + cVar.f1891b;
        if (!z7) {
            cVar.f1892c = Integer.MIN_VALUE;
        }
        int i19 = 0;
        boolean z10 = false;
        int i20 = 0;
        float f14 = 0.0f;
        while (i19 < cVar.f1893d) {
            int i21 = cVar.f1900k + i19;
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f1904a;
            View viewX0 = flexboxLayoutManager.X0(i21);
            if (viewX0 == null || viewX0.getVisibility() == 8) {
                i14 = i18;
                i15 = i19;
                iMax = i20;
                f14 = f14;
            } else {
                b bVar = (b) viewX0.getLayoutParams();
                int i22 = flexboxLayoutManager.f2426p;
                if (i22 == 0 || i22 == 1) {
                    i15 = i19;
                    int i23 = i20;
                    float f15 = f14;
                    int i24 = i18;
                    int measuredWidth = viewX0.getMeasuredWidth();
                    long[] jArr = this.f1908e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i21];
                    }
                    int measuredHeight = viewX0.getMeasuredHeight();
                    long[] jArr2 = this.f1908e;
                    if (jArr2 != null) {
                        i14 = i24;
                        measuredHeight = (int) (jArr2[i21] >> 32);
                    } else {
                        i14 = i24;
                    }
                    if (!this.f1905b[i21]) {
                        f fVar = (f) bVar;
                        float f16 = fVar.f1918n;
                        if (f16 > 0.0f) {
                            float f17 = measuredWidth - (f13 * f16);
                            if (i15 == cVar.f1893d - 1) {
                                f17 += f15;
                                f15 = 0.0f;
                            }
                            int iRound = Math.round(f17);
                            int i25 = fVar.f1921w;
                            if (iRound < i25) {
                                this.f1905b[i21] = true;
                                cVar.f1896g -= f16;
                                iRound = i25;
                                f14 = f15;
                                z10 = true;
                            } else {
                                float f18 = (f17 - iRound) + f15;
                                double d10 = f18;
                                if (d10 > 1.0d) {
                                    iRound++;
                                    f18 -= 1.0f;
                                } else if (d10 < -1.0d) {
                                    iRound--;
                                    f18 += 1.0f;
                                }
                                f14 = f18;
                            }
                            int iJ = j(i11, bVar, cVar.f1898i);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                            viewX0.measure(iMakeMeasureSpec, iJ);
                            int measuredWidth2 = viewX0.getMeasuredWidth();
                            int measuredHeight2 = viewX0.getMeasuredHeight();
                            r(viewX0, i21, iMakeMeasureSpec, iJ);
                            flexboxLayoutManager.k1(viewX0, i21);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                            f fVar2 = (f) bVar;
                            int iMax2 = Math.max(i23, flexboxLayoutManager.W0(viewX0) + measuredHeight + ((ViewGroup.MarginLayoutParams) fVar2).topMargin + ((ViewGroup.MarginLayoutParams) fVar2).bottomMargin);
                            cVar.f1890a = measuredWidth + ((ViewGroup.MarginLayoutParams) fVar2).leftMargin + ((ViewGroup.MarginLayoutParams) fVar2).rightMargin + cVar.f1890a;
                            iMax = iMax2;
                        }
                    }
                    f14 = f15;
                    f fVar22 = (f) bVar;
                    int iMax22 = Math.max(i23, flexboxLayoutManager.W0(viewX0) + measuredHeight + ((ViewGroup.MarginLayoutParams) fVar22).topMargin + ((ViewGroup.MarginLayoutParams) fVar22).bottomMargin);
                    cVar.f1890a = measuredWidth + ((ViewGroup.MarginLayoutParams) fVar22).leftMargin + ((ViewGroup.MarginLayoutParams) fVar22).rightMargin + cVar.f1890a;
                    iMax = iMax22;
                } else {
                    int measuredHeight3 = viewX0.getMeasuredHeight();
                    long[] jArr3 = this.f1908e;
                    if (jArr3 != null) {
                        long j10 = jArr3[i21];
                        i16 = i20;
                        f10 = f14;
                        measuredHeight3 = (int) (j10 >> 32);
                    } else {
                        i16 = i20;
                        f10 = f14;
                    }
                    int measuredWidth3 = viewX0.getMeasuredWidth();
                    long[] jArr4 = this.f1908e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i21];
                    }
                    if (!this.f1905b[i21]) {
                        f fVar3 = (f) bVar;
                        float f19 = fVar3.f1918n;
                        if (f19 > 0.0f) {
                            float f20 = measuredHeight3 - (f13 * f19);
                            if (i19 == cVar.f1893d - 1) {
                                f20 += f10;
                                f10 = 0.0f;
                            }
                            int iRound2 = Math.round(f20);
                            int i26 = fVar3.M;
                            if (iRound2 < i26) {
                                this.f1905b[i21] = true;
                                cVar.f1896g -= f19;
                                i15 = i19;
                                iRound2 = i26;
                                f11 = f10;
                                z10 = true;
                                i17 = i18;
                            } else {
                                f11 = (f20 - iRound2) + f10;
                                i17 = i18;
                                i15 = i19;
                                double d11 = f11;
                                if (d11 > 1.0d) {
                                    iRound2++;
                                    f11 -= 1.0f;
                                } else if (d11 < -1.0d) {
                                    iRound2--;
                                    f11 += 1.0f;
                                }
                            }
                            int iK = k(i10, bVar, cVar.f1898i);
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                            viewX0.measure(iK, iMakeMeasureSpec2);
                            int measuredWidth4 = viewX0.getMeasuredWidth();
                            int measuredHeight4 = viewX0.getMeasuredHeight();
                            r(viewX0, i21, iK, iMakeMeasureSpec2);
                            flexboxLayoutManager.k1(viewX0, i21);
                            f10 = f11;
                            measuredWidth3 = measuredWidth4;
                            measuredHeight3 = measuredHeight4;
                        } else {
                            i17 = i18;
                            i15 = i19;
                        }
                        f fVar4 = (f) bVar;
                        iMax = Math.max(i16, flexboxLayoutManager.W0(viewX0) + measuredWidth3 + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin + ((ViewGroup.MarginLayoutParams) fVar4).rightMargin);
                        cVar.f1890a = measuredHeight3 + ((ViewGroup.MarginLayoutParams) fVar4).topMargin + ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin + cVar.f1890a;
                        i14 = i17;
                        f14 = f10;
                    }
                }
                cVar.f1892c = Math.max(cVar.f1892c, iMax);
            }
            i19 = i15 + 1;
            i20 = iMax;
            i18 = i14;
        }
        int i27 = i18;
        if (!z10 || i27 == cVar.f1890a) {
            return;
        }
        n(i10, i11, cVar, i12, i13, true);
    }

    public final void o(View view, int i10, int i11) {
        b bVar = (b) view.getLayoutParams();
        int i12 = i10 - ((ViewGroup.MarginLayoutParams) ((f) bVar)).leftMargin;
        f fVar = (f) bVar;
        int i13 = i12 - ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
        a aVar = this.f1904a;
        int iMin = Math.min(Math.max(i13 - ((FlexboxLayoutManager) aVar).W0(view), fVar.f1921w), fVar.N);
        long[] jArr = this.f1908e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i11] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        r(view, i11, iMakeMeasureSpec2, iMakeMeasureSpec);
        ((FlexboxLayoutManager) aVar).k1(view, i11);
    }

    public final void p(View view, int i10, int i11) {
        b bVar = (b) view.getLayoutParams();
        int i12 = i10 - ((ViewGroup.MarginLayoutParams) ((f) bVar)).topMargin;
        f fVar = (f) bVar;
        int i13 = i12 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
        a aVar = this.f1904a;
        int iMin = Math.min(Math.max(i13 - ((FlexboxLayoutManager) aVar).W0(view), fVar.M), fVar.O);
        long[] jArr = this.f1908e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i11] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        r(view, i11, iMakeMeasureSpec, iMakeMeasureSpec2);
        ((FlexboxLayoutManager) aVar).k1(view, i11);
    }

    public final void q(int i10) {
        View viewX0;
        int i11;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f1904a;
        if (i10 >= flexboxLayoutManager.f2436z.b()) {
            return;
        }
        int i12 = flexboxLayoutManager.f2426p;
        if (flexboxLayoutManager.f2429s != 4) {
            for (c cVar : flexboxLayoutManager.f2433w) {
                Iterator it = cVar.f1899j.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    View viewX02 = flexboxLayoutManager.X0(num.intValue());
                    if (i12 == 0 || i12 == 1) {
                        p(viewX02, cVar.f1892c, num.intValue());
                    } else {
                        if (i12 != 2 && i12 != 3) {
                            throw new IllegalArgumentException(r.d("Invalid flex direction: ", i12));
                        }
                        o(viewX02, cVar.f1892c, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f1906c;
        List list = flexboxLayoutManager.f2433w;
        int size = list.size();
        for (int i13 = iArr != null ? iArr[i10] : 0; i13 < size; i13++) {
            c cVar2 = (c) list.get(i13);
            int i14 = cVar2.f1893d;
            for (int i15 = 0; i15 < i14; i15++) {
                int i16 = cVar2.f1900k + i15;
                if (i15 < flexboxLayoutManager.f2436z.b() && (viewX0 = flexboxLayoutManager.X0(i16)) != null && viewX0.getVisibility() != 8 && ((i11 = ((f) ((b) viewX0.getLayoutParams())).f1919t) == -1 || i11 == 4)) {
                    if (i12 == 0 || i12 == 1) {
                        p(viewX0, cVar2.f1892c, i16);
                    } else {
                        if (i12 != 2 && i12 != 3) {
                            throw new IllegalArgumentException(r.d("Invalid flex direction: ", i12));
                        }
                        o(viewX0, cVar2.f1892c, i16);
                    }
                }
            }
        }
    }

    public final void r(View view, int i10, int i11, int i12) {
        long[] jArr = this.f1907d;
        if (jArr != null) {
            jArr[i10] = (i11 & 4294967295L) | (i12 << 32);
        }
        long[] jArr2 = this.f1908e;
        if (jArr2 != null) {
            jArr2[i10] = (view.getMeasuredWidth() & 4294967295L) | (view.getMeasuredHeight() << 32);
        }
    }
}