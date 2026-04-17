package t5;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class g6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17371a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17372b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f17373c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f17374d;

    /* renamed from: e, reason: collision with root package name */
    public Long f17375e;

    /* renamed from: f, reason: collision with root package name */
    public Long f17376f;

    public g6(String str, int i10) {
        this.f17371a = str;
        this.f17372b = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Boolean a(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.s1 s1Var, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        fc.t.k(s1Var);
        if (s1Var.r()) {
            if (s1Var.w() != 1) {
                if (s1Var.w() == 5) {
                    if (!s1Var.v() || !s1Var.u()) {
                        return null;
                    }
                } else if (!s1Var.s()) {
                    return null;
                }
                int iW = s1Var.w();
                if (s1Var.w() == 5) {
                    if (n3.R(s1Var.p()) && n3.R(s1Var.o())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(s1Var.p());
                            bigDecimal4 = new BigDecimal(s1Var.o());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!n3.R(s1Var.n())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(s1Var.n());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iW == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i10 = iW - 1;
                if (i10 == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i10 == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i10 != 3) {
                    if (i10 != 4 || bigDecimal3 == null) {
                        return null;
                    }
                    if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                        z = false;
                    }
                } else {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    if (d10 == 0.0d ? bigDecimal.compareTo(bigDecimal2) != 0 : bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) >= 0) {
                    }
                }
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    public static Boolean b(String str, com.google.android.gms.internal.measurement.w1 w1Var, i3 i3Var) {
        List listP;
        boolean zStartsWith;
        fc.t.k(w1Var);
        if (str == null || !w1Var.t() || w1Var.u() == 1) {
            return null;
        }
        if (w1Var.u() == 7) {
            if (w1Var.l() == 0) {
                return null;
            }
        } else if (!w1Var.s()) {
            return null;
        }
        int iU = w1Var.u();
        boolean zQ = w1Var.q();
        String strO = (zQ || iU == 2 || iU == 7) ? w1Var.o() : w1Var.o().toUpperCase(Locale.ENGLISH);
        if (w1Var.l() == 0) {
            listP = null;
        } else {
            listP = w1Var.p();
            if (!zQ) {
                ArrayList arrayList = new ArrayList(listP.size());
                Iterator it = listP.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listP = Collections.unmodifiableList(arrayList);
            }
        }
        String str2 = iU == 2 ? strO : null;
        if (iU == 7) {
            if (listP == null || listP.isEmpty()) {
                return null;
            }
        } else if (strO == null) {
            return null;
        }
        if (!zQ && iU != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (iU - 1) {
            case QueueFuseable.SYNC /* 1 */:
                if (str2 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str2, true != zQ ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    i3Var.f17400w.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                    return null;
                }
            case 2:
                zStartsWith = str.startsWith(strO);
                break;
            case 3:
                zStartsWith = str.endsWith(strO);
                break;
            case 4:
                zStartsWith = str.contains(strO);
                break;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                zStartsWith = str.equals(strO);
                break;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                if (listP != null) {
                    zStartsWith = listP.contains(str);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(zStartsWith);
    }

    public static Boolean c(long j10, com.google.android.gms.internal.measurement.s1 s1Var) {
        try {
            return a(new BigDecimal(j10), s1Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean d(Boolean bool, boolean z7) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z7);
    }
}