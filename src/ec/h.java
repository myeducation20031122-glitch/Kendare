package ec;

import com.google.android.gms.internal.ads.dq0;
import java.util.Collection;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import okhttp3.HttpUrl;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public abstract class h extends g {
    public static String A(String str, String str2, String str3) {
        Intrinsics.f(str, "<this>");
        int iG = j.G(0, str, str2, false);
        if (iG < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb2.append((CharSequence) str, i2, iG);
            sb2.append(str3);
            i2 = iG + length;
            if (iG >= str.length()) {
                break;
            }
            iG = j.G(iG + i, str, str2, false);
        } while (iG > 0);
        sb2.append((CharSequence) str, i2, str.length());
        String string = sb2.toString();
        Intrinsics.e(string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    public static boolean B(String str, int i, String str2, boolean z) {
        Intrinsics.f(str, "<this>");
        return !z ? str.startsWith(str2, i) : x(i, 0, str2.length(), str, str2, z);
    }

    public static boolean C(String str, String str2, boolean z) {
        Intrinsics.f(str, "<this>");
        Intrinsics.f(str2, "prefix");
        return !z ? str.startsWith(str2) : x(0, 0, str2.length(), str, str2, z);
    }

    public static boolean t(String str, String str2) {
        Intrinsics.f(str, "<this>");
        Intrinsics.f(str2, "suffix");
        return str.endsWith(str2);
    }

    public static boolean u(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static Comparator v(StringCompanionObject stringCompanionObject) {
        Intrinsics.f(stringCompanionObject, "<this>");
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.e(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    public static boolean w(String str) {
        Intrinsics.f(str, "<this>");
        if (str.length() == 0) {
            return true;
        }
        Collection intRange = new IntRange(0, str.length() - 1, 1);
        if ((intRange instanceof Collection) && intRange.isEmpty()) {
            return true;
        }
        IntProgressionIterator intProgressionIteratorA = intRange.a();
        while (intProgressionIteratorA.f) {
            if (!dq0.n(str.charAt(intProgressionIteratorA.a()))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean x(int i, int i2, int i3, String str, String str2, boolean z) {
        Intrinsics.f(str, "<this>");
        Intrinsics.f(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String y(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i);
        IntProgressionIterator intProgressionIteratorA = new IntRange(1, i, 1).a();
        while (intProgressionIteratorA.f) {
            intProgressionIteratorA.a();
            sb2.append((CharSequence) str);
        }
        String string = sb2.toString();
        Intrinsics.e(string, "{\n                    va…tring()\n                }");
        return string;
    }

    public static String z(String str, char c, char c2) {
        Intrinsics.f(str, "<this>");
        String strReplace = str.replace(c, c2);
        Intrinsics.e(strReplace, "this as java.lang.String…replace(oldChar, newChar)");
        return strReplace;
    }
}