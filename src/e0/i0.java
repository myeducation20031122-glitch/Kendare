package e0;

import android.app.Notification;
import android.os.Parcel;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12385a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12386b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12387c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Notification f12388d;

    public i0(String str, int i10, Notification notification) {
        this.f12385a = str;
        this.f12386b = i10;
        this.f12388d = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f12385a;
        int i10 = this.f12386b;
        String str2 = this.f12387c;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(b.c.f1824a);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i10);
            parcelObtain.writeString(str2);
            Notification notification = this.f12388d;
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            aVar.f1822b.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f12385a);
        sb.append(", id:");
        sb.append(this.f12386b);
        sb.append(", tag:");
        return kc.r.g(sb, this.f12387c, "]");
    }
}