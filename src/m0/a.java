package m0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f15028e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f15029a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15030b;

    /* renamed from: c, reason: collision with root package name */
    public int f15031c;

    /* renamed from: d, reason: collision with root package name */
    public char f15032d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f15028e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f15029a = charSequence;
        this.f15030b = charSequence.length();
    }

    public final byte a() {
        int i10 = this.f15031c - 1;
        CharSequence charSequence = this.f15029a;
        char cCharAt = charSequence.charAt(i10);
        this.f15032d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f15031c);
            this.f15031c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f15031c--;
        char c10 = this.f15032d;
        return c10 < 1792 ? f15028e[c10] : Character.getDirectionality(c10);
    }
}