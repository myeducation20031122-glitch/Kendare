package t5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o3 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final w5 f17536a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17537b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17538c;

    public o3(w5 w5Var) {
        this.f17536a = w5Var;
    }

    public final void a() {
        w5 w5Var = this.f17536a;
        w5Var.e();
        w5Var.zzaz().o();
        w5Var.zzaz().o();
        if (this.f17537b) {
            w5Var.c().Q.a("Unregistering connectivity change receiver");
            this.f17537b = false;
            this.f17538c = false;
            try {
                w5Var.O.f17234b.unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                w5Var.c().f17397n.b(e10, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        w5 w5Var = this.f17536a;
        w5Var.e();
        String action = intent.getAction();
        w5Var.c().Q.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            w5Var.c().f17400w.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        n3 n3Var = w5Var.f17664e;
        w5.F(n3Var);
        boolean zD = n3Var.D();
        if (this.f17538c != zD) {
            this.f17538c = zD;
            w5Var.zzaz().x(new com.bumptech.glide.manager.q(this, zD, 5));
        }
    }
}