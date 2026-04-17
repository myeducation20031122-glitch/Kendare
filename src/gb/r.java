package gb;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class r extends Lambda implements Function0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ LazyJavaScope e;
    public final /* synthetic */ JavaField f;
    public final /* synthetic */ PropertyDescriptorImpl j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(LazyJavaScope lazyJavaScope, JavaField javaField, PropertyDescriptorImpl propertyDescriptorImpl, int i) {
        super(0);
        this.b = i;
        this.e = lazyJavaScope;
        this.f = javaField;
        this.j = propertyDescriptorImpl;
    }

    public final Object invoke() {
        int i = this.b;
        PropertyDescriptorImpl propertyDescriptorImpl = this.j;
        JavaField javaField = this.f;
        LazyJavaScope lazyJavaScope = this.e;
        switch (i) {
            case 0:
                lazyJavaScope.b.a.h.a(javaField, propertyDescriptorImpl);
                return null;
            default:
                return lazyJavaScope.b.a.a.c(new r(lazyJavaScope, javaField, propertyDescriptorImpl, 0));
        }
    }
}