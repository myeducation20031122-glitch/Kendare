package g4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f13016a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13017b;

    public a(String str, boolean z7) {
        this.f13016a = str;
        this.f13017b = z7;
    }

    public final String toString() {
        String str = this.f13016a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(this.f13017b);
        return sb.toString();
    }
}