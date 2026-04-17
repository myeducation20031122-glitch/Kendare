package z2;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f19560b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(q2.j.f16126a);

    @Override // q2.j
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f19560b);
    }

    @Override // z2.e
    public final Bitmap c(t2.d dVar, Bitmap bitmap, int i10, int i11) {
        return b0.b(dVar, bitmap, i10, i11);
    }

    @Override // q2.j
    public final boolean equals(Object obj) {
        return obj instanceof u;
    }

    @Override // q2.j
    public final int hashCode() {
        return 1572326941;
    }
}