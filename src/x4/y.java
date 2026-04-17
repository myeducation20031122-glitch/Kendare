package x4;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y extends z {

    /* renamed from: e, reason: collision with root package name */
    public final Callable f19005e;

    public /* synthetic */ y(o oVar) {
        super(false, null, null);
        this.f19005e = oVar;
    }

    @Override // x4.z
    public final String a() {
        try {
            return (String) this.f19005e.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}