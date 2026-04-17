package z2;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f19526b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(q2.j.f16126a);

    @Override // q2.j
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f19526b);
    }

    @Override // z2.e
    public final Bitmap c(t2.d dVar, Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        Paint paint = b0.f19509a;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            width = i11 / bitmap.getHeight();
            width2 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapB = dVar.b(i10, i11, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapB.setHasAlpha(bitmap.hasAlpha());
        b0.a(bitmap, bitmapB, matrix);
        return bitmapB;
    }

    @Override // q2.j
    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    @Override // q2.j
    public final int hashCode() {
        return -599754482;
    }
}