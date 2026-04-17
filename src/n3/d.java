package n3;

import android.os.Build;
import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends m3.a {

    /* renamed from: g0, reason: collision with root package name */
    public final /* synthetic */ int f15351g0;

    public d(int i10) {
        this.f15351g0 = i10;
    }

    @Override // m3.g
    public final m3.f[] l() {
        switch (this.f15351g0) {
            case 0:
                b[] bVarArr = new b[12];
                for (int i10 = 0; i10 < 12; i10++) {
                    b bVar = new b(0);
                    bVarArr[i10] = bVar;
                    bVar.f15177n = Build.VERSION.SDK_INT >= 24 ? i10 * 100 : (i10 * 100) - 1200;
                }
                return bVarArr;
            default:
                b[] bVarArr2 = new b[12];
                for (int i11 = 0; i11 < 12; i11++) {
                    b bVar2 = new b((r) null);
                    bVarArr2[i11] = bVar2;
                    bVar2.f15177n = Build.VERSION.SDK_INT >= 24 ? i11 * 100 : (i11 * 100) - 1200;
                }
                return bVarArr2;
        }
    }
}