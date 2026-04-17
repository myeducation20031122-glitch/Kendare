package ra;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.WildcardTypeImpl$Companion;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements WildcardType, Type {

    /* renamed from: f, reason: collision with root package name */
    public static final WildcardTypeImpl$Companion f16664f = new WildcardTypeImpl$Companion(0);

    /* renamed from: j, reason: collision with root package name */
    public static final f f16665j = new f(null, null);

    /* renamed from: b, reason: collision with root package name */
    public final Type f16666b;

    /* renamed from: e, reason: collision with root package name */
    public final Type f16667e;

    public f(Type type, Type type2) {
        this.f16666b = type;
        this.f16667e = type2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f16667e;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb;
        Type type = this.f16667e;
        if (type != null) {
            sb = new StringBuilder("? super ");
        } else {
            type = this.f16666b;
            if (type == null || Intrinsics.a(type, Object.class)) {
                return "?";
            }
            sb = new StringBuilder("? extends ");
        }
        sb.append(TypesJVMKt.a(type));
        return sb.toString();
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f16666b;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}