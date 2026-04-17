package m0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f15045a = new h();

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // m0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(CharSequence charSequence, int i10) {
        int i11 = 2;
        for (int i12 = 0; i12 < i10 && i11 == 2; i12++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i12));
            k kVar = l.f15048a;
            if (directionality == 0) {
                i11 = 1;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case y4.g.INTERRUPTED /* 14 */:
                    case y4.g.TIMEOUT /* 15 */:
                        break;
                    case y4.g.CANCELED /* 16 */:
                    case y4.g.API_NOT_CONNECTED /* 17 */:
                        break;
                    default:
                        i11 = 2;
                        break;
                }
            } else {
                i11 = 0;
            }
        }
        return i11;
    }
}