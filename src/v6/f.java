package v6;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public j f18418a;

    /* renamed from: b, reason: collision with root package name */
    public n6.a f18419b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f18420c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f18421d;

    /* renamed from: e, reason: collision with root package name */
    public final ColorStateList f18422e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f18423f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f18424g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f18425h;

    /* renamed from: i, reason: collision with root package name */
    public final float f18426i;

    /* renamed from: j, reason: collision with root package name */
    public float f18427j;

    /* renamed from: k, reason: collision with root package name */
    public float f18428k;

    /* renamed from: l, reason: collision with root package name */
    public int f18429l;

    /* renamed from: m, reason: collision with root package name */
    public float f18430m;

    /* renamed from: n, reason: collision with root package name */
    public float f18431n;

    /* renamed from: o, reason: collision with root package name */
    public final float f18432o;

    /* renamed from: p, reason: collision with root package name */
    public final int f18433p;

    /* renamed from: q, reason: collision with root package name */
    public int f18434q;

    /* renamed from: r, reason: collision with root package name */
    public int f18435r;

    /* renamed from: s, reason: collision with root package name */
    public final int f18436s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f18437t;

    /* renamed from: u, reason: collision with root package name */
    public final Paint.Style f18438u;

    public f(f fVar) {
        this.f18420c = null;
        this.f18421d = null;
        this.f18422e = null;
        this.f18423f = null;
        this.f18424g = PorterDuff.Mode.SRC_IN;
        this.f18425h = null;
        this.f18426i = 1.0f;
        this.f18427j = 1.0f;
        this.f18429l = 255;
        this.f18430m = 0.0f;
        this.f18431n = 0.0f;
        this.f18432o = 0.0f;
        this.f18433p = 0;
        this.f18434q = 0;
        this.f18435r = 0;
        this.f18436s = 0;
        this.f18437t = false;
        this.f18438u = Paint.Style.FILL_AND_STROKE;
        this.f18418a = fVar.f18418a;
        this.f18419b = fVar.f18419b;
        this.f18428k = fVar.f18428k;
        this.f18420c = fVar.f18420c;
        this.f18421d = fVar.f18421d;
        this.f18424g = fVar.f18424g;
        this.f18423f = fVar.f18423f;
        this.f18429l = fVar.f18429l;
        this.f18426i = fVar.f18426i;
        this.f18435r = fVar.f18435r;
        this.f18433p = fVar.f18433p;
        this.f18437t = fVar.f18437t;
        this.f18427j = fVar.f18427j;
        this.f18430m = fVar.f18430m;
        this.f18431n = fVar.f18431n;
        this.f18432o = fVar.f18432o;
        this.f18434q = fVar.f18434q;
        this.f18436s = fVar.f18436s;
        this.f18422e = fVar.f18422e;
        this.f18438u = fVar.f18438u;
        if (fVar.f18425h != null) {
            this.f18425h = new Rect(fVar.f18425h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f18444m = true;
        return gVar;
    }

    public f(j jVar) {
        this.f18420c = null;
        this.f18421d = null;
        this.f18422e = null;
        this.f18423f = null;
        this.f18424g = PorterDuff.Mode.SRC_IN;
        this.f18425h = null;
        this.f18426i = 1.0f;
        this.f18427j = 1.0f;
        this.f18429l = 255;
        this.f18430m = 0.0f;
        this.f18431n = 0.0f;
        this.f18432o = 0.0f;
        this.f18433p = 0;
        this.f18434q = 0;
        this.f18435r = 0;
        this.f18436s = 0;
        this.f18437t = false;
        this.f18438u = Paint.Style.FILL_AND_STROKE;
        this.f18418a = jVar;
        this.f18419b = null;
    }
}