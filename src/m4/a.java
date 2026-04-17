package m4;

import android.app.Activity;
import android.content.Context;
import c4.f;
import com.google.android.gms.internal.ads.ff;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.qr;
import com.google.android.gms.internal.ads.rj;
import fc.t;
import j4.q;
import l.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a {
    public static void a(Context context, String str, f fVar, b bVar) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null.");
        }
        if (str == null) {
            throw new NullPointerException("AdUnitId cannot be null.");
        }
        if (fVar == null) {
            throw new NullPointerException("AdRequest cannot be null.");
        }
        t.f("#008 Must be called on the main UI thread.");
        ge.a(context);
        if (((Boolean) ff.f4307i.k()).booleanValue()) {
            if (((Boolean) q.f13781d.f13784c.a(ge.K8)).booleanValue()) {
                qr.f7819b.execute(new g(context, str, fVar, bVar, 3, 0));
                return;
            }
        }
        new rj(context, str).d(fVar.f2103a, bVar);
    }

    public abstract void b(c4.t tVar);

    public abstract void c(Activity activity);
}