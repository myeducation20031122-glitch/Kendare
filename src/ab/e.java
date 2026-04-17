package ab;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class e implements Function0 {
    public final /* synthetic */ Name b;
    public final /* synthetic */ AbstractTypeParameterDescriptor e;

    public e(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, Name name) {
        this.e = abstractTypeParameterDescriptor;
        this.b = name;
    }

    public final Object invoke() {
        TypeAttributes.e.getClass();
        TypeAttributes typeAttributes = TypeAttributes.f;
        TypeConstructor typeConstructorK = this.e.k();
        List listEmptyList = Collections.emptyList();
        d dVar = new d(this, 0);
        kotlin.reflect.jvm.internal.impl.storage.a aVar = LockBasedStorageManager.e;
        Intrinsics.e(aVar, "NO_LOCKS");
        return KotlinTypeFactory.f(listEmptyList, new LazyScopeAdapter(aVar, dVar), typeAttributes, typeConstructorK, false);
    }
}