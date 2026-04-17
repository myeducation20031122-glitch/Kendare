package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a1 extends k.b implements l.m {

    /* renamed from: f, reason: collision with root package name */
    public final Context f12724f;

    /* renamed from: j, reason: collision with root package name */
    public final l.o f12725j;

    /* renamed from: m, reason: collision with root package name */
    public k.a f12726m;

    /* renamed from: n, reason: collision with root package name */
    public WeakReference f12727n;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b1 f12728t;

    public a1(b1 b1Var, Context context, c0 c0Var) {
        this.f12728t = b1Var;
        this.f12724f = context;
        this.f12726m = c0Var;
        l.o oVar = new l.o(context);
        oVar.f14368l = 1;
        this.f12725j = oVar;
        oVar.f14361e = this;
    }

    @Override // k.b
    public final void a() {
        b1 b1Var = this.f12728t;
        if (b1Var.f12741i != this) {
            return;
        }
        if (b1Var.f12748p) {
            b1Var.f12742j = this;
            b1Var.f12743k = this.f12726m;
        } else {
            this.f12726m.d(this);
        }
        this.f12726m = null;
        b1Var.v(false);
        ActionBarContextView actionBarContextView = b1Var.f12738f;
        if (actionBarContextView.N == null) {
            actionBarContextView.e();
        }
        b1Var.f12735c.setHideOnContentScrollEnabled(b1Var.f12753u);
        b1Var.f12741i = null;
    }

    @Override // k.b
    public final View b() {
        WeakReference weakReference = this.f12727n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.b
    public final l.o c() {
        return this.f12725j;
    }

    @Override // k.b
    public final MenuInflater d() {
        return new k.i(this.f12724f);
    }

    @Override // k.b
    public final CharSequence e() {
        return this.f12728t.f12738f.getSubtitle();
    }

    @Override // l.m
    public final boolean f(l.o oVar, MenuItem menuItem) {
        k.a aVar = this.f12726m;
        if (aVar != null) {
            return aVar.a(this, menuItem);
        }
        return false;
    }

    @Override // k.b
    public final CharSequence g() {
        return this.f12728t.f12738f.getTitle();
    }

    @Override // k.b
    public final void h() {
        if (this.f12728t.f12741i != this) {
            return;
        }
        l.o oVar = this.f12725j;
        oVar.w();
        try {
            this.f12726m.b(this, oVar);
        } finally {
            oVar.v();
        }
    }

    @Override // k.b
    public final boolean i() {
        return this.f12728t.f12738f.V;
    }

    @Override // k.b
    public final void j(View view) {
        this.f12728t.f12738f.setCustomView(view);
        this.f12727n = new WeakReference(view);
    }

    @Override // k.b
    public final void k(int i10) {
        l(this.f12728t.f12733a.getResources().getString(i10));
    }

    @Override // k.b
    public final void l(CharSequence charSequence) {
        this.f12728t.f12738f.setSubtitle(charSequence);
    }

    @Override // k.b
    public final void m(int i10) {
        n(this.f12728t.f12733a.getResources().getString(i10));
    }

    @Override // k.b
    public final void n(CharSequence charSequence) {
        this.f12728t.f12738f.setTitle(charSequence);
    }

    @Override // k.b
    public final void o(boolean z7) {
        this.f13878e = z7;
        this.f12728t.f12738f.setTitleOptional(z7);
    }

    @Override // l.m
    public final void s(l.o oVar) {
        if (this.f12726m == null) {
            return;
        }
        h();
        m.o oVar2 = this.f12728t.f12738f.f635j;
        if (oVar2 != null) {
            oVar2.o();
        }
    }
}