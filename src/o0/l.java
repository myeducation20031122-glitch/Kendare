package o0;

import android.view.DisplayCutout;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f15578a;

    public l(DisplayCutout displayCutout) {
        this.f15578a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f15578a, ((l) obj).f15578a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f15578a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f15578a + "}";
    }
}