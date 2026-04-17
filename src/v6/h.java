package v6;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f18449a;

    public h(float f10) {
        this.f18449a = f10;
    }

    @Override // v6.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f18449a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f18449a == ((h) obj).f18449a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f18449a)});
    }
}