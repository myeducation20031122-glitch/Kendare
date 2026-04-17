package j4;

import android.content.Context;
import com.google.android.gms.internal.ads.if0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h extends n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f3 f13719c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.b f13721e;

    public h(android.support.v4.media.b bVar, Context context, f3 f3Var, String str) {
        this.f13721e = bVar;
        this.f13718b = context;
        this.f13719c = f3Var;
        this.f13720d = str;
    }

    @Override // j4.n
    public final Object a() {
        android.support.v4.media.b.i(this.f13718b, "search");
        return new r2();
    }

    @Override // j4.n
    public final Object b(s0 s0Var) {
        return s0Var.t0(new h5.b(this.f13718b), this.f13719c, this.f13720d, 231004000);
    }

    @Override // j4.n
    public final /* bridge */ /* synthetic */ Object c() {
        return ((if0) this.f13721e.f486b).n(this.f13718b, this.f13719c, this.f13720d, null, 3);
    }
}