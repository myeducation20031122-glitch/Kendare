package k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends b implements l.m {

    /* renamed from: f, reason: collision with root package name */
    public Context f13885f;

    /* renamed from: j, reason: collision with root package name */
    public ActionBarContextView f13886j;

    /* renamed from: m, reason: collision with root package name */
    public a f13887m;

    /* renamed from: n, reason: collision with root package name */
    public WeakReference f13888n;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13889t;

    /* renamed from: u, reason: collision with root package name */
    public o f13890u;

    @Override // k.b
    public final void a() {
        if (this.f13889t) {
            return;
        }
        this.f13889t = true;
        this.f13887m.d(this);
    }

    @Override // k.b
    public final View b() {
        WeakReference weakReference = this.f13888n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.b
    public final o c() {
        return this.f13890u;
    }

    @Override // k.b
    public final MenuInflater d() {
        return new i(this.f13886j.getContext());
    }

    @Override // k.b
    public final CharSequence e() {
        return this.f13886j.getSubtitle();
    }

    @Override // l.m
    public final boolean f(o oVar, MenuItem menuItem) {
        return this.f13887m.a(this, menuItem);
    }

    @Override // k.b
    public final CharSequence g() {
        return this.f13886j.getTitle();
    }

    @Override // k.b
    public final void h() {
        this.f13887m.b(this, this.f13890u);
    }

    @Override // k.b
    public final boolean i() {
        return this.f13886j.V;
    }

    @Override // k.b
    public final void j(View view) {
        this.f13886j.setCustomView(view);
        this.f13888n = view != null ? new WeakReference(view) : null;
    }

    @Override // k.b
    public final void k(int i10) {
        l(this.f13885f.getString(i10));
    }

    @Override // k.b
    public final void l(CharSequence charSequence) {
        this.f13886j.setSubtitle(charSequence);
    }

    @Override // k.b
    public final void m(int i10) {
        n(this.f13885f.getString(i10));
    }

    @Override // k.b
    public final void n(CharSequence charSequence) {
        this.f13886j.setTitle(charSequence);
    }

    @Override // k.b
    public final void o(boolean z7) {
        this.f13878e = z7;
        this.f13886j.setTitleOptional(z7);
    }

    @Override // l.m
    public final void s(o oVar) {
        h();
        m.o oVar2 = this.f13886j.f635j;
        if (oVar2 != null) {
            oVar2.o();
        }
    }
}