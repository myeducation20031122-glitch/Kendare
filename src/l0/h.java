package l0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.google.android.gms.internal.ads.yl0;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m.t;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final t.f f14449a = new t.f(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f14450b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f14451c;

    /* renamed from: d, reason: collision with root package name */
    public static final t.k f14452d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new k());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f14450b = threadPoolExecutor;
        f14451c = new Object();
        f14452d = new t.k();
    }

    public static g a(String str, Context context, t tVar, int i10) {
        t.f fVar = f14449a;
        Typeface typeface = (Typeface) fVar.b(str);
        if (typeface != null) {
            return new g(typeface);
        }
        try {
            yl0 yl0VarA = d.a(context, tVar);
            int i11 = yl0VarA.f10132e;
            int i12 = 1;
            if (i11 != 0) {
                i12 = i11 != 1 ? -3 : -2;
            } else {
                i[] iVarArr = (i[]) yl0VarA.f10133f;
                if (iVarArr != null && iVarArr.length != 0) {
                    int length = iVarArr.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            i12 = 0;
                            break;
                        }
                        int i14 = iVarArr[i13].f14457e;
                        if (i14 == 0) {
                            i13++;
                        } else if (i14 >= 0) {
                            i12 = i14;
                        }
                    }
                }
            }
            if (i12 != 0) {
                return new g(i12);
            }
            Typeface typefaceO = h0.h.f13153a.o(context, (i[]) yl0VarA.f10133f, i10);
            if (typefaceO == null) {
                return new g(-3);
            }
            fVar.c(str, typefaceO);
            return new g(typefaceO);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(-1);
        }
    }
}