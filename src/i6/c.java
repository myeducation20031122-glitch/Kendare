package i6;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.bumptech.glide.f;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.ic1;
import g0.j;
import g0.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m.u;
import org.xmlpull.v1.XmlPullParserException;
import p6.n;
import t5.j4;
import u1.d;
import u1.e;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends u {

    /* renamed from: e0, reason: collision with root package name */
    public static final int[] f13398e0 = {2130904155};

    /* renamed from: f0, reason: collision with root package name */
    public static final int[] f13399f0 = {2130904154};

    /* renamed from: g0, reason: collision with root package name */
    public static final int[][] f13400g0 = {new int[]{R.attr.state_enabled, 2130904154}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: h0, reason: collision with root package name */
    public static final int f13401h0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public boolean M;
    public CharSequence N;
    public Drawable O;
    public Drawable P;
    public boolean Q;
    public ColorStateList R;
    public ColorStateList S;
    public PorterDuff.Mode T;
    public int U;
    public int[] V;
    public boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public CharSequence f13402a0;

    /* renamed from: b0, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f13403b0;

    /* renamed from: c0, reason: collision with root package name */
    public final e f13404c0;

    /* renamed from: d0, reason: collision with root package name */
    public final a f13405d0;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f13406m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f13407n;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f13408t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13409u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13410w;

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(Context context, AttributeSet attributeSet) throws Throwable {
        e eVar;
        int next;
        Context context2;
        g.e eVarF;
        int iB;
        super(a7.a.a(context, attributeSet, 2130903243, 2131952796), attributeSet, 2130903243);
        this.f13406m = new LinkedHashSet();
        this.f13407n = new LinkedHashSet();
        Context context3 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            eVar = new e(context3);
            Resources resources = context3.getResources();
            Resources.Theme theme = context3.getTheme();
            ThreadLocal threadLocal = q.f12975a;
            Drawable drawableA = j.a(resources, 2131165433, theme);
            eVar.f18163b = drawableA;
            drawableA.setCallback(eVar.f18161n);
            new d(eVar.f18163b.getConstantState());
        } else {
            int i10 = e.f18156t;
            try {
                XmlResourceParser xml = context3.getResources().getXml(2131165433);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                Resources resources2 = context3.getResources();
                Resources.Theme theme2 = context3.getTheme();
                e eVar2 = new e(context3);
                eVar2.inflate(resources2, xml, attributeSetAsAttributeSet, theme2);
                eVar = eVar2;
            } catch (IOException e10) {
                e = e10;
                Log.e("AnimatedVDCompat", "parser error", e);
                eVar = null;
                this.f13404c0 = eVar;
                this.f13405d0 = new a(this);
                context2 = getContext();
                this.O = com.bumptech.glide.d.r(this);
                this.R = getSuperButtonTintList();
                setSupportButtonTintList(null);
                eVarF = n.f(context2, attributeSet, y5.a.f19281r, 2130903243, 2131952796, new int[0]);
                this.P = eVarF.u(2);
                if (this.O != null) {
                    iB = eVarF.B(0, 0);
                    int iB2 = eVarF.B(1, 0);
                    if (iB == f13401h0) {
                        super.setButtonDrawable((Drawable) null);
                        this.O = com.bumptech.glide.c.c(context2, 2131165432);
                        this.Q = true;
                        if (this.P == null) {
                        }
                    }
                }
                this.S = j4.n(context2, eVarF, 3);
                this.T = f.o(eVarF.y(4, -1), PorterDuff.Mode.SRC_IN);
                this.f13409u = eVarF.q(10, false);
                this.f13410w = eVarF.q(6, true);
                this.M = eVarF.q(9, false);
                this.N = eVarF.E(8);
                if (eVarF.F(7)) {
                }
                eVarF.L();
                a();
            } catch (XmlPullParserException e11) {
                e = e11;
                Log.e("AnimatedVDCompat", "parser error", e);
                eVar = null;
                this.f13404c0 = eVar;
                this.f13405d0 = new a(this);
                context2 = getContext();
                this.O = com.bumptech.glide.d.r(this);
                this.R = getSuperButtonTintList();
                setSupportButtonTintList(null);
                eVarF = n.f(context2, attributeSet, y5.a.f19281r, 2130903243, 2131952796, new int[0]);
                this.P = eVarF.u(2);
                if (this.O != null) {
                }
                this.S = j4.n(context2, eVarF, 3);
                this.T = f.o(eVarF.y(4, -1), PorterDuff.Mode.SRC_IN);
                this.f13409u = eVarF.q(10, false);
                this.f13410w = eVarF.q(6, true);
                this.M = eVarF.q(9, false);
                this.N = eVarF.E(8);
                if (eVarF.F(7)) {
                }
                eVarF.L();
                a();
            }
        }
        this.f13404c0 = eVar;
        this.f13405d0 = new a(this);
        context2 = getContext();
        this.O = com.bumptech.glide.d.r(this);
        this.R = getSuperButtonTintList();
        setSupportButtonTintList(null);
        eVarF = n.f(context2, attributeSet, y5.a.f19281r, 2130903243, 2131952796, new int[0]);
        this.P = eVarF.u(2);
        if (this.O != null && com.bumptech.glide.e.J(context2, 2130903671, false)) {
            iB = eVarF.B(0, 0);
            int iB22 = eVarF.B(1, 0);
            if (iB == f13401h0 && iB22 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.O = com.bumptech.glide.c.c(context2, 2131165432);
                this.Q = true;
                if (this.P == null) {
                    this.P = com.bumptech.glide.c.c(context2, 2131165434);
                }
            }
        }
        this.S = j4.n(context2, eVarF, 3);
        this.T = f.o(eVarF.y(4, -1), PorterDuff.Mode.SRC_IN);
        this.f13409u = eVarF.q(10, false);
        this.f13410w = eVarF.q(6, true);
        this.M = eVarF.q(9, false);
        this.N = eVarF.E(8);
        if (eVarF.F(7)) {
            setCheckedState(eVarF.y(7, 0));
        }
        eVarF.L();
        a();
    }

    private String getButtonStateDescription() {
        Resources resources;
        int i10;
        int i11 = this.U;
        if (i11 == 1) {
            resources = getResources();
            i10 = 2131886664;
        } else if (i11 == 0) {
            resources = getResources();
            i10 = 2131886666;
        } else {
            resources = getResources();
            i10 = 2131886665;
        }
        return resources.getString(i10);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f13408t == null) {
            int iL = j4.l(this, 2130903314);
            int iL2 = j4.l(this, 2130903317);
            int iL3 = j4.l(this, 2130903356);
            int iL4 = j4.l(this, 2130903333);
            this.f13408t = new ColorStateList(f13400g0, new int[]{j4.F(iL3, 1.0f, iL2), j4.F(iL3, 1.0f, iL), j4.F(iL3, 0.54f, iL4), j4.F(iL3, 0.38f, iL4), j4.F(iL3, 0.38f, iL4)});
        }
        return this.f13408t;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.R;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        LayerDrawable layerDrawable;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        m.d dVar;
        this.O = dq0.e(this.O, this.R, u0.b.b(this));
        this.P = dq0.e(this.P, this.S, this.T);
        int i10 = 2;
        if (this.Q) {
            e eVar = this.f13404c0;
            if (eVar != null) {
                Drawable drawable = eVar.f18163b;
                a aVar = this.f13405d0;
                if (drawable != null) {
                    ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(aVar.a());
                }
                ArrayList arrayList = eVar.f18160m;
                u1.c cVar = eVar.f18157e;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (eVar.f18160m.size() == 0 && (dVar = eVar.f18159j) != null) {
                        cVar.f18152b.removeListener(dVar);
                        eVar.f18159j = null;
                    }
                }
                Drawable drawable2 = eVar.f18163b;
                if (drawable2 != null) {
                    ((AnimatedVectorDrawable) drawable2).registerAnimationCallback(aVar.a());
                } else if (aVar != null) {
                    if (eVar.f18160m == null) {
                        eVar.f18160m = new ArrayList();
                    }
                    if (!eVar.f18160m.contains(aVar)) {
                        eVar.f18160m.add(aVar);
                        if (eVar.f18159j == null) {
                            eVar.f18159j = new m.d(eVar, i10);
                        }
                        cVar.f18152b.addListener(eVar.f18159j);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.O;
                if ((drawable3 instanceof AnimatedStateListDrawable) && eVar != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(2131296418, 2131296984, eVar, false);
                    ((AnimatedStateListDrawable) this.O).addTransition(2131296602, 2131296984, eVar, false);
                }
            }
        }
        Drawable drawable4 = this.O;
        if (drawable4 != null && (colorStateList2 = this.R) != null) {
            i0.a.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.P;
        if (drawable5 != null && (colorStateList = this.S) != null) {
            i0.a.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.O;
        Drawable drawable7 = this.P;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f10 = intrinsicWidth / intrinsicHeight;
                if (f10 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f10);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f10 * intrinsicHeight);
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
                layerDrawable.setLayerGravity(1, 17);
            } else {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                int iMax = Math.max((drawable6.getIntrinsicWidth() - intrinsicWidth) / 2, 0);
                int iMax2 = Math.max((drawable6.getIntrinsicHeight() - intrinsicHeight) / 2, 0);
                layerDrawable.setLayerInset(1, iMax, iMax2, iMax, iMax2);
            }
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.O;
    }

    public Drawable getButtonIconDrawable() {
        return this.P;
    }

    public ColorStateList getButtonIconTintList() {
        return this.S;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.T;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.R;
    }

    public int getCheckedState() {
        return this.U;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.N;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.U == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f13409u && this.R == null && this.S == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f13398e0);
        }
        if (this.M) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f13399f0);
        }
        int i11 = 0;
        while (true) {
            if (i11 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i12 = iArrOnCreateDrawableState[i11];
            if (i12 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i12 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i11] = 16842912;
                break;
            }
            i11++;
        }
        this.V = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableR;
        if (!this.f13410w || !TextUtils.isEmpty(getText()) || (drawableR = com.bumptech.glide.d.r(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableR.getIntrinsicWidth()) / 2) * (f.m(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableR.getBounds();
            i0.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.M) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.N));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f13397b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f13397b = getCheckedState();
        return bVar;
    }

    @Override // m.u, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(com.bumptech.glide.c.c(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.P = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(com.bumptech.glide.c.c(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.S == colorStateList) {
            return;
        }
        this.S = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.T == mode) {
            return;
        }
        this.T = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.R == colorStateList) {
            return;
        }
        this.R = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z7) {
        this.f13410w = z7;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z7) {
        setCheckedState(z7 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.U != i10) {
            this.U = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30 && this.f13402a0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.W) {
                return;
            }
            this.W = true;
            LinkedHashSet linkedHashSet = this.f13407n;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    ic1.v(it.next());
                    throw null;
                }
            }
            if (this.U != 2 && (onCheckedChangeListener = this.f13403b0) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i11 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.W = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z7) {
        super.setEnabled(z7);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.N = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z7) {
        if (this.M == z7) {
            return;
        }
        this.M = z7;
        refreshDrawableState();
        Iterator it = this.f13406m.iterator();
        if (it.hasNext()) {
            ic1.v(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f13403b0 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f13402a0 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z7) {
        this.f13409u = z7;
        u0.b.c(this, z7 ? getMaterialThemeColorsTintList() : null);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // m.u, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.O = drawable;
        this.Q = false;
        a();
    }
}