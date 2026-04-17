package c0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public b f2016a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2017b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2018c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2019d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2020e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2021f;

    /* renamed from: g, reason: collision with root package name */
    public int f2022g;

    /* renamed from: h, reason: collision with root package name */
    public int f2023h;

    /* renamed from: i, reason: collision with root package name */
    public int f2024i;

    /* renamed from: j, reason: collision with root package name */
    public int f2025j;

    /* renamed from: k, reason: collision with root package name */
    public View f2026k;

    /* renamed from: l, reason: collision with root package name */
    public View f2027l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2028m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2029n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2030o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2031p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f2032q;

    public e() {
        super(-2, -2);
        this.f2017b = false;
        this.f2018c = 0;
        this.f2019d = 0;
        this.f2020e = -1;
        this.f2021f = -1;
        this.f2022g = 0;
        this.f2023h = 0;
        this.f2032q = new Rect();
    }

    public final boolean a(int i10) {
        if (i10 == 0) {
            return this.f2029n;
        }
        if (i10 != 1) {
            return false;
        }
        return this.f2030o;
    }

    public final void b(b bVar) {
        b bVar2 = this.f2016a;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.f();
            }
            this.f2016a = bVar;
            this.f2017b = true;
            if (bVar != null) {
                bVar.c(this);
            }
        }
    }

    public e(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        b bVar;
        super(context, attributeSet);
        this.f2017b = false;
        this.f2018c = 0;
        this.f2019d = 0;
        this.f2020e = -1;
        this.f2021f = -1;
        this.f2022g = 0;
        this.f2023h = 0;
        this.f2032q = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b0.a.f1826b);
        this.f2018c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f2021f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f2019d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f2020e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f2022g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f2023h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f2017b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.W;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.W;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f780b0;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f779a0);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e10) {
                    throw new RuntimeException(a0.h.v("Could not inflate Behavior subclass ", string), e10);
                }
            }
            this.f2016a = bVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        b bVar2 = this.f2016a;
        if (bVar2 != null) {
            bVar2.c(this);
        }
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2017b = false;
        this.f2018c = 0;
        this.f2019d = 0;
        this.f2020e = -1;
        this.f2021f = -1;
        this.f2022g = 0;
        this.f2023h = 0;
        this.f2032q = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2017b = false;
        this.f2018c = 0;
        this.f2019d = 0;
        this.f2020e = -1;
        this.f2021f = -1;
        this.f2022g = 0;
        this.f2023h = 0;
        this.f2032q = new Rect();
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f2017b = false;
        this.f2018c = 0;
        this.f2019d = 0;
        this.f2020e = -1;
        this.f2021f = -1;
        this.f2022g = 0;
        this.f2023h = 0;
        this.f2032q = new Rect();
    }
}