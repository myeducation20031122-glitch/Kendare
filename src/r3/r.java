package r3;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r implements q {

    /* renamed from: e, reason: collision with root package name */
    public static volatile j f16427e;

    /* renamed from: a, reason: collision with root package name */
    public final z3.a f16428a;

    /* renamed from: b, reason: collision with root package name */
    public final z3.a f16429b;

    /* renamed from: c, reason: collision with root package name */
    public final v3.c f16430c;

    /* renamed from: d, reason: collision with root package name */
    public final w3.k f16431d;

    public r(z3.a aVar, z3.a aVar2, v3.c cVar, w3.k kVar, w3.l lVar) {
        this.f16428a = aVar;
        this.f16429b = aVar2;
        this.f16430c = cVar;
        this.f16431d = kVar;
        lVar.getClass();
        lVar.f18643a.execute(new androidx.activity.d(lVar, 7));
    }

    public static r a() {
        j jVar = f16427e;
        if (jVar != null) {
            return (r) jVar.f16417n.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f16427e == null) {
            synchronized (r.class) {
                try {
                    if (f16427e == null) {
                        androidx.emoji2.text.o oVar = new androidx.emoji2.text.o();
                        context.getClass();
                        oVar.f883b = context;
                        f16427e = oVar.d();
                    }
                } finally {
                }
            }
        }
    }

    public final p c(p3.a aVar) {
        Set setSingleton;
        byte[] bytes;
        if (aVar instanceof k) {
            aVar.getClass();
            setSingleton = Collections.unmodifiableSet(p3.a.f15917d);
        } else {
            setSingleton = Collections.singleton(new o3.c("proto"));
        }
        g.e eVarA = i.a();
        aVar.getClass();
        eVarA.N("cct");
        String str = aVar.f15920a;
        String str2 = aVar.f15921b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            Object[] objArr = new Object[4];
            objArr[0] = "1$";
            objArr[1] = str;
            objArr[2] = "\\";
            if (str2 == null) {
                str2 = "";
            }
            objArr[3] = str2;
            bytes = String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
        }
        eVarA.f12764f = bytes;
        return new p(setSingleton, eVarA.k(), this);
    }
}