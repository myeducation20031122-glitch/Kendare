package f5;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.bu0;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12688b;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f12689e;

    public a() {
        this.f12688b = 2;
        this.f12689e = new bu0(Looper.getMainLooper(), 3);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f12688b;
        Handler handler = this.f12689e;
        switch (i10) {
            case 0:
                handler.post(runnable);
                break;
            case QueueFuseable.SYNC /* 1 */:
                handler.post(runnable);
                break;
            default:
                handler.post(runnable);
                break;
        }
    }

    public /* synthetic */ a(Handler handler) {
        this.f12688b = 1;
        this.f12689e = handler;
    }

    public a(Looper looper) {
        this.f12688b = 0;
        this.f12689e = new bu0(looper, 2);
    }
}