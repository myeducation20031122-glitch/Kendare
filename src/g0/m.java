package g0;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f12967a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f12968b;

    public m(Resources resources, Resources.Theme theme) {
        this.f12967a = resources;
        this.f12968b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f12967a.equals(mVar.f12967a) && Objects.equals(this.f12968b, mVar.f12968b);
    }

    public final int hashCode() {
        return Objects.hash(this.f12967a, this.f12968b);
    }
}