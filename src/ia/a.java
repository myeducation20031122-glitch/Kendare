package ia;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends Lambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f13443b = new a(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String acc = (String) obj;
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        Intrinsics.f(acc, "acc");
        Intrinsics.f(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }
}