package x3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class h implements j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18930b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f18931e;

    public /* synthetic */ h(l lVar, int i10) {
        this.f18930b = i10;
        this.f18931e = lVar;
    }

    @Override // x3.j
    public final Object apply(Object obj) {
        int i10 = this.f18930b;
        l lVar = this.f18931e;
        switch (i10) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                lVar.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + ((z3.c) lVar.f18938e).a()).execute();
                break;
            case QueueFuseable.SYNC /* 1 */:
                Cursor cursor = (Cursor) obj;
                lVar.getClass();
                while (cursor.moveToNext()) {
                    lVar.c(new w3.j(cursor.getString(1), cursor.getInt(0), u3.c.MESSAGE_TOO_OLD));
                }
                break;
            default:
                Cursor cursor2 = (Cursor) obj;
                lVar.getClass();
                while (cursor2.moveToNext()) {
                    lVar.c(new w3.j(cursor2.getString(1), cursor2.getInt(0), u3.c.MAX_RETRIES_REACHED));
                }
                break;
        }
        return null;
    }
}