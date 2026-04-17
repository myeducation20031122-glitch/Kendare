package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.g1;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q implements j0.b {
    public r A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    public final int f14384a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14385b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14386c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14387d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f14388e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f14389f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f14390g;

    /* renamed from: h, reason: collision with root package name */
    public char f14391h;

    /* renamed from: j, reason: collision with root package name */
    public char f14393j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f14395l;

    /* renamed from: n, reason: collision with root package name */
    public final o f14397n;

    /* renamed from: o, reason: collision with root package name */
    public g0 f14398o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f14399p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f14400q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f14401r;

    /* renamed from: y, reason: collision with root package name */
    public int f14408y;

    /* renamed from: z, reason: collision with root package name */
    public View f14409z;

    /* renamed from: i, reason: collision with root package name */
    public int f14392i = g1.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: k, reason: collision with root package name */
    public int f14394k = g1.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: m, reason: collision with root package name */
    public int f14396m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f14402s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f14403t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14404u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14405v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14406w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f14407x = 16;
    public boolean C = false;

    public q(o oVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f14397n = oVar;
        this.f14384a = i11;
        this.f14385b = i10;
        this.f14386c = i12;
        this.f14387d = i13;
        this.f14388e = charSequence;
        this.f14408y = i14;
    }

    public static void c(int i10, int i11, String str, StringBuilder sb) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    @Override // j0.b
    public final r a() {
        return this.A;
    }

    @Override // j0.b
    public final j0.b b(r rVar) {
        r rVar2 = this.A;
        if (rVar2 != null) {
            rVar2.getClass();
        }
        this.f14409z = null;
        this.A = rVar;
        this.f14397n.p(true);
        r rVar3 = this.A;
        if (rVar3 != null) {
            rVar3.f14410a = new p8.c(this, 3);
            rVar3.f14411b.setVisibilityListener(rVar3);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f14408y & 8) == 0) {
            return false;
        }
        if (this.f14409z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f14397n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f14406w && (this.f14404u || this.f14405v)) {
            drawable = fc.t.P(drawable).mutate();
            if (this.f14404u) {
                i0.a.h(drawable, this.f14402s);
            }
            if (this.f14405v) {
                i0.a.i(drawable, this.f14403t);
            }
            this.f14406w = false;
        }
        return drawable;
    }

    public final boolean e() {
        r rVar;
        if ((this.f14408y & 8) == 0) {
            return false;
        }
        if (this.f14409z == null && (rVar = this.A) != null) {
            this.f14409z = rVar.f14411b.onCreateActionView(this);
        }
        return this.f14409z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f14397n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f14407x & 32) == 32;
    }

    public final void g(boolean z7) {
        this.f14407x = (z7 ? 4 : 0) | (this.f14407x & (-5));
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f14409z;
        if (view != null) {
            return view;
        }
        r rVar = this.A;
        if (rVar == null) {
            return null;
        }
        View viewOnCreateActionView = rVar.f14411b.onCreateActionView(this);
        this.f14409z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // j0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f14394k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f14393j;
    }

    @Override // j0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f14400q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f14385b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f14395l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f14396m;
        if (i10 == 0) {
            return null;
        }
        Drawable drawableC = com.bumptech.glide.c.c(this.f14397n.f14357a, i10);
        this.f14396m = 0;
        this.f14395l = drawableC;
        return d(drawableC);
    }

    @Override // j0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f14402s;
    }

    @Override // j0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f14403t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f14390g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f14384a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // j0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f14392i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f14391h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f14386c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f14398o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f14388e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f14389f;
        return charSequence != null ? charSequence : this.f14388e;
    }

    @Override // j0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f14401r;
    }

    public final void h(boolean z7) {
        this.f14407x = z7 ? this.f14407x | 32 : this.f14407x & (-33);
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f14398o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f14407x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f14407x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f14407x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        r rVar = this.A;
        return (rVar == null || !rVar.f14411b.overridesItemVisibility()) ? (this.f14407x & 8) == 0 : (this.f14407x & 8) == 0 && this.A.f14411b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        Context context = this.f14397n.f14357a;
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f14409z = viewInflate;
        this.A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i11 = this.f14384a) > 0) {
            viewInflate.setId(i11);
        }
        o oVar = this.f14397n;
        oVar.f14367k = true;
        oVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f14393j == c10) {
            return this;
        }
        this.f14393j = Character.toLowerCase(c10);
        this.f14397n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z7) {
        int i10 = this.f14407x;
        int i11 = (z7 ? 1 : 0) | (i10 & (-2));
        this.f14407x = i11;
        if (i10 != i11) {
            this.f14397n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z7) {
        int i10 = this.f14407x;
        if ((i10 & 4) != 0) {
            o oVar = this.f14397n;
            oVar.getClass();
            ArrayList arrayList = oVar.f14362f;
            int size = arrayList.size();
            oVar.w();
            for (int i11 = 0; i11 < size; i11++) {
                q qVar = (q) arrayList.get(i11);
                if (qVar.f14385b == this.f14385b && (qVar.f14407x & 4) != 0 && qVar.isCheckable()) {
                    boolean z10 = qVar == this;
                    int i12 = qVar.f14407x;
                    int i13 = (z10 ? 2 : 0) | (i12 & (-3));
                    qVar.f14407x = i13;
                    if (i12 != i13) {
                        qVar.f14397n.p(false);
                    }
                }
            }
            oVar.v();
        } else {
            int i14 = (i10 & (-3)) | (z7 ? 2 : 0);
            this.f14407x = i14;
            if (i10 != i14) {
                this.f14397n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z7) {
        this.f14407x = z7 ? this.f14407x | 16 : this.f14407x & (-17);
        this.f14397n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f14395l = null;
        this.f14396m = i10;
        this.f14406w = true;
        this.f14397n.p(false);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f14402s = colorStateList;
        this.f14404u = true;
        this.f14406w = true;
        this.f14397n.p(false);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f14403t = mode;
        this.f14405v = true;
        this.f14406w = true;
        this.f14397n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f14390g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f14391h == c10) {
            return this;
        }
        this.f14391h = c10;
        this.f14397n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f14399p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f14391h = c10;
        this.f14393j = Character.toLowerCase(c11);
        this.f14397n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f14408y = i10;
        o oVar = this.f14397n;
        oVar.f14367k = true;
        oVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f14397n.f14357a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f14389f = charSequence;
        this.f14397n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z7) {
        int i10 = this.f14407x;
        int i11 = (z7 ? 0 : 8) | (i10 & (-9));
        this.f14407x = i11;
        if (i10 != i11) {
            o oVar = this.f14397n;
            oVar.f14364h = true;
            oVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f14388e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // j0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f14393j == c10 && this.f14394k == i10) {
            return this;
        }
        this.f14393j = Character.toLowerCase(c10);
        this.f14394k = KeyEvent.normalizeMetaState(i10);
        this.f14397n.p(false);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public final j0.b setContentDescription(CharSequence charSequence) {
        this.f14400q = charSequence;
        this.f14397n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f14396m = 0;
        this.f14395l = drawable;
        this.f14406w = true;
        this.f14397n.p(false);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f14391h == c10 && this.f14392i == i10) {
            return this;
        }
        this.f14391h = c10;
        this.f14392i = KeyEvent.normalizeMetaState(i10);
        this.f14397n.p(false);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f14391h = c10;
        this.f14392i = KeyEvent.normalizeMetaState(i10);
        this.f14393j = Character.toLowerCase(c11);
        this.f14394k = KeyEvent.normalizeMetaState(i11);
        this.f14397n.p(false);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public final j0.b setTooltipText(CharSequence charSequence) {
        this.f14401r = charSequence;
        this.f14397n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f14388e = charSequence;
        this.f14397n.p(false);
        g0 g0Var = this.f14398o;
        if (g0Var != null) {
            g0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f14409z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f14384a) > 0) {
            view.setId(i10);
        }
        o oVar = this.f14397n;
        oVar.f14367k = true;
        oVar.p(true);
        return this;
    }
}