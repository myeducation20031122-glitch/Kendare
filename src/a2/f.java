package a2;

import android.content.Context;
import android.text.TextUtils;
import io.reactivex.internal.fuseable.QueueFuseable;
import m.c0;
import w2.a0;
import w2.r;
import w2.u;
import w2.v;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements p1.c, v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f242b;

    /* renamed from: e, reason: collision with root package name */
    public final Context f243e;

    public /* synthetic */ f(Context context, int i10) {
        this.f242b = i10;
        this.f243e = context;
    }

    @Override // p1.c
    public final p1.d f(p1.b bVar) {
        String str = bVar.f15867b;
        c0 c0Var = bVar.f15868c;
        v6.e eVar = new v6.e(18, (Object) null);
        if (c0Var == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        Context context = this.f243e;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        p1.b bVar2 = new p1.b();
        bVar2.f15866a = context;
        bVar2.f15867b = str;
        bVar2.f15868c = c0Var;
        bVar2.f15869d = true;
        return eVar.f(bVar2);
    }

    @Override // w2.v
    public final u v(a0 a0Var) {
        int i10 = this.f242b;
        Context context = this.f243e;
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                return new r(context, 0);
            default:
                return new r(context, 1);
        }
    }
}