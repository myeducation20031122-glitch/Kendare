package m;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.bw;
import com.google.android.gms.internal.ads.cd;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.e40;
import com.google.android.gms.internal.ads.e60;
import com.google.android.gms.internal.ads.fw;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.ads.iy;
import com.google.android.gms.internal.ads.jn0;
import com.google.android.gms.internal.ads.l40;
import com.google.android.gms.internal.ads.nk;
import com.google.android.gms.internal.ads.t00;
import com.google.android.gms.internal.ads.tr0;
import com.google.android.gms.internal.ads.v00;
import com.google.android.gms.internal.measurement.l9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s3 implements t00 {

    /* renamed from: b, reason: collision with root package name */
    public Object f14927b;

    /* renamed from: e, reason: collision with root package name */
    public Object f14928e;

    /* renamed from: f, reason: collision with root package name */
    public Object f14929f;

    /* renamed from: j, reason: collision with root package name */
    public Object f14930j;

    /* renamed from: m, reason: collision with root package name */
    public Object f14931m;

    /* renamed from: n, reason: collision with root package name */
    public Object f14932n;

    /* renamed from: t, reason: collision with root package name */
    public Object f14933t;

    public s3(int i10) {
        if (i10 != 5) {
            return;
        }
        this.f14932n = new t.k();
        this.f14933t = new t.k();
    }

    public static s3 e(Context context, r7.r rVar, String str, String str2, l9 l9Var) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strD = rVar.d();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        s3 s3Var = new s3();
        s3Var.f14927b = str;
        s3Var.f14928e = str2;
        s3Var.f14929f = strD;
        s3Var.f14930j = packageName;
        s3Var.f14931m = string;
        s3Var.f14932n = str3;
        s3Var.f14933t = l9Var;
        return s3Var;
    }

    public static final void h(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long jB = 0;
        for (int i10 = 0; i10 < size; i10++) {
            cd cdVar = (cd) arrayList.get(i10);
            if (cdVar.S() == 2 && cdVar.B() > jB) {
                jB = cdVar.B();
            }
        }
        if (jB != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jB));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final void a(String str, String str2) {
        Map map = (Map) this.f14932n;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public final k8.a b() {
        String strF = ((k8.c) this.f14928e) == null ? " registrationStatus" : "";
        if (((Long) this.f14931m) == null) {
            strF = strF.concat(" expiresInSecs");
        }
        if (((Long) this.f14932n) == null) {
            strF = a0.h.F(strF, " tokenCreationEpochInSecs");
        }
        if (strF.isEmpty()) {
            return new k8.a((String) this.f14927b, (k8.c) this.f14928e, (String) this.f14929f, (String) this.f14930j, ((Long) this.f14931m).longValue(), ((Long) this.f14932n).longValue(), (String) this.f14933t);
        }
        throw new IllegalStateException("Missing required properties:".concat(strF));
    }

    public final r3.h c() {
        String strF = ((String) this.f14927b) == null ? " transportName" : "";
        if (((r3.l) this.f14929f) == null) {
            strF = strF.concat(" encodedPayload");
        }
        if (((Long) this.f14930j) == null) {
            strF = a0.h.F(strF, " eventMillis");
        }
        if (((Long) this.f14931m) == null) {
            strF = a0.h.F(strF, " uptimeMillis");
        }
        if (((Map) this.f14932n) == null) {
            strF = a0.h.F(strF, " autoMetadata");
        }
        if (strF.isEmpty()) {
            return new r3.h((String) this.f14927b, (Integer) this.f14928e, (r3.l) this.f14929f, ((Long) this.f14930j).longValue(), ((Long) this.f14931m).longValue(), (Map) this.f14932n, (Integer) this.f14933t);
        }
        throw new IllegalStateException("Missing required properties:".concat(strF));
    }

    public final t7.c0 d() {
        String strConcat = ((String) this.f14927b) == null ? " identifier" : "";
        if (((String) this.f14928e) == null) {
            strConcat = strConcat.concat(" version");
        }
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        String str = (String) this.f14927b;
        String str2 = (String) this.f14928e;
        String str3 = (String) this.f14929f;
        ic1.v(this.f14930j);
        return new t7.c0(str, str2, str3, (String) this.f14931m, (String) this.f14932n, (String) this.f14933t);
    }

    public final void f(r3.l lVar) {
        if (lVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        this.f14929f = lVar;
    }

    public final void g(k8.c cVar) {
        if (cVar == null) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.f14928e = cVar;
    }

    public final bw i() {
        dq0.z1((e40) this.f14930j, e40.class);
        dq0.z1((v00) this.f14931m, v00.class);
        dq0.z1((e60) this.f14932n, e60.class);
        dq0.z1((iy) this.f14933t, iy.class);
        return new bw((fw) this.f14927b, (iy) this.f14933t, (e60) this.f14932n, new v6.e(7), new nk(), (e40) this.f14930j, (v00) this.f14931m, new v6.e(3), (bo0) this.f14928e, (jn0) this.f14929f);
    }

    public s3(l40 l40Var, WebView webView, String str, tr0 tr0Var) {
        this.f14929f = new ArrayList();
        this.f14930j = new HashMap();
        this.f14927b = l40Var;
        this.f14928e = webView;
        this.f14933t = tr0Var;
        this.f14932n = str;
        this.f14931m = "";
    }
}