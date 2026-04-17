package xa;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns$Companion;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a extends KotlinBuiltIns {
    public static final FallbackBuiltIns$Companion g = new FallbackBuiltIns$Companion(0);
    public static final a h;

    static {
        a aVar = new a(new LockBasedStorageManager("FallbackBuiltIns"));
        aVar.c(true);
        h = aVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public final PlatformDependentDeclarationFilter p() {
        return PlatformDependentDeclarationFilter.All.a;
    }
}