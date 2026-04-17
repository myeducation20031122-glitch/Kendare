package m;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j3 implements l.a0 {

    /* renamed from: b, reason: collision with root package name */
    public l.o f14804b;

    /* renamed from: e, reason: collision with root package name */
    public l.q f14805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Toolbar f14806f;

    public j3(Toolbar toolbar) {
        this.f14806f = toolbar;
    }

    @Override // l.a0
    public final void b(Parcelable parcelable) {
    }

    @Override // l.a0
    public final void d(l.o oVar, boolean z7) {
    }

    @Override // l.a0
    public final boolean g(l.q qVar) {
        Toolbar toolbar = this.f14806f;
        toolbar.c();
        ViewParent parent = toolbar.f749u.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f749u);
            }
            toolbar.addView(toolbar.f749u);
        }
        View actionView = qVar.getActionView();
        toolbar.f752w = actionView;
        this.f14805e = qVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f752w);
            }
            k3 k3VarH = Toolbar.h();
            k3VarH.f12722a = (toolbar.Q & 112) | 8388611;
            k3VarH.f14811b = 2;
            toolbar.f752w.setLayoutParams(k3VarH);
            toolbar.addView(toolbar.f752w);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((k3) childAt.getLayoutParams()).f14811b != 2 && childAt != toolbar.f723b) {
                toolbar.removeViewAt(childCount);
                toolbar.f736k0.add(childAt);
            }
        }
        toolbar.requestLayout();
        qVar.C = true;
        qVar.f14397n.p(false);
        KeyEvent.Callback callback = toolbar.f752w;
        if (callback instanceof k.c) {
            ((l.s) ((k.c) callback)).f14413b.onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // l.a0
    public final void h(boolean z7) {
        if (this.f14805e != null) {
            l.o oVar = this.f14804b;
            if (oVar != null) {
                int size = oVar.f14362f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f14804b.getItem(i10) == this.f14805e) {
                        return;
                    }
                }
            }
            n(this.f14805e);
        }
    }

    @Override // l.a0
    public final void i(Context context, l.o oVar) {
        l.q qVar;
        l.o oVar2 = this.f14804b;
        if (oVar2 != null && (qVar = this.f14805e) != null) {
            oVar2.d(qVar);
        }
        this.f14804b = oVar;
    }

    @Override // l.a0
    public final int j() {
        return 0;
    }

    @Override // l.a0
    public final boolean k() {
        return false;
    }

    @Override // l.a0
    public final Parcelable l() {
        return null;
    }

    @Override // l.a0
    public final boolean m(l.g0 g0Var) {
        return false;
    }

    @Override // l.a0
    public final boolean n(l.q qVar) {
        Toolbar toolbar = this.f14806f;
        KeyEvent.Callback callback = toolbar.f752w;
        if (callback instanceof k.c) {
            ((l.s) ((k.c) callback)).f14413b.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f752w);
        toolbar.removeView(toolbar.f749u);
        toolbar.f752w = null;
        ArrayList arrayList = toolbar.f736k0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f14805e = null;
        toolbar.requestLayout();
        qVar.C = false;
        qVar.f14397n.p(false);
        toolbar.w();
        return true;
    }
}