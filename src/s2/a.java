package s2;

import java.util.concurrent.ThreadFactory;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16680b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a() {
        this(1);
        this.f16680b = 1;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f16680b) {
            case 0:
                return new Thread(new m.k(18, this, runnable), "glide-active-resources");
            default:
                return new v2.a(this, runnable);
        }
    }

    public /* synthetic */ a(int i10) {
        this.f16680b = i10;
    }
}