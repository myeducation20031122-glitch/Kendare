package z2;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements q2.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19521a;

    /* renamed from: b, reason: collision with root package name */
    public final p f19522b;

    public /* synthetic */ f(p pVar, int i10) {
        this.f19521a = i10;
        this.f19522b = pVar;
    }

    @Override // q2.p
    public final s2.e0 a(Object obj, int i10, int i11, q2.n nVar) {
        int i12 = this.f19521a;
        p pVar = this.f19522b;
        switch (i12) {
            case 0:
                return pVar.a(new g.e((ByteBuffer) obj, pVar.f19555d, pVar.f19554c, 17, 0), i10, i11, nVar, p.f19550k);
            default:
                return pVar.a(new g.e((ParcelFileDescriptor) obj, pVar.f19555d, pVar.f19554c), i10, i11, nVar, p.f19550k);
        }
    }

    @Override // q2.p
    public final boolean b(Object obj, q2.n nVar) {
        int i10 = this.f19521a;
        p pVar = this.f19522b;
        switch (i10) {
            case 0:
                pVar.getClass();
                break;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) {
                    pVar.getClass();
                    if (!"robolectric".equals(Build.FINGERPRINT)) {
                    }
                }
                break;
        }
        return true;
    }
}