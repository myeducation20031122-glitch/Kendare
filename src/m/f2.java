package m;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14774b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m2 f14775e;

    public /* synthetic */ f2(m2 m2Var, int i10) {
        this.f14774b = i10;
        this.f14775e = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10 = this.f14774b;
        m2 m2Var = this.f14775e;
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                z1 z1Var = m2Var.f14843f;
                if (z1Var != null) {
                    z1Var.setListSelectionHidden(true);
                    z1Var.requestLayout();
                    break;
                }
                break;
            default:
                z1 z1Var2 = m2Var.f14843f;
                if (z1Var2 != null && z1Var2.isAttachedToWindow() && m2Var.f14843f.getCount() > m2Var.f14843f.getChildCount() && m2Var.f14843f.getChildCount() <= m2Var.P) {
                    m2Var.f14841c0.setInputMethodMode(2);
                    m2Var.c();
                    break;
                }
                break;
        }
    }
}