package c1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import g.u;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2051a = b.f2048c;

    public static b a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                Intrinsics.e(fragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            fragment = fragment.getParentFragment();
        }
        return f2051a;
    }

    public static void b(b bVar, j jVar) {
        Fragment fragment = jVar.f2053b;
        String name = fragment.getClass().getName();
        a aVar = a.f2039b;
        Set set = bVar.f2049a;
        if (set.contains(aVar)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), jVar);
        }
        if (set.contains(a.f2040e)) {
            u uVar = new u(3, name, jVar);
            if (fragment.isAdded()) {
                Handler handler = fragment.getParentFragmentManager().f1156t.f1029f;
                Intrinsics.e(handler, "fragment.parentFragmentManager.host.handler");
                if (!Intrinsics.a(handler.getLooper(), Looper.myLooper())) {
                    handler.post(uVar);
                    return;
                }
            }
            uVar.run();
        }
    }

    public static void c(j jVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(jVar.f2053b.getClass().getName()), jVar);
        }
    }

    public static final void d(Fragment fragment, String previousFragmentId) {
        Intrinsics.f(fragment, "fragment");
        Intrinsics.f(previousFragmentId, "previousFragmentId");
        d dVar = new d(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        c(dVar);
        b bVarA = a(fragment);
        if (bVarA.f2049a.contains(a.f2041f) && e(bVarA, fragment.getClass(), d.class)) {
            b(bVarA, dVar);
        }
    }

    public static boolean e(b bVar, Class cls, Class cls2) {
        Set set = (Set) bVar.f2050b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.a(cls2.getSuperclass(), j.class) || !fa.g.l3(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}