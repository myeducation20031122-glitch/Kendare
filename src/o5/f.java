package o5;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.le;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Application f15727a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f15728b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f15729c;

    public f(Application application) {
        this.f15727a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f15728b = sharedPreferences;
        this.f15729c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.emptySet()));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[PHI: r2 r4
      0x0037: PHI (r2v6 java.lang.String) = (r2v4 java.lang.String), (r2v9 java.lang.String), (r2v11 java.lang.String) binds: [B:8:0x0035, B:15:0x0062, B:32:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v4 java.lang.String), (r4v9 java.lang.String) binds: [B:8:0x0035, B:15:0x0062, B:32:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HashMap a() {
        String strValueOf;
        String str;
        String strConcat;
        String string;
        Set<String> stringSet = this.f15728b.getStringSet("stored_info", Collections.emptySet());
        HashMap map = new HashMap();
        for (String str2 : stringSet) {
            Application application = this.f15727a;
            le leVarE = dq0.E(application, str2);
            if (leVarE == null) {
                strValueOf = String.valueOf(str2);
                str = "Fetching request info: failed for key: ";
                strConcat = strValueOf.length() != 0 ? str.concat(strValueOf) : new String("Fetching request info: failed for key: ");
                Log.d("UserMessagingPlatform", strConcat);
            } else {
                Object obj = application.getSharedPreferences(leVarE.f6293b, 0).getAll().get(leVarE.f6294e);
                if (obj == null) {
                    strValueOf = String.valueOf(str2);
                    str = "Stored info not exists: ";
                    if (strValueOf.length() == 0) {
                        strConcat = new String("Stored info not exists: ");
                    }
                    Log.d("UserMessagingPlatform", strConcat);
                } else {
                    if (obj instanceof Boolean) {
                        string = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        strValueOf = String.valueOf(str2);
                        str = "Failed to fetch stored info: ";
                        if (strValueOf.length() == 0) {
                            strConcat = new String("Failed to fetch stored info: ");
                        }
                        Log.d("UserMessagingPlatform", strConcat);
                    }
                    map.put(str2, string);
                }
            }
        }
        return map;
    }
}