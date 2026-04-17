package t5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.j7;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.u8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k extends t5 {

    /* renamed from: j, reason: collision with root package name */
    public final j f17461j;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.recyclerview.widget.i f17462m;

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f17457n = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: t, reason: collision with root package name */
    public static final String[] f17458t = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: u, reason: collision with root package name */
    public static final String[] f17459u = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f17460w = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] M = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] N = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] O = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] P = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    public k(w5 w5Var) {
        super(w5Var);
        this.f17462m = new androidx.recyclerview.widget.i(((b4) this.f15046b).Q);
        ((b4) this.f15046b).getClass();
        this.f17461j = new j(this, ((b4) this.f15046b).f17234b);
    }

    public static final void C(ContentValues contentValues, Object obj) {
        fc.t.g("value");
        fc.t.k(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final boolean A(z5 z5Var) {
        o();
        p();
        String str = z5Var.f17722a;
        String str2 = z5Var.f17724c;
        z5 z5VarN = N(str, str2);
        Object obj = this.f15046b;
        String str3 = z5Var.f17723b;
        if (z5VarN == null) {
            if (b6.c0(str2)) {
                if (D("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(((b4) obj).f17249t.s(str, a3.G), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jD = D("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3});
                ((b4) obj).getClass();
                if (jD >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(z5Var.f17725d));
        C(contentValues, z5Var.f17726e);
        try {
            if (I().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            i3 i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            i3Var.f17397n.b(i3.y(str), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e10) {
            i3 i3Var2 = ((b4) obj).f17251w;
            b4.i(i3Var2);
            i3Var2.f17397n.c(i3.y(str), "Error storing user property. appId", e10);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0220  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(long j10, long j11, o2.c cVar) throws Throwable {
        String string;
        char c10;
        char c11;
        String[] strArr;
        String str;
        Object obj = this.f15046b;
        ?? r42 = "select app_id, metadata_fingerprint from raw_events where ";
        o();
        p();
        ?? r52 = 0;
        String string2 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseI = I();
                try {
                    if (TextUtils.isEmpty(null)) {
                        Cursor cursorRawQuery = sQLiteDatabaseI.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j11 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j11 != -1 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)});
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string2 = cursorRawQuery.getString(0);
                            string = cursorRawQuery.getString(1);
                            cursorRawQuery.close();
                        }
                    } else {
                        Cursor cursorRawQuery2 = sQLiteDatabaseI.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j11 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j11 != -1 ? new String[]{null, String.valueOf(j11)} : new String[]{null});
                        if (!cursorRawQuery2.moveToFirst()) {
                            cursorRawQuery2.close();
                            return;
                        } else {
                            string = cursorRawQuery2.getString(0);
                            cursorRawQuery2.close();
                        }
                    }
                    Cursor cursorQuery = sQLiteDatabaseI.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, string}, null, null, "rowid", "2");
                    if (!cursorQuery.moveToFirst()) {
                        i3 i3Var = ((b4) obj).f17251w;
                        b4.i(i3Var);
                        i3Var.f17397n.b(i3.y(string2), "Raw event metadata record is missing. appId");
                        cursorQuery.close();
                        return;
                    }
                    try {
                        com.google.android.gms.internal.measurement.u2 u2Var = (com.google.android.gms.internal.measurement.u2) ((com.google.android.gms.internal.measurement.t2) n3.I(com.google.android.gms.internal.measurement.u2.u1(), cursorQuery.getBlob(0))).e();
                        if (cursorQuery.moveToNext()) {
                            i3 i3Var2 = ((b4) obj).f17251w;
                            b4.i(i3Var2);
                            i3Var2.f17400w.b(i3.y(string2), "Get multiple raw event metadata records, expected one. appId");
                        }
                        cursorQuery.close();
                        cVar.f15672f = u2Var;
                        if (j11 != -1) {
                            c11 = 1;
                            c10 = 2;
                            str = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                            strArr = new String[]{string2, string, String.valueOf(j11)};
                        } else {
                            c10 = 2;
                            c11 = 1;
                            strArr = new String[]{string2, string};
                            str = "app_id = ? and metadata_fingerprint = ?";
                        }
                        String[] strArr2 = new String[4];
                        strArr2[0] = "rowid";
                        strArr2[c11] = "name";
                        strArr2[c10] = "timestamp";
                        strArr2[3] = "data";
                        Cursor cursorQuery2 = sQLiteDatabaseI.query("raw_events", strArr2, str, strArr, null, null, "rowid", null);
                        if (!cursorQuery2.moveToFirst()) {
                            i3 i3Var3 = ((b4) obj).f17251w;
                            b4.i(i3Var3);
                            i3Var3.f17400w.b(i3.y(string2), "Raw event data disappeared while in transaction. appId");
                            cursorQuery2.close();
                            return;
                        }
                        do {
                            long j12 = cursorQuery2.getLong(0);
                            try {
                                com.google.android.gms.internal.measurement.k2 k2Var = (com.google.android.gms.internal.measurement.k2) n3.I(com.google.android.gms.internal.measurement.l2.p(), cursorQuery2.getBlob(3));
                                k2Var.m(cursorQuery2.getString(1));
                                long j13 = cursorQuery2.getLong(2);
                                if (k2Var.f11035f) {
                                    k2Var.g();
                                    k2Var.f11035f = false;
                                }
                                com.google.android.gms.internal.measurement.l2.z(j13, (com.google.android.gms.internal.measurement.l2) k2Var.f11034e);
                                if (!cVar.d(j12, (com.google.android.gms.internal.measurement.l2) k2Var.e())) {
                                    cursorQuery2.close();
                                    return;
                                }
                            } catch (IOException e10) {
                                i3 i3Var4 = ((b4) obj).f17251w;
                                b4.i(i3Var4);
                                i3Var4.f17397n.c(i3.y(string2), "Data loss. Failed to merge raw event. appId", e10);
                            }
                        } while (cursorQuery2.moveToNext());
                        cursorQuery2.close();
                    } catch (IOException e11) {
                        i3 i3Var5 = ((b4) obj).f17251w;
                        b4.i(i3Var5);
                        i3Var5.f17397n.c(i3.y(string2), "Data loss. Failed to merge raw event metadata. appId", e11);
                        cursorQuery.close();
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    i3 i3Var6 = ((b4) obj).f17251w;
                    b4.i(i3Var6);
                    i3Var6.f17397n.c(i3.y(null), "Data loss. Error selecting raw event. appId", e);
                    if (r42 != 0) {
                        r42.close();
                    }
                }
            } catch (Throwable th) {
                th = th;
                r52 = "select app_id, metadata_fingerprint from raw_events where ";
                if (r52 != 0) {
                    r52.close();
                }
                throw th;
            }
        } catch (SQLiteException e13) {
            e = e13;
            r42 = 0;
        } catch (Throwable th2) {
            th = th2;
            if (r52 != 0) {
            }
            throw th;
        }
    }

    public final long D(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = I().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                i3 i3Var = ((b4) this.f15046b).f17251w;
                b4.i(i3Var);
                i3Var.f17397n.c(str, "Database error", e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void E(String str, String str2) {
        fc.t.g(str);
        fc.t.g(str2);
        o();
        p();
        try {
            I().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            b4 b4Var = (b4) this.f15046b;
            i3 i3Var = b4Var.f17251w;
            b4.i(i3Var);
            i3Var.f17397n.d("Error deleting conditional property", i3.y(str), b4Var.P.f(str2), e10);
        }
    }

    public final long F(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = I().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j10;
                }
                long j11 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j11;
            } catch (SQLiteException e10) {
                i3 i3Var = ((b4) this.f15046b).f17251w;
                b4.i(i3Var);
                i3Var.f17397n.c(str, "Database error", e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final long G(String str) {
        long jF;
        Object obj = this.f15046b;
        fc.t.g(str);
        fc.t.g("first_open_count");
        o();
        p();
        SQLiteDatabase sQLiteDatabaseI = I();
        sQLiteDatabaseI.beginTransaction();
        long j10 = 0;
        try {
            try {
                jF = F("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (jF == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseI.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        i3 i3Var = ((b4) obj).f17251w;
                        b4.i(i3Var);
                        i3Var.f17397n.c(i3.y(str), "Failed to insert column (got -1). appId", "first_open_count");
                        return -1L;
                    }
                    jF = 0;
                }
            } catch (SQLiteException e10) {
                e = e10;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + jF));
                if (sQLiteDatabaseI.update("app2", contentValues2, "app_id = ?", new String[]{str}) != 0) {
                    sQLiteDatabaseI.setTransactionSuccessful();
                    return jF;
                }
                i3 i3Var2 = ((b4) obj).f17251w;
                b4.i(i3Var2);
                i3Var2.f17397n.c(i3.y(str), "Failed to update column (got 0). appId", "first_open_count");
                return -1L;
            } catch (SQLiteException e11) {
                e = e11;
                j10 = jF;
                i3 i3Var3 = ((b4) obj).f17251w;
                b4.i(i3Var3);
                i3Var3.f17397n.d("Error inserting column. appId", i3.y(str), "first_open_count", e);
                sQLiteDatabaseI.endTransaction();
                return j10;
            }
        } finally {
            sQLiteDatabaseI.endTransaction();
        }
    }

    public final long H(String str) {
        fc.t.g(str);
        return F("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final SQLiteDatabase I() {
        o();
        try {
            return this.f17461j.getWritableDatabase();
        } catch (SQLiteException e10) {
            i3 i3Var = ((b4) this.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.f17400w.b(e10, "Error opening database");
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x02a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i4 J(String str) {
        Cursor cursorQuery;
        Object obj = this.f15046b;
        fc.t.g(str);
        o();
        p();
        Cursor cursor = null;
        try {
            cursorQuery = I().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    try {
                        i4 i4Var = new i4(this.f17607e.O, str);
                        b4 b4Var = i4Var.f17401a;
                        i4Var.b(cursorQuery.getString(0));
                        i4Var.q(cursorQuery.getString(1));
                        i4Var.x(cursorQuery.getString(2));
                        i4Var.u(cursorQuery.getLong(3));
                        i4Var.v(cursorQuery.getLong(4));
                        i4Var.t(cursorQuery.getLong(5));
                        i4Var.d(cursorQuery.getString(6));
                        i4Var.c(cursorQuery.getString(7));
                        i4Var.r(cursorQuery.getLong(8));
                        i4Var.m(cursorQuery.getLong(9));
                        i4Var.w(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        i4Var.l(cursorQuery.getLong(11));
                        i4Var.j(cursorQuery.getLong(12));
                        i4Var.i(cursorQuery.getLong(13));
                        i4Var.g(cursorQuery.getLong(14));
                        i4Var.f(cursorQuery.getLong(15));
                        i4Var.o(cursorQuery.getLong(16));
                        i4Var.e(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        i4Var.p(cursorQuery.getString(18));
                        i4Var.h(cursorQuery.getLong(19));
                        i4Var.k(cursorQuery.getLong(20));
                        i4Var.s(cursorQuery.getString(21));
                        boolean z7 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        a4 a4Var = b4Var.M;
                        b4.i(a4Var);
                        a4Var.o();
                        i4Var.C |= i4Var.f17416p != z7;
                        i4Var.f17416p = z7;
                        i4Var.a(cursorQuery.getString(24));
                        i4Var.n(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            i4Var.y(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        u8.a();
                        if (((b4) obj).f17249t.y(null, a3.f17202t0)) {
                            String string = cursorQuery.getString(28);
                            a4 a4Var2 = b4Var.M;
                            b4.i(a4Var2);
                            a4Var2.o();
                            i4Var.C |= !j4.V(i4Var.f17421u, string);
                            i4Var.f17421u = string;
                        }
                        a4 a4Var3 = b4Var.M;
                        b4.i(a4Var3);
                        a4Var3.o();
                        i4Var.C = false;
                        if (cursorQuery.moveToNext()) {
                            i3 i3Var = ((b4) obj).f17251w;
                            b4.i(i3Var);
                            i3Var.f17397n.b(i3.y(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return i4Var;
                    } catch (SQLiteException e10) {
                        e = e10;
                        i3 i3Var2 = ((b4) obj).f17251w;
                        b4.i(i3Var2);
                        i3Var2.f17397n.c(i3.y(str), "Error querying app. appId", e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e11) {
                e = e11;
            }
        } catch (SQLiteException e12) {
            e = e12;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c K(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        w5 w5Var = this.f17607e;
        Object obj = this.f15046b;
        fc.t.g(str);
        fc.t.g(str2);
        o();
        p();
        Cursor cursor = null;
        try {
            cursorQuery = I().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object objO = O(cursorQuery, 1);
                    boolean z7 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j10 = cursorQuery.getLong(4);
                    n3 n3Var = w5Var.f17673t;
                    n3 n3Var2 = w5Var.f17673t;
                    w5.F(n3Var);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<q> creator = q.CREATOR;
                    q qVar = (q) n3Var.G(blob, creator);
                    long j11 = cursorQuery.getLong(6);
                    w5.F(n3Var2);
                    q qVar2 = (q) n3Var2.G(cursorQuery.getBlob(7), creator);
                    long j12 = cursorQuery.getLong(8);
                    long j13 = cursorQuery.getLong(9);
                    w5.F(n3Var2);
                    c cVar = new c(str, str3, new y5(j12, objO, str2, str3), j11, z7, string2, qVar, j10, qVar2, j13, (q) n3Var2.G(cursorQuery.getBlob(10), creator));
                    if (cursorQuery.moveToNext()) {
                        i3 i3Var = ((b4) obj).f17251w;
                        b4.i(i3Var);
                        i3Var.f17397n.c(i3.y(str), "Got multiple records for conditional property, expected one", ((b4) obj).P.f(str2));
                    }
                    cursorQuery.close();
                    return cVar;
                } catch (SQLiteException e10) {
                    e = e10;
                    i3 i3Var2 = ((b4) obj).f17251w;
                    b4.i(i3Var2);
                    i3Var2.f17397n.d("Error querying conditional property", i3.y(str), ((b4) obj).P.f(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
    }

    public final i L(long j10, String str, long j11, boolean z7, boolean z10, boolean z11, boolean z12, boolean z13) throws Throwable {
        SQLiteDatabase sQLiteDatabaseI;
        Cursor cursorQuery;
        Object obj = this.f15046b;
        fc.t.g(str);
        o();
        p();
        String[] strArr = {str};
        i iVar = new i();
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabaseI = I();
                cursorQuery = sQLiteDatabaseI.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            } catch (Throwable th) {
                th = th;
            }
        } catch (SQLiteException e10) {
            e = e10;
        }
        try {
            if (!cursorQuery.moveToFirst()) {
                i3 i3Var = ((b4) obj).f17251w;
                b4.i(i3Var);
                i3Var.f17400w.b(i3.y(str), "Not updating daily counts, app is not known. appId");
                cursorQuery.close();
                return iVar;
            }
            if (cursorQuery.getLong(0) == j10) {
                iVar.f17387b = cursorQuery.getLong(1);
                iVar.f17386a = cursorQuery.getLong(2);
                iVar.f17388c = cursorQuery.getLong(3);
                iVar.f17389d = cursorQuery.getLong(4);
                iVar.f17390e = cursorQuery.getLong(5);
            }
            if (z7) {
                iVar.f17387b += j11;
            }
            if (z10) {
                iVar.f17386a += j11;
            }
            if (z11) {
                iVar.f17388c += j11;
            }
            if (z12) {
                iVar.f17389d += j11;
            }
            if (z13) {
                iVar.f17390e += j11;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j10));
            contentValues.put("daily_public_events_count", Long.valueOf(iVar.f17386a));
            contentValues.put("daily_events_count", Long.valueOf(iVar.f17387b));
            contentValues.put("daily_conversions_count", Long.valueOf(iVar.f17388c));
            contentValues.put("daily_error_events_count", Long.valueOf(iVar.f17389d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(iVar.f17390e));
            sQLiteDatabaseI.update("apps", contentValues, "app_id=?", strArr);
            cursorQuery.close();
            return iVar;
        } catch (SQLiteException e11) {
            e = e11;
            cursor = cursorQuery;
            i3 i3Var2 = ((b4) obj).f17251w;
            b4.i(i3Var2);
            i3Var2.f17397n.c(i3.y(str), "Error updating daily counts. appId", e);
            if (cursor != null) {
                cursor.close();
            }
            return iVar;
        } catch (Throwable th2) {
            th = th2;
            cursor = cursorQuery;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o M(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        Object obj = this.f15046b;
        fc.t.g(str);
        fc.t.g(str2);
        o();
        p();
        Cursor cursor = null;
        try {
            cursorQuery = I().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j10 = cursorQuery.getLong(0);
                    long j11 = cursorQuery.getLong(1);
                    long j12 = cursorQuery.getLong(2);
                    long j13 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                    Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                    Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                    Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                    if (cursorQuery.isNull(7)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                    }
                    o oVar = new o(str, str2, j10, j11, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j12, j13, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursorQuery.moveToNext()) {
                        i3 i3Var = ((b4) obj).f17251w;
                        b4.i(i3Var);
                        i3Var.f17397n.b(i3.y(str), "Got multiple records for event aggregates, expected one. appId");
                    }
                    cursorQuery.close();
                    return oVar;
                } catch (SQLiteException e10) {
                    e = e10;
                    i3 i3Var2 = ((b4) obj).f17251w;
                    b4.i(i3Var2);
                    i3Var2.f17397n.d("Error querying events. appId", i3.y(str), ((b4) obj).P.d(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z5 N(String str, String str2) {
        Cursor cursorQuery;
        Object obj = this.f15046b;
        fc.t.g(str);
        fc.t.g(str2);
        o();
        p();
        Cursor cursor = null;
        try {
            cursorQuery = I().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j10 = cursorQuery.getLong(0);
                    Object objO = O(cursorQuery, 1);
                    if (objO == null) {
                        cursorQuery.close();
                        return null;
                    }
                    z5 z5Var = new z5(str, cursorQuery.getString(2), str2, j10, objO);
                    if (cursorQuery.moveToNext()) {
                        i3 i3Var = ((b4) obj).f17251w;
                        b4.i(i3Var);
                        i3Var.f17397n.b(i3.y(str), "Got multiple records for user property, expected one. appId");
                    }
                    cursorQuery.close();
                    return z5Var;
                } catch (SQLiteException e10) {
                    e = e10;
                    i3 i3Var2 = ((b4) obj).f17251w;
                    b4.i(i3Var2);
                    i3Var2.f17397n.d("Error querying user property. appId", i3.y(str), ((b4) obj).P.f(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
    }

    public final Object O(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        Object obj = this.f15046b;
        if (type == 0) {
            i3 i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            i3Var.f17397n.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type == 4) {
            i3 i3Var2 = ((b4) obj).f17251w;
            b4.i(i3Var2);
            i3Var2.f17397n.a("Loaded invalid blob type value, ignoring it");
            return null;
        }
        i3 i3Var3 = ((b4) obj).f17251w;
        b4.i(i3Var3);
        i3Var3.f17397n.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String P() throws Throwable {
        SQLiteException e10;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseI = I();
        ?? r12 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseI.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return null;
                    }
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                } catch (SQLiteException e11) {
                    e10 = e11;
                    i3 i3Var = ((b4) this.f15046b).f17251w;
                    b4.i(i3Var);
                    i3Var.f17397n.b(e10, "Database error getting next bundle app id");
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                r12 = sQLiteDatabaseI;
                th = th;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r12 != 0) {
            }
            throw th;
        }
    }

    public final List Q(String str, String str2, String str3) {
        fc.t.g(str);
        o();
        p();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return R(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0095, code lost:
    
        r0 = ((t5.b4) r2).f17251w;
        t5.b4.i(r0);
        r0 = r0.f17397n;
        ((t5.b4) r2).getClass();
        r0.b(java.lang.Integer.valueOf(com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS), "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List R(String str, String[] strArr) throws Throwable {
        Cursor cursor;
        w5 w5Var = this.f17607e;
        Object obj = this.f15046b;
        o();
        p();
        ArrayList arrayList = new ArrayList();
        try {
            ((b4) obj).getClass();
            int i10 = 2;
            Cursor cursorQuery = I().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (true) {
                    int size = arrayList.size();
                    ((b4) obj).getClass();
                    if (size >= 1000) {
                        break;
                    }
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(i10);
                    Object objO = O(cursorQuery, 3);
                    boolean z7 = cursorQuery.getInt(4) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j10 = cursorQuery.getLong(6);
                    n3 n3Var = w5Var.f17673t;
                    n3 n3Var2 = w5Var.f17673t;
                    w5.F(n3Var);
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<q> creator = q.CREATOR;
                    q qVar = (q) n3Var.G(blob, creator);
                    long j11 = cursorQuery.getLong(8);
                    w5.F(n3Var2);
                    q qVar2 = (q) n3Var2.G(cursorQuery.getBlob(9), creator);
                    long j12 = cursorQuery.getLong(10);
                    long j13 = cursorQuery.getLong(11);
                    w5.F(n3Var2);
                    arrayList.add(new c(string, string2, new y5(j12, objO, string3, string2), j11, z7, string4, qVar, j10, qVar2, j13, (q) n3Var2.G(cursorQuery.getBlob(12), creator)));
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                    i10 = 2;
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e10) {
                e = e10;
                cursor = cursorQuery;
                try {
                    i3 i3Var = ((b4) obj).f17251w;
                    b4.i(i3Var);
                    i3Var.f17397n.b(e, "Error querying conditional user property value");
                    List listEmptyList = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return listEmptyList;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List T(String str) throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        Object obj = this.f15046b;
        fc.t.g(str);
        o();
        p();
        ArrayList arrayList = new ArrayList();
        try {
            ((b4) obj).getClass();
            cursorQuery = I().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
        } catch (SQLiteException e10) {
            e = e10;
            cursor = null;
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return arrayList;
            }
            do {
                String string = cursorQuery.getString(0);
                String string2 = cursorQuery.getString(1);
                if (string2 == null) {
                    string2 = "";
                }
                String str2 = string2;
                long j10 = cursorQuery.getLong(2);
                Object objO = O(cursorQuery, 3);
                if (objO == null) {
                    i3 i3Var = ((b4) obj).f17251w;
                    b4.i(i3Var);
                    i3Var.f17397n.b(i3.y(str), "Read invalid user property value, ignoring it. appId");
                } else {
                    arrayList.add(new z5(str, str2, string, j10, objO));
                }
            } while (cursorQuery.moveToNext());
            cursorQuery.close();
            return arrayList;
        } catch (SQLiteException e11) {
            e = e11;
            cursor = cursorQuery;
            try {
                i3 i3Var2 = ((b4) obj).f17251w;
                b4.i(i3Var2);
                i3Var2.f17397n.c(i3.y(str), "Error querying user properties. appId", e);
                List listEmptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return listEmptyList;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = cursorQuery;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
    
        r0 = ((t5.b4) r2).f17251w;
        t5.b4.i(r0);
        r0 = r0.f17397n;
        ((t5.b4) r2).getClass();
        r0.b(java.lang.Integer.valueOf(com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS), "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List U(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        String str5;
        Object obj = this.f15046b;
        fc.t.g(str);
        o();
        p();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb = new StringBuilder("app_id=?");
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList2.add(str2);
                        sb.append(" and origin=?");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + "*");
                        sb.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    String string = sb.toString();
                    ((b4) obj).getClass();
                    Cursor cursorQuery = I().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
                    try {
                        try {
                            if (!cursorQuery.moveToFirst()) {
                                cursorQuery.close();
                                return arrayList;
                            }
                            str4 = str2;
                            while (true) {
                                try {
                                    int size = arrayList.size();
                                    ((b4) obj).getClass();
                                    if (size < 1000) {
                                        String string2 = cursorQuery.getString(0);
                                        long j10 = cursorQuery.getLong(1);
                                        Object objO = O(cursorQuery, 2);
                                        String string3 = cursorQuery.getString(3);
                                        if (objO == null) {
                                            try {
                                                i3 i3Var = ((b4) obj).f17251w;
                                                b4.i(i3Var);
                                                i3Var.f17397n.d("(2)Read invalid user property value, ignoring it", i3.y(str), string3, str3);
                                                str5 = string3;
                                            } catch (SQLiteException e10) {
                                                e = e10;
                                                str5 = string3;
                                                cursor = cursorQuery;
                                                str4 = str5;
                                                try {
                                                    i3 i3Var2 = ((b4) obj).f17251w;
                                                    b4.i(i3Var2);
                                                    i3Var2.f17397n.d("(2)Error querying user properties", i3.y(str), str4, e);
                                                    List listEmptyList = Collections.emptyList();
                                                    if (cursor != null) {
                                                    }
                                                    return listEmptyList;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            str5 = string3;
                                            try {
                                                arrayList.add(new z5(str, str5, string2, j10, objO));
                                            } catch (SQLiteException e11) {
                                                e = e11;
                                                cursor = cursorQuery;
                                                str4 = str5;
                                                i3 i3Var22 = ((b4) obj).f17251w;
                                                b4.i(i3Var22);
                                                i3Var22.f17397n.d("(2)Error querying user properties", i3.y(str), str4, e);
                                                List listEmptyList2 = Collections.emptyList();
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                return listEmptyList2;
                                            }
                                        }
                                        if (!cursorQuery.moveToNext()) {
                                            break;
                                        }
                                        str4 = str5;
                                    } else {
                                        break;
                                    }
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    cursor = cursorQuery;
                                    i3 i3Var222 = ((b4) obj).f17251w;
                                    b4.i(i3Var222);
                                    i3Var222.f17397n.d("(2)Error querying user properties", i3.y(str), str4, e);
                                    List listEmptyList22 = Collections.emptyList();
                                    if (cursor != null) {
                                    }
                                    return listEmptyList22;
                                }
                            }
                            cursorQuery.close();
                            return arrayList;
                        } catch (SQLiteException e13) {
                            e = e13;
                            str4 = str2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                } catch (SQLiteException e14) {
                    e = e14;
                    str4 = str2;
                    cursor = null;
                    i3 i3Var2222 = ((b4) obj).f17251w;
                    b4.i(i3Var2222);
                    i3Var2222.f17397n.d("(2)Error querying user properties", i3.y(str), str4, e);
                    List listEmptyList222 = Collections.emptyList();
                    if (cursor != null) {
                    }
                    return listEmptyList222;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        } catch (SQLiteException e15) {
            e = e15;
        }
    }

    public final void V() {
        p();
        I().beginTransaction();
    }

    public final void W() {
        p();
        I().endTransaction();
    }

    public final void X(List list) throws SQLException {
        o();
        p();
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (x()) {
            String strW = a0.h.w("(", TextUtils.join(",", list), ")");
            long jD = D("SELECT COUNT(1) FROM queue WHERE rowid IN " + strW + " AND retry_count =  2147483647 LIMIT 1", null);
            Object obj = this.f15046b;
            if (jD > 0) {
                i3 i3Var = ((b4) obj).f17251w;
                b4.i(i3Var);
                i3Var.f17400w.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                I().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + strW + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                i3 i3Var2 = ((b4) obj).f17251w;
                b4.i(i3Var2);
                i3Var2.f17397n.b(e10, "Error incrementing retry count. error");
            }
        }
    }

    public final void Y() {
        o();
        p();
        if (x()) {
            w5 w5Var = this.f17607e;
            long jZza = w5Var.f17675w.f17467m.zza();
            b4 b4Var = (b4) this.f15046b;
            b4Var.Q.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - jZza);
            b4Var.getClass();
            if (jAbs > ((Long) a3.f17211y.a(null)).longValue()) {
                w5Var.f17675w.f17467m.c(jElapsedRealtime);
                o();
                p();
                if (x()) {
                    SQLiteDatabase sQLiteDatabaseI = I();
                    b4Var.Q.getClass();
                    String strValueOf = String.valueOf(System.currentTimeMillis());
                    b4Var.getClass();
                    int iDelete = sQLiteDatabaseI.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(((Long) a3.D.a(null)).longValue())});
                    if (iDelete > 0) {
                        i3 i3Var = b4Var.f17251w;
                        b4.i(i3Var);
                        i3Var.Q.b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    @Override // t5.t5
    public final boolean r() {
        return false;
    }

    public final void s(String str, String str2) {
        fc.t.g(str);
        fc.t.g(str2);
        o();
        p();
        try {
            I().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            b4 b4Var = (b4) this.f15046b;
            i3 i3Var = b4Var.f17251w;
            b4.i(i3Var);
            i3Var.f17397n.d("Error deleting user property. appId", i3.y(str), b4Var.P.f(str2), e10);
        }
    }

    public final void t() {
        p();
        I().setTransactionSuccessful();
    }

    public final void u(i4 i4Var) {
        o();
        p();
        String strE = i4Var.E();
        fc.t.k(strE);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strE);
        contentValues.put("app_instance_id", i4Var.F());
        contentValues.put("gmp_app_id", i4Var.I());
        b4 b4Var = i4Var.f17401a;
        a4 a4Var = b4Var.M;
        b4.i(a4Var);
        a4Var.o();
        contentValues.put("resettable_device_id_hash", i4Var.f17405e);
        a4 a4Var2 = b4Var.M;
        b4.i(a4Var2);
        a4Var2.o();
        contentValues.put("last_bundle_index", Long.valueOf(i4Var.f17407g));
        a4 a4Var3 = b4Var.M;
        b4.i(a4Var3);
        a4Var3.o();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(i4Var.f17408h));
        a4 a4Var4 = b4Var.M;
        b4.i(a4Var4);
        a4Var4.o();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(i4Var.f17409i));
        contentValues.put("app_version", i4Var.G());
        a4 a4Var5 = b4Var.M;
        b4.i(a4Var5);
        a4Var5.o();
        contentValues.put("app_store", i4Var.f17412l);
        a4 a4Var6 = b4Var.M;
        b4.i(a4Var6);
        a4Var6.o();
        contentValues.put("gmp_version", Long.valueOf(i4Var.f17413m));
        a4 a4Var7 = b4Var.M;
        b4.i(a4Var7);
        a4Var7.o();
        contentValues.put("dev_cert_hash", Long.valueOf(i4Var.f17414n));
        a4 a4Var8 = b4Var.M;
        b4.i(a4Var8);
        a4Var8.o();
        contentValues.put("measurement_enabled", Boolean.valueOf(i4Var.f17415o));
        a4 a4Var9 = b4Var.M;
        b4.i(a4Var9);
        a4Var9.o();
        contentValues.put("day", Long.valueOf(i4Var.f17422v));
        a4 a4Var10 = b4Var.M;
        b4.i(a4Var10);
        a4Var10.o();
        contentValues.put("daily_public_events_count", Long.valueOf(i4Var.f17423w));
        b4.i(a4Var10);
        a4Var10.o();
        contentValues.put("daily_events_count", Long.valueOf(i4Var.f17424x));
        b4.i(a4Var10);
        a4Var10.o();
        contentValues.put("daily_conversions_count", Long.valueOf(i4Var.f17425y));
        a4 a4Var11 = b4Var.M;
        b4.i(a4Var11);
        a4Var11.o();
        contentValues.put("config_fetched_time", Long.valueOf(i4Var.D));
        a4 a4Var12 = b4Var.M;
        b4.i(a4Var12);
        a4Var12.o();
        contentValues.put("failed_config_fetch_time", Long.valueOf(i4Var.E));
        contentValues.put("app_version_int", Long.valueOf(i4Var.A()));
        contentValues.put("firebase_instance_id", i4Var.H());
        b4.i(a4Var10);
        a4Var10.o();
        contentValues.put("daily_error_events_count", Long.valueOf(i4Var.f17426z));
        b4.i(a4Var10);
        a4Var10.o();
        contentValues.put("daily_realtime_events_count", Long.valueOf(i4Var.A));
        b4.i(a4Var10);
        a4Var10.o();
        contentValues.put("health_monitor_sample", i4Var.B);
        a4 a4Var13 = b4Var.M;
        b4.i(a4Var13);
        a4Var13.o();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(i4Var.z()));
        contentValues.put("admob_app_id", i4Var.C());
        contentValues.put("dynamite_version", Long.valueOf(i4Var.B()));
        a4 a4Var14 = b4Var.M;
        b4.i(a4Var14);
        a4Var14.o();
        contentValues.put("session_stitching_token", i4Var.f17421u);
        a4 a4Var15 = b4Var.M;
        b4.i(a4Var15);
        a4Var15.o();
        ArrayList arrayList = i4Var.f17420t;
        Object obj = this.f15046b;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                i3 i3Var = ((b4) obj).f17251w;
                b4.i(i3Var);
                i3Var.f17400w.b(strE, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        ((k7) j7.f10848e.f10849b.zza()).getClass();
        b4 b4Var2 = (b4) obj;
        if (b4Var2.f17249t.y(null, a3.f17184k0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase sQLiteDatabaseI = I();
            if (sQLiteDatabaseI.update("apps", contentValues, "app_id = ?", new String[]{strE}) == 0 && sQLiteDatabaseI.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                i3 i3Var2 = ((b4) obj).f17251w;
                b4.i(i3Var2);
                i3Var2.f17397n.b(i3.y(strE), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e10) {
            i3 i3Var3 = b4Var2.f17251w;
            b4.i(i3Var3);
            i3Var3.f17397n.c(i3.y(strE), "Error storing app. appId", e10);
        }
    }

    public final void w(o oVar) {
        Object obj = this.f15046b;
        fc.t.k(oVar);
        o();
        p();
        ContentValues contentValues = new ContentValues();
        String str = oVar.f17522a;
        contentValues.put("app_id", str);
        contentValues.put("name", oVar.f17523b);
        contentValues.put("lifetime_count", Long.valueOf(oVar.f17524c));
        contentValues.put("current_bundle_count", Long.valueOf(oVar.f17525d));
        contentValues.put("last_fire_timestamp", Long.valueOf(oVar.f17527f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(oVar.f17528g));
        contentValues.put("last_bundled_day", oVar.f17529h);
        contentValues.put("last_sampled_complex_event_id", oVar.f17530i);
        contentValues.put("last_sampling_rate", oVar.f17531j);
        contentValues.put("current_session_count", Long.valueOf(oVar.f17526e));
        Boolean bool = oVar.f17532k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (I().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                i3 i3Var = ((b4) obj).f17251w;
                b4.i(i3Var);
                i3Var.f17397n.b(i3.y(str), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e10) {
            i3 i3Var2 = ((b4) obj).f17251w;
            b4.i(i3Var2);
            i3Var2.f17397n.c(i3.y(str), "Error storing event aggregates. appId", e10);
        }
    }

    public final boolean x() {
        Object obj = this.f15046b;
        Context context = ((b4) obj).f17234b;
        ((b4) obj).getClass();
        return context.getDatabasePath("google_app_measurement.db").exists();
    }

    public final void y(String str, Long l10, long j10, com.google.android.gms.internal.measurement.l2 l2Var) {
        o();
        p();
        fc.t.k(l2Var);
        fc.t.g(str);
        byte[] bArrB = l2Var.b();
        Object obj = this.f15046b;
        b4 b4Var = (b4) obj;
        i3 i3Var = b4Var.f17251w;
        b4.i(i3Var);
        i3Var.Q.c(b4Var.P.d(str), "Saving complex main event, appId, data size", Integer.valueOf(bArrB.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", bArrB);
        try {
            if (I().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                i3 i3Var2 = ((b4) obj).f17251w;
                b4.i(i3Var2);
                i3Var2.f17397n.b(i3.y(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e10) {
            i3 i3Var3 = b4Var.f17251w;
            b4.i(i3Var3);
            i3Var3.f17397n.c(i3.y(str), "Error storing complex main event. appId", e10);
        }
    }

    public final boolean z(c cVar) {
        o();
        p();
        String str = cVar.f17265b;
        fc.t.k(str);
        z5 z5VarN = N(str, cVar.f17267f.f17697e);
        Object obj = this.f15046b;
        if (z5VarN == null) {
            long jD = D("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            ((b4) obj).getClass();
            if (jD >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", cVar.f17266e);
        contentValues.put("name", cVar.f17267f.f17697e);
        Object objH = cVar.f17267f.h();
        fc.t.k(objH);
        C(contentValues, objH);
        contentValues.put("active", Boolean.valueOf(cVar.f17269m));
        contentValues.put("trigger_event_name", cVar.f17270n);
        contentValues.put("trigger_timeout", Long.valueOf(cVar.f17272u));
        b4 b4Var = (b4) obj;
        b6 b6Var = b4Var.O;
        b4.g(b6Var);
        b6Var.getClass();
        contentValues.put("timed_out_event", b6.g0(cVar.f17271t));
        contentValues.put("creation_timestamp", Long.valueOf(cVar.f17268j));
        b6 b6Var2 = b4Var.O;
        b4.g(b6Var2);
        q qVar = cVar.f17273w;
        b6Var2.getClass();
        contentValues.put("triggered_event", b6.g0(qVar));
        contentValues.put("triggered_timestamp", Long.valueOf(cVar.f17267f.f17698f));
        contentValues.put("time_to_live", Long.valueOf(cVar.M));
        b6 b6Var3 = b4Var.O;
        b4.g(b6Var3);
        b6Var3.getClass();
        contentValues.put("expired_event", b6.g0(cVar.N));
        try {
            if (I().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            i3 i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            i3Var.f17397n.b(i3.y(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e10) {
            i3 i3Var2 = b4Var.f17251w;
            b4.i(i3Var2);
            i3Var2.f17397n.c(i3.y(str), "Error storing conditional user property", e10);
            return true;
        }
    }
}