package u9;

import androidx.lifecycle.c0;
import com.isprid.kendare.network.util.Resource;
import com.isprid.kendare.network.util.ResourceState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h {
    public static final void a(c0 c0Var, String str) {
        Intrinsics.f(c0Var, "<this>");
        ResourceState.ERROR error = ResourceState.ERROR.INSTANCE;
        Resource resource = (Resource) c0Var.d();
        c0Var.h(new Resource(error, resource != null ? resource.getData() : null, str));
    }

    public static final void b(c0 c0Var) {
        Intrinsics.f(c0Var, "<this>");
        ResourceState.LOADING loading = ResourceState.LOADING.INSTANCE;
        Resource resource = (Resource) c0Var.d();
        c0Var.h(new Resource(loading, resource != null ? resource.getData() : null, null, 4, null));
    }

    public static void c(c0 c0Var, Object obj) {
        Intrinsics.f(c0Var, "<this>");
        c0Var.h(new Resource(ResourceState.SUCCESS.INSTANCE, obj, null));
    }
}