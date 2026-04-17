package d7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final x5.l f12326b;

    public k() {
        this.f12326b = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            x5.l lVar = this.f12326b;
            if (lVar != null) {
                lVar.c(e10);
            }
        }
    }

    public k(x5.l lVar) {
        this.f12326b = lVar;
    }
}