package com.onesignal;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q3 f12019b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f12021f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Throwable f12022j;

    public n4(q3 q3Var, int i10, String str, Throwable th) {
        this.f12019b = q3Var;
        this.f12020e = i10;
        this.f12021f = str;
        this.f12022j = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12019b.J(this.f12020e, this.f12021f, this.f12022j);
    }
}