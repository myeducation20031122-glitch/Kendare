package fc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class g extends l {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(g.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    public g(Continuation continuation, Throwable th, boolean z) {
        super(z, th);
        this._resumed = 0;
    }
}