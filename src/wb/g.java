package wb;

import androidx.fragment.app.v;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class g extends Lambda implements Function1 {
    public final /* synthetic */ TypeConstructor b;
    public final /* synthetic */ List e;
    public final /* synthetic */ TypeAttributes f;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ MemberScope m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, MemberScope memberScope, TypeAttributes typeAttributes, TypeConstructor typeConstructor, boolean z) {
        super(1);
        this.b = typeConstructor;
        this.e = list;
        this.f = typeAttributes;
        this.j = z;
        this.m = memberScope;
    }

    public final Object invoke(Object obj) {
        KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj;
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
        TypeConstructor typeConstructor = this.b;
        List list = this.e;
        v vVarA = KotlinTypeFactory.a(kotlinTypeFactory, typeConstructor, kotlinTypeRefiner, list);
        if (vVarA == null) {
            return null;
        }
        SimpleType simpleType = (SimpleType) vVarA.b;
        if (simpleType != null) {
            return simpleType;
        }
        TypeConstructor typeConstructor2 = (TypeConstructor) vVarA.e;
        Intrinsics.c(typeConstructor2);
        return KotlinTypeFactory.f(list, this.m, this.f, typeConstructor2, this.j);
    }
}