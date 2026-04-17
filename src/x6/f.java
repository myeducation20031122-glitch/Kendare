package x6;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import io.reactivex.internal.fuseable.QueueFuseable;
import o0.k2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19045b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f19046e;

    public /* synthetic */ f(j jVar, int i10) {
        this.f19045b = i10;
        this.f19046e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Rect rect;
        int i10 = this.f19045b;
        j jVar = this.f19046e;
        switch (i10) {
            case 0:
                if (jVar.f19071i != null && (context = jVar.f19070h) != null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = k2.d(k2.f(windowManager));
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int iHeight = rect.height();
                    int[] iArr = new int[2];
                    i iVar = jVar.f19071i;
                    iVar.getLocationInWindow(iArr);
                    int height = (iHeight - (iVar.getHeight() + iArr[1])) + ((int) iVar.getTranslationY());
                    int i11 = jVar.f19078p;
                    if (height < i11) {
                        ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(j.f19062z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                            break;
                        } else {
                            int i12 = jVar.f19078p;
                            jVar.f19079q = i12;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i12 - height) + marginLayoutParams.bottomMargin;
                            iVar.requestLayout();
                            break;
                        }
                    } else {
                        jVar.f19079q = i11;
                        break;
                    }
                }
                break;
            case QueueFuseable.SYNC /* 1 */:
                jVar.b();
                break;
            default:
                i iVar2 = jVar.f19071i;
                if (iVar2 != null) {
                    ViewParent parent = iVar2.getParent();
                    i iVar3 = jVar.f19071i;
                    if (parent != null) {
                        iVar3.setVisibility(0);
                    }
                    if (iVar3.getAnimationMode() != 1) {
                        int height2 = iVar3.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = iVar3.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        iVar3.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(jVar.f19067e);
                        valueAnimator.setDuration(jVar.f19065c);
                        valueAnimator.addListener(new c(jVar, 0));
                        valueAnimator.addUpdateListener(new d(jVar, height2));
                        valueAnimator.start();
                        break;
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(jVar.f19066d);
                        valueAnimatorOfFloat.addUpdateListener(new b(jVar, 0));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(jVar.f19068f);
                        valueAnimatorOfFloat2.addUpdateListener(new b(jVar, 1));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(jVar.f19063a);
                        animatorSet.addListener(new c(jVar, 1));
                        animatorSet.start();
                        break;
                    }
                }
                break;
        }
    }
}