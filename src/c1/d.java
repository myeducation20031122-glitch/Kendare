package c1;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends j {

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f2052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Fragment fragment, ViewGroup container, int i10) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + container);
        if (i10 != 1) {
            this.f2052e = container;
            return;
        }
        Intrinsics.f(container, "container");
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        this.f2052e = container;
    }
}