package ta;

import com.google.android.gms.internal.ads.dq0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class p extends Lambda implements Function0 {
    public final /* synthetic */ KTypeImpl b;
    public final /* synthetic */ Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(KTypeImpl kTypeImpl, Function0 function0) {
        super(0);
        this.b = kTypeImpl;
        this.e = function0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke() throws NoWhenBranchMatchedException {
        KTypeProjection kTypeProjection;
        KTypeImpl kTypeImpl = this.b;
        List listJ0 = kTypeImpl.b.J0();
        if (listJ0.isEmpty()) {
            return EmptyList.b;
        }
        int i = 0;
        Lazy lazyU = com.bumptech.glide.e.u(LazyThreadSafetyMode.b, new o(kTypeImpl, 0));
        List list = listJ0;
        ArrayList arrayList = new ArrayList(fa.d.f3(list));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                dq0.v();
                throw null;
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (typeProjection.d()) {
                KTypeProjection.c.getClass();
                kTypeProjection = KTypeProjection.d;
            } else {
                KotlinType kotlinTypeA = typeProjection.a();
                Intrinsics.e(kotlinTypeA, "typeProjection.type");
                KTypeImpl kTypeImpl2 = new KTypeImpl(kotlinTypeA, this.e != null ? new n(kTypeImpl, i, lazyU) : null);
                int iOrdinal = typeProjection.b().ordinal();
                if (iOrdinal == 0) {
                    KTypeProjection.c.getClass();
                    kTypeProjection = new KTypeProjection(KVariance.b, kTypeImpl2);
                } else if (iOrdinal == 1) {
                    KTypeProjection.c.getClass();
                    kTypeProjection = new KTypeProjection(KVariance.e, kTypeImpl2);
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    KTypeProjection.c.getClass();
                    kTypeProjection = new KTypeProjection(KVariance.f, kTypeImpl2);
                }
            }
            arrayList.add(kTypeProjection);
            i = i2;
        }
        return arrayList;
    }
}