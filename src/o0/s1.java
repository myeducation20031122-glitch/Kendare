package o0;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.google.android.gms.internal.ads.yl0;
import com.google.android.gms.internal.measurement.n3;
import com.onesignal.c4;
import com.onesignal.o3;
import com.onesignal.s5;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import t5.b4;
import t5.b6;
import t5.c3;
import t5.d6;
import t5.i3;
import t5.i5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15619b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15621f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f15622j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f15623m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f15624n;

    public /* synthetic */ s1(a2.n nVar, Activity activity, g7.a aVar, m9.g gVar, u7.a aVar2) {
        this.f15619b = 2;
        this.f15620e = nVar;
        this.f15621f = activity;
        this.f15622j = aVar;
        this.f15623m = gVar;
        this.f15624n = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141  */
    /* JADX WARN: Type inference failed for: r0v74, types: [t5.b6, t5.g4] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.google.android.gms.internal.measurement.l0] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [m0.j, t5.i5] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IOException, IllegalArgumentException, InvocationTargetException {
        AtomicReference atomicReference;
        i5 i5Var;
        c3 c3Var;
        AtomicReference atomicReference2;
        List listI1;
        b4 b4Var;
        int i10;
        final int i11 = 1;
        final int i12 = 0;
        switch (this.f15619b) {
            case 0:
                u1.h((View) this.f15620e, (n3) this.f15622j);
                ((ValueAnimator) this.f15623m).start();
                return;
            case QueueFuseable.SYNC /* 1 */:
                try {
                    if (!(((k2.j) this.f15620e).f13975b instanceof k2.a)) {
                        String string = ((UUID) this.f15621f).toString();
                        z1.x xVarF = ((j2.n) this.f15624n).f13612c.f(string);
                        if (xVarF == null || xVarF.c()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((a2.b) ((j2.n) this.f15624n).f13611b).g(string, (z1.h) this.f15622j);
                        ((Context) this.f15623m).startService(h2.c.b((Context) this.f15623m, string, (z1.h) this.f15622j));
                    }
                    ((k2.j) this.f15620e).k(null);
                    return;
                } catch (Throwable th) {
                    ((k2.j) this.f15620e).l(th);
                    return;
                }
            case 2:
                a2.n nVar = (a2.n) this.f15620e;
                Activity activity = (Activity) this.f15621f;
                g7.a aVar = (g7.a) this.f15622j;
                m9.g gVar = (m9.g) this.f15623m;
                final u7.a aVar2 = (u7.a) this.f15624n;
                nVar.getClass();
                try {
                    h0.f fVar = aVar.f13081c;
                    if (fVar == null || !fVar.f13149b) {
                        String strQ = o5.u.q((Application) nVar.f268b);
                        StringBuilder sb = new StringBuilder(String.valueOf(strQ).length() + 95);
                        sb.append("Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"");
                        sb.append(strQ);
                        sb.append("\") to set this as a debug device.");
                        Log.i("UserMessagingPlatform", sb.toString());
                    }
                    m.t tVarH = nVar.h(((o5.d) nVar.f274t).t(activity, aVar));
                    o5.d dVar = (o5.d) nVar.f275u;
                    g0.d dVar2 = new g0.d();
                    dVar2.f12950b = 0;
                    dVar2.f12951e = dVar;
                    dVar2.f12952f = tVarH;
                    yl0 yl0VarE = dVar2.e();
                    ((o5.f) nVar.f272m).f15728b.edit().putInt("consent_status", yl0VarE.f10132e).apply();
                    ((o5.k) nVar.f273n).f15765b.set((o5.m) yl0VarE.f10133f);
                    ((o5.e0) nVar.f276w).f15726a.execute(new z4.u0(nVar, gVar, 4));
                    return;
                } catch (RuntimeException e10) {
                    String strValueOf = String.valueOf(Log.getStackTraceString(e10));
                    final o5.f0 f0Var = new o5.f0(1, strValueOf.length() != 0 ? "Caught exception when trying to request consent info update: ".concat(strValueOf) : new String("Caught exception when trying to request consent info update: "));
                    ((Handler) nVar.f270f).post(new Runnable() { // from class: o5.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = i11;
                            u7.a aVar3 = aVar2;
                            f0 f0Var2 = f0Var;
                            switch (i13) {
                                case 0:
                                    m2.e eVarA = f0Var2.a();
                                    aVar3.getClass();
                                    u7.a.c(eVarA);
                                    break;
                                default:
                                    m2.e eVarA2 = f0Var2.a();
                                    aVar3.getClass();
                                    u7.a.c(eVarA2);
                                    break;
                            }
                        }
                    });
                    return;
                } catch (o5.f0 e11) {
                    ((Handler) nVar.f270f).post(new Runnable() { // from class: o5.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = i12;
                            u7.a aVar3 = aVar2;
                            f0 f0Var2 = e11;
                            switch (i13) {
                                case 0:
                                    m2.e eVarA = f0Var2.a();
                                    aVar3.getClass();
                                    u7.a.c(eVarA);
                                    break;
                                default:
                                    m2.e eVarA2 = f0Var2.a();
                                    aVar3.getClass();
                                    u7.a.c(eVarA2);
                                    break;
                            }
                        }
                    });
                    return;
                }
            case 3:
                synchronized (((AtomicReference) this.f15620e)) {
                    try {
                        try {
                            i5Var = (i5) this.f15624n;
                            c3Var = i5Var.f17428j;
                        } catch (RemoteException e12) {
                            i3 i3Var = ((b4) ((i5) this.f15624n).f15046b).f17251w;
                            b4.i(i3Var);
                            i3Var.f17397n.d("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f15621f, e12);
                            ((AtomicReference) this.f15620e).set(Collections.emptyList());
                            atomicReference = (AtomicReference) this.f15620e;
                        }
                        if (c3Var == null) {
                            i3 i3Var2 = ((b4) i5Var.f15046b).f17251w;
                            b4.i(i3Var2);
                            i3Var2.f17397n.d("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f15621f, (String) this.f15622j);
                            ((AtomicReference) this.f15620e).set(Collections.emptyList());
                        } else {
                            if (TextUtils.isEmpty(null)) {
                                fc.t.k((d6) this.f15623m);
                                atomicReference2 = (AtomicReference) this.f15620e;
                                listI1 = c3Var.N0((String) this.f15621f, (String) this.f15622j, (d6) this.f15623m);
                            } else {
                                atomicReference2 = (AtomicReference) this.f15620e;
                                listI1 = c3Var.I1(null, (String) this.f15621f, (String) this.f15622j);
                            }
                            atomicReference2.set(listI1);
                            ((i5) this.f15624n).A();
                            atomicReference = (AtomicReference) this.f15620e;
                            atomicReference.notify();
                        }
                    } finally {
                        ((AtomicReference) this.f15620e).notify();
                    }
                }
                return;
            case 4:
                Object obj = this.f15622j;
                Object obj2 = this.f15621f;
                Object obj3 = this.f15620e;
                ?? r42 = this.f15623m;
                i5 i5Var2 = this.f15624n;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        i5 i5Var3 = (i5) i5Var2;
                        c3 c3Var2 = i5Var3.f17428j;
                        if (c3Var2 == null) {
                            i3 i3Var3 = ((b4) i5Var3.f15046b).f17251w;
                            b4.i(i3Var3);
                            i3Var3.f17397n.c((String) obj3, "Failed to get conditional properties; not connected to service", (String) obj2);
                            i5 i5Var4 = (i5) i5Var2;
                            b4Var = (b4) i5Var4.f15046b;
                            i5Var2 = i5Var4;
                        } else {
                            fc.t.k((d6) obj);
                            arrayList = b6.z(c3Var2.N0((String) obj3, (String) obj2, (d6) obj));
                            ((i5) i5Var2).A();
                            i5 i5Var5 = (i5) i5Var2;
                            b4Var = (b4) i5Var5.f15046b;
                            i5Var2 = i5Var5;
                        }
                    } catch (RemoteException e13) {
                        i3 i3Var4 = ((b4) i5Var2.f15046b).f17251w;
                        b4.i(i3Var4);
                        i3Var4.f17397n.d("Failed to get conditional properties; remote exception", (String) obj3, (String) obj2, e13);
                        i5Var2 = i5Var2;
                        b4Var = (b4) i5Var2.f15046b;
                    }
                    ?? r02 = b4Var.O;
                    b4.g(r02);
                    r42 = (com.google.android.gms.internal.measurement.l0) r42;
                    r02.I(r42, arrayList);
                    return;
                } catch (Throwable th2) {
                    b6 b6Var = ((b4) ((i5) i5Var2).f15046b).O;
                    b4.g(b6Var);
                    b6Var.I((com.google.android.gms.internal.measurement.l0) r42, arrayList);
                    throw th2;
                }
            default:
                com.onesignal.i0 i0Var = (com.onesignal.i0) this.f15624n;
                WebView webView = i0Var.f11879q;
                if (webView == null) {
                    return;
                }
                webView.setLayoutParams((RelativeLayout.LayoutParams) this.f15620e);
                Context applicationContext = i0Var.f11864b.getApplicationContext();
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f15621f;
                com.onesignal.n nVar2 = (com.onesignal.n) this.f15622j;
                com.onesignal.o oVar = new com.onesignal.o(applicationContext);
                oVar.setClipChildren(false);
                x0.e eVar = new x0.e(oVar.getContext(), oVar, new com.onesignal.m(oVar));
                eVar.f18876b = (int) (1.0f * eVar.f18876b);
                oVar.f12027e = eVar;
                i0Var.f11881s = oVar;
                if (layoutParams != null) {
                    oVar.setLayoutParams(layoutParams);
                }
                i0Var.f11881s.a(nVar2);
                i0Var.f11881s.f12026b = new com.onesignal.f0(i0Var, i12);
                if (i0Var.f11879q.getParent() != null) {
                    ((ViewGroup) i0Var.f11879q.getParent()).removeAllViews();
                }
                CardView cardView = new CardView(applicationContext, null);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, i0Var.f11878p == s5.f12141e ? -1 : -2);
                layoutParams2.addRule(13);
                cardView.setLayoutParams(layoutParams2);
                if (Build.VERSION.SDK_INT == 23) {
                    cardView.setCardElevation(0.0f);
                } else {
                    cardView.setCardElevation(o3.b(5));
                }
                cardView.setRadius(o3.b(8));
                cardView.setClipChildren(false);
                cardView.setClipToPadding(false);
                cardView.setPreventCornerOverlap(false);
                cardView.setCardBackgroundColor(0);
                cardView.setTag("IN_APP_MESSAGE_CARD_VIEW_TAG");
                cardView.addView(i0Var.f11879q);
                i0Var.f11881s.setPadding(i0Var.f11868f, i0Var.f11870h, i0Var.f11869g, i0Var.f11871i);
                i0Var.f11881s.setClipChildren(false);
                i0Var.f11881s.setClipToPadding(false);
                i0Var.f11881s.addView(cardView);
                RelativeLayout relativeLayout = new RelativeLayout(applicationContext);
                i0Var.f11880r = relativeLayout;
                relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
                i0Var.f11880r.setClipChildren(false);
                i0Var.f11880r.setClipToPadding(false);
                i0Var.f11880r.addView(i0Var.f11881s);
                RelativeLayout relativeLayout2 = i0Var.f11880r;
                boolean z7 = i0Var.f11873k;
                PopupWindow popupWindow = new PopupWindow((View) relativeLayout2, z7 ? -1 : i0Var.f11866d, z7 ? -1 : -2, true);
                i0Var.f11863a = popupWindow;
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                i0Var.f11863a.setTouchable(true);
                i0Var.f11863a.setClippingEnabled(false);
                if (z7) {
                    i10 = 0;
                } else {
                    int iOrdinal = i0Var.f11878p.ordinal();
                    if (iOrdinal == 0) {
                        i10 = 49;
                    } else if (iOrdinal == 1) {
                        i10 = 81;
                    } else if (iOrdinal == 2 || iOrdinal == 3) {
                        i10 = 1;
                    }
                }
                g5.a.A(i0Var.f11863a, i0Var.f11877o.f11887d ? com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS : 1003);
                i0Var.f11863a.showAtLocation(i0Var.f11864b.getWindow().getDecorView().getRootView(), i10, 0, 0);
                if (i0Var.f11882t != null) {
                    s5 s5Var = (s5) this.f15623m;
                    com.onesignal.o oVar2 = i0Var.f11881s;
                    RelativeLayout relativeLayout3 = i0Var.f11880r;
                    CardView cardView2 = (CardView) oVar2.findViewWithTag("IN_APP_MESSAGE_CARD_VIEW_TAG");
                    com.onesignal.h0 h0Var = new com.onesignal.h0(i0Var, cardView2);
                    int iOrdinal2 = s5Var.ordinal();
                    if (iOrdinal2 == 0) {
                        float f10 = (-i0Var.f11879q.getHeight()) - i0Var.f11870h;
                        c4 c4Var = new c4();
                        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f10, 0.0f);
                        translateAnimation.setDuration(com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS);
                        translateAnimation.setInterpolator(c4Var);
                        translateAnimation.setAnimationListener(h0Var);
                        cardView2.setAnimation(translateAnimation);
                        translateAnimation.start();
                    } else if (iOrdinal2 == 1) {
                        float height = i0Var.f11879q.getHeight() + i0Var.f11871i;
                        c4 c4Var2 = new c4();
                        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, height, 0.0f);
                        translateAnimation2.setDuration(com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS);
                        translateAnimation2.setInterpolator(c4Var2);
                        translateAnimation2.setAnimationListener(h0Var);
                        cardView2.setAnimation(translateAnimation2);
                        translateAnimation2.start();
                    } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
                        c4 c4Var3 = new c4();
                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation.setDuration(com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS);
                        scaleAnimation.setInterpolator(c4Var3);
                        scaleAnimation.setAnimationListener(h0Var);
                        oVar2.setAnimation(scaleAnimation);
                        ValueAnimator valueAnimatorB = com.onesignal.i0.b(relativeLayout3, com.onesignal.i0.f11860v, com.onesignal.i0.f11861w, null);
                        scaleAnimation.start();
                        valueAnimatorB.start();
                    }
                }
                double d10 = i0Var.f11872j;
                if (d10 > 0.0d && i0Var.f11883u == null) {
                    com.onesignal.g0 g0Var = new com.onesignal.g0(i0Var, i12);
                    i0Var.f11883u = g0Var;
                    i0Var.f11865c.postDelayed(g0Var, ((long) d10) * 1000);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ s1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f15619b = i10;
        this.f15624n = obj;
        this.f15620e = obj2;
        this.f15621f = obj3;
        this.f15622j = obj4;
        this.f15623m = obj5;
    }

    public s1(i5 i5Var, AtomicReference atomicReference, String str, String str2, d6 d6Var) {
        this.f15619b = 3;
        this.f15624n = i5Var;
        this.f15620e = atomicReference;
        this.f15621f = str;
        this.f15622j = str2;
        this.f15623m = d6Var;
    }
}