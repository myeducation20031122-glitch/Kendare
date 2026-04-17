package com.onesignal;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final f4 f11777a;

    /* renamed from: b, reason: collision with root package name */
    public final l f11778b;

    /* renamed from: c, reason: collision with root package name */
    public final l f11779c;

    /* renamed from: d, reason: collision with root package name */
    public int f11780d = 0;

    public e2(f4 f4Var, l lVar, l lVar2) {
        this.f11777a = f4Var;
        this.f11778b = lVar;
        this.f11779c = lVar2;
    }

    public static void a(e2 e2Var, String str, String str2) {
        e2Var.getClass();
        e2Var.f11778b.getClass();
        l.d("Successful post for in-app message " + str + " request: " + str2);
    }

    public static void b(e2 e2Var, String str, int i10, String str2) {
        e2Var.getClass();
        StringBuilder sb = new StringBuilder("Encountered a ");
        sb.append(i10);
        sb.append(" error while attempting in-app message ");
        sb.append(str);
        String strG = kc.r.g(sb, " request: ", str2);
        e2Var.f11778b.getClass();
        l.e(strG);
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursorH = null;
        try {
            try {
                cursorH = this.f11777a.h("in_app_message", null, null, null, null);
                if (cursorH.moveToFirst()) {
                    do {
                        String string = cursorH.getString(cursorH.getColumnIndex("message_id"));
                        String string2 = cursorH.getString(cursorH.getColumnIndex("click_ids"));
                        int i10 = cursorH.getInt(cursorH.getColumnIndex("display_quantity"));
                        long j10 = cursorH.getLong(cursorH.getColumnIndex("last_display"));
                        boolean z7 = cursorH.getInt(cursorH.getColumnIndex("displayed_in_session")) == 1;
                        JSONArray jSONArray = new JSONArray(string2);
                        HashSet hashSet = new HashSet();
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            hashSet.add(jSONArray.getString(i11));
                        }
                        z1 z1Var = new z1();
                        z1Var.f12241c = 1;
                        z1Var.f12242d = 0L;
                        z1Var.f12243e = false;
                        z1Var.f12240b = i10;
                        z1Var.f12239a = j10;
                        u1 u1Var = new u1();
                        u1Var.f12171a = string;
                        u1Var.f12178h = false;
                        u1Var.f12174d = hashSet;
                        u1Var.f12177g = z7;
                        u1Var.f12175e = z1Var;
                        arrayList.add(u1Var);
                    } while (cursorH.moveToNext());
                }
            } catch (Throwable th) {
                if (0 != 0 && !cursorH.isClosed()) {
                    cursorH.close();
                }
                throw th;
            }
        } catch (JSONException e10) {
            z3.b(y3.f12230f, "Generating JSONArray from iam click ids:JSON Failed.", e10);
            if (cursorH != null && !cursorH.isClosed()) {
            }
        }
        if (!cursorH.isClosed()) {
            cursorH.close();
        }
        return arrayList;
    }
}