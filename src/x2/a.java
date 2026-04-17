package x2;

import g.v0;
import i3.k;
import java.util.ArrayDeque;
import q2.m;
import q2.n;
import w2.l;
import w2.s;
import w2.t;
import w2.u;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements u {

    /* renamed from: b, reason: collision with root package name */
    public static final m f18897b = m.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    public final v0 f18898a;

    public a(v0 v0Var) {
        this.f18898a = v0Var;
    }

    @Override // w2.u
    public final t a(Object obj, int i10, int i11, n nVar) {
        l lVar = (l) obj;
        v0 v0Var = this.f18898a;
        if (v0Var != null) {
            s sVarA = s.a(lVar);
            Object objA = ((k) v0Var.f12909e).a(sVarA);
            ArrayDeque arrayDeque = s.f18583d;
            synchronized (arrayDeque) {
                arrayDeque.offer(sVarA);
            }
            l lVar2 = (l) objA;
            if (lVar2 == null) {
                ((k) v0Var.f12909e).d(s.a(lVar), lVar);
            } else {
                lVar = lVar2;
            }
        }
        return new t(lVar, new com.bumptech.glide.load.data.l(lVar, ((Integer) nVar.c(f18897b)).intValue()));
    }

    @Override // w2.u
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}