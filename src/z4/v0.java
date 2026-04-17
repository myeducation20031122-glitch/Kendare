package z4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.internal.ads.bu0;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v0 extends v5.c implements y4.k, y4.l {

    /* renamed from: w, reason: collision with root package name */
    public static final c5.b f19717w = u5.b.f18281a;

    /* renamed from: e, reason: collision with root package name */
    public final Context f19718e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f19719f;

    /* renamed from: j, reason: collision with root package name */
    public final c5.b f19720j = f19717w;

    /* renamed from: m, reason: collision with root package name */
    public final Set f19721m;

    /* renamed from: n, reason: collision with root package name */
    public final a5.h f19722n;

    /* renamed from: t, reason: collision with root package name */
    public u5.c f19723t;

    /* renamed from: u, reason: collision with root package name */
    public k0 f19724u;

    public v0(Context context, bu0 bu0Var, a5.h hVar) {
        this.f19718e = context;
        this.f19719f = bu0Var;
        this.f19722n = hVar;
        this.f19721m = hVar.f331b;
    }

    @Override // z4.f
    public final void A(int i10) {
        k0 k0Var = this.f19724u;
        i0 i0Var = (i0) k0Var.f19673f.M.get(k0Var.f19669b);
        if (i0Var != null) {
            if (i0Var.f19657w) {
                i0Var.m(new x4.b(17));
            } else {
                i0Var.A(i10);
            }
        }
    }

    @Override // z4.f
    public final void T(Bundle bundle) {
        this.f19723t.f(this);
    }

    @Override // v5.d
    public final void Y0(v5.h hVar) {
        this.f19719f.post(new u0(0, this, hVar));
    }

    @Override // z4.n
    public final void x(x4.b bVar) {
        this.f19724u.b(bVar);
    }
}