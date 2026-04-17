package m;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14995a;

    /* renamed from: b, reason: collision with root package name */
    public int f14996b;

    /* renamed from: c, reason: collision with root package name */
    public int f14997c;

    /* renamed from: d, reason: collision with root package name */
    public int f14998d;

    /* renamed from: e, reason: collision with root package name */
    public int f14999e;

    /* renamed from: f, reason: collision with root package name */
    public int f15000f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15001g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15002h;

    public final void a(int i10, int i11) {
        this.f14997c = i10;
        this.f14998d = i11;
        this.f15002h = true;
        if (this.f15001g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f14995a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f14996b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f14995a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f14996b = i11;
        }
    }
}