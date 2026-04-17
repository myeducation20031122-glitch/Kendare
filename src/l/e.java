package l;

import android.view.View;
import android.view.ViewTreeObserver;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import m.r2;
import m.s0;
import m.v0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14309b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14310e;

    public /* synthetic */ e(Object obj, int i10) {
        this.f14309b = i10;
        this.f14310e = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10 = this.f14309b;
        Object obj = this.f14310e;
        switch (i10) {
            case 0:
                i iVar = (i) obj;
                if (iVar.a()) {
                    ArrayList arrayList = iVar.f14341w;
                    if (arrayList.size() > 0 && !((h) arrayList.get(0)).f14327a.f14840b0) {
                        View view = iVar.S;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((h) it.next()).f14327a.c();
                            }
                            break;
                        } else {
                            iVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            case QueueFuseable.SYNC /* 1 */:
                f0 f0Var = (f0) obj;
                if (f0Var.a()) {
                    r2 r2Var = f0Var.f14320w;
                    if (!r2Var.f14840b0) {
                        View view2 = f0Var.Q;
                        if (view2 != null && view2.isShown()) {
                            r2Var.c();
                            break;
                        } else {
                            f0Var.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                v0 v0Var = (v0) obj;
                if (!v0Var.getInternalPopup().a()) {
                    v0Var.f14960n.k(v0Var.getTextDirection(), v0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = v0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                s0 s0Var = (s0) obj;
                v0 v0Var2 = s0Var.f14925k0;
                if (!v0Var2.isAttachedToWindow() || !v0Var2.getGlobalVisibleRect(s0Var.f14923i0)) {
                    s0Var.dismiss();
                    break;
                } else {
                    s0Var.s();
                    s0Var.c();
                    break;
                }
                break;
        }
    }
}