package r7;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import j4.i2;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r implements s {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f16628g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    public static final String f16629h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    public final androidx.emoji2.text.t f16630a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16631b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16632c;

    /* renamed from: d, reason: collision with root package name */
    public final j8.d f16633d;

    /* renamed from: e, reason: collision with root package name */
    public final i2 f16634e;

    /* renamed from: f, reason: collision with root package name */
    public String f16635f;

    public r(Context context, String str, j8.d dVar, i2 i2Var) {
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f16631b = context;
        this.f16632c = str;
        this.f16633d = dVar;
        this.f16634e = i2Var;
        this.f16630a = new androidx.emoji2.text.t();
    }

    public static String b() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        String string = UUID.randomUUID().toString();
        lowerCase = string == null ? null : f16628g.matcher(string).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final synchronized String c() {
        String strA;
        String strB;
        try {
            String str = this.f16635f;
            if (str != null) {
                return str;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Determining Crashlytics installation ID...", null);
            }
            SharedPreferences sharedPreferences = this.f16631b.getSharedPreferences("com.google.firebase.crashlytics", 0);
            String string = sharedPreferences.getString("firebase.installation.id", null);
            String str2 = "Cached Firebase Installation ID: " + string;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str2, null);
            }
            if (this.f16634e.b()) {
                try {
                    strB = (String) v.a(((j8.c) this.f16633d).d());
                } catch (Exception e10) {
                    Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installations ID.", e10);
                    strB = null;
                }
                String str3 = "Fetched Firebase Installation ID: " + strB;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", str3, null);
                }
                if (strB == null) {
                    strB = string == null ? b() : string;
                }
                strA = strB.equals(string) ? sharedPreferences.getString("crashlytics.installation.id", null) : a(sharedPreferences, strB);
            } else {
                strA = (string == null || !string.startsWith("SYN_")) ? a(sharedPreferences, b()) : sharedPreferences.getString("crashlytics.installation.id", null);
            }
            this.f16635f = strA;
            if (this.f16635f == null) {
                Log.w("FirebaseCrashlytics", "Unable to determine Crashlytics Install Id, creating a new one.", null);
                this.f16635f = a(sharedPreferences, b());
            }
            String str4 = "Crashlytics installation ID: " + this.f16635f;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str4, null);
            }
            return this.f16635f;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String d() {
        String str;
        androidx.emoji2.text.t tVar = this.f16630a;
        Context context = this.f16631b;
        synchronized (tVar) {
            try {
                if (tVar.f887b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    tVar.f887b = installerPackageName;
                }
                str = "".equals(tVar.f887b) ? null : tVar.f887b;
            } finally {
            }
        }
        return str;
    }
}