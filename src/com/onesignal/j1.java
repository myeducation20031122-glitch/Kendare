package com.onesignal;

import android.content.ContentValues;
import java.util.Date;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j1 extends j {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1 f11907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1 f11908f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(s1 s1Var, u1 u1Var) {
        super(0);
        this.f11908f = s1Var;
        this.f11907e = u1Var;
    }

    @Override // com.onesignal.j, java.lang.Runnable
    public final void run() throws JSONException, InterruptedException {
        super.run();
        e2 e2Var = this.f11908f.f12120l;
        u1 u1Var = this.f11907e;
        synchronized (e2Var) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_id", u1Var.f12171a);
            contentValues.put("display_quantity", Integer.valueOf(u1Var.f12175e.f12240b));
            contentValues.put("last_display", Long.valueOf(u1Var.f12175e.f12239a));
            contentValues.put("click_ids", u1Var.f12174d.toString());
            contentValues.put("displayed_in_session", Boolean.valueOf(u1Var.f12177g));
            if (e2Var.f11777a.m("in_app_message", contentValues, "message_id = ?", new String[]{u1Var.f12171a}) == 0) {
                e2Var.f11777a.e("in_app_message", contentValues);
            }
        }
        s1 s1Var = this.f11908f;
        e2 e2Var2 = s1Var.f12120l;
        Date date = s1Var.f12134z;
        e2Var2.getClass();
        String string = date != null ? date.toString() : null;
        String str = h4.f11856a;
        e2Var2.f11779c.getClass();
        h4.g(string, str, "PREFS_OS_LAST_TIME_IAM_DISMISSED");
    }
}