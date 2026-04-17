package com.onesignal;

import android.database.Cursor;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n1 extends j {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q3 f12010f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(q3 q3Var, int i10) {
        super(0);
        this.f12009e = i10;
        this.f12010f = q3Var;
    }

    private void b() throws JSONException, InterruptedException {
        super.run();
        synchronized (s1.A) {
            q3 q3Var = this.f12010f;
            ((s1) q3Var).f12128t = ((s1) q3Var).f12120l.c();
            l lVar = ((s1) this.f12010f).f12116h;
            String str = "Retrieved IAMs from DB redisplayedInAppMessages: " + ((s1) this.f12010f).f12128t.toString();
            lVar.getClass();
            l.d(str);
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [long] */
    @Override // com.onesignal.j, java.lang.Runnable
    public final void run() throws JSONException, InterruptedException {
        Cursor cursorH;
        String str;
        Set setF;
        String str2;
        Set setF2;
        Set setF3;
        switch (this.f12009e) {
            case 0:
                b();
                return;
            case QueueFuseable.SYNC /* 1 */:
                super.run();
                e2 e2Var = ((s1) this.f12010f).f12120l;
                synchronized (e2Var) {
                    String[] strArr = {"message_id", "click_ids"};
                    ?? CurrentTimeMillis = (System.currentTimeMillis() / 1000) - 15552000;
                    String[] strArr2 = {String.valueOf((long) CurrentTimeMillis)};
                    Set setQ = OSUtils.q();
                    Set setQ2 = OSUtils.q();
                    Cursor cursor = null;
                    try {
                        try {
                            cursorH = e2Var.f11777a.h("in_app_message", strArr, "last_display < ?", strArr2, null);
                        } catch (Throwable th) {
                            th = th;
                            cursor = CurrentTimeMillis;
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (JSONException e10) {
                        e = e10;
                        cursorH = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                    if (cursorH != null) {
                        try {
                        } catch (JSONException e11) {
                            e = e11;
                            e.printStackTrace();
                            if (cursorH != null && !cursorH.isClosed()) {
                                cursorH.close();
                            }
                            e2Var.f11777a.a("in_app_message", "last_display < ?", strArr2);
                            if (setQ != null) {
                                str2 = h4.f11856a;
                                setF2 = h4.f("PREFS_OS_DISPLAYED_IAMS", null);
                                setF3 = h4.f("PREFS_OS_IMPRESSIONED_IAMS", null);
                                if (setF2 != null) {
                                    setF2.removeAll(setQ);
                                    h4.g(setF2, str2, "PREFS_OS_DISPLAYED_IAMS");
                                }
                                if (setF3 != null) {
                                    setF3.removeAll(setQ);
                                    h4.g(setF3, str2, "PREFS_OS_IMPRESSIONED_IAMS");
                                }
                            }
                            if (setQ2 != null) {
                                str = h4.f11856a;
                                setF = h4.f("PREFS_OS_CLICKED_CLICK_IDS_IAMS", null);
                                if (setF != null) {
                                    setF.removeAll(setQ2);
                                    h4.g(setF, str, "PREFS_OS_CLICKED_CLICK_IDS_IAMS");
                                }
                            }
                            return;
                        }
                        if (cursorH.getCount() != 0) {
                            if (cursorH.moveToFirst()) {
                                do {
                                    String string = cursorH.getString(cursorH.getColumnIndex("message_id"));
                                    String string2 = cursorH.getString(cursorH.getColumnIndex("click_ids"));
                                    setQ.add(string);
                                    JSONArray jSONArray = new JSONArray(string2);
                                    HashSet hashSet = new HashSet();
                                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                        hashSet.add(jSONArray.getString(i10));
                                    }
                                    setQ2.addAll(hashSet);
                                } while (cursorH.moveToNext());
                            }
                            if (!cursorH.isClosed()) {
                                cursorH.close();
                            }
                            e2Var.f11777a.a("in_app_message", "last_display < ?", strArr2);
                            if (setQ != null && setQ.size() > 0) {
                                str2 = h4.f11856a;
                                setF2 = h4.f("PREFS_OS_DISPLAYED_IAMS", null);
                                setF3 = h4.f("PREFS_OS_IMPRESSIONED_IAMS", null);
                                if (setF2 != null && setF2.size() > 0) {
                                    setF2.removeAll(setQ);
                                    h4.g(setF2, str2, "PREFS_OS_DISPLAYED_IAMS");
                                }
                                if (setF3 != null && setF3.size() > 0) {
                                    setF3.removeAll(setQ);
                                    h4.g(setF3, str2, "PREFS_OS_IMPRESSIONED_IAMS");
                                }
                            }
                            if (setQ2 != null && setQ2.size() > 0) {
                                str = h4.f11856a;
                                setF = h4.f("PREFS_OS_CLICKED_CLICK_IDS_IAMS", null);
                                if (setF != null && setF.size() > 0) {
                                    setF.removeAll(setQ2);
                                    h4.g(setF, str, "PREFS_OS_CLICKED_CLICK_IDS_IAMS");
                                }
                            }
                        }
                    }
                    z3.b(y3.f12233n, "Attempted to clean 6 month old IAM data, but none exists!", null);
                    if (cursorH != null && !cursorH.isClosed()) {
                        cursorH.close();
                    }
                }
                return;
            default:
                super.run();
                z3.f12275u.getClass();
                ((m2) this.f12010f).f11969h.a("notification", "created_time < ?", new String[]{String.valueOf((System.currentTimeMillis() / 1000) - 604800)});
                return;
        }
    }
}