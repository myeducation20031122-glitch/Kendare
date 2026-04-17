package k;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import o0.o1;
import o0.p1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f13934c;

    /* renamed from: d, reason: collision with root package name */
    public p1 f13935d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13936e;

    /* renamed from: b, reason: collision with root package name */
    public long f13933b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final j f13937f = new j(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13932a = new ArrayList();

    public final void a() {
        if (this.f13936e) {
            Iterator it = this.f13932a.iterator();
            while (it.hasNext()) {
                ((o1) it.next()).b();
            }
            this.f13936e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f13936e) {
            return;
        }
        Iterator it = this.f13932a.iterator();
        while (it.hasNext()) {
            o1 o1Var = (o1) it.next();
            long j10 = this.f13933b;
            if (j10 >= 0) {
                o1Var.c(j10);
            }
            Interpolator interpolator = this.f13934c;
            if (interpolator != null && (view = (View) o1Var.f15598a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f13935d != null) {
                o1Var.d(this.f13937f);
            }
            View view2 = (View) o1Var.f15598a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f13936e = true;
    }
}