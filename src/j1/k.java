package j1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final u.h f13565a = new u.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f13566b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static g8.e f13567c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return (Build.VERSION.SDK_INT >= 33 ? i.a(packageManager, context) : packageManager.getPackageInfo(context.getPackageName(), 0)).lastUpdateTime;
    }

    public static g8.e b() {
        g8.e eVar = new g8.e();
        f13567c = eVar;
        u.h hVar = f13565a;
        hVar.getClass();
        if (u.g.f18109n.d(hVar, null, eVar)) {
            u.g.b(hVar);
        }
        return f13567c;
    }

    public static void c(Context context, boolean z7) {
        j jVarA;
        int i10;
        if (z7 || f13567c == null) {
            synchronized (f13566b) {
                if (!z7) {
                    try {
                        if (f13567c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28 && i11 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i12 = 0;
                    boolean z10 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z11 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                jVarA = j.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            jVarA = null;
                        }
                        if (jVarA != null && jVarA.f13563c == jA && (i10 = jVarA.f13562b) != 2) {
                            i12 = i10;
                        } else if (z10) {
                            i12 = 1;
                        } else if (z11) {
                            i12 = 2;
                        }
                        if (z7 && z11 && i12 != 1) {
                            i12 = 2;
                        }
                        j jVar = new j(1, (jVarA == null || jVarA.f13562b != 2 || i12 != 1 || length >= jVarA.f13564d) ? i12 : 3, jA, length2);
                        if (jVarA == null || !jVarA.equals(jVar)) {
                            try {
                                jVar.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}