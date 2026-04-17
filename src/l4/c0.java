package l4;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.ads.bu0;
import com.google.android.gms.internal.ads.qf;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c0 extends bu0 {
    @Override // com.google.android.gms.internal.ads.bu0
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            g0 g0Var = i4.k.A.f13348c;
            Context context = i4.k.A.f13352g.f6651e;
            if (context != null) {
                try {
                    if (((Boolean) qf.f7723b.k()).booleanValue()) {
                        e5.c.a(context, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e10) {
            i4.k.A.f13352g.h("AdMobHandler.handleMessage", e10);
        }
    }
}