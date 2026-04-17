package g;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import m.h1;
import m.n1;
import m.o3;
import m.p1;
import m.t3;
import m.v3;
import m.w3;
import o0.c1;
import o0.m2;
import o0.o1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m0 extends x implements l.m, LayoutInflater.Factory2 {
    public static final t.k K0 = new t.k();
    public static final int[] L0 = {R.attr.windowBackground};
    public static final boolean M0 = !"robolectric".equals(Build.FINGERPRINT);
    public h0 A0;
    public boolean B0;
    public int C0;
    public boolean E0;
    public Rect F0;
    public Rect G0;
    public r0 H0;
    public OnBackInvokedDispatcher I0;
    public OnBackInvokedCallback J0;
    public final Object M;
    public final Context N;
    public Window O;
    public g0 P;
    public final q Q;
    public b R;
    public k.i S;
    public CharSequence T;
    public p1 U;
    public z V;
    public a0 W;
    public k.b X;
    public ActionBarContextView Y;
    public PopupWindow Z;

    /* renamed from: a0, reason: collision with root package name */
    public y f12852a0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f12854c0;

    /* renamed from: d0, reason: collision with root package name */
    public ViewGroup f12855d0;

    /* renamed from: e0, reason: collision with root package name */
    public TextView f12856e0;

    /* renamed from: f0, reason: collision with root package name */
    public View f12857f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f12858g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f12859h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f12860i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f12861j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f12862k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f12863l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f12864m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f12865n0;

    /* renamed from: o0, reason: collision with root package name */
    public l0[] f12866o0;

    /* renamed from: p0, reason: collision with root package name */
    public l0 f12867p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f12868q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f12869r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f12870s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f12871t0;

    /* renamed from: u0, reason: collision with root package name */
    public Configuration f12872u0;

    /* renamed from: v0, reason: collision with root package name */
    public final int f12873v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f12874w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f12875x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f12876y0;

    /* renamed from: z0, reason: collision with root package name */
    public h0 f12877z0;

    /* renamed from: b0, reason: collision with root package name */
    public o1 f12853b0 = null;
    public final y D0 = new y(this, 0);

    public m0(Context context, Window window, q qVar, Object obj) {
        p pVar;
        this.f12873v0 = -100;
        this.N = context;
        this.Q = qVar;
        this.M = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof p)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    pVar = (p) context;
                    break;
                }
            }
            pVar = null;
            if (pVar != null) {
                this.f12873v0 = ((m0) pVar.getDelegate()).f12873v0;
            }
        }
        if (this.f12873v0 == -100) {
            t.k kVar = K0;
            Integer num = (Integer) kVar.getOrDefault(this.M.getClass().getName(), null);
            if (num != null) {
                this.f12873v0 = num.intValue();
                kVar.remove(this.M.getClass().getName());
            }
        }
        if (window != null) {
            o(window);
        }
        m.x.d();
    }

    public static k0.i A(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? e0.b(configuration) : k0.i.b(d0.b(configuration.locale));
    }

    public static k0.i p(Context context) {
        k0.i iVar;
        k0.i iVarB;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (iVar = x.f12921f) == null) {
            return null;
        }
        k0.i iVarA = A(context.getApplicationContext().getResources().getConfiguration());
        int i11 = 0;
        k0.k kVar = iVar.f13944a;
        if (i10 < 24) {
            iVarB = kVar.isEmpty() ? k0.i.f13943b : k0.i.b(d0.b(kVar.get(0)));
        } else if (kVar.isEmpty()) {
            iVarB = k0.i.f13943b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i11 < iVarA.f13944a.size() + kVar.size()) {
                Locale locale = i11 < kVar.size() ? kVar.get(i11) : iVarA.f13944a.get(i11 - kVar.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i11++;
            }
            iVarB = k0.i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return iVarB.f13944a.isEmpty() ? iVarA : iVarB;
    }

    public static Configuration u(Context context, int i10, k0.i iVar, Configuration configuration, boolean z7) {
        int i11 = i10 != 1 ? i10 != 2 ? z7 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                e0.d(configuration2, iVar);
            } else {
                k0.k kVar = iVar.f13944a;
                configuration2.setLocale(kVar.get(0));
                configuration2.setLayoutDirection(kVar.get(0));
            }
        }
        return configuration2;
    }

    public final l0 B(int i10) {
        l0[] l0VarArr = this.f12866o0;
        if (l0VarArr == null || l0VarArr.length <= i10) {
            l0[] l0VarArr2 = new l0[i10 + 1];
            if (l0VarArr != null) {
                System.arraycopy(l0VarArr, 0, l0VarArr2, 0, l0VarArr.length);
            }
            this.f12866o0 = l0VarArr2;
            l0VarArr = l0VarArr2;
        }
        l0 l0Var = l0VarArr[i10];
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0();
        l0Var2.f12835a = i10;
        l0Var2.f12848n = false;
        l0VarArr[i10] = l0Var2;
        return l0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C() {
        b1 b1Var;
        b bVar;
        x();
        if (!this.f12860i0 || this.R != null) {
            return;
        }
        Object obj = this.M;
        if (!(obj instanceof Activity)) {
            if (obj instanceof Dialog) {
                b1Var = new b1((Dialog) obj);
            }
            bVar = this.R;
            if (bVar == null) {
                bVar.m(this.E0);
                return;
            }
            return;
        }
        b1Var = new b1((Activity) obj, this.f12861j0);
        this.R = b1Var;
        bVar = this.R;
        if (bVar == null) {
        }
    }

    public final void D(int i10) {
        this.C0 = (1 << i10) | this.C0;
        if (this.B0) {
            return;
        }
        View decorView = this.O.getDecorView();
        WeakHashMap weakHashMap = c1.f15515a;
        decorView.postOnAnimation(this.D0);
        this.B0 = true;
    }

    public final int E(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return z(context).c();
                }
                return -1;
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.A0 == null) {
                    this.A0 = new h0(this, context);
                }
                return this.A0.c();
            }
        }
        return i10;
    }

    public final boolean F() {
        boolean z7 = this.f12868q0;
        this.f12868q0 = false;
        l0 l0VarB = B(0);
        if (l0VarB.f12847m) {
            if (!z7) {
                t(l0VarB, true);
            }
            return true;
        }
        k.b bVar = this.X;
        if (bVar != null) {
            bVar.a();
            return true;
        }
        C();
        b bVar2 = this.R;
        return bVar2 != null && bVar2.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0170, code lost:
    
        if (r3.f14349n.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(l0 l0Var, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (l0Var.f12847m || this.f12871t0) {
            return;
        }
        int i11 = l0Var.f12835a;
        Context context = this.N;
        if (i11 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.O.getCallback();
        if (callback != null && !callback.onMenuOpened(i11, l0Var.f12842h)) {
            t(l0Var, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !I(l0Var, keyEvent)) {
            return;
        }
        k0 k0Var = l0Var.f12839e;
        if (k0Var != null && !l0Var.f12848n) {
            View view = l0Var.f12841g;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i10 = -1;
            }
            l0Var.f12846l = false;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
            layoutParams2.gravity = l0Var.f12837c;
            layoutParams2.windowAnimations = l0Var.f12838d;
            windowManager.addView(l0Var.f12839e, layoutParams2);
            l0Var.f12847m = true;
            if (i11 != 0) {
                K();
                return;
            }
            return;
        }
        if (k0Var == null) {
            C();
            b bVar = this.R;
            Context contextE = bVar != null ? bVar.e() : null;
            if (contextE != null) {
                context = contextE;
            }
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(2130903047, typedValue, true);
            int i12 = typedValue.resourceId;
            if (i12 != 0) {
                themeNewTheme.applyStyle(i12, true);
            }
            themeNewTheme.resolveAttribute(2130903991, typedValue, true);
            int i13 = typedValue.resourceId;
            if (i13 == 0) {
                i13 = 2131952272;
            }
            themeNewTheme.applyStyle(i13, true);
            k.d dVar = new k.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            l0Var.f12844j = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(f.a.f12633j);
            l0Var.f12836b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
            l0Var.f12838d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            typedArrayObtainStyledAttributes.recycle();
            l0Var.f12839e = new k0(this, l0Var.f12844j);
            l0Var.f12837c = 81;
        } else if (l0Var.f12848n && k0Var.getChildCount() > 0) {
            l0Var.f12839e.removeAllViews();
        }
        View view2 = l0Var.f12841g;
        if (view2 == null) {
            if (l0Var.f12842h != null) {
                if (this.W == null) {
                    this.W = new a0(this);
                }
                a0 a0Var = this.W;
                if (l0Var.f12843i == null) {
                    l.k kVar = new l.k(l0Var.f12844j);
                    l0Var.f12843i = kVar;
                    kVar.f14348m = a0Var;
                    l.o oVar = l0Var.f12842h;
                    oVar.b(kVar, oVar.f14357a);
                }
                l.k kVar2 = l0Var.f12843i;
                k0 k0Var2 = l0Var.f12839e;
                if (kVar2.f14347j == null) {
                    kVar2.f14347j = (ExpandedMenuView) kVar2.f14345e.inflate(2131492877, (ViewGroup) k0Var2, false);
                    if (kVar2.f14349n == null) {
                        kVar2.f14349n = new l.j(kVar2);
                    }
                    kVar2.f14347j.setAdapter((ListAdapter) kVar2.f14349n);
                    kVar2.f14347j.setOnItemClickListener(kVar2);
                }
                ExpandedMenuView expandedMenuView = kVar2.f14347j;
                l0Var.f12840f = expandedMenuView;
                if (expandedMenuView != null) {
                }
            }
            l0Var.f12848n = true;
            return;
        }
        l0Var.f12840f = view2;
        if (l0Var.f12840f != null) {
            if (l0Var.f12841g == null) {
                l.k kVar3 = l0Var.f12843i;
                if (kVar3.f14349n == null) {
                    kVar3.f14349n = new l.j(kVar3);
                }
            }
            ViewGroup.LayoutParams layoutParams3 = l0Var.f12840f.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            l0Var.f12839e.setBackgroundResource(l0Var.f12836b);
            ViewParent parent = l0Var.f12840f.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(l0Var.f12840f);
            }
            l0Var.f12839e.addView(l0Var.f12840f, layoutParams3);
            if (!l0Var.f12840f.hasFocus()) {
                l0Var.f12840f.requestFocus();
            }
        }
        l0Var.f12848n = true;
        return;
        i10 = -2;
        l0Var.f12846l = false;
        WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
        layoutParams22.gravity = l0Var.f12837c;
        layoutParams22.windowAnimations = l0Var.f12838d;
        windowManager.addView(l0Var.f12839e, layoutParams22);
        l0Var.f12847m = true;
        if (i11 != 0) {
        }
    }

    public final boolean H(l0 l0Var, int i10, KeyEvent keyEvent) {
        l.o oVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((l0Var.f12845k || I(l0Var, keyEvent)) && (oVar = l0Var.f12842h) != null) {
            return oVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    public final boolean I(l0 l0Var, KeyEvent keyEvent) {
        p1 p1Var;
        p1 p1Var2;
        Resources.Theme themeNewTheme;
        p1 p1Var3;
        p1 p1Var4;
        if (this.f12871t0) {
            return false;
        }
        if (l0Var.f12845k) {
            return true;
        }
        l0 l0Var2 = this.f12867p0;
        if (l0Var2 != null && l0Var2 != l0Var) {
            t(l0Var2, false);
        }
        Window.Callback callback = this.O.getCallback();
        int i10 = l0Var.f12835a;
        if (callback != null) {
            l0Var.f12841g = callback.onCreatePanelView(i10);
        }
        boolean z7 = i10 == 0 || i10 == 108;
        if (z7 && (p1Var4 = this.U) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) p1Var4;
            actionBarOverlayLayout.k();
            ((o3) actionBarOverlayLayout.f656m).f14884l = true;
        }
        if (l0Var.f12841g == null && (!z7 || !(this.R instanceof w0))) {
            l.o oVar = l0Var.f12842h;
            if (oVar == null || l0Var.f12849o) {
                if (oVar == null) {
                    Context context = this.N;
                    if ((i10 == 0 || i10 == 108) && this.U != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(2130903054, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(2130903055, typedValue, true);
                        } else {
                            theme.resolveAttribute(2130903055, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            k.d dVar = new k.d(context, 0);
                            dVar.getTheme().setTo(themeNewTheme);
                            context = dVar;
                        }
                    }
                    l.o oVar2 = new l.o(context);
                    oVar2.f14361e = this;
                    l.o oVar3 = l0Var.f12842h;
                    if (oVar2 != oVar3) {
                        if (oVar3 != null) {
                            oVar3.r(l0Var.f12843i);
                        }
                        l0Var.f12842h = oVar2;
                        l.k kVar = l0Var.f12843i;
                        if (kVar != null) {
                            oVar2.b(kVar, oVar2.f14357a);
                        }
                    }
                    if (l0Var.f12842h == null) {
                        return false;
                    }
                }
                if (z7 && (p1Var2 = this.U) != null) {
                    if (this.V == null) {
                        this.V = new z(this);
                    }
                    ((ActionBarOverlayLayout) p1Var2).l(l0Var.f12842h, this.V);
                }
                l0Var.f12842h.w();
                if (!callback.onCreatePanelMenu(i10, l0Var.f12842h)) {
                    l.o oVar4 = l0Var.f12842h;
                    if (oVar4 != null) {
                        if (oVar4 != null) {
                            oVar4.r(l0Var.f12843i);
                        }
                        l0Var.f12842h = null;
                    }
                    if (z7 && (p1Var = this.U) != null) {
                        ((ActionBarOverlayLayout) p1Var).l(null, this.V);
                    }
                    return false;
                }
                l0Var.f12849o = false;
            }
            l0Var.f12842h.w();
            Bundle bundle = l0Var.f12850p;
            if (bundle != null) {
                l0Var.f12842h.s(bundle);
                l0Var.f12850p = null;
            }
            if (!callback.onPreparePanel(0, l0Var.f12841g, l0Var.f12842h)) {
                if (z7 && (p1Var3 = this.U) != null) {
                    ((ActionBarOverlayLayout) p1Var3).l(null, this.V);
                }
                l0Var.f12842h.v();
                return false;
            }
            l0Var.f12842h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            l0Var.f12842h.v();
        }
        l0Var.f12845k = true;
        l0Var.f12846l = false;
        this.f12867p0 = l0Var;
        return true;
    }

    public final void J() {
        if (this.f12854c0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void K() {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedCallback onBackInvokedCallbackB;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z7 = false;
            if (this.I0 != null && (B(0).f12847m || this.X != null)) {
                z7 = true;
            }
            if (z7 && this.J0 == null) {
                onBackInvokedCallbackB = f0.b(this.I0, this);
            } else {
                if (z7 || (onBackInvokedCallback = this.J0) == null) {
                    return;
                }
                f0.c(this.I0, onBackInvokedCallback);
                onBackInvokedCallbackB = null;
            }
            this.J0 = onBackInvokedCallbackB;
        }
    }

    public final int L(m2 m2Var, Rect rect) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z7;
        boolean z10;
        int iD = m2Var != null ? m2Var.d() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.Y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z7 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.Y.getLayoutParams();
            if (this.Y.isShown()) {
                if (this.F0 == null) {
                    this.F0 = new Rect();
                    this.G0 = new Rect();
                }
                Rect rect2 = this.F0;
                Rect rect3 = this.G0;
                if (m2Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(m2Var.b(), m2Var.d(), m2Var.c(), m2Var.a());
                }
                ViewGroup viewGroup = this.f12855d0;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z11 = w3.f14984a;
                    v3.a(viewGroup, rect2, rect3);
                } else {
                    if (!w3.f14984a) {
                        w3.f14984a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            w3.f14985b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                w3.f14985b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = w3.f14985b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect2, rect3);
                        } catch (Exception e10) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                        }
                    }
                }
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                m2 m2VarI = c1.i(this.f12855d0);
                int iB = m2VarI == null ? 0 : m2VarI.b();
                int iC = m2VarI == null ? 0 : m2VarI.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z10 = true;
                }
                Context context = this.N;
                if (i10 <= 0 || this.f12857f0 != null) {
                    View view = this.f12857f0;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            this.f12857f0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(context);
                    this.f12857f0 = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    this.f12855d0.addView(this.f12857f0, -1, layoutParams);
                }
                View view3 = this.f12857f0;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.f12857f0;
                    view4.setBackgroundColor(f0.f.b(context, (view4.getWindowSystemUiVisibility() & 8192) != 0 ? 2131034118 : 2131034117));
                }
                if (!this.f12862k0 && z) {
                    iD = 0;
                }
                z7 = z;
                z = z10;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z7 = false;
            } else {
                z7 = false;
                z = false;
            }
            if (z) {
                this.Y.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.f12857f0;
        if (view5 != null) {
            view5.setVisibility(z7 ? 0 : 8);
        }
        return iD;
    }

    @Override // g.x
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.N);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof m0) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.x
    public final void b() {
        if (this.R != null) {
            C();
            if (this.R.f()) {
                return;
            }
            D(0);
        }
    }

    @Override // g.x
    public final void d() {
        String strK;
        this.f12869r0 = true;
        n(false, true);
        y();
        Object obj = this.M;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strK = com.bumptech.glide.f.k(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                strK = null;
            }
            if (strK != null) {
                b bVar = this.R;
                if (bVar == null) {
                    this.E0 = true;
                } else {
                    bVar.m(true);
                }
            }
            synchronized (x.f12926u) {
                x.g(this);
                x.f12925t.add(new WeakReference(this));
            }
        }
        this.f12872u0 = new Configuration(this.N.getResources().getConfiguration());
        this.f12870s0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // g.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        if (this.M instanceof Activity) {
            synchronized (x.f12926u) {
                x.g(this);
            }
        }
        if (this.B0) {
            this.O.getDecorView().removeCallbacks(this.D0);
        }
        this.f12871t0 = true;
        if (this.f12873v0 != -100) {
            Object obj = this.M;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                K0.put(this.M.getClass().getName(), Integer.valueOf(this.f12873v0));
            } else {
                K0.remove(this.M.getClass().getName());
            }
        }
        b bVar = this.R;
        if (bVar != null) {
            bVar.h();
        }
        h0 h0Var = this.f12877z0;
        if (h0Var != null) {
            h0Var.a();
        }
        h0 h0Var2 = this.A0;
        if (h0Var2 != null) {
            h0Var2.a();
        }
    }

    @Override // l.m
    public final boolean f(l.o oVar, MenuItem menuItem) {
        l0 l0Var;
        Window.Callback callback = this.O.getCallback();
        if (callback != null && !this.f12871t0) {
            l.o oVarK = oVar.k();
            l0[] l0VarArr = this.f12866o0;
            int length = l0VarArr != null ? l0VarArr.length : 0;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    l0Var = l0VarArr[i10];
                    if (l0Var != null && l0Var.f12842h == oVarK) {
                        break;
                    }
                    i10++;
                } else {
                    l0Var = null;
                    break;
                }
            }
            if (l0Var != null) {
                return callback.onMenuItemSelected(l0Var.f12835a, menuItem);
            }
        }
        return false;
    }

    @Override // g.x
    public final boolean h(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.f12864m0 && i10 == 108) {
            return false;
        }
        if (this.f12860i0 && i10 == 1) {
            this.f12860i0 = false;
        }
        if (i10 == 1) {
            J();
            this.f12864m0 = true;
            return true;
        }
        if (i10 == 2) {
            J();
            this.f12858g0 = true;
            return true;
        }
        if (i10 == 5) {
            J();
            this.f12859h0 = true;
            return true;
        }
        if (i10 == 10) {
            J();
            this.f12862k0 = true;
            return true;
        }
        if (i10 == 108) {
            J();
            this.f12860i0 = true;
            return true;
        }
        if (i10 != 109) {
            return this.O.requestFeature(i10);
        }
        J();
        this.f12861j0 = true;
        return true;
    }

    @Override // g.x
    public final void i(int i10) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f12855d0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.N).inflate(i10, viewGroup);
        this.P.a(this.O.getCallback());
    }

    @Override // g.x
    public final void j(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f12855d0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.P.a(this.O.getCallback());
    }

    @Override // g.x
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f12855d0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.P.a(this.O.getCallback());
    }

    @Override // g.x
    public final void l(CharSequence charSequence) {
        this.T = charSequence;
        p1 p1Var = this.U;
        if (p1Var != null) {
            p1Var.setWindowTitle(charSequence);
            return;
        }
        b bVar = this.R;
        if (bVar != null) {
            bVar.t(charSequence);
            return;
        }
        TextView textView = this.f12856e0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    @Override // g.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k.b m(k.a aVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        k.b bVarOnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        k.b bVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        k.b bVar2 = this.X;
        if (bVar2 != null) {
            bVar2.a();
        }
        c0 c0Var = new c0(this, aVar);
        C();
        b bVar3 = this.R;
        q qVar = this.Q;
        if (bVar3 != null) {
            k.b bVarU = bVar3.u(c0Var);
            this.X = bVarU;
            if (bVarU != null && qVar != null) {
                qVar.onSupportActionModeStarted(bVarU);
            }
        }
        if (this.X == null) {
            o1 o1Var = this.f12853b0;
            if (o1Var != null) {
                o1Var.b();
            }
            k.b bVar4 = this.X;
            if (bVar4 != null) {
                bVar4.a();
            }
            if (qVar == null || this.f12871t0) {
                bVarOnWindowStartingSupportActionMode = null;
                if (bVarOnWindowStartingSupportActionMode == null) {
                    this.X = bVarOnWindowStartingSupportActionMode;
                } else {
                    int i10 = 1;
                    if (this.Y == null) {
                        boolean z7 = this.f12863l0;
                        Context context = this.N;
                        if (z7) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(2130903054, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                k.d dVar = new k.d(context, 0);
                                dVar.getTheme().setTo(themeNewTheme);
                                context = dVar;
                            }
                            this.Y = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, 2130903069);
                            this.Z = popupWindow;
                            g5.a.A(popupWindow, 2);
                            this.Z.setContentView(this.Y);
                            this.Z.setWidth(-1);
                            context.getTheme().resolveAttribute(2130903048, typedValue, true);
                            this.Y.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.Z.setHeight(-2);
                            this.f12852a0 = new y(this, i10);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.f12855d0.findViewById(2131296338);
                            if (viewStubCompat != null) {
                                C();
                                b bVar5 = this.R;
                                Context contextE = bVar5 != null ? bVar5.e() : null;
                                if (contextE != null) {
                                    context = contextE;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                                this.Y = (ActionBarContextView) viewStubCompat.a();
                            }
                        }
                    }
                    if (this.Y != null) {
                        o1 o1Var2 = this.f12853b0;
                        if (o1Var2 != null) {
                            o1Var2.b();
                        }
                        this.Y.e();
                        Context context2 = this.Y.getContext();
                        ActionBarContextView actionBarContextView = this.Y;
                        k.e eVar = new k.e();
                        eVar.f13885f = context2;
                        eVar.f13886j = actionBarContextView;
                        eVar.f13887m = c0Var;
                        l.o oVar = new l.o(actionBarContextView.getContext());
                        oVar.f14368l = 1;
                        eVar.f13890u = oVar;
                        oVar.f14361e = eVar;
                        if (c0Var.f12757b.c(eVar, oVar)) {
                            eVar.h();
                            this.Y.c(eVar);
                            this.X = eVar;
                            if (this.f12854c0 && (viewGroup = this.f12855d0) != null && viewGroup.isLaidOut()) {
                                this.Y.setAlpha(0.0f);
                                o1 o1VarA = c1.a(this.Y);
                                o1VarA.a(1.0f);
                                this.f12853b0 = o1VarA;
                                o1VarA.d(new b0(this, 1));
                            } else {
                                this.Y.setAlpha(1.0f);
                                this.Y.setVisibility(0);
                                if (this.Y.getParent() instanceof View) {
                                    View view = (View) this.Y.getParent();
                                    WeakHashMap weakHashMap = c1.f15515a;
                                    o0.o0.c(view);
                                }
                            }
                            if (this.Z != null) {
                                this.O.getDecorView().post(this.f12852a0);
                            }
                        } else {
                            this.X = null;
                        }
                    }
                }
                bVar = this.X;
                if (bVar != null && qVar != null) {
                    qVar.onSupportActionModeStarted(bVar);
                }
                K();
                this.X = this.X;
            } else {
                try {
                    bVarOnWindowStartingSupportActionMode = qVar.onWindowStartingSupportActionMode(c0Var);
                } catch (AbstractMethodError unused) {
                }
                if (bVarOnWindowStartingSupportActionMode == null) {
                }
                bVar = this.X;
                if (bVar != null) {
                    qVar.onSupportActionModeStarted(bVar);
                }
                K();
                this.X = this.X;
            }
        }
        K();
        return this.X;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x021a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x01ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(boolean z7, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        k0.i iVar;
        boolean z12;
        int i12;
        boolean z13;
        Field field;
        Map map;
        boolean z14;
        Field declaredField;
        Field field2;
        Object obj;
        Object obj2;
        Object obj3;
        if (this.f12871t0) {
            return false;
        }
        int i13 = this.f12873v0;
        if (i13 == -100) {
            i13 = x.f12920e;
        }
        int i14 = i13;
        Context context = this.N;
        int iE = E(context, i14);
        int i15 = Build.VERSION.SDK_INT;
        k0.i iVarP = i15 < 33 ? p(context) : null;
        if (!z10 && iVarP != null) {
            iVarP = A(context.getResources().getConfiguration());
        }
        Configuration configurationU = u(context, iE, iVarP, null, false);
        boolean z15 = this.f12876y0;
        Object obj4 = this.M;
        if (z15 || !(obj4 instanceof Activity)) {
            this.f12876y0 = true;
            i10 = this.f12875x0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i10 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj4.getClass()), i15 >= 29 ? 269221888 : i15 >= 24 ? 786432 : 0);
                    if (activityInfo != null) {
                        this.f12875x0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                    this.f12875x0 = 0;
                }
                this.f12876y0 = true;
                i10 = this.f12875x0;
            }
        }
        Configuration configuration = this.f12872u0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i16 = configuration.uiMode & 48;
        int i17 = configurationU.uiMode & 48;
        k0.i iVarA = A(configuration);
        k0.i iVarA2 = iVarP == null ? null : A(configurationU);
        int i18 = i16 != i17 ? 512 : 0;
        if (iVarA2 != null && !iVarA.equals(iVarA2)) {
            i18 |= 8196;
        }
        int i19 = 4;
        if (((~i10) & i18) != 0 && z7 && this.f12869r0 && ((M0 || this.f12870s0) && (obj4 instanceof Activity))) {
            Activity activity = (Activity) obj4;
            if (!activity.isChild()) {
                int i20 = Build.VERSION.SDK_INT;
                if (i20 >= 31 && (i18 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationU.getLayoutDirection());
                }
                int i21 = e0.h.f12378b;
                if (i20 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new androidx.activity.d(activity, i19));
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (z11 || i18 == 0) {
            i11 = i14;
            iVar = iVarA2;
            z12 = z11;
        } else {
            boolean z16 = (i10 & i18) == i18;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i17;
            if (iVarA2 != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    e0.d(configuration2, iVarA2);
                } else {
                    k0.k kVar = iVarA2.f13944a;
                    configuration2.setLocale(kVar.get(0));
                    configuration2.setLayoutDirection(kVar.get(0));
                }
            }
            resources.updateConfiguration(configuration2, null);
            int i22 = Build.VERSION.SDK_INT;
            if (i22 >= 26 || i22 >= 28) {
                i11 = i14;
                iVar = iVarA2;
                i12 = this.f12874w0;
                if (i12 == 0) {
                    context.setTheme(i12);
                    if (Build.VERSION.SDK_INT >= 23) {
                        context.getTheme().applyStyle(this.f12874w0, true);
                    }
                    if (z16 && (obj4 instanceof Activity)) {
                        Activity activity2 = (Activity) obj4;
                        if (!(activity2 instanceof androidx.lifecycle.t) ? !(!this.f12870s0 || this.f12871t0) : ((androidx.lifecycle.v) ((androidx.lifecycle.t) activity2).getLifecycle()).f1250c.compareTo(androidx.lifecycle.n.f1220f) >= 0) {
                            activity2.onConfigurationChanged(configuration2);
                        }
                    }
                    z12 = true;
                }
            } else if (i22 >= 24) {
                if (!fc.t.h) {
                    try {
                        Field declaredField2 = Resources.class.getDeclaredField("mResourcesImpl");
                        fc.t.g = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e11) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e11);
                    }
                    fc.t.h = true;
                }
                Field field3 = fc.t.g;
                if (field3 != null) {
                    try {
                        obj2 = field3.get(resources);
                    } catch (IllegalAccessException e12) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e12);
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        if (!fc.t.b) {
                            try {
                                Field declaredField3 = obj2.getClass().getDeclaredField("mDrawableCache");
                                fc.t.a = declaredField3;
                                declaredField3.setAccessible(true);
                            } catch (NoSuchFieldException e13) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e13);
                            }
                            fc.t.b = true;
                        }
                        Field field4 = fc.t.a;
                        if (field4 != null) {
                            try {
                                obj3 = field4.get(obj2);
                            } catch (IllegalAccessException e14) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e14);
                            }
                            if (obj3 != null) {
                                fc.t.q(obj3);
                            }
                        } else {
                            obj3 = null;
                            if (obj3 != null) {
                            }
                        }
                    }
                }
                i11 = i14;
                iVar = iVarA2;
                i12 = this.f12874w0;
                if (i12 == 0) {
                }
            } else {
                i11 = i14;
                iVar = iVarA2;
                if (i22 >= 23) {
                    if (!fc.t.b) {
                        try {
                            declaredField = Resources.class.getDeclaredField("mDrawableCache");
                            fc.t.a = declaredField;
                            z14 = true;
                        } catch (NoSuchFieldException e15) {
                            e = e15;
                            z14 = true;
                        }
                        try {
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e16) {
                            e = e16;
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
                            fc.t.b = z14;
                            field2 = fc.t.a;
                            if (field2 == null) {
                            }
                            if (z12) {
                            }
                            if (iVar != null) {
                            }
                            if (i11 == 0) {
                            }
                            if (i11 == 3) {
                            }
                            return z12;
                        }
                        fc.t.b = z14;
                    }
                    field2 = fc.t.a;
                    if (field2 == null) {
                        try {
                            obj = field2.get(resources);
                        } catch (IllegalAccessException e17) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e17);
                        }
                        if (obj != null) {
                            fc.t.q(obj);
                        }
                    } else {
                        obj = null;
                        if (obj != null) {
                        }
                    }
                } else {
                    if (!fc.t.b) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            fc.t.a = declaredField4;
                            z13 = true;
                            try {
                                declaredField4.setAccessible(true);
                            } catch (NoSuchFieldException e18) {
                                e = e18;
                                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
                                fc.t.b = z13;
                                field = fc.t.a;
                                if (field != null) {
                                }
                                i12 = this.f12874w0;
                                if (i12 == 0) {
                                }
                                if (z12) {
                                    if ((i18 & 512) != 0) {
                                    }
                                    if ((i18 & 4) != 0) {
                                    }
                                }
                                if (iVar != null) {
                                }
                                if (i11 == 0) {
                                }
                                if (i11 == 3) {
                                }
                                return z12;
                            }
                        } catch (NoSuchFieldException e19) {
                            e = e19;
                            z13 = true;
                        }
                        fc.t.b = z13;
                    }
                    field = fc.t.a;
                    if (field != null) {
                        try {
                            map = (Map) field.get(resources);
                        } catch (IllegalAccessException e20) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e20);
                            map = null;
                        }
                        if (map != null) {
                            map.clear();
                        }
                    }
                }
                i12 = this.f12874w0;
                if (i12 == 0) {
                }
            }
        }
        if (z12 && (obj4 instanceof p)) {
            if ((i18 & 512) != 0) {
                ((p) obj4).onNightModeChanged(iE);
            }
            if ((i18 & 4) != 0) {
                ((p) obj4).onLocalesChanged(iVarP);
            }
        }
        if (iVar != null) {
            k0.i iVarA3 = A(context.getResources().getConfiguration());
            if (Build.VERSION.SDK_INT >= 24) {
                e0.c(iVarA3);
            } else {
                Locale.setDefault(iVarA3.f13944a.get(0));
            }
        }
        if (i11 == 0) {
            z(context).g();
        } else {
            h0 h0Var = this.f12877z0;
            if (h0Var != null) {
                h0Var.a();
            }
        }
        if (i11 == 3) {
            if (this.A0 == null) {
                this.A0 = new h0(this, context);
            }
            this.A0.g();
        } else {
            h0 h0Var2 = this.A0;
            if (h0Var2 != null) {
                h0Var2.a();
            }
        }
        return z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.O != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof g0) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        g0 g0Var = new g0(this, callback);
        this.P = g0Var;
        window.setCallback(g0Var);
        int[] iArr = L0;
        Context context = this.N;
        e eVar = new e(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        Drawable drawableV = eVar.v(0);
        if (drawableV != null) {
            window.setBackgroundDrawable(drawableV);
        }
        eVar.L();
        this.O = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.I0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.J0) != null) {
            f0.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.J0 = null;
        }
        Object obj = this.M;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.I0 = f0.a(activity);
            } else {
                this.I0 = null;
            }
        }
        K();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        h1 h1VarE;
        View j0Var;
        r0 r0Var;
        if (this.H0 == null) {
            int[] iArr = f.a.f12633j;
            Context context2 = this.N;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                r0Var = new r0();
            } else {
                try {
                    this.H0 = (r0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    r0Var = new r0();
                }
            }
            this.H0 = r0Var;
        }
        r0 r0Var2 = this.H0;
        int i10 = t3.f14945a;
        r0Var2.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f12648y, 0, 0);
        char c10 = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context dVar = (resourceId == 0 || ((context instanceof k.d) && ((k.d) context).f13880a == resourceId)) ? context : new k.d(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (!str.equals("RatingBar")) {
                    c10 = 65535;
                    break;
                } else {
                    c10 = 0;
                    break;
                }
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c10 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c10 = 3;
                    break;
                }
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c10 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c10 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c10 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c10 = '\r';
                    break;
                }
                break;
        }
        View view2 = null;
        switch (c10) {
            case 0:
                j0Var = new m.j0(dVar, attributeSet);
                break;
            case QueueFuseable.SYNC /* 1 */:
                j0Var = new m.v(dVar, attributeSet);
                break;
            case 2:
                j0Var = new m.e0(dVar, attributeSet);
                break;
            case 3:
                h1VarE = r0Var2.e(dVar, attributeSet);
                r0Var2.g(h1VarE, str);
                j0Var = h1VarE;
                break;
            case 4:
                j0Var = new m.b0(dVar, attributeSet, 2130903653);
                break;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                j0Var = new m.l0(dVar, attributeSet);
                break;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                j0Var = new m.v0(dVar, attributeSet);
                break;
            case y4.g.NETWORK_ERROR /* 7 */:
                h1VarE = r0Var2.d(dVar, attributeSet);
                r0Var2.g(h1VarE, str);
                j0Var = h1VarE;
                break;
            case '\b':
                j0Var = new n1(dVar, attributeSet);
                break;
            case '\t':
                j0Var = new m.d0(dVar, attributeSet, 0);
                break;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                h1VarE = r0Var2.a(dVar, attributeSet);
                r0Var2.g(h1VarE, str);
                j0Var = h1VarE;
                break;
            case 11:
                h1VarE = r0Var2.c(dVar, attributeSet);
                r0Var2.g(h1VarE, str);
                j0Var = h1VarE;
                break;
            case '\f':
                j0Var = new m.z(dVar, attributeSet);
                break;
            case y4.g.ERROR /* 13 */:
                h1VarE = r0Var2.b(dVar, attributeSet);
                r0Var2.g(h1VarE, str);
                j0Var = h1VarE;
                break;
            default:
                j0Var = null;
                break;
        }
        if (j0Var == null && context != dVar) {
            Object[] objArr = r0Var2.f12897a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = dVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr = r0.f12895g;
                        if (i11 < 3) {
                            View viewF = r0Var2.f(dVar, str, strArr[i11]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i11++;
                            }
                        }
                    }
                } else {
                    View viewF2 = r0Var2.f(dVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            j0Var = view2;
        }
        if (j0Var != null) {
            Context context3 = j0Var.getContext();
            if ((context3 instanceof ContextWrapper) && j0Var.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, r0.f12891c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    j0Var.setOnClickListener(new q0(j0Var, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = dVar.obtainStyledAttributes(attributeSet, r0.f12892d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z7 = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = c1.f15515a;
                    new o0.l0(2131296900, 3).b(j0Var, Boolean.valueOf(z7));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = dVar.obtainStyledAttributes(attributeSet, r0.f12893e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    c1.s(j0Var, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = dVar.obtainStyledAttributes(attributeSet, r0.f12894f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z10 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = c1.f15515a;
                    new o0.l0(2131296905, 0).b(j0Var, Boolean.valueOf(z10));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return j0Var;
    }

    public final void q(int i10, l0 l0Var, l.o oVar) {
        if (oVar == null) {
            if (l0Var == null && i10 >= 0) {
                l0[] l0VarArr = this.f12866o0;
                if (i10 < l0VarArr.length) {
                    l0Var = l0VarArr[i10];
                }
            }
            if (l0Var != null) {
                oVar = l0Var.f12842h;
            }
        }
        if ((l0Var == null || l0Var.f12847m) && !this.f12871t0) {
            g0 g0Var = this.P;
            Window.Callback callback = this.O.getCallback();
            g0Var.getClass();
            try {
                g0Var.f12776m = true;
                callback.onPanelClosed(i10, oVar);
            } finally {
                g0Var.f12776m = false;
            }
        }
    }

    public final void r(l.o oVar) {
        m.o oVar2;
        if (this.f12865n0) {
            return;
        }
        this.f12865n0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.U;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((o3) actionBarOverlayLayout.f656m).f14873a.f723b;
        if (actionMenuView != null && (oVar2 = actionMenuView.W) != null) {
            oVar2.c();
            m.i iVar = oVar2.X;
            if (iVar != null && iVar.b()) {
                iVar.f14431j.dismiss();
            }
        }
        Window.Callback callback = this.O.getCallback();
        if (callback != null && !this.f12871t0) {
            callback.onPanelClosed(108, oVar);
        }
        this.f12865n0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.e() != false) goto L20;
     */
    @Override // l.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(l.o oVar) {
        ActionMenuView actionMenuView;
        m.o oVar2;
        p1 p1Var = this.U;
        if (p1Var != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) p1Var;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((o3) actionBarOverlayLayout.f656m).f14873a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f723b) != null && actionMenuView.V) {
                if (ViewConfiguration.get(this.N).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.U;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((o3) actionBarOverlayLayout2.f656m).f14873a.f723b;
                    if (actionMenuView2 != null) {
                        m.o oVar3 = actionMenuView2.W;
                        if (oVar3 != null) {
                            if (oVar3.Y == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.O.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.U;
                actionBarOverlayLayout3.k();
                if (((o3) actionBarOverlayLayout3.f656m).f14873a.p()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.U;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView3 = ((o3) actionBarOverlayLayout4.f656m).f14873a.f723b;
                    if (actionMenuView3 != null && (oVar2 = actionMenuView3.W) != null) {
                        oVar2.c();
                    }
                    if (this.f12871t0) {
                        return;
                    }
                    callback.onPanelClosed(108, B(0).f12842h);
                    return;
                }
                if (callback == null || this.f12871t0) {
                    return;
                }
                if (this.B0 && (1 & this.C0) != 0) {
                    View decorView = this.O.getDecorView();
                    y yVar = this.D0;
                    decorView.removeCallbacks(yVar);
                    yVar.run();
                }
                l0 l0VarB = B(0);
                l.o oVar4 = l0VarB.f12842h;
                if (oVar4 == null || l0VarB.f12849o || !callback.onPreparePanel(0, l0VarB.f12841g, oVar4)) {
                    return;
                }
                callback.onMenuOpened(108, l0VarB.f12842h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.U;
                actionBarOverlayLayout5.k();
                ((o3) actionBarOverlayLayout5.f656m).f14873a.v();
                return;
            }
        }
        l0 l0VarB2 = B(0);
        l0VarB2.f12848n = true;
        t(l0VarB2, false);
        G(l0VarB2, null);
    }

    public final void t(l0 l0Var, boolean z7) {
        k0 k0Var;
        p1 p1Var;
        if (z7 && l0Var.f12835a == 0 && (p1Var = this.U) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) p1Var;
            actionBarOverlayLayout.k();
            if (((o3) actionBarOverlayLayout.f656m).f14873a.p()) {
                r(l0Var.f12842h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.N.getSystemService("window");
        if (windowManager != null && l0Var.f12847m && (k0Var = l0Var.f12839e) != null) {
            windowManager.removeView(k0Var);
            if (z7) {
                q(l0Var.f12835a, l0Var, null);
            }
        }
        l0Var.f12845k = false;
        l0Var.f12846l = false;
        l0Var.f12847m = false;
        l0Var.f12840f = null;
        l0Var.f12848n = true;
        if (this.f12867p0 == l0Var) {
            this.f12867p0 = null;
        }
        if (l0Var.f12835a == 0) {
            K();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(KeyEvent keyEvent) {
        View decorView;
        boolean zV;
        ActionMenuView actionMenuView;
        m.o oVar;
        Object obj = this.M;
        if (((obj instanceof o0.m) || (obj instanceof o0)) && (decorView = this.O.getDecorView()) != null && com.bumptech.glide.d.o(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            g0 g0Var = this.P;
            Window.Callback callback = this.O.getCallback();
            g0Var.getClass();
            try {
                g0Var.f12775j = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                g0Var.f12775j = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f12868q0 = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                l0 l0VarB = B(0);
                if (l0VarB.f12847m) {
                    return true;
                }
                I(l0VarB, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.X != null) {
                    return true;
                }
                l0 l0VarB2 = B(0);
                p1 p1Var = this.U;
                Context context = this.N;
                if (p1Var != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) p1Var;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((o3) actionBarOverlayLayout.f656m).f14873a;
                    if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.f723b) == null || !actionMenuView.V || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        boolean z7 = l0VarB2.f12847m;
                        if (z7 || l0VarB2.f12846l) {
                            t(l0VarB2, true);
                            zV = z7;
                            if (!zV) {
                                return true;
                            }
                        } else {
                            if (!l0VarB2.f12845k) {
                                return true;
                            }
                            if (l0VarB2.f12849o) {
                                l0VarB2.f12845k = false;
                                if (!I(l0VarB2, keyEvent)) {
                                    return true;
                                }
                            }
                            G(l0VarB2, keyEvent);
                        }
                    } else {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.U;
                        actionBarOverlayLayout2.k();
                        if (((o3) actionBarOverlayLayout2.f656m).f14873a.p()) {
                            ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.U;
                            actionBarOverlayLayout3.k();
                            ActionMenuView actionMenuView2 = ((o3) actionBarOverlayLayout3.f656m).f14873a.f723b;
                            if (actionMenuView2 == null || (oVar = actionMenuView2.W) == null || !oVar.c()) {
                                return true;
                            }
                        } else {
                            if (this.f12871t0 || !I(l0VarB2, keyEvent)) {
                                return true;
                            }
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.U;
                            actionBarOverlayLayout4.k();
                            zV = ((o3) actionBarOverlayLayout4.f656m).f14873a.v();
                            if (!zV) {
                            }
                        }
                    }
                }
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else if (F()) {
            return true;
        }
        return false;
    }

    public final void w(int i10) {
        l0 l0VarB = B(i10);
        if (l0VarB.f12842h != null) {
            Bundle bundle = new Bundle();
            l0VarB.f12842h.t(bundle);
            if (bundle.size() > 0) {
                l0VarB.f12850p = bundle;
            }
            l0VarB.f12842h.w();
            l0VarB.f12842h.clear();
        }
        l0VarB.f12849o = true;
        l0VarB.f12848n = true;
        if ((i10 == 108 || i10 == 0) && this.U != null) {
            l0 l0VarB2 = B(0);
            l0VarB2.f12845k = false;
            I(l0VarB2, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        if (this.f12854c0) {
            return;
        }
        int[] iArr = f.a.f12633j;
        Context context = this.N;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            h(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            h(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            h(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            h(10);
        }
        this.f12863l0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        y();
        this.O.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f12864m0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(this.f12862k0 ? 2131492886 : 2131492885, (ViewGroup) null);
        } else if (this.f12863l0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(2131492876, (ViewGroup) null);
            this.f12861j0 = false;
            this.f12860i0 = false;
        } else if (this.f12860i0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130903054, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new k.d(context, typedValue.resourceId) : context).inflate(2131492887, (ViewGroup) null);
            p1 p1Var = (p1) viewGroup.findViewById(2131296474);
            this.U = p1Var;
            p1Var.setWindowCallback(this.O.getCallback());
            if (this.f12861j0) {
                ((ActionBarOverlayLayout) this.U).j(109);
            }
            if (this.f12858g0) {
                ((ActionBarOverlayLayout) this.U).j(2);
            }
            if (this.f12859h0) {
                ((ActionBarOverlayLayout) this.U).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f12860i0 + ", windowActionBarOverlay: " + this.f12861j0 + ", android:windowIsFloating: " + this.f12863l0 + ", windowActionModeOverlay: " + this.f12862k0 + ", windowNoTitle: " + this.f12864m0 + " }");
        }
        z zVar = new z(this);
        WeakHashMap weakHashMap = c1.f15515a;
        o0.q0.u(viewGroup, zVar);
        if (this.U == null) {
            this.f12856e0 = (TextView) viewGroup.findViewById(2131296955);
        }
        boolean z7 = w3.f14984a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e10) {
            e = e10;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e11) {
            e = e11;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131296325);
        ViewGroup viewGroup2 = (ViewGroup) this.O.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.O.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new a0(this));
        this.f12855d0 = viewGroup;
        Object obj = this.M;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.T;
        if (!TextUtils.isEmpty(title)) {
            p1 p1Var2 = this.U;
            if (p1Var2 != null) {
                p1Var2.setWindowTitle(title);
            } else {
                b bVar = this.R;
                if (bVar != null) {
                    bVar.t(title);
                } else {
                    TextView textView = this.f12856e0;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f12855d0.findViewById(R.id.content);
        View decorView = this.O.getDecorView();
        contentFrameLayout2.f681t.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f12854c0 = true;
        l0 l0VarB = B(0);
        if (this.f12871t0 || l0VarB.f12842h != null) {
            return;
        }
        D(108);
    }

    public final void y() {
        if (this.O == null) {
            Object obj = this.M;
            if (obj instanceof Activity) {
                o(((Activity) obj).getWindow());
            }
        }
        if (this.O == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final j0 z(Context context) {
        if (this.f12877z0 == null) {
            if (e.f12761m == null) {
                Context applicationContext = context.getApplicationContext();
                e.f12761m = new e(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f12877z0 = new h0(this, e.f12761m);
        }
        return this.f12877z0;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}