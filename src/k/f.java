package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.d0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13891a;

    /* renamed from: b, reason: collision with root package name */
    public final b f13892b;

    public f(Context context, b bVar) {
        this.f13891a = context;
        this.f13892b = bVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f13892b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f13892b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new d0(this.f13891a, this.f13892b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f13892b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f13892b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f13892b.f13877b;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f13892b.g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f13892b.f13878e;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f13892b.h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f13892b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f13892b.j(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f13892b.k(i10);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f13892b.f13877b = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f13892b.m(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z7) {
        this.f13892b.o(z7);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f13892b.l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f13892b.n(charSequence);
    }
}