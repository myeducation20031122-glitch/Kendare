package m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14733b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f14732a = i10;
        this.f14733b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f14732a;
        Object obj = this.f14733b;
        switch (i10) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f647c0 = null;
                actionBarOverlayLayout.M = false;
                break;
            case 3:
                k4.k kVar = (k4.k) obj;
                kVar.setEnabled(true);
                kVar.f14007b.setEnabled(true);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f14732a;
        Object obj = this.f14733b;
        switch (i10) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f647c0 = null;
                actionBarOverlayLayout.M = false;
                return;
            case QueueFuseable.SYNC /* 1 */:
                ((t1.t) obj).o();
                animator.removeListener(this);
                return;
            case 2:
                u1.e eVar = (u1.e) obj;
                ArrayList arrayList = new ArrayList(eVar.f18160m);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ColorStateList colorStateList = ((i6.a) arrayList.get(i11)).f13396b.R;
                    if (colorStateList != null) {
                        i0.a.h(eVar, colorStateList);
                    }
                }
                return;
            case 3:
                k4.k kVar = (k4.k) obj;
                kVar.setEnabled(true);
                kVar.f14007b.setEnabled(true);
                return;
            case 4:
                ((HideBottomViewOnScrollBehavior) obj).f11343h = null;
                return;
            case y4.g.INVALID_ACCOUNT /* 5 */:
            default:
                ((ExpandableTransformationBehavior) obj).getClass();
                return;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                ic1.v(obj);
                throw null;
            case y4.g.NETWORK_ERROR /* 7 */:
                y6.k kVar2 = (y6.k) obj;
                kVar2.q();
                kVar2.f19326r.start();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f14732a;
        Object obj = this.f14733b;
        switch (i10) {
            case 2:
                u1.e eVar = (u1.e) obj;
                ArrayList arrayList = new ArrayList(eVar.f18160m);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    i6.c cVar = ((i6.a) arrayList.get(i11)).f13396b;
                    ColorStateList colorStateList = cVar.R;
                    if (colorStateList != null) {
                        i0.a.g(eVar, colorStateList.getColorForState(cVar.V, colorStateList.getDefaultColor()));
                    }
                }
                return;
            case 3:
                k4.k kVar = (k4.k) obj;
                kVar.setEnabled(false);
                kVar.f14007b.setEnabled(false);
                return;
            case 4:
            case y4.g.INVALID_ACCOUNT /* 5 */:
            default:
                super.onAnimationStart(animator);
                return;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                ic1.v(obj);
                throw null;
        }
    }
}