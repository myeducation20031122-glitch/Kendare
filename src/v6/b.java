package v6;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f18413a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18414b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f18413a;
            f10 += ((b) cVar).f18414b;
        }
        this.f18413a = cVar;
        this.f18414b = f10;
    }

    @Override // v6.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f18413a.a(rectF) + this.f18414b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18413a.equals(bVar.f18413a) && this.f18414b == bVar.f18414b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18413a, Float.valueOf(this.f18414b)});
    }
}