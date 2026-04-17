package gb;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class l extends Lambda implements Function0 {
    public final /* synthetic */ LazyJavaPackageFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(0);
        this.b = lazyJavaPackageFragment;
    }

    public final Object invoke() {
        HashMap map = new HashMap();
        LazyJavaPackageFragment lazyJavaPackageFragment = this.b;
        lazyJavaPackageFragment.getClass();
        for (Map.Entry entry : ((Map) StorageKt.a(lazyJavaPackageFragment.M, LazyJavaPackageFragment.R[0])).entrySet()) {
            String str = (String) entry.getKey();
            KotlinJvmBinaryClass kotlinJvmBinaryClass = (KotlinJvmBinaryClass) entry.getValue();
            JvmClassName jvmClassNameD = JvmClassName.d(str);
            KotlinClassHeader kotlinClassHeaderA = kotlinJvmBinaryClass.a();
            int iOrdinal = kotlinClassHeaderA.a.ordinal();
            if (iOrdinal == 2) {
                map.put(jvmClassNameD, jvmClassNameD);
            } else if (iOrdinal == 5) {
                String str2 = kotlinClassHeaderA.a == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART ? kotlinClassHeaderA.f : null;
                if (str2 != null) {
                    map.put(jvmClassNameD, JvmClassName.d(str2));
                }
            }
        }
        return map;
    }
}