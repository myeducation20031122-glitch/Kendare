package o0;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f15598a;

    public o1(View view) {
        this.f15598a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.f15598a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.f15598a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = (View) this.f15598a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(p1 p1Var) {
        View view = (View) this.f15598a.get();
        if (view != null) {
            if (p1Var != null) {
                view.animate().setListener(new n1(this, p1Var, view, 0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.f15598a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}