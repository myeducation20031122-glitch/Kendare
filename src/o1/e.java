package o1;

import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.savedstate.Recreator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f15659a;

    /* renamed from: b, reason: collision with root package name */
    public final d f15660b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f15661c;

    public e(f fVar) {
        this.f15659a = fVar;
    }

    public final void a() {
        f fVar = this.f15659a;
        o lifecycle = fVar.getLifecycle();
        if (((v) lifecycle).f1250c != n.f1219e) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a(new Recreator(fVar));
        final d dVar = this.f15660b;
        dVar.getClass();
        if (!(!dVar.f15654b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.a(new r() { // from class: o1.a
            @Override // androidx.lifecycle.r
            public final void a(t tVar, m mVar) {
                boolean z7;
                d this$0 = dVar;
                Intrinsics.f(this$0, "this$0");
                if (mVar == m.ON_START) {
                    z7 = true;
                } else if (mVar != m.ON_STOP) {
                    return;
                } else {
                    z7 = false;
                }
                this$0.f15658f = z7;
            }
        });
        dVar.f15654b = true;
        this.f15661c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f15661c) {
            a();
        }
        v vVar = (v) this.f15659a.getLifecycle();
        if (!(!(vVar.f1250c.compareTo(n.f1221j) >= 0))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + vVar.f1250c).toString());
        }
        d dVar = this.f15660b;
        if (!dVar.f15654b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!dVar.f15656d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        dVar.f15655c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f15656d = true;
    }

    public final void c(Bundle outBundle) {
        Intrinsics.f(outBundle, "outBundle");
        d dVar = this.f15660b;
        dVar.getClass();
        Bundle bundle = new Bundle();
        Bundle bundle2 = dVar.f15655c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        g gVar = dVar.f15653a;
        gVar.getClass();
        o.d dVar2 = new o.d(gVar);
        gVar.f15494f.put(dVar2, Boolean.FALSE);
        while (dVar2.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar2.next();
            bundle.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }
}