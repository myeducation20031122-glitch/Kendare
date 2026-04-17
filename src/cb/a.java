package cb;

import java.lang.reflect.Member;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java8ParameterNamesLoader$Cache;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a {
    public static final a a = new a();
    public static Java8ParameterNamesLoader$Cache b;

    public static Java8ParameterNamesLoader$Cache a(Member member) throws NoSuchMethodException, SecurityException {
        Class<?> cls = member.getClass();
        try {
            return new Java8ParameterNamesLoader$Cache(cls.getMethod("getParameters", new Class[0]), ReflectClassUtilKt.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new Java8ParameterNamesLoader$Cache(null, null);
        }
    }
}