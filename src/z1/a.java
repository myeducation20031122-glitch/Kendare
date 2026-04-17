package z1;

import com.google.android.gms.internal.ads.ic1;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f19447b = new AtomicInteger(0);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f19448e;

    public a(boolean z7) {
        this.f19448e = z7;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbN = ic1.n(this.f19448e ? "WM.task-" : "androidx.work-");
        sbN.append(this.f19447b.incrementAndGet());
        return new Thread(runnable, sbN.toString());
    }
}