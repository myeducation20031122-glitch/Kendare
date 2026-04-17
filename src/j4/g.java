package j4;

import android.content.Context;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.if0;
import com.google.android.gms.internal.ads.zk;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f3 f13707c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl f13709e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.b f13710f;

    public g(android.support.v4.media.b bVar, Context context, f3 f3Var, String str, zk zkVar) {
        this.f13710f = bVar;
        this.f13706b = context;
        this.f13707c = f3Var;
        this.f13708d = str;
        this.f13709e = zkVar;
    }

    @Override // j4.n
    public final Object a() {
        android.support.v4.media.b.i(this.f13706b, "app_open");
        return new r2();
    }

    @Override // j4.n
    public final Object b(s0 s0Var) {
        return s0Var.H0(new h5.b(this.f13706b), this.f13707c, this.f13708d, this.f13709e, 231004000);
    }

    @Override // j4.n
    public final /* bridge */ /* synthetic */ Object c() {
        return ((if0) this.f13710f.f486b).n(this.f13706b, this.f13707c, this.f13708d, this.f13709e, 4);
    }
}