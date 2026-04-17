package g;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n implements o1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12878a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12879b;

    public n(p pVar) {
        this.f12879b = pVar;
    }

    @Override // o1.c
    public final Bundle a() {
        int i10 = this.f12878a;
        Object obj = this.f12879b;
        switch (i10) {
            case 0:
                Bundle bundle = new Bundle();
                ((p) obj).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((Set) obj));
                return bundle2;
        }
    }

    public n(o1.d registry) {
        Intrinsics.f(registry, "registry");
        this.f12879b = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }
}