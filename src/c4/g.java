package c4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final g f2104i = new g(320, 50, "320x50_mb");

    /* renamed from: j, reason: collision with root package name */
    public static final g f2105j;

    /* renamed from: k, reason: collision with root package name */
    public static final g f2106k;

    /* renamed from: a, reason: collision with root package name */
    public final int f2107a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2108b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2109c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2110d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2111e;

    /* renamed from: f, reason: collision with root package name */
    public int f2112f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2113g;

    /* renamed from: h, reason: collision with root package name */
    public int f2114h;

    static {
        new g(468, 60, "468x60_as");
        new g(320, 100, "320x100_as");
        new g(728, 90, "728x90_as");
        new g(300, 250, "300x250_as");
        new g(160, 600, "160x600_as");
        new g(-1, -2, "smart_banner");
        f2105j = new g(-3, -4, "fluid");
        f2106k = new g(0, 0, "invalid");
        new g(50, 50, "50x50_mb");
        new g(-3, 0, "search_v2");
    }

    public g(int i10, int i11) {
        this(i10, i11, (i10 == -1 ? "FULL" : String.valueOf(i10)) + "x" + (i11 == -2 ? "AUTO" : String.valueOf(i11)) + "_as");
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f2107a == gVar.f2107a && this.f2108b == gVar.f2108b && this.f2109c.equals(gVar.f2109c);
    }

    public final int hashCode() {
        return this.f2109c.hashCode();
    }

    public final String toString() {
        return this.f2109c;
    }

    public g(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            throw new IllegalArgumentException(kc.r.d("Invalid width for AdSize: ", i10));
        }
        if (i11 < 0 && i11 != -2 && i11 != -4) {
            throw new IllegalArgumentException(kc.r.d("Invalid height for AdSize: ", i11));
        }
        this.f2107a = i10;
        this.f2108b = i11;
        this.f2109c = str;
    }
}