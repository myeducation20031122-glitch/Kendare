package x3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l implements d, y3.c, c {

    /* renamed from: n, reason: collision with root package name */
    public static final o3.c f18936n = new o3.c("proto");

    /* renamed from: b, reason: collision with root package name */
    public final o f18937b;

    /* renamed from: e, reason: collision with root package name */
    public final z3.a f18938e;

    /* renamed from: f, reason: collision with root package name */
    public final z3.a f18939f;

    /* renamed from: j, reason: collision with root package name */
    public final a f18940j;

    /* renamed from: m, reason: collision with root package name */
    public final da.a f18941m;

    public l(z3.a aVar, z3.a aVar2, a aVar3, o oVar, da.a aVar4) {
        this.f18937b = oVar;
        this.f18938e = aVar;
        this.f18939f = aVar2;
        this.f18940j = aVar3;
        this.f18941m = aVar4;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, r3.i iVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f16409a, String.valueOf(a4.a.a(iVar.f16411c))));
        byte[] bArr = iVar.f16410b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) h(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new o0.h(14));
    }

    public static String g(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f18918a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object h(Cursor cursor, j jVar) {
        try {
            return jVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        o oVar = this.f18937b;
        Objects.requireNonNull(oVar);
        return (SQLiteDatabase) e(new e0.g(oVar, 7), new o0.h(10));
    }

    public final Object c(j jVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = jVar.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f18937b.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, r3.i iVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long lB = b(sQLiteDatabase, iVar);
        if (lB == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id"}, "context_id = ?", new String[]{lB.toString()}, null, null, null, String.valueOf(i10)), new t1.h(this, arrayList, iVar, 4));
        return arrayList;
    }

    public final Object e(e0.g gVar, o0.h hVar) {
        z3.c cVar = (z3.c) this.f18939f;
        long jA = cVar.a();
        while (true) {
            try {
                int i10 = gVar.f12371b;
                Object obj = gVar.f12372e;
                switch (i10) {
                    case y4.g.NETWORK_ERROR /* 7 */:
                        return ((o) obj).getWritableDatabase();
                    default:
                        ((SQLiteDatabase) obj).beginTransaction();
                        return null;
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (cVar.a() >= this.f18940j.f18915c + jA) {
                    return hVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object f(y3.b bVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        e(new e0.g(sQLiteDatabaseA, 8), new o0.h(12));
        try {
            Object objExecute = bVar.execute();
            sQLiteDatabaseA.setTransactionSuccessful();
            return objExecute;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }
}