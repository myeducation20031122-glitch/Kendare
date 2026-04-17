package c7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.h01;
import g0.q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m.s3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static s3 f2149a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f2150b = true;

    public static Drawable g(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f2150b) {
                return com.bumptech.glide.c.c(theme != null ? new k.d(context2, theme) : context2, i10);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            Object obj = f0.f.f12651a;
            return f0.a.b(context2, i10);
        } catch (NoClassDefFoundError unused2) {
            f2150b = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = q.f12975a;
        return g0.j.a(resources, i10, theme);
    }

    public static cc.c h(Function2 block) {
        Intrinsics.f(block, "block");
        cc.c cVar = new cc.c();
        cVar.j = dq0.d(cVar, cVar, block);
        return cVar;
    }

    public static int n(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long o(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public abstract boolean a(k2.h hVar, k2.c cVar, k2.c cVar2);

    public abstract boolean b(u.g gVar, u.d dVar, u.d dVar2);

    public abstract boolean c(k2.h hVar, Object obj, Object obj2);

    public abstract boolean d(u.g gVar, Object obj, Object obj2);

    public abstract boolean e(k2.h hVar, k2.g gVar, k2.g gVar2);

    public abstract boolean f(u.g gVar, u.f fVar, u.f fVar2);

    public abstract void i(k2.g gVar, k2.g gVar2);

    public abstract void j(u.f fVar, u.f fVar2);

    public abstract void k(k2.g gVar, Thread thread);

    public abstract void l(u.f fVar, Thread thread);

    public abstract h01 m();
}