package x3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class i implements j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18932b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f18933e;

    public /* synthetic */ i(int i10, long j10) {
        this.f18932b = i10;
        this.f18933e = j10;
    }

    @Override // x3.j
    public final Object apply(Object obj) {
        int i10 = this.f18932b;
        long j10 = this.f18933e;
        switch (i10) {
            case 0:
                return (u3.g) l.h(((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new i(1, j10));
            default:
                Cursor cursor = (Cursor) obj;
                cursor.moveToNext();
                return new u3.g(cursor.getLong(0), j10);
        }
    }
}