package fc;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public abstract class a1 {
    public static final ThreadLocal a = new ThreadLocal();

    public static e0 a() {
        ThreadLocal threadLocal = a;
        e0 e0Var = (e0) threadLocal.get();
        if (e0Var != null) {
            return e0Var;
        }
        c cVar = new c(Thread.currentThread());
        threadLocal.set(cVar);
        return cVar;
    }
}