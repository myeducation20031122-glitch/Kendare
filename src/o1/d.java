package o1;

import android.os.Bundle;
import androidx.lifecycle.j;
import g.n;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import o.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f15654b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f15655c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15656d;

    /* renamed from: e, reason: collision with root package name */
    public n f15657e;

    /* renamed from: a, reason: collision with root package name */
    public final g f15653a = new g();

    /* renamed from: f, reason: collision with root package name */
    public boolean f15658f = true;

    public final Bundle a(String str) {
        if (!this.f15656d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f15655c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f15655c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f15655c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f15655c = null;
        }
        return bundle2;
    }

    public final c b() {
        String str;
        c cVar;
        Iterator it = this.f15653a.iterator();
        do {
            o.e eVar = (o.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) eVar.next();
            Intrinsics.e(components, "components");
            str = (String) components.getKey();
            cVar = (c) components.getValue();
        } while (!Intrinsics.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return cVar;
    }

    public final void c(String key, c provider) {
        Object obj;
        Intrinsics.f(key, "key");
        Intrinsics.f(provider, "provider");
        g gVar = this.f15653a;
        o.c cVarA = gVar.a(key);
        if (cVarA != null) {
            obj = cVarA.f15484e;
        } else {
            o.c cVar = new o.c(key, provider);
            gVar.f15495j++;
            o.c cVar2 = gVar.f15493e;
            if (cVar2 == null) {
                gVar.f15492b = cVar;
            } else {
                cVar2.f15485f = cVar;
                cVar.f15486j = cVar2;
            }
            gVar.f15493e = cVar;
            obj = null;
        }
        if (((c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        if (!this.f15658f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        n nVar = this.f15657e;
        if (nVar == null) {
            nVar = new n(this);
        }
        this.f15657e = nVar;
        try {
            j.class.getDeclaredConstructor(new Class[0]);
            n nVar2 = this.f15657e;
            if (nVar2 != null) {
                ((Set) nVar2.f12879b).add(j.class.getName());
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}