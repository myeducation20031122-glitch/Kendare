package m7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Class f15202a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15203b;

    public i(Class cls, boolean z7) {
        this.f15202a = cls;
        this.f15203b = z7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.f15202a.equals(this.f15202a) && iVar.f15203b == this.f15203b;
    }

    public final int hashCode() {
        return ((this.f15202a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f15203b).hashCode();
    }
}