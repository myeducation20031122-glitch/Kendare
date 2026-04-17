package u;

import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends Throwable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18094b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b() {
        super("Failure occurred while trying to finish a future.");
        this.f18094b = 2;
    }

    private synchronized void a() {
    }

    private synchronized void b() {
    }

    private final synchronized void c() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f18094b) {
            case 0:
                a();
                return this;
            case QueueFuseable.SYNC /* 1 */:
                b();
                return this;
            default:
                c();
                return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super("Failure occurred while trying to finish a future.");
        this.f18094b = i10;
    }
}