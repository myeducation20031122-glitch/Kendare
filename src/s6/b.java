package s6;

import android.graphics.Typeface;
import com.google.android.gms.internal.ads.dq0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends com.bumptech.glide.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dq0 f16855g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f16856h;

    public b(d dVar, dq0 dq0Var) {
        this.f16856h = dVar;
        this.f16855g = dq0Var;
    }

    @Override // com.bumptech.glide.d
    public final void v(int i10) {
        this.f16856h.f16869m = true;
        this.f16855g.r(i10);
    }

    @Override // com.bumptech.glide.d
    public final void w(Typeface typeface) {
        d dVar = this.f16856h;
        dVar.f16870n = Typeface.create(typeface, dVar.f16859c);
        dVar.f16869m = true;
        this.f16855g.s(dVar.f16870n, false);
    }
}