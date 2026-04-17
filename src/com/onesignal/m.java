package com.onesignal;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends com.bumptech.glide.e {

    /* renamed from: a, reason: collision with root package name */
    public int f11961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f11962b;

    public m(o oVar) {
        this.f11962b = oVar;
    }

    @Override // com.bumptech.glide.e
    public final void E(View view, float f10, float f11) {
        f0 f0Var;
        o oVar = this.f11962b;
        n nVar = oVar.f12029j;
        int i10 = nVar.f11996b;
        if (!oVar.f12028f) {
            if (nVar.f12000f == 1) {
                if (this.f11961a > nVar.f12004j || f11 > nVar.f12002h) {
                    i10 = nVar.f12003i;
                    oVar.f12028f = true;
                    f0Var = oVar.f12026b;
                    if (f0Var != null) {
                        n5 n5Var = ((i0) f0Var.f11790b).f11882t;
                        if (n5Var != null) {
                            s1 s1VarN = z3.n();
                            u1 u1Var = n5Var.f12023a.f12161e;
                            s1VarN.f12116h.getClass();
                            l.k("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
                        }
                        ((i0) f0Var.f11790b).f(null);
                    }
                }
            } else if (this.f11961a < nVar.f12004j || f11 < nVar.f12002h) {
                i10 = nVar.f12003i;
                oVar.f12028f = true;
                f0Var = oVar.f12026b;
                if (f0Var != null) {
                    n5 n5Var2 = ((i0) f0Var.f11790b).f11882t;
                    if (n5Var2 != null) {
                        s1 s1VarN2 = z3.n();
                        u1 u1Var2 = n5Var2.f12023a.f12161e;
                        s1VarN2.f12116h.getClass();
                        l.k("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
                    }
                    ((i0) f0Var.f11790b).f(null);
                }
            }
        }
        if (oVar.f12027e.o(oVar.f12029j.f11998d, i10)) {
            WeakHashMap weakHashMap = o0.c1.f15515a;
            oVar.postInvalidateOnAnimation();
        }
    }

    @Override // com.bumptech.glide.e
    public final boolean Q(View view, int i10) {
        return true;
    }

    @Override // com.bumptech.glide.e
    public final int e(View view, int i10) {
        return this.f11962b.f12029j.f11998d;
    }

    @Override // com.bumptech.glide.e
    public final int f(View view, int i10) {
        f0 f0Var;
        f0 f0Var2;
        o oVar = this.f11962b;
        n nVar = oVar.f12029j;
        if (nVar.f12001g) {
            return nVar.f11996b;
        }
        this.f11961a = i10;
        if (nVar.f12000f == 1) {
            if (i10 >= nVar.f11997c && (f0Var2 = oVar.f12026b) != null) {
                ((i0) f0Var2.f11790b).f11875m = true;
            }
            int i11 = nVar.f11996b;
            if (i10 < i11) {
                return i11;
            }
        } else {
            if (i10 <= nVar.f11997c && (f0Var = oVar.f12026b) != null) {
                ((i0) f0Var.f11790b).f11875m = true;
            }
            int i12 = nVar.f11996b;
            if (i10 > i12) {
                return i12;
            }
        }
        return i10;
    }
}