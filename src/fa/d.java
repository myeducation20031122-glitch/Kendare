package fa;

import com.google.android.gms.internal.ads.dq0;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class d extends dq0 {
    public static int f3(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}