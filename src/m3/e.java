package m3;

import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends l3.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15167b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, int i10) {
        super(str, 1);
        this.f15167b = i10;
    }

    @Override // l3.a
    public final /* bridge */ /* synthetic */ void a(int i10, Object obj) {
        switch (this.f15167b) {
            case 0:
                d((f) obj, i10);
                break;
            case QueueFuseable.SYNC /* 1 */:
                d((f) obj, i10);
                break;
            case 2:
                d((f) obj, i10);
                break;
            case 3:
                d((f) obj, i10);
                break;
            case 4:
                d((f) obj, i10);
                break;
            default:
                d((f) obj, i10);
                break;
        }
    }

    public final Integer c(f fVar) {
        switch (this.f15167b) {
            case 0:
                return Integer.valueOf(fVar.R);
            case QueueFuseable.SYNC /* 1 */:
                return Integer.valueOf(fVar.f15178t);
            case 2:
                return Integer.valueOf(fVar.N);
            case 3:
                return Integer.valueOf(fVar.f15179u);
            case 4:
                return Integer.valueOf(fVar.f15180w);
            default:
                return Integer.valueOf(fVar.M);
        }
    }

    public final void d(f fVar, int i10) {
        switch (this.f15167b) {
            case 0:
                fVar.setAlpha(i10);
                break;
            case QueueFuseable.SYNC /* 1 */:
                fVar.f15178t = i10;
                break;
            case 2:
                fVar.N = i10;
                break;
            case 3:
                fVar.f15179u = i10;
                break;
            case 4:
                fVar.f15180w = i10;
                break;
            default:
                fVar.M = i10;
                break;
        }
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        switch (this.f15167b) {
        }
        return c((f) obj);
    }
}