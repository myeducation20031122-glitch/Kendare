package a6;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel b() {
        return new NotificationChannel("fcm_fallback_notification_channel", "Miscellaneous", 3);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel c(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannel d(String str, String str2, int i10) {
        return new NotificationChannel(str, str2, i10);
    }

    public static /* synthetic */ NotificationChannelGroup e(String str, String str2) {
        return new NotificationChannelGroup(str, str2);
    }

    public static /* synthetic */ JobWorkItem g(Intent intent) {
        return new JobWorkItem(intent);
    }
}