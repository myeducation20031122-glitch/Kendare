package d9;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.isprid.kendare.model.DSetting;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, "horoscope.db", (SQLiteDatabase.CursorFactory) null, 1);
        Intrinsics.f(context, "context");
    }

    public final void a(DSetting dSetting) {
        try {
            getWritableDatabase().delete("about", null, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", dSetting.getAppName());
            contentValues.put("logo", dSetting.getAppLogo());
            contentValues.put("version", dSetting.getAppVersion());
            contentValues.put("author", dSetting.getAppAuthor());
            contentValues.put("contact", dSetting.getAppContact());
            contentValues.put("email", dSetting.getAppEmail());
            contentValues.put("website", dSetting.getAppWebsite());
            contentValues.put("description", dSetting.getAppDescription());
            contentValues.put("developed", dSetting.getAppDevelopedBy());
            contentValues.put("privacy", dSetting.getAppPrivacyPolicy());
            contentValues.put("ad_pub", "");
            contentValues.put("ad_banner", g5.a.f13041m);
            contentValues.put("ad_inter", g5.a.f13043o);
            Boolean bool = Boolean.FALSE;
            contentValues.put("is_banner", bool);
            contentValues.put("is_inter", bool);
            contentValues.put("is_native", bool);
            contentValues.put("click", (Integer) 5);
            getWritableDatabase().insert("about", null, contentValues);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase db) throws SQLException {
        Intrinsics.f(db, "db");
        db.execSQL("CREATE TABLE IF NOT EXISTS horoscope(_id INTEGER PRIMARY KEY,name TEXT,birthPlace TEXT,lagna INTEGER,birthDateTime INTEGER,latitude INTEGER,longitude INTEGER,timeZone INTEGER,createdAt INTEGER,status INTEGER)");
        db.execSQL("CREATE TABLE IF NOT EXISTS condition(_id INTEGER PRIMARY KEY,condition TEXT,conditionDetail TEXT,titleEn TEXT,titleSn TEXT,orderNo INTEGER)");
        db.execSQL("CREATE TABLE IF NOT EXISTS prediction(_id INTEGER PRIMARY KEY,conditionId INTEGER,sinhala TEXT,english TEXT,related TEXT,book INTEGER,howMuch INTEGER)");
        db.execSQL("create table about (name TEXT, logo TEXT, version TEXT, author TEXT, contact TEXT, email TEXT, website TEXT, description TEXT, developed TEXT, privacy TEXT, ad_pub TEXT, ad_banner TEXT, ad_inter TEXT, ad_native TEXT, is_banner TEXT, is_inter TEXT, is_native TEXT, is_open TEXT, click TEXT);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase db, int i10, int i11) {
        Intrinsics.f(db, "db");
    }
}