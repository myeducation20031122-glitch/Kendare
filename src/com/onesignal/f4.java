package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f4 extends SQLiteOpenHelper implements e4 {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f11799b = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f11800e = {"CREATE INDEX notification_notification_id_idx ON notification(notification_id); ", "CREATE INDEX notification_android_notification_id_idx ON notification(android_notification_id); ", "CREATE INDEX notification_group_id_idx ON notification(group_id); ", "CREATE INDEX notification_collapse_id_idx ON notification(collapse_id); ", "CREATE INDEX notification_created_time_idx ON notification(created_time); ", "CREATE INDEX notification_expire_time_idx ON notification(expire_time); "};

    /* renamed from: f, reason: collision with root package name */
    public static f4 f11801f;

    public static f4 b(Context context) {
        if (f11801f == null) {
            synchronized (f11799b) {
                try {
                    if (f11801f == null) {
                        f11801f = new f4(context.getApplicationContext(), "OneSignal.db", null, 8);
                    }
                } finally {
                }
            }
        }
        return f11801f;
    }

    public static void g(SQLiteDatabase db, int i10) throws SQLException {
        if (i10 < 2) {
            l(db, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
            l(db, "CREATE INDEX notification_group_id_idx ON notification(group_id); ");
        }
        if (i10 < 3) {
            l(db, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
            l(db, "UPDATE notification SET expire_time = created_time + 259200;");
            l(db, "CREATE INDEX notification_expire_time_idx ON notification(expire_time); ");
        }
        if (i10 < 4) {
            l(db, "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_ids TEXT,name TEXT,session TEXT,params TEXT,timestamp TIMESTAMP);");
        }
        if (i10 < 5) {
            l(db, "CREATE TABLE cached_unique_outcome_notification (_id INTEGER PRIMARY KEY,notification_id TEXT,name TEXT);");
            n(db);
        }
        if (i10 == 5) {
            n(db);
        }
        if (i10 < 7) {
            l(db, "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
        }
        if (i10 < 8) {
            Intrinsics.f(db, "db");
            String strL = Intrinsics.l(",session", "_id,name,timestamp,notification_ids,weight");
            String strL2 = Intrinsics.l(",notification_influence_type", "_id,name,timestamp,notification_ids,weight");
            try {
                try {
                    db.execSQL("BEGIN TRANSACTION;");
                    db.execSQL("ALTER TABLE outcome RENAME TO outcome_aux;");
                    db.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                    db.execSQL("INSERT INTO outcome(" + strL2 + ") SELECT " + strL + " FROM outcome_aux;");
                    db.execSQL("DROP TABLE outcome_aux;");
                } catch (SQLiteException e10) {
                    e10.printStackTrace();
                }
                db.execSQL("COMMIT;");
                String strL3 = Intrinsics.l(",notification_id", "_id,name");
                String strL4 = Intrinsics.l(",channel_influence_id", "_id,name");
                try {
                    try {
                        db.execSQL("BEGIN TRANSACTION;");
                        db.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
                        db.execSQL("INSERT INTO cached_unique_outcome(" + strL4 + ") SELECT " + strL3 + " FROM cached_unique_outcome_notification;");
                        StringBuilder sb = new StringBuilder("UPDATE cached_unique_outcome SET channel_type = '");
                        sb.append(x9.b.NOTIFICATION);
                        sb.append("';");
                        db.execSQL(sb.toString());
                        db.execSQL("DROP TABLE cached_unique_outcome_notification;");
                    } catch (SQLiteException e11) {
                        e11.printStackTrace();
                    }
                } finally {
                }
            } finally {
            }
        }
    }

    public static StringBuilder k() {
        z3.f12275u.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        StringBuilder sb = new StringBuilder("created_time > " + (jCurrentTimeMillis - 604800) + " AND dismissed = 0 AND opened = 0 AND is_summary = 0");
        z3.f12276v.getClass();
        if (h4.b(h4.f11856a, "OS_RESTORE_TTL_FILTER", true)) {
            sb.append(" AND expire_time > " + jCurrentTimeMillis);
        }
        return sb;
    }

    public static void l(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e10) {
            e10.printStackTrace();
        }
    }

    public static void n(SQLiteDatabase db) throws SQLException {
        Intrinsics.f(db, "db");
        try {
            try {
                db.execSQL("BEGIN TRANSACTION;");
                db.execSQL("CREATE TEMPORARY TABLE outcome_backup(_id,session,notification_ids,name,timestamp);");
                db.execSQL("INSERT INTO outcome_backup SELECT _id,session,notification_ids,name,timestamp FROM outcome;");
                db.execSQL("DROP TABLE outcome;");
                db.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                db.execSQL("INSERT INTO outcome (_id,session,notification_ids,name,timestamp, weight) SELECT _id,session,notification_ids,name,timestamp, 0 FROM outcome_backup;");
                db.execSQL("DROP TABLE outcome_backup;");
            } catch (SQLiteException e10) {
                e10.printStackTrace();
            }
        } finally {
            db.execSQL("COMMIT;");
        }
    }

    public final void a(String str, String str2, String[] strArr) {
        String str3;
        String str4;
        synchronized (f11799b) {
            SQLiteDatabase sQLiteDatabaseD = d();
            try {
                try {
                    try {
                        sQLiteDatabaseD.beginTransaction();
                        sQLiteDatabaseD.delete(str, str2, strArr);
                        sQLiteDatabaseD.setTransactionSuccessful();
                    } catch (IllegalStateException e10) {
                        l.f("Error under delete transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e10);
                        if (sQLiteDatabaseD != null) {
                            try {
                                sQLiteDatabaseD.endTransaction();
                            } catch (SQLiteException e11) {
                                e = e11;
                                str3 = "Error closing transaction! ";
                                l.f(str3, e);
                            } catch (IllegalStateException e12) {
                                e = e12;
                                str3 = "Error closing transaction! ";
                                l.f(str3, e);
                            }
                        }
                    }
                } catch (SQLiteException e13) {
                    l.f("Error deleting on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e13);
                    if (sQLiteDatabaseD != null) {
                        try {
                            sQLiteDatabaseD.endTransaction();
                        } catch (SQLiteException e14) {
                            e = e14;
                            str3 = "Error closing transaction! ";
                            l.f(str3, e);
                        } catch (IllegalStateException e15) {
                            e = e15;
                            str3 = "Error closing transaction! ";
                            l.f(str3, e);
                        }
                    }
                }
                try {
                    sQLiteDatabaseD.endTransaction();
                } catch (SQLiteException e16) {
                    e = e16;
                    str3 = "Error closing transaction! ";
                    l.f(str3, e);
                } catch (IllegalStateException e17) {
                    e = e17;
                    str3 = "Error closing transaction! ";
                    l.f(str3, e);
                }
            } catch (Throwable th) {
                if (sQLiteDatabaseD != null) {
                    try {
                        sQLiteDatabaseD.endTransaction();
                    } catch (SQLiteException e18) {
                        e = e18;
                        str4 = "Error closing transaction! ";
                        l.f(str4, e);
                        throw th;
                    } catch (IllegalStateException e19) {
                        e = e19;
                        str4 = "Error closing transaction! ";
                        l.f(str4, e);
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    public final SQLiteDatabase c() {
        SQLiteDatabase writableDatabase;
        synchronized (f11799b) {
            try {
                try {
                    writableDatabase = getWritableDatabase();
                } finally {
                }
            } catch (SQLiteCantOpenDatabaseException e10) {
                throw e10;
            } catch (SQLiteDatabaseLockedException e11) {
                throw e11;
            }
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0018 A[Catch: all -> 0x000b, LOOP:0: B:21:0x0005->B:17:0x0018, LOOP_END, TryCatch #2 {all -> 0x000b, blocks: (B:5:0x0005, B:6:0x0009, B:15:0x0013, B:17:0x0018, B:18:0x001f), top: B:21:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x001f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SQLiteDatabase d() {
        SQLiteDatabase sQLiteDatabaseC;
        synchronized (f11799b) {
            Throwable th = null;
            int i10 = 0;
            while (true) {
                try {
                    try {
                        sQLiteDatabaseC = c();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (SQLiteCantOpenDatabaseException e10) {
                    e = e10;
                    if (th == null) {
                        th = e;
                    }
                    i10++;
                    if (i10 < 5) {
                        throw th;
                    }
                    SystemClock.sleep(i10 * 400);
                } catch (SQLiteDatabaseLockedException e11) {
                    e = e11;
                    if (th == null) {
                    }
                    i10++;
                    if (i10 < 5) {
                    }
                }
                SystemClock.sleep(i10 * 400);
            }
        }
        return sQLiteDatabaseC;
    }

    public final void e(String str, ContentValues contentValues) {
        String str2;
        String str3;
        synchronized (f11799b) {
            SQLiteDatabase sQLiteDatabaseD = d();
            try {
                try {
                    sQLiteDatabaseD.beginTransaction();
                    sQLiteDatabaseD.insert(str, null, contentValues);
                    sQLiteDatabaseD.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseD.endTransaction();
                    } catch (SQLiteException e10) {
                        e = e10;
                        str2 = "Error closing transaction! ";
                        l.f(str2, e);
                    } catch (IllegalStateException e11) {
                        e = e11;
                        str2 = "Error closing transaction! ";
                        l.f(str2, e);
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabaseD != null) {
                        try {
                            sQLiteDatabaseD.endTransaction();
                        } catch (SQLiteException e12) {
                            e = e12;
                            str3 = "Error closing transaction! ";
                            l.f(str3, e);
                            throw th;
                        } catch (IllegalStateException e13) {
                            e = e13;
                            str3 = "Error closing transaction! ";
                            l.f(str3, e);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (SQLiteException e14) {
                l.f("Error inserting on table: " + str + " with nullColumnHack: null and values: " + contentValues, e14);
                if (sQLiteDatabaseD != null) {
                    try {
                        sQLiteDatabaseD.endTransaction();
                    } catch (SQLiteException e15) {
                        e = e15;
                        str2 = "Error closing transaction! ";
                        l.f(str2, e);
                    } catch (IllegalStateException e16) {
                        e = e16;
                        str2 = "Error closing transaction! ";
                        l.f(str2, e);
                    }
                }
            } catch (IllegalStateException e17) {
                l.f("Error under inserting transaction under table: " + str + " with nullColumnHack: null and values: " + contentValues, e17);
                if (sQLiteDatabaseD != null) {
                    try {
                        sQLiteDatabaseD.endTransaction();
                    } catch (SQLiteException e18) {
                        e = e18;
                        str2 = "Error closing transaction! ";
                        l.f(str2, e);
                    } catch (IllegalStateException e19) {
                        e = e19;
                        str2 = "Error closing transaction! ";
                        l.f(str2, e);
                    }
                }
            }
        }
    }

    public final void f(ContentValues contentValues) {
        String str;
        String str2;
        synchronized (f11799b) {
            SQLiteDatabase sQLiteDatabaseD = d();
            try {
                try {
                    try {
                        sQLiteDatabaseD.beginTransaction();
                        sQLiteDatabaseD.insertOrThrow("notification", null, contentValues);
                        sQLiteDatabaseD.setTransactionSuccessful();
                    } catch (IllegalStateException e10) {
                        l.f("Error under inserting or throw transaction under table: notification with nullColumnHack: null and values: " + contentValues, e10);
                        if (sQLiteDatabaseD != null) {
                            try {
                                sQLiteDatabaseD.endTransaction();
                            } catch (SQLiteException e11) {
                                e = e11;
                                str = "Error closing transaction! ";
                                l.f(str, e);
                            } catch (IllegalStateException e12) {
                                e = e12;
                                str = "Error closing transaction! ";
                                l.f(str, e);
                            }
                        }
                    }
                } catch (SQLiteException e13) {
                    l.f("Error inserting or throw on table: notification with nullColumnHack: null and values: " + contentValues, e13);
                    if (sQLiteDatabaseD != null) {
                        try {
                            sQLiteDatabaseD.endTransaction();
                        } catch (SQLiteException e14) {
                            e = e14;
                            str = "Error closing transaction! ";
                            l.f(str, e);
                        } catch (IllegalStateException e15) {
                            e = e15;
                            str = "Error closing transaction! ";
                            l.f(str, e);
                        }
                    }
                }
                try {
                    sQLiteDatabaseD.endTransaction();
                } catch (SQLiteException e16) {
                    e = e16;
                    str = "Error closing transaction! ";
                    l.f(str, e);
                } catch (IllegalStateException e17) {
                    e = e17;
                    str = "Error closing transaction! ";
                    l.f(str, e);
                }
            } catch (Throwable th) {
                if (sQLiteDatabaseD != null) {
                    try {
                        sQLiteDatabaseD.endTransaction();
                    } catch (SQLiteException e18) {
                        e = e18;
                        str2 = "Error closing transaction! ";
                        l.f(str2, e);
                        throw th;
                    } catch (IllegalStateException e19) {
                        e = e19;
                        str2 = "Error closing transaction! ";
                        l.f(str2, e);
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    public final Cursor h(String str, String[] strArr, String str2, String[] strArr2, String str3) {
        Cursor cursorQuery;
        synchronized (f11799b) {
            cursorQuery = d().query(str, strArr, str2, strArr2, null, null, str3);
        }
        return cursorQuery;
    }

    public final Cursor j(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4) {
        Cursor cursorQuery;
        synchronized (f11799b) {
            cursorQuery = d().query(str, strArr, str2, strArr2, null, null, str3, str4);
        }
        return cursorQuery;
    }

    public final int m(String str, ContentValues contentValues, String str2, String[] strArr) {
        String str3;
        String str4;
        int iUpdate = 0;
        if (contentValues.toString().isEmpty()) {
            return 0;
        }
        synchronized (f11799b) {
            SQLiteDatabase sQLiteDatabaseD = d();
            try {
                try {
                    sQLiteDatabaseD.beginTransaction();
                    iUpdate = sQLiteDatabaseD.update(str, contentValues, str2, strArr);
                    sQLiteDatabaseD.setTransactionSuccessful();
                } catch (SQLiteException e10) {
                    l.f("Error updating on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e10);
                    if (sQLiteDatabaseD != null) {
                        try {
                            sQLiteDatabaseD.endTransaction();
                        } catch (SQLiteException e11) {
                            e = e11;
                            str3 = "Error closing transaction! ";
                            l.f(str3, e);
                            return iUpdate;
                        } catch (IllegalStateException e12) {
                            e = e12;
                            str3 = "Error closing transaction! ";
                            l.f(str3, e);
                            return iUpdate;
                        }
                    }
                } catch (IllegalStateException e13) {
                    l.f("Error under update transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e13);
                    if (sQLiteDatabaseD != null) {
                        try {
                            sQLiteDatabaseD.endTransaction();
                        } catch (SQLiteException e14) {
                            e = e14;
                            str3 = "Error closing transaction! ";
                            l.f(str3, e);
                            return iUpdate;
                        } catch (IllegalStateException e15) {
                            e = e15;
                            str3 = "Error closing transaction! ";
                            l.f(str3, e);
                            return iUpdate;
                        }
                    }
                }
                try {
                    sQLiteDatabaseD.endTransaction();
                } catch (SQLiteException e16) {
                    e = e16;
                    str3 = "Error closing transaction! ";
                    l.f(str3, e);
                    return iUpdate;
                } catch (IllegalStateException e17) {
                    e = e17;
                    str3 = "Error closing transaction! ";
                    l.f(str3, e);
                    return iUpdate;
                }
            } catch (Throwable th) {
                if (sQLiteDatabaseD != null) {
                    try {
                        sQLiteDatabaseD.endTransaction();
                    } catch (SQLiteException e18) {
                        e = e18;
                        str4 = "Error closing transaction! ";
                        l.f(str4, e);
                        throw th;
                    } catch (IllegalStateException e19) {
                        e = e19;
                        str4 = "Error closing transaction! ";
                        l.f(str4, e);
                        throw th;
                    }
                }
                throw th;
            }
        }
        return iUpdate;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f11799b) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);");
                sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
                sQLiteDatabase.execSQL("CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
                String[] strArr = f11800e;
                for (int i10 = 0; i10 < 6; i10++) {
                    sQLiteDatabase.execSQL(strArr[i10]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        z3.b(y3.f12231j, "SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.", null);
        synchronized (f11799b) {
            try {
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
                try {
                    ArrayList arrayList = new ArrayList(cursorRawQuery.getCount());
                    while (cursorRawQuery.moveToNext()) {
                        arrayList.add(cursorRawQuery.getString(0));
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!str.startsWith("sqlite_")) {
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                        }
                    }
                    cursorRawQuery.close();
                    onCreate(sQLiteDatabase);
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        z3.b(y3.f12233n, a0.h.s("OneSignal Database onUpgrade from: ", i10, " to: ", i11), null);
        synchronized (f11799b) {
            try {
                g(sQLiteDatabase, i10);
            } catch (SQLiteException e10) {
                z3.b(y3.f12230f, "Error in upgrade, migration may have already run! Skipping!", e10);
            }
        }
    }
}