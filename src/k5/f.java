package k5;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import x5.l;
import x5.s;
import z4.u0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements u4.a {

    /* renamed from: c, reason: collision with root package name */
    public static f f14015c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f14016a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f14017b;

    public f(Context context) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f14017b = Executors.newSingleThreadExecutor();
        this.f14016a = context;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new androidx.activity.i(this), 0L, 86400L, TimeUnit.SECONDS);
    }

    public static final void b(Context context) {
        if (context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new e("Failed to store the app set ID last used time.");
    }

    @Override // u4.a
    public final s a() {
        l lVar = new l();
        this.f14017b.execute(new u0(this, lVar, 2));
        return lVar.f19011a;
    }
}