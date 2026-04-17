package z2;

import android.graphics.Bitmap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class e implements q2.r {
    @Override // q2.r
    public final s2.e0 b(com.bumptech.glide.h hVar, s2.e0 e0Var, int i10, int i11) {
        if (!i3.o.j(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        t2.d dVar = com.bumptech.glide.b.b(hVar).f2230b;
        Bitmap bitmap = (Bitmap) e0Var.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(dVar, bitmap, i10, i11);
        return bitmap.equals(bitmapC) ? e0Var : d.e(bitmapC, dVar);
    }

    public abstract Bitmap c(t2.d dVar, Bitmap bitmap, int i10, int i11);
}