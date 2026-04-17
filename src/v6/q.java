package v6;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q extends r {

    /* renamed from: b, reason: collision with root package name */
    public float f18488b;

    /* renamed from: c, reason: collision with root package name */
    public float f18489c;

    @Override // v6.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f18490a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f18488b, this.f18489c);
        path.transform(matrix);
    }
}