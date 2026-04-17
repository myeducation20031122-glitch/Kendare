package a5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t.k f414a = new t.k();

    /* renamed from: b, reason: collision with root package name */
    public static Locale f415b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = g5.b.a(context).f883b;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i10 == 1) {
            return resources.getString(2131886332, strA);
        }
        if (i10 == 2) {
            return com.bumptech.glide.c.e(context) ? resources.getString(2131886342) : resources.getString(2131886339, strA);
        }
        if (i10 == 3) {
            return resources.getString(2131886329, strA);
        }
        if (i10 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i10 == 7) {
            return d(context, "common_google_play_services_network_error_text", strA);
        }
        if (i10 == 9) {
            return resources.getString(2131886337, strA);
        }
        if (i10 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i10) {
            case y4.g.CANCELED /* 16 */:
                return d(context, "common_google_play_services_api_unavailable_text", strA);
            case y4.g.API_NOT_CONNECTED /* 17 */:
                return d(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(2131886341, strA);
            default:
                return resources.getString(2131886336, strA);
        }
    }

    public static String c(Context context, int i10) {
        String str;
        Resources resources = context.getResources();
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                return resources.getString(2131886333);
            case 2:
                return resources.getString(2131886340);
            case 3:
                return resources.getString(2131886330);
            case 4:
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
            case 18:
                return null;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case y4.g.NETWORK_ERROR /* 7 */:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 12:
            case y4.g.ERROR /* 13 */:
            case y4.g.INTERRUPTED /* 14 */:
            case y4.g.TIMEOUT /* 15 */:
            case y4.g.REMOTE_EXCEPTION /* 19 */:
            default:
                str = "Unexpected error code " + i10;
                break;
            case y4.g.CANCELED /* 16 */:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case y4.g.API_NOT_CONNECTED /* 17 */:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    public static String d(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strE = e(context, str);
        if (strE == null) {
            strE = resources.getString(2131886336);
        }
        return String.format(resources.getConfiguration().locale, strE, str2);
    }

    public static String e(Context context, String str) {
        Resources resourcesForApplication;
        t.k kVar = f414a;
        synchronized (kVar) {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                Locale locale = (Build.VERSION.SDK_INT >= 24 ? new k0.i(new k0.l(k0.f.a(configuration))) : k0.i.a(configuration.locale)).f13944a.get(0);
                if (!locale.equals(f415b)) {
                    kVar.clear();
                    f415b = locale;
                }
                String str2 = (String) kVar.getOrDefault(str, null);
                if (str2 != null) {
                    return str2;
                }
                int i10 = x4.i.f18965e;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication == null) {
                    return null;
                }
                int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    return null;
                }
                String string = resourcesForApplication.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    return null;
                }
                f414a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}