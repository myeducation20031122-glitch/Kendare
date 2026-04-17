package t5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j extends SQLiteOpenHelper {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17434b = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0.j f17435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f17435e = kVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        int i10 = this.f17434b;
        m0.j jVar = this.f17435e;
        switch (i10) {
            case 0:
                k kVar = (k) jVar;
                androidx.recyclerview.widget.i iVar = kVar.f17462m;
                ((b4) kVar.f15046b).getClass();
                if (iVar.f1471b != 0) {
                    ((e5.b) ((e5.a) iVar.f1472c)).getClass();
                    if (SystemClock.elapsedRealtime() - iVar.f1471b < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    androidx.recyclerview.widget.i iVar2 = kVar.f17462m;
                    ((e5.b) ((e5.a) iVar2.f1472c)).getClass();
                    iVar2.f1471b = SystemClock.elapsedRealtime();
                    i3 i3Var = ((b4) kVar.f15046b).f17251w;
                    b4.i(i3Var);
                    i3Var.f17397n.a("Opening the database failed, dropping and recreating it");
                    ((b4) kVar.f15046b).getClass();
                    if (!((b4) kVar.f15046b).f17234b.getDatabasePath("google_app_measurement.db").delete()) {
                        i3 i3Var2 = ((b4) kVar.f15046b).f17251w;
                        b4.i(i3Var2);
                        i3Var2.f17397n.b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        ((k) jVar).f17462m.f1471b = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e10) {
                        i3 i3Var3 = ((b4) kVar.f15046b).f17251w;
                        b4.i(i3Var3);
                        i3Var3.f17397n.b(e10, "Failed to open freshly created database");
                        throw e10;
                    }
                }
            default:
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e11) {
                    throw e11;
                } catch (SQLiteException unused2) {
                    e3 e3Var = (e3) jVar;
                    i3 i3Var4 = ((b4) e3Var.f15046b).f17251w;
                    b4.i(i3Var4);
                    i3Var4.f17397n.a("Opening the local database failed, dropping and recreating it");
                    ((b4) e3Var.f15046b).getClass();
                    if (!((b4) e3Var.f15046b).f17234b.getDatabasePath("google_app_measurement_local.db").delete()) {
                        i3 i3Var5 = ((b4) e3Var.f15046b).f17251w;
                        b4.i(i3Var5);
                        i3Var5.f17397n.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e12) {
                        i3 i3Var6 = ((b4) e3Var.f15046b).f17251w;
                        b4.i(i3Var6);
                        i3Var6.f17397n.b(e12, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i10 = this.f17434b;
        m0.j jVar = this.f17435e;
        switch (i10) {
            case 0:
                i3 i3Var = ((b4) ((k) jVar).f15046b).f17251w;
                b4.i(i3Var);
                j4.X(i3Var, sQLiteDatabase);
                break;
            default:
                i3 i3Var2 = ((b4) ((e3) jVar).f15046b).f17251w;
                b4.i(i3Var2);
                j4.X(i3Var2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        int i10 = this.f17434b;
        m0.j jVar = this.f17435e;
        switch (i10) {
            case 0:
                k kVar = (k) jVar;
                i3 i3Var = ((b4) kVar.f15046b).f17251w;
                b4.i(i3Var);
                j4.U(i3Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", k.f17457n);
                i3 i3Var2 = ((b4) kVar.f15046b).f17251w;
                b4.i(i3Var2);
                j4.U(i3Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                i3 i3Var3 = ((b4) kVar.f15046b).f17251w;
                b4.i(i3Var3);
                j4.U(i3Var3, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", k.f17458t);
                i3 i3Var4 = ((b4) kVar.f15046b).f17251w;
                b4.i(i3Var4);
                j4.U(i3Var4, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", k.f17459u);
                i3 i3Var5 = ((b4) kVar.f15046b).f17251w;
                b4.i(i3Var5);
                j4.U(i3Var5, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", k.M);
                i3 i3Var6 = ((b4) kVar.f15046b).f17251w;
                b4.i(i3Var6);
                j4.U(i3Var6, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                i3 i3Var7 = ((b4) kVar.f15046b).f17251w;
                b4.i(i3Var7);
                j4.U(i3Var7, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", k.f17460w);
                i3 i3Var8 = ((b4) kVar.f15046b).f17251w;
                b4.i(i3Var8);
                j4.U(i3Var8, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", k.N);
                i3 i3Var9 = ((b4) kVar.f15046b).f17251w;
                b4.i(i3Var9);
                j4.U(i3Var9, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", k.O);
                i3 i3Var10 = ((b4) kVar.f15046b).f17251w;
                b4.i(i3Var10);
                j4.U(i3Var10, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                i3 i3Var11 = ((b4) kVar.f15046b).f17251w;
                b4.i(i3Var11);
                j4.U(i3Var11, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", k.P);
                i3 i3Var12 = ((b4) kVar.f15046b).f17251w;
                b4.i(i3Var12);
                j4.U(i3Var12, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                i3 i3Var13 = ((b4) kVar.f15046b).f17251w;
                b4.i(i3Var13);
                j4.U(i3Var13, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                i3 i3Var14 = ((b4) kVar.f15046b).f17251w;
                b4.i(i3Var14);
                j4.U(i3Var14, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", null);
                break;
            default:
                i3 i3Var15 = ((b4) ((e3) jVar).f15046b).f17251w;
                b4.i(i3Var15);
                j4.U(i3Var15, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e3 e3Var, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f17435e = e3Var;
    }
}