package c1;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Fragment fragment, int i10) {
        super(0, fragment, "Attempting to get retain instance for fragment " + fragment);
        if (i10 != 1) {
            Intrinsics.f(fragment, "fragment");
            return;
        }
        Intrinsics.f(fragment, "fragment");
        super(0, fragment, "Attempting to set retain instance for fragment " + fragment);
    }
}