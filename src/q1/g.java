package q1;

import android.database.sqlite.SQLiteStatement;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends f {

    /* renamed from: e, reason: collision with root package name */
    public final SQLiteStatement f16112e;

    public g(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f16112e = sQLiteStatement;
    }

    public final void f() {
        this.f16112e.executeUpdateDelete();
    }
}