package m7;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l implements f8.c, f8.b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15208a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f15209b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f15210c;

    public l(Executor executor) {
        this.f15210c = executor;
    }

    public final synchronized void a(Executor executor, f8.a aVar) {
        try {
            executor.getClass();
            if (!this.f15208a.containsKey(i7.a.class)) {
                this.f15208a.put(i7.a.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f15208a.get(i7.a.class)).put(aVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}