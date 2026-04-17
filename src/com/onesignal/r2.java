package com.onesignal;

import android.text.TextUtils;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f12098a;

    /* renamed from: b, reason: collision with root package name */
    public final l3 f12099b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f12100c;

    /* renamed from: d, reason: collision with root package name */
    public final g2 f12101d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12102e = false;

    public r2(i2 i2Var, g2 g2Var) {
        this.f12101d = g2Var;
        this.f12098a = i2Var;
        l3 l3VarB = l3.b();
        this.f12099b = l3VarB;
        g0 g0Var = new g0(this, 2);
        this.f12100c = g0Var;
        l3VarB.c(g0Var, 25000L);
    }

    public final synchronized void a(g2 g2Var) {
        this.f12099b.a(this.f12100c);
        if (this.f12102e) {
            z3.b(y3.f12233n, "OSNotificationReceivedEvent already completed", null);
            return;
        }
        this.f12102e = true;
        if (OSUtils.p()) {
            new Thread(new o1(5, this, g2Var), "OS_COMPLETE_NOTIFICATION").start();
        } else {
            b(g2Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(g2 g2Var) throws JSONException, InterruptedException {
        boolean z7;
        g2 g2VarA = this.f12101d.a();
        g2 g2VarA2 = g2Var != null ? g2Var.a() : null;
        i2 i2Var = this.f12098a;
        if (g2VarA2 == null) {
            n2 n2Var = i2Var.f11891a;
            n2Var.b(g2VarA);
            if (i2Var.f11892b) {
                q3.G(n2Var);
                return;
            }
            n2Var.f12015e = false;
            q3.P(n2Var, true, false);
            z3.w(n2Var);
            return;
        }
        i2Var.getClass();
        boolean z10 = !TextUtils.isEmpty(g2VarA2.f11819h);
        z3.f12276v.getClass();
        boolean zB = h4.b(h4.f11856a, "OS_RESTORE_TTL_FILTER", true);
        n2 n2Var2 = i2Var.f11891a;
        if (zB) {
            z3.f12275u.getClass();
            if (n2Var2.f12011a.f11837z + r5.A <= System.currentTimeMillis() / 1000) {
                z7 = false;
            }
        } else {
            z7 = true;
        }
        if (z10 && z7) {
            n2Var2.b(g2VarA2);
            q3.O(i2Var, i2Var.f11893c);
        } else {
            n2Var2.b(g2VarA);
            if (i2Var.f11892b) {
                q3.G(n2Var2);
            } else {
                n2Var2.f12015e = false;
                q3.P(n2Var2, true, false);
                z3.w(n2Var2);
            }
        }
        if (i2Var.f11892b) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final String toString() {
        return "OSNotificationReceivedEvent{isComplete=" + this.f12102e + ", notification=" + this.f12101d + '}';
    }
}