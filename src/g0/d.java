package g0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.gms.internal.ads.yl0;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import m.t;
import o5.d0;
import o5.e0;
import o5.f0;
import org.xmlpull.v1.XmlPullParserException;
import z2.z;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements y7.a {

    /* renamed from: b, reason: collision with root package name */
    public int f12950b;

    /* renamed from: e, reason: collision with root package name */
    public Object f12951e;

    /* renamed from: f, reason: collision with root package name */
    public Object f12952f;

    public d(int i10) {
        if (i10 != 5) {
            this.f12950b = 1;
        } else {
            this.f12951e = new Object[8];
            this.f12950b = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ed, code lost:
    
        r15 = (int[]) r0.f10909e;
        r16 = (float[]) r0.f10910f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fa, code lost:
    
        if (r7 == 1) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fc, code lost:
    
        if (r7 == 2) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fe, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0200, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0204, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0207, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020a, code lost:
    
        r3 = new android.graphics.LinearGradient(r11, r27, r26, r25, r15, r16, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0215, code lost:
    
        r1 = 0;
        r3 = new android.graphics.SweepGradient(r22, r23, (int[]) r0.f10909e, (float[]) r0.f10910f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0228, code lost:
    
        r8 = r22;
        r15 = r23;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0230, code lost:
    
        if (r24 <= 0.0f) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0232, code lost:
    
        r19 = (int[]) r0.f10909e;
        r0 = (float[]) r0.f10910f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x023f, code lost:
    
        if (r7 == 1) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0242, code lost:
    
        if (r7 == 2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0244, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x024a, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024d, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0250, code lost:
    
        r3 = new android.graphics.RadialGradient(r8, r15, r24, r19, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0262, code lost:
    
        return new g0.d(r1, r3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x026a, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cf, code lost:
    
        if (r14.size() <= 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d1, code lost:
    
        r0 = new com.google.android.gms.internal.measurement.n3(r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d7, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d8, code lost:
    
        if (r0 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01de, code lost:
    
        if (r19 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e0, code lost:
    
        r0 = new com.google.android.gms.internal.measurement.n3(r5, r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e4, code lost:
    
        r0 = new com.google.android.gms.internal.measurement.n3(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e8, code lost:
    
        if (r9 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01eb, code lost:
    
        if (r9 == 2) goto L108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d b(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        float f10;
        int i11;
        float f11;
        float f12;
        float f13;
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
        name.getClass();
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = c.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new d(colorStateListB.getDefaultColor(), obj, colorStateListB);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayX = g5.a.x(resources, theme, attributeSetAsAttributeSet, d0.a.f12286d);
        float f14 = !g5.a.s(xml, "startX") ? 0.0f : typedArrayX.getFloat(8, 0.0f);
        float f15 = !g5.a.s(xml, "startY") ? 0.0f : typedArrayX.getFloat(9, 0.0f);
        float f16 = !g5.a.s(xml, "endX") ? 0.0f : typedArrayX.getFloat(10, 0.0f);
        float f17 = !g5.a.s(xml, "endY") ? 0.0f : typedArrayX.getFloat(11, 0.0f);
        float f18 = !g5.a.s(xml, "centerX") ? 0.0f : typedArrayX.getFloat(3, 0.0f);
        float f19 = !g5.a.s(xml, "centerY") ? 0.0f : typedArrayX.getFloat(4, 0.0f);
        int i12 = !g5.a.s(xml, "type") ? 0 : typedArrayX.getInt(2, 0);
        int color = !g5.a.s(xml, "startColor") ? 0 : typedArrayX.getColor(0, 0);
        boolean zS = g5.a.s(xml, "centerColor");
        int color2 = !g5.a.s(xml, "centerColor") ? 0 : typedArrayX.getColor(7, 0);
        int color3 = !g5.a.s(xml, "endColor") ? 0 : typedArrayX.getColor(1, 0);
        if (g5.a.s(xml, "tileMode")) {
            f10 = f18;
            i11 = typedArrayX.getInt(6, 0);
        } else {
            f10 = f18;
            i11 = 0;
        }
        if (g5.a.s(xml, "gradientRadius")) {
            f11 = f19;
            f12 = typedArrayX.getFloat(5, 0.0f);
        } else {
            f11 = f19;
            f12 = 0.0f;
        }
        typedArrayX.recycle();
        int depth = xml.getDepth() + 1;
        float f20 = f12;
        ArrayList arrayList = new ArrayList(20);
        float f21 = f17;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f22 = f16;
            if (next2 == 1) {
                f13 = f15;
                break;
            }
            int depth2 = xml.getDepth();
            f13 = f15;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayX2 = g5.a.x(resources, theme, attributeSetAsAttributeSet, d0.a.f12287e);
                boolean zHasValue = typedArrayX2.hasValue(0);
                boolean zHasValue2 = typedArrayX2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    break;
                }
                int color4 = typedArrayX2.getColor(0, 0);
                float f23 = typedArrayX2.getFloat(1, 0.0f);
                typedArrayX2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f23));
            }
            f16 = f22;
            f15 = f13;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    @Override // y7.a
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f12950b) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (y7.a aVar : (y7.a[]) this.f12951e) {
            if (stackTraceElementArrA.length <= this.f12950b) {
                break;
            }
            stackTraceElementArrA = aVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f12950b ? ((z) this.f12952f).a(stackTraceElementArrA) : stackTraceElementArrA;
    }

    public final boolean c() {
        if (((Shader) this.f12951e) == null) {
            Object obj = this.f12952f;
            if (((ColorStateList) obj) != null && ((ColorStateList) obj).isStateful()) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(int[] iArr) {
        if (c()) {
            ColorStateList colorStateList = (ColorStateList) this.f12952f;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f12950b) {
                this.f12950b = colorForState;
                return true;
            }
        }
        return false;
    }

    public final yl0 e() throws f0 {
        String str;
        String str2;
        t tVar = (t) this.f12952f;
        int i10 = tVar.f14935b;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        switch (i11) {
            case QueueFuseable.SYNC /* 1 */:
            case 2:
            case 3:
                this.f12950b = 3;
                break;
            case 4:
                this.f12950b = 2;
                break;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                this.f12950b = 1;
                break;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                String strValueOf = String.valueOf((String) tVar.f14938e);
                throw new f0(1, strValueOf.length() != 0 ? "Invalid response from server: ".concat(strValueOf) : new String("Invalid response from server: "));
            case y4.g.NETWORK_ERROR /* 7 */:
                String strValueOf2 = String.valueOf((String) tVar.f14938e);
                throw new f0(3, strValueOf2.length() != 0 ? "Publisher misconfiguration: ".concat(strValueOf2) : new String("Publisher misconfiguration: "));
            default:
                throw new f0(1, "Invalid response from server.");
        }
        String str3 = (String) tVar.f14936c;
        o5.m mVar = str3 == null ? null : new o5.m((String) tVar.f14937d, str3);
        ((o5.f) ((o5.d) this.f12951e).f15722f).f15728b.edit().putStringSet("stored_info", new HashSet((List) ((t) this.f12952f).f14939f)).apply();
        for (o5.t tVar2 : (List) ((t) this.f12952f).f14940g) {
            int i12 = tVar2.f15792b;
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == 0) {
                str = null;
            } else {
                if (i13 != 1) {
                    str2 = i13 == 2 ? "clear" : "write";
                    str = null;
                }
                str = str2;
            }
            if (str != null) {
                o5.d dVar = (o5.d) this.f12951e;
                e0 e0Var = (e0) dVar.f15721e;
                String str4 = tVar2.f15791a;
                d0[] d0VarArr = {(o5.d) dVar.f15723j};
                e0Var.getClass();
                e0Var.f15726a.execute(new l0.a(str, str4, d0VarArr, 16, 0));
            }
        }
        return new yl0(this.f12950b, mVar);
    }

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f12951e = obj;
        this.f12952f = obj2;
        this.f12950b = i10;
    }
}