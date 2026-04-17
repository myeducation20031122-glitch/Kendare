package p5;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final StringBuilder f15989a;

    static {
        Locale locale = Locale.ROOT;
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f15989a = new StringBuilder(33);
    }

    public static void a(long j10, StringBuilder sb) {
        String str;
        if (j10 == 0) {
            str = "0s";
        } else {
            sb.ensureCapacity(sb.length() + 27);
            boolean z7 = false;
            if (j10 < 0) {
                sb.append("-");
                if (j10 != Long.MIN_VALUE) {
                    j10 = -j10;
                } else {
                    j10 = Long.MAX_VALUE;
                    z7 = true;
                }
            }
            if (j10 >= 86400000) {
                sb.append(j10 / 86400000);
                sb.append("d");
                j10 %= 86400000;
            }
            if (true == z7) {
                j10 = 25975808;
            }
            if (j10 >= 3600000) {
                sb.append(j10 / 3600000);
                sb.append("h");
                j10 %= 3600000;
            }
            if (j10 >= 60000) {
                sb.append(j10 / 60000);
                sb.append("m");
                j10 %= 60000;
            }
            if (j10 >= 1000) {
                sb.append(j10 / 1000);
                sb.append("s");
                j10 %= 1000;
            }
            if (j10 <= 0) {
                return;
            }
            sb.append(j10);
            str = "ms";
        }
        sb.append(str);
    }
}