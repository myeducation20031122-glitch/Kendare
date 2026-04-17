package t5;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i3 extends g4 {
    public final g3 M;
    public final g3 N;
    public final g3 O;
    public final g3 P;
    public final g3 Q;

    /* renamed from: f, reason: collision with root package name */
    public char f17394f;

    /* renamed from: j, reason: collision with root package name */
    public long f17395j;

    /* renamed from: m, reason: collision with root package name */
    public String f17396m;

    /* renamed from: n, reason: collision with root package name */
    public final g3 f17397n;

    /* renamed from: t, reason: collision with root package name */
    public final g3 f17398t;

    /* renamed from: u, reason: collision with root package name */
    public final g3 f17399u;

    /* renamed from: w, reason: collision with root package name */
    public final g3 f17400w;

    public i3(b4 b4Var) {
        super(b4Var);
        this.f17394f = (char) 0;
        this.f17395j = -1L;
        this.f17397n = new g3(this, 6, false, false);
        this.f17398t = new g3(this, 6, true, false);
        this.f17399u = new g3(this, 6, false, true);
        this.f17400w = new g3(this, 5, false, false);
        this.M = new g3(this, 5, true, false);
        this.N = new g3(this, 5, false, true);
        this.O = new g3(this, 4, false, false);
        this.P = new g3(this, 3, false, false);
        this.Q = new g3(this, 2, false, false);
    }

    public static String A(Object obj, boolean z7) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z7) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            long jAbs = Math.abs(l10.longValue());
            String string = obj.toString();
            if (jAbs < 100) {
                return string;
            }
            String str = string.charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof h3 ? ((h3) obj).f17382a : z7 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z7 ? th.getClass().getName() : th.toString());
        String canonicalName = b4.class.getCanonicalName();
        if (TextUtils.isEmpty(canonicalName)) {
            canonicalName = "";
        } else {
            int iLastIndexOf = canonicalName.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                canonicalName = canonicalName.substring(0, iLastIndexOf);
            }
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (TextUtils.isEmpty(className)) {
                    className = "";
                } else {
                    int iLastIndexOf2 = className.lastIndexOf(46);
                    if (iLastIndexOf2 != -1) {
                        className = className.substring(0, iLastIndexOf2);
                    }
                }
                if (className.equals(canonicalName)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
            }
            i10++;
        }
        return sb.toString();
    }

    public static h3 y(String str) {
        if (str == null) {
            return null;
        }
        return new h3(str);
    }

    public static String z(boolean z7, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strA = A(obj, z7);
        String strA2 = A(obj2, z7);
        String strA3 = A(obj3, z7);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strA)) {
            sb.append(str2);
            sb.append(strA);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strA2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strA2);
        }
        if (!TextUtils.isEmpty(strA3)) {
            sb.append(str3);
            sb.append(strA3);
        }
        return sb.toString();
    }

    public final String B() {
        String str;
        String str2;
        synchronized (this) {
            try {
                if (this.f17396m == null) {
                    Object obj = this.f15046b;
                    if (((b4) obj).f17245j != null) {
                        str2 = ((b4) obj).f17245j;
                    } else {
                        ((b4) ((b4) obj).f17249t.f15046b).getClass();
                        str2 = "FA";
                    }
                    this.f17396m = str2;
                }
                fc.t.k(this.f17396m);
                str = this.f17396m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void C(int i10, boolean z7, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z7 && Log.isLoggable(B(), i10)) {
            Log.println(i10, B(), z(false, str, obj, obj2, obj3));
        }
        if (z10 || i10 < 5) {
            return;
        }
        fc.t.k(str);
        a4 a4Var = ((b4) this.f15046b).M;
        if (a4Var == null) {
            Log.println(6, B(), "Scheduler not set. Not logging error/warn");
        } else if (a4Var.f17368e) {
            a4Var.x(new androidx.fragment.app.m1(this, i10 >= 9 ? 8 : i10, str, obj, obj2, obj3, 1));
        } else {
            Log.println(6, B(), "Scheduler not initialized. Not logging error/warn");
        }
    }

    @Override // t5.g4
    public final boolean p() {
        return false;
    }

    public final g3 s() {
        return this.P;
    }

    public final g3 t() {
        return this.f17397n;
    }

    public final g3 u() {
        return this.Q;
    }

    public final g3 w() {
        return this.f17400w;
    }

    public final g3 x() {
        return this.N;
    }
}