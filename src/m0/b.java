package m0;

import android.text.SpannableStringBuilder;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f15033d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f15034e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f15035f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f15036g;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15037a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15038b;

    /* renamed from: c, reason: collision with root package name */
    public final j f15039c;

    static {
        k kVar = l.f15050c;
        f15033d = Character.toString((char) 8206);
        f15034e = Character.toString((char) 8207);
        f15035f = new b(false, 2, kVar);
        f15036g = new b(true, 2, kVar);
    }

    public b(boolean z7, int i10, j jVar) {
        this.f15037a = z7;
        this.f15038b = i10;
        this.f15039c = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        if (r0.f15031c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f15031c = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = aVar.f15031c;
            if (i13 < aVar.f15030b && i10 == 0) {
                CharSequence charSequence2 = aVar.f15029a;
                char cCharAt = charSequence2.charAt(i13);
                aVar.f15032d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, aVar.f15031c);
                    aVar.f15031c = Character.charCount(iCodePointAt) + aVar.f15031c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    aVar.f15031c++;
                    char c10 = aVar.f15032d;
                    directionality = c10 < 1792 ? a.f15028e[c10] : Character.getDirectionality(c10);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i12 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case y4.g.INTERRUPTED /* 14 */:
                            case y4.g.TIMEOUT /* 15 */:
                                i12++;
                                i11 = -1;
                                continue;
                            case y4.g.CANCELED /* 16 */:
                            case y4.g.API_NOT_CONNECTED /* 17 */:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                }
                i10 = i12;
            }
        }
        return -1;
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f15031c = aVar.f15030b;
        int i10 = 0;
        int i11 = 0;
        while (aVar.f15031c > 0) {
            byte bA = aVar.a();
            if (bA != 0) {
                if (bA == 1 || bA == 2) {
                    if (i10 == 0) {
                        return 1;
                    }
                    if (i11 == 0) {
                        i11 = i10;
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case y4.g.INTERRUPTED /* 14 */:
                        case y4.g.TIMEOUT /* 15 */:
                            if (i11 == i10) {
                                return -1;
                            }
                            i10--;
                            break;
                        case y4.g.CANCELED /* 16 */:
                        case y4.g.API_NOT_CONNECTED /* 17 */:
                            if (i11 == i10) {
                                return 1;
                            }
                            i10--;
                            break;
                        case 18:
                            i10++;
                            break;
                        default:
                            if (i11 != 0) {
                                break;
                            } else {
                                i11 = i10;
                                break;
                            }
                    }
                } else {
                    continue;
                }
            } else {
                if (i10 == 0) {
                    return -1;
                }
                if (i11 == 0) {
                    i11 = i10;
                }
            }
        }
        return 0;
    }

    public final SpannableStringBuilder c(CharSequence charSequence, j jVar) {
        if (charSequence == null) {
            return null;
        }
        boolean zI = jVar.i(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.f15038b & 2;
        String str = "";
        String str2 = f15034e;
        String str3 = f15033d;
        boolean z7 = this.f15037a;
        if (i10 != 0) {
            boolean zI2 = (zI ? l.f15049b : l.f15048a).i(charSequence, charSequence.length());
            spannableStringBuilder.append((CharSequence) ((z7 || !(zI2 || a(charSequence) == 1)) ? (!z7 || (zI2 && a(charSequence) != -1)) ? "" : str2 : str3));
        }
        if (zI != z7) {
            spannableStringBuilder.append(zI ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zI3 = (zI ? l.f15049b : l.f15048a).i(charSequence, charSequence.length());
        if (!z7 && (zI3 || b(charSequence) == 1)) {
            str = str3;
        } else if (z7 && (!zI3 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}