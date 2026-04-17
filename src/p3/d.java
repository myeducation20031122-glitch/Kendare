package p3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import m.s3;
import o5.y;
import p5.g;
import q3.f0;
import q3.g0;
import q3.k;
import s3.h;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final g f15928a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f15929b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f15930c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f15931d;

    /* renamed from: e, reason: collision with root package name */
    public final z3.a f15932e;

    /* renamed from: f, reason: collision with root package name */
    public final z3.a f15933f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15934g;

    public d(Context context, z3.a aVar, z3.a aVar2) {
        d8.d dVar = new d8.d();
        k.f16187a.a(dVar);
        dVar.f12356d = true;
        this.f15928a = new g(dVar);
        this.f15930c = context;
        this.f15929b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f15931d = b(a.f15916c);
        this.f15932e = aVar2;
        this.f15933f = aVar;
        this.f15934g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(a0.h.v("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r3.h a(r3.h hVar) {
        int type;
        int subtype;
        Map map;
        NetworkInfo activeNetworkInfo = this.f15929b.getActiveNetworkInfo();
        s3 s3VarC = hVar.c();
        int i10 = Build.VERSION.SDK_INT;
        Map map2 = (Map) s3VarC.f14932n;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i10));
        s3VarC.a("model", Build.MODEL);
        s3VarC.a("hardware", Build.HARDWARE);
        s3VarC.a("device", Build.DEVICE);
        s3VarC.a("product", Build.PRODUCT);
        s3VarC.a("os-uild", Build.ID);
        s3VarC.a("manufacturer", Build.MANUFACTURER);
        s3VarC.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS;
        Map map3 = (Map) s3VarC.f14932n;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = g0.f16163b;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        Map map4 = (Map) s3VarC.f14932n;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = f0.f16159b;
                subtype = 100;
            } else if (((f0) f0.f16159b.get(subtype)) == null) {
            }
            map = (Map) s3VarC.f14932n;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            s3VarC.a(PlaceTypes.COUNTRY, Locale.getDefault().getCountry());
            s3VarC.a("locale", Locale.getDefault().getLanguage());
            Context context = this.f15930c;
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            s3VarC.a("mcc_mnc", simOperator);
            try {
                i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e10) {
                y.h("CctTransportBackend", "Unable to find version code for package", e10);
            }
            s3VarC.a("application_build", Integer.toString(i11));
            return s3VarC.c();
        }
        SparseArray sparseArray3 = f0.f16159b;
        subtype = 0;
        map = (Map) s3VarC.f14932n;
        if (map != null) {
        }
    }
}