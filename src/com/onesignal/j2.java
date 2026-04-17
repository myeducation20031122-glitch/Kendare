package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.lang.ref.WeakReference;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j2 extends j {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WeakReference f11909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11910f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m2 f11911j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(m2 m2Var, WeakReference weakReference, int i10) {
        super(0);
        this.f11911j = m2Var;
        this.f11909e = weakReference;
        this.f11910f = i10;
    }

    @Override // com.onesignal.j, java.lang.Runnable
    public final void run() throws JSONException, InterruptedException {
        super.run();
        Context context = (Context) this.f11909e.get();
        if (context == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("android_notification_id = ");
        int i10 = this.f11910f;
        String strF = kc.r.f(sb, i10, " AND opened = 0 AND dismissed = 0");
        ContentValues contentValues = new ContentValues();
        contentValues.put("dismissed", (Integer) 1);
        m2 m2Var = this.f11911j;
        if (m2Var.f11969h.m("notification", contentValues, strF, null) > 0) {
            f4 f4Var = m2Var.f11969h;
            Cursor cursorH = f4Var.h("notification", new String[]{"group_id"}, kc.r.d("android_notification_id = ", i10), null, null);
            if (cursorH.moveToFirst()) {
                String string = cursorH.getString(cursorH.getColumnIndex("group_id"));
                cursorH.close();
                if (string != null) {
                    try {
                        Cursor cursorC = q3.C(context, f4Var, string, true);
                        if (!cursorC.isClosed()) {
                            cursorC.close();
                        }
                    } catch (Throwable th) {
                        z3.b(y3.f12230f, "Error running updateSummaryNotificationAfterChildRemoved!", th);
                    }
                }
            } else {
                cursorH.close();
            }
        }
        q3.Y(m2Var.f11969h, context);
        ((NotificationManager) context.getSystemService("notification")).cancel(i10);
    }
}