package t5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.dq0;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d3 extends m3 {
    public String M;
    public int N;
    public String O;
    public String P;
    public String Q;
    public long R;
    public String S;

    /* renamed from: f, reason: collision with root package name */
    public String f17293f;

    /* renamed from: j, reason: collision with root package name */
    public String f17294j;

    /* renamed from: m, reason: collision with root package name */
    public int f17295m;

    /* renamed from: n, reason: collision with root package name */
    public String f17296n;

    /* renamed from: t, reason: collision with root package name */
    public long f17297t;

    /* renamed from: u, reason: collision with root package name */
    public final long f17298u;

    /* renamed from: w, reason: collision with root package name */
    public List f17299w;

    public d3(b4 b4Var, long j10) {
        super(b4Var);
        this.R = 0L;
        this.S = null;
        this.f17298u = j10;
    }

    @Override // t5.m3
    public final boolean r() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0130 A[Catch: IllegalStateException -> 0x0160, TryCatch #2 {IllegalStateException -> 0x0160, blocks: (B:49:0x0113, B:52:0x0128, B:54:0x0130, B:58:0x014c, B:61:0x0157, B:64:0x015d, B:57:0x0148, B:68:0x0164, B:70:0x0179, B:72:0x017e, B:71:0x017c), top: B:113:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0164 A[Catch: IllegalStateException -> 0x0160, TryCatch #2 {IllegalStateException -> 0x0160, blocks: (B:49:0x0113, B:52:0x0128, B:54:0x0130, B:58:0x014c, B:61:0x0157, B:64:0x015d, B:57:0x0148, B:68:0x0164, B:70:0x0179, B:72:0x017e, B:71:0x017c), top: B:113:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        String str;
        boolean z7;
        int iJ;
        i3 i3Var;
        String str2;
        i3 i3Var2;
        g3 g3Var;
        List<String> listAsList;
        Bundle bundleW;
        Integer numValueOf;
        String strS1;
        String string;
        Object obj = this.f15046b;
        b4 b4Var = (b4) obj;
        String packageName = b4Var.f17234b.getPackageName();
        PackageManager packageManager = b4Var.f17234b.getPackageManager();
        String str3 = "Unknown";
        int i10 = Integer.MIN_VALUE;
        String installerPackageName = "unknown";
        if (packageManager == null) {
            i3 i3Var3 = b4Var.f17251w;
            b4.i(i3Var3);
            i3Var3.f17397n.b(i3.y(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
        } else {
            try {
                installerPackageName = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                i3 i3Var4 = b4Var.f17251w;
                b4.i(i3Var4);
                i3Var4.f17397n.b(i3.y(packageName), "Error retrieving app installer package name. appId");
            }
            if (installerPackageName == null) {
                installerPackageName = "manual_install";
            } else if ("com.android.vending".equals(installerPackageName)) {
                installerPackageName = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(((b4) obj).f17234b.getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    String string2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                    try {
                        str3 = packageInfo.versionName;
                        i10 = packageInfo.versionCode;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str = str3;
                        str3 = string2;
                        i3 i3Var5 = b4Var.f17251w;
                        b4.i(i3Var5);
                        i3Var5.f17397n.c(i3.y(packageName), "Error retrieving package info. appId, appName", str3);
                        str3 = str;
                        this.f17293f = packageName;
                        this.f17296n = installerPackageName;
                        this.f17294j = str3;
                        this.f17295m = i10;
                        this.f17297t = 0L;
                        if (TextUtils.isEmpty(b4Var.f17238e)) {
                        }
                        iJ = b4Var.j();
                        switch (iJ) {
                        }
                        g3Var.a(str2);
                        this.O = "";
                        this.P = "";
                        b4Var.getClass();
                        if (z7) {
                        }
                        listAsList = null;
                        strS1 = dq0.s1(((b4) obj).f17234b, ((b4) obj).V);
                        this.O = true != TextUtils.isEmpty(strS1) ? strS1 : "";
                        if (!TextUtils.isEmpty(strS1)) {
                        }
                        if (iJ == 0) {
                        }
                        this.f17299w = null;
                        b4Var.getClass();
                        f fVar = b4Var.f17249t;
                        fVar.getClass();
                        fc.t.g("analytics.safelisted_events");
                        bundleW = fVar.w();
                        Object obj2 = fVar.f15046b;
                        if (bundleW != null) {
                        }
                        numValueOf = null;
                        if (numValueOf != null) {
                        }
                        if (listAsList == null) {
                        }
                        if (packageManager == null) {
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str = "Unknown";
            }
        }
        this.f17293f = packageName;
        this.f17296n = installerPackageName;
        this.f17294j = str3;
        this.f17295m = i10;
        this.f17297t = 0L;
        z7 = TextUtils.isEmpty(b4Var.f17238e) && "am".equals(b4Var.f17240f);
        iJ = b4Var.j();
        switch (iJ) {
            case 0:
                i3Var = b4Var.f17251w;
                b4.i(i3Var);
                str2 = "App measurement collection enabled";
                g3Var = i3Var.Q;
                break;
            case QueueFuseable.SYNC /* 1 */:
                i3Var2 = b4Var.f17251w;
                b4.i(i3Var2);
                str2 = "App measurement deactivated via the manifest";
                g3Var = i3Var2.O;
                break;
            case 2:
                i3Var = b4Var.f17251w;
                b4.i(i3Var);
                str2 = "App measurement deactivated via the init parameters";
                g3Var = i3Var.Q;
                break;
            case 3:
                i3Var2 = b4Var.f17251w;
                b4.i(i3Var2);
                str2 = "App measurement disabled by setAnalyticsCollectionEnabled(false)";
                g3Var = i3Var2.O;
                break;
            case 4:
                i3Var2 = b4Var.f17251w;
                b4.i(i3Var2);
                str2 = "App measurement disabled via the manifest";
                g3Var = i3Var2.O;
                break;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                i3Var = b4Var.f17251w;
                b4.i(i3Var);
                str2 = "App measurement disabled via the init parameters";
                g3Var = i3Var.Q;
                break;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                i3 i3Var6 = b4Var.f17251w;
                b4.i(i3Var6);
                str2 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics";
                g3Var = i3Var6.N;
                break;
            case y4.g.NETWORK_ERROR /* 7 */:
                i3Var2 = b4Var.f17251w;
                b4.i(i3Var2);
                str2 = "App measurement disabled via the global data collection setting";
                g3Var = i3Var2.O;
                break;
            default:
                i3Var2 = b4Var.f17251w;
                b4.i(i3Var2);
                str2 = "App measurement disabled due to denied storage consent";
                g3Var = i3Var2.O;
                break;
        }
        g3Var.a(str2);
        this.O = "";
        this.P = "";
        b4Var.getClass();
        if (z7) {
            this.P = b4Var.f17238e;
        }
        listAsList = null;
        try {
            strS1 = dq0.s1(((b4) obj).f17234b, ((b4) obj).V);
            this.O = true != TextUtils.isEmpty(strS1) ? strS1 : "";
        } catch (IllegalStateException e10) {
            i3 i3Var7 = b4Var.f17251w;
            b4.i(i3Var7);
            i3Var7.f17397n.c(i3.y(packageName), "Fetching Google App Id failed with exception. appId", e10);
        }
        if (!TextUtils.isEmpty(strS1)) {
            Context context = ((b4) obj).f17234b;
            String strS0 = ((b4) obj).V;
            fc.t.k(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strS0)) {
                strS0 = dq0.s0(context);
            }
            int identifier = resources.getIdentifier("admob_app_id", "string", strS0);
            if (identifier == 0) {
                string = null;
                this.P = string;
            } else {
                try {
                    string = resources.getString(identifier);
                } catch (Resources.NotFoundException unused4) {
                }
                this.P = string;
            }
            this.f17299w = null;
            b4Var.getClass();
            f fVar2 = b4Var.f17249t;
            fVar2.getClass();
            fc.t.g("analytics.safelisted_events");
            bundleW = fVar2.w();
            Object obj22 = fVar2.f15046b;
            if (bundleW != null) {
                if (bundleW.containsKey("analytics.safelisted_events")) {
                    numValueOf = Integer.valueOf(bundleW.getInt("analytics.safelisted_events"));
                }
                if (numValueOf != null) {
                    try {
                        String[] stringArray = ((b4) obj22).f17234b.getResources().getStringArray(numValueOf.intValue());
                        if (stringArray != null) {
                            listAsList = Arrays.asList(stringArray);
                        }
                    } catch (Resources.NotFoundException e11) {
                        i3 i3Var8 = ((b4) obj22).f17251w;
                        b4.i(i3Var8);
                        i3Var8.f17397n.b(e11, "Failed to load string array from metadata: resource not found");
                    }
                }
                if (listAsList == null) {
                    this.f17299w = listAsList;
                } else if (listAsList.isEmpty()) {
                    i3 i3Var9 = b4Var.f17251w;
                    b4.i(i3Var9);
                    i3Var9.N.a("Safelisted event list is empty. Ignoring");
                } else {
                    for (String str4 : listAsList) {
                        b6 b6Var = b4Var.O;
                        b4.g(b6Var);
                        if (!b6Var.W("safelisted event", str4)) {
                        }
                    }
                    this.f17299w = listAsList;
                }
                if (packageManager == null) {
                    this.N = g5.a.v(b4Var.f17234b) ? 1 : 0;
                    return;
                } else {
                    this.N = 0;
                    return;
                }
            }
            i3 i3Var10 = ((b4) obj22).f17251w;
            b4.i(i3Var10);
            i3Var10.f17397n.a("Failed to load metadata: Metadata bundle is null");
            numValueOf = null;
            if (numValueOf != null) {
            }
            if (listAsList == null) {
            }
            if (packageManager == null) {
            }
        }
        if (iJ == 0) {
            i3 i3Var11 = ((b4) obj).f17251w;
            b4.i(i3Var11);
            i3Var11.Q.c(this.f17293f, "App measurement enabled for app package, google app id", TextUtils.isEmpty(this.O) ? this.P : this.O);
        }
        this.f17299w = null;
        b4Var.getClass();
        f fVar22 = b4Var.f17249t;
        fVar22.getClass();
        fc.t.g("analytics.safelisted_events");
        bundleW = fVar22.w();
        Object obj222 = fVar22.f15046b;
        if (bundleW != null) {
        }
        numValueOf = null;
        if (numValueOf != null) {
        }
        if (listAsList == null) {
        }
        if (packageManager == null) {
        }
    }

    public final String t() {
        p();
        fc.t.k(this.f17293f);
        return this.f17293f;
    }

    public final String u() {
        o();
        p();
        fc.t.k(this.O);
        return this.O;
    }

    public final void w() {
        String str;
        o();
        b4 b4Var = (b4) this.f15046b;
        q3 q3Var = b4Var.f17250u;
        b4.g(q3Var);
        if (q3Var.u().f(g.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            b6 b6Var = b4Var.O;
            b4.g(b6Var);
            b6Var.y().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            i3 i3Var = b4Var.f17251w;
            b4.i(i3Var);
            i3Var.P.a("Analytics Storage consent is not granted");
            str = null;
        }
        i3 i3Var2 = b4Var.f17251w;
        b4.i(i3Var2);
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        i3Var2.P.a(String.format("Resetting session stitching token to %s", objArr));
        this.Q = str;
        b4Var.Q.getClass();
        this.R = System.currentTimeMillis();
    }
}