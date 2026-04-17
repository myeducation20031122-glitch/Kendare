package q3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r extends c0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f16218a;

    public r(b0 b0Var) {
        this.f16218a = b0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        b0 b0Var = this.f16218a;
        return b0Var == null ? ((r) c0Var).f16218a == null : b0Var.equals(((r) c0Var).f16218a);
    }

    public final int hashCode() {
        b0 b0Var = this.f16218a;
        return (b0Var == null ? 0 : b0Var.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f16218a + "}";
    }
}