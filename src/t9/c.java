package t9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18066b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f18067e;

    public /* synthetic */ c(f fVar, int i10) {
        this.f18066b = i10;
        this.f18067e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f18066b;
        f fVar = this.f18067e;
        switch (i10) {
            case 0:
                fVar.d();
                break;
            default:
                fVar.c();
                break;
        }
    }
}