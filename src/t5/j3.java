package t5;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17439a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f17440b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17441c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17442d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f17443e;

    public j3(long j10, Bundle bundle, String str, String str2) {
        this.f17441c = str;
        this.f17442d = str2;
        this.f17443e = bundle;
        this.f17440b = j10;
    }

    public static j3 c(q qVar) {
        String str = qVar.f17558b;
        String str2 = qVar.f17560f;
        return new j3(qVar.f17561j, qVar.f17559e.h(), str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00eb: MOVE (r5 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]) (LINE:236), block:B:34:0x00eb */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.internal.measurement.l2 a(com.google.android.gms.internal.measurement.l2 l2Var, String str) throws Throwable {
        boolean z7;
        Cursor cursor;
        Cursor cursorRawQuery;
        Cursor cursor2;
        Pair pairCreate;
        Object obj;
        String strR = l2Var.r();
        com.google.android.gms.internal.measurement.b5 b5VarS = l2Var.s();
        b bVar = (b) this.f17443e;
        bVar.f17607e.M();
        Long l10 = (Long) n3.t(l2Var, "_eid");
        if (l10 != null) {
            if (strR.equals("_ep")) {
                bVar.f17607e.M();
                String str2 = (String) n3.t(l2Var, "_en");
                if (TextUtils.isEmpty(str2)) {
                    i3 i3Var = ((b4) bVar.f15046b).f17251w;
                    b4.i(i3Var);
                    i3Var.f17398t.b(l10, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((com.google.android.gms.internal.measurement.l2) this.f17441c) == null || ((Long) this.f17442d) == null || l10.longValue() != ((Long) this.f17442d).longValue()) {
                    k kVar = bVar.f17607e.f17666f;
                    w5.F(kVar);
                    Object obj2 = kVar.f15046b;
                    kVar.o();
                    kVar.p();
                    try {
                        try {
                            cursorRawQuery = kVar.I().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l10.toString()});
                            try {
                            } catch (SQLiteException e10) {
                                e = e10;
                                i3 i3Var2 = ((b4) obj2).f17251w;
                                b4.i(i3Var2);
                                i3Var2.f17397n.b(e, "Error selecting main event");
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                i3 i3Var3 = ((b4) bVar.f15046b).f17251w;
                                b4.i(i3Var3);
                                i3Var3.f17398t.c(str2, "Extra parameter without existing main event. eventName, eventId", l10);
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e11) {
                        e = e11;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            pairCreate = Pair.create((com.google.android.gms.internal.measurement.l2) ((com.google.android.gms.internal.measurement.k2) n3.I(com.google.android.gms.internal.measurement.l2.p(), cursorRawQuery.getBlob(0))).e(), Long.valueOf(cursorRawQuery.getLong(1)));
                            cursorRawQuery.close();
                        } catch (IOException e12) {
                            i3 i3Var4 = ((b4) obj2).f17251w;
                            b4.i(i3Var4);
                            i3Var4.f17397n.d("Failed to merge main event. appId, eventId", i3.y(str), l10, e12);
                        }
                        if (pairCreate != null || (obj = pairCreate.first) == null) {
                            i3 i3Var32 = ((b4) bVar.f15046b).f17251w;
                            b4.i(i3Var32);
                            i3Var32.f17398t.c(str2, "Extra parameter without existing main event. eventName, eventId", l10);
                            return null;
                        }
                        this.f17441c = (com.google.android.gms.internal.measurement.l2) obj;
                        this.f17440b = ((Long) pairCreate.second).longValue();
                        bVar.f17607e.M();
                        this.f17442d = (Long) n3.t((com.google.android.gms.internal.measurement.l2) this.f17441c, "_eid");
                    } else {
                        i3 i3Var5 = ((b4) obj2).f17251w;
                        b4.i(i3Var5);
                        i3Var5.Q.a("Main event not found");
                    }
                    cursorRawQuery.close();
                    pairCreate = null;
                    if (pairCreate != null) {
                    }
                    i3 i3Var322 = ((b4) bVar.f15046b).f17251w;
                    b4.i(i3Var322);
                    i3Var322.f17398t.c(str2, "Extra parameter without existing main event. eventName, eventId", l10);
                    return null;
                }
                long j10 = this.f17440b - 1;
                this.f17440b = j10;
                if (j10 <= 0) {
                    k kVar2 = bVar.f17607e.f17666f;
                    w5.F(kVar2);
                    kVar2.o();
                    b4 b4Var = (b4) kVar2.f15046b;
                    i3 i3Var6 = b4Var.f17251w;
                    b4.i(i3Var6);
                    i3Var6.Q.b(str, "Clearing complex main event info. appId");
                    try {
                        kVar2.I().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e13) {
                        i3 i3Var7 = b4Var.f17251w;
                        b4.i(i3Var7);
                        i3Var7.f17397n.b(e13, "Error clearing complex main event");
                    }
                } else {
                    k kVar3 = bVar.f17607e.f17666f;
                    w5.F(kVar3);
                    kVar3.y(str, l10, this.f17440b, (com.google.android.gms.internal.measurement.l2) this.f17441c);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.p2 p2Var : ((com.google.android.gms.internal.measurement.l2) this.f17441c).s()) {
                    bVar.f17607e.M();
                    if (n3.s(l2Var, p2Var.q()) == null) {
                        arrayList.add(p2Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    i3 i3Var8 = ((b4) bVar.f15046b).f17251w;
                    b4.i(i3Var8);
                    i3Var8.f17398t.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(b5VarS);
                    b5VarS = arrayList;
                }
                strR = str2;
            } else {
                this.f17442d = l10;
                this.f17441c = l2Var;
                bVar.f17607e.M();
                Object objT = n3.t(l2Var, "_epc");
                long jLongValue = ((Long) (objT != null ? objT : 0L)).longValue();
                this.f17440b = jLongValue;
                if (jLongValue <= 0) {
                    i3 i3Var9 = ((b4) bVar.f15046b).f17251w;
                    b4.i(i3Var9);
                    i3Var9.f17398t.b(strR, "Complex event with zero extra param count. eventName");
                } else {
                    k kVar4 = bVar.f17607e.f17666f;
                    w5.F(kVar4);
                    kVar4.y(str, l10, this.f17440b, l2Var);
                }
            }
        }
        com.google.android.gms.internal.measurement.k2 k2Var = (com.google.android.gms.internal.measurement.k2) l2Var.i();
        k2Var.m(strR);
        if (k2Var.f11035f) {
            k2Var.g();
            z7 = false;
            k2Var.f11035f = false;
        } else {
            z7 = false;
        }
        com.google.android.gms.internal.measurement.l2.w((com.google.android.gms.internal.measurement.l2) k2Var.f11034e);
        if (k2Var.f11035f) {
            k2Var.g();
            k2Var.f11035f = z7;
        }
        com.google.android.gms.internal.measurement.l2.v((com.google.android.gms.internal.measurement.l2) k2Var.f11034e, b5VarS);
        return (com.google.android.gms.internal.measurement.l2) k2Var.e();
    }

    public final q b() {
        return new q((String) this.f17441c, new p(new Bundle((Bundle) this.f17443e)), (String) this.f17442d, this.f17440b);
    }

    public final String toString() {
        switch (this.f17439a) {
            case 0:
                String str = (String) this.f17442d;
                String str2 = (String) this.f17441c;
                String string = ((Bundle) this.f17443e).toString();
                StringBuilder sbB = a0.h.B("origin=", str, ",name=", str2, ",params=");
                sbB.append(string);
                return sbB.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ j3(b bVar) {
        this.f17443e = bVar;
    }
}