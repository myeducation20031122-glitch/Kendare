package l7;

import android.os.Bundle;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.measurement.l9;
import java.util.HashSet;
import java.util.Set;
import n8.s;
import o5.d;
import t5.j4;
import t5.k4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements k4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14662b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f14661a = i10;
        this.f14662b = obj;
    }

    @Override // t5.k4
    public final void a(long j10, Bundle bundle, String str, String str2) {
        int i10 = this.f14661a;
        Object obj = this.f14662b;
        switch (i10) {
            case 0:
                s sVar = (s) obj;
                if (((Set) sVar.f15435b).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    HashSet hashSet = b.f14655a;
                    String strK0 = dq0.K0(str2, j4.f17446c, j4.f17444a);
                    if (strK0 != null) {
                        str2 = strK0;
                    }
                    bundle2.putString("events", str2);
                    ((l9) sVar.f15436e).n(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !str.equals("crash") && (!b.f14655a.contains(str2))) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j10);
                    bundle3.putBundle("params", bundle);
                    ((l9) ((d) obj).f15721e).n(3, bundle3);
                    break;
                }
                break;
        }
    }
}