package q1;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class f implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteProgram f16111b;

    public f(SQLiteProgram sQLiteProgram) {
        this.f16111b = sQLiteProgram;
    }

    public final void a(byte[] bArr, int i10) {
        this.f16111b.bindBlob(i10, bArr);
    }

    public final void b(int i10, double d10) {
        this.f16111b.bindDouble(i10, d10);
    }

    public final void c(int i10, long j10) {
        this.f16111b.bindLong(i10, j10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16111b.close();
    }

    public final void d(int i10) {
        this.f16111b.bindNull(i10);
    }

    public final void e(int i10, String str) {
        this.f16111b.bindString(i10, str);
    }
}