package q8;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f16319b;

    public /* synthetic */ l(a0 a0Var, int i10) {
        this.f16318a = i10;
        this.f16319b = a0Var;
    }

    @Override // q8.a0
    public final Object b(y8.a aVar) {
        int i10 = this.f16318a;
        a0 a0Var = this.f16319b;
        switch (i10) {
            case 0:
                return new AtomicLong(((Number) a0Var.b(aVar)).longValue());
            case QueueFuseable.SYNC /* 1 */:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.j()) {
                    arrayList.add(Long.valueOf(((Number) a0Var.b(aVar)).longValue()));
                }
                aVar.e();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i11 = 0; i11 < size; i11++) {
                    atomicLongArray.set(i11, ((Long) arrayList.get(i11)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.w() != 9) {
                    return a0Var.b(aVar);
                }
                aVar.s();
                return null;
        }
    }

    @Override // q8.a0
    public final void c(y8.b bVar, Object obj) {
        int i10 = this.f16318a;
        a0 a0Var = this.f16319b;
        switch (i10) {
            case 0:
                a0Var.c(bVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case QueueFuseable.SYNC /* 1 */:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.b();
                int length = atomicLongArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    a0Var.c(bVar, Long.valueOf(atomicLongArray.get(i11)));
                }
                bVar.e();
                break;
            default:
                if (obj == null) {
                    bVar.j();
                    break;
                } else {
                    a0Var.c(bVar, obj);
                    break;
                }
        }
    }
}