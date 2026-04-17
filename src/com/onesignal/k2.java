package com.onesignal;

import android.database.Cursor;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k2 extends j {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l2 f11928f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m2 f11929j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(m2 m2Var, String str, l2 l2Var) {
        super(0);
        this.f11929j = m2Var;
        this.f11927e = str;
        this.f11928f = l2Var;
    }

    @Override // com.onesignal.j, java.lang.Runnable
    public final void run() throws JSONException, InterruptedException {
        boolean z7;
        super.run();
        String str = this.f11927e;
        m2 m2Var = this.f11929j;
        Cursor cursorH = m2Var.f11969h.h("notification", new String[]{"notification_id"}, "notification_id = ?", new String[]{str}, null);
        boolean zMoveToFirst = cursorH.moveToFirst();
        cursorH.close();
        if (zMoveToFirst) {
            m2Var.f11970i.getClass();
            l.d("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + str);
            z7 = true;
        } else {
            z7 = false;
        }
        this.f11928f.a(z7);
    }
}