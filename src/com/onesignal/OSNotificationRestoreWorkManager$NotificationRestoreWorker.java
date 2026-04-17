package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class OSNotificationRestoreWorkManager$NotificationRestoreWorker extends Worker {
    public OSNotificationRestoreWorkManager$NotificationRestoreWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final z1.n doWork() {
        Context applicationContext = getApplicationContext();
        if (z3.f12248b == null) {
            z3.y(applicationContext);
        }
        if (!OSUtils.a()) {
            return new z1.k();
        }
        if (s2.f12137c) {
            return new z1.k();
        }
        s2.f12137c = true;
        y3 y3Var = y3.f12232m;
        Cursor cursorJ = null;
        z3.b(y3Var, "Restoring notifications", null);
        f4 f4VarB = f4.b(applicationContext);
        StringBuilder sbK = f4.k();
        if (Build.VERSION.SDK_INT >= 23) {
            StatusBarNotification[] statusBarNotificationArrL = q3.l(applicationContext);
            if (statusBarNotificationArrL.length != 0) {
                ArrayList arrayList = new ArrayList();
                for (StatusBarNotification statusBarNotification : statusBarNotificationArrL) {
                    arrayList.add(Integer.valueOf(statusBarNotification.getId()));
                }
                sbK.append(" AND android_notification_id NOT IN (");
                sbK.append(TextUtils.join(",", arrayList));
                sbK.append(")");
            }
        }
        z3.b(y3Var, "Querying DB for notifications to restore: " + sbK.toString(), null);
        try {
            cursorJ = f4VarB.j("notification", s2.f12135a, sbK.toString(), null, "_id DESC", x0.f12219a);
            s2.b(applicationContext, cursorJ, 200);
            q3.Y(f4VarB, applicationContext);
        } catch (Throwable th) {
            try {
                z3.b(y3.f12230f, "Error restoring notification records! ", th);
                if (cursorJ != null && !cursorJ.isClosed()) {
                }
            } catch (Throwable th2) {
                if (cursorJ != null && !cursorJ.isClosed()) {
                    cursorJ.close();
                }
                throw th2;
            }
        }
        if (!cursorJ.isClosed()) {
            cursorJ.close();
        }
        return z1.n.a();
    }
}