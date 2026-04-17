package y6;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import l4.j0;
import o0.c1;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k extends o {

    /* renamed from: e, reason: collision with root package name */
    public final int f19313e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19314f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f19315g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f19316h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.material.datepicker.m f19317i;

    /* renamed from: j, reason: collision with root package name */
    public final b f19318j;

    /* renamed from: k, reason: collision with root package name */
    public final e0.g f19319k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19320l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19321m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19322n;

    /* renamed from: o, reason: collision with root package name */
    public long f19323o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f19324p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f19325q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f19326r;

    public k(n nVar) {
        super(nVar);
        this.f19317i = new com.google.android.material.datepicker.m(this, 2);
        this.f19318j = new b(this, 1);
        this.f19319k = new e0.g(this, 10);
        this.f19323o = Long.MAX_VALUE;
        this.f19314f = j4.L(nVar.getContext(), 2130903925, 67);
        this.f19313e = j4.L(nVar.getContext(), 2130903925, 50);
        this.f19315g = j4.M(nVar.getContext(), 2130903934, z5.a.f19746a);
    }

    @Override // y6.o
    public final void a() {
        if (this.f19324p.isTouchExplorationEnabled() && this.f19316h.getInputType() != 0 && !this.f19344d.hasFocus()) {
            this.f19316h.dismissDropDown();
        }
        this.f19316h.post(new androidx.activity.d(this, 12));
    }

    @Override // y6.o
    public final int c() {
        return 2131886400;
    }

    @Override // y6.o
    public final int d() {
        return 2131165443;
    }

    @Override // y6.o
    public final View.OnFocusChangeListener e() {
        return this.f19318j;
    }

    @Override // y6.o
    public final View.OnClickListener f() {
        return this.f19317i;
    }

    @Override // y6.o
    public final e0.g h() {
        return this.f19319k;
    }

    @Override // y6.o
    public final boolean i(int i10) {
        return i10 != 0;
    }

    @Override // y6.o
    public final boolean j() {
        return this.f19320l;
    }

    @Override // y6.o
    public final boolean l() {
        return this.f19322n;
    }

    @Override // y6.o
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f19316h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: y6.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar = this.f19311b;
                kVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - kVar.f19323o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        kVar.f19321m = false;
                    }
                    kVar.u();
                    kVar.f19321m = true;
                    kVar.f19323o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f19316h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: y6.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = this.f19312a;
                kVar.f19321m = true;
                kVar.f19323o = System.currentTimeMillis();
                kVar.t(false);
            }
        });
        this.f19316h.setThreshold(0);
        TextInputLayout textInputLayout = this.f19341a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f19324p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = c1.f15515a;
            this.f19344d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // y6.o
    public final void n(p0.h hVar) {
        if (this.f19316h.getInputType() == 0) {
            hVar.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? j0.A(hVar.f15862a) : hVar.e(4)) {
            hVar.k(null);
        }
    }

    @Override // y6.o
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (this.f19324p.isEnabled() && this.f19316h.getInputType() == 0) {
            boolean z7 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f19322n && !this.f19316h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z7) {
                u();
                this.f19321m = true;
                this.f19323o = System.currentTimeMillis();
            }
        }
    }

    @Override // y6.o
    public final void r() {
        int i10 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f19315g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f19314f);
        valueAnimatorOfFloat.addUpdateListener(new a(this, i10));
        this.f19326r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f19313e);
        valueAnimatorOfFloat2.addUpdateListener(new a(this, i10));
        this.f19325q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new m.d(this, 7));
        this.f19324p = (AccessibilityManager) this.f19343c.getSystemService("accessibility");
    }

    @Override // y6.o
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f19316h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f19316h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z7) {
        if (this.f19322n != z7) {
            this.f19322n = z7;
            this.f19326r.cancel();
            this.f19325q.start();
        }
    }

    public final void u() {
        if (this.f19316h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f19323o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f19321m = false;
        }
        if (this.f19321m) {
            this.f19321m = false;
            return;
        }
        t(!this.f19322n);
        if (!this.f19322n) {
            this.f19316h.dismissDropDown();
        } else {
            this.f19316h.requestFocus();
            this.f19316h.showDropDown();
        }
    }
}