package n2;

import android.util.Log;
import com.google.android.gms.internal.ads.ic1;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f15282a = Log.isLoggable("Volley", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final String f15283b = a0.class.getName();

    public static String a(String str, Object... objArr) {
        String string;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 >= stackTrace.length) {
                string = "<unknown>";
                break;
            }
            if (!stackTrace[i10].getClassName().equals(f15283b)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder sbO = ic1.o(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".");
                sbO.append(stackTrace[i10].getMethodName());
                string = sbO.toString();
                break;
            }
            i10++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), string, str2);
    }

    public static void b(String str, Object... objArr) {
        Log.d("Volley", a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e("Volley", a(str, objArr));
    }

    public static void d(String str, Object... objArr) {
        if (f15282a) {
            Log.v("Volley", a(str, objArr));
        }
    }
}