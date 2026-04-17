package com.onesignal;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o extends RelativeLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final int f12024m = o3.b(28);

    /* renamed from: n, reason: collision with root package name */
    public static final int f12025n = o3.b(64);

    /* renamed from: b, reason: collision with root package name */
    public f0 f12026b;

    /* renamed from: e, reason: collision with root package name */
    public x0.e f12027e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12028f;

    /* renamed from: j, reason: collision with root package name */
    public n f12029j;

    public final void a(n nVar) {
        int i10;
        this.f12029j = nVar;
        nVar.f12003i = ((Resources.getSystem().getDisplayMetrics().heightPixels - nVar.f11999e) - nVar.f11995a) + nVar.f11999e + nVar.f11995a + f12025n;
        int iB = o3.b(3000);
        nVar.f12002h = iB;
        if (nVar.f12000f == 0) {
            int i11 = (-nVar.f11999e) - f12024m;
            nVar.f12003i = i11;
            nVar.f12002h = -iB;
            i10 = i11 / 3;
        } else {
            i10 = (nVar.f11996b * 2) + (nVar.f11999e / 3);
        }
        nVar.f12004j = i10;
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.f12027e.f()) {
            WeakHashMap weakHashMap = o0.c1.f15515a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f0 f0Var;
        if (this.f12028f) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 0 || action == 5) && (f0Var = this.f12026b) != null) {
            ((i0) f0Var.f11790b).f11875m = false;
        }
        this.f12027e.j(motionEvent);
        return false;
    }
}