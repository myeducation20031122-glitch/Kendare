package eb;

import com.bumptech.glide.e;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class c extends Lambda implements Function0 {
    public static final c b = new c(0);

    public final Object invoke() {
        JavaAnnotationMapper.a.getClass();
        return e.x(new Pair(JavaAnnotationMapper.b, new StringValue((Object) "Deprecated in Java")));
    }
}