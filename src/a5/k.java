package a5;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class k extends f implements y4.c, y {

    /* renamed from: g0, reason: collision with root package name */
    public final Set f358g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Account f359h0;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(Context context, Looper looper, int i10, h hVar, z4.f fVar, z4.n nVar) {
        s0 s0VarA = s0.a(context);
        x4.f fVar2 = x4.f.f18962d;
        if (fVar == null) {
            throw new NullPointerException("null reference");
        }
        if (nVar == null) {
            throw new NullPointerException("null reference");
        }
        super(context, looper, s0VarA, fVar2, i10, new x(fVar, 0), new p8.c(nVar, 26), hVar.f336g);
        this.f359h0 = hVar.f330a;
        Set set = hVar.f332c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f358g0 = set;
    }

    @Override // y4.c
    public final Set e() {
        return o() ? this.f358g0 : Collections.emptySet();
    }

    @Override // a5.f
    public final Account s() {
        return this.f359h0;
    }

    @Override // a5.f
    public final void v() {
    }

    @Override // a5.f
    public final Set y() {
        return this.f358g0;
    }
}