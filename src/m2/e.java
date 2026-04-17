package m2;

import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15096a;

    /* renamed from: b, reason: collision with root package name */
    public int f15097b;

    /* renamed from: c, reason: collision with root package name */
    public String f15098c;

    public e() {
        this.f15096a = 1;
    }

    public static e b() {
        return new e(0);
    }

    public final e a() {
        e eVar = new e();
        eVar.f15097b = this.f15097b;
        eVar.f15098c = this.f15098c;
        return eVar;
    }

    public final String toString() {
        switch (this.f15096a) {
            case QueueFuseable.SYNC /* 1 */:
                int i10 = this.f15097b;
                int i11 = com.google.android.gms.internal.play_billing.r.f11220a;
                com.google.android.gms.internal.play_billing.o oVar = com.google.android.gms.internal.play_billing.a.f11118f;
                Integer numValueOf = Integer.valueOf(i10);
                return "Response Code: " + (!oVar.containsKey(numValueOf) ? com.google.android.gms.internal.play_billing.a.RESPONSE_CODE_UNSPECIFIED : (com.google.android.gms.internal.play_billing.a) oVar.get(numValueOf)).toString() + ", Debug Message: " + this.f15098c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(int i10) {
        this.f15096a = 0;
        this.f15098c = "";
    }

    public /* synthetic */ e(int i10, int i11, String str) {
        this.f15096a = i11;
        this.f15097b = i10;
        this.f15098c = str;
    }
}