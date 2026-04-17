package z2;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v {

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f19561g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f19562h;

    /* renamed from: i, reason: collision with root package name */
    public static final File f19563i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile v f19564j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile int f19565k;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19566a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19567b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19568c;

    /* renamed from: d, reason: collision with root package name */
    public int f19569d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19570e = true;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f19571f = new AtomicBoolean(false);

    static {
        int i10 = Build.VERSION.SDK_INT;
        f19561g = i10 < 29;
        f19562h = i10 >= 26;
        f19563i = new File("/proc/self/fd");
        f19565k = -1;
    }

    public v() {
        boolean z7 = true;
        if (Build.VERSION.SDK_INT == 26) {
            Iterator it = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    break;
                }
            }
            if (Build.VERSION.SDK_INT == 27) {
                z7 = false;
            }
        } else if (Build.VERSION.SDK_INT == 27 && Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL)) {
            z7 = false;
        }
        this.f19566a = z7;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f19567b = 20000;
            this.f19568c = 0;
        } else {
            this.f19567b = 700;
            this.f19568c = 128;
        }
    }

    public static v a() {
        if (f19564j == null) {
            synchronized (v.class) {
                try {
                    if (f19564j == null) {
                        f19564j = new v();
                    }
                } finally {
                }
            }
        }
        return f19564j;
    }

    public final boolean b(int i10, int i11, boolean z7, boolean z10) {
        boolean z11;
        if (!z7) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!this.f19566a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        }
        if (!f19562h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (f19561g && !this.f19571f.get()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        int i12 = this.f19568c;
        if (i10 < i12) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
            }
            return false;
        }
        if (i11 < i12) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
            }
            return false;
        }
        synchronized (this) {
            try {
                int i13 = this.f19569d + 1;
                this.f19569d = i13;
                if (i13 >= 50) {
                    this.f19569d = 0;
                    int length = f19563i.list().length;
                    long j10 = f19565k != -1 ? f19565k : this.f19567b;
                    boolean z12 = ((long) length) < j10;
                    this.f19570e = z12;
                    if (!z12 && Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j10);
                    }
                }
                z11 = this.f19570e;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z11) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }
}