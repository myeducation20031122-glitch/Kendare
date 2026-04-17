package t5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e3 extends m3 {

    /* renamed from: f, reason: collision with root package name */
    public final j f17319f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17320j;

    public e3(b4 b4Var) {
        super(b4Var);
        b4 b4Var2 = (b4) this.f15046b;
        Context context = b4Var2.f17234b;
        b4Var2.getClass();
        this.f17319f = new j(this, context);
    }

    @Override // t5.m3
    public final boolean r() {
        return false;
    }

    public final SQLiteDatabase s() {
        if (this.f17320j) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f17319f.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f17320j = true;
        return null;
    }

    public final void t() {
        int iDelete;
        Object obj = this.f15046b;
        o();
        try {
            SQLiteDatabase sQLiteDatabaseS = s();
            if (sQLiteDatabaseS == null || (iDelete = sQLiteDatabaseS.delete("messages", null, null)) <= 0) {
                return;
            }
            i3 i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            i3Var.Q.b(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e10) {
            i3 i3Var2 = ((b4) obj).f17251w;
            b4.i(i3Var2);
            i3Var2.f17397n.b(e10, "Error resetting local analytics data. error");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079 A[PHI: r4
      0x0079: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:36:0x008b, B:33:0x0077, B:30:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u() {
        o();
        if (this.f17320j) {
            return;
        }
        b4 b4Var = (b4) this.f15046b;
        Context context = b4Var.f17234b;
        b4Var.getClass();
        if (!context.getDatabasePath("google_app_measurement_local.db").exists()) {
            return;
        }
        int i10 = 0;
        int i11 = 5;
        while (true) {
            Object obj = this.f15046b;
            if (i10 >= 5) {
                i3 i3Var = ((b4) obj).f17251w;
                b4.i(i3Var);
                i3Var.f17400w.a("Error deleting app launch break from local database in reasonable time");
                return;
            }
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseS = s();
                        if (sQLiteDatabaseS == null) {
                            this.f17320j = true;
                            return;
                        }
                        sQLiteDatabaseS.beginTransaction();
                        sQLiteDatabaseS.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseS.setTransactionSuccessful();
                        sQLiteDatabaseS.endTransaction();
                        sQLiteDatabaseS.close();
                        return;
                    } catch (SQLiteException e10) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        i3 i3Var2 = ((b4) obj).f17251w;
                        b4.i(i3Var2);
                        i3Var2.f17397n.b(e10, "Error deleting app launch break from local database");
                        this.f17320j = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i11);
                    i11 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteFullException e11) {
                i3 i3Var3 = ((b4) obj).f17251w;
                b4.i(i3Var3);
                i3Var3.f17397n.b(e11, "Error deleting app launch break from local database");
                this.f17320j = true;
                if (0 != 0) {
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c A[PHI: r10
      0x010c: PHI (r10v6 android.database.sqlite.SQLiteDatabase) = (r10v5 android.database.sqlite.SQLiteDatabase), (r10v7 android.database.sqlite.SQLiteDatabase) binds: [B:64:0x010a, B:82:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0151  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(byte[] bArr, int i10) {
        SQLiteDatabase sQLiteDatabaseS;
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor2;
        String str;
        o();
        ?? r22 = 0;
        if (this.f17320j) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i10));
        contentValues.put("entry", bArr);
        Object obj = this.f15046b;
        b4 b4Var = (b4) obj;
        b4Var.getClass();
        int i11 = 0;
        int i12 = 5;
        for (int i13 = 5; i11 < i13; i13 = 5) {
            Cursor cursor3 = null;
            try {
                sQLiteDatabaseS = s();
                if (sQLiteDatabaseS == null) {
                    this.f17320j = true;
                    return r22;
                }
                try {
                    sQLiteDatabaseS.beginTransaction();
                    Cursor cursorRawQuery = sQLiteDatabaseS.rawQuery("select count(1) from messages", null);
                    long j10 = 0;
                    if (cursorRawQuery != 0) {
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                j10 = cursorRawQuery.getLong(r22);
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            cursor3 = cursorRawQuery;
                            try {
                                SystemClock.sleep(i12);
                                i12 += 20;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                if (sQLiteDatabaseS != null) {
                                    sQLiteDatabaseS.close();
                                }
                                i11++;
                                r22 = 0;
                            } catch (Throwable th) {
                                th = th;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                if (sQLiteDatabaseS != null) {
                                    sQLiteDatabaseS.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteFullException e10) {
                            e = e10;
                            sQLiteDatabase = sQLiteDatabaseS;
                            cursor2 = cursorRawQuery;
                            i3 i3Var = ((b4) obj).f17251w;
                            b4.i(i3Var);
                            i3Var.f17397n.b(e, "Error writing entry; local database full");
                            this.f17320j = true;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i11++;
                            r22 = 0;
                        } catch (SQLiteException e11) {
                            e = e11;
                            sQLiteDatabase = sQLiteDatabaseS;
                            cursor = cursorRawQuery;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabaseS = sQLiteDatabase;
                                    cursor3 = cursor;
                                    if (cursor3 != null) {
                                    }
                                    if (sQLiteDatabaseS != null) {
                                    }
                                    throw th;
                                }
                            }
                            i3 i3Var2 = ((b4) obj).f17251w;
                            b4.i(i3Var2);
                            i3Var2.f17397n.b(e, "Error writing entry to local database");
                            this.f17320j = true;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase != null) {
                            }
                            i11++;
                            r22 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            cursor3 = cursorRawQuery;
                            if (cursor3 != null) {
                            }
                            if (sQLiteDatabaseS != null) {
                            }
                            throw th;
                        }
                    }
                    if (j10 >= 100000) {
                        i3 i3Var3 = ((b4) obj).f17251w;
                        b4.i(i3Var3);
                        i3Var3.f17397n.a("Data loss, local db full");
                        long j11 = 100001 - j10;
                        String[] strArr = new String[1];
                        strArr[r22] = Long.toString(j11);
                        long jDelete = sQLiteDatabaseS.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (jDelete != j11) {
                            i3 i3Var4 = ((b4) obj).f17251w;
                            b4.i(i3Var4);
                            i3Var4.f17397n.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j11), Long.valueOf(jDelete), Long.valueOf(j11 - jDelete));
                            str = null;
                        } else {
                            str = null;
                        }
                    }
                    sQLiteDatabaseS.insertOrThrow("messages", str, contentValues);
                    sQLiteDatabaseS.setTransactionSuccessful();
                    sQLiteDatabaseS.endTransaction();
                    if (cursorRawQuery != 0) {
                        cursorRawQuery.close();
                    }
                    sQLiteDatabaseS.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                    cursor3 = null;
                } catch (SQLiteFullException e12) {
                    e = e12;
                    cursor2 = null;
                    sQLiteDatabase = sQLiteDatabaseS;
                } catch (SQLiteException e13) {
                    e = e13;
                    cursor = null;
                    sQLiteDatabase = sQLiteDatabaseS;
                } catch (Throwable th4) {
                    th = th4;
                    cursor = null;
                    cursor3 = cursor;
                    if (cursor3 != null) {
                    }
                    if (sQLiteDatabaseS != null) {
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabaseS = null;
            } catch (SQLiteFullException e14) {
                e = e14;
                cursor2 = null;
                sQLiteDatabase = null;
            } catch (SQLiteException e15) {
                e = e15;
                cursor = null;
                sQLiteDatabase = null;
            } catch (Throwable th5) {
                th = th5;
                cursor3 = null;
                sQLiteDatabaseS = null;
            }
        }
        i3 i3Var5 = b4Var.f17251w;
        b4.i(i3Var5);
        i3Var5.Q.a("Failed to write entry to local database");
        return false;
    }
}