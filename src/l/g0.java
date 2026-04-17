package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g0 extends o implements SubMenu {
    public final q A;

    /* renamed from: z, reason: collision with root package name */
    public final o f14326z;

    public g0(Context context, o oVar, q qVar) {
        super(context);
        this.f14326z = oVar;
        this.A = qVar;
    }

    @Override // l.o
    public final boolean d(q qVar) {
        return this.f14326z.d(qVar);
    }

    @Override // l.o
    public final boolean e(o oVar, MenuItem menuItem) {
        return super.e(oVar, menuItem) || this.f14326z.e(oVar, menuItem);
    }

    @Override // l.o
    public final boolean f(q qVar) {
        return this.f14326z.f(qVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // l.o
    public final String j() {
        q qVar = this.A;
        int i10 = qVar != null ? qVar.f14384a : 0;
        if (i10 == 0) {
            return null;
        }
        return kc.r.d("android:menu:actionviewstates:", i10);
    }

    @Override // l.o
    public final o k() {
        return this.f14326z.k();
    }

    @Override // l.o
    public final boolean m() {
        return this.f14326z.m();
    }

    @Override // l.o
    public final boolean n() {
        return this.f14326z.n();
    }

    @Override // l.o
    public final boolean o() {
        return this.f14326z.o();
    }

    @Override // l.o, android.view.Menu
    public final void setGroupDividerEnabled(boolean z7) {
        this.f14326z.setGroupDividerEnabled(z7);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        u(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        u(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.A.setIcon(i10);
        return this;
    }

    @Override // l.o, android.view.Menu
    public final void setQwertyMode(boolean z7) {
        this.f14326z.setQwertyMode(z7);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }
}