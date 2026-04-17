package g;

import android.content.Context;
import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g0 implements Window.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f12772b;

    /* renamed from: e, reason: collision with root package name */
    public u0 f12773e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12774f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12775j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12776m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m0 f12777n;

    public g0(m0 m0Var, Window.Callback callback) {
        this.f12777n = m0Var;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f12772b = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f12774f = true;
            callback.onContentChanged();
        } finally {
            this.f12774f = false;
        }
    }

    @Override // android.view.Window.Callback
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f12772b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f12772b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void onAttachedToWindow() {
        this.f12772b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f12772b.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z7 = this.f12775j;
        Window.Callback callback = this.f12772b;
        return z7 ? callback.dispatchKeyEvent(keyEvent) : this.f12777n.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (this.f12772b.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        m0 m0Var = this.f12777n;
        m0Var.C();
        b bVar = m0Var.R;
        if (bVar != null && bVar.i(keyCode, keyEvent)) {
            return true;
        }
        l0 l0Var = m0Var.f12867p0;
        if (l0Var != null && m0Var.H(l0Var, keyEvent.getKeyCode(), keyEvent)) {
            l0 l0Var2 = m0Var.f12867p0;
            if (l0Var2 == null) {
                return true;
            }
            l0Var2.f12846l = true;
            return true;
        }
        if (m0Var.f12867p0 == null) {
            l0 l0VarB = m0Var.B(0);
            m0Var.I(l0VarB, keyEvent);
            boolean zH = m0Var.H(l0VarB, keyEvent.getKeyCode(), keyEvent);
            l0VarB.f12845k = false;
            if (zH) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f12772b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f12772b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f12772b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void onDetachedFromWindow() {
        this.f12772b.onDetachedFromWindow();
    }

    public final boolean f(int i10, Menu menu) {
        return this.f12772b.onMenuOpened(i10, menu);
    }

    public final void g(int i10, Menu menu) {
        this.f12772b.onPanelClosed(i10, menu);
    }

    @Override // android.view.Window.Callback
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void onPointerCaptureChanged(boolean z7) {
        k.n.a(this.f12772b, z7);
    }

    public final void i(List list, Menu menu, int i10) {
        k.m.a(this.f12772b, list, menu, i10);
    }

    @Override // android.view.Window.Callback
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f12772b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void onWindowFocusChanged(boolean z7) {
        this.f12772b.onWindowFocusChanged(z7);
    }

    public final k.f l(ActionMode.Callback callback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m0 m0Var = this.f12777n;
        Context context = m0Var.N;
        g2.h hVar = new g2.h();
        hVar.f13012e = context;
        hVar.f13011b = callback;
        hVar.f13013f = new ArrayList();
        hVar.f13014j = new t.k();
        k.b bVarM = m0Var.m(hVar);
        if (bVarM != null) {
            return hVar.h(bVarM);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f12774f) {
            this.f12772b.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0 || (menu instanceof l.o)) {
            return this.f12772b.onCreatePanelMenu(i10, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        u0 u0Var = this.f12773e;
        if (u0Var != null) {
            View view = i10 == 0 ? new View(((w0) u0Var.f12903e).f12911a.f14873a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f12772b.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f12772b.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        f(i10, menu);
        m0 m0Var = this.f12777n;
        if (i10 == 108) {
            m0Var.C();
            b bVar = m0Var.R;
            if (bVar != null) {
                bVar.c(true);
            }
        } else {
            m0Var.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        if (this.f12776m) {
            this.f12772b.onPanelClosed(i10, menu);
            return;
        }
        g(i10, menu);
        m0 m0Var = this.f12777n;
        if (i10 == 108) {
            m0Var.C();
            b bVar = m0Var.R;
            if (bVar != null) {
                bVar.c(false);
                return;
            }
            return;
        }
        if (i10 != 0) {
            m0Var.getClass();
            return;
        }
        l0 l0VarB = m0Var.B(i10);
        if (l0VarB.f12847m) {
            m0Var.t(l0VarB, false);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        l.o oVar = menu instanceof l.o ? (l.o) menu : null;
        if (i10 == 0 && oVar == null) {
            return false;
        }
        if (oVar != null) {
            oVar.f14380x = true;
        }
        u0 u0Var = this.f12773e;
        if (u0Var != null && i10 == 0) {
            w0 w0Var = (w0) u0Var.f12903e;
            if (!w0Var.f12914d) {
                w0Var.f12911a.f14884l = true;
                w0Var.f12914d = true;
            }
        }
        boolean zOnPreparePanel = this.f12772b.onPreparePanel(i10, view, menu);
        if (oVar != null) {
            oVar.f14380x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        l.o oVar = this.f12777n.B(0).f12842h;
        if (oVar != null) {
            i(list, oVar, i10);
        } else {
            i(list, menu, i10);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f12772b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        this.f12777n.getClass();
        return l(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.l.a(this.f12772b, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        this.f12777n.getClass();
        if (i10 != 0) {
            return k.l.b(this.f12772b, callback, i10);
        }
        return l(callback);
    }
}