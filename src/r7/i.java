package r7;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16577b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f16578e;

    public i(j jVar, long j10) {
        this.f16578e = jVar;
        this.f16577b = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f16577b);
        this.f16578e.f16589j.h(bundle);
        return null;
    }
}