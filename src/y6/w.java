package y6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import m.h1;
import o0.c1;
import t5.j4;
import t7.z0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w extends LinearLayout {
    public boolean M;

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f19389b;

    /* renamed from: e, reason: collision with root package name */
    public final h1 f19390e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f19391f;

    /* renamed from: j, reason: collision with root package name */
    public final CheckableImageButton f19392j;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f19393m;

    /* renamed from: n, reason: collision with root package name */
    public PorterDuff.Mode f19394n;

    /* renamed from: t, reason: collision with root package name */
    public int f19395t;

    /* renamed from: u, reason: collision with root package name */
    public ImageView.ScaleType f19396u;

    /* renamed from: w, reason: collision with root package name */
    public View.OnLongClickListener f19397w;

    public w(TextInputLayout textInputLayout, g.e eVar) {
        CharSequence charSequenceE;
        super(textInputLayout.getContext());
        this.f19389b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(2131492922, (ViewGroup) this, false);
        this.f19392j = checkableImageButton;
        if (Build.VERSION.SDK_INT <= 22) {
            Context context = checkableImageButton.getContext();
            int iApplyDimension = (int) TypedValue.applyDimension(1, 4, checkableImageButton.getContext().getResources().getDisplayMetrics());
            int[] iArr = t6.d.f17730a;
            checkableImageButton.setBackground(t6.c.a(context, iApplyDimension));
        }
        h1 h1Var = new h1(getContext(), null);
        this.f19390e = h1Var;
        if (j4.B(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f19397w;
        checkableImageButton.setOnClickListener(null);
        z0.h(checkableImageButton, onLongClickListener);
        this.f19397w = null;
        checkableImageButton.setOnLongClickListener(null);
        z0.h(checkableImageButton, null);
        if (eVar.F(69)) {
            this.f19393m = j4.n(getContext(), eVar, 69);
        }
        if (eVar.F(70)) {
            this.f19394n = com.bumptech.glide.f.o(eVar.y(70, -1), null);
        }
        if (eVar.F(66)) {
            b(eVar.u(66));
            if (eVar.F(65) && checkableImageButton.getContentDescription() != (charSequenceE = eVar.E(65))) {
                checkableImageButton.setContentDescription(charSequenceE);
            }
            checkableImageButton.setCheckable(eVar.q(64, true));
        }
        int iT = eVar.t(67, getResources().getDimensionPixelSize(2131100369));
        if (iT < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (iT != this.f19395t) {
            this.f19395t = iT;
            checkableImageButton.setMinimumWidth(iT);
            checkableImageButton.setMinimumHeight(iT);
        }
        if (eVar.F(68)) {
            ImageView.ScaleType scaleTypeB = z0.b(eVar.y(68, -1));
            this.f19396u = scaleTypeB;
            checkableImageButton.setScaleType(scaleTypeB);
        }
        h1Var.setVisibility(8);
        h1Var.setId(2131296951);
        h1Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = c1.f15515a;
        h1Var.setAccessibilityLiveRegion(1);
        o5.u.n(h1Var, eVar.B(60, 0));
        if (eVar.F(61)) {
            h1Var.setTextColor(eVar.r(61));
        }
        CharSequence charSequenceE2 = eVar.E(59);
        this.f19391f = TextUtils.isEmpty(charSequenceE2) ? null : charSequenceE2;
        h1Var.setText(charSequenceE2);
        e();
        addView(checkableImageButton);
        addView(h1Var);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f19392j;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = c1.f15515a;
        return this.f19390e.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f19392j;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f19393m;
            PorterDuff.Mode mode = this.f19394n;
            TextInputLayout textInputLayout = this.f19389b;
            z0.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            z0.f(textInputLayout, checkableImageButton, this.f19393m);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f19397w;
        checkableImageButton.setOnClickListener(null);
        z0.h(checkableImageButton, onLongClickListener);
        this.f19397w = null;
        checkableImageButton.setOnLongClickListener(null);
        z0.h(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z7) {
        CheckableImageButton checkableImageButton = this.f19392j;
        if ((checkableImageButton.getVisibility() == 0) != z7) {
            checkableImageButton.setVisibility(z7 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() throws Resources.NotFoundException {
        int paddingStart;
        EditText editText = this.f19389b.f11555j;
        if (editText == null) {
            return;
        }
        if (this.f19392j.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = c1.f15515a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131100237);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = c1.f15515a;
        this.f19390e.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i10 = (this.f19391f == null || this.M) ? 8 : 0;
        setVisibility((this.f19392j.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f19390e.setVisibility(i10);
        this.f19389b.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) throws Resources.NotFoundException {
        super.onMeasure(i10, i11);
        d();
    }
}