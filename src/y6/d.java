package y6;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends o {

    /* renamed from: e, reason: collision with root package name */
    public final int f19298e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19299f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f19300g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f19301h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f19302i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.android.material.datepicker.m f19303j;

    /* renamed from: k, reason: collision with root package name */
    public final b f19304k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f19305l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f19306m;

    public d(n nVar) {
        super(nVar);
        this.f19303j = new com.google.android.material.datepicker.m(this, 1);
        this.f19304k = new b(this, 0);
        this.f19298e = j4.L(nVar.getContext(), 2130903925, 100);
        this.f19299f = j4.L(nVar.getContext(), 2130903925, 150);
        this.f19300g = j4.M(nVar.getContext(), 2130903934, z5.a.f19746a);
        this.f19301h = j4.M(nVar.getContext(), 2130903932, z5.a.f19749d);
    }

    @Override // y6.o
    public final void a() {
        if (this.f19342b.S != null) {
            return;
        }
        t(u());
    }

    @Override // y6.o
    public final int c() {
        return 2131886324;
    }

    @Override // y6.o
    public final int d() {
        return 2131165446;
    }

    @Override // y6.o
    public final View.OnFocusChangeListener e() {
        return this.f19304k;
    }

    @Override // y6.o
    public final View.OnClickListener f() {
        return this.f19303j;
    }

    @Override // y6.o
    public final View.OnFocusChangeListener g() {
        return this.f19304k;
    }

    @Override // y6.o
    public final void m(EditText editText) {
        this.f19302i = editText;
        this.f19341a.setEndIconVisible(u());
    }

    @Override // y6.o
    public final void p(boolean z7) {
        if (this.f19342b.S == null) {
            return;
        }
        t(z7);
    }

    @Override // y6.o
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f19301h);
        valueAnimatorOfFloat.setDuration(this.f19299f);
        valueAnimatorOfFloat.addUpdateListener(new a(this, 0));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f19300g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i10 = this.f19298e;
        valueAnimatorOfFloat2.setDuration(i10);
        valueAnimatorOfFloat2.addUpdateListener(new a(this, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f19305l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f19305l.addListener(new c(this, 0));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i10);
        valueAnimatorOfFloat3.addUpdateListener(new a(this, 1));
        this.f19306m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new c(this, 1));
    }

    @Override // y6.o
    public final void s() {
        EditText editText = this.f19302i;
        if (editText != null) {
            editText.post(new androidx.activity.d(this, 11));
        }
    }

    public final void t(boolean z7) {
        boolean z10 = this.f19342b.d() == z7;
        if (z7 && !this.f19305l.isRunning()) {
            this.f19306m.cancel();
            this.f19305l.start();
            if (z10) {
                this.f19305l.end();
                return;
            }
            return;
        }
        if (z7) {
            return;
        }
        this.f19305l.cancel();
        this.f19306m.start();
        if (z10) {
            this.f19306m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.f19302i;
        return editText != null && (editText.hasFocus() || this.f19344d.hasFocus()) && this.f19302i.getText().length() > 0;
    }
}