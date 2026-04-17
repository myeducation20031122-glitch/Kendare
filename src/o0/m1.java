package o0;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class m1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15581b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15583f;

    public /* synthetic */ m1(int i10, Object obj, Object obj2) {
        this.f15581b = i10;
        this.f15582e = obj;
        this.f15583f = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f15581b;
        Object obj = this.f15582e;
        switch (i10) {
            case 0:
                ((View) ((g.b1) ((p8.c) obj).f16073e).f12736d.getParent()).invalidate();
                return;
            default:
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                v6.g gVar = (v6.g) this.f15583f;
                int i11 = AppBarLayout.f11306e0;
                appBarLayout.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.k(fFloatValue);
                Drawable drawable = appBarLayout.f11307a0;
                if (drawable instanceof v6.g) {
                    ((v6.g) drawable).k(fFloatValue);
                }
                Iterator it = appBarLayout.T.iterator();
                if (it.hasNext()) {
                    ic1.v(it.next());
                    throw null;
                }
                return;
        }
    }
}