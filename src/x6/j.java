package x6;

import a5.x;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.List;
import java.util.WeakHashMap;
import o0.c1;
import o0.q0;
import s2.h0;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f19063a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19064b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19065c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f19066d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f19067e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f19068f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f19069g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f19070h;

    /* renamed from: i, reason: collision with root package name */
    public final i f19071i;

    /* renamed from: j, reason: collision with root package name */
    public final k f19072j;

    /* renamed from: k, reason: collision with root package name */
    public int f19073k;

    /* renamed from: m, reason: collision with root package name */
    public int f19075m;

    /* renamed from: n, reason: collision with root package name */
    public int f19076n;

    /* renamed from: o, reason: collision with root package name */
    public int f19077o;

    /* renamed from: p, reason: collision with root package name */
    public int f19078p;

    /* renamed from: q, reason: collision with root package name */
    public int f19079q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f19080r;

    /* renamed from: s, reason: collision with root package name */
    public final AccessibilityManager f19081s;

    /* renamed from: u, reason: collision with root package name */
    public static final d1.b f19057u = z5.a.f19747b;

    /* renamed from: v, reason: collision with root package name */
    public static final LinearInterpolator f19058v = z5.a.f19746a;

    /* renamed from: w, reason: collision with root package name */
    public static final d1.c f19059w = z5.a.f19749d;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f19061y = {2130904124};

    /* renamed from: z, reason: collision with root package name */
    public static final String f19062z = j.class.getSimpleName();

    /* renamed from: x, reason: collision with root package name */
    public static final Handler f19060x = new Handler(Looper.getMainLooper(), new h0(1));

    /* renamed from: l, reason: collision with root package name */
    public final f f19074l = new f(this, 0);

    /* renamed from: t, reason: collision with root package name */
    public final g f19082t = new g(this);

    public j(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout2 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f19069g = viewGroup;
        this.f19072j = snackbarContentLayout2;
        this.f19070h = context;
        p6.n.c(context, p6.n.f16059a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f19061y);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        i iVar = (i) layoutInflaterFrom.inflate(resourceId != -1 ? 2131492982 : 2131492910, viewGroup, false);
        this.f19071i = iVar;
        iVar.setBaseTransientBottomBar(this);
        float actionTextColorAlpha = iVar.getActionTextColorAlpha();
        if (actionTextColorAlpha != 1.0f) {
            snackbarContentLayout.f11532e.setTextColor(j4.F(j4.l(snackbarContentLayout, 2130903356), actionTextColorAlpha, snackbarContentLayout.f11532e.getCurrentTextColor()));
        }
        snackbarContentLayout.setMaxInlineActionWidth(iVar.getMaxInlineActionWidth());
        iVar.addView(snackbarContentLayout);
        WeakHashMap weakHashMap = c1.f15515a;
        iVar.setAccessibilityLiveRegion(1);
        iVar.setImportantForAccessibility(1);
        iVar.setFitsSystemWindows(true);
        q0.u(iVar, new x(this, 9));
        c1.r(iVar, new w1.e(this, 4));
        this.f19081s = (AccessibilityManager) context.getSystemService("accessibility");
        this.f19065c = j4.L(context, 2130903916, 250);
        this.f19063a = j4.L(context, 2130903916, 150);
        this.f19064b = j4.L(context, 2130903919, 75);
        this.f19066d = j4.M(context, 2130903932, f19058v);
        this.f19068f = j4.M(context, 2130903932, f19059w);
        this.f19067e = j4.M(context, 2130903932, f19057u);
    }

    public final void a(int i10) {
        n nVar;
        o oVarB = o.b();
        g gVar = this.f19082t;
        synchronized (oVarB.f19090a) {
            try {
                if (oVarB.c(gVar)) {
                    nVar = oVarB.f19092c;
                } else {
                    n nVar2 = oVarB.f19093d;
                    if (nVar2 != null && gVar != null && nVar2.f19086a.get() == gVar) {
                        nVar = oVarB.f19093d;
                    }
                }
                oVarB.a(nVar, i10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        o oVarB = o.b();
        g gVar = this.f19082t;
        synchronized (oVarB.f19090a) {
            try {
                if (oVarB.c(gVar)) {
                    oVarB.f19092c = null;
                    if (oVarB.f19093d != null) {
                        oVarB.g();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.f19071i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f19071i);
        }
    }

    public final void c() {
        o oVarB = o.b();
        g gVar = this.f19082t;
        synchronized (oVarB.f19090a) {
            try {
                if (oVarB.c(gVar)) {
                    oVarB.f(oVarB.f19092c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z7 = true;
        AccessibilityManager accessibilityManager = this.f19081s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z7 = false;
        }
        i iVar = this.f19071i;
        if (z7) {
            iVar.post(new f(this, 2));
            return;
        }
        if (iVar.getParent() != null) {
            iVar.setVisibility(0);
        }
        c();
    }

    public final void e() {
        i iVar = this.f19071i;
        ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
        boolean z7 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = f19062z;
        if (!z7) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (iVar.M == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (iVar.getParent() == null) {
            return;
        }
        int i10 = this.f19075m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = iVar.M;
        int i11 = rect.bottom + i10;
        int i12 = rect.left + this.f19076n;
        int i13 = rect.right + this.f19077o;
        int i14 = rect.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13 && marginLayoutParams.topMargin == i14) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i11;
            marginLayoutParams.leftMargin = i12;
            marginLayoutParams.rightMargin = i13;
            marginLayoutParams.topMargin = i14;
            iVar.requestLayout();
        }
        if ((z10 || this.f19079q != this.f19078p) && Build.VERSION.SDK_INT >= 29 && this.f19078p > 0) {
            ViewGroup.LayoutParams layoutParams2 = iVar.getLayoutParams();
            if ((layoutParams2 instanceof c0.e) && (((c0.e) layoutParams2).f2016a instanceof SwipeDismissBehavior)) {
                f fVar = this.f19074l;
                iVar.removeCallbacks(fVar);
                iVar.post(fVar);
            }
        }
    }
}