package k5;

import a5.x;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import t5.j4;
import x5.s;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h extends y4.i implements u4.a {

    /* renamed from: k, reason: collision with root package name */
    public static final y4.e f14019k = new y4.e("AppSet.API", new c5.b(1), new y4.d());

    /* renamed from: i, reason: collision with root package name */
    public final Context f14020i;

    /* renamed from: j, reason: collision with root package name */
    public final x4.g f14021j;

    public h(Context context, x4.g gVar) {
        super(context, f14019k, y4.b.f19234a, y4.h.f19239c);
        this.f14020i = context;
        this.f14021j = gVar;
    }

    @Override // u4.a
    public final s a() {
        if (this.f14021j.d(this.f14020i, 212800000) != 0) {
            return j4.h(new y4.f(new Status(17, null, null, null)));
        }
        m2.c cVar = new m2.c(0);
        cVar.f15087e = new x4.d[]{u4.e.f18278a};
        cVar.f15086d = new x(this, 1);
        cVar.f15084b = false;
        cVar.f15085c = 27601;
        return c(0, cVar.b());
    }
}