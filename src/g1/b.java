package g1;

import androidx.lifecycle.y0;
import com.google.android.gms.internal.ads.ic1;
import t.l;
import v6.e;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f12989b = new e(1);

    /* renamed from: a, reason: collision with root package name */
    public final l f12990a = new l();

    @Override // androidx.lifecycle.y0
    public final void onCleared() {
        l lVar = this.f12990a;
        int i10 = lVar.f17009f;
        if (i10 > 0) {
            ic1.v(lVar.f17008e[0]);
            throw null;
        }
        Object[] objArr = lVar.f17008e;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        lVar.f17009f = 0;
    }
}