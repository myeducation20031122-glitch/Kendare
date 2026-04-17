package q2;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import s2.e0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k implements r {

    /* renamed from: b, reason: collision with root package name */
    public final List f16127b;

    public k(r... rVarArr) {
        if (rVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f16127b = Arrays.asList(rVarArr);
    }

    @Override // q2.j
    public final void a(MessageDigest messageDigest) {
        Iterator it = this.f16127b.iterator();
        while (it.hasNext()) {
            ((r) it.next()).a(messageDigest);
        }
    }

    @Override // q2.r
    public final e0 b(com.bumptech.glide.h hVar, e0 e0Var, int i10, int i11) {
        Iterator it = this.f16127b.iterator();
        e0 e0Var2 = e0Var;
        while (it.hasNext()) {
            e0 e0VarB = ((r) it.next()).b(hVar, e0Var2, i10, i11);
            if (e0Var2 != null && !e0Var2.equals(e0Var) && !e0Var2.equals(e0VarB)) {
                e0Var2.d();
            }
            e0Var2 = e0VarB;
        }
        return e0Var2;
    }

    @Override // q2.j
    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f16127b.equals(((k) obj).f16127b);
        }
        return false;
    }

    @Override // q2.j
    public final int hashCode() {
        return this.f16127b.hashCode();
    }
}