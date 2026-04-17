package kb;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class c extends a {
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.header.a b;

    public c(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a aVar) {
        this.b = aVar;
    }

    @Override // kb.a
    public final void f(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
        }
        this.b.a.e = strArr;
    }
}