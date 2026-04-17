package m3;

import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends l3.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15166b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, int i10) {
        super(str, 0);
        this.f15166b = i10;
    }

    @Override // l3.a
    public final /* bridge */ /* synthetic */ void b(Object obj, float f10) {
        switch (this.f15166b) {
            case 0:
                d((f) obj, f10);
                break;
            case QueueFuseable.SYNC /* 1 */:
                d((f) obj, f10);
                break;
            case 2:
                d((f) obj, f10);
                break;
            case 3:
                d((f) obj, f10);
                break;
            default:
                d((f) obj, f10);
                break;
        }
    }

    public final Float c(f fVar) {
        switch (this.f15166b) {
            case 0:
                return Float.valueOf(fVar.f15172b);
            case QueueFuseable.SYNC /* 1 */:
                return Float.valueOf(fVar.O);
            case 2:
                return Float.valueOf(fVar.P);
            case 3:
                return Float.valueOf(fVar.f15173e);
            default:
                return Float.valueOf(fVar.f15174f);
        }
    }

    public final void d(f fVar, float f10) {
        switch (this.f15166b) {
            case 0:
                fVar.g(f10);
                break;
            case QueueFuseable.SYNC /* 1 */:
                fVar.O = f10;
                break;
            case 2:
                fVar.P = f10;
                break;
            case 3:
                fVar.f15173e = f10;
                break;
            default:
                fVar.f15174f = f10;
                break;
        }
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        switch (this.f15166b) {
        }
        return c((f) obj);
    }
}