package q1;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import m.c0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements DatabaseErrorHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f16099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b[] f16100b;

    public c(c0 c0Var, b[] bVarArr) {
        this.f16099a = c0Var;
        this.f16100b = bVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        b bVarA = d.a(this.f16100b, sQLiteDatabase);
        this.f16099a.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVarA.f16098b.getPath());
        SQLiteDatabase sQLiteDatabase2 = bVarA.f16098b;
        if (sQLiteDatabase2.isOpen()) {
            List<Pair<String, String>> attachedDbs = null;
            try {
                try {
                    attachedDbs = sQLiteDatabase2.getAttachedDbs();
                } catch (Throwable th) {
                    if (attachedDbs != null) {
                        Iterator<Pair<String, String>> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            c0.b((String) it.next().second);
                        }
                    } else {
                        c0.b(sQLiteDatabase2.getPath());
                    }
                    throw th;
                }
            } catch (SQLiteException unused) {
            }
            try {
                bVarA.close();
            } catch (IOException unused2) {
            }
            if (attachedDbs != null) {
                Iterator<Pair<String, String>> it2 = attachedDbs.iterator();
                while (it2.hasNext()) {
                    c0.b((String) it2.next().second);
                }
                return;
            }
        }
        c0.b(sQLiteDatabase2.getPath());
    }
}