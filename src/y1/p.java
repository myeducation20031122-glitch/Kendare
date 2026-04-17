package y1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.internal.ads.jt;
import com.google.android.gms.internal.ads.os;
import com.google.android.gms.internal.ads.ps;
import com.google.android.gms.internal.ads.t8;
import com.google.android.gms.internal.ads.ts;
import com.google.android.gms.internal.ads.xf1;
import com.google.android.gms.internal.ads.zf1;
import com.onesignal.y3;
import com.onesignal.z3;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.concurrent.Future;
import kc.r;
import z4.i0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19223b;

    /* renamed from: e, reason: collision with root package name */
    public final int f19224e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f19225f;

    public p(t8 t8Var, int i10) {
        this.f19223b = 3;
        this.f19225f = t8Var;
        this.f19224e = i10;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        int i10;
        String str;
        f7 f7VarG = null;
        switch (this.f19223b) {
            case 0:
                ((RecyclerView) this.f19225f).k0(this.f19224e);
                break;
            case QueueFuseable.SYNC /* 1 */:
                ((SystemForegroundService) this.f19225f).f1815m.cancel(this.f19224e);
                break;
            case 2:
                ((i0) this.f19225f).f(this.f19224e);
                break;
            case 3:
                t8 t8Var = (t8) this.f19225f;
                if (this.f19224e > 0) {
                    try {
                        Thread.sleep(r4 * com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS);
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    PackageInfo packageInfo = t8Var.f8666a.getPackageManager().getPackageInfo(t8Var.f8666a.getPackageName(), 0);
                    Context context = t8Var.f8666a;
                    f7VarG = e5.c.g(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
                } catch (Throwable unused2) {
                }
                ((t8) this.f19225f).f8675j = f7VarG;
                if (this.f19224e < 4) {
                    if (f7VarG == null || !f7VarG.f0() || f7VarG.t0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !f7VarG.g0() || !f7VarG.r0().y() || f7VarG.r0().v() == -2) {
                        t8 t8Var2 = (t8) this.f19225f;
                        int i11 = this.f19224e + 1;
                        if (t8Var2.f8679n) {
                            Future<?> futureSubmit = t8Var2.f8667b.submit(new p(t8Var2, i11));
                            if (i11 == 0) {
                                t8Var2.f8676k = futureSubmit;
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                ps psVar = ((os) this.f19225f).S;
                if (psVar != null) {
                    ((ts) psVar).onWindowVisibilityChanged(this.f19224e);
                    break;
                }
                break;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                ps psVar2 = ((jt) this.f19225f).f5776n;
                if (psVar2 != null) {
                    ((ts) psVar2).onWindowVisibilityChanged(this.f19224e);
                    break;
                }
                break;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                zf1 zf1Var = ((xf1) this.f19225f).f9751b;
                int i12 = this.f19224e;
                if (i12 != -3 && i12 != -2) {
                    if (i12 == -1) {
                        zf1Var.b(-1);
                        zf1Var.a();
                        break;
                    } else if (i12 == 1) {
                        zf1Var.c(1);
                        zf1Var.b(1);
                        break;
                    } else {
                        r.l("Unknown focus change type: ", i12, "AudioFocusManager");
                        break;
                    }
                } else {
                    if (i12 != -2) {
                        i10 = 3;
                    } else {
                        zf1Var.b(0);
                        i10 = 2;
                    }
                    zf1Var.c(i10);
                    break;
                }
            case y4.g.NETWORK_ERROR /* 7 */:
                ((com.google.android.material.datepicker.l) this.f19225f).f11442u.k0(this.f19224e);
                break;
            case 8:
                q6.d dVar = (q6.d) this.f19225f;
                int[] iArr = q6.d.f16254m0;
                dVar.j(this.f19224e);
                break;
            default:
                com.onesignal.i0 i0Var = (com.onesignal.i0) this.f19225f;
                WebView webView = i0Var.f11879q;
                y3 y3Var = y3.f12231j;
                if (webView != null) {
                    ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
                    if (layoutParams != null) {
                        int i13 = this.f19224e;
                        layoutParams.height = i13;
                        i0Var.f11879q.setLayoutParams(layoutParams);
                        com.onesignal.o oVar = i0Var.f11881s;
                        if (oVar != null) {
                            oVar.a(i0Var.c(i13, i0Var.f11878p, i0Var.f11876n));
                            break;
                        }
                    } else {
                        str = "WebView height update skipped because of null layoutParams, new height will be used once it is displayed.";
                    }
                } else {
                    str = "WebView height update skipped, new height will be used once it is displayed.";
                }
                z3.b(y3Var, str, null);
                break;
        }
    }

    public /* synthetic */ p(Object obj, int i10, int i11) {
        this.f19223b = i11;
        this.f19225f = obj;
        this.f19224e = i10;
    }

    public p(n nVar, int i10) {
        this.f19223b = 0;
        this.f19224e = i10;
        this.f19225f = nVar;
    }
}