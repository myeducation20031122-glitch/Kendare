package g2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import g.i0;
import z1.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c extends d {

    /* renamed from: h, reason: collision with root package name */
    public static final String f12995h = o.t("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final i0 f12996g;

    public c(Context context, l2.a aVar) {
        super(context, aVar);
        this.f12996g = new i0(this, 1);
    }

    @Override // g2.d
    public final void d() {
        o.r().p(f12995h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f12999b.registerReceiver(this.f12996g, f());
    }

    @Override // g2.d
    public final void e() {
        o.r().p(f12995h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f12999b.unregisterReceiver(this.f12996g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}