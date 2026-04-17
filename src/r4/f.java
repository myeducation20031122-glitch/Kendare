package r4;

import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.ds;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.lf1;
import com.google.android.gms.internal.ads.mq0;
import com.google.android.gms.internal.ads.nq0;
import com.google.android.gms.internal.ads.s00;
import com.google.android.gms.internal.ads.sf1;
import com.google.android.gms.internal.ads.vc0;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements lf1 {

    /* renamed from: a, reason: collision with root package name */
    public final sf1 f16478a;

    /* renamed from: b, reason: collision with root package name */
    public final sf1 f16479b;

    /* renamed from: c, reason: collision with root package name */
    public final sf1 f16480c;

    public f(sf1 sf1Var, sf1 sf1Var2, s00 s00Var) {
        this.f16478a = sf1Var;
        this.f16479b = sf1Var2;
        this.f16480c = s00Var;
    }

    @Override // com.google.android.gms.internal.ads.sf1
    public final Object zzb() {
        nq0 nq0Var = (nq0) this.f16478a.zzb();
        g gVar = (g) this.f16479b;
        gVar.getClass();
        ds dsVar = es.f4113a;
        dq0.X0(dsVar);
        return nq0Var.b(((s00) this.f16480c).zzb().c(), mq0.GENERATE_SIGNALS).n(new i4.c(1, dsVar, ((vc0) gVar.f16481a).zzb())).s(((Integer) j4.q.f13781d.f13784c.a(ge.f4875y4)).intValue(), TimeUnit.SECONDS).f();
    }
}