package j4;

import android.content.Context;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.if0;
import com.google.android.gms.internal.ads.zk;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i extends n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13732b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f3 f13733c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl f13735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.b f13736f;

    public i(android.support.v4.media.b bVar, Context context, f3 f3Var, String str, zk zkVar) {
        this.f13736f = bVar;
        this.f13732b = context;
        this.f13733c = f3Var;
        this.f13734d = str;
        this.f13735e = zkVar;
    }

    @Override // j4.n
    public final Object a() {
        android.support.v4.media.b.i(this.f13732b, "interstitial");
        return new r2();
    }

    @Override // j4.n
    public final Object b(s0 s0Var) {
        return s0Var.w2(new h5.b(this.f13732b), this.f13733c, this.f13734d, this.f13735e, 231004000);
    }

    @Override // j4.n
    public final /* bridge */ /* synthetic */ Object c() {
        return ((if0) this.f13736f.f486b).n(this.f13732b, this.f13733c, this.f13734d, this.f13735e, 2);
    }
}