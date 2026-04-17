package z4;

import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f19674a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f19675b;

    /* renamed from: c, reason: collision with root package name */
    public volatile k f19676c;

    public m(Looper looper, Object obj, String str) {
        this.f19674a = new f5.a(looper);
        if (obj == null) {
            throw new NullPointerException("Listener must not be null");
        }
        this.f19675b = obj;
        fc.t.g(str);
        this.f19676c = new k(obj, str);
    }

    public final void a(l lVar) {
        this.f19674a.execute(new m.k(this, lVar, 29));
    }

    public m(p5.h hVar) {
        this.f19674a = p5.c0.f15945b;
        this.f19675b = hVar;
        fc.t.g("GetCurrentLocation");
        this.f19676c = new k(hVar, "GetCurrentLocation");
    }
}