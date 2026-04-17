package com.onesignal;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12057b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q2 f12058e;

    public /* synthetic */ p2(q2 q2Var, int i10) {
        this.f12057b = i10;
        this.f12058e = q2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12057b) {
            case 0:
                z3.b(y3.f12233n, "Running complete from OSNotificationOpenedResult timeout runnable!", null);
                this.f12058e.a(false);
                return;
            default:
                ArrayList arrayList = z3.f12246a;
                throw null;
        }
    }
}