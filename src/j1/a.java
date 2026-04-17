package j1;

import android.util.Log;
import com.isprid.kendare.ui.premium.PremiumActivity;
import io.reactivex.internal.fuseable.QueueFuseable;
import t7.z0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13528b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13530f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f13531j;

    public /* synthetic */ a(Object obj, int i10, Object obj2, int i11) {
        this.f13528b = i11;
        this.f13531j = obj;
        this.f13529e = i10;
        this.f13530f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String message;
        int i10 = this.f13528b;
        Object obj = this.f13530f;
        int i11 = this.f13529e;
        Object obj2 = this.f13531j;
        switch (i10) {
            case 0:
                ((b) obj2).f13533b.u(i11, obj);
                break;
            case QueueFuseable.SYNC /* 1 */:
                ((d) obj2).u(i11, obj);
                break;
            default:
                Throwable th = (Throwable) obj;
                PremiumActivity premiumActivity = (PremiumActivity) ((t9.g) obj2).f18074m;
                premiumActivity.getClass();
                if (th != null) {
                    try {
                        message = th.getMessage();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else {
                    message = null;
                }
                Log.e("PremiumActivity", "onBillingError: " + i11 + " | " + message);
                premiumActivity.i();
                z0.k(premiumActivity, i11 != 1 ? i11 != 7 ? "Something went wrong with your purchase." : "You have already purchased this product" : "Payment cancel by the user");
                premiumActivity.l();
                break;
        }
    }
}