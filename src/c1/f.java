package c1;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Fragment fragment, int i10) {
        super(1, fragment, "Attempting to get target request code from fragment " + fragment);
        if (i10 != 1) {
            Intrinsics.f(fragment, "fragment");
            return;
        }
        Intrinsics.f(fragment, "fragment");
        super(1, fragment, "Attempting to get target fragment from fragment " + fragment);
    }
}