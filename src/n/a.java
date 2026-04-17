package n;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.concurrent.Executor;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class a implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15241b;

    public /* synthetic */ a(int i10) {
        this.f15241b = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f15241b) {
            case QueueFuseable.SYNC /* 1 */:
                b.p().f15244c.f15249d.execute(runnable);
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                runnable.run();
                break;
            case g.INVALID_ACCOUNT /* 5 */:
                runnable.run();
                break;
            case g.RESOLUTION_REQUIRED /* 6 */:
                runnable.run();
                break;
            case g.NETWORK_ERROR /* 7 */:
                runnable.run();
                break;
            case 8:
                runnable.run();
                break;
            case 9:
                runnable.run();
                break;
            case g.DEVELOPER_ERROR /* 10 */:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}