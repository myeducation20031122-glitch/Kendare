package f3;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import e3.g;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final View f12668b;

    /* renamed from: e, reason: collision with root package name */
    public final f f12669e;

    /* renamed from: f, reason: collision with root package name */
    public Animatable f12670f;

    public c(ImageView imageView) {
        if (imageView == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f12668b = imageView;
        this.f12669e = new f(imageView);
    }

    @Override // f3.e
    public final void a(d dVar) {
        f fVar = this.f12669e;
        View view = fVar.f12672a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = fVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        View view2 = fVar.f12672a;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        int iA2 = fVar.a(view2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            ((g) dVar).n(iA, iA2);
            return;
        }
        ArrayList arrayList = fVar.f12673b;
        if (!arrayList.contains(dVar)) {
            arrayList.add(dVar);
        }
        if (fVar.f12674c == null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            c0.f fVar2 = new c0.f(fVar);
            fVar.f12674c = fVar2;
            viewTreeObserver.addOnPreDrawListener(fVar2);
        }
    }

    @Override // f3.e
    public final void b(Drawable drawable) {
        k(null);
        ((ImageView) this.f12668b).setImageDrawable(drawable);
    }

    @Override // f3.e
    public final void c(e3.c cVar) {
        this.f12668b.setTag(2131296548, cVar);
    }

    @Override // com.bumptech.glide.manager.h
    public final void d() {
        Animatable animatable = this.f12670f;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // f3.e
    public final void e(d dVar) {
        this.f12669e.f12673b.remove(dVar);
    }

    @Override // f3.e
    public final void f(Drawable drawable) {
        k(null);
        ((ImageView) this.f12668b).setImageDrawable(drawable);
    }

    @Override // f3.e
    public final e3.c g() {
        Object tag = this.f12668b.getTag(2131296548);
        if (tag == null) {
            return null;
        }
        if (tag instanceof e3.c) {
            return (e3.c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // f3.e
    public final void h(Drawable drawable) {
        f fVar = this.f12669e;
        ViewTreeObserver viewTreeObserver = fVar.f12672a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(fVar.f12674c);
        }
        fVar.f12674c = null;
        fVar.f12673b.clear();
        Animatable animatable = this.f12670f;
        if (animatable != null) {
            animatable.stop();
        }
        k(null);
        ((ImageView) this.f12668b).setImageDrawable(drawable);
    }

    @Override // f3.e
    public final void i(Object obj) {
        k(obj);
    }

    @Override // com.bumptech.glide.manager.h
    public final void j() {
        Animatable animatable = this.f12670f;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void k(Object obj) {
        b bVar = (b) this;
        int i10 = bVar.f12667j;
        View view = bVar.f12668b;
        switch (i10) {
            case 0:
                ((ImageView) view).setImageBitmap((Bitmap) obj);
                break;
            default:
                ((ImageView) view).setImageDrawable((Drawable) obj);
                break;
        }
        if (!(obj instanceof Animatable)) {
            this.f12670f = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f12670f = animatable;
        animatable.start();
    }

    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "Target for: " + this.f12668b;
    }
}