package g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.ads.ic1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.j3;
import m.o3;
import o0.c1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w0 extends b {

    /* renamed from: a, reason: collision with root package name */
    public final o3 f12911a;

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f12912b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f12913c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12914d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12915e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12916f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f12917g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final androidx.activity.i f12918h;

    public w0(Toolbar toolbar, CharSequence charSequence, g0 g0Var) {
        int i10 = 1;
        this.f12918h = new androidx.activity.i(this, i10);
        p8.c cVar = new p8.c(this, i10);
        toolbar.getClass();
        o3 o3Var = new o3(toolbar, false);
        this.f12911a = o3Var;
        g0Var.getClass();
        this.f12912b = g0Var;
        o3Var.f14883k = g0Var;
        toolbar.setOnMenuItemClickListener(cVar);
        if (!o3Var.f14879g) {
            o3Var.f14880h = charSequence;
            if ((o3Var.f14874b & 8) != 0) {
                Toolbar toolbar2 = o3Var.f14873a;
                toolbar2.setTitle(charSequence);
                if (o3Var.f14879g) {
                    c1.s(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f12913c = new u0(this, i10);
    }

    @Override // g.b
    public final boolean a() {
        m.o oVar;
        ActionMenuView actionMenuView = this.f12911a.f14873a.f723b;
        return (actionMenuView == null || (oVar = actionMenuView.W) == null || !oVar.c()) ? false : true;
    }

    @Override // g.b
    public final boolean b() {
        l.q qVar;
        j3 j3Var = this.f12911a.f14873a.f746s0;
        if (j3Var == null || (qVar = j3Var.f14805e) == null) {
            return false;
        }
        if (j3Var == null) {
            qVar = null;
        }
        if (qVar == null) {
            return true;
        }
        qVar.collapseActionView();
        return true;
    }

    @Override // g.b
    public final void c(boolean z7) {
        if (z7 == this.f12916f) {
            return;
        }
        this.f12916f = z7;
        ArrayList arrayList = this.f12917g;
        if (arrayList.size() <= 0) {
            return;
        }
        ic1.v(arrayList.get(0));
        throw null;
    }

    @Override // g.b
    public final int d() {
        return this.f12911a.f14874b;
    }

    @Override // g.b
    public final Context e() {
        return this.f12911a.f14873a.getContext();
    }

    @Override // g.b
    public final boolean f() {
        o3 o3Var = this.f12911a;
        Toolbar toolbar = o3Var.f14873a;
        androidx.activity.i iVar = this.f12918h;
        toolbar.removeCallbacks(iVar);
        Toolbar toolbar2 = o3Var.f14873a;
        WeakHashMap weakHashMap = c1.f15515a;
        toolbar2.postOnAnimation(iVar);
        return true;
    }

    @Override // g.b
    public final void g() {
    }

    @Override // g.b
    public final void h() {
        this.f12911a.f14873a.removeCallbacks(this.f12918h);
    }

    @Override // g.b
    public final boolean i(int i10, KeyEvent keyEvent) {
        Menu menuV = v();
        if (menuV == null) {
            return false;
        }
        menuV.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuV.performShortcut(i10, keyEvent, 0);
    }

    @Override // g.b
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // g.b
    public final boolean k() {
        return this.f12911a.f14873a.v();
    }

    @Override // g.b
    public final void l(TextView textView, a aVar) {
        textView.setLayoutParams(aVar);
        this.f12911a.a(textView);
    }

    @Override // g.b
    public final void m(boolean z7) {
    }

    @Override // g.b
    public final void n(boolean z7) {
        w(4, 4);
    }

    @Override // g.b
    public final void o() {
        w(16, -1);
    }

    @Override // g.b
    public final void p() {
        w(2, 2);
    }

    @Override // g.b
    public final void q(float f10) {
        Toolbar toolbar = this.f12911a.f14873a;
        WeakHashMap weakHashMap = c1.f15515a;
        o0.q0.s(toolbar, f10);
    }

    @Override // g.b
    public final void r() {
        o3 o3Var = this.f12911a;
        Drawable drawableC = com.bumptech.glide.c.c(o3Var.f14873a.getContext(), 2131165362);
        o3Var.f14878f = drawableC;
        int i10 = o3Var.f14874b & 4;
        Toolbar toolbar = o3Var.f14873a;
        if (i10 == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawableC == null) {
            drawableC = o3Var.f14887o;
        }
        toolbar.setNavigationIcon(drawableC);
    }

    @Override // g.b
    public final void s(boolean z7) {
    }

    @Override // g.b
    public final void t(CharSequence charSequence) {
        o3 o3Var = this.f12911a;
        if (o3Var.f14879g) {
            return;
        }
        o3Var.f14880h = charSequence;
        if ((o3Var.f14874b & 8) != 0) {
            Toolbar toolbar = o3Var.f14873a;
            toolbar.setTitle(charSequence);
            if (o3Var.f14879g) {
                c1.s(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu v() {
        boolean z7 = this.f12915e;
        o3 o3Var = this.f12911a;
        if (!z7) {
            com.onesignal.w wVar = new com.onesignal.w(this);
            v0 v0Var = new v0(this, 0);
            Toolbar toolbar = o3Var.f14873a;
            toolbar.f748t0 = wVar;
            toolbar.f750u0 = v0Var;
            ActionMenuView actionMenuView = toolbar.f723b;
            if (actionMenuView != null) {
                actionMenuView.f661a0 = wVar;
                actionMenuView.f662b0 = v0Var;
            }
            this.f12915e = true;
        }
        return o3Var.f14873a.getMenu();
    }

    public final void w(int i10, int i11) {
        o3 o3Var = this.f12911a;
        o3Var.b((i10 & i11) | ((~i11) & o3Var.f14874b));
    }
}