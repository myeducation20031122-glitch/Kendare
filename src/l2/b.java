package l2;

import android.os.Handler;
import g.e;
import java.util.concurrent.Executor;
import r3.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14533b;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14534e;

    public /* synthetic */ b(Object obj, int i10) {
        this.f14533b = i10;
        this.f14534e = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f14533b;
        Object obj = this.f14534e;
        switch (i10) {
            case 0:
                ((Handler) ((e) obj).f12764f).post(runnable);
                break;
            default:
                ((Executor) obj).execute(new o(runnable));
                break;
        }
    }
}