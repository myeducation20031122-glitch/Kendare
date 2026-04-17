package xb;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public abstract class g {
    public static final e b;
    public static final c e;
    public static final f f;
    public static final d j;
    public static final /* synthetic */ g[] m;

    static {
        e eVar = new e();
        b = eVar;
        c cVar = new c();
        e = cVar;
        f fVar = new f();
        f = fVar;
        d dVar = new d();
        j = dVar;
        m = new g[]{eVar, cVar, fVar, dVar};
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker.a(r3) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g e(UnwrappedType unwrappedType) {
        Intrinsics.f(unwrappedType, "<this>");
        if (unwrappedType.M0()) {
            return e;
        }
        boolean z = unwrappedType instanceof DefinitelyNotNullType;
        d dVar = j;
        if (!z || !(((DefinitelyNotNullType) unwrappedType).e instanceof StubTypeForBuilderInference)) {
            boolean z2 = unwrappedType instanceof StubTypeForBuilderInference;
            f fVar = f;
            if (!z2) {
                NullabilityChecker.a.getClass();
            }
            return fVar;
        }
        return dVar;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) m.clone();
    }

    public abstract g c(UnwrappedType unwrappedType);
}