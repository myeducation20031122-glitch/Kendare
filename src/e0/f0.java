package e0;

import android.app.Notification;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class f0 {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z7) {
        return builder.setAuthenticationRequired(z7);
    }

    public static Notification.Builder b(Notification.Builder builder, int i10) {
        return builder.setForegroundServiceBehavior(i10);
    }
}