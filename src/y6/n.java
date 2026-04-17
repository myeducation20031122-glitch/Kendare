package y6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.h1;
import o0.c1;
import t5.j4;
import t7.z0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n extends LinearLayout {

    /* renamed from: c0, reason: collision with root package name */
    public static final /* synthetic */ int f19329c0 = 0;
    public final LinkedHashSet M;
    public ColorStateList N;
    public PorterDuff.Mode O;
    public int P;
    public ImageView.ScaleType Q;
    public View.OnLongClickListener R;
    public CharSequence S;
    public final h1 T;
    public boolean U;
    public EditText V;
    public final AccessibilityManager W;

    /* renamed from: a0, reason: collision with root package name */
    public e0.g f19330a0;

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f19331b;

    /* renamed from: b0, reason: collision with root package name */
    public final l f19332b0;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f19333e;

    /* renamed from: f, reason: collision with root package name */
    public final CheckableImageButton f19334f;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f19335j;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f19336m;

    /* renamed from: n, reason: collision with root package name */
    public View.OnLongClickListener f19337n;

    /* renamed from: t, reason: collision with root package name */
    public final CheckableImageButton f19338t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.activity.result.i f19339u;

    /* renamed from: w, reason: collision with root package name */
    public int f19340w;

    public n(TextInputLayout textInputLayout, g.e eVar) throws Resources.NotFoundException {
        CharSequence charSequenceE;
        super(textInputLayout.getContext());
        this.f19340w = 0;
        this.M = new LinkedHashSet();
        this.f19332b0 = new l(this);
        m mVar = new m(this);
        this.W = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f19331b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f19333e = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, 2131296933);
        this.f19334f = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, 2131296932);
        this.f19338t = checkableImageButtonA2;
        androidx.activity.result.i iVar = new androidx.activity.result.i();
        iVar.f582f = new SparseArray();
        iVar.f583j = this;
        iVar.f580b = eVar.B(28, 0);
        iVar.f581e = eVar.B(52, 0);
        this.f19339u = iVar;
        h1 h1Var = new h1(getContext(), null);
        this.T = h1Var;
        if (eVar.F(38)) {
            this.f19335j = j4.n(getContext(), eVar, 38);
        }
        if (eVar.F(39)) {
            this.f19336m = com.bumptech.glide.f.o(eVar.y(39, -1), null);
        }
        if (eVar.F(37)) {
            i(eVar.u(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(2131886397));
        WeakHashMap weakHashMap = c1.f15515a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!eVar.F(53)) {
            if (eVar.F(32)) {
                this.N = j4.n(getContext(), eVar, 32);
            }
            if (eVar.F(33)) {
                this.O = com.bumptech.glide.f.o(eVar.y(33, -1), null);
            }
        }
        if (eVar.F(30)) {
            g(eVar.y(30, 0));
            if (eVar.F(27) && checkableImageButtonA2.getContentDescription() != (charSequenceE = eVar.E(27))) {
                checkableImageButtonA2.setContentDescription(charSequenceE);
            }
            checkableImageButtonA2.setCheckable(eVar.q(26, true));
        } else if (eVar.F(53)) {
            if (eVar.F(54)) {
                this.N = j4.n(getContext(), eVar, 54);
            }
            if (eVar.F(55)) {
                this.O = com.bumptech.glide.f.o(eVar.y(55, -1), null);
            }
            g(eVar.q(53, false) ? 1 : 0);
            CharSequence charSequenceE2 = eVar.E(51);
            if (checkableImageButtonA2.getContentDescription() != charSequenceE2) {
                checkableImageButtonA2.setContentDescription(charSequenceE2);
            }
        }
        int iT = eVar.t(29, getResources().getDimensionPixelSize(2131100369));
        if (iT < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (iT != this.P) {
            this.P = iT;
            checkableImageButtonA2.setMinimumWidth(iT);
            checkableImageButtonA2.setMinimumHeight(iT);
            checkableImageButtonA.setMinimumWidth(iT);
            checkableImageButtonA.setMinimumHeight(iT);
        }
        if (eVar.F(31)) {
            ImageView.ScaleType scaleTypeB = z0.b(eVar.y(31, -1));
            this.Q = scaleTypeB;
            checkableImageButtonA2.setScaleType(scaleTypeB);
            checkableImageButtonA.setScaleType(scaleTypeB);
        }
        h1Var.setVisibility(8);
        h1Var.setId(2131296952);
        h1Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        h1Var.setAccessibilityLiveRegion(1);
        o5.u.n(h1Var, eVar.B(72, 0));
        if (eVar.F(73)) {
            h1Var.setTextColor(eVar.r(73));
        }
        CharSequence charSequenceE3 = eVar.E(71);
        this.S = TextUtils.isEmpty(charSequenceE3) ? null : charSequenceE3;
        h1Var.setText(charSequenceE3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(h1Var);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.H0.add(mVar);
        if (textInputLayout.f11555j != null) {
            mVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new l.f(this, 2));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(2131492921, viewGroup, false);
        checkableImageButton.setId(i10);
        if (Build.VERSION.SDK_INT <= 22) {
            Context context = checkableImageButton.getContext();
            int iApplyDimension = (int) TypedValue.applyDimension(1, 4, checkableImageButton.getContext().getResources().getDisplayMetrics());
            int[] iArr = t6.d.f17730a;
            checkableImageButton.setBackground(t6.c.b(context, iApplyDimension));
        }
        if (j4.B(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final o b() {
        int i10 = this.f19340w;
        androidx.activity.result.i iVar = this.f19339u;
        SparseArray sparseArray = (SparseArray) iVar.f582f;
        o eVar = (o) sparseArray.get(i10);
        if (eVar == null) {
            if (i10 != -1) {
                int i11 = 1;
                if (i10 == 0) {
                    eVar = new e((n) iVar.f583j, i11);
                } else if (i10 == 1) {
                    eVar = new v((n) iVar.f583j, iVar.f581e);
                } else if (i10 == 2) {
                    eVar = new d((n) iVar.f583j);
                } else {
                    if (i10 != 3) {
                        throw new IllegalArgumentException(kc.r.d("Invalid end icon mode: ", i10));
                    }
                    eVar = new k((n) iVar.f583j);
                }
            } else {
                eVar = new e((n) iVar.f583j, 0);
            }
            sparseArray.append(i10, eVar);
        }
        return eVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f19338t;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = c1.f15515a;
        return this.T.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f19333e.getVisibility() == 0 && this.f19338t.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f19334f.getVisibility() == 0;
    }

    public final void f(boolean z7) {
        boolean z10;
        boolean zIsActivated;
        boolean zIsChecked;
        o oVarB = b();
        boolean zK = oVarB.k();
        CheckableImageButton checkableImageButton = this.f19338t;
        boolean z11 = true;
        if (!zK || (zIsChecked = checkableImageButton.isChecked()) == oVarB.l()) {
            z10 = false;
        } else {
            checkableImageButton.setChecked(!zIsChecked);
            z10 = true;
        }
        if (!(oVarB instanceof k) || (zIsActivated = checkableImageButton.isActivated()) == oVarB.j()) {
            z11 = z10;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z7 || z11) {
            z0.f(this.f19331b, checkableImageButton, this.N);
        }
    }

    public final void g(int i10) throws Resources.NotFoundException {
        if (this.f19340w == i10) {
            return;
        }
        o oVarB = b();
        e0.g gVar = this.f19330a0;
        AccessibilityManager accessibilityManager = this.W;
        if (gVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new p0.b(gVar));
        }
        this.f19330a0 = null;
        oVarB.s();
        this.f19340w = i10;
        Iterator it = this.M.iterator();
        if (it.hasNext()) {
            ic1.v(it.next());
            throw null;
        }
        h(i10 != 0);
        o oVarB2 = b();
        int iD = this.f19339u.f580b;
        if (iD == 0) {
            iD = oVarB2.d();
        }
        Drawable drawableC = iD != 0 ? com.bumptech.glide.c.c(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f19338t;
        checkableImageButton.setImageDrawable(drawableC);
        TextInputLayout textInputLayout = this.f19331b;
        if (drawableC != null) {
            z0.a(textInputLayout, checkableImageButton, this.N, this.O);
            z0.f(textInputLayout, checkableImageButton, this.N);
        }
        int iC = oVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(oVarB2.k());
        if (!oVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        oVarB2.r();
        e0.g gVarH = oVarB2.h();
        this.f19330a0 = gVarH;
        if (gVarH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = c1.f15515a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new p0.b(this.f19330a0));
            }
        }
        View.OnClickListener onClickListenerF = oVarB2.f();
        View.OnLongClickListener onLongClickListener = this.R;
        checkableImageButton.setOnClickListener(onClickListenerF);
        z0.h(checkableImageButton, onLongClickListener);
        EditText editText = this.V;
        if (editText != null) {
            oVarB2.m(editText);
            j(oVarB2);
        }
        z0.a(textInputLayout, checkableImageButton, this.N, this.O);
        f(true);
    }

    public final void h(boolean z7) throws Resources.NotFoundException {
        if (d() != z7) {
            this.f19338t.setVisibility(z7 ? 0 : 8);
            k();
            m();
            this.f19331b.q();
        }
    }

    public final void i(Drawable drawable) throws Resources.NotFoundException {
        CheckableImageButton checkableImageButton = this.f19334f;
        checkableImageButton.setImageDrawable(drawable);
        l();
        z0.a(this.f19331b, checkableImageButton, this.f19335j, this.f19336m);
    }

    public final void j(o oVar) {
        if (this.V == null) {
            return;
        }
        if (oVar.e() != null) {
            this.V.setOnFocusChangeListener(oVar.e());
        }
        if (oVar.g() != null) {
            this.f19338t.setOnFocusChangeListener(oVar.g());
        }
    }

    public final void k() {
        this.f19333e.setVisibility((this.f19338t.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.S == null || this.U) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() throws Resources.NotFoundException {
        CheckableImageButton checkableImageButton = this.f19334f;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f19331b;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.M.f19367q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.f19340w != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() throws Resources.NotFoundException {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f19331b;
        if (textInputLayout.f11555j == null) {
            return;
        }
        if (d() || e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f11555j;
            WeakHashMap weakHashMap = c1.f15515a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131100237);
        int paddingTop = textInputLayout.f11555j.getPaddingTop();
        int paddingBottom = textInputLayout.f11555j.getPaddingBottom();
        WeakHashMap weakHashMap2 = c1.f15515a;
        this.T.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void n() {
        h1 h1Var = this.T;
        int visibility = h1Var.getVisibility();
        int i10 = (this.S == null || this.U) ? 8 : 0;
        if (visibility != i10) {
            b().p(i10 == 0);
        }
        k();
        h1Var.setVisibility(i10);
        this.f19331b.q();
    }
}