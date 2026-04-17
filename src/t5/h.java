package t5;

import android.os.Bundle;
import java.util.EnumMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f17377b = new h(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f17378a;

    public h(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(g.class);
        this.f17378a = enumMap;
        enumMap.put((EnumMap) g.AD_STORAGE, (g) bool);
        enumMap.put((EnumMap) g.ANALYTICS_STORAGE, (g) bool2);
    }

    public static h a(Bundle bundle) {
        if (bundle == null) {
            return f17377b;
        }
        EnumMap enumMap = new EnumMap(g.class);
        for (g gVar : g.values()) {
            String string = bundle.getString(gVar.f17360b);
            Boolean bool = null;
            if (string != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
            }
            enumMap.put((EnumMap) gVar, (g) bool);
        }
        return new h(enumMap);
    }

    public static h b(String str) {
        EnumMap enumMap = new EnumMap(g.class);
        if (str != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                g gVar = g.f17358j[i10];
                int i11 = i10 + 2;
                if (i11 < str.length()) {
                    char cCharAt = str.charAt(i11);
                    Boolean bool = null;
                    if (cCharAt != '-') {
                        if (cCharAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (cCharAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put((EnumMap) gVar, (g) bool);
                }
            }
        }
        return new h(enumMap);
    }

    public final h c(h hVar) {
        EnumMap enumMap = new EnumMap(g.class);
        for (g gVar : g.values()) {
            Boolean boolValueOf = (Boolean) this.f17378a.get(gVar);
            Boolean bool = (Boolean) hVar.f17378a.get(gVar);
            if (boolValueOf == null) {
                boolValueOf = bool;
            } else if (bool != null) {
                boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() && bool.booleanValue());
            }
            enumMap.put((EnumMap) gVar, (g) boolValueOf);
        }
        return new h(enumMap);
    }

    public final h d(h hVar) {
        EnumMap enumMap = new EnumMap(g.class);
        for (g gVar : g.values()) {
            Boolean bool = (Boolean) this.f17378a.get(gVar);
            if (bool == null) {
                bool = (Boolean) hVar.f17378a.get(gVar);
            }
            enumMap.put((EnumMap) gVar, (g) bool);
        }
        return new h(enumMap);
    }

    public final String e() {
        StringBuilder sb = new StringBuilder("G1");
        g[] gVarArr = g.f17358j;
        for (int i10 = 0; i10 < 2; i10++) {
            Boolean bool = (Boolean) this.f17378a.get(gVarArr[i10]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        g[] gVarArrValues = g.values();
        int length = gVarArrValues.length;
        int i10 = 0;
        while (true) {
            char c10 = 1;
            if (i10 >= length) {
                return true;
            }
            g gVar = gVarArrValues[i10];
            Boolean bool = (Boolean) this.f17378a.get(gVar);
            char c11 = bool == null ? (char) 0 : bool.booleanValue() ? (char) 1 : (char) 2;
            Boolean bool2 = (Boolean) hVar.f17378a.get(gVar);
            if (bool2 == null) {
                c10 = 0;
            } else if (!bool2.booleanValue()) {
                c10 = 2;
            }
            if (c11 != c10) {
                return false;
            }
            i10++;
        }
    }

    public final boolean f(g gVar) {
        Boolean bool = (Boolean) this.f17378a.get(gVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean g(h hVar, g... gVarArr) {
        for (g gVar : gVarArr) {
            Boolean bool = (Boolean) this.f17378a.get(gVar);
            Boolean bool2 = (Boolean) hVar.f17378a.get(gVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 17;
        for (Boolean bool : this.f17378a.values()) {
            int i11 = i10 * 31;
            i10 = i11 + (bool == null ? 0 : bool.booleanValue() ? 1 : 2);
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        g[] gVarArrValues = g.values();
        int length = gVarArrValues.length;
        for (int i10 = 0; i10 < length; i10++) {
            g gVar = gVarArrValues[i10];
            if (i10 != 0) {
                sb.append(", ");
            }
            sb.append(gVar.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f17378a.get(gVar);
            sb.append(bool == null ? "uninitialized" : true != bool.booleanValue() ? "denied" : "granted");
        }
        return sb.toString();
    }

    public h(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(g.class);
        this.f17378a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}