package z2;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f19534b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(q2.j.f16126a);

    @Override // q2.j
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f19534b);
    }

    @Override // z2.e
    public final Bitmap c(t2.d dVar, Bitmap bitmap, int i10, int i11) {
        Paint paint = b0.f19509a;
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return b0.b(dVar, bitmap, i10, i11);
        }
        if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        }
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        return bitmap;
    }

    @Override // q2.j
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // q2.j
    public final int hashCode() {
        return -670243078;
    }
}