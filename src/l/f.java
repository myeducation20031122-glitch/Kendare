package l;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.WeakHashMap;
import o0.c1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14311b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14312e;

    public /* synthetic */ f(Object obj, int i10) {
        this.f14311b = i10;
        this.f14312e = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f14311b) {
            case 0:
            case QueueFuseable.SYNC /* 1 */:
                break;
            default:
                y6.n nVar = (y6.n) this.f14312e;
                int i10 = y6.n.f19329c0;
                if (nVar.f19330a0 != null && (accessibilityManager = nVar.W) != null) {
                    WeakHashMap weakHashMap = c1.f15515a;
                    if (nVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new p0.b(nVar.f19330a0));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i10 = this.f14311b;
        Object obj = this.f14312e;
        switch (i10) {
            case 0:
                i iVar = (i) obj;
                ViewTreeObserver viewTreeObserver = iVar.f14331b0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        iVar.f14331b0 = view.getViewTreeObserver();
                    }
                    iVar.f14331b0.removeGlobalOnLayoutListener(iVar.M);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case QueueFuseable.SYNC /* 1 */:
                f0 f0Var = (f0) obj;
                ViewTreeObserver viewTreeObserver2 = f0Var.S;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        f0Var.S = view.getViewTreeObserver();
                    }
                    f0Var.S.removeGlobalOnLayoutListener(f0Var.M);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                y6.n nVar = (y6.n) obj;
                int i11 = y6.n.f19329c0;
                e0.g gVar = nVar.f19330a0;
                if (gVar != null && (accessibilityManager = nVar.W) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new p0.b(gVar));
                    break;
                }
                break;
        }
    }
}