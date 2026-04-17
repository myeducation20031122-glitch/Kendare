package s7;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16871a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f16872b = 64;

    /* renamed from: c, reason: collision with root package name */
    public final int f16873c;

    public b(int i10) {
        this.f16873c = i10;
    }

    public final synchronized void a(Map map) {
        String strTrim;
        try {
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                int i11 = this.f16873c;
                String strTrim2 = str.trim();
                if (strTrim2.length() > i11) {
                    strTrim2 = strTrim2.substring(0, i11);
                }
                if (this.f16871a.size() < this.f16872b || this.f16871a.containsKey(strTrim2)) {
                    String str2 = (String) entry.getValue();
                    HashMap map2 = this.f16871a;
                    if (str2 == null) {
                        strTrim = "";
                    } else {
                        int i12 = this.f16873c;
                        strTrim = str2.trim();
                        if (strTrim.length() > i12) {
                            strTrim = strTrim.substring(0, i12);
                        }
                    }
                    map2.put(strTrim2, strTrim);
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f16872b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}