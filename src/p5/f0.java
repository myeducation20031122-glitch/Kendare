package p5;

import android.os.Parcel;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class f0 extends l5.a implements g0 {
    public f0() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // l5.a
    public final boolean q2(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            d0 d0Var = (d0) f.a(parcel, d0.CREATOR);
            f.b(parcel);
            k kVar = (k) this;
            int i11 = kVar.f15957e;
            x5.l lVar = kVar.f15958f;
            switch (i11) {
                case 0:
                    com.bumptech.glide.d.D(d0Var.f15948b, kVar.f15959j, lVar);
                    break;
                case QueueFuseable.SYNC /* 1 */:
                    com.bumptech.glide.d.D(d0Var.f15948b, null, lVar);
                    break;
                default:
                    com.bumptech.glide.d.D(d0Var.f15948b, null, lVar);
                    break;
            }
        } else if (i10 == 2) {
            k kVar2 = (k) this;
            int i12 = kVar2.f15957e;
            Object obj = kVar2.f15959j;
            switch (i12) {
                case 0:
                    break;
                case QueueFuseable.SYNC /* 1 */:
                    ((r5.m) obj).b();
                    break;
                default:
                    ((r5.j) obj).a();
                    break;
            }
        } else {
            return false;
        }
        return true;
    }
}