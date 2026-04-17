package wb;

import com.google.android.gms.internal.ads.dq0;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class d extends Lambda implements Function1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractTypeConstructor e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AbstractTypeConstructor abstractTypeConstructor, int i) {
        super(1);
        this.b = i;
        this.e = abstractTypeConstructor;
    }

    public final Object invoke(Object obj) {
        Collection collectionG;
        int i = this.b;
        AbstractTypeConstructor abstractTypeConstructor = this.e;
        switch (i) {
            case 2:
                TypeConstructor typeConstructor = (TypeConstructor) obj;
                Intrinsics.f(typeConstructor, "it");
                abstractTypeConstructor.getClass();
                AbstractTypeConstructor abstractTypeConstructor2 = typeConstructor instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) typeConstructor : null;
                if (abstractTypeConstructor2 != null) {
                    collectionG = fa.g.C3(abstractTypeConstructor2.i(false), ((b) abstractTypeConstructor2.b.invoke()).a);
                } else {
                    collectionG = typeConstructor.g();
                    Intrinsics.e(collectionG, "supertypes");
                }
                break;
            case 3:
                KotlinType kotlinType = (KotlinType) obj;
                Intrinsics.f(kotlinType, "it");
                abstractTypeConstructor.m(kotlinType);
                break;
            default:
                b bVar = (b) obj;
                Intrinsics.f(bVar, "supertypes");
                List listA = abstractTypeConstructor.j().a(abstractTypeConstructor, bVar.a, new d(abstractTypeConstructor, 2), new d(abstractTypeConstructor, 3));
                if (listA.isEmpty()) {
                    KotlinType kotlinTypeH = abstractTypeConstructor.h();
                    List listO = kotlinTypeH != null ? dq0.o(kotlinTypeH) : null;
                    if (listO == null) {
                        listO = EmptyList.b;
                    }
                    listA = listO;
                }
                List listK3 = listA instanceof List ? (List) listA : null;
                if (listK3 == null) {
                    listK3 = fa.g.K3(listA);
                }
                List listL = abstractTypeConstructor.l(listK3);
                Intrinsics.f(listL, "<set-?>");
                bVar.b = listL;
                break;
        }
        return Unit.a;
    }
}