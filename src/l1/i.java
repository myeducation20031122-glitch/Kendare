package l1;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.measurement.n3;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f14476j = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b, reason: collision with root package name */
    public final String[] f14478b;

    /* renamed from: c, reason: collision with root package name */
    public final p f14479c;

    /* renamed from: f, reason: collision with root package name */
    public volatile q1.g f14482f;

    /* renamed from: g, reason: collision with root package name */
    public final g f14483g;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f14480d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f14481e = false;

    /* renamed from: h, reason: collision with root package name */
    public final o.g f14484h = new o.g();

    /* renamed from: i, reason: collision with root package name */
    public final androidx.activity.i f14485i = new androidx.activity.i(this, 10);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14477a = new HashMap();

    public i(p pVar, HashMap map, HashMap map2, String... strArr) {
        this.f14479c = pVar;
        this.f14483g = new g(strArr.length);
        new n3(pVar);
        int length = strArr.length;
        this.f14478b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f14477a.put(lowerCase, Integer.valueOf(i10));
            String str2 = (String) map.get(strArr[i10]);
            if (str2 != null) {
                this.f14478b[i10] = str2.toLowerCase(locale);
            } else {
                this.f14478b[i10] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f14477a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap map3 = this.f14477a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        p1.a aVar = this.f14479c.f14503a;
        if (!(aVar != null && ((q1.b) aVar).f16098b.isOpen())) {
            return false;
        }
        if (!this.f14481e) {
            this.f14479c.f14505c.i();
        }
        if (this.f14481e) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(p1.a aVar, int i10) {
        q1.b bVar = (q1.b) aVar;
        bVar.c(ic1.m("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i10, ", 0)"));
        String str = this.f14478b[i10];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f14476j;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            kc.r.m(sb, str, "_", str2, "`");
            kc.r.m(sb, " AFTER ", str2, " ON `", str);
            kc.r.m(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            kc.r.m(sb, " = 1", " WHERE ", "table_id", " = ");
            sb.append(i10);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.c(sb.toString());
        }
    }

    public final void c(p1.a aVar) {
        if (((q1.b) aVar).f16098b.inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock lock = this.f14479c.f14510h.readLock();
                lock.lock();
                try {
                    int[] iArrA = this.f14483g.a();
                    if (iArrA == null) {
                        lock.unlock();
                        return;
                    }
                    int length = iArrA.length;
                    q1.b bVar = (q1.b) aVar;
                    bVar.a();
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            int i11 = iArrA[i10];
                            if (i11 == 1) {
                                b(aVar, i10);
                            } else if (i11 == 2) {
                                String str = this.f14478b[i10];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = f14476j;
                                for (int i12 = 0; i12 < 3; i12++) {
                                    String str2 = strArr[i12];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    ((q1.b) aVar).c(sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            bVar.b();
                            throw th;
                        }
                    }
                    bVar.f();
                    bVar.b();
                    g gVar = this.f14483g;
                    synchronized (gVar) {
                        gVar.f14472e = false;
                    }
                    lock.unlock();
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                return;
            }
        }
    }
}