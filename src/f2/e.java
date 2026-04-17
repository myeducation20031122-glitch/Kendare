package f2;

import android.os.Build;
import i2.j;
import z1.o;
import z1.p;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f12666e = o.t("NetworkNotRoamingCtrlr");

    @Override // f2.c
    public final boolean a(j jVar) {
        return jVar.f13267j.f19459a == p.f19485j;
    }

    @Override // f2.c
    public final boolean b(Object obj) {
        e2.a aVar = (e2.a) obj;
        boolean z7 = true;
        if (Build.VERSION.SDK_INT < 24) {
            o.r().p(f12666e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !aVar.f12460a;
        }
        if (aVar.f12460a && aVar.f12463d) {
            z7 = false;
        }
        return z7;
    }
}