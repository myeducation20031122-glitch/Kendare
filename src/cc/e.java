package cc;

import kotlin.jvm.functions.Function1;
import kotlin.sequences.FlatteningSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.TransformingSequence;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public abstract class e extends c7.b {
    public static final FlatteningSequence p(Sequence sequence) {
        d dVar = d.e;
        if (!(sequence instanceof TransformingSequence)) {
            return new FlatteningSequence(sequence, d.f, dVar);
        }
        TransformingSequence transformingSequence = (TransformingSequence) sequence;
        return new FlatteningSequence(transformingSequence.a, transformingSequence.b, dVar);
    }

    public static Sequence q(Function1 function1, Object obj) {
        return obj == null ? a.a : new b(new ub.c(obj, 9), function1);
    }
}