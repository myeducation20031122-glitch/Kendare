package t5;

import java.lang.Thread;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f17680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a4 f17681b;

    public x3(a4 a4Var, String str) {
        this.f17681b = a4Var;
        this.f17680a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        i3 i3Var = ((b4) this.f17681b.f15046b).f17251w;
        b4.i(i3Var);
        i3Var.f17397n.b(th, this.f17680a);
    }
}