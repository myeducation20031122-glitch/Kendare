package k5;

import android.content.Context;
import x5.m;
import x5.s;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i implements u4.a {

    /* renamed from: a, reason: collision with root package name */
    public final h f14022a;

    /* renamed from: b, reason: collision with root package name */
    public final f f14023b;

    public i(Context context) {
        f fVar;
        this.f14022a = new h(context, x4.g.f18964b);
        synchronized (f.class) {
            try {
                if (f.f14015c == null) {
                    f.f14015c = new f(context.getApplicationContext());
                }
                fVar = f.f14015c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f14023b = fVar;
    }

    @Override // u4.a
    public final s a() {
        s sVarA = this.f14022a.a();
        p8.c cVar = new p8.c(this, 27);
        sVarA.getClass();
        return sVarA.f(m.f19012a, cVar);
    }
}