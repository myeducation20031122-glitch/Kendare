package b3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import i3.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements f3.e {

    /* renamed from: b, reason: collision with root package name */
    public final int f1860b;

    /* renamed from: e, reason: collision with root package name */
    public final int f1861e;

    /* renamed from: f, reason: collision with root package name */
    public e3.c f1862f;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f1863j;

    /* renamed from: m, reason: collision with root package name */
    public final int f1864m;

    /* renamed from: n, reason: collision with root package name */
    public final long f1865n;

    /* renamed from: t, reason: collision with root package name */
    public Bitmap f1866t;

    public e(Handler handler, int i10, long j10) {
        if (!o.j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f1860b = Integer.MIN_VALUE;
        this.f1861e = Integer.MIN_VALUE;
        this.f1863j = handler;
        this.f1864m = i10;
        this.f1865n = j10;
    }

    @Override // f3.e
    public final void a(f3.d dVar) {
        ((e3.g) dVar).n(this.f1860b, this.f1861e);
    }

    @Override // f3.e
    public final /* bridge */ /* synthetic */ void b(Drawable drawable) {
    }

    @Override // f3.e
    public final void c(e3.c cVar) {
        this.f1862f = cVar;
    }

    @Override // com.bumptech.glide.manager.h
    public final /* bridge */ /* synthetic */ void d() {
    }

    @Override // f3.e
    public final /* bridge */ /* synthetic */ void e(f3.d dVar) {
    }

    @Override // f3.e
    public final /* bridge */ /* synthetic */ void f(Drawable drawable) {
    }

    @Override // f3.e
    public final e3.c g() {
        return this.f1862f;
    }

    @Override // f3.e
    public final void h(Drawable drawable) {
        this.f1866t = null;
    }

    @Override // f3.e
    public final void i(Object obj) {
        this.f1866t = (Bitmap) obj;
        Handler handler = this.f1863j;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f1865n);
    }

    @Override // com.bumptech.glide.manager.h
    public final /* bridge */ /* synthetic */ void j() {
    }

    @Override // com.bumptech.glide.manager.h
    public final /* bridge */ /* synthetic */ void onDestroy() {
    }
}