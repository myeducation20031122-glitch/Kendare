package fc;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class k {
    public final Object a;
    public final d b;
    public final Function1 c;
    public final Object d;
    public final Throwable e;

    public k(Object obj, d dVar, Function1 function1, Object obj2, Throwable th) {
        this.a = obj;
        this.b = dVar;
        this.c = function1;
        this.d = obj2;
        this.e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    public static k a(k kVar, d dVar, CancellationException cancellationException, int i) {
        Object obj = (i & 1) != 0 ? kVar.a : null;
        if ((i & 2) != 0) {
            dVar = kVar.b;
        }
        d dVar2 = dVar;
        Function1 function1 = (i & 4) != 0 ? kVar.c : null;
        Object obj2 = (i & 8) != 0 ? kVar.d : null;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = kVar.e;
        }
        kVar.getClass();
        return new k(obj, dVar2, function1, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.a(this.a, kVar.a) && Intrinsics.a(this.b, kVar.b) && Intrinsics.a(this.c, kVar.c) && Intrinsics.a(this.d, kVar.d) && Intrinsics.a(this.e, kVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        d dVar = this.b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Function1 function1 = this.c;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ k(Object obj, d dVar, Function1 function1, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : dVar, (i & 4) != 0 ? null : function1, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}