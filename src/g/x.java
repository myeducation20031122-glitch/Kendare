package g;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class x {

    /* renamed from: b, reason: collision with root package name */
    public static final v f12919b = new v(new w(0));

    /* renamed from: e, reason: collision with root package name */
    public static final int f12920e = -100;

    /* renamed from: f, reason: collision with root package name */
    public static k0.i f12921f = null;

    /* renamed from: j, reason: collision with root package name */
    public static k0.i f12922j = null;

    /* renamed from: m, reason: collision with root package name */
    public static Boolean f12923m = null;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f12924n = false;

    /* renamed from: t, reason: collision with root package name */
    public static final t.c f12925t = new t.c(0);

    /* renamed from: u, reason: collision with root package name */
    public static final Object f12926u = new Object();

    /* renamed from: w, reason: collision with root package name */
    public static final Object f12927w = new Object();

    public static boolean c(Context context) {
        if (f12923m == null) {
            try {
                int i10 = t0.f12898b;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) t0.class), Build.VERSION.SDK_INT >= 24 ? s0.a() | 128 : 640).metaData;
                if (bundle != null) {
                    f12923m = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f12923m = Boolean.FALSE;
            }
        }
        return f12923m.booleanValue();
    }

    public static void g(x xVar) {
        synchronized (f12926u) {
            try {
                Iterator it = f12925t.iterator();
                while (it.hasNext()) {
                    x xVar2 = (x) ((WeakReference) it.next()).get();
                    if (xVar2 == xVar || xVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean h(int i10);

    public abstract void i(int i10);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);

    public abstract k.b m(k.a aVar);
}