package i3;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f13305a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f13306b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    public static volatile Handler f13307c;

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = n.f13304a[config.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2 || i10 == 3) {
            return 2;
        }
        return i10 != 4 ? 4 : 8;
    }

    public static ArrayList e(Set set) {
        ArrayList arrayList = new ArrayList(set.size());
        for (Object obj : set) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler f() {
        if (f13307c == null) {
            synchronized (o.class) {
                try {
                    if (f13307c == null) {
                        f13307c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f13307c;
    }

    public static int g(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    public static int h(int i10, Object obj) {
        return g(obj == null ? 0 : obj.hashCode(), i10);
    }

    public static int i(int i10, boolean z7) {
        return g(z7 ? 1 : 0, i10);
    }

    public static boolean j(int i10, int i11) {
        return (i10 > 0 || i10 == Integer.MIN_VALUE) && (i11 > 0 || i11 == Integer.MIN_VALUE);
    }
}