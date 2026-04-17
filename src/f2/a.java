package f2;

import android.content.Context;
import android.os.Build;
import g2.f;
import g2.g;
import g2.h;
import i2.j;
import io.reactivex.internal.fuseable.QueueFuseable;
import z1.p;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12660e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, l2.a aVar, int i10) {
        super((g2.a) h.i(context, aVar).f13011b);
        this.f12660e = i10;
        if (i10 == 1) {
            super((g2.b) h.i(context, aVar).f13012e);
            return;
        }
        if (i10 == 2) {
            super((f) h.i(context, aVar).f13013f);
            return;
        }
        if (i10 == 3) {
            super((f) h.i(context, aVar).f13013f);
        } else if (i10 != 4) {
        } else {
            super((g) h.i(context, aVar).f13014j);
        }
    }

    @Override // f2.c
    public final boolean a(j jVar) {
        switch (this.f12660e) {
            case 0:
                return jVar.f13267j.f19460b;
            case QueueFuseable.SYNC /* 1 */:
                return jVar.f13267j.f19462d;
            case 2:
                return jVar.f13267j.f19459a == p.f19483e;
            case 3:
                p pVar = jVar.f13267j.f19459a;
                if (pVar != p.f19484f) {
                    return Build.VERSION.SDK_INT >= 30 && pVar == p.f19487n;
                }
                return true;
            default:
                return jVar.f13267j.f19463e;
        }
    }

    @Override // f2.c
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        switch (this.f12660e) {
            case 0:
                return f((Boolean) obj);
            case QueueFuseable.SYNC /* 1 */:
                return f((Boolean) obj);
            case 2:
                return e((e2.a) obj);
            case 3:
                return e((e2.a) obj);
            default:
                return f((Boolean) obj);
        }
    }

    public final boolean e(e2.a aVar) {
        switch (this.f12660e) {
            case 2:
                return Build.VERSION.SDK_INT >= 26 ? (aVar.f12460a && aVar.f12461b) ? false : true : true ^ aVar.f12460a;
            default:
                return !aVar.f12460a || aVar.f12462c;
        }
    }

    public final boolean f(Boolean bool) {
        switch (this.f12660e) {
        }
        return !bool.booleanValue();
    }
}