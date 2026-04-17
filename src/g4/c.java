package g4;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f13025b;

    /* renamed from: e, reason: collision with root package name */
    public final long f13026e;

    /* renamed from: f, reason: collision with root package name */
    public final CountDownLatch f13027f = new CountDownLatch(1);

    /* renamed from: j, reason: collision with root package name */
    public boolean f13028j = false;

    public c(b bVar, long j10) {
        this.f13025b = new WeakReference(bVar);
        this.f13026e = j10;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        b bVar;
        WeakReference weakReference = this.f13025b;
        try {
            if (this.f13027f.await(this.f13026e, TimeUnit.MILLISECONDS) || (bVar = (b) weakReference.get()) == null) {
                return;
            }
            bVar.c();
            this.f13028j = true;
        } catch (InterruptedException unused) {
            b bVar2 = (b) weakReference.get();
            if (bVar2 != null) {
                bVar2.c();
                this.f13028j = true;
            }
        }
    }
}