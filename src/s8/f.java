package s8;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import q8.a0;
import q8.b0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public a0 f16904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f16906c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q8.n f16907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x8.a f16908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f16909f;

    public f(g gVar, boolean z7, boolean z10, q8.n nVar, x8.a aVar) {
        this.f16909f = gVar;
        this.f16905b = z7;
        this.f16906c = z10;
        this.f16907d = nVar;
        this.f16908e = aVar;
    }

    @Override // q8.a0
    public final Object b(y8.a aVar) throws IOException {
        if (this.f16905b) {
            aVar.C();
            return null;
        }
        a0 a0Var = this.f16904a;
        if (a0Var == null) {
            q8.n nVar = this.f16907d;
            List list = nVar.f16325e;
            b0 b0Var = this.f16909f;
            if (!list.contains(b0Var)) {
                b0Var = nVar.f16324d;
            }
            Iterator it = list.iterator();
            boolean z7 = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                x8.a aVar2 = this.f16908e;
                if (!zHasNext) {
                    throw new IllegalArgumentException("GSON cannot serialize " + aVar2);
                }
                b0 b0Var2 = (b0) it.next();
                if (z7) {
                    a0 a0VarB = b0Var2.b(nVar, aVar2);
                    if (a0VarB != null) {
                        this.f16904a = a0VarB;
                        a0Var = a0VarB;
                        break;
                    }
                } else if (b0Var2 == b0Var) {
                    z7 = true;
                }
            }
        }
        return a0Var.b(aVar);
    }

    @Override // q8.a0
    public final void c(y8.b bVar, Object obj) {
        if (this.f16906c) {
            bVar.j();
            return;
        }
        a0 a0Var = this.f16904a;
        if (a0Var == null) {
            q8.n nVar = this.f16907d;
            List list = nVar.f16325e;
            b0 b0Var = this.f16909f;
            if (!list.contains(b0Var)) {
                b0Var = nVar.f16324d;
            }
            Iterator it = list.iterator();
            boolean z7 = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                x8.a aVar = this.f16908e;
                if (!zHasNext) {
                    throw new IllegalArgumentException("GSON cannot serialize " + aVar);
                }
                b0 b0Var2 = (b0) it.next();
                if (z7) {
                    a0 a0VarB = b0Var2.b(nVar, aVar);
                    if (a0VarB != null) {
                        this.f16904a = a0VarB;
                        a0Var = a0VarB;
                        break;
                    }
                } else if (b0Var2 == b0Var) {
                    z7 = true;
                }
            }
        }
        a0Var.c(bVar, obj);
    }
}