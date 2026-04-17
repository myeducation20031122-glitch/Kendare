package c4;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ff;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.qr;
import com.google.android.gms.internal.ads.wr;
import j4.b0;
import j4.c2;
import j4.e3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2101a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f2102b;

    public e(Context context, b0 b0Var) {
        this.f2101a = context;
        this.f2102b = b0Var;
    }

    public final void a(f fVar) {
        c2 c2Var = fVar.f2103a;
        Context context = this.f2101a;
        ge.a(context);
        if (((Boolean) ff.f4301c.k()).booleanValue()) {
            if (((Boolean) j4.q.f13781d.f13784c.a(ge.K8)).booleanValue()) {
                qr.f7819b.execute(new m.k(this, c2Var, 24));
                return;
            }
        }
        try {
            this.f2102b.a3(e3.a(context, c2Var));
        } catch (RemoteException e10) {
            wr.e("Failed to load ad.", e10);
        }
    }
}