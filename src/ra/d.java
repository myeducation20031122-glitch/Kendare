package ra;

import a0.h;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.TypesJVMKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements TypeVariable, Type {

    /* renamed from: b, reason: collision with root package name */
    public final KTypeParameter f16662b;

    public d(KTypeParameter typeParameter) {
        Intrinsics.f(typeParameter, "typeParameter");
        this.f16662b = typeParameter;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !Intrinsics.a(this.f16662b.getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List upperBounds = this.f16662b.getUpperBounds();
        ArrayList arrayList = new ArrayList(fa.d.f3(upperBounds));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(TypesJVMKt.b((KType) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError(h.v("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f16662b));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.f16662b.getName();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return this.f16662b.getName();
    }

    public final int hashCode() {
        this.f16662b.getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return this.f16662b.getName();
    }
}