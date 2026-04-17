package l4;

import android.content.Context;
import com.google.android.gms.internal.ads.b6;
import com.google.android.gms.internal.ads.fp0;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.iy;
import com.google.android.gms.internal.ads.o5;
import com.google.android.gms.internal.ads.q5;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.ads.sr;
import com.google.android.gms.internal.ads.u5;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends fp0 {

    /* renamed from: n, reason: collision with root package name */
    public final Context f14625n;

    public m(Context context, z1.o oVar) {
        super(oVar);
        this.f14625n = context;
    }

    public static r5 p(Context context) {
        m mVar = new m(context, new z1.o());
        File file = new File(context.getCacheDir(), "admob_volley");
        b6 b6Var = new b6();
        b6Var.f2899c = new LinkedHashMap(16, 0.75f, true);
        b6Var.f2897a = 0L;
        b6Var.f2900d = new iy(2, file);
        b6Var.f2898b = 20971520;
        r5 r5Var = new r5(b6Var, mVar);
        r5Var.e();
        return r5Var;
    }

    @Override // com.google.android.gms.internal.ads.fp0, com.google.android.gms.internal.ads.l5
    public final o5 b(q5 q5Var) throws u5 {
        if (q5Var.f7642e == 0) {
            String str = (String) j4.q.f13781d.f13784c.a(ge.F3);
            String str2 = q5Var.f7643f;
            if (Pattern.matches(str, str2)) {
                sr srVar = j4.o.f13771f.f13772a;
                x4.g gVar = x4.g.f18964b;
                Context context = this.f14625n;
                if (gVar.d(context, 13400000) == 0) {
                    o5 o5VarB = new x4.k((Object) context).b(q5Var);
                    if (o5VarB != null) {
                        b0.k("Got gmscore asset response: ".concat(String.valueOf(str2)));
                        return o5VarB;
                    }
                    b0.k("Failed to get gmscore asset response: ".concat(String.valueOf(str2)));
                }
            }
        }
        return super.b(q5Var);
    }
}