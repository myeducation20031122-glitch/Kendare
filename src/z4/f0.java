package z4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f19632a;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new f5.b());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f19632a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}