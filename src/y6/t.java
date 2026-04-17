package y6;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;
import o0.c1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f19378a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f19379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f19380c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context, int i10, String[] strArr) {
        super(context, i10, strArr);
        this.f19380c = uVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        u uVar = this.f19380c;
        ColorStateList colorStateList2 = uVar.O;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f19379b = colorStateList;
        if (uVar.N != 0 && uVar.O != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{h0.a.b(uVar.O.getColorForState(iArr3, 0), uVar.N), h0.a.b(uVar.O.getColorForState(iArr2, 0), uVar.N), uVar.N});
        }
        this.f19378a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            u uVar = this.f19380c;
            Drawable rippleDrawable = null;
            if (uVar.getText().toString().contentEquals(textView.getText()) && uVar.N != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(uVar.N);
                if (this.f19379b != null) {
                    i0.a.h(colorDrawable, this.f19378a);
                    rippleDrawable = new RippleDrawable(this.f19379b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = c1.f15515a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}