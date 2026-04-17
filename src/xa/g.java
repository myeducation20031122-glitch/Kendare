package xa;

import com.google.android.gms.internal.ads.dq0;
import fa.j;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import okhttp3.HttpUrl;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class g extends Lambda implements Function0 {
    public final /* synthetic */ JvmBuiltInsCustomizer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(0);
        this.b = jvmBuiltInsCustomizer;
    }

    public final Object invoke() {
        KotlinBuiltIns kotlinBuiltInsQ = this.b.a.q();
        Name name = AnnotationUtilKt.a;
        Intrinsics.f(kotlinBuiltInsQ, "<this>");
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(kotlinBuiltInsQ, StandardNames.FqNames.n, j.k0(new Pair[]{new Pair(AnnotationUtilKt.a, new StringValue((Object) "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version")), new Pair(AnnotationUtilKt.b, new AnnotationValue((Object) new BuiltInAnnotationDescriptor(kotlinBuiltInsQ, StandardNames.FqNames.p, j.k0(new Pair[]{new Pair(AnnotationUtilKt.d, new StringValue((Object) HttpUrl.FRAGMENT_ENCODE_SET)), new Pair(AnnotationUtilKt.e, new ArrayValue(EmptyList.b, new k9.c(kotlinBuiltInsQ, 6)))})))), new Pair(AnnotationUtilKt.c, new EnumValue(ClassId.k(StandardNames.FqNames.o), Name.k("WARNING")))}));
        Annotations.Companion companion = Annotations.A;
        List listO = dq0.o(builtInAnnotationDescriptor);
        companion.getClass();
        return Annotations.Companion.a(listO);
    }
}