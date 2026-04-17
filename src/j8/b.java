package j8;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.internal.measurement.l9;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.IOException;
import java.util.WeakHashMap;
import o0.c1;
import o0.r2;
import o0.x0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13843b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f13845f;

    public /* synthetic */ b(Object obj, boolean z7, int i10) {
        this.f13843b = i10;
        this.f13844e = obj;
        this.f13845f = z7;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        k8.a aVarO;
        k8.a aVarC;
        r2 r2Var;
        switch (this.f13843b) {
            case 0:
                c cVar = (c) this.f13844e;
                boolean z7 = this.f13845f;
                cVar.getClass();
                synchronized (c.f13846m) {
                    try {
                        i7.g gVar = cVar.f13848a;
                        gVar.a();
                        l9 l9VarA = l9.a(gVar.f13427a);
                        try {
                            aVarO = cVar.f13850c.o();
                            if (l9VarA != null) {
                                l9VarA.p();
                            }
                        } catch (Throwable th) {
                            if (l9VarA != null) {
                                l9VarA.p();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    k8.c cVar2 = k8.c.f14044m;
                    k8.c cVar3 = aVarO.f14031b;
                    if (cVar3 == cVar2 || cVar3 == k8.c.f14042f) {
                        aVarC = cVar.i(aVarO);
                    } else if (!z7 && !cVar.f13851d.a(aVarO)) {
                        return;
                    } else {
                        aVarC = cVar.c(aVarO);
                    }
                    cVar.f(aVarC);
                    cVar.m(aVarO, aVarC);
                    if (aVarC.f14031b == k8.c.f14043j) {
                        cVar.l(aVarC.f14030a);
                    }
                    k8.c cVar4 = aVarC.f14031b;
                    if (cVar4 == cVar2) {
                        e = new e();
                    } else {
                        if (cVar4 != k8.c.f14041e && cVar4 != k8.c.f14040b) {
                            cVar.k(aVarC);
                            return;
                        }
                        e = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
                    }
                } catch (e e10) {
                    e = e10;
                }
                cVar.j(e);
                return;
            case QueueFuseable.SYNC /* 1 */:
                ((c) this.f13844e).b(this.f13845f);
                return;
            default:
                View view = (View) this.f13844e;
                if (this.f13845f) {
                    WeakHashMap weakHashMap = c1.f15515a;
                    if (Build.VERSION.SDK_INT >= 30) {
                        r2Var = x0.c(view);
                    } else {
                        Context context = view.getContext();
                        while (true) {
                            if (context instanceof ContextWrapper) {
                                if (context instanceof Activity) {
                                    Window window = ((Activity) context).getWindow();
                                    if (window != null) {
                                        r2Var = new r2(window, view);
                                    }
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                        }
                        r2Var = null;
                    }
                    if (r2Var != null) {
                        r2Var.f15618a.J();
                        return;
                    }
                }
                ((InputMethodManager) f0.f.d(view.getContext())).showSoftInput(view, 1);
                return;
        }
    }
}