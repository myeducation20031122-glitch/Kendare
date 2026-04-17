package cc;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class d extends Lambda implements Function1 {
    public static final d e = new d(0);
    public static final d f = new d(1);
    public static final d j = new d(2);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i) {
        super(1);
        this.b = i;
    }

    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Sequence sequence = (Sequence) obj;
                Intrinsics.f(sequence, "it");
                return sequence.iterator();
            case 1:
                return obj;
            default:
                return Boolean.valueOf(obj == null);
        }
    }
}