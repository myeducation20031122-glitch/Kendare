package m;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m3 implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14850a;

    public /* synthetic */ m3(int i10) {
        this.f14850a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14850a) {
            case 0:
                return new n3(parcel, null);
            case QueueFuseable.SYNC /* 1 */:
                return new c0.g(parcel, null);
            case 2:
                if (parcel.readParcelable(null) == null) {
                    return w0.b.f18519e;
                }
                throw new IllegalStateException("superState must be null");
            case 3:
                return new androidx.fragment.app.a0(parcel, null);
            case 4:
                return new androidx.recyclerview.widget.v1(parcel, null);
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return new w1.g(parcel, null);
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                if (Build.VERSION.SDK_INT >= 24) {
                    return new y1.o(parcel, null);
                }
                y1.o oVar = new y1.o(parcel);
                oVar.f19220b = parcel.readInt();
                oVar.f19221e = parcel.readInt();
                oVar.f19222f = parcel.readParcelable(null);
                return oVar;
            case y4.g.NETWORK_ERROR /* 7 */:
                return new f6.c(parcel, (ClassLoader) null);
            case 8:
                return new g6.b(parcel, null);
            case 9:
                return new p6.a(parcel, null);
            case y4.g.DEVELOPER_ERROR /* 10 */:
                return new p6.f(parcel, null);
            case 11:
                return new q6.k(parcel, null);
            case 12:
                return new w6.d(parcel, (ClassLoader) null);
            default:
                return new y6.a0(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f14850a) {
            case 0:
                return new n3[i10];
            case QueueFuseable.SYNC /* 1 */:
                return new c0.g[i10];
            case 2:
                return new w0.b[i10];
            case 3:
                return new androidx.fragment.app.a0[i10];
            case 4:
                return new androidx.recyclerview.widget.v1[i10];
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return new w1.g[i10];
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                return new y1.o[i10];
            case y4.g.NETWORK_ERROR /* 7 */:
                return new f6.c[i10];
            case 8:
                return new g6.b[i10];
            case 9:
                return new p6.a[i10];
            case y4.g.DEVELOPER_ERROR /* 10 */:
                return new p6.f[i10];
            case 11:
                return new q6.k[i10];
            case 12:
                return new w6.d[i10];
            default:
                return new y6.a0[i10];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f14850a) {
            case 0:
                return new n3(parcel, classLoader);
            case QueueFuseable.SYNC /* 1 */:
                return new c0.g(parcel, classLoader);
            case 2:
                if (parcel.readParcelable(classLoader) == null) {
                    return w0.b.f18519e;
                }
                throw new IllegalStateException("superState must be null");
            case 3:
                return new androidx.fragment.app.a0(parcel, classLoader);
            case 4:
                return new androidx.recyclerview.widget.v1(parcel, classLoader);
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return new w1.g(parcel, classLoader);
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                if (Build.VERSION.SDK_INT >= 24) {
                    return new y1.o(parcel, classLoader);
                }
                y1.o oVar = new y1.o(parcel);
                oVar.f19220b = parcel.readInt();
                oVar.f19221e = parcel.readInt();
                oVar.f19222f = parcel.readParcelable(null);
                return oVar;
            case y4.g.NETWORK_ERROR /* 7 */:
                return new f6.c(parcel, classLoader);
            case 8:
                return new g6.b(parcel, classLoader);
            case 9:
                return new p6.a(parcel, classLoader);
            case y4.g.DEVELOPER_ERROR /* 10 */:
                return new p6.f(parcel, classLoader);
            case 11:
                return new q6.k(parcel, classLoader);
            case 12:
                return new w6.d(parcel, classLoader);
            default:
                return new y6.a0(parcel, classLoader);
        }
    }
}