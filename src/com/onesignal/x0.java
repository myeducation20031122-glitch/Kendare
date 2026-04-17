package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.service.notification.StatusBarNotification;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12219a = Integer.toString(49);

    public static void a(Context context, int i10) {
        boolean zIsClosed;
        int count;
        f4 f4VarB = f4.b(context);
        Cursor cursorJ = null;
        try {
            cursorJ = f4VarB.j("notification", new String[]{"android_notification_id"}, f4.k().toString(), null, "_id", f12219a + i10);
            count = (cursorJ.getCount() - 49) + i10;
        } catch (Throwable th) {
            try {
                z3.b(y3.f12230f, "Error clearing oldest notifications over limit! ", th);
                if (cursorJ == null) {
                    return;
                } else {
                    if (zIsClosed) {
                        return;
                    }
                }
            } finally {
                if (cursorJ != null && !cursorJ.isClosed()) {
                    cursorJ.close();
                }
            }
        }
        if (count < 1) {
            if (cursorJ.isClosed()) {
                return;
            }
            cursorJ.close();
            return;
        }
        while (cursorJ.moveToNext()) {
            z3.I(cursorJ.getInt(cursorJ.getColumnIndex("android_notification_id")));
            count--;
            if (count <= 0) {
                break;
            }
        }
        if (cursorJ.isClosed()) {
        }
    }

    public static void b(Context context, int i10) {
        StatusBarNotification[] statusBarNotificationArrL = q3.l(context);
        int length = (statusBarNotificationArrL.length - 49) + i10;
        if (length < 1) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (StatusBarNotification statusBarNotification : statusBarNotificationArrL) {
            if ((statusBarNotification.getNotification().flags & 512) == 0) {
                treeMap.put(Long.valueOf(statusBarNotification.getNotification().when), Integer.valueOf(statusBarNotification.getId()));
            }
        }
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            z3.I(((Integer) ((Map.Entry) it.next()).getValue()).intValue());
            length--;
            if (length <= 0) {
                return;
            }
        }
    }
}