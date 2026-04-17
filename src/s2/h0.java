package s2;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import java.util.WeakHashMap;
import o0.c1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h0 implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16731b;

    public /* synthetic */ h0(int i10) {
        this.f16731b = i10;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i10 = 1;
        int i11 = 0;
        switch (this.f16731b) {
            case 0:
                if (message.what == 1) {
                    ((e0) message.obj).d();
                    break;
                }
                break;
            default:
                int i12 = message.what;
                if (i12 == 0) {
                    x6.j jVar = (x6.j) message.obj;
                    x6.i iVar = jVar.f19071i;
                    if (iVar.getParent() == null) {
                        ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
                        if (layoutParams instanceof c0.e) {
                            c0.e eVar = (c0.e) layoutParams;
                            BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                            p5.g gVar = baseTransientBottomBar$Behavior.f11530j;
                            gVar.getClass();
                            gVar.f15951b = jVar.f19082t;
                            baseTransientBottomBar$Behavior.f11345b = new p5.m(jVar, 9);
                            eVar.b(baseTransientBottomBar$Behavior);
                            eVar.f2022g = 80;
                        }
                        iVar.N = true;
                        jVar.f19069g.addView(iVar);
                        iVar.N = false;
                        jVar.e();
                        iVar.setVisibility(4);
                    }
                    WeakHashMap weakHashMap = c1.f15515a;
                    if (!iVar.isLaidOut()) {
                        jVar.f19080r = true;
                        break;
                    } else {
                        jVar.d();
                        break;
                    }
                } else if (i12 == 1) {
                    x6.j jVar2 = (x6.j) message.obj;
                    int i13 = message.arg1;
                    AccessibilityManager accessibilityManager = jVar2.f19081s;
                    if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                        x6.i iVar2 = jVar2.f19071i;
                        if (iVar2.getVisibility() == 0) {
                            if (iVar2.getAnimationMode() != 1) {
                                ValueAnimator valueAnimator = new ValueAnimator();
                                int height = iVar2.getHeight();
                                ViewGroup.LayoutParams layoutParams2 = iVar2.getLayoutParams();
                                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                    height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                                }
                                valueAnimator.setIntValues(0, height);
                                valueAnimator.setInterpolator(jVar2.f19067e);
                                valueAnimator.setDuration(jVar2.f19065c);
                                valueAnimator.addListener(new x6.a(jVar2, i13, i10));
                                valueAnimator.addUpdateListener(new x6.e(jVar2));
                                valueAnimator.start();
                                break;
                            } else {
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                                valueAnimatorOfFloat.setInterpolator(jVar2.f19066d);
                                valueAnimatorOfFloat.addUpdateListener(new x6.b(jVar2, i11));
                                valueAnimatorOfFloat.setDuration(jVar2.f19064b);
                                valueAnimatorOfFloat.addListener(new x6.a(jVar2, i13, i11));
                                valueAnimatorOfFloat.start();
                                break;
                            }
                        }
                    }
                    jVar2.b();
                    break;
                }
                break;
        }
        return true;
    }
}