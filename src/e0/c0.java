package e0;

import android.app.Notification;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c0 {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Notification.Builder b(Notification.Builder builder, int i10) {
        return builder.setBadgeIconType(i10);
    }

    public static Notification.Builder c(Notification.Builder builder, boolean z7) {
        return builder.setColorized(z7);
    }

    public static Notification.Builder d(Notification.Builder builder, int i10) {
        return builder.setGroupAlertBehavior(i10);
    }

    public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    public static Notification.Builder f(Notification.Builder builder, String str) {
        return builder.setShortcutId(str);
    }

    public static Notification.Builder g(Notification.Builder builder, long j10) {
        return builder.setTimeoutAfter(j10);
    }
}