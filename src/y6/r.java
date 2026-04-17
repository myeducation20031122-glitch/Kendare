package y6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.h1;
import o0.c1;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f19351a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19352b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19353c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f19354d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f19355e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f19356f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f19357g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f19358h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f19359i;

    /* renamed from: j, reason: collision with root package name */
    public int f19360j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f19361k;

    /* renamed from: l, reason: collision with root package name */
    public Animator f19362l;

    /* renamed from: m, reason: collision with root package name */
    public final float f19363m;

    /* renamed from: n, reason: collision with root package name */
    public int f19364n;

    /* renamed from: o, reason: collision with root package name */
    public int f19365o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f19366p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19367q;

    /* renamed from: r, reason: collision with root package name */
    public h1 f19368r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f19369s;

    /* renamed from: t, reason: collision with root package name */
    public int f19370t;

    /* renamed from: u, reason: collision with root package name */
    public int f19371u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f19372v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f19373w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f19374x;

    /* renamed from: y, reason: collision with root package name */
    public h1 f19375y;

    /* renamed from: z, reason: collision with root package name */
    public int f19376z;

    public r(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f19357g = context;
        this.f19358h = textInputLayout;
        this.f19363m = context.getResources().getDimensionPixelSize(2131099799);
        this.f19351a = j4.L(context, 2130903926, 217);
        this.f19352b = j4.L(context, 2130903922, 167);
        this.f19353c = j4.L(context, 2130903926, 167);
        this.f19354d = j4.M(context, 2130903931, z5.a.f19749d);
        LinearInterpolator linearInterpolator = z5.a.f19746a;
        this.f19355e = j4.M(context, 2130903931, linearInterpolator);
        this.f19356f = j4.M(context, 2130903934, linearInterpolator);
    }

    public final void a(TextView textView, int i10) {
        if (this.f19359i == null && this.f19361k == null) {
            Context context = this.f19357g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f19359i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f19359i;
            TextInputLayout textInputLayout = this.f19358h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f19361k = new FrameLayout(context);
            this.f19359i.addView(this.f19361k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f19361k.setVisibility(0);
            this.f19361k.addView(textView);
        } else {
            this.f19359i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f19359i.setVisibility(0);
        this.f19360j++;
    }

    public final void b() {
        if (this.f19359i != null) {
            TextInputLayout textInputLayout = this.f19358h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f19357g;
                boolean zB = j4.B(context);
                LinearLayout linearLayout = this.f19359i;
                WeakHashMap weakHashMap = c1.f15515a;
                int paddingStart = editText.getPaddingStart();
                if (zB) {
                    paddingStart = context.getResources().getDimensionPixelSize(2131100235);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131100234);
                if (zB) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(2131100236);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zB) {
                    paddingEnd = context.getResources().getDimensionPixelSize(2131100235);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        Animator animator = this.f19362l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z7, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z7) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            boolean z10 = i12 == i10;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
            int i13 = this.f19353c;
            objectAnimatorOfFloat.setDuration(z10 ? this.f19352b : i13);
            objectAnimatorOfFloat.setInterpolator(z10 ? this.f19355e : this.f19356f);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorOfFloat.setStartDelay(i13);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f19363m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f19351a);
            objectAnimatorOfFloat2.setInterpolator(this.f19354d);
            objectAnimatorOfFloat2.setStartDelay(i13);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i10) {
        if (i10 == 1) {
            return this.f19368r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f19375y;
    }

    public final void f() {
        this.f19366p = null;
        c();
        if (this.f19364n == 1) {
            this.f19365o = (!this.f19374x || TextUtils.isEmpty(this.f19373w)) ? 0 : 2;
        }
        i(this.f19364n, this.f19365o, h(this.f19368r, ""));
    }

    public final void g(TextView textView, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f19359i;
        if (linearLayout == null) {
            return;
        }
        if ((i10 == 0 || i10 == 1) && (frameLayout = this.f19361k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i11 = this.f19360j - 1;
        this.f19360j = i11;
        LinearLayout linearLayout2 = this.f19359i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap weakHashMap = c1.f15515a;
        TextInputLayout textInputLayout = this.f19358h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f19365o == this.f19364n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void i(int i10, int i11, boolean z7) {
        TextView textViewE;
        TextView textViewE2;
        if (i10 == i11) {
            return;
        }
        if (z7) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f19362l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f19374x, this.f19375y, 2, i10, i11);
            d(arrayList, this.f19367q, this.f19368r, 1, i10, i11);
            dq0.u(animatorSet, arrayList);
            animatorSet.addListener(new p(this, i11, e(i10), i10, e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (textViewE2 = e(i11)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i10 != 0 && (textViewE = e(i10)) != null) {
                textViewE.setVisibility(4);
                if (i10 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f19364n = i11;
        }
        TextInputLayout textInputLayout = this.f19358h;
        textInputLayout.r();
        textInputLayout.u(z7, false);
        textInputLayout.x();
    }
}