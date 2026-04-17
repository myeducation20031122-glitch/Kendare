package com.onesignal;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y2 extends q3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12225h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f12226i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f12227j;

    public /* synthetic */ y2(int i10, Object obj, Object obj2) {
        this.f12225h = i10;
        this.f12227j = obj;
        this.f12226i = obj2;
    }

    @Override // com.onesignal.q3
    public final void J(int i10, String str, Throwable th) {
        switch (this.f12225h) {
            case 0:
                z3.b(y3.f12230f, "Receive receipt failed with statusCode: " + i10 + " response: " + str, null);
                break;
            case QueueFuseable.SYNC /* 1 */:
                ((b4) this.f12226i).b(i10, str);
                break;
        }
    }

    @Override // com.onesignal.q3
    public final void K(String str) {
        int i10 = this.f12225h;
        Object obj = this.f12226i;
        switch (i10) {
            case 0:
                z3.b(y3.f12233n, "Receive receipt sent for notificationID: " + ((String) obj), null);
                break;
            case QueueFuseable.SYNC /* 1 */:
                ((b4) obj).a(str);
                break;
            default:
                d5 d5Var = (d5) this.f12227j;
                d5Var.f11763f.addAll((ArrayList) obj);
                h4.g(d5Var.f11763f.toString(), "GTPlayerPurchases", "purchaseTokens");
                h4.h("GTPlayerPurchases", "ExistingPurchases", true);
                d5Var.f11764g = false;
                d5Var.f11765h = false;
                break;
        }
    }
}