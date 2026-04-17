package g;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12910b;

    public /* synthetic */ w(int i10) {
        this.f12910b = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f12910b) {
            case 0:
                new Thread(runnable).start();
                break;
            case QueueFuseable.SYNC /* 1 */:
                i3.o.f().post(runnable);
                break;
            case 2:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}