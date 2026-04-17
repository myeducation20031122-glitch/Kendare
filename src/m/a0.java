package m;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f14704a;

    /* renamed from: b, reason: collision with root package name */
    public final g.u0 f14705b;

    public a0(TextView textView) {
        this.f14704a = textView;
        this.f14705b = new g.u0(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((v6.e) this.f14705b.f12903e).i(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f14704a.getContext().obtainStyledAttributes(attributeSet, f.a.f12632i, i10, 0);
        try {
            boolean z7 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z7);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z7) {
        ((v6.e) this.f14705b.f12903e).t(z7);
    }

    public final void d(boolean z7) {
        ((v6.e) this.f14705b.f12903e).w(z7);
    }
}