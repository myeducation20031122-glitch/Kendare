package t1;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.play_billing.j;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.m2;
import com.google.android.gms.internal.play_billing.m3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m.s3;
import m2.n;
import m2.r;
import m2.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class h implements k0.d, y3.b, x3.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17039b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17041f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f17042j;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i10) {
        this.f17039b = i10;
        this.f17040e = obj;
        this.f17041f = obj2;
        this.f17042j = obj3;
    }

    public final void a(m2.e eVar, ArrayList arrayList) {
        String str;
        Handler handler;
        t9.g gVar = (t9.g) this.f17040e;
        p9.a aVar = (p9.a) this.f17041f;
        ArrayList arrayList2 = (ArrayList) this.f17042j;
        Date date = t9.g.N;
        gVar.getClass();
        int i10 = eVar.f15097b;
        if (i10 == -2) {
            gVar.y(i10, null);
            str = String.format(Locale.US, "Feature not supported. Please update PlayStore app, %d", Integer.valueOf(i10));
        } else {
            if (i10 == 0) {
                if (aVar == null || (handler = gVar.M) == null) {
                    return;
                }
                handler.post(new g.u(13, aVar, arrayList));
                return;
            }
            gVar.y(i10, null);
            str = String.format(Locale.US, "Failed to retrieve info for %d products, %d", Integer.valueOf(arrayList2.size()), Integer.valueOf(i10));
        }
        Log.e("BillingProcessor", str);
        gVar.A(aVar, str);
    }

    @Override // x3.j
    public final Object apply(Object obj) {
        long jInsert;
        r3.l lVar;
        u3.c cVar;
        u3.c cVar2 = u3.c.CACHE_FULL;
        int i10 = this.f17039b;
        int i11 = 5;
        int i12 = 4;
        int i13 = 2;
        Object obj2 = this.f17042j;
        Object obj3 = this.f17041f;
        int i14 = 1;
        x3.l lVar2 = (x3.l) this.f17040e;
        switch (i10) {
            case 2:
                r3.h hVar = (r3.h) obj3;
                r3.i iVar = (r3.i) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                o3.c cVar3 = x3.l.f18936n;
                long jSimpleQueryForLong = lVar2.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * lVar2.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                x3.a aVar = lVar2.f18940j;
                if (jSimpleQueryForLong >= aVar.f18913a) {
                    lVar2.c(new w3.j(hVar.f16402a, 1L, cVar2));
                    return -1L;
                }
                Long lB = x3.l.b(sQLiteDatabase, iVar);
                if (lB != null) {
                    jInsert = lB.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.f16409a);
                    contentValues.put("priority", Integer.valueOf(a4.a.a(iVar.f16411c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar.f16410b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                byte[] bArr2 = hVar.f16404c.f16419b;
                int length = bArr2.length;
                int i15 = aVar.f18917e;
                boolean z7 = length <= i15;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", hVar.f16402a);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar.f16405d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar.f16406e));
                contentValues2.put("payload_encoding", hVar.f16404c.f16418a.f15695a);
                contentValues2.put("code", hVar.f16403b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z7));
                contentValues2.put("payload", z7 ? bArr2 : new byte[0]);
                contentValues2.put("product_id", hVar.f16408g);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z7) {
                    int iCeil = (int) Math.ceil(bArr2.length / i15);
                    for (int i16 = 1; i16 <= iCeil; i16++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i16 - 1) * i15, Math.min(i16 * i15, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i16));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hVar.f16407f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 3:
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                o3.c cVar4 = x3.l.f18936n;
                lVar2.getClass();
                sQLiteDatabase2.compileStatement((String) obj3).execute();
                x3.l.h(sQLiteDatabase2.rawQuery((String) obj2, null), new x3.h(lVar2, 2));
                sQLiteDatabase2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                return null;
            case 4:
                List list = (List) obj3;
                r3.i iVar2 = (r3.i) obj2;
                Cursor cursor = (Cursor) obj;
                o3.c cVar5 = x3.l.f18936n;
                lVar2.getClass();
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    boolean z10 = cursor.getInt(7) != 0;
                    s3 s3Var = new s3(3);
                    s3Var.f14932n = new HashMap();
                    String string = cursor.getString(i14);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    s3Var.f14927b = string;
                    s3Var.f14930j = Long.valueOf(cursor.getLong(2));
                    s3Var.f14931m = Long.valueOf(cursor.getLong(3));
                    if (z10) {
                        String string2 = cursor.getString(4);
                        lVar = new r3.l(string2 == null ? x3.l.f18936n : new o3.c(string2), cursor.getBlob(5));
                    } else {
                        String string3 = cursor.getString(4);
                        lVar = new r3.l(string3 == null ? x3.l.f18936n : new o3.c(string3), (byte[]) x3.l.h(lVar2.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new o0.h(17)));
                    }
                    s3Var.f(lVar);
                    if (!cursor.isNull(6)) {
                        s3Var.f14928e = Integer.valueOf(cursor.getInt(6));
                    }
                    if (!cursor.isNull(8)) {
                        s3Var.f14933t = Integer.valueOf(cursor.getInt(8));
                    }
                    list.add(new x3.b(j10, iVar2, s3Var.c()));
                    i14 = 1;
                }
                return null;
            default:
                Map map = (Map) obj3;
                n8.s sVar = (n8.s) obj2;
                Cursor cursor2 = (Cursor) obj;
                o3.c cVar6 = x3.l.f18936n;
                lVar2.getClass();
                while (cursor2.moveToNext()) {
                    String string4 = cursor2.getString(0);
                    int i17 = cursor2.getInt(1);
                    u3.c cVar7 = u3.c.REASON_UNKNOWN;
                    if (i17 != 0) {
                        if (i17 == 1) {
                            cVar7 = u3.c.MESSAGE_TOO_OLD;
                        } else if (i17 == i13) {
                            cVar = cVar2;
                        } else if (i17 == 3) {
                            cVar7 = u3.c.PAYLOAD_TOO_BIG;
                        } else if (i17 == i12) {
                            cVar7 = u3.c.MAX_RETRIES_REACHED;
                        } else if (i17 == i11) {
                            cVar7 = u3.c.INVALID_PAYLOD;
                        } else if (i17 == 6) {
                            cVar7 = u3.c.SERVER_ERROR;
                        } else {
                            o5.y.g(Integer.valueOf(i17), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                        cVar = cVar7;
                    } else {
                        cVar = cVar7;
                    }
                    long j11 = cursor2.getLong(i13);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new u3.d(j11, cVar));
                    i11 = 5;
                    i12 = 4;
                    i13 = 2;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i18 = u3.e.f18265c;
                    new ArrayList();
                    ((List) sVar.f15437f).add(new u3.e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jA = ((z3.c) lVar2.f18938e).a();
                SQLiteDatabase sQLiteDatabaseA = lVar2.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    u3.g gVar = (u3.g) x3.l.h(sQLiteDatabaseA.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new x3.i(i14, jA));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                    sVar.f15436e = gVar;
                    int i19 = u3.b.f18252b;
                    p8.c cVar8 = new p8.c(21);
                    cVar8.f16073e = new u3.f(lVar2.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * lVar2.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), x3.a.f18912f.f18913a);
                    sVar.f15438j = new u3.b((u3.f) cVar8.f16073e);
                    sVar.f15435b = (String) lVar2.f18941m.get();
                    return new u3.a((u3.g) sVar.f15436e, Collections.unmodifiableList((List) sVar.f15437f), (u3.b) sVar.f15438j, (String) sVar.f15435b);
                } catch (Throwable th) {
                    sQLiteDatabaseA.endTransaction();
                    throw th;
                }
        }
    }

    @Override // k0.d
    public final void b() {
        Runnable runnable = (Runnable) this.f17040e;
        t tVar = (t) this.f17042j;
        Runnable runnable2 = (Runnable) this.f17041f;
        if (runnable != null) {
            runnable.run();
        } else {
            tVar.cancel();
            runnable2.run();
        }
    }

    public final void c(m2.e eVar, List list) {
        Handler handler;
        t9.g gVar = (t9.g) this.f17040e;
        t9.a aVar = (t9.a) this.f17041f;
        t9.f fVar = (t9.f) this.f17042j;
        Date date = t9.g.N;
        gVar.getClass();
        if (eVar.f15097b != 0) {
            gVar.z(fVar);
            return;
        }
        aVar.s();
        HashMap map = aVar.f18058e;
        map.clear();
        aVar.p();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            String str = purchase.f2194a;
            if (!TextUtils.isEmpty(str)) {
                try {
                    String string = new JSONObject(str).getString("productId");
                    String str2 = purchase.f2195b;
                    aVar.s();
                    if (!map.containsKey(string)) {
                        map.put(string, new t9.i(str, str2));
                        aVar.p();
                    }
                } catch (Exception e10) {
                    gVar.y(100, e10);
                    Log.e("BillingProcessor", "Error in loadPurchasesByType", e10);
                    gVar.z(fVar);
                }
            }
        }
        if (fVar == null || (handler = gVar.M) == null) {
            return;
        }
        handler.post(new t9.c(fVar, 1));
    }

    public final void d(ArrayList arrayList) {
        final t9.g gVar = (t9.g) this.f17040e;
        final Activity activity = (Activity) this.f17041f;
        final String str = (String) this.f17042j;
        Date date = t9.g.N;
        gVar.getClass();
        if (arrayList == null || arrayList.isEmpty()) {
            Log.d("onSkuResponse: ", "product id mismatch with Product type");
            gVar.y(101, null);
        } else {
            final SkuDetails skuDetails = (SkuDetails) arrayList.get(0);
            final String strOptString = skuDetails.f2198b.optString("productId");
            gVar.M.post(new Runnable() { // from class: t9.b
                /* JADX WARN: Removed duplicated region for block: B:214:0x0533  */
                /* JADX WARN: Removed duplicated region for block: B:218:0x053e  */
                /* JADX WARN: Removed duplicated region for block: B:220:0x0542  */
                /* JADX WARN: Removed duplicated region for block: B:221:0x0545  */
                /* JADX WARN: Removed duplicated region for block: B:227:0x059c A[Catch: Exception -> 0x05ad, CancellationException -> 0x05af, TimeoutException -> 0x05b1, TRY_ENTER, TryCatch #4 {CancellationException -> 0x05af, TimeoutException -> 0x05b1, Exception -> 0x05ad, blocks: (B:227:0x059c, B:234:0x05b3, B:236:0x05c7, B:239:0x05e3, B:240:0x05f0), top: B:263:0x059a }] */
                /* JADX WARN: Removed duplicated region for block: B:234:0x05b3 A[Catch: Exception -> 0x05ad, CancellationException -> 0x05af, TimeoutException -> 0x05b1, TryCatch #4 {CancellationException -> 0x05af, TimeoutException -> 0x05b1, Exception -> 0x05ad, blocks: (B:227:0x059c, B:234:0x05b3, B:236:0x05c7, B:239:0x05e3, B:240:0x05f0), top: B:263:0x059a }] */
                /* JADX WARN: Removed duplicated region for block: B:249:0x0648  */
                /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:86:0x01d6 A[PHI: r25
                  0x01d6: PHI (r25v6 t9.g) = (r25v3 t9.g), (r25v7 t9.g) binds: [B:85:0x01d4, B:81:0x01cd] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    g gVar2;
                    String str2;
                    m2.e eVar;
                    m2.a aVar;
                    int i10;
                    int i11;
                    m2 m2VarA;
                    String str3;
                    String str4;
                    Activity activity2;
                    Future futureH;
                    int i12;
                    int i13;
                    boolean z7;
                    m2.d dVar;
                    m2.a aVar2;
                    String str5;
                    com.google.android.gms.internal.play_billing.f fVar;
                    SkuDetails skuDetails2;
                    boolean z10;
                    String str6;
                    String str7;
                    int i14;
                    i iVarP;
                    g gVar3 = gVar;
                    SkuDetails skuDetails3 = skuDetails;
                    String str8 = str;
                    Activity activity3 = activity;
                    String str9 = strOptString;
                    gVar3.getClass();
                    m2.c cVar = new m2.c();
                    cVar.f15084b = true;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(skuDetails3);
                    if (!TextUtils.isEmpty(str8) && (iVarP = g.p(str8, gVar3.f18073j)) != null) {
                        String str10 = iVarP.f18090j.f18085t;
                        m2.c cVar2 = new m2.c();
                        cVar2.f15086d = str10;
                        g0.d dVarA = cVar2.a();
                        cVar = new m2.c();
                        cVar.f15086d = (String) dVarA.f12951e;
                        cVar.f15085c = dVarA.f12950b;
                        cVar.f15087e = (String) dVarA.f12952f;
                    }
                    boolean z11 = !arrayList2.isEmpty();
                    if (!z11) {
                        throw new IllegalArgumentException("Details of the products must be provided.");
                    }
                    if (!z11) {
                        throw null;
                    }
                    if (arrayList2.contains(null)) {
                        throw new IllegalArgumentException("SKU cannot be null.");
                    }
                    if (arrayList2.size() > 1) {
                        SkuDetails skuDetails4 = (SkuDetails) arrayList2.get(0);
                        String strA = skuDetails4.a();
                        int size = arrayList2.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            SkuDetails skuDetails5 = (SkuDetails) arrayList2.get(i15);
                            if (!strA.equals("play_pass_subs") && !skuDetails5.a().equals("play_pass_subs") && !strA.equals(skuDetails5.a())) {
                                throw new IllegalArgumentException("SKUs should have the same type.");
                            }
                        }
                        String strOptString2 = skuDetails4.f2198b.optString("packageName");
                        int size2 = arrayList2.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            SkuDetails skuDetails6 = (SkuDetails) arrayList2.get(i16);
                            if (!strA.equals("play_pass_subs") && !skuDetails6.a().equals("play_pass_subs") && !strOptString2.equals(skuDetails6.f2198b.optString("packageName"))) {
                                throw new IllegalArgumentException("All SKUs must have the same package name.");
                            }
                        }
                    }
                    m2.d dVar2 = new m2.d(0);
                    dVar2.f15091d = z11 && !((SkuDetails) arrayList2.get(0)).f2198b.optString("packageName").isEmpty();
                    dVar2.f15089b = null;
                    dVar2.f15090c = null;
                    dVar2.f15093f = cVar.a();
                    dVar2.f15095h = new ArrayList(arrayList2);
                    dVar2.f15092e = false;
                    com.google.android.gms.internal.play_billing.d dVar3 = com.google.android.gms.internal.play_billing.f.f11147e;
                    dVar2.f15094g = j.f11176m;
                    m2.a aVar3 = gVar3.f18077u;
                    if (aVar3.f15057d == null || ((e0.g) aVar3.f15057d.f15156f) == null) {
                        gVar2 = gVar3;
                        str2 = str9;
                        eVar = t.f15150s;
                        aVar3.i(r.a(12, 2, eVar));
                    } else {
                        if (aVar3.a()) {
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.addAll((ArrayList) dVar2.f15095h);
                            com.google.android.gms.internal.play_billing.f fVar2 = (com.google.android.gms.internal.play_billing.f) dVar2.f15094g;
                            Iterator it = arrayList3.iterator();
                            SkuDetails skuDetails7 = (SkuDetails) (it.hasNext() ? it.next() : null);
                            Iterator<E> it2 = fVar2.iterator();
                            ic1.v(it2.hasNext() ? it2.next() : null);
                            skuDetails7.getClass();
                            String strOptString3 = skuDetails7.f2198b.optString("productId");
                            String strA2 = skuDetails7.a();
                            if (!strA2.equals("subs") || aVar3.f15062i) {
                                if (dVar2.f15089b == null && dVar2.f15090c == null) {
                                    g0.d dVar4 = (g0.d) dVar2.f15093f;
                                    gVar2 = gVar3;
                                    if (((String) dVar4.f12952f) == null && dVar4.f12950b == 0 && !dVar2.f15091d && !dVar2.f15092e) {
                                        if (arrayList3.size() > 1 && !aVar3.f15069p) {
                                            com.google.android.gms.internal.play_billing.r.e("BillingClient", "Current client doesn't support multi-item purchases.");
                                            eVar = t.f15146o;
                                            i14 = 19;
                                        } else if (fVar2.isEmpty() || aVar3.f15070q) {
                                            if (aVar3.f15064k) {
                                                boolean z12 = aVar3.f15065l;
                                                boolean z13 = aVar3.f15071r;
                                                str2 = str9;
                                                m2.f fVar3 = aVar3.f15074u;
                                                str3 = "BUY_INTENT";
                                                boolean z14 = fVar3.f15099a;
                                                boolean z15 = fVar3.f15100b;
                                                boolean z16 = aVar3.f15075v;
                                                String str11 = aVar3.f15055b;
                                                Bundle bundle = new Bundle();
                                                bundle.putString("playBillingLibraryVersion", str11);
                                                Object obj = dVar2.f15093f;
                                                if (((g0.d) obj).f12950b != 0) {
                                                    bundle.putInt("prorationMode", ((g0.d) obj).f12950b);
                                                }
                                                if (!TextUtils.isEmpty(dVar2.a())) {
                                                    bundle.putString("accountId", dVar2.a());
                                                }
                                                if (!TextUtils.isEmpty(dVar2.f15090c)) {
                                                    bundle.putString("obfuscatedProfileId", dVar2.f15090c);
                                                }
                                                if (dVar2.f15092e) {
                                                    bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
                                                }
                                                if (!TextUtils.isEmpty(null)) {
                                                    bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
                                                }
                                                if (!TextUtils.isEmpty((String) ((g0.d) dVar2.f15093f).f12951e)) {
                                                    bundle.putString("oldSkuPurchaseToken", (String) ((g0.d) dVar2.f15093f).f12951e);
                                                }
                                                if (!TextUtils.isEmpty(null)) {
                                                    bundle.putString("oldSkuPurchaseId", null);
                                                }
                                                if (!TextUtils.isEmpty((String) ((g0.d) dVar2.f15093f).f12952f)) {
                                                    bundle.putString("originalExternalTransactionId", (String) ((g0.d) dVar2.f15093f).f12952f);
                                                }
                                                if (!TextUtils.isEmpty(null)) {
                                                    bundle.putString("paymentsPurchaseParams", null);
                                                }
                                                if (z12 && z14) {
                                                    z7 = true;
                                                    bundle.putBoolean("enablePendingPurchases", true);
                                                } else {
                                                    z7 = true;
                                                }
                                                if (z13 && z15) {
                                                    bundle.putBoolean("enablePendingPurchaseForSubscriptions", z7);
                                                }
                                                if (z16) {
                                                    bundle.putBoolean("enableAlternativeBilling", z7);
                                                }
                                                String str12 = "additionalSkuTypes";
                                                String str13 = "additionalSkus";
                                                if (arrayList3.isEmpty()) {
                                                    dVar = dVar2;
                                                    activity2 = activity3;
                                                    aVar2 = aVar3;
                                                    str5 = "packageName";
                                                    fVar = fVar2;
                                                    skuDetails2 = skuDetails7;
                                                    z10 = true;
                                                    ArrayList<String> arrayList4 = new ArrayList<>(fVar.size() - 1);
                                                    ArrayList<String> arrayList5 = new ArrayList<>(fVar.size() - 1);
                                                    ArrayList<String> arrayList6 = new ArrayList<>();
                                                    ArrayList<String> arrayList7 = new ArrayList<>();
                                                    ArrayList<String> arrayList8 = new ArrayList<>();
                                                    if (fVar.size() > 0) {
                                                        ic1.v(fVar.get(0));
                                                        throw null;
                                                    }
                                                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList7);
                                                    if (!arrayList6.isEmpty()) {
                                                        bundle.putStringArrayList("skuDetailsTokens", arrayList6);
                                                    }
                                                    if (!arrayList8.isEmpty()) {
                                                        bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList8);
                                                    }
                                                    if (!arrayList4.isEmpty()) {
                                                        bundle.putStringArrayList("additionalSkus", arrayList4);
                                                        bundle.putStringArrayList("additionalSkuTypes", arrayList5);
                                                    }
                                                } else {
                                                    ArrayList<String> arrayList9 = new ArrayList<>();
                                                    ArrayList<String> arrayList10 = new ArrayList<>();
                                                    dVar = dVar2;
                                                    ArrayList<String> arrayList11 = new ArrayList<>();
                                                    activity2 = activity3;
                                                    ArrayList<Integer> arrayList12 = new ArrayList<>();
                                                    str5 = "packageName";
                                                    ArrayList<String> arrayList13 = new ArrayList<>();
                                                    Iterator it3 = arrayList3.iterator();
                                                    boolean z17 = false;
                                                    boolean z18 = false;
                                                    boolean z19 = false;
                                                    boolean z20 = false;
                                                    while (it3.hasNext()) {
                                                        SkuDetails skuDetails8 = skuDetails7;
                                                        SkuDetails skuDetails9 = (SkuDetails) it3.next();
                                                        m2.a aVar4 = aVar3;
                                                        com.google.android.gms.internal.play_billing.f fVar4 = fVar2;
                                                        if (!skuDetails9.f2198b.optString("skuDetailsToken").isEmpty()) {
                                                            arrayList9.add(skuDetails9.f2198b.optString("skuDetailsToken"));
                                                        }
                                                        JSONObject jSONObject = skuDetails9.f2198b;
                                                        String strOptString4 = jSONObject.optString("offerIdToken");
                                                        if (strOptString4.isEmpty()) {
                                                            strOptString4 = jSONObject.optString("offer_id_token");
                                                        }
                                                        String str14 = str12;
                                                        String strOptString5 = skuDetails9.f2198b.optString("offer_id");
                                                        String str15 = str13;
                                                        int iOptInt = skuDetails9.f2198b.optInt("offer_type");
                                                        String strOptString6 = skuDetails9.f2198b.optString("serializedDocid");
                                                        arrayList10.add(strOptString4);
                                                        z17 |= !TextUtils.isEmpty(strOptString4);
                                                        arrayList11.add(strOptString5);
                                                        z18 |= !TextUtils.isEmpty(strOptString5);
                                                        arrayList12.add(Integer.valueOf(iOptInt));
                                                        z19 |= iOptInt != 0;
                                                        z20 |= !TextUtils.isEmpty(strOptString6);
                                                        arrayList13.add(strOptString6);
                                                        aVar3 = aVar4;
                                                        skuDetails7 = skuDetails8;
                                                        fVar2 = fVar4;
                                                        str12 = str14;
                                                        str13 = str15;
                                                    }
                                                    String str16 = str12;
                                                    String str17 = str13;
                                                    aVar2 = aVar3;
                                                    fVar = fVar2;
                                                    skuDetails2 = skuDetails7;
                                                    if (!arrayList9.isEmpty()) {
                                                        bundle.putStringArrayList("skuDetailsTokens", arrayList9);
                                                    }
                                                    if (z17) {
                                                        bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList10);
                                                    }
                                                    if (z18) {
                                                        bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList11);
                                                    }
                                                    if (z19) {
                                                        bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList12);
                                                    }
                                                    if (z20) {
                                                        bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList13);
                                                    }
                                                    z10 = true;
                                                    if (arrayList3.size() > 1) {
                                                        ArrayList<String> arrayList14 = new ArrayList<>(arrayList3.size() - 1);
                                                        ArrayList<String> arrayList15 = new ArrayList<>(arrayList3.size() - 1);
                                                        for (int i17 = 1; i17 < arrayList3.size(); i17++) {
                                                            arrayList14.add(((SkuDetails) arrayList3.get(i17)).f2198b.optString("productId"));
                                                            arrayList15.add(((SkuDetails) arrayList3.get(i17)).a());
                                                        }
                                                        bundle.putStringArrayList(str17, arrayList14);
                                                        bundle.putStringArrayList(str16, arrayList15);
                                                    }
                                                }
                                                aVar = aVar2;
                                                if (!bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") || aVar.f15067n) {
                                                    SkuDetails skuDetails10 = skuDetails2;
                                                    String str18 = str5;
                                                    if (TextUtils.isEmpty(skuDetails10.f2198b.optString(str18))) {
                                                        str6 = null;
                                                        z10 = false;
                                                    } else {
                                                        bundle.putString("skuPackageName", skuDetails10.f2198b.optString(str18));
                                                        str6 = null;
                                                    }
                                                    if (!TextUtils.isEmpty(str6)) {
                                                        bundle.putString("accountName", str6);
                                                    }
                                                    Intent intent = activity2.getIntent();
                                                    if (intent == null) {
                                                        str4 = "BillingClient";
                                                        com.google.android.gms.internal.play_billing.r.e(str4, "Activity's intent is null.");
                                                    } else {
                                                        str4 = "BillingClient";
                                                        if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                                                            String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                                                            bundle.putString("proxyPackage", stringExtra);
                                                            try {
                                                                str7 = "proxyPackageVersion";
                                                                try {
                                                                    bundle.putString(str7, aVar.f15058e.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                                                                } catch (PackageManager.NameNotFoundException unused) {
                                                                    bundle.putString(str7, "package not found");
                                                                    if (aVar.f15070q) {
                                                                        if (aVar.f15068o) {
                                                                            futureH = aVar.h(new Callable((aVar.f15070q || fVar.isEmpty()) ? (aVar.f15068o || !z10) ? !aVar.f15065l ? 9 : 6 : 15 : 17, strOptString3, strA2, dVar, bundle) { // from class: m2.o

                                                                                /* renamed from: e, reason: collision with root package name */
                                                                                public final /* synthetic */ int f15121e;

                                                                                /* renamed from: f, reason: collision with root package name */
                                                                                public final /* synthetic */ String f15122f;

                                                                                /* renamed from: j, reason: collision with root package name */
                                                                                public final /* synthetic */ String f15123j;

                                                                                /* renamed from: m, reason: collision with root package name */
                                                                                public final /* synthetic */ Bundle f15124m;

                                                                                {
                                                                                    this.f15124m = bundle;
                                                                                }

                                                                                @Override // java.util.concurrent.Callable
                                                                                public final Object call() {
                                                                                    a aVar5 = this.f15120b;
                                                                                    int i18 = this.f15121e;
                                                                                    String str19 = this.f15122f;
                                                                                    String str20 = this.f15123j;
                                                                                    Bundle bundle2 = this.f15124m;
                                                                                    l3 l3Var = aVar5.f15060g;
                                                                                    String packageName = aVar5.f15058e.getPackageName();
                                                                                    j3 j3Var = (j3) l3Var;
                                                                                    Parcel parcelT = j3Var.T();
                                                                                    parcelT.writeInt(i18);
                                                                                    parcelT.writeString(packageName);
                                                                                    parcelT.writeString(str19);
                                                                                    parcelT.writeString(str20);
                                                                                    parcelT.writeString(null);
                                                                                    int i19 = m3.f11195a;
                                                                                    parcelT.writeInt(1);
                                                                                    bundle2.writeToParcel(parcelT, 0);
                                                                                    Parcel parcelP1 = j3Var.p1(parcelT, 8);
                                                                                    Bundle bundle3 = (Bundle) m3.a(parcelP1, Bundle.CREATOR);
                                                                                    parcelP1.recycle();
                                                                                    return bundle3;
                                                                                }
                                                                            }, 5000L, null, aVar.f15056c);
                                                                            i12 = 78;
                                                                            if (futureH != null) {
                                                                            }
                                                                        }
                                                                    }
                                                                    if (eVar.f15097b != 7) {
                                                                    }
                                                                }
                                                            } catch (PackageManager.NameNotFoundException unused2) {
                                                                str7 = "proxyPackageVersion";
                                                            }
                                                        }
                                                    }
                                                    futureH = aVar.h(new Callable((aVar.f15070q || fVar.isEmpty()) ? (aVar.f15068o || !z10) ? !aVar.f15065l ? 9 : 6 : 15 : 17, strOptString3, strA2, dVar, bundle) { // from class: m2.o

                                                        /* renamed from: e, reason: collision with root package name */
                                                        public final /* synthetic */ int f15121e;

                                                        /* renamed from: f, reason: collision with root package name */
                                                        public final /* synthetic */ String f15122f;

                                                        /* renamed from: j, reason: collision with root package name */
                                                        public final /* synthetic */ String f15123j;

                                                        /* renamed from: m, reason: collision with root package name */
                                                        public final /* synthetic */ Bundle f15124m;

                                                        {
                                                            this.f15124m = bundle;
                                                        }

                                                        @Override // java.util.concurrent.Callable
                                                        public final Object call() {
                                                            a aVar5 = this.f15120b;
                                                            int i18 = this.f15121e;
                                                            String str19 = this.f15122f;
                                                            String str20 = this.f15123j;
                                                            Bundle bundle2 = this.f15124m;
                                                            l3 l3Var = aVar5.f15060g;
                                                            String packageName = aVar5.f15058e.getPackageName();
                                                            j3 j3Var = (j3) l3Var;
                                                            Parcel parcelT = j3Var.T();
                                                            parcelT.writeInt(i18);
                                                            parcelT.writeString(packageName);
                                                            parcelT.writeString(str19);
                                                            parcelT.writeString(str20);
                                                            parcelT.writeString(null);
                                                            int i19 = m3.f11195a;
                                                            parcelT.writeInt(1);
                                                            bundle2.writeToParcel(parcelT, 0);
                                                            Parcel parcelP1 = j3Var.p1(parcelT, 8);
                                                            Bundle bundle3 = (Bundle) m3.a(parcelP1, Bundle.CREATOR);
                                                            parcelP1.recycle();
                                                            return bundle3;
                                                        }
                                                    }, 5000L, null, aVar.f15056c);
                                                    i12 = 78;
                                                } else {
                                                    eVar = t.f15147p;
                                                    i13 = 21;
                                                    m2VarA = r.a(i13, 2, eVar);
                                                    aVar.i(m2VarA);
                                                    aVar.e(eVar);
                                                }
                                            } else {
                                                str3 = "BUY_INTENT";
                                                str4 = "BillingClient";
                                                activity2 = activity3;
                                                str2 = str9;
                                                aVar = aVar3;
                                                futureH = aVar.h(new n(aVar, strOptString3, strA2, 2), 5000L, null, aVar.f15056c);
                                                i12 = 80;
                                            }
                                            try {
                                                if (futureH != null) {
                                                    eVar = t.f15143l;
                                                    aVar.i(r.a(25, 2, eVar));
                                                    aVar.e(eVar);
                                                } else {
                                                    Bundle bundle2 = (Bundle) futureH.get(5000L, TimeUnit.MILLISECONDS);
                                                    int iA = com.google.android.gms.internal.play_billing.r.a(str4, bundle2);
                                                    String strC = com.google.android.gms.internal.play_billing.r.c(str4, bundle2);
                                                    if (iA != 0) {
                                                        com.google.android.gms.internal.play_billing.r.e(str4, "Unable to buy item, Error response code: " + iA);
                                                        m2.e eVarA = t.a(iA, strC);
                                                        if (bundle2 != null) {
                                                            i12 = 23;
                                                        }
                                                        aVar.i(r.a(i12, 2, eVarA));
                                                        aVar.e(eVarA);
                                                        eVar = eVarA;
                                                    } else {
                                                        Activity activity4 = activity2;
                                                        Intent intent2 = new Intent(activity4, (Class<?>) ProxyBillingActivity.class);
                                                        String str19 = str3;
                                                        intent2.putExtra(str19, (PendingIntent) bundle2.getParcelable(str19));
                                                        activity4.startActivity(intent2);
                                                        eVar = t.f15142k;
                                                    }
                                                }
                                            } catch (CancellationException e10) {
                                                e = e10;
                                                com.google.android.gms.internal.play_billing.r.f(str4, "Time out while launching billing flow. Try to reconnect", e);
                                                eVar = t.f15144m;
                                                i11 = 4;
                                                i10 = 2;
                                                m2VarA = r.a(i11, i10, eVar);
                                                aVar.i(m2VarA);
                                                aVar.e(eVar);
                                                if (eVar.f15097b != 7) {
                                                }
                                            } catch (TimeoutException e11) {
                                                e = e11;
                                                com.google.android.gms.internal.play_billing.r.f(str4, "Time out while launching billing flow. Try to reconnect", e);
                                                eVar = t.f15144m;
                                                i11 = 4;
                                                i10 = 2;
                                                m2VarA = r.a(i11, i10, eVar);
                                                aVar.i(m2VarA);
                                                aVar.e(eVar);
                                                if (eVar.f15097b != 7) {
                                                }
                                            } catch (Exception e12) {
                                                com.google.android.gms.internal.play_billing.r.f(str4, "Exception while launching billing flow. Try to reconnect", e12);
                                                eVar = t.f15143l;
                                                i13 = 5;
                                            }
                                        } else {
                                            com.google.android.gms.internal.play_billing.r.e("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                                            eVar = t.f15148q;
                                            i14 = 20;
                                        }
                                        aVar3.i(r.a(i14, 2, eVar));
                                        aVar3.e(eVar);
                                        str2 = str9;
                                    }
                                } else {
                                    gVar2 = gVar3;
                                }
                                if (!aVar3.f15064k) {
                                    str2 = str9;
                                    aVar = aVar3;
                                    i10 = 2;
                                    com.google.android.gms.internal.play_billing.r.e("BillingClient", "Current client doesn't support extra params for buy intent.");
                                    eVar = t.f15139h;
                                    i11 = 18;
                                }
                                m2VarA = r.a(i11, i10, eVar);
                                aVar.i(m2VarA);
                                aVar.e(eVar);
                            } else {
                                com.google.android.gms.internal.play_billing.r.e("BillingClient", "Current client doesn't support subscriptions.");
                                eVar = t.f15145n;
                                aVar3.i(r.a(9, 2, eVar));
                            }
                        } else {
                            eVar = t.f15143l;
                            aVar3.i(r.a(2, 2, eVar));
                        }
                        aVar3.e(eVar);
                        gVar2 = gVar3;
                        str2 = str9;
                    }
                    if (eVar.f15097b != 7) {
                        gVar2.r(str2);
                    }
                }
            });
        }
    }

    @Override // y3.b
    public final Object execute() {
        v3.b bVar = (v3.b) this.f17040e;
        r3.i iVar = (r3.i) this.f17041f;
        r3.h hVar = (r3.h) this.f17042j;
        x3.l lVar = (x3.l) bVar.f18392d;
        lVar.getClass();
        int i10 = 2;
        Object[] objArr = {iVar.f16411c, hVar.f16402a, iVar.f16409a};
        String strM = o5.y.m("SQLiteEventStore");
        if (Log.isLoggable(strM, 3)) {
            Log.d(strM, String.format("Storing event with priority=%s, name=%s for destination %s", objArr));
        }
        ((Long) lVar.c(new h(lVar, hVar, iVar, i10))).longValue();
        ((w3.d) bVar.f18389a).a(iVar, 1, false);
        return null;
    }

    public /* synthetic */ h(t tVar, l0.a aVar) {
        this.f17039b = 0;
        this.f17040e = null;
        this.f17042j = tVar;
        this.f17041f = aVar;
    }
}