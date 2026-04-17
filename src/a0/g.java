package a0;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.google.android.gms.internal.ads.c61;
import com.google.android.gms.internal.ads.c71;
import com.google.android.gms.internal.ads.e61;
import com.google.android.gms.internal.ads.e71;
import com.google.android.gms.internal.ads.f31;
import com.google.android.gms.internal.ads.m81;
import com.google.android.gms.internal.ads.o11;
import com.google.android.gms.internal.ads.pb1;
import com.google.android.gms.internal.ads.q11;
import com.google.android.gms.internal.ads.t61;
import com.google.android.gms.internal.ads.v61;
import com.google.android.gms.internal.ads.va1;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f66a;

    /* renamed from: b, reason: collision with root package name */
    public int f67b;

    /* renamed from: c, reason: collision with root package name */
    public Object f68c;

    /* renamed from: d, reason: collision with root package name */
    public Object f69d;

    /* renamed from: e, reason: collision with root package name */
    public Object f70e;

    /* renamed from: f, reason: collision with root package name */
    public Object f71f;

    public g(Bundle bundle) {
        this.f68c = bundle.getString("positiveButton");
        this.f69d = bundle.getString("negativeButton");
        this.f70e = bundle.getString("rationaleMsg");
        this.f66a = bundle.getInt("theme");
        this.f67b = bundle.getInt("requestCode");
        this.f71f = bundle.getStringArray("permissions");
    }

    public final void a(m7.j jVar) {
        if (!(!((Set) this.f68c).contains(jVar.f15204a))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((Set) this.f69d).add(jVar);
    }

    public final m7.a b() {
        if (((m7.d) this.f70e) != null) {
            return new m7.a(new HashSet((Set) this.f68c), new HashSet((Set) this.f69d), this.f66a, this.f67b, (m7.d) this.f70e, (Set) this.f71f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x022a, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        j jVarD;
        char c10;
        o oVar = new o();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlResourceParser.getAttributeName(i10);
            String attributeValue = xmlResourceParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    jVarD = null;
                } catch (IOException e10) {
                    e10.printStackTrace();
                } catch (XmlPullParserException e11) {
                    e11.printStackTrace();
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c11 = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c11 = 6;
                                        break;
                                    } else {
                                        c11 = 65535;
                                        break;
                                    }
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c11 = 7;
                                        break;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c11 = 1;
                                        break;
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        c11 = 4;
                                        break;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c11 = 5;
                                        break;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c11 = 2;
                                        break;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c11 = '\t';
                                        break;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        break;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c11 = '\b';
                                        break;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c11 = 0;
                                        break;
                                    }
                                    break;
                                default:
                                    c11 = 65535;
                                    break;
                            }
                            switch (c11) {
                                case 0:
                                    jVarD = o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case QueueFuseable.SYNC /* 1 */:
                                    jVarD = o.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    jVarD = o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    jVarD.f87d.f91a = true;
                                    break;
                                case 3:
                                    jVarD = o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    jVarD.f87d.f106h0 = 1;
                                    break;
                                case 4:
                                    if (jVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVarD.f85b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case y4.g.INVALID_ACCOUNT /* 5 */:
                                    if (jVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVarD.f88e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case y4.g.RESOLUTION_REQUIRED /* 6 */:
                                    if (jVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVarD.f87d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case y4.g.NETWORK_ERROR /* 7 */:
                                    if (jVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVarD.f86c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (jVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    b.a(context, xmlResourceParser, jVarD.f89f);
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c10 = 3;
                                        break;
                                    } else {
                                        c10 = 65535;
                                        break;
                                    }
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c10 = 1;
                                        break;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c10 = 2;
                                        break;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c10 = 0;
                                        break;
                                    }
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            if (c10 == 0) {
                                ((SparseArray) this.f70e).put(identifier, oVar);
                                return;
                            } else if (c10 == 1 || c10 == 2 || c10 == 3) {
                                oVar.f165c.put(Integer.valueOf(jVarD.f84a), jVarD);
                                jVarD = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f70e).put(identifier, oVar);
                return;
            }
        }
    }

    public final void d(int i10) {
        if (!(this.f66a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f66a = i10;
    }

    public final Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putString("positiveButton", (String) this.f68c);
        bundle.putString("negativeButton", (String) this.f69d);
        bundle.putString("rationaleMsg", (String) this.f70e);
        bundle.putInt("theme", this.f66a);
        bundle.putInt("requestCode", this.f67b);
        bundle.putStringArray("permissions", (String[]) this.f71f);
        return bundle;
    }

    public g(m81 m81Var) throws GeneralSecurityException {
        String strZ = m81Var.z();
        this.f68c = strZ;
        if (strZ.equals(q11.f7597b)) {
            try {
                v61 v61VarX = v61.x(m81Var.y(), va1.f9272b);
                this.f69d = (t61) o11.b(m81Var);
                this.f66a = v61VarX.v();
                return;
            } catch (pb1 e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e10);
            }
        }
        if (strZ.equals(q11.f7596a)) {
            try {
                e61 e61VarW = e61.w(m81Var.y(), va1.f9272b);
                this.f70e = (c61) o11.b(m81Var);
                this.f67b = e61VarW.x().v();
                this.f66a = this.f67b + e61VarW.y().v();
                return;
            } catch (pb1 e11) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
            }
        }
        if (!strZ.equals(f31.f4219a)) {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(strZ)));
        }
        try {
            e71 e71VarX = e71.x(m81Var.y(), va1.f9272b);
            this.f71f = (c71) o11.b(m81Var);
            this.f66a = e71VarX.v();
        } catch (pb1 e12) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e12);
        }
    }

    public g(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f68c = hashSet;
        this.f69d = new HashSet();
        this.f66a = 0;
        this.f67b = 0;
        this.f71f = new HashSet();
        hashSet.add(cls);
        for (Class cls2 : clsArr) {
            if (cls2 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll((Set) this.f68c, clsArr);
    }

    public g(String str, String str2, String str3, int i10, int i11, String[] strArr) {
        this.f68c = str;
        this.f69d = str2;
        this.f70e = str3;
        this.f66a = i10;
        this.f67b = i11;
        this.f71f = strArr;
    }
}