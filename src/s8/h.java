package s8;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16913a;

    static {
        int i10;
        String property = System.getProperty("java.version");
        try {
            String[] strArrSplit = property.split("[._]");
            i10 = Integer.parseInt(strArrSplit[0]);
            if (i10 == 1 && strArrSplit.length > 1) {
                i10 = Integer.parseInt(strArrSplit[1]);
            }
        } catch (NumberFormatException unused) {
            i10 = -1;
        }
        if (i10 == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i11 = 0; i11 < property.length(); i11++) {
                    char cCharAt = property.charAt(i11);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb.append(cCharAt);
                }
                i10 = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i10 = -1;
            }
        }
        if (i10 == -1) {
            i10 = 6;
        }
        f16913a = i10;
    }
}