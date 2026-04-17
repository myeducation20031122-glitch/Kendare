package l1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class b extends t {
    public abstract void d(q1.g gVar, Object obj);

    public final void e(Object obj) {
        q1.g gVarA = a();
        try {
            d(gVarA, obj);
            gVarA.f16112e.executeInsert();
        } finally {
            c(gVarA);
        }
    }
}