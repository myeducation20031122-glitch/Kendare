package u2;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import g.v0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final int f18237e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f18238a;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f18239b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f18240c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18241d;

    static {
        f18237e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public i(Context context) {
        this.f18241d = f18237e;
        this.f18238a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f18239b = activityManager;
        this.f18240c = new v0(context.getResources().getDisplayMetrics(), 13);
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f18241d = 0.0f;
    }
}