package z2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d0 implements q2.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19518a;

    public /* synthetic */ d0(int i10) {
        this.f19518a = i10;
    }

    @Override // q2.p
    public final s2.e0 a(Object obj, int i10, int i11, q2.n nVar) {
        int i12 = 0;
        switch (this.f19518a) {
            case 0:
                return new c0((Bitmap) obj, i12);
            case QueueFuseable.SYNC /* 1 */:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new a3.d(drawable, 0);
                }
                return null;
            default:
                return new c0((File) obj);
        }
    }

    @Override // q2.p
    public final /* bridge */ /* synthetic */ boolean b(Object obj, q2.n nVar) {
        switch (this.f19518a) {
            case 0:
                break;
            case QueueFuseable.SYNC /* 1 */:
                break;
            default:
                break;
        }
        return true;
    }
}