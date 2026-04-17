package ec;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.CharDirectionality;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a extends Lambda implements Function0 {
    public static final a b = new a(0);

    public final Object invoke() {
        CharDirectionality[] charDirectionalityArrValues = CharDirectionality.values();
        int iW = com.bumptech.glide.e.w(charDirectionalityArrValues.length);
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        for (CharDirectionality charDirectionality : charDirectionalityArrValues) {
            linkedHashMap.put(Integer.valueOf(charDirectionality.b), charDirectionality);
        }
        return linkedHashMap;
    }
}