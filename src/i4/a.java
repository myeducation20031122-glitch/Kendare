package i4;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.cq;
import com.google.android.gms.internal.ads.eq;
import java.util.Collections;
import java.util.List;
import l4.g0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13308a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13309b;

    /* renamed from: c, reason: collision with root package name */
    public final eq f13310c;

    /* renamed from: d, reason: collision with root package name */
    public final co f13311d = new co(Collections.emptyList(), false);

    public a(Context context, eq eqVar) {
        this.f13308a = context;
        this.f13310c = eqVar;
    }

    public final void a(String str) {
        List<String> list;
        co coVar = this.f13311d;
        eq eqVar = this.f13310c;
        if ((eqVar == null || !((cq) eqVar).f3429g.f3744n) && !coVar.f3405b) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (eqVar != null) {
            ((cq) eqVar).a(str, null, 3);
            return;
        }
        if (!coVar.f3405b || (list = coVar.f3406e) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                g0 g0Var = k.A.f13348c;
                g0.f(this.f13308a, "", strReplace);
            }
        }
    }

    public final boolean b() {
        eq eqVar = this.f13310c;
        return ((eqVar == null || !((cq) eqVar).f3429g.f3744n) && !this.f13311d.f3405b) || this.f13309b;
    }
}