package m;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x0 extends com.bumptech.glide.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14990g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14991h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ WeakReference f14992i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d1 f14993j;

    public x0(d1 d1Var, int i10, int i11, WeakReference weakReference) {
        this.f14993j = d1Var;
        this.f14990g = i10;
        this.f14991h = i11;
        this.f14992i = weakReference;
    }

    @Override // com.bumptech.glide.d
    public final void v(int i10) {
    }

    @Override // com.bumptech.glide.d
    public final void w(Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f14990g) != -1) {
            typeface = c1.a(typeface, i10, (this.f14991h & 2) != 0);
        }
        d1 d1Var = this.f14993j;
        if (d1Var.f14749m) {
            d1Var.f14748l = typeface;
            TextView textView = (TextView) this.f14992i.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new y0(d1Var, textView, typeface, d1Var.f14746j));
                } else {
                    textView.setTypeface(typeface, d1Var.f14746j);
                }
            }
        }
    }
}