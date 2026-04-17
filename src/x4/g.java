package x4;

import a5.i0;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f18963a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f18964b;

    static {
        AtomicBoolean atomicBoolean = j.f18966a;
        f18963a = 12451000;
        f18964b = new g();
    }

    public static int a(Context context) {
        AtomicBoolean atomicBoolean = j.f18966a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public Intent b(int i10, Context context, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && com.bumptech.glide.c.e(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f18963a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(g5.b.a(context).g(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public final PendingIntent c(Context context, int i10, int i11, String str) {
        Intent intentB = b(i10, context, str);
        if (intentB == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, intentB, n5.b.f15356a | 134217728);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int d(Context context, int i10) {
        boolean z7;
        String strValueOf;
        String str;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        AtomicBoolean atomicBoolean = j.f18966a;
        try {
            context.getResources().getString(2131886336);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !j.f18969d.get()) {
            synchronized (i0.f345a) {
                try {
                    if (!i0.f346b) {
                        i0.f346b = true;
                        try {
                            Bundle bundle = g5.b.a(context).f(128, context.getPackageName()).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                i0.f347c = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e10);
                        }
                    }
                } finally {
                }
            }
            int i11 = i0.f347c;
            if (i11 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i11 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + f18963a + " but found " + i11 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        int i12 = 0;
        if (com.bumptech.glide.c.e(context)) {
            z7 = false;
        } else {
            if (com.bumptech.glide.c.f2240d == null) {
                com.bumptech.glide.c.f2240d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (!com.bumptech.glide.c.f2240d.booleanValue()) {
                z7 = true;
            }
        }
        fc.t.c(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z7) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                strValueOf = String.valueOf(packageName);
                str = " requires the Google Play Store, but it is missing.";
            }
        } else {
            packageInfo = null;
        }
        try {
            packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            k.c(context);
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        if (k.f(packageInfo2, true)) {
            if (z7) {
                fc.t.k(packageInfo);
                if (!k.f(packageInfo, true)) {
                    strValueOf = String.valueOf(packageName);
                    str = " requires Google Play Store, but its signature is invalid.";
                } else if (!z7 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    int i13 = packageInfo2.versionCode;
                    if ((i13 == -1 ? -1 : i13 / com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS) < (i10 != -1 ? i10 / com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS : -1)) {
                        Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + i13);
                        i12 = 2;
                    } else {
                        ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e11) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e11);
                                i12 = 1;
                                if (i12 == 18) {
                                }
                                return 18;
                            }
                        }
                        if (!applicationInfo.enabled) {
                            i12 = 3;
                        }
                    }
                } else {
                    strValueOf = String.valueOf(packageName);
                    str = " requires Google Play Store, but its signature doesn't match that of Google Play services.";
                }
            }
            if (i12 == 18 || (i12 == 1 && j.b(context))) {
                return 18;
            }
            return i12;
        }
        strValueOf = String.valueOf(packageName);
        str = " requires Google Play services, but their signature is invalid.";
        Log.w("GooglePlayServicesUtil", strValueOf.concat(str));
        i12 = 9;
        if (i12 == 18) {
            return i12;
        }
        return 18;
    }
}