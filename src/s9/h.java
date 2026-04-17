package s9;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.isprid.kendare.MyApplication;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static h f16959c;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f16960a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences.Editor f16961b;

    public h() {
        SharedPreferences sharedPreferences = MyApplication.f11640b.q().getSharedPreferences("preferences", 0);
        this.f16960a = sharedPreferences;
        this.f16961b = sharedPreferences.edit();
    }

    public final boolean a(String str) {
        try {
            String strTrim = this.f16960a.getString(str, Base64.encodeToString(String.valueOf(false).getBytes(), 0)).trim();
            Log.e("ENC", str + " > " + strTrim);
            return Boolean.parseBoolean(new String(Base64.decode(strTrim, 0)));
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}