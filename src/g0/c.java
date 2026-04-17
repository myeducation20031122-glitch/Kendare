package g0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f12949a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0132  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f10;
        int attributeCount;
        int i10;
        boolean z7;
        int i11;
        int iA;
        float f11;
        float fCbrt;
        float f12;
        int i12;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r42 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[20];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r42 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = d0.a.f12283a;
                ?? ObtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr3) : theme2.obtainStyledAttributes(attributeSet2, iArr3, i13, i13);
                int resourceId = ObtainAttributes.getResourceId(i13, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f12949a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, r42);
                    int i15 = typedValue.type;
                    if (i15 < 28 || i15 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                        }
                        f10 = !ObtainAttributes.hasValue(r42) ? ObtainAttributes.getFloat(r42, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        float f13 = (Build.VERSION.SDK_INT >= 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                        ObtainAttributes.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr4 = new int[attributeCount];
                        int i16 = 0;
                        for (i10 = 0; i10 < attributeCount; i10++) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i10);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != 2130903100 && attributeNameResource != 2130903709) {
                                int i17 = i16 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i10, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr4[i16] = attributeNameResource;
                                i16 = i17;
                            }
                        }
                        int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i16);
                        z7 = f13 < 0.0f && f13 <= 100.0f;
                        if (f10 == 1.0f || z7) {
                            int iB = com.bumptech.glide.c.b((int) ((Color.alpha(color) * f10) + 0.5f), 0, 255);
                            if (z7) {
                                i11 = depth2;
                            } else {
                                a aVarA = a.a(color);
                                r rVar = r.f12978k;
                                float f14 = aVarA.f12940b;
                                if (f14 < 1.0d || Math.round(f13) <= 0.0d || Math.round(f13) >= 100.0d) {
                                    i11 = depth2;
                                } else {
                                    float f15 = aVarA.f12939a;
                                    float fMin = f15 < 0.0f ? 0.0f : Math.min(360.0f, f15);
                                    float f16 = f14;
                                    a aVar = null;
                                    boolean z10 = true;
                                    float f17 = 0.0f;
                                    while (true) {
                                        if (Math.abs(f17 - f14) >= 0.4f) {
                                            float f18 = 1000.0f;
                                            float f19 = 1000.0f;
                                            float f20 = 0.0f;
                                            float f21 = 100.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f20 - f21) <= 0.01f) {
                                                    i11 = depth2;
                                                    f11 = fMin;
                                                    break;
                                                }
                                                float f22 = ((f21 - f20) / 2.0f) + f20;
                                                int iC = a.b(f22, f16, fMin).c(r.f12978k);
                                                float fB = b.b(Color.red(iC));
                                                float fB2 = b.b(Color.green(iC));
                                                float fB3 = b.b(Color.blue(iC));
                                                float[] fArr = b.f12948d[1];
                                                float f23 = ((fB3 * fArr[2]) + ((fB2 * fArr[1]) + (fB * fArr[0]))) / 100.0f;
                                                if (f23 <= 0.008856452f) {
                                                    fCbrt = f23 * 903.2963f;
                                                    i11 = depth2;
                                                } else {
                                                    i11 = depth2;
                                                    fCbrt = (((float) Math.cbrt(f23)) * 116.0f) - 16.0f;
                                                }
                                                float fAbs = Math.abs(f13 - fCbrt);
                                                if (fAbs < 0.2f) {
                                                    a aVarA2 = a.a(iC);
                                                    a aVarB = a.b(aVarA2.f12941c, aVarA2.f12940b, fMin);
                                                    f12 = f22;
                                                    float f24 = aVarA2.f12942d - aVarB.f12942d;
                                                    f11 = fMin;
                                                    float f25 = aVarA2.f12943e - aVarB.f12943e;
                                                    float f26 = aVarA2.f12944f - aVarB.f12944f;
                                                    float fPow = (float) (Math.pow(Math.sqrt((f26 * f26) + (f25 * f25) + (f24 * f24)), 0.63d) * 1.41d);
                                                    if (fPow <= 1.0f) {
                                                        aVar2 = aVarA2;
                                                        f19 = fPow;
                                                        f18 = fAbs;
                                                    }
                                                } else {
                                                    f12 = f22;
                                                    f11 = fMin;
                                                }
                                                if (f18 == 0.0f && f19 == 0.0f) {
                                                    break;
                                                }
                                                if (fCbrt < f13) {
                                                    f20 = f12;
                                                } else {
                                                    f21 = f12;
                                                }
                                                depth2 = i11;
                                                fMin = f11;
                                            }
                                            a aVar3 = aVar2;
                                            if (!z10) {
                                                if (aVar3 == null) {
                                                    f14 = f16;
                                                } else {
                                                    aVar = aVar3;
                                                    f17 = f16;
                                                }
                                                f16 = ((f14 - f17) / 2.0f) + f17;
                                                depth2 = i11;
                                                fMin = f11;
                                            } else {
                                                if (aVar3 != null) {
                                                    iA = aVar3.c(rVar);
                                                    break;
                                                }
                                                f16 = ((f14 - f17) / 2.0f) + f17;
                                                depth2 = i11;
                                                fMin = f11;
                                                z10 = false;
                                            }
                                        } else {
                                            i11 = depth2;
                                            if (aVar != null) {
                                                iA = aVar.c(rVar);
                                            }
                                        }
                                    }
                                    color = iA;
                                }
                                iA = b.a(f13);
                                color = iA;
                            }
                            color = (16777215 & color) | (iB << 24);
                        } else {
                            i11 = depth2;
                        }
                        i12 = i14 + 1;
                        if (i12 > iArr2.length) {
                            int[] iArr5 = new int[i14 <= 4 ? 8 : i14 * 2];
                            System.arraycopy(iArr2, 0, iArr5, 0, i14);
                            iArr2 = iArr5;
                        }
                        iArr2[i14] = color;
                        if (i12 > iArr.length) {
                            ?? r22 = (Object[]) Array.newInstance(iArr.getClass().getComponentType(), i14 > 4 ? i14 * 2 : 8);
                            System.arraycopy(iArr, 0, r22, 0, i14);
                            iArr = r22;
                        }
                        iArr[i14] = iArrTrimStateSet;
                        iArr = iArr;
                        r02 = resources;
                        theme2 = theme;
                        i14 = i12;
                        depth2 = i11;
                        r42 = 1;
                        i13 = 0;
                        attributeSet2 = attributeSet;
                    } else {
                        color = ObtainAttributes.getColor(i13, -65281);
                        if (!ObtainAttributes.hasValue(r42)) {
                        }
                        if (Build.VERSION.SDK_INT >= 31) {
                            ObtainAttributes.recycle();
                            attributeCount = attributeSet.getAttributeCount();
                            int[] iArr42 = new int[attributeCount];
                            int i162 = 0;
                            while (i10 < attributeCount) {
                            }
                            int[] iArrTrimStateSet2 = StateSet.trimStateSet(iArr42, i162);
                            if (f13 < 0.0f) {
                                if (f10 == 1.0f) {
                                    int iB2 = com.bumptech.glide.c.b((int) ((Color.alpha(color) * f10) + 0.5f), 0, 255);
                                    if (z7) {
                                    }
                                    color = (16777215 & color) | (iB2 << 24);
                                    i12 = i14 + 1;
                                    if (i12 > iArr2.length) {
                                    }
                                    iArr2[i14] = color;
                                    if (i12 > iArr.length) {
                                    }
                                    iArr[i14] = iArrTrimStateSet2;
                                    iArr = iArr;
                                    r02 = resources;
                                    theme2 = theme;
                                    i14 = i12;
                                    depth2 = i11;
                                    r42 = 1;
                                    i13 = 0;
                                    attributeSet2 = attributeSet;
                                }
                            }
                        }
                    }
                }
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                depth2 = depth2;
                r42 = 1;
                i13 = 0;
            }
        }
        int[] iArr6 = new int[i14];
        int[][] iArr7 = new int[i14][];
        System.arraycopy(iArr2, 0, iArr6, 0, i14);
        System.arraycopy(iArr, 0, iArr7, 0, i14);
        return new ColorStateList(iArr7, iArr6);
    }
}