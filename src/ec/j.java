package ec;

import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.r11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc.r;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public abstract class j extends h {
    public static boolean D(CharSequence charSequence, char c) {
        Intrinsics.f(charSequence, "<this>");
        return I(charSequence, c, 0, false, 2) >= 0;
    }

    public static boolean E(CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.f(charSequence, "<this>");
        Intrinsics.f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (J(charSequence, (String) charSequence2, 0, false, 2) < 0) {
                return false;
            }
        } else if (H(charSequence, charSequence2, 0, charSequence.length(), false, false) < 0) {
            return false;
        }
        return true;
    }

    public static int F(CharSequence charSequence) {
        Intrinsics.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int G(int i, CharSequence charSequence, String str, boolean z) {
        Intrinsics.f(charSequence, "<this>");
        Intrinsics.f(str, "string");
        return (z || !(charSequence instanceof String)) ? H(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX WARN: Incorrect condition in loop: B:26:0x0050 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int H(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        IntRange intProgression;
        if (z2) {
            int iF = F(charSequence);
            if (i > iF) {
                i = iF;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            IntProgression.j.getClass();
            intProgression = new IntProgression(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            intProgression = new IntRange(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = ((IntProgression) intProgression).f;
        int i4 = ((IntProgression) intProgression).e;
        int i5 = ((IntProgression) intProgression).b;
        if (z3 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (!h.x(0, i, charSequence2.length(), (String) charSequence2, (String) charSequence, z)) {
                    if (i5 != i4) {
                        i5 += i3;
                    }
                }
                return i5;
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!O(charSequence2, 0, charSequence, i5, charSequence2.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    public static int I(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        Intrinsics.f(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? K(i, charSequence, z, new char[]{c}) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int J(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return G(i, charSequence, str, z);
    }

    public static final int K(int i, CharSequence charSequence, boolean z, char[] cArr) {
        Intrinsics.f(charSequence, "<this>");
        Intrinsics.f(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ArraysKt.G3(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        IntProgressionIterator intProgressionIteratorA = new IntRange(i, F(charSequence), 1).a();
        while (intProgressionIteratorA.f) {
            int iA = intProgressionIteratorA.a();
            char cCharAt = charSequence.charAt(iA);
            for (char c : cArr) {
                if (dq0.f(c, cCharAt, z)) {
                    return iA;
                }
            }
        }
        return -1;
    }

    public static int L(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = F(charSequence);
        }
        Intrinsics.f(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(ArraysKt.G3(cArr), i);
        }
        int iF = F(charSequence);
        if (i > iF) {
            i = iF;
        }
        while (-1 < i) {
            if (dq0.f(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int M(String str, String str2, int i) {
        int iF = (i & 2) != 0 ? F(str) : 0;
        Intrinsics.f(str, "<this>");
        Intrinsics.f(str2, "string");
        return str.lastIndexOf(str2, iF);
    }

    public static b N(CharSequence charSequence, String[] strArr, boolean z, int i) {
        Q(i);
        return new b(charSequence, 0, i, new i(r11.f3(strArr), z, 1));
    }

    public static final boolean O(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        Intrinsics.f(charSequence, "<this>");
        Intrinsics.f(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!dq0.f(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String P(CharSequence charSequence, String str) {
        Intrinsics.f(str, "<this>");
        if (!U(str, charSequence)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        Intrinsics.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static final void Q(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(r.d("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static final List R(int i, CharSequence charSequence, String str, boolean z) {
        Q(i);
        int length = 0;
        int iG = G(0, charSequence, str, z);
        if (iG == -1 || i == 1) {
            return dq0.o(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i2 = 10;
        if (z2 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        do {
            arrayList.add(charSequence.subSequence(length, iG).toString());
            length = str.length() + iG;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iG = G(length, charSequence, str, z);
        } while (iG != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List S(CharSequence charSequence, char[] cArr) {
        Intrinsics.f(charSequence, "<this>");
        boolean z = false;
        Object[] objArr = 0;
        if (cArr.length == 1) {
            return R(0, charSequence, String.valueOf(cArr[0]), false);
        }
        Q(0);
        SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1 sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1R = SequencesKt.r(new b(charSequence, 0, 0, new i(cArr, z, objArr == true ? 1 : 0)));
        ArrayList arrayList = new ArrayList(fa.d.f3(sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1R));
        Iterator it = sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1R.b.iterator();
        while (it.hasNext()) {
            arrayList.add(V(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static List T(CharSequence charSequence, String[] strArr) {
        Intrinsics.f(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return R(0, charSequence, str, false);
            }
        }
        SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1 sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1R = SequencesKt.r(N(charSequence, strArr, false, 0));
        ArrayList arrayList = new ArrayList(fa.d.f3(sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1R));
        Iterator it = sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1R.b.iterator();
        while (it.hasNext()) {
            arrayList.add(V(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static boolean U(CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.f(charSequence, "<this>");
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? h.C((String) charSequence, (String) charSequence2, false) : O(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
    }

    public static final String V(CharSequence charSequence, IntRange intRange) {
        Intrinsics.f(charSequence, "<this>");
        Intrinsics.f(intRange, "range");
        return charSequence.subSequence(Integer.valueOf(((IntProgression) intRange).b).intValue(), Integer.valueOf(((IntProgression) intRange).e).intValue() + 1).toString();
    }

    public static String W(String str, String str2, String str3) {
        Intrinsics.f(str2, "delimiter");
        Intrinsics.f(str3, "missingDelimiterValue");
        int iJ = J(str, str2, 0, false, 6);
        if (iJ == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iJ, str.length());
        Intrinsics.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String X(String str, char c) {
        Intrinsics.f(str, "<this>");
        Intrinsics.f(str, "missingDelimiterValue");
        int iL = L(str, c, 0, 6);
        if (iL == -1) {
            return str;
        }
        String strSubstring = str.substring(iL + 1, str.length());
        Intrinsics.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String Y(String str, char c) {
        Intrinsics.f(str, "<this>");
        Intrinsics.f(str, "missingDelimiterValue");
        int I = I(str, c, 0, false, 6);
        if (I == -1) {
            return str;
        }
        String strSubstring = str.substring(0, I);
        Intrinsics.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String Z(String str, String str2) {
        Intrinsics.f(str, "<this>");
        Intrinsics.f(str, "missingDelimiterValue");
        int iJ = J(str, str2, 0, false, 6);
        if (iJ == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iJ);
        Intrinsics.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static CharSequence a0(CharSequence charSequence) {
        Intrinsics.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zN = dq0.n(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zN) {
                    break;
                }
                length--;
            } else if (zN) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}