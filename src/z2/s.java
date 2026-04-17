package z2;

import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s implements q2.r {

    /* renamed from: b, reason: collision with root package name */
    public final q2.r f19558b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19559c;

    public s(q2.r rVar, boolean z7) {
        this.f19558b = rVar;
        this.f19559c = z7;
    }

    @Override // q2.j
    public final void a(MessageDigest messageDigest) {
        this.f19558b.a(messageDigest);
    }

    @Override // q2.r
    public final s2.e0 b(com.bumptech.glide.h hVar, s2.e0 e0Var, int i10, int i11) {
        t2.d dVar = com.bumptech.glide.b.b(hVar).f2230b;
        Drawable drawable = (Drawable) e0Var.get();
        d dVarA = r.a(dVar, drawable, i10, i11);
        if (dVarA != null) {
            s2.e0 e0VarB = this.f19558b.b(hVar, dVarA, i10, i11);
            if (!e0VarB.equals(dVarA)) {
                return new d(hVar.getResources(), e0VarB);
            }
            e0VarB.d();
            return e0Var;
        }
        if (!this.f19559c) {
            return e0Var;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // q2.j
    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f19558b.equals(((s) obj).f19558b);
        }
        return false;
    }

    @Override // q2.j
    public final int hashCode() {
        return this.f19558b.hashCode();
    }
}