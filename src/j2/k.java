package j2;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13598a = z1.o.t("WakeLocks");

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f13599b = new WeakHashMap();

    public static PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strV = a0.h.v("WorkManager: ", str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strV);
        WeakHashMap weakHashMap = f13599b;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, strV);
        }
        return wakeLockNewWakeLock;
    }
}