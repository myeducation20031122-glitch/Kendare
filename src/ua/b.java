package ua;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class b extends Lambda implements Function1 {
    public static final b b = new b(1);

    public final Object invoke(Object obj) {
        String string;
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.f(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
        } else {
            if (!(value instanceof Object[])) {
                string = value.toString();
                return str + '=' + string;
            }
            string = Arrays.toString((Object[]) value);
        }
        Intrinsics.e(string, "toString(this)");
        return str + '=' + string;
    }
}