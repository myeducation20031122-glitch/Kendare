package w3;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class j implements y3.b, x3.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18631b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18633f;

    public /* synthetic */ j(Object obj, long j10, Object obj2) {
        this.f18632e = obj;
        this.f18633f = obj2;
        this.f18631b = j10;
    }

    @Override // x3.j
    public final Object apply(Object obj) throws SQLException {
        String str = (String) this.f18632e;
        u3.c cVar = (u3.c) this.f18633f;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        o3.c cVar2 = x3.l.f18936n;
        boolean zBooleanValue = ((Boolean) x3.l.h(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(cVar.f18262b)}), new o0.h(15))).booleanValue();
        long j10 = this.f18631b;
        int i10 = cVar.f18262b;
        if (zBooleanValue) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i10));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    @Override // y3.b
    public final Object execute() {
        k kVar = (k) this.f18632e;
        r3.i iVar = (r3.i) this.f18633f;
        long jA = ((z3.c) kVar.f18640g).a() + this.f18631b;
        x3.l lVar = (x3.l) kVar.f18636c;
        lVar.getClass();
        lVar.c(new x3.f(jA, iVar));
        return null;
    }
}