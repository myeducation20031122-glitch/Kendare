package c1;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class g extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i10, Fragment fragment, String str) {
        super(fragment, str);
        if (i10 != 1) {
            Intrinsics.f(fragment, "fragment");
        } else {
            Intrinsics.f(fragment, "fragment");
            super(fragment, str);
        }
    }
}