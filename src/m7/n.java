package m7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n implements i8.c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f15211c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f15212a = f15211c;

    /* renamed from: b, reason: collision with root package name */
    public volatile i8.c f15213b;

    public n(i7.b bVar) {
        this.f15213b = bVar;
    }

    @Override // i8.c
    public final Object get() {
        Object obj = this.f15212a;
        Object obj2 = f15211c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f15212a;
                    if (obj == obj2) {
                        obj = this.f15213b.get();
                        this.f15212a = obj;
                        this.f15213b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}