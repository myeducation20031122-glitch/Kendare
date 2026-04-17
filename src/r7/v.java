package r7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f16643a = fc.t.a("awaitEvenIfOnMainThread task continuation executor");

    public static Object a(x5.s sVar) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        sVar.e(f16643a, new e0.g(countDownLatch, 13));
        countDownLatch.await(4L, TimeUnit.SECONDS);
        if (sVar.j()) {
            return sVar.h();
        }
        if (sVar.f19034d) {
            throw new CancellationException("Task is already canceled");
        }
        if (sVar.i()) {
            throw new IllegalStateException(sVar.g());
        }
        throw new TimeoutException();
    }
}