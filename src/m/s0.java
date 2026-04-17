package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s0 extends m2 implements u0 {

    /* renamed from: g0, reason: collision with root package name */
    public CharSequence f14921g0;

    /* renamed from: h0, reason: collision with root package name */
    public ListAdapter f14922h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Rect f14923i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f14924j0;

    /* renamed from: k0, reason: collision with root package name */
    public final /* synthetic */ v0 f14925k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(v0 v0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130904129, 0);
        this.f14925k0 = v0Var;
        this.f14923i0 = new Rect();
        this.R = v0Var;
        this.f14840b0 = true;
        this.f14841c0.setFocusable(true);
        this.S = new g.h(1, this, v0Var);
    }

    @Override // m.u0
    public final void f(CharSequence charSequence) {
        this.f14921g0 = charSequence;
    }

    @Override // m.u0
    public final void i(int i10) {
        this.f14924j0 = i10;
    }

    @Override // m.u0
    public final void k(int i10, int i11) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewTreeObserver viewTreeObserver;
        f0 f0Var = this.f14841c0;
        boolean zIsShowing = f0Var.isShowing();
        s();
        this.f14841c0.setInputMethodMode(2);
        c();
        z1 z1Var = this.f14843f;
        z1Var.setChoiceMode(1);
        z1Var.setTextDirection(i10);
        z1Var.setTextAlignment(i11);
        v0 v0Var = this.f14925k0;
        int selectedItemPosition = v0Var.getSelectedItemPosition();
        z1 z1Var2 = this.f14843f;
        if (f0Var.isShowing() && z1Var2 != null) {
            z1Var2.setListSelectionHidden(false);
            z1Var2.setSelection(selectedItemPosition);
            if (z1Var2.getChoiceMode() != 0) {
                z1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = v0Var.getViewTreeObserver()) == null) {
            return;
        }
        l.e eVar = new l.e(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(eVar);
        this.f14841c0.setOnDismissListener(new r0(this, eVar));
    }

    @Override // m.u0
    public final CharSequence n() {
        return this.f14921g0;
    }

    @Override // m.m2, m.u0
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f14922h0 = listAdapter;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        int i10;
        int iMax;
        f0 f0Var = this.f14841c0;
        Drawable background = f0Var.getBackground();
        v0 v0Var = this.f14925k0;
        if (background != null) {
            background.getPadding(v0Var.f14962u);
            boolean z7 = w3.f14984a;
            int layoutDirection = v0Var.getLayoutDirection();
            Rect rect = v0Var.f14962u;
            i10 = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = v0Var.f14962u;
            rect2.right = 0;
            rect2.left = 0;
            i10 = 0;
        }
        int paddingLeft = v0Var.getPaddingLeft();
        int paddingRight = v0Var.getPaddingRight();
        int width = v0Var.getWidth();
        int i11 = v0Var.f14961t;
        if (i11 == -2) {
            int iA = v0Var.a((SpinnerAdapter) this.f14922h0, f0Var.getBackground());
            int i12 = v0Var.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = v0Var.f14962u;
            int i13 = (i12 - rect3.left) - rect3.right;
            if (iA > i13) {
                iA = i13;
            }
            iMax = Math.max(iA, (width - paddingLeft) - paddingRight);
        } else {
            if (i11 != -1) {
                r(i11);
                boolean z10 = w3.f14984a;
                this.f14846n = v0Var.getLayoutDirection() != 1 ? (((width - paddingRight) - this.f14845m) - this.f14924j0) + i10 : paddingLeft + this.f14924j0 + i10;
            }
            iMax = (width - paddingLeft) - paddingRight;
        }
        r(iMax);
        boolean z102 = w3.f14984a;
        this.f14846n = v0Var.getLayoutDirection() != 1 ? (((width - paddingRight) - this.f14845m) - this.f14924j0) + i10 : paddingLeft + this.f14924j0 + i10;
    }
}