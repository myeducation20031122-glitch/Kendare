package c1;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class j extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final Fragment f2053b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Fragment fragment, String str) {
        super(str);
        Intrinsics.f(fragment, "fragment");
        this.f2053b = fragment;
    }
}