package t5;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends m0.j {

    /* renamed from: e, reason: collision with root package name */
    public Boolean f17337e;

    /* renamed from: f, reason: collision with root package name */
    public e f17338f;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f17339j;

    public final boolean A() {
        ((b4) this.f15046b).getClass();
        Boolean boolX = x("firebase_analytics_collection_deactivated");
        return boolX != null && boolX.booleanValue();
    }

    public final boolean B(String str) {
        return "1".equals(this.f17338f.a(str, "measurement.event_sampling_enabled"));
    }

    public final boolean C() {
        if (this.f17337e == null) {
            Boolean boolX = x("app_measurement_lite");
            this.f17337e = boolX;
            if (boolX == null) {
                this.f17337e = Boolean.FALSE;
            }
        }
        return this.f17337e.booleanValue() || !((b4) this.f15046b).f17247m;
    }

    public final String p(String str) {
        i3 i3Var;
        String str2;
        Object obj = this.f15046b;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            fc.t.k(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            e = e10;
            i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            str2 = "Could not find SystemProperties class";
            i3Var.f17397n.b(e, str2);
            return "";
        } catch (IllegalAccessException e11) {
            e = e11;
            i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            str2 = "Could not access SystemProperties.get()";
            i3Var.f17397n.b(e, str2);
            return "";
        } catch (NoSuchMethodException e12) {
            e = e12;
            i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            str2 = "Could not find SystemProperties.get() method";
            i3Var.f17397n.b(e, str2);
            return "";
        } catch (InvocationTargetException e13) {
            e = e13;
            i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            str2 = "SystemProperties.get() threw an exception";
            i3Var.f17397n.b(e, str2);
            return "";
        }
    }

    public final double q(String str, z2 z2Var) {
        if (str == null) {
            return ((Double) z2Var.a(null)).doubleValue();
        }
        String strA = this.f17338f.a(str, z2Var.f17707a);
        if (TextUtils.isEmpty(strA)) {
            return ((Double) z2Var.a(null)).doubleValue();
        }
        try {
            return ((Double) z2Var.a(Double.valueOf(Double.parseDouble(strA)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) z2Var.a(null)).doubleValue();
        }
    }

    public final int r() {
        b6 b6Var = ((b4) this.f15046b).O;
        b4.g(b6Var);
        Boolean bool = ((b4) b6Var.f15046b).r().f17429m;
        if (b6Var.r0() < 201500) {
            return (bool == null || bool.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int s(String str, z2 z2Var) {
        if (str == null) {
            return ((Integer) z2Var.a(null)).intValue();
        }
        String strA = this.f17338f.a(str, z2Var.f17707a);
        if (TextUtils.isEmpty(strA)) {
            return ((Integer) z2Var.a(null)).intValue();
        }
        try {
            return ((Integer) z2Var.a(Integer.valueOf(Integer.parseInt(strA)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) z2Var.a(null)).intValue();
        }
    }

    public final void t() {
        ((b4) this.f15046b).getClass();
    }

    public final long u(String str, z2 z2Var) {
        if (str == null) {
            return ((Long) z2Var.a(null)).longValue();
        }
        String strA = this.f17338f.a(str, z2Var.f17707a);
        if (TextUtils.isEmpty(strA)) {
            return ((Long) z2Var.a(null)).longValue();
        }
        try {
            return ((Long) z2Var.a(Long.valueOf(Long.parseLong(strA)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) z2Var.a(null)).longValue();
        }
    }

    public final Bundle w() {
        Object obj = this.f15046b;
        try {
            if (((b4) obj).f17234b.getPackageManager() == null) {
                i3 i3Var = ((b4) obj).f17251w;
                b4.i(i3Var);
                i3Var.f17397n.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoF = g5.b.a(((b4) obj).f17234b).f(128, ((b4) obj).f17234b.getPackageName());
            if (applicationInfoF != null) {
                return applicationInfoF.metaData;
            }
            i3 i3Var2 = ((b4) obj).f17251w;
            b4.i(i3Var2);
            i3Var2.f17397n.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            i3 i3Var3 = ((b4) obj).f17251w;
            b4.i(i3Var3);
            i3Var3.f17397n.b(e10, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean x(String str) {
        fc.t.g(str);
        Bundle bundleW = w();
        if (bundleW != null) {
            if (bundleW.containsKey(str)) {
                return Boolean.valueOf(bundleW.getBoolean(str));
            }
            return null;
        }
        i3 i3Var = ((b4) this.f15046b).f17251w;
        b4.i(i3Var);
        i3Var.f17397n.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean y(String str, z2 z2Var) {
        if (str == null) {
            return ((Boolean) z2Var.a(null)).booleanValue();
        }
        String strA = this.f17338f.a(str, z2Var.f17707a);
        return TextUtils.isEmpty(strA) ? ((Boolean) z2Var.a(null)).booleanValue() : ((Boolean) z2Var.a(Boolean.valueOf("1".equals(strA)))).booleanValue();
    }

    public final boolean z() {
        Boolean boolX = x("google_analytics_automatic_screen_reporting_enabled");
        return boolX == null || boolX.booleanValue();
    }
}