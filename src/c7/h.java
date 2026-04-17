package c7;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h extends d7.h {

    /* renamed from: e, reason: collision with root package name */
    public final r4.d f2166e;

    /* renamed from: f, reason: collision with root package name */
    public final x5.l f2167f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f2168j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, r4.d dVar, x5.l lVar) {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback", 3);
        this.f2168j = kVar;
        this.f2166e = dVar;
        this.f2167f = lVar;
    }

    @Override // d7.i
    public void X0(Bundle bundle) {
        this.f2168j.f2172a.c(this.f2167f);
        this.f2166e.c("onCompleteUpdate", new Object[0]);
    }

    @Override // d7.i
    public void a0(Bundle bundle) {
        this.f2168j.f2172a.c(this.f2167f);
        this.f2166e.c("onRequestInfo", new Object[0]);
    }
}