package ec;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.DelimitedRangesSequence$iterator$1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class b implements Sequence {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final Function2 d;

    public b(CharSequence charSequence, int i, int i2, i iVar) {
        Intrinsics.f(charSequence, "input");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = iVar;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new DelimitedRangesSequence$iterator$1(this);
    }
}