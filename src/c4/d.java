package c4;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.fg;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.zk;
import j4.a3;
import j4.e0;
import j4.p2;
import j4.q2;
import j4.z2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2099a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f2100b;

    public d(Context context, String str) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        android.support.v4.media.b bVar = j4.o.f13771f.f13773b;
        zk zkVar = new zk();
        bVar.getClass();
        e0 e0Var = (e0) new j4.j(bVar, context, str, zkVar).d(context, false);
        this.f2099a = context;
        this.f2100b = e0Var;
    }

    public final e a() {
        Context context = this.f2099a;
        try {
            return new e(context, this.f2100b.zze());
        } catch (RemoteException e10) {
            wr.e("Failed to build AdLoader.", e10);
            return new e(context, new p2(new q2()));
        }
    }

    public final void b(b bVar) {
        try {
            this.f2100b.n0(new a3(bVar));
        } catch (RemoteException e10) {
            wr.h("Failed to set AdListener.", e10);
        }
    }

    public final void c(q4.d dVar) {
        try {
            e0 e0Var = this.f2100b;
            boolean z7 = dVar.f16241a;
            boolean z10 = dVar.f16243c;
            int i10 = dVar.f16244d;
            s2.l lVar = dVar.f16245e;
            e0Var.c2(new fg(4, z7, -1, z10, i10, lVar != null ? new z2(lVar) : null, dVar.f16246f, dVar.f16242b, dVar.f16248h, dVar.f16247g));
        } catch (RemoteException e10) {
            wr.h("Failed to specify native ad options", e10);
        }
    }
}