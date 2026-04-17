package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f13879f;

    /* renamed from: a, reason: collision with root package name */
    public int f13880a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f13881b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f13882c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f13883d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f13884e;

    public d(Context context, int i10) {
        super(context);
        this.f13880a = i10;
    }

    public final void a(Configuration configuration) {
        if (this.f13884e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f13883d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f13883d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f13881b == null) {
            this.f13881b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f13881b.setTo(theme);
            }
        }
        this.f13881b.applyStyle(this.f13880a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        Resources resources;
        if (this.f13884e == null) {
            Configuration configuration = this.f13883d;
            if (configuration == null) {
                resources = super.getResources();
                this.f13884e = resources;
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f13879f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f13879f = configuration2;
                    }
                    if (configuration.equals(f13879f)) {
                    }
                    this.f13884e = resources;
                }
                resources = createConfigurationContext(this.f13883d).getResources();
                this.f13884e = resources;
            }
        }
        return this.f13884e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f13882c == null) {
            this.f13882c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f13882c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f13881b;
        if (theme != null) {
            return theme;
        }
        if (this.f13880a == 0) {
            this.f13880a = 2131952285;
        }
        b();
        return this.f13881b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f13880a != i10) {
            this.f13880a = i10;
            b();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f13881b = theme;
    }
}