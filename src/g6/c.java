package g6;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import o0.c1;
import t5.j4;
import v6.f;
import v6.g;
import v6.j;
import v6.u;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: u, reason: collision with root package name */
    public static final boolean f13052u;

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f13053v;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f13054a;

    /* renamed from: b, reason: collision with root package name */
    public j f13055b;

    /* renamed from: c, reason: collision with root package name */
    public int f13056c;

    /* renamed from: d, reason: collision with root package name */
    public int f13057d;

    /* renamed from: e, reason: collision with root package name */
    public int f13058e;

    /* renamed from: f, reason: collision with root package name */
    public int f13059f;

    /* renamed from: g, reason: collision with root package name */
    public int f13060g;

    /* renamed from: h, reason: collision with root package name */
    public int f13061h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f13062i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f13063j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f13064k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f13065l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f13066m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13070q;

    /* renamed from: s, reason: collision with root package name */
    public LayerDrawable f13072s;

    /* renamed from: t, reason: collision with root package name */
    public int f13073t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13067n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13068o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13069p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13071r = true;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f13052u = true;
        f13053v = i10 <= 22;
    }

    public c(MaterialButton materialButton, j jVar) {
        this.f13054a = materialButton;
        this.f13055b = jVar;
    }

    public final u a() {
        LayerDrawable layerDrawable = this.f13072s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (u) (this.f13072s.getNumberOfLayers() > 2 ? this.f13072s.getDrawable(2) : this.f13072s.getDrawable(1));
    }

    public final g b(boolean z7) {
        LayerDrawable layerDrawable = this.f13072s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) (f13052u ? (LayerDrawable) ((InsetDrawable) this.f13072s.getDrawable(0)).getDrawable() : this.f13072s).getDrawable(!z7 ? 1 : 0);
    }

    public final void c(j jVar) {
        this.f13055b = jVar;
        if (!f13053v || this.f13068o) {
            if (b(false) != null) {
                b(false).setShapeAppearanceModel(jVar);
            }
            if (b(true) != null) {
                b(true).setShapeAppearanceModel(jVar);
            }
            if (a() != null) {
                a().setShapeAppearanceModel(jVar);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = c1.f15515a;
        MaterialButton materialButton = this.f13054a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        e();
        materialButton.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    public final void d(int i10, int i11) {
        WeakHashMap weakHashMap = c1.f15515a;
        MaterialButton materialButton = this.f13054a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f13058e;
        int i13 = this.f13059f;
        this.f13059f = i11;
        this.f13058e = i10;
        if (!this.f13068o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    public final void e() {
        InsetDrawable insetDrawable;
        g gVar = new g(this.f13055b);
        MaterialButton materialButton = this.f13054a;
        gVar.j(materialButton.getContext());
        i0.a.h(gVar, this.f13063j);
        PorterDuff.Mode mode = this.f13062i;
        if (mode != null) {
            i0.a.i(gVar, mode);
        }
        float f10 = this.f13061h;
        ColorStateList colorStateList = this.f13064k;
        gVar.f18440b.f18428k = f10;
        gVar.invalidateSelf();
        f fVar = gVar.f18440b;
        if (fVar.f18421d != colorStateList) {
            fVar.f18421d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f13055b);
        gVar2.setTint(0);
        float f11 = this.f13061h;
        int iL = this.f13067n ? j4.l(materialButton, 2130903356) : 0;
        gVar2.f18440b.f18428k = f11;
        gVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iL);
        f fVar2 = gVar2.f18440b;
        if (fVar2.f18421d != colorStateListValueOf) {
            fVar2.f18421d = colorStateListValueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        if (f13052u) {
            g gVar3 = new g(this.f13055b);
            this.f13066m = gVar3;
            i0.a.g(gVar3, -1);
            ?? rippleDrawable = new RippleDrawable(t6.d.b(this.f13065l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f13056c, this.f13058e, this.f13057d, this.f13059f), this.f13066m);
            this.f13072s = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            g gVar4 = new g(this.f13055b);
            t6.a aVar = new t6.a();
            aVar.f17727a = gVar4;
            aVar.f17728b = false;
            t6.b bVar = new t6.b(aVar);
            this.f13066m = bVar;
            i0.a.h(bVar, t6.d.b(this.f13065l));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f13066m});
            this.f13072s = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.f13056c, this.f13058e, this.f13057d, this.f13059f);
        }
        materialButton.setInternalBackground(insetDrawable);
        g gVarB = b(false);
        if (gVarB != null) {
            gVarB.k(this.f13073t);
            gVarB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g gVarB = b(false);
        g gVarB2 = b(true);
        if (gVarB != null) {
            float f10 = this.f13061h;
            ColorStateList colorStateList = this.f13064k;
            gVarB.f18440b.f18428k = f10;
            gVarB.invalidateSelf();
            f fVar = gVarB.f18440b;
            if (fVar.f18421d != colorStateList) {
                fVar.f18421d = colorStateList;
                gVarB.onStateChange(gVarB.getState());
            }
            if (gVarB2 != null) {
                float f11 = this.f13061h;
                int iL = this.f13067n ? j4.l(this.f13054a, 2130903356) : 0;
                gVarB2.f18440b.f18428k = f11;
                gVarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iL);
                f fVar2 = gVarB2.f18440b;
                if (fVar2.f18421d != colorStateListValueOf) {
                    fVar2.f18421d = colorStateListValueOf;
                    gVarB2.onStateChange(gVarB2.getState());
                }
            }
        }
    }
}