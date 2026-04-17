package t5;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.l9;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class n5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17520b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17521e;

    public /* synthetic */ n5(Object obj, int i10) {
        this.f17520b = i10;
        this.f17521e = obj;
    }

    private final void a() {
        w5.a aVar = (w5.a) this.f17521e;
        synchronized (aVar.f18685a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.f18694j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.d();
                    if (aVar.b()) {
                        aVar.f18687c = 1;
                        aVar.e();
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        switch (this.f17520b) {
            case 0:
                o5 o5Var = (o5) this.f17521e;
                l9 l9Var = o5Var.f17543f;
                long j10 = o5Var.f17541b;
                ((q5) l9Var.f10882f).o();
                i3 i3Var = ((b4) ((q5) l9Var.f10882f).f15046b).f17251w;
                b4.i(i3Var);
                i3Var.P.a("Application going to the background");
                q3 q3Var = ((b4) ((q5) l9Var.f10882f).f15046b).f17250u;
                b4.g(q3Var);
                q3Var.S.a(true);
                Bundle bundle = new Bundle();
                if (!((b4) ((q5) l9Var.f10882f).f15046b).f17249t.z()) {
                    com.google.android.gms.internal.ads.l2 l2Var = ((q5) l9Var.f10882f).f17583m;
                    long j11 = o5Var.f17542e;
                    ((l) l2Var.f6223f).a();
                    ((q5) l9Var.f10882f).f17583m.d(j11, false, false);
                }
                v4 v4Var = ((b4) ((q5) l9Var.f10882f).f15046b).S;
                b4.h(v4Var);
                v4Var.x(j10, bundle, "auto", "_ab");
                return;
            case QueueFuseable.SYNC /* 1 */:
                a();
                return;
            case 2:
                synchronized (((x5.q) this.f17521e).f19029f) {
                    try {
                        Object obj = ((x5.q) this.f17521e).f19030j;
                        if (((x5.d) obj) != null) {
                            ((x5.d) obj).onCanceled();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 3:
                m2.c cVar = (m2.c) this.f17521e;
                cVar.f15084b = false;
                x0.e eVar = ((BottomSheetBehavior) cVar.f15087e).M;
                if (eVar != null && eVar.f()) {
                    cVar.c(cVar.f15085c);
                    return;
                }
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar.f15087e;
                if (bottomSheetBehavior.L == 2) {
                    bottomSheetBehavior.D(cVar.f15085c);
                    return;
                }
                return;
            case 4:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f17521e).f11550f.f19338t;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            default:
                ((ThreadLocal) ((g2.h) this.f17521e).f13014j).set(Boolean.TRUE);
                return;
        }
    }
}