package j4;

import com.google.android.gms.internal.ads.ac0;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.ads.ij;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h2 extends ij {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13722b = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13723e;

    public h2(ac0 ac0Var) {
        this.f13723e = ac0Var;
    }

    @Override // com.google.android.gms.internal.ads.jj
    public final void v1(List list) {
        ArrayList arrayList;
        switch (this.f13722b) {
            case 0:
                synchronized (((i2) this.f13723e).f13738a) {
                    Object obj = this.f13723e;
                    ((i2) obj).f13739b = false;
                    ((i2) obj).f13740c = true;
                    arrayList = new ArrayList((ArrayList) ((i2) this.f13723e).f13742e);
                    ((ArrayList) ((i2) this.f13723e).f13742e).clear();
                }
                i2.g(list);
                if (arrayList.size() <= 0) {
                    return;
                }
                ic1.v(arrayList.get(0));
                throw null;
            default:
                ((ac0) this.f13723e).b(list);
                return;
        }
    }
}