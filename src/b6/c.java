package b6;

import a2.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import p6.n;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f1959a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1960b = new b();

    /* renamed from: c, reason: collision with root package name */
    public final float f1961c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1962d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1963e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1964f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1965g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1966h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1967i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1968j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1969k;

    public c(Context context, b bVar) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        int i10 = bVar.f1944b;
        if (i10 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i10);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
                attributeSet = attributeSetAsAttributeSet;
            } catch (IOException | XmlPullParserException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i10));
                notFoundException.initCause(e10);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        int i11 = styleAttribute == 0 ? 2131952763 : styleAttribute;
        int[] iArr = y5.a.f19266c;
        n.a(context, attributeSet, 2130903143, i11);
        n.b(context, attributeSet, iArr, 2130903143, i11, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 2130903143, i11);
        Resources resources = context.getResources();
        this.f1961c = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, -1);
        this.f1967i = context.getResources().getDimensionPixelSize(2131100250);
        this.f1968j = context.getResources().getDimensionPixelSize(2131100253);
        this.f1962d = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, -1);
        this.f1963e = typedArrayObtainStyledAttributes.getDimension(12, resources.getDimension(2131099842));
        this.f1965g = typedArrayObtainStyledAttributes.getDimension(17, resources.getDimension(2131099846));
        this.f1964f = typedArrayObtainStyledAttributes.getDimension(3, resources.getDimension(2131099842));
        this.f1966h = typedArrayObtainStyledAttributes.getDimension(13, resources.getDimension(2131099846));
        this.f1969k = typedArrayObtainStyledAttributes.getInt(24, 1);
        b bVar2 = this.f1960b;
        int i12 = bVar.f1958w;
        bVar2.f1958w = i12 == -2 ? 255 : i12;
        int i13 = bVar.N;
        if (i13 != -2) {
            bVar2.N = i13;
        } else if (typedArrayObtainStyledAttributes.hasValue(23)) {
            this.f1960b.N = typedArrayObtainStyledAttributes.getInt(23, 0);
        } else {
            this.f1960b.N = -1;
        }
        String str = bVar.M;
        if (str != null) {
            this.f1960b.M = str;
        } else if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.f1960b.M = typedArrayObtainStyledAttributes.getString(7);
        }
        b bVar3 = this.f1960b;
        bVar3.R = bVar.R;
        CharSequence charSequence = bVar.S;
        bVar3.S = charSequence == null ? context.getString(2131886655) : charSequence;
        b bVar4 = this.f1960b;
        int i14 = bVar.T;
        bVar4.T = i14 == 0 ? 2131755008 : i14;
        int i15 = bVar.U;
        bVar4.U = i15 == 0 ? 2131886668 : i15;
        Boolean bool = bVar.W;
        bVar4.W = Boolean.valueOf(bool == null || bool.booleanValue());
        b bVar5 = this.f1960b;
        int i16 = bVar.O;
        bVar5.O = i16 == -2 ? typedArrayObtainStyledAttributes.getInt(21, -2) : i16;
        b bVar6 = this.f1960b;
        int i17 = bVar.P;
        bVar6.P = i17 == -2 ? typedArrayObtainStyledAttributes.getInt(22, -2) : i17;
        b bVar7 = this.f1960b;
        Integer num = bVar.f1954m;
        bVar7.f1954m = Integer.valueOf(num == null ? typedArrayObtainStyledAttributes.getResourceId(5, 2131952056) : num.intValue());
        b bVar8 = this.f1960b;
        Integer num2 = bVar.f1955n;
        bVar8.f1955n = Integer.valueOf(num2 == null ? typedArrayObtainStyledAttributes.getResourceId(6, 0) : num2.intValue());
        b bVar9 = this.f1960b;
        Integer num3 = bVar.f1956t;
        bVar9.f1956t = Integer.valueOf(num3 == null ? typedArrayObtainStyledAttributes.getResourceId(15, 2131952056) : num3.intValue());
        b bVar10 = this.f1960b;
        Integer num4 = bVar.f1957u;
        bVar10.f1957u = Integer.valueOf(num4 == null ? typedArrayObtainStyledAttributes.getResourceId(16, 0) : num4.intValue());
        b bVar11 = this.f1960b;
        Integer num5 = bVar.f1948e;
        bVar11.f1948e = Integer.valueOf(num5 == null ? j4.m(context, typedArrayObtainStyledAttributes, 1).getDefaultColor() : num5.intValue());
        b bVar12 = this.f1960b;
        Integer num6 = bVar.f1953j;
        bVar12.f1953j = Integer.valueOf(num6 == null ? typedArrayObtainStyledAttributes.getResourceId(8, 2131952251) : num6.intValue());
        Integer num7 = bVar.f1950f;
        if (num7 != null) {
            this.f1960b.f1950f = num7;
        } else if (typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f1960b.f1950f = Integer.valueOf(j4.m(context, typedArrayObtainStyledAttributes, 9).getDefaultColor());
        } else {
            int iIntValue = this.f1960b.f1953j.intValue();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, y5.a.E);
            typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            ColorStateList colorStateListM = j4.m(context, typedArrayObtainStyledAttributes2, 3);
            j4.m(context, typedArrayObtainStyledAttributes2, 4);
            j4.m(context, typedArrayObtainStyledAttributes2, 5);
            typedArrayObtainStyledAttributes2.getInt(2, 0);
            typedArrayObtainStyledAttributes2.getInt(1, 1);
            int i18 = typedArrayObtainStyledAttributes2.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes2.getResourceId(i18, 0);
            typedArrayObtainStyledAttributes2.getString(i18);
            typedArrayObtainStyledAttributes2.getBoolean(14, false);
            j4.m(context, typedArrayObtainStyledAttributes2, 6);
            typedArrayObtainStyledAttributes2.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes2.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes2.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(iIntValue, y5.a.f19284u);
            typedArrayObtainStyledAttributes3.hasValue(0);
            typedArrayObtainStyledAttributes3.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes3.recycle();
            this.f1960b.f1950f = Integer.valueOf(colorStateListM.getDefaultColor());
        }
        b bVar13 = this.f1960b;
        Integer num8 = bVar.V;
        bVar13.V = Integer.valueOf(num8 == null ? typedArrayObtainStyledAttributes.getInt(2, 8388661) : num8.intValue());
        b bVar14 = this.f1960b;
        Integer num9 = bVar.X;
        bVar14.X = Integer.valueOf(num9 == null ? typedArrayObtainStyledAttributes.getDimensionPixelSize(11, resources.getDimensionPixelSize(2131100251)) : num9.intValue());
        b bVar15 = this.f1960b;
        Integer num10 = bVar.Y;
        bVar15.Y = Integer.valueOf(num10 == null ? typedArrayObtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(2131099848)) : num10.intValue());
        b bVar16 = this.f1960b;
        Integer num11 = bVar.Z;
        bVar16.Z = Integer.valueOf(num11 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(18, 0) : num11.intValue());
        b bVar17 = this.f1960b;
        Integer num12 = bVar.f1943a0;
        bVar17.f1943a0 = Integer.valueOf(num12 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(25, 0) : num12.intValue());
        b bVar18 = this.f1960b;
        Integer num13 = bVar.f1945b0;
        bVar18.f1945b0 = Integer.valueOf(num13 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(19, bVar18.Z.intValue()) : num13.intValue());
        b bVar19 = this.f1960b;
        Integer num14 = bVar.f1946c0;
        bVar19.f1946c0 = Integer.valueOf(num14 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(26, bVar19.f1943a0.intValue()) : num14.intValue());
        b bVar20 = this.f1960b;
        Integer num15 = bVar.f1951f0;
        bVar20.f1951f0 = Integer.valueOf(num15 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(20, 0) : num15.intValue());
        b bVar21 = this.f1960b;
        Integer num16 = bVar.f1947d0;
        bVar21.f1947d0 = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        b bVar22 = this.f1960b;
        Integer num17 = bVar.f1949e0;
        bVar22.f1949e0 = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        b bVar23 = this.f1960b;
        Boolean bool2 = bVar.f1952g0;
        bVar23.f1952g0 = Boolean.valueOf(bool2 == null ? typedArrayObtainStyledAttributes.getBoolean(0, false) : bool2.booleanValue());
        typedArrayObtainStyledAttributes.recycle();
        Locale locale = bVar.Q;
        if (locale == null) {
            this.f1960b.Q = Build.VERSION.SDK_INT >= 24 ? l.m(l.k()) : Locale.getDefault();
        } else {
            this.f1960b.Q = locale;
        }
        this.f1959a = bVar;
    }
}