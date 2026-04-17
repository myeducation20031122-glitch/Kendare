package n2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f15307b;

    public f(Handler handler) {
        this.f15307b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f15307b.post(runnable);
    }
}