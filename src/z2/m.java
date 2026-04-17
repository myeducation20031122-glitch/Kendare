package z2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends n {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f19537h;

    public m(int i10) {
        this.f19537h = i10;
    }

    @Override // z2.n
    public final int a(int i10, int i11, int i12, int i13) {
        switch (this.f19537h) {
            case 2:
                if (b(i10, i11, i12, i13) == 1.0f) {
                    return 2;
                }
                return n.f19538a.a(i10, i11, i12, i13);
            case 3:
            default:
                return 2;
            case 4:
                return n.f19544g ? 2 : 1;
        }
    }

    @Override // z2.n
    public final float b(int i10, int i11, int i12, int i13) {
        switch (this.f19537h) {
            case 2:
                return Math.min(1.0f, n.f19538a.b(i10, i11, i12, i13));
            case 3:
                return Math.max(i12 / i10, i13 / i11);
            case 4:
                if (n.f19544g) {
                    return Math.min(i12 / i10, i13 / i11);
                }
                return Math.max(i11 / i13, i10 / i12) != 0 ? 1.0f / Integer.highestOneBit(r3) : 1.0f;
            default:
                return 1.0f;
        }
    }
}