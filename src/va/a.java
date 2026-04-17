package va;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a implements Function0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ KotlinBuiltIns e;

    public /* synthetic */ a(KotlinBuiltIns kotlinBuiltIns, int i) {
        this.b = i;
        this.e = kotlinBuiltIns;
    }

    public final Object invoke() {
        int i = this.b;
        KotlinBuiltIns kotlinBuiltIns = this.e;
        switch (i) {
            case 0:
                return Arrays.asList(kotlinBuiltIns.k().h0(StandardNames.k), kotlinBuiltIns.k().h0(StandardNames.m), kotlinBuiltIns.k().h0(StandardNames.n), kotlinBuiltIns.k().h0(StandardNames.l));
            default:
                EnumMap enumMap = new EnumMap(PrimitiveType.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (PrimitiveType primitiveType : PrimitiveType.values()) {
                    String strE = primitiveType.b.e();
                    Name name = KotlinBuiltIns.f;
                    if (strE == null) {
                        kotlinBuiltIns.getClass();
                        KotlinBuiltIns.a(46);
                        throw null;
                    }
                    SimpleType simpleTypeN = kotlinBuiltIns.j(strE).n();
                    if (simpleTypeN == null) {
                        KotlinBuiltIns.a(47);
                        throw null;
                    }
                    String strE2 = primitiveType.e.e();
                    if (strE2 == null) {
                        KotlinBuiltIns.a(46);
                        throw null;
                    }
                    SimpleType simpleTypeN2 = kotlinBuiltIns.j(strE2).n();
                    if (simpleTypeN2 == null) {
                        KotlinBuiltIns.a(47);
                        throw null;
                    }
                    enumMap.put((EnumMap) primitiveType, (PrimitiveType) simpleTypeN2);
                    map.put(simpleTypeN, simpleTypeN2);
                    map2.put(simpleTypeN2, simpleTypeN);
                }
                return new d(enumMap, map, map2);
        }
    }
}