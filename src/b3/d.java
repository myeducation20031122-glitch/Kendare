package b3;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import q2.r;
import s2.e0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements r {

    /* renamed from: b, reason: collision with root package name */
    public final r f1859b;

    public d(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f1859b = rVar;
    }

    @Override // q2.j
    public final void a(MessageDigest messageDigest) {
        this.f1859b.a(messageDigest);
    }

    @Override // q2.r
    public final e0 b(com.bumptech.glide.h hVar, e0 e0Var, int i10, int i11) {
        c cVar = (c) e0Var.get();
        e0 dVar = new z2.d(cVar.f1850b.f1849a.f1880l, com.bumptech.glide.b.b(hVar).f2230b);
        r rVar = this.f1859b;
        e0 e0VarB = rVar.b(hVar, dVar, i10, i11);
        if (!dVar.equals(e0VarB)) {
            dVar.d();
        }
        cVar.f1850b.f1849a.c(rVar, (Bitmap) e0VarB.get());
        return e0Var;
    }

    @Override // q2.j
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f1859b.equals(((d) obj).f1859b);
        }
        return false;
    }

    @Override // q2.j
    public final int hashCode() {
        return this.f1859b.hashCode();
    }
}