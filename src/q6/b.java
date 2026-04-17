package q6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.internal.ads.ic1;
import com.isprid.kendare.model.DDevice;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kc.r;
import kotlin.jvm.internal.Intrinsics;
import o0.y;
import org.json.JSONException;
import org.json.JSONObject;
import s8.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class b implements x7.c, o, y9.b {

    /* renamed from: e, reason: collision with root package name */
    public static b f16252e;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16253b;

    public b() {
        this.f16253b = 10;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DDevice b(Context context) {
        int i10;
        Intrinsics.f(context, "context");
        String str = "";
        String str2 = Build.SERIAL;
        if (str2 == null || ec.h.w(str2)) {
            try {
                String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                if (string != null) {
                    str2 = string;
                }
            } catch (Exception unused) {
                if (str2 != null) {
                }
            }
            if (str2 != null) {
                str = str2;
            }
            str2 = str;
        } else {
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z7 = false;
            while (i11 <= length) {
                boolean z10 = Intrinsics.h(str2.charAt(!z7 ? i11 : length), 32) <= 0;
                if (z7) {
                    if (!z10) {
                        break;
                    }
                    length--;
                } else if (z10) {
                    i11++;
                } else {
                    z7 = true;
                }
            }
            if (Intrinsics.a(str2.subSequence(i11, length + 1).toString(), "unknown") || Intrinsics.a(str2, "0")) {
            }
        }
        String str3 = Build.MANUFACTURER;
        String str22 = Build.MODEL;
        Intrinsics.e(str22, "str2");
        Intrinsics.e(str3, "str");
        if (!ec.h.C(str22, str3, false)) {
            str22 = a0.h.G(str3, " ", str22);
        }
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.e(RELEASE, "RELEASE");
        String strD = d(context);
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused2) {
            i10 = -1;
        }
        return new DDevice(str2, str22, RELEASE, strD, String.valueOf(i10), "", null, 64, null);
    }

    public static String d(Context context) {
        Intrinsics.f(context, "context");
        try {
            String string = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (string == null) {
                string = context.getString(2131887112);
            }
            Intrinsics.e(string, "{\n                contex…on_unknown)\n            }");
            return string;
        } catch (PackageManager.NameNotFoundException unused) {
            String string2 = context.getString(2131887112);
            Intrinsics.e(string2, "{\n                contex…on_unknown)\n            }");
            return string2;
        }
    }

    public float a(float f10, float f11) {
        return 1.0f;
    }

    public final a9.d c(Context context) {
        a9.d aVar = d9.a.f12364c;
        if (aVar == null) {
            synchronized (this) {
                aVar = d9.a.f12364c;
                if (aVar == null) {
                    aVar = new d9.a(context);
                    d9.a.f12364c = aVar;
                }
            }
        }
        return aVar;
    }

    @Override // x7.c
    public final x7.a f(b bVar, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        int i10 = 4;
        y yVar = jSONObject.has("session") ? new y(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), i10) : new y(new JSONObject().optInt("max_custom_exception_events", 8), i10);
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        m2.f fVar = new m2.f(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false));
        long j10 = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            bVar.getClass();
            jCurrentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
        }
        return new x7.a(jCurrentTimeMillis, yVar, fVar, dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // y9.b
    public final String g() {
        String language;
        language = Locale.getDefault().getLanguage();
        language.getClass();
        language.hashCode();
        switch (language) {
            case "in":
                return "id";
            case "iw":
                return "he";
            case "ji":
                return "yi";
            case "zh":
                StringBuilder sbO = ic1.o(language, "-");
                sbO.append(Locale.getDefault().getCountry());
                return sbO.toString();
            default:
                return language;
        }
    }

    @Override // s8.o
    public final Object j() {
        switch (this.f16253b) {
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                return new LinkedHashSet();
            case y4.g.NETWORK_ERROR /* 7 */:
                return new ArrayList();
            case 8:
                return new ConcurrentHashMap();
            default:
                return new LinkedHashMap();
        }
    }

    public final String toString() {
        switch (this.f16253b) {
            case 29:
                return "NULL_VALUE";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(int i10) {
        this.f16253b = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        this(11);
        this.f16253b = i10;
        switch (i10) {
            case 12:
                this(12);
                break;
            case y4.g.ERROR /* 13 */:
                this(13);
                break;
            case y4.g.INTERRUPTED /* 14 */:
                this(14);
                break;
            case y4.g.TIMEOUT /* 15 */:
                this(15);
                break;
            case y4.g.CANCELED /* 16 */:
                this(16);
                break;
            case y4.g.API_NOT_CONNECTED /* 17 */:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case y4.g.REMOTE_EXCEPTION /* 19 */:
                this(19);
                break;
            case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                this(20);
                break;
            case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                this(21);
                break;
            case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                this(22);
                break;
            case 23:
            default:
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj) {
        this(0);
        this.f16253b = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(r rVar) {
        this(1);
        this.f16253b = 1;
    }
}