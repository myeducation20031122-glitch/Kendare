package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.WeakHashMap;
import o0.c1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b0 extends com.bumptech.glide.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12730b;

    public /* synthetic */ b0(Object obj, int i10) {
        this.f12729a = i10;
        this.f12730b = obj;
    }

    @Override // o0.p1
    public final void a() {
        int i10 = this.f12729a;
        Object obj = this.f12730b;
        switch (i10) {
            case 0:
                y yVar = (y) obj;
                yVar.f12933e.Y.setAlpha(1.0f);
                m0 m0Var = yVar.f12933e;
                m0Var.f12853b0.d(null);
                m0Var.f12853b0 = null;
                break;
            case QueueFuseable.SYNC /* 1 */:
                m0 m0Var2 = (m0) obj;
                m0Var2.Y.setAlpha(1.0f);
                m0Var2.f12853b0.d(null);
                m0Var2.f12853b0 = null;
                break;
            default:
                c0 c0Var = (c0) obj;
                c0Var.f12758e.Y.setVisibility(8);
                m0 m0Var3 = c0Var.f12758e;
                PopupWindow popupWindow = m0Var3.Z;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (m0Var3.Y.getParent() instanceof View) {
                    View view = (View) m0Var3.Y.getParent();
                    WeakHashMap weakHashMap = c1.f15515a;
                    o0.o0.c(view);
                }
                m0Var3.Y.e();
                m0Var3.f12853b0.d(null);
                m0Var3.f12853b0 = null;
                ViewGroup viewGroup = m0Var3.f12855d0;
                WeakHashMap weakHashMap2 = c1.f15515a;
                o0.o0.c(viewGroup);
                break;
        }
    }

    @Override // com.bumptech.glide.e, o0.p1
    public final void c() {
        int i10 = this.f12729a;
        Object obj = this.f12730b;
        switch (i10) {
            case 0:
                ((y) obj).f12933e.Y.setVisibility(0);
                break;
            case QueueFuseable.SYNC /* 1 */:
                m0 m0Var = (m0) obj;
                m0Var.Y.setVisibility(0);
                if (m0Var.Y.getParent() instanceof View) {
                    View view = (View) m0Var.Y.getParent();
                    WeakHashMap weakHashMap = c1.f15515a;
                    o0.o0.c(view);
                    break;
                }
                break;
        }
    }
}