package com.onesignal;

import android.database.Cursor;
import com.google.android.gms.internal.measurement.l9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12214b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f12215e;

    public /* synthetic */ w2(p1 p1Var, int i10) {
        this.f12214b = i10;
        this.f12215e = p1Var;
    }

    private void a() {
        Thread.currentThread().setPriority(10);
        o5.d dVar = ((n8.s) this.f12215e.f12055e).e().f19801b;
        synchronized (dVar) {
            StringBuilder sb = new StringBuilder("NOT EXISTS(SELECT NULL FROM notification n WHERE n.notification_id = channel_influence_id AND channel_type = \"");
            Locale ROOT = Locale.ROOT;
            Intrinsics.e(ROOT, "ROOT");
            String lowerCase = "notification".toLowerCase(ROOT);
            Intrinsics.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            sb.append("\")");
            ((f4) ((e4) dVar.f15722f)).a("cached_unique_outcome", sb.toString(), null);
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws ClassNotFoundException {
        ArrayList arrayList;
        switch (this.f12214b) {
            case 0:
                a();
                return;
            default:
                Thread.currentThread().setPriority(10);
                o5.d dVar = ((n8.s) this.f12215e.f12055e).e().f19801b;
                synchronized (dVar) {
                    arrayList = new ArrayList();
                    Cursor cursor = null;
                    try {
                        Cursor cursorH = ((f4) ((e4) dVar.f15722f)).h("outcome", null, null, null, null);
                        try {
                            if (cursorH.moveToFirst()) {
                                do {
                                    x9.c cVarP = n7.c.p(cursorH.getString(cursorH.getColumnIndex("notification_influence_type")));
                                    x9.c cVarP2 = n7.c.p(cursorH.getString(cursorH.getColumnIndex("iam_influence_type")));
                                    String string = cursorH.getString(cursorH.getColumnIndex("notification_ids"));
                                    if (string == null) {
                                        string = "[]";
                                    }
                                    String string2 = cursorH.getString(cursorH.getColumnIndex("iam_ids"));
                                    if (string2 == null) {
                                        string2 = "[]";
                                    }
                                    String name = cursorH.getString(cursorH.getColumnIndex("name"));
                                    float f10 = cursorH.getFloat(cursorH.getColumnIndex("weight"));
                                    long j10 = cursorH.getLong(cursorH.getColumnIndex("timestamp"));
                                    try {
                                        l9 l9Var = new l9();
                                        l9 l9Var2 = new l9();
                                        aa.c cVarO = o5.d.o(cVarP, l9Var, l9Var2, string);
                                        o5.d.n(cVarP2, l9Var, l9Var2, string2, cVarO);
                                        if (cVarO == null) {
                                            cVarO = new aa.c(null, null);
                                        }
                                        aa.c cVar = cVarO;
                                        Intrinsics.e(name, "name");
                                        arrayList.add(new aa.b(name, cVar, f10, j10));
                                    } catch (JSONException e10) {
                                        ((l) dVar.f15721e).getClass();
                                        l.f("Generating JSONArray from notifications ids outcome:JSON Failed.", e10);
                                    }
                                } while (cursorH.moveToNext());
                            }
                            if (!cursorH.isClosed()) {
                                cursorH.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorH;
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    aa.b bVar = (aa.b) it.next();
                    p1 p1Var = this.f12215e;
                    p1Var.getClass();
                    int iB = OSUtils.b();
                    ((n8.s) p1Var.f12055e).e().a(z3.f12252d, iB, bVar, new b5(10, p1Var, bVar));
                }
                return;
        }
    }
}