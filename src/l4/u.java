package l4;

import android.content.Context;
import com.google.android.gms.internal.ads.e5;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.ads.un0;
import com.google.android.gms.internal.ads.vr;
import com.google.android.gms.internal.ads.wr;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static r5 f14635a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f14636b = new Object();

    public u(Context context) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f14636b) {
            try {
                if (f14635a == null) {
                    ge.a(context);
                    f14635a = ((Boolean) j4.q.f13781d.f13784c.a(ge.E3)).booleanValue() ? m.p(context) : com.bumptech.glide.d.K(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static s a(int i10, String str, HashMap map, byte[] bArr) {
        s sVar = new s();
        d3.d dVar = new d3.d(str, sVar, 9);
        vr vrVar = new vr();
        r rVar = new r(i10, str, sVar, dVar, bArr, map, vrVar);
        if (vr.c()) {
            try {
                Map mapG = rVar.g();
                if (bArr == null) {
                    bArr = null;
                }
                if (vr.c()) {
                    vrVar.d("onNetworkRequest", new un0(str, "GET", mapG, bArr));
                }
            } catch (e5 e10) {
                wr.g(e10.getMessage());
            }
        }
        f14635a.b(rVar);
        return sVar;
    }
}