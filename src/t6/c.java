package t6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import com.bumptech.glide.e;
import f0.f;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c {
    private static Drawable b(Context context, int i10) {
        ColorStateList colorStateListC;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i10, i10, i10, i10);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
        TypedValue typedValueI = e.I(context, 2130903315);
        if (typedValueI != null) {
            int i11 = typedValueI.resourceId;
            colorStateListC = i11 != 0 ? f.c(context, i11) : ColorStateList.valueOf(typedValueI.data);
        } else {
            colorStateListC = null;
        }
        if (colorStateListC != null) {
            colorStateListValueOf = colorStateListC;
        }
        return new RippleDrawable(colorStateListValueOf, null, insetDrawable);
    }
}