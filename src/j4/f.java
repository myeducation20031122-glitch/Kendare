package j4;

import android.content.Context;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.if0;
import com.google.android.gms.internal.ads.zk;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13680b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f3 f13681c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl f13683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.b f13684f;

    public f(android.support.v4.media.b bVar, Context context, f3 f3Var, String str, zk zkVar) {
        this.f13684f = bVar;
        this.f13680b = context;
        this.f13681c = f3Var;
        this.f13682d = str;
        this.f13683e = zkVar;
    }

    @Override // j4.n
    public final Object a() {
        android.support.v4.media.b.i(this.f13680b, "banner");
        return new r2();
    }

    @Override // j4.n
    public final Object b(s0 s0Var) {
        return s0Var.t1(new h5.b(this.f13680b), this.f13681c, this.f13682d, this.f13683e, 231004000);
    }

    @Override // j4.n
    public final /* bridge */ /* synthetic */ Object c() {
        return ((if0) this.f13684f.f486b).n(this.f13680b, this.f13681c, this.f13682d, this.f13683e, 1);
    }
}