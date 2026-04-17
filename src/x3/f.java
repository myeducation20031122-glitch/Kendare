package x3;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class f implements j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18924b = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f18925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18926f;

    public /* synthetic */ f(long j10, r3.i iVar) {
        this.f18925e = j10;
        this.f18926f = iVar;
    }

    @Override // x3.j
    public final Object apply(Object obj) {
        int i10 = this.f18924b;
        int i11 = 1;
        long j10 = this.f18925e;
        Object obj2 = this.f18926f;
        switch (i10) {
            case 0:
                l lVar = (l) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                lVar.getClass();
                String[] strArr = {String.valueOf(j10)};
                l.h(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new h(lVar, i11));
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            default:
                r3.i iVar = (r3.i) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j10));
                String str = iVar.f16409a;
                o3.d dVar = iVar.f16411c;
                if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(a4.a.a(dVar))}) < 1) {
                    contentValues.put("backend_name", iVar.f16409a);
                    contentValues.put("priority", Integer.valueOf(a4.a.a(dVar)));
                    sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                return null;
        }
    }

    public /* synthetic */ f(l lVar, long j10) {
        this.f18926f = lVar;
        this.f18925e = j10;
    }
}