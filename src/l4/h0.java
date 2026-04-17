package l4;

import android.os.Process;
import android.webkit.CookieManager;
import com.google.android.gms.internal.ads.dv;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.xu;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class h0 extends w2.k {
    public h0() {
        super(18, 0);
    }

    public final CookieManager t() {
        g0 g0Var = i4.k.A.f13348c;
        int iMyUid = Process.myUid();
        if (iMyUid == 0 || iMyUid == 1000) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            wr.e("Failed to obtain CookieManager.", th);
            i4.k.A.f13352g.h("ApiLevelUtil.getCookieManager", th);
            return null;
        }
    }

    public final dv u(xu xuVar, qb qbVar, boolean z7) {
        return new dv(xuVar, qbVar, z7, 1);
    }
}