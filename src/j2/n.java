package j2;

import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.kq;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n implements z1.i {

    /* renamed from: a, reason: collision with root package name */
    public final l2.a f13610a;

    /* renamed from: b, reason: collision with root package name */
    public final h2.a f13611b;

    /* renamed from: c, reason: collision with root package name */
    public final kq f13612c;

    static {
        z1.o.t("WMFgUpdater");
    }

    public n(WorkDatabase workDatabase, h2.a aVar, l2.a aVar2) {
        this.f13611b = aVar;
        this.f13610a = aVar2;
        this.f13612c = workDatabase.n();
    }
}