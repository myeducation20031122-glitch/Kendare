package ec;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class i extends Lambda implements Function2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, boolean z, int i) {
        super(2);
        this.b = i;
        this.f = obj;
        this.e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair a(int i, CharSequence charSequence) {
        Object next;
        Pair pair;
        Object next2;
        int i2 = this.b;
        Object obj = this.f;
        switch (i2) {
            case 0:
                Intrinsics.f(charSequence, "$this$$receiver");
                int iK = j.K(i, charSequence, this.e, (char[]) obj);
                if (iK < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(iK), 1);
            default:
                Intrinsics.f(charSequence, "$this$$receiver");
                List list = (List) obj;
                boolean z = this.e;
                if (z || list.size() != 1) {
                    if (i < 0) {
                        i = 0;
                    }
                    IntRange intRange = new IntRange(i, charSequence.length(), 1);
                    boolean z2 = charSequence instanceof String;
                    int i3 = ((IntProgression) intRange).f;
                    int i4 = ((IntProgression) intRange).e;
                    if (z2) {
                        if ((i3 <= 0 || i > i4) && (i3 >= 0 || i4 > i)) {
                            pair = null;
                        } else {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        String str = (String) next2;
                                        if (h.x(0, i, str.length(), str, (String) charSequence, z)) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                String str2 = (String) next2;
                                if (str2 != null) {
                                    pair = new Pair(Integer.valueOf(i), str2);
                                } else if (i != i4) {
                                    i += i3;
                                }
                            }
                            pair = null;
                        }
                    } else if ((i3 > 0 && i <= i4) || (i3 < 0 && i4 <= i)) {
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    String str3 = (String) next;
                                    if (j.O(str3, 0, charSequence, i, str3.length(), z)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            String str4 = (String) next;
                            if (str4 != null) {
                                pair = new Pair(Integer.valueOf(i), str4);
                            } else if (i != i4) {
                                i += i3;
                            }
                        }
                        pair = null;
                    }
                } else {
                    String str5 = (String) fa.g.E3(list);
                    int iJ = j.J(charSequence, str5, i, false, 4);
                    if (iJ >= 0) {
                        pair = new Pair(Integer.valueOf(iJ), str5);
                    }
                }
                if (pair == null) {
                    return null;
                }
                return new Pair(pair.b, Integer.valueOf(((String) pair.e).length()));
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return a(((Number) obj2).intValue(), (CharSequence) obj);
            case 1:
                return a(((Number) obj2).intValue(), (CharSequence) obj);
            default:
                return ((CoroutineContext) obj).e((CoroutineContext.Element) obj2);
        }
    }
}