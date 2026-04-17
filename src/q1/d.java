package q1;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.yl0;
import com.google.android.gms.internal.measurement.n3;
import java.util.List;
import l1.i;
import l1.q;
import m.c0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends SQLiteOpenHelper {

    /* renamed from: b, reason: collision with root package name */
    public final b[] f16101b;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f16102e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16103f;

    public d(Context context, String str, b[] bVarArr, c0 c0Var) {
        super(context, str, null, c0Var.f14716a, new c(c0Var, bVarArr));
        this.f16102e = c0Var;
        this.f16101b = bVarArr;
    }

    public static b a(b[] bVarArr, SQLiteDatabase sQLiteDatabase) {
        b bVar = bVarArr[0];
        if (bVar == null || bVar.f16098b != sQLiteDatabase) {
            bVarArr[0] = new b(sQLiteDatabase);
        }
        return bVarArr[0];
    }

    public final synchronized p1.a b() {
        this.f16103f = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.f16103f) {
            return a(this.f16101b, writableDatabase);
        }
        close();
        return b();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f16101b[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(this.f16101b, sQLiteDatabase);
        this.f16102e.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        boolean z7;
        b bVarA = a(this.f16101b, sQLiteDatabase);
        c0 c0Var = this.f16102e;
        c0Var.getClass();
        Cursor cursorD = bVarA.d("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            if (cursorD.moveToFirst()) {
                z7 = cursorD.getInt(0) == 0;
            }
            cursorD.close();
            yl0 yl0Var = (yl0) c0Var.f14718c;
            yl0Var.getClass();
            yl0.j(bVarA);
            if (!z7) {
                q qVarK = yl0.k(bVarA);
                if (!qVarK.f14512a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + qVarK.f14513b);
                }
            }
            c0Var.h(bVarA);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) yl0Var.f10133f;
            int i10 = WorkDatabase_Impl.f1794s;
            List list = workDatabase_Impl.f14509g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((a2.g) ((WorkDatabase_Impl) yl0Var.f10133f).f14509g.get(i11)).getClass();
                }
            }
        } catch (Throwable th) {
            cursorD.close();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.f16103f = true;
        this.f16102e.d(a(this.f16101b, sQLiteDatabase), i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws SQLException {
        boolean z7;
        if (this.f16103f) {
            return;
        }
        c0 c0Var = this.f16102e;
        b bVarA = a(this.f16101b, sQLiteDatabase);
        c0Var.getClass();
        Cursor cursorD = bVarA.d("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (cursorD.moveToFirst()) {
                z7 = cursorD.getInt(0) != 0;
            }
            cursorD.close();
            if (z7) {
                Cursor cursorE = bVarA.e(new n3("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = cursorE.moveToFirst() ? cursorE.getString(0) : null;
                    cursorE.close();
                    if (!((String) c0Var.f14719d).equals(string) && !((String) c0Var.f14720e).equals(string)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                    }
                } catch (Throwable th) {
                    cursorE.close();
                    throw th;
                }
            } else {
                ((yl0) c0Var.f14718c).getClass();
                q qVarK = yl0.k(bVarA);
                if (!qVarK.f14512a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + qVarK.f14513b);
                }
                c0Var.h(bVarA);
            }
            yl0 yl0Var = (yl0) c0Var.f14718c;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) yl0Var.f10133f;
            int i10 = WorkDatabase_Impl.f1794s;
            workDatabase_Impl.f14503a = bVarA;
            bVarA.c("PRAGMA foreign_keys = ON");
            i iVar = ((WorkDatabase_Impl) yl0Var.f10133f).f14506d;
            synchronized (iVar) {
                try {
                    if (iVar.f14481e) {
                        Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                    } else {
                        bVarA.c("PRAGMA temp_store = MEMORY;");
                        bVarA.c("PRAGMA recursive_triggers='ON';");
                        bVarA.c("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                        iVar.c(bVarA);
                        iVar.f14482f = new g(bVarA.f16098b.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
                        iVar.f14481e = true;
                    }
                } finally {
                }
            }
            List list = ((WorkDatabase_Impl) yl0Var.f10133f).f14509g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((a2.g) ((WorkDatabase_Impl) yl0Var.f10133f).f14509g.get(i11)).getClass();
                    bVarA.a();
                    try {
                        int i12 = WorkDatabase.f1793k;
                        bVarA.c("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f1792j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                        bVarA.f();
                        bVarA.b();
                    } catch (Throwable th2) {
                        bVarA.b();
                        throw th2;
                    }
                }
            }
            c0Var.f14717b = null;
        } catch (Throwable th3) {
            cursorD.close();
            throw th3;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.f16103f = true;
        this.f16102e.d(a(this.f16101b, sQLiteDatabase), i10, i11);
    }
}