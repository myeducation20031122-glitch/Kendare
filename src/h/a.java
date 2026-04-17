package h;

import android.graphics.drawable.Animatable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends com.bumptech.glide.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13097g;

    /* renamed from: h, reason: collision with root package name */
    public final Animatable f13098h;

    public /* synthetic */ a(Animatable animatable, int i10) {
        this.f13097g = i10;
        this.f13098h = animatable;
    }

    @Override // com.bumptech.glide.d
    public final void F() {
        int i10 = this.f13097g;
        Animatable animatable = this.f13098h;
        switch (i10) {
            case 0:
                animatable.start();
                break;
            default:
                ((u1.e) animatable).start();
                break;
        }
    }

    @Override // com.bumptech.glide.d
    public final void G() {
        int i10 = this.f13097g;
        Animatable animatable = this.f13098h;
        switch (i10) {
            case 0:
                animatable.stop();
                break;
            default:
                ((u1.e) animatable).stop();
                break;
        }
    }
}