package h;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends com.bumptech.glide.d {

    /* renamed from: g, reason: collision with root package name */
    public final ObjectAnimator f13099g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13100h;

    public c(AnimationDrawable animationDrawable, boolean z7, boolean z10) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i10 = z7 ? numberOfFrames - 1 : 0;
        int i11 = z7 ? 0 : numberOfFrames - 1;
        d dVar = new d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        dVar.f13102b = numberOfFrames2;
        int[] iArr = dVar.f13101a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            dVar.f13101a = new int[numberOfFrames2];
        }
        int[] iArr2 = dVar.f13101a;
        int i12 = 0;
        for (int i13 = 0; i13 < numberOfFrames2; i13++) {
            int duration = animationDrawable.getDuration(z7 ? (numberOfFrames2 - i13) - 1 : i13);
            iArr2[i13] = duration;
            i12 += duration;
        }
        dVar.f13103c = i12;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(dVar.f13103c);
        objectAnimatorOfInt.setInterpolator(dVar);
        this.f13100h = z10;
        this.f13099g = objectAnimatorOfInt;
    }

    @Override // com.bumptech.glide.d
    public final void C() {
        this.f13099g.reverse();
    }

    @Override // com.bumptech.glide.d
    public final void F() {
        this.f13099g.start();
    }

    @Override // com.bumptech.glide.d
    public final void G() {
        this.f13099g.cancel();
    }

    @Override // com.bumptech.glide.d
    public final boolean e() {
        return this.f13100h;
    }
}