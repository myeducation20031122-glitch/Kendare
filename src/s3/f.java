package s3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16847a;

    /* renamed from: b, reason: collision with root package name */
    public Map f16848b = null;

    public f(Context context) {
        this.f16847a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CctBackendFactory a(String str) throws PackageManager.NameNotFoundException {
        String str2;
        String str3;
        Bundle bundle;
        Map mapEmptyMap;
        PackageManager packageManager;
        String str4;
        if (this.f16848b == null) {
            Context context = this.f16847a;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                str4 = "Context has no PackageManager.";
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    str4 = "TransportBackendDiscovery has no service info.";
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        mapEmptyMap = Collections.emptyMap();
                    } else {
                        HashMap map = new HashMap();
                        for (String str5 : bundle.keySet()) {
                            Object obj = bundle.get(str5);
                            if ((obj instanceof String) && str5.startsWith("backend:")) {
                                for (String str6 : ((String) obj).split(",", -1)) {
                                    String strTrim = str6.trim();
                                    if (!strTrim.isEmpty()) {
                                        map.put(strTrim, str5.substring(8));
                                    }
                                }
                            }
                        }
                        mapEmptyMap = map;
                    }
                    this.f16848b = mapEmptyMap;
                }
            }
            Log.w("BackendRegistry", str4);
            bundle = null;
            if (bundle != null) {
            }
            this.f16848b = mapEmptyMap;
        }
        String str7 = (String) this.f16848b.get(str);
        if (str7 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str7).asSubclass(CctBackendFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e10) {
            e = e10;
            str2 = String.format("Class %s is not found.", str7);
            Log.w("BackendRegistry", str2, e);
            return null;
        } catch (IllegalAccessException e11) {
            e = e11;
            str3 = String.format("Could not instantiate %s.", str7);
            Log.w("BackendRegistry", str3, e);
            return null;
        } catch (InstantiationException e12) {
            e = e12;
            str3 = String.format("Could not instantiate %s.", str7);
            Log.w("BackendRegistry", str3, e);
            return null;
        } catch (NoSuchMethodException e13) {
            e = e13;
            str2 = String.format("Could not instantiate %s", str7);
            Log.w("BackendRegistry", str2, e);
            return null;
        } catch (InvocationTargetException e14) {
            e = e14;
            str2 = String.format("Could not instantiate %s", str7);
            Log.w("BackendRegistry", str2, e);
            return null;
        }
    }
}