package m;

import android.os.Handler;
import android.widget.AbsListView;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k2 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m2 f14810a;

    public k2(m2 m2Var) {
        this.f14810a = m2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (i10 == 1) {
            m2 m2Var = this.f14810a;
            if (m2Var.f14841c0.getInputMethodMode() == 2 || m2Var.f14841c0.getContentView() == null) {
                return;
            }
            Handler handler = m2Var.Y;
            f2 f2Var = m2Var.U;
            handler.removeCallbacks(f2Var);
            f2Var.run();
        }
    }
}