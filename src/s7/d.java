package s7;

import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final v7.b f16877a;

    static {
        Charset.forName("UTF-8");
    }

    public d(v7.b bVar) {
        this.f16877a = bVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static void d(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [long] */
    public final Map b(String str, boolean z7) throws Throwable {
        FileInputStream fileInputStream;
        Exception e10;
        v7.b bVar = this.f16877a;
        File fileG = z7 ? bVar.g(str, "internal-keys") : bVar.g(str, "keys");
        if (fileG.exists()) {
            ?? length = fileG.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(fileG);
                        try {
                            HashMap mapA = a(r7.e.j(fileInputStream));
                            r7.e.a(fileInputStream, "Failed to close user metadata file.");
                            return mapA;
                        } catch (Exception e11) {
                            e10 = e11;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e10);
                            d(fileG);
                            r7.e.a(fileInputStream, "Failed to close user metadata file.");
                            return Collections.emptyMap();
                        }
                    } catch (Throwable th) {
                        th = th;
                        closeable = length;
                        r7.e.a(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e12) {
                    fileInputStream = null;
                    e10 = e12;
                } catch (Throwable th2) {
                    th = th2;
                    r7.e.a(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        d(fileG);
        return Collections.emptyMap();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public final String c(String str) {
        FileInputStream fileInputStream;
        File fileG = this.f16877a.g(str, "user-data");
        Closeable closeable = null;
        if (fileG.exists()) {
            ?? r32 = (fileG.length() > 0L ? 1 : (fileG.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileG);
                        try {
                            JSONObject jSONObject = new JSONObject(r7.e.j(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            r7.e.a(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e10) {
                            e = e10;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            d(fileG);
                            r7.e.a(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        r7.e.a(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r32;
            }
        }
        String strV = a0.h.v("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strV, null);
        }
        d(fileG);
        return null;
    }
}