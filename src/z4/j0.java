package z4;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f19661a;

    /* renamed from: b, reason: collision with root package name */
    public final x4.d f19662b;

    public /* synthetic */ j0(a aVar, x4.d dVar) {
        this.f19661a = aVar;
        this.f19662b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof j0)) {
            j0 j0Var = (j0) obj;
            if (o5.y.i(this.f19661a, j0Var.f19661a) && o5.y.i(this.f19662b, j0Var.f19662b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19661a, this.f19662b});
    }

    public final String toString() {
        d3.d dVar = new d3.d(this);
        dVar.a(this.f19661a, "key");
        dVar.a(this.f19662b, "feature");
        return dVar.toString();
    }
}