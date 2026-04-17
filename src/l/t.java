package l;

import android.view.MenuItem;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f14414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f14415b;

    public t(v vVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f14415b = vVar;
        this.f14414a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f14414a.onMenuItemActionCollapse(this.f14415b.m(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f14414a.onMenuItemActionExpand(this.f14415b.m(menuItem));
    }
}