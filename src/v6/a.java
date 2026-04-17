package v6;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f18412a;

    public a(float f10) {
        this.f18412a = f10;
    }

    @Override // v6.c
    public final float a(RectF rectF) {
        return this.f18412a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f18412a == ((a) obj).f18412a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f18412a)});
    }
}