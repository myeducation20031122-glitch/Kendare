package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v2 {

    /* renamed from: i, reason: collision with root package name */
    public static v2 f14968i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f14970a;

    /* renamed from: b, reason: collision with root package name */
    public t.k f14971b;

    /* renamed from: c, reason: collision with root package name */
    public t.l f14972c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f14973d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f14974e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14975f;

    /* renamed from: g, reason: collision with root package name */
    public v7.b f14976g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f14967h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    public static final t2 f14969j = new t2(6);

    public static synchronized v2 d() {
        try {
            if (f14968i == null) {
                v2 v2Var = new v2();
                f14968i = v2Var;
                j(v2Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14968i;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        t2 t2Var = f14969j;
        t2Var.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) t2Var.b(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(v2 v2Var) {
        if (Build.VERSION.SDK_INT < 24) {
            v2Var.a("vector", new s2(3));
            v2Var.a("animated-vector", new s2(1));
            v2Var.a("animated-selector", new s2(0));
            v2Var.a("drawable", new s2(2));
        }
    }

    public final void a(String str, s2 s2Var) {
        if (this.f14971b == null) {
            this.f14971b = new t.k();
        }
        this.f14971b.put(str, s2Var);
    }

    public final synchronized void b(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                t.e eVar = (t.e) this.f14973d.get(context);
                if (eVar == null) {
                    eVar = new t.e();
                    this.f14973d.put(context, eVar);
                }
                eVar.i(j10, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i10) throws Resources.NotFoundException {
        int i11;
        if (this.f14974e == null) {
            this.f14974e = new TypedValue();
        }
        TypedValue typedValue = this.f14974e;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableE = e(context, j10);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableF = null;
        if (this.f14976g != null) {
            if (i10 == 2131165240) {
                layerDrawableF = new LayerDrawable(new Drawable[]{f(context, 2131165239), f(context, 2131165241)});
            } else {
                if (i10 == 2131165275) {
                    i11 = 2131099707;
                } else if (i10 == 2131165274) {
                    i11 = 2131099708;
                } else if (i10 == 2131165276) {
                    i11 = 2131099709;
                }
                layerDrawableF = v7.b.f(this, context, i11);
            }
        }
        if (layerDrawableF != null) {
            layerDrawableF.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j10, layerDrawableF);
        }
        return layerDrawableF;
    }

    public final synchronized Drawable e(Context context, long j10) {
        t.e eVar = (t.e) this.f14973d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) eVar.f(j10, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            eVar.j(j10);
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i10) {
        return g(context, i10, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Drawable g(Context context, int i10, boolean z7) {
        Drawable drawableB;
        PorterDuff.Mode mode;
        Drawable drawableFindDrawableByLayerId;
        int iC;
        int next;
        try {
            if (!this.f14975f) {
                this.f14975f = true;
                Drawable drawableF = f(context, 2131165302);
                if (drawableF == null || (!(drawableF instanceof u1.p) && !"android.graphics.drawable.VectorDrawable".equals(drawableF.getClass().getName()))) {
                    this.f14975f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            t.k kVar = this.f14971b;
            Drawable drawable = null;
            mode = null;
            PorterDuff.Mode mode2 = null;
            if (kVar == null || kVar.isEmpty()) {
                drawableB = null;
            } else {
                t.l lVar = this.f14972c;
                if (lVar != null) {
                    String str = (String) lVar.d(i10, null);
                    if ("appcompat_skip_skip".equals(str) || (str != null && this.f14971b.getOrDefault(str, null) == null)) {
                    }
                } else {
                    this.f14972c = new t.l();
                }
                if (this.f14974e == null) {
                    this.f14974e = new TypedValue();
                }
                TypedValue typedValue = this.f14974e;
                Resources resources = context.getResources();
                resources.getValue(i10, typedValue, true);
                long j10 = (typedValue.assetCookie << 32) | typedValue.data;
                drawableB = e(context, j10);
                if (drawableB == null) {
                    CharSequence charSequence = typedValue.string;
                    if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                        try {
                            XmlResourceParser xml = resources.getXml(i10);
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
                            String name = xml.getName();
                            this.f14972c.b(i10, name);
                            u2 u2Var = (u2) this.f14971b.getOrDefault(name, null);
                            if (u2Var != null) {
                                drawableB = ((s2) u2Var).a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                            }
                            if (drawableB != null) {
                                drawableB.setChangingConfigurations(typedValue.changingConfigurations);
                                b(context, j10, drawableB);
                            }
                        } catch (Exception e10) {
                            Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
                        }
                    }
                    if (drawableB == null) {
                        this.f14972c.b(i10, "appcompat_skip_skip");
                    }
                }
            }
            if (drawableB == null) {
                drawableB = c(context, i10);
            }
            if (drawableB == null) {
                Object obj = f0.f.f12651a;
                drawableB = f0.a.b(context, i10);
            }
            if (drawableB != null) {
                ColorStateList colorStateListI = i(context, i10);
                if (colorStateListI != null) {
                    Drawable drawableP = fc.t.P(drawableB.mutate());
                    i0.a.h(drawableP, colorStateListI);
                    if (this.f14976g != null && i10 == 2131165289) {
                        mode2 = PorterDuff.Mode.MULTIPLY;
                    }
                    if (mode2 != null) {
                        i0.a.i(drawableP, mode2);
                    }
                    drawable = drawableP;
                } else if (this.f14976g != null) {
                    if (i10 == 2131165284) {
                        LayerDrawable layerDrawable = (LayerDrawable) drawableB;
                        Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.background);
                        int iC2 = d3.c(context, 2130903316);
                        mode = x.f14987b;
                        v7.b.m(drawableFindDrawableByLayerId2, iC2, mode);
                        v7.b.m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), d3.c(context, 2130903316), mode);
                        drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
                        iC = d3.c(context, 2130903314);
                    } else {
                        if (i10 == 2131165275 || i10 == 2131165274 || i10 == 2131165276) {
                            LayerDrawable layerDrawable2 = (LayerDrawable) drawableB;
                            Drawable drawableFindDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.background);
                            int iB = d3.b(context, 2130903316);
                            mode = x.f14987b;
                            v7.b.m(drawableFindDrawableByLayerId3, iB, mode);
                            v7.b.m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), d3.c(context, 2130903314), mode);
                            drawableFindDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.progress);
                            iC = d3.c(context, 2130903314);
                        }
                        if (!m(context, i10, drawableB)) {
                            drawable = drawableB;
                        }
                    }
                    v7.b.m(drawableFindDrawableByLayerId, iC, mode);
                    drawable = drawableB;
                } else if (!m(context, i10, drawableB) || !z7) {
                    drawable = drawableB;
                }
                drawableB = drawable;
            }
            if (drawableB != null) {
                t1.a(drawableB);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableB;
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList colorStateList;
        t.l lVar;
        WeakHashMap weakHashMap = this.f14970a;
        ColorStateList colorStateListH = null;
        colorStateList = (weakHashMap == null || (lVar = (t.l) weakHashMap.get(context)) == null) ? null : (ColorStateList) lVar.d(i10, null);
        if (colorStateList == null) {
            v7.b bVar = this.f14976g;
            if (bVar != null) {
                colorStateListH = bVar.h(context, i10);
            }
            if (colorStateListH != null) {
                if (this.f14970a == null) {
                    this.f14970a = new WeakHashMap();
                }
                t.l lVar2 = (t.l) this.f14970a.get(context);
                if (lVar2 == null) {
                    lVar2 = new t.l();
                    this.f14970a.put(context, lVar2);
                }
                lVar2.b(i10, colorStateListH);
            }
            colorStateList = colorStateListH;
        }
        return colorStateList;
    }

    public final synchronized void k(Context context) {
        t.e eVar = (t.e) this.f14973d.get(context);
        if (eVar != null) {
            eVar.c();
        }
    }

    public final synchronized void l(v7.b bVar) {
        this.f14976g = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(Context context, int i10, Drawable drawable) {
        int i11;
        int iRound;
        boolean z7;
        PorterDuffColorFilter porterDuffColorFilterH;
        v7.b bVar = this.f14976g;
        if (bVar == null) {
            return false;
        }
        PorterDuff.Mode mode = x.f14987b;
        if (v7.b.a((int[]) bVar.f18509b, i10)) {
            i11 = 2130903316;
        } else if (v7.b.a((int[]) bVar.f18511f, i10)) {
            i11 = 2130903314;
        } else {
            if (v7.b.a((int[]) bVar.f18512j, i10)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else {
                if (i10 == 2131165261) {
                    iRound = Math.round(40.8f);
                    i11 = R.attr.colorForeground;
                    z7 = true;
                    if (!z7) {
                        return false;
                    }
                    Drawable drawableMutate = drawable.mutate();
                    int iC = d3.c(context, i11);
                    synchronized (x.class) {
                        porterDuffColorFilterH = h(iC, mode);
                    }
                    drawableMutate.setColorFilter(porterDuffColorFilterH);
                    if (iRound != -1) {
                        drawableMutate.setAlpha(iRound);
                    }
                    return true;
                }
                if (i10 != 2131165243) {
                    i11 = 0;
                    iRound = -1;
                    z7 = false;
                    if (!z7) {
                    }
                }
            }
            i11 = R.attr.colorBackground;
        }
        iRound = -1;
        z7 = true;
        if (!z7) {
        }
    }
}