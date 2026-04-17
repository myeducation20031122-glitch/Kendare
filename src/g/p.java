package g;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import m.t3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class p extends androidx.fragment.app.d0 implements q, e0.s0 {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private x mDelegate;
    private Resources mResources;

    public p() {
        getSavedStateRegistry().c(DELEGATE_TAG, new n(this));
        addOnContextAvailableListener(new o(this));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        m0 m0Var = (m0) getDelegate();
        m0Var.x();
        ((ViewGroup) m0Var.f12855d0.findViewById(R.id.content)).addView(view, layoutParams);
        m0Var.P.a(m0Var.O.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        m0 m0Var = (m0) getDelegate();
        m0Var.f12869r0 = true;
        int i10 = m0Var.f12873v0;
        if (i10 == -100) {
            i10 = x.f12920e;
        }
        int iE = m0Var.E(context, i10);
        int i11 = 0;
        if (x.c(context) && x.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (x.f12927w) {
                    try {
                        k0.i iVar = x.f12921f;
                        if (iVar == null) {
                            if (x.f12922j == null) {
                                x.f12922j = k0.i.b(e0.k.b(context));
                            }
                            if (!x.f12922j.f13944a.isEmpty()) {
                                x.f12921f = x.f12922j;
                            }
                        } else if (!iVar.equals(x.f12922j)) {
                            k0.i iVar2 = x.f12921f;
                            x.f12922j = iVar2;
                            e0.k.a(context, iVar2.f13944a.a());
                        }
                    } finally {
                    }
                }
            } else if (!x.f12924n) {
                x.f12919b.execute(new r(context, i11));
            }
        }
        k0.i iVarP = m0.p(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(m0.u(context, iE, iVarP, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof k.d) {
            try {
                ((k.d) context).a(m0.u(context, iE, iVarP, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (m0.M0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f10 = configuration3.fontScale;
                    float f11 = configuration4.fontScale;
                    if (f10 != f11) {
                        configuration.fontScale = f11;
                    }
                    int i12 = configuration3.mcc;
                    int i13 = configuration4.mcc;
                    if (i12 != i13) {
                        configuration.mcc = i13;
                    }
                    int i14 = configuration3.mnc;
                    int i15 = configuration4.mnc;
                    if (i14 != i15) {
                        configuration.mnc = i15;
                    }
                    int i16 = Build.VERSION.SDK_INT;
                    if (i16 >= 24) {
                        e0.a(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i17 = configuration3.touchscreen;
                    int i18 = configuration4.touchscreen;
                    if (i17 != i18) {
                        configuration.touchscreen = i18;
                    }
                    int i19 = configuration3.keyboard;
                    int i20 = configuration4.keyboard;
                    if (i19 != i20) {
                        configuration.keyboard = i20;
                    }
                    int i21 = configuration3.keyboardHidden;
                    int i22 = configuration4.keyboardHidden;
                    if (i21 != i22) {
                        configuration.keyboardHidden = i22;
                    }
                    int i23 = configuration3.navigation;
                    int i24 = configuration4.navigation;
                    if (i23 != i24) {
                        configuration.navigation = i24;
                    }
                    int i25 = configuration3.navigationHidden;
                    int i26 = configuration4.navigationHidden;
                    if (i25 != i26) {
                        configuration.navigationHidden = i26;
                    }
                    int i27 = configuration3.orientation;
                    int i28 = configuration4.orientation;
                    if (i27 != i28) {
                        configuration.orientation = i28;
                    }
                    int i29 = configuration3.screenLayout & 15;
                    int i30 = configuration4.screenLayout & 15;
                    if (i29 != i30) {
                        configuration.screenLayout |= i30;
                    }
                    int i31 = configuration3.screenLayout & 192;
                    int i32 = configuration4.screenLayout & 192;
                    if (i31 != i32) {
                        configuration.screenLayout |= i32;
                    }
                    int i33 = configuration3.screenLayout & 48;
                    int i34 = configuration4.screenLayout & 48;
                    if (i33 != i34) {
                        configuration.screenLayout |= i34;
                    }
                    int i35 = configuration3.screenLayout & 768;
                    int i36 = configuration4.screenLayout & 768;
                    if (i35 != i36) {
                        configuration.screenLayout |= i36;
                    }
                    if (i16 >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode |= configuration4.colorMode & 3;
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode |= configuration4.colorMode & 12;
                        }
                    }
                    int i37 = configuration3.uiMode & 15;
                    int i38 = configuration4.uiMode & 15;
                    if (i37 != i38) {
                        configuration.uiMode |= i38;
                    }
                    int i39 = configuration3.uiMode & 48;
                    int i40 = configuration4.uiMode & 48;
                    if (i39 != i40) {
                        configuration.uiMode |= i40;
                    }
                    int i41 = configuration3.screenWidthDp;
                    int i42 = configuration4.screenWidthDp;
                    if (i41 != i42) {
                        configuration.screenWidthDp = i42;
                    }
                    int i43 = configuration3.screenHeightDp;
                    int i44 = configuration4.screenHeightDp;
                    if (i43 != i44) {
                        configuration.screenHeightDp = i44;
                    }
                    int i45 = configuration3.smallestScreenWidthDp;
                    int i46 = configuration4.smallestScreenWidthDp;
                    if (i45 != i46) {
                        configuration.smallestScreenWidthDp = i46;
                    }
                    int i47 = configuration3.densityDpi;
                    int i48 = configuration4.densityDpi;
                    if (i47 != i48) {
                        configuration.densityDpi = i48;
                    }
                }
            }
            Configuration configurationU = m0.u(context, iE, iVarP, configuration, true);
            k.d dVar = new k.d(context, 2131952284);
            dVar.a(configurationU);
            try {
                if (context.getTheme() != null) {
                    com.bumptech.glide.f.t(dVar.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = dVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        b supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // e0.o, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        b supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        m0 m0Var = (m0) getDelegate();
        m0Var.x();
        return (T) m0Var.O.findViewById(i10);
    }

    public final void g() {
        com.bumptech.glide.c.g(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        Intrinsics.f(decorView, "<this>");
        decorView.setTag(2131296997, this);
        com.bumptech.glide.e.L(getWindow().getDecorView(), this);
        g5.a.y(getWindow().getDecorView(), this);
    }

    public x getDelegate() {
        if (this.mDelegate == null) {
            v vVar = x.f12919b;
            this.mDelegate = new m0(this, null, this, this);
        }
        return this.mDelegate;
    }

    public c getDrawerToggleDelegate() {
        m0 m0Var = (m0) getDelegate();
        m0Var.getClass();
        return new z(m0Var);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        m0 m0Var = (m0) getDelegate();
        if (m0Var.S == null) {
            m0Var.C();
            b bVar = m0Var.R;
            m0Var.S = new k.i(bVar != null ? bVar.e() : m0Var.N);
        }
        return m0Var.S;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i10 = t3.f14945a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public b getSupportActionBar() {
        m0 m0Var = (m0) getDelegate();
        m0Var.C();
        return m0Var.R;
    }

    @Override // e0.s0
    public Intent getSupportParentActivityIntent() {
        return com.bumptech.glide.f.i(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().b();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m0 m0Var = (m0) getDelegate();
        if (m0Var.f12860i0 && m0Var.f12854c0) {
            m0Var.C();
            b bVar = m0Var.R;
            if (bVar != null) {
                bVar.g();
            }
        }
        m.x xVarA = m.x.a();
        Context context = m0Var.N;
        synchronized (xVarA) {
            xVarA.f14989a.k(context);
        }
        m0Var.f12872u0 = new Configuration(m0Var.N.getResources().getConfiguration());
        m0Var.n(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(e0.t0 t0Var) {
        t0Var.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = com.bumptech.glide.f.i(this);
        }
        if (supportParentActivityIntent == null) {
            return;
        }
        ComponentName component = supportParentActivityIntent.getComponent();
        Context context = t0Var.f12428e;
        if (component == null) {
            component = supportParentActivityIntent.resolveActivity(context.getPackageManager());
        }
        ArrayList arrayList = t0Var.f12427b;
        int size = arrayList.size();
        while (true) {
            try {
                Intent intentJ = com.bumptech.glide.f.j(context, component);
                if (intentJ == null) {
                    arrayList.add(supportParentActivityIntent);
                    return;
                } else {
                    arrayList.add(size, intentJ);
                    component = intentJ.getComponent();
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e10);
            }
        }
    }

    @Override // androidx.fragment.app.d0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    public void onLocalesChanged(k0.i iVar) {
    }

    @Override // androidx.fragment.app.d0, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        b supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    public void onNightModeChanged(int i10) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((m0) getDelegate()).x();
    }

    @Override // androidx.fragment.app.d0, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m0 m0Var = (m0) getDelegate();
        m0Var.C();
        b bVar = m0Var.R;
        if (bVar != null) {
            bVar.s(true);
        }
    }

    public void onPrepareSupportNavigateUpTaskStack(e0.t0 t0Var) {
    }

    @Override // androidx.fragment.app.d0, android.app.Activity
    public void onStart() {
        super.onStart();
        ((m0) getDelegate()).n(true, false);
    }

    @Override // androidx.fragment.app.d0, android.app.Activity
    public void onStop() {
        super.onStop();
        m0 m0Var = (m0) getDelegate();
        m0Var.C();
        b bVar = m0Var.R;
        if (bVar != null) {
            bVar.s(false);
        }
    }

    @Override // g.q
    public void onSupportActionModeFinished(k.b bVar) {
    }

    @Override // g.q
    public void onSupportActionModeStarted(k.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        e0.t0 t0Var = new e0.t0(this);
        onCreateSupportNavigateUpTaskStack(t0Var);
        onPrepareSupportNavigateUpTaskStack(t0Var);
        ArrayList arrayList = t0Var.f12427b;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Object obj = f0.f.f12651a;
        t0Var.f12428e.startActivities(intentArr, null);
        try {
            int i10 = e0.h.f12378b;
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().l(charSequence);
    }

    @Override // g.q
    public k.b onWindowStartingSupportActionMode(k.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        b supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        g();
        getDelegate().i(i10);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        m0 m0Var = (m0) getDelegate();
        if (m0Var.M instanceof Activity) {
            m0Var.C();
            b bVar = m0Var.R;
            if (bVar instanceof b1) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            m0Var.S = null;
            if (bVar != null) {
                bVar.h();
            }
            m0Var.R = null;
            if (toolbar != null) {
                Object obj = m0Var.M;
                w0 w0Var = new w0(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : m0Var.T, m0Var.P);
                m0Var.R = w0Var;
                m0Var.P.f12773e = w0Var.f12913c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                m0Var.P.f12773e = null;
            }
            m0Var.b();
        }
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z7) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z7) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z7) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        ((m0) getDelegate()).f12874w0 = i10;
    }

    public k.b startSupportActionMode(k.a aVar) {
        return getDelegate().m(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().b();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().h(i10);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        g();
        getDelegate().j(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        getDelegate().k(view, layoutParams);
    }
}