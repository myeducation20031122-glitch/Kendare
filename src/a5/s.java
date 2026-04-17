package a5;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s implements y4.b {

    /* renamed from: c, reason: collision with root package name */
    public static final s f402c = new s(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f403b;

    public /* synthetic */ s(String str) {
        this.f403b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            return o5.y.i(this.f403b, ((s) obj).f403b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f403b});
    }
}