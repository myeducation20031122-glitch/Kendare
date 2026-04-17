package t8;

import com.google.android.gms.internal.ads.ic1;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import q8.a0;
import q8.b0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.manager.t f18015b;

    /* renamed from: e, reason: collision with root package name */
    public final q8.i f18016e;

    /* renamed from: f, reason: collision with root package name */
    public final s8.g f18017f;

    /* renamed from: j, reason: collision with root package name */
    public final d f18018j;

    /* renamed from: m, reason: collision with root package name */
    public final List f18019m;

    public s(com.bumptech.glide.manager.t tVar, q8.i iVar, s8.g gVar, d dVar, List list) {
        this.f18015b = tVar;
        this.f18016e = iVar;
        this.f18017f = gVar;
        this.f18018j = dVar;
        this.f18019m = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!s8.r.f16941a.a(obj, accessibleObject)) {
            throw new m7.p(a0.h.F(v8.b.c(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    @Override // q8.b0
    public final a0 b(q8.n nVar, x8.a aVar) {
        Class cls = aVar.f19110a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        com.bumptech.glide.f.h(this.f18019m);
        return v8.b.f18515a.m(cls) ? new r(cls, c(nVar, aVar, cls, true)) : new q(this.f18015b.g(aVar), c(nVar, aVar, cls, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0217, code lost:
    
        r39 = r11;
        r12 = new x8.a(s8.d.g(r1, r39, r39.getGenericSuperclass(), new java.util.HashMap()));
        r11 = r12.f19110a;
        r15 = r38;
        r14 = r14;
        r13 = r13;
        r0 = r37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap c(q8.n nVar, x8.a aVar, Class cls, boolean z7) throws SecurityException {
        int i10;
        boolean z10;
        Method method;
        ArrayList arrayList;
        int size;
        int i11;
        o oVar;
        int i12;
        Field[] fieldArr;
        Class cls2;
        x8.a aVar2;
        Type type;
        LinkedHashMap linkedHashMap;
        int i13;
        a0 a0VarC;
        ArrayList arrayListSingletonList;
        s sVar = this;
        q8.n nVar2 = nVar;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap2;
        }
        Type type2 = aVar.f19111b;
        Class cls3 = cls;
        x8.a aVar3 = aVar;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            if (cls3 != cls && declaredFields.length > 0) {
                com.bumptech.glide.f.h(sVar.f18019m);
            }
            int length = declaredFields.length;
            boolean z11 = false;
            int i14 = 0;
            while (true) {
                Type type3 = aVar3.f19111b;
                if (i14 < length) {
                    Field field = declaredFields[i14];
                    boolean zD = sVar.d(field, true);
                    boolean zD2 = sVar.d(field, z11);
                    if (zD || zD2) {
                        if (!z7) {
                            i10 = i14;
                            z10 = zD2;
                            method = null;
                        } else if (Modifier.isStatic(field.getModifiers())) {
                            i10 = i14;
                            method = null;
                            z10 = false;
                        } else {
                            Method methodG = v8.b.f18515a.g(cls3, field);
                            v8.b.d(methodG);
                            if (methodG.getAnnotation(r8.b.class) != null && field.getAnnotation(r8.b.class) == null) {
                                throw new m7.p(a0.h.w("@SerializedName on ", v8.b.c(methodG, false), " is not supported"));
                            }
                            i10 = i14;
                            z10 = zD2;
                            method = methodG;
                        }
                        if (method == null) {
                            v8.b.d(field);
                        }
                        Type typeG = s8.d.g(type3, cls3, field.getGenericType(), new HashMap());
                        r8.b bVar = (r8.b) field.getAnnotation(r8.b.class);
                        if (bVar == null) {
                            arrayListSingletonList = Collections.singletonList(sVar.f18016e.c(field));
                        } else {
                            String strValue = bVar.value();
                            String[] strArrAlternate = bVar.alternate();
                            if (strArrAlternate.length == 0) {
                                arrayListSingletonList = Collections.singletonList(strValue);
                            } else {
                                ArrayList arrayList2 = new ArrayList(strArrAlternate.length + 1);
                                arrayList2.add(strValue);
                                Collections.addAll(arrayList2, strArrAlternate);
                                arrayList = arrayList2;
                                size = arrayList.size();
                                o oVar2 = null;
                                i11 = 0;
                                while (i11 < size) {
                                    ArrayList arrayList3 = arrayList;
                                    String str = (String) arrayList.get(i11);
                                    boolean z12 = i11 != 0 ? false : zD;
                                    x8.a aVar4 = new x8.a(typeG);
                                    o oVar3 = oVar2;
                                    Class cls4 = aVar4.f19110a;
                                    int i15 = i11;
                                    boolean z13 = (cls4 instanceof Class) && cls4.isPrimitive();
                                    int modifiers = field.getModifiers();
                                    boolean z14 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
                                    r8.a aVar5 = (r8.a) field.getAnnotation(r8.a.class);
                                    if (aVar5 != null) {
                                        sVar.f18018j.getClass();
                                        a0VarC = d.a(sVar.f18015b, nVar2, aVar4, aVar5);
                                    } else {
                                        a0VarC = null;
                                    }
                                    boolean z15 = a0VarC != null;
                                    if (a0VarC == null) {
                                        a0VarC = nVar2.c(aVar4);
                                    }
                                    int i16 = size;
                                    Field field2 = field;
                                    int i17 = i10;
                                    Type type4 = typeG;
                                    int i18 = length;
                                    boolean z16 = z15;
                                    Field[] fieldArr2 = declaredFields;
                                    Class cls5 = cls3;
                                    x8.a aVar6 = aVar3;
                                    Type type5 = type2;
                                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                    oVar2 = (o) linkedHashMap3.put(str, new o(str, field.getName(), z12, z10, false, method, field2, z16, a0VarC, nVar, aVar4, z13, z14));
                                    if (oVar3 != null) {
                                        oVar2 = oVar3;
                                    }
                                    i11 = i15 + 1;
                                    nVar2 = nVar;
                                    cls3 = cls5;
                                    linkedHashMap2 = linkedHashMap3;
                                    i10 = i17;
                                    zD = z12;
                                    declaredFields = fieldArr2;
                                    aVar3 = aVar6;
                                    size = i16;
                                    field = field2;
                                    arrayList = arrayList3;
                                    typeG = type4;
                                    length = i18;
                                    type2 = type5;
                                    sVar = this;
                                }
                                oVar = oVar2;
                                i12 = length;
                                fieldArr = declaredFields;
                                cls2 = cls3;
                                aVar2 = aVar3;
                                type = type2;
                                linkedHashMap = linkedHashMap2;
                                i13 = i10;
                                if (oVar == null) {
                                    throw new IllegalArgumentException(type + " declares multiple JSON fields named " + oVar.f17996a);
                                }
                            }
                        }
                        arrayList = arrayListSingletonList;
                        size = arrayList.size();
                        o oVar22 = null;
                        i11 = 0;
                        while (i11 < size) {
                        }
                        oVar = oVar22;
                        i12 = length;
                        fieldArr = declaredFields;
                        cls2 = cls3;
                        aVar2 = aVar3;
                        type = type2;
                        linkedHashMap = linkedHashMap2;
                        i13 = i10;
                        if (oVar == null) {
                        }
                    } else {
                        i13 = i14;
                        i12 = length;
                        fieldArr = declaredFields;
                        cls2 = cls3;
                        aVar2 = aVar3;
                        type = type2;
                        linkedHashMap = linkedHashMap2;
                    }
                    i14 = i13 + 1;
                    nVar2 = nVar;
                    cls3 = cls2;
                    linkedHashMap2 = linkedHashMap;
                    declaredFields = fieldArr;
                    aVar3 = aVar2;
                    length = i12;
                    type2 = type;
                    z11 = false;
                    sVar = this;
                }
            }
        }
        return linkedHashMap2;
    }

    public final boolean d(Field field, boolean z7) {
        Class<?> type = field.getType();
        s8.g gVar = this.f18017f;
        gVar.getClass();
        if (!s8.g.d(type)) {
            gVar.c(z7);
            if ((field.getModifiers() & 136) == 0 && !field.isSynthetic() && !s8.g.d(field.getType())) {
                List list = z7 ? gVar.f16911b : gVar.f16912e;
                if (!list.isEmpty()) {
                    new p5.m(field);
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        ic1.v(it.next());
                        throw null;
                    }
                }
                return true;
            }
        }
        return false;
    }
}