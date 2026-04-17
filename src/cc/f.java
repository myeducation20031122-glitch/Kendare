package cc;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final /* synthetic */ class f extends FunctionReferenceImpl implements Function1 {
    public static final f b = new f();

    public f() {
        super(Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    public final Object invoke(Object obj) {
        Sequence sequence = (Sequence) obj;
        Intrinsics.f(sequence, "p0");
        return sequence.iterator();
    }
}