package p5;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f15945b;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c0[] f15946e;

    static {
        c0 c0Var = new c0("INSTANCE", 0);
        f15945b = c0Var;
        f15946e = new c0[]{c0Var};
    }

    public static c0[] values() {
        return (c0[]) f15946e.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}