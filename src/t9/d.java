package t9;

import android.os.Handler;
import com.google.android.gms.internal.measurement.l9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18068b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f18069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f18070f;

    public /* synthetic */ d(g gVar, l9 l9Var, int i10) {
        this.f18068b = i10;
        this.f18070f = gVar;
        this.f18069e = l9Var;
    }

    @Override // t9.f
    public final void c() {
        int i10 = this.f18068b;
        f fVar = this.f18069e;
        g gVar = this.f18070f;
        switch (i10) {
            case 0:
                if (fVar == null) {
                    gVar.getClass();
                    break;
                } else {
                    Handler handler = gVar.M;
                    if (handler != null) {
                        handler.post(new c(fVar, 1));
                        break;
                    }
                }
                break;
            default:
                gVar.z(fVar);
                break;
        }
    }

    @Override // t9.f
    public final void d() {
        int i10 = this.f18068b;
        f fVar = this.f18069e;
        g gVar = this.f18070f;
        switch (i10) {
            case 0:
                gVar.z(fVar);
                break;
            default:
                gVar.z(fVar);
                break;
        }
    }
}