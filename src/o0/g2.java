package o0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class g2 extends f2 {
    public g2(m2 m2Var, WindowInsets windowInsets) {
        super(m2Var, windowInsets);
    }

    @Override // o0.j2
    public m2 a() {
        return m2.g(null, this.f15536c.consumeDisplayCutout());
    }

    @Override // o0.j2
    public l e() {
        DisplayCutout displayCutout = this.f15536c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new l(displayCutout);
    }

    @Override // o0.e2, o0.j2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return Objects.equals(this.f15536c, g2Var.f15536c) && Objects.equals(this.f15540g, g2Var.f15540g);
    }

    @Override // o0.j2
    public int hashCode() {
        return this.f15536c.hashCode();
    }
}