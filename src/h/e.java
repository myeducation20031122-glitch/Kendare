package h;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import m.v2;
import org.xmlpull.v1.XmlPullParserException;
import u1.p;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends k implements i0.g {
    public b S;
    public com.bumptech.glide.d T;
    public int U;
    public int V;
    public boolean W;

    public e(b bVar, Resources resources) {
        this.f13136m = 255;
        this.f13138t = -1;
        this.U = -1;
        this.V = -1;
        d(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0276, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e e(Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlResourceParser xmlResourceParser) throws Throwable {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        e eVar = new e(null, null);
        TypedArray typedArrayX = g5.a.x(resources2, theme2, attributeSet, i.b.f13214a);
        int i10 = 1;
        eVar.setVisible(typedArrayX.getBoolean(1, true), true);
        b bVar = eVar.S;
        bVar.f13109d |= i.a.b(typedArrayX);
        int i11 = 2;
        bVar.f13114i = typedArrayX.getBoolean(2, bVar.f13114i);
        int i12 = 3;
        bVar.f13117l = typedArrayX.getBoolean(3, bVar.f13117l);
        bVar.f13130y = typedArrayX.getInt(4, bVar.f13130y);
        bVar.f13131z = typedArrayX.getInt(5, bVar.f13131z);
        boolean z7 = false;
        eVar.setDither(typedArrayX.getBoolean(0, bVar.f13128w));
        g gVar = eVar.f13132b;
        if (resources2 != null) {
            gVar.f13107b = resources2;
            int i13 = resources.getDisplayMetrics().densityDpi;
            if (i13 == 0) {
                i13 = 160;
            }
            int i14 = gVar.f13108c;
            gVar.f13108c = i13;
            if (i14 != i13) {
                gVar.f13118m = false;
                gVar.f13115j = false;
            }
        } else {
            gVar.getClass();
        }
        typedArrayX.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i10 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i12)) {
                break;
            }
            if (next3 == i11 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArrayX2 = g5.a.x(resources2, theme2, attributeSet, i.b.f13215b);
                    int resourceId = typedArrayX2.getResourceId(z7 ? 1 : 0, z7 ? 1 : 0);
                    int resourceId2 = typedArrayX2.getResourceId(i10, -1);
                    Drawable drawableF = resourceId2 > 0 ? v2.d().f(context2, resourceId2) : null;
                    typedArrayX2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i15 = 0;
                    for (int i16 = 0; i16 < attributeCount; i16++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i16);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i17 = i15 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i16, z7)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i15] = attributeNameResource;
                            i15 = i17;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i15);
                    if (drawableF == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            drawableF = new p();
                            drawableF.inflate(resources2, xmlResourceParser, attributeSet, theme2);
                        } else {
                            drawableF = i.a.a(resources2, xmlResourceParser, attributeSet, theme2);
                        }
                    }
                    if (drawableF == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    b bVar2 = eVar.S;
                    int iA = bVar2.a(drawableF);
                    bVar2.H[iA] = iArrTrimStateSet;
                    bVar2.J.e(iA, Integer.valueOf(resourceId));
                } else if (xmlResourceParser.getName().equals("transition")) {
                    TypedArray typedArrayX3 = g5.a.x(resources2, theme2, attributeSet, i.b.f13216c);
                    int resourceId3 = typedArrayX3.getResourceId(2, -1);
                    int resourceId4 = typedArrayX3.getResourceId(1, -1);
                    int resourceId5 = typedArrayX3.getResourceId(z7 ? 1 : 0, -1);
                    Drawable drawableF2 = resourceId5 > 0 ? v2.d().f(context2, resourceId5) : null;
                    boolean z10 = typedArrayX3.getBoolean(3, z7);
                    typedArrayX3.recycle();
                    if (drawableF2 == null) {
                        do {
                            next = xmlResourceParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("animated-vector")) {
                            drawableF2 = new u1.e(context2);
                            drawableF2.inflate(resources2, xmlResourceParser, attributeSet, theme2);
                        } else {
                            drawableF2 = i.a.a(resources2, xmlResourceParser, attributeSet, theme2);
                        }
                    }
                    if (drawableF2 == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    if (resourceId3 == -1 || resourceId4 == -1) {
                        break;
                    }
                    b bVar3 = eVar.S;
                    int iA2 = bVar3.a(drawableF2);
                    long j10 = resourceId3;
                    long j11 = resourceId4;
                    long j12 = (j10 << 32) | j11;
                    long j13 = z10 ? 8589934592L : 0L;
                    long j14 = iA2;
                    bVar3.I.b(j12, Long.valueOf(j14 | j13));
                    if (z10) {
                        bVar3.I.b((j11 << 32) | j10, Long.valueOf(j14 | 4294967296L | j13));
                    }
                    context2 = context;
                    theme2 = theme;
                    resources2 = resources;
                    i10 = 1;
                    z7 = false;
                    i11 = 2;
                    i12 = 3;
                } else {
                    context2 = context;
                    theme2 = theme;
                    resources2 = resources;
                }
                i10 = 1;
                i11 = 2;
                i12 = 3;
            }
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    @Override // h.h
    public final void d(b bVar) {
        this.f13132b = bVar;
        int i10 = this.f13138t;
        if (i10 >= 0) {
            Drawable drawableD = bVar.d(i10);
            this.f13134f = drawableD;
            if (drawableD != null) {
                b(drawableD);
            }
        }
        this.f13135j = null;
        this.Q = bVar;
        this.S = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // h.h, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        com.bumptech.glide.d dVar = this.T;
        if (dVar != null) {
            dVar.G();
            this.T = null;
            c(this.U);
            this.U = -1;
            this.V = -1;
        }
    }

    @Override // h.k, h.h, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.W) {
            super.mutate();
            b bVar = this.S;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.W = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0128  */
    @Override // h.k, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStateChange(int[] iArr) {
        int iIntValue;
        int iIntValue2;
        com.bumptech.glide.d aVar;
        b bVar = this.S;
        int[][] iArr2 = bVar.H;
        int i10 = bVar.f13113h;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                i11 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                break;
            }
            i11++;
        }
        if (i11 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = bVar.H;
            int i12 = bVar.f13113h;
            i11 = 0;
            while (true) {
                if (i11 >= i12) {
                    i11 = -1;
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i11], iArr3)) {
                    break;
                }
                i11++;
            }
        }
        int i13 = this.f13138t;
        if (i11 != i13) {
            com.bumptech.glide.d dVar = this.T;
            if (dVar == null) {
                this.T = null;
                this.V = -1;
                this.U = -1;
                b bVar2 = this.S;
                if (i13 >= 0) {
                    bVar2.getClass();
                    iIntValue = 0;
                } else {
                    iIntValue = ((Integer) bVar2.J.d(i13, 0)).intValue();
                }
                iIntValue2 = i11 >= 0 ? 0 : ((Integer) bVar2.J.d(i11, 0)).intValue();
                if (iIntValue2 == 0 && iIntValue != 0) {
                    int i14 = b.K;
                    long j10 = iIntValue2 | (iIntValue << 32);
                    int iLongValue = (int) ((Long) bVar2.I.f(j10, -1L)).longValue();
                    if (iLongValue >= 0) {
                        boolean z7 = (((Long) bVar2.I.f(j10, -1L)).longValue() & 8589934592L) != 0;
                        c(iLongValue);
                        Object obj = this.f13134f;
                        if (obj instanceof AnimationDrawable) {
                            aVar = new c((AnimationDrawable) obj, (((Long) bVar2.I.f(j10, -1L)).longValue() & 4294967296L) != 0, z7);
                        } else if (obj instanceof u1.e) {
                            aVar = new a((u1.e) obj, 1);
                        } else {
                            if (obj instanceof Animatable) {
                                aVar = new a((Animatable) obj, 0);
                            }
                            if (c(i11)) {
                            }
                        }
                        aVar.F();
                        this.T = aVar;
                        this.V = i13;
                        this.U = i11;
                        z = true;
                    }
                } else if (c(i11)) {
                    z = true;
                }
            } else {
                if (i11 != this.U) {
                    if (i11 == this.V && dVar.e()) {
                        dVar.C();
                        this.U = this.V;
                        this.V = i11;
                    } else {
                        i13 = this.U;
                        dVar.G();
                        this.T = null;
                        this.V = -1;
                        this.U = -1;
                        b bVar22 = this.S;
                        if (i13 >= 0) {
                        }
                        if (i11 >= 0) {
                        }
                        if (iIntValue2 == 0) {
                            if (c(i11)) {
                            }
                        }
                    }
                }
                z = true;
            }
        }
        Drawable drawable = this.f13134f;
        return drawable != null ? z | drawable.setState(iArr) : z;
    }

    @Override // h.h, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z10) {
        boolean visible = super.setVisible(z7, z10);
        com.bumptech.glide.d dVar = this.T;
        if (dVar != null && (visible || z10)) {
            if (z7) {
                dVar.F();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}