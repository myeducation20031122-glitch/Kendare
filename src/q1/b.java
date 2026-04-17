package q1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.measurement.n3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements p1.a {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f16097e = new String[0];

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f16098b;

    public b(SQLiteDatabase sQLiteDatabase) {
        this.f16098b = sQLiteDatabase;
    }

    public final void a() {
        this.f16098b.beginTransaction();
    }

    public final void b() {
        this.f16098b.endTransaction();
    }

    public final void c(String str) {
        this.f16098b.execSQL(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16098b.close();
    }

    public final Cursor d(String str) {
        return e(new n3(str));
    }

    public final Cursor e(p1.e eVar) {
        return this.f16098b.rawQueryWithFactory(new a(eVar, 0), eVar.f(), f16097e, null);
    }

    public final void f() {
        this.f16098b.setTransactionSuccessful();
    }
}