package com.onesignal;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final l3 f12068a;

    /* renamed from: b, reason: collision with root package name */
    public final p2 f12069b;

    /* renamed from: c, reason: collision with root package name */
    public final g2 f12070c;

    /* renamed from: d, reason: collision with root package name */
    public final b5 f12071d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12072e = false;

    public q2(g2 g2Var, b5 b5Var) {
        this.f12070c = g2Var;
        this.f12071d = b5Var;
        l3 l3VarB = l3.b();
        this.f12068a = l3VarB;
        p2 p2Var = new p2(this, 0);
        this.f12069b = p2Var;
        l3VarB.c(p2Var, 5000L);
    }

    public final void a(boolean z7) {
        y3 y3Var = y3.f12233n;
        z3.b(y3Var, "OSNotificationOpenedResult complete called with opened: " + z7, null);
        this.f12068a.a(this.f12069b);
        if (this.f12072e) {
            z3.b(y3Var, "OSNotificationOpenedResult already completed", null);
            return;
        }
        this.f12072e = true;
        if (z7) {
            z3.e(this.f12070c.f11815d);
        }
        z3.f12246a.remove(this);
    }

    public final String toString() {
        return "OSNotificationOpenedResult{notification=" + this.f12070c + ", action=" + this.f12071d + ", isComplete=" + this.f12072e + '}';
    }
}