package com.onesignal;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b2 extends q3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11729h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Set f11730i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d2 f11731j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e2 f11732k;

    public /* synthetic */ b2(e2 e2Var, Set set, d2 d2Var, int i10) {
        this.f11729h = i10;
        this.f11732k = e2Var;
        this.f11730i = set;
        this.f11731j = d2Var;
    }

    @Override // com.onesignal.q3
    public final void J(int i10, String str, Throwable th) {
        int i11 = this.f11729h;
        d2 d2Var = this.f11731j;
        e2 e2Var = this.f11732k;
        switch (i11) {
            case 0:
                e2.b(e2Var, "engagement", i10, str);
                d2Var.c(str);
                break;
            case QueueFuseable.SYNC /* 1 */:
                e2.b(e2Var, "page impression", i10, str);
                d2Var.c(str);
                break;
            default:
                e2.b(e2Var, "impression", i10, str);
                d2Var.c(str);
                break;
        }
    }

    @Override // com.onesignal.q3
    public final void K(String str) {
        int i10 = this.f11729h;
        Set set = this.f11730i;
        e2 e2Var = this.f11732k;
        switch (i10) {
            case 0:
                e2.a(e2Var, "engagement", str);
                String str2 = h4.f11856a;
                e2Var.f11779c.getClass();
                h4.g(set, str2, "PREFS_OS_CLICKED_CLICK_IDS_IAMS");
                break;
            case QueueFuseable.SYNC /* 1 */:
                e2.a(e2Var, "page impression", str);
                String str3 = h4.f11856a;
                e2Var.f11779c.getClass();
                h4.g(set, str3, "PREFS_OS_PAGE_IMPRESSIONED_IAMS");
                break;
            default:
                e2.a(e2Var, "impression", str);
                String str4 = h4.f11856a;
                e2Var.f11779c.getClass();
                h4.g(set, str4, "PREFS_OS_IMPRESSIONED_IAMS");
                break;
        }
    }
}