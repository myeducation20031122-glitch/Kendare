package l4;

import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.o5;
import com.google.android.gms.internal.ads.q5;
import com.google.android.gms.internal.ads.t5;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.vr;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r extends q5 {
    public final Object P;
    public final s Q;
    public final /* synthetic */ byte[] R;
    public final /* synthetic */ Map S;
    public final /* synthetic */ vr T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i10, String str, s sVar, d3.d dVar, byte[] bArr, HashMap map, vr vrVar) {
        super(i10, str, dVar);
        this.R = bArr;
        this.S = map;
        this.T = vrVar;
        this.P = new Object();
        this.Q = sVar;
    }

    @Override // com.google.android.gms.internal.ads.q5
    public final t5 c(o5 o5Var) {
        String str;
        String str2;
        byte[] bArr = o5Var.f7007b;
        try {
            Map map = o5Var.f7008c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i10 = 1;
                while (true) {
                    if (i10 >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i10].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i10++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new t5(str, dq0.D0(o5Var));
    }

    @Override // com.google.android.gms.internal.ads.q5
    public final Map g() {
        Map map = this.S;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.q5
    public final void k(Object obj) throws IOException {
        s sVar;
        String str = (String) obj;
        vr vrVar = this.T;
        vrVar.getClass();
        if (vr.c() && str != null) {
            vrVar.d("onNetworkResponseBody", new tr(str.getBytes()));
        }
        synchronized (this.P) {
            sVar = this.Q;
        }
        sVar.a(str);
    }

    @Override // com.google.android.gms.internal.ads.q5
    public final byte[] s() {
        byte[] bArr = this.R;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}