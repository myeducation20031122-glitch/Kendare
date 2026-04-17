package n1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final int f15271b;

    /* renamed from: e, reason: collision with root package name */
    public final int f15272e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15273f;

    /* renamed from: j, reason: collision with root package name */
    public final String f15274j;

    public d(String str, int i10, String str2, int i11) {
        this.f15271b = i10;
        this.f15272e = i11;
        this.f15273f = str;
        this.f15274j = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        int i10 = this.f15271b - dVar.f15271b;
        return i10 == 0 ? this.f15272e - dVar.f15272e : i10;
    }
}