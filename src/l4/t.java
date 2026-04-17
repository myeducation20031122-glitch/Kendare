package l4;

import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.gs;
import com.google.android.gms.internal.ads.o5;
import com.google.android.gms.internal.ads.oq;
import com.google.android.gms.internal.ads.q5;
import com.google.android.gms.internal.ads.t5;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.un0;
import com.google.android.gms.internal.ads.vr;
import com.google.android.gms.internal.ads.yl0;
import java.io.IOException;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t extends q5 {
    public final gs P;
    public final vr Q;

    public t(String str, gs gsVar) throws IOException {
        super(0, str, new p8.c(gsVar, 23));
        this.P = gsVar;
        vr vrVar = new vr();
        this.Q = vrVar;
        if (vr.c()) {
            Object obj = null;
            vrVar.d("onNetworkRequest", new un0(str, "GET", obj, obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.q5
    public final t5 c(o5 o5Var) {
        return new t5(o5Var, dq0.D0(o5Var));
    }

    @Override // com.google.android.gms.internal.ads.q5
    public final void k(Object obj) throws IOException {
        byte[] bArr;
        o5 o5Var = (o5) obj;
        Map map = o5Var.f7008c;
        vr vrVar = this.Q;
        vrVar.getClass();
        if (vr.c()) {
            int i10 = o5Var.f7006a;
            vrVar.d("onNetworkResponse", new yl0(i10, map, 10));
            if (i10 < 200 || i10 >= 300) {
                vrVar.d("onNetworkRequestError", new oq(null));
            }
        }
        if (vr.c() && (bArr = o5Var.f7007b) != null) {
            vrVar.d("onNetworkResponseBody", new tr(bArr));
        }
        this.P.a(o5Var);
    }
}