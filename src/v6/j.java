package v6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public c4.c f18450a = new i();

    /* renamed from: b, reason: collision with root package name */
    public c4.c f18451b = new i();

    /* renamed from: c, reason: collision with root package name */
    public c4.c f18452c = new i();

    /* renamed from: d, reason: collision with root package name */
    public c4.c f18453d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f18454e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f18455f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f18456g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public c f18457h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public e f18458i = j4.g();

    /* renamed from: j, reason: collision with root package name */
    public e f18459j = j4.g();

    /* renamed from: k, reason: collision with root package name */
    public e f18460k = j4.g();

    /* renamed from: l, reason: collision with root package name */
    public e f18461l = j4.g();

    public static q3.l a(Context context, int i10, int i11, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(y5.a.B);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(3, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(4, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(2, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(1, i12);
            c cVarC = c(typedArrayObtainStyledAttributes, 5, aVar);
            c cVarC2 = c(typedArrayObtainStyledAttributes, 8, cVarC);
            c cVarC3 = c(typedArrayObtainStyledAttributes, 9, cVarC);
            c cVarC4 = c(typedArrayObtainStyledAttributes, 7, cVarC);
            c cVarC5 = c(typedArrayObtainStyledAttributes, 6, cVarC);
            q3.l lVar = new q3.l(1);
            c4.c cVarF = j4.f(i13);
            lVar.f16188a = cVarF;
            q3.l.b(cVarF);
            lVar.f16192e = cVarC2;
            c4.c cVarF2 = j4.f(i14);
            lVar.f16189b = cVarF2;
            q3.l.b(cVarF2);
            lVar.f16193f = cVarC3;
            c4.c cVarF3 = j4.f(i15);
            lVar.f16190c = cVarF3;
            q3.l.b(cVarF3);
            lVar.f16194g = cVarC4;
            c4.c cVarF4 = j4.f(i16);
            lVar.f16191d = cVarF4;
            q3.l.b(cVarF4);
            lVar.f16195h = cVarC5;
            return lVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static q3.l b(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y5.a.f19283t, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i10, c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue == null) {
            return cVar;
        }
        int i11 = typedValuePeekValue.type;
        return i11 == 5 ? new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i11 == 6 ? new h(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z7 = this.f18461l.getClass().equals(e.class) && this.f18459j.getClass().equals(e.class) && this.f18458i.getClass().equals(e.class) && this.f18460k.getClass().equals(e.class);
        float fA = this.f18454e.a(rectF);
        return z7 && ((this.f18455f.a(rectF) > fA ? 1 : (this.f18455f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f18457h.a(rectF) > fA ? 1 : (this.f18457h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f18456g.a(rectF) > fA ? 1 : (this.f18456g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f18451b instanceof i) && (this.f18450a instanceof i) && (this.f18452c instanceof i) && (this.f18453d instanceof i));
    }

    public final q3.l e() {
        q3.l lVar = new q3.l();
        lVar.f16188a = new i();
        lVar.f16189b = new i();
        lVar.f16190c = new i();
        lVar.f16191d = new i();
        lVar.f16192e = new a(0.0f);
        lVar.f16193f = new a(0.0f);
        lVar.f16194g = new a(0.0f);
        lVar.f16195h = new a(0.0f);
        lVar.f16196i = j4.g();
        lVar.f16197j = j4.g();
        lVar.f16198k = j4.g();
        lVar.f16188a = this.f18450a;
        lVar.f16189b = this.f18451b;
        lVar.f16190c = this.f18452c;
        lVar.f16191d = this.f18453d;
        lVar.f16192e = this.f18454e;
        lVar.f16193f = this.f18455f;
        lVar.f16194g = this.f18456g;
        lVar.f16195h = this.f18457h;
        lVar.f16196i = this.f18458i;
        lVar.f16197j = this.f18459j;
        lVar.f16198k = this.f18460k;
        lVar.f16199l = this.f18461l;
        return lVar;
    }
}