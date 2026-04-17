package l;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.recyclerview.widget.g1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements j0.b {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f14289a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f14290b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f14291c;

    /* renamed from: d, reason: collision with root package name */
    public char f14292d;

    /* renamed from: f, reason: collision with root package name */
    public char f14294f;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f14296h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f14297i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f14298j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f14299k;

    /* renamed from: e, reason: collision with root package name */
    public int f14293e = g1.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: g, reason: collision with root package name */
    public int f14295g = g1.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f14300l = null;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f14301m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f14302n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14303o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f14304p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f14297i = context;
        this.f14289a = charSequence;
    }

    @Override // j0.b
    public final r a() {
        return null;
    }

    @Override // j0.b
    public final j0.b b(r rVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f14296h;
        if (drawable != null) {
            if (this.f14302n || this.f14303o) {
                Drawable drawableP = fc.t.P(drawable);
                this.f14296h = drawableP;
                Drawable drawableMutate = drawableP.mutate();
                this.f14296h = drawableMutate;
                if (this.f14302n) {
                    i0.a.h(drawableMutate, this.f14300l);
                }
                if (this.f14303o) {
                    i0.a.i(this.f14296h, this.f14301m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // j0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f14295g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f14294f;
    }

    @Override // j0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f14298j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f14296h;
    }

    @Override // j0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f14300l;
    }

    @Override // j0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f14301m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f14291c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // j0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f14293e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f14292d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f14289a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f14290b;
        return charSequence != null ? charSequence : this.f14289a;
    }

    @Override // j0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f14299k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f14304p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f14304p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f14304p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f14304p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f14294f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z7) {
        this.f14304p = (z7 ? 1 : 0) | (this.f14304p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z7) {
        this.f14304p = (z7 ? 2 : 0) | (this.f14304p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f14298j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z7) {
        this.f14304p = (z7 ? 16 : 0) | (this.f14304p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        Object obj = f0.f.f12651a;
        this.f14296h = f0.a.b(this.f14297i, i10);
        c();
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f14300l = colorStateList;
        this.f14302n = true;
        c();
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f14301m = mode;
        this.f14303o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f14291c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f14292d = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f14292d = c10;
        this.f14294f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f14289a = this.f14297i.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f14290b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f14299k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z7) {
        this.f14304p = (this.f14304p & 8) | (z7 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // j0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f14294f = Character.toLowerCase(c10);
        this.f14295g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public final j0.b setContentDescription(CharSequence charSequence) {
        this.f14298j = charSequence;
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f14292d = c10;
        this.f14293e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f14292d = c10;
        this.f14293e = KeyEvent.normalizeMetaState(i10);
        this.f14294f = Character.toLowerCase(c11);
        this.f14295g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f14289a = charSequence;
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public final j0.b setTooltipText(CharSequence charSequence) {
        this.f14299k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f14296h = drawable;
        c();
        return this;
    }
}