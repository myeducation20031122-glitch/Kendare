package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class s2 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f12135a = {"notification_id", "android_notification_id", "full_data", "created_time"};

    /* renamed from: b, reason: collision with root package name */
    public static final String f12136b = OSNotificationRestoreWorkManager$NotificationRestoreWorker.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f12137c;

    public static void a(Context context, boolean z7) {
        q3.s(context).q(f12136b, Collections.singletonList(new z1.q(OSNotificationRestoreWorkManager$NotificationRestoreWorker.class).b(z7 ? 15 : 0, TimeUnit.SECONDS).a()));
    }

    public static void b(Context context, Cursor cursor, int i10) throws InterruptedException {
        if (cursor.moveToFirst()) {
            do {
                t2.a(context, cursor.getString(cursor.getColumnIndex("notification_id")), cursor.getInt(cursor.getColumnIndex("android_notification_id")), cursor.getString(cursor.getColumnIndex("full_data")), cursor.getLong(cursor.getColumnIndex("created_time")), true);
                if (i10 > 0) {
                    try {
                        Thread.sleep(i10);
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    }
                }
            } while (cursor.moveToNext());
        }
    }
}