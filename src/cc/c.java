package cc;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class c extends SequenceScope implements Iterator, Continuation, KMappedMarker {
    public int b;
    public Object e;
    public Iterator f;
    public Continuation j;

    @Override // kotlin.sequences.SequenceScope
    public final void a(Object obj, Continuation continuation) {
        this.e = obj;
        this.b = 3;
        this.j = continuation;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.b;
        Intrinsics.f(continuation, "frame");
    }

    @Override // kotlin.sequences.SequenceScope
    public final Object b(Iterator it, Continuation continuation) {
        if (!it.hasNext()) {
            return Unit.a;
        }
        this.f = it;
        this.b = 2;
        this.j = continuation;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.b;
        Intrinsics.f(continuation, "frame");
        return coroutineSingletons;
    }

    public final RuntimeException c() {
        int i = this.b;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.b);
    }

    public final CoroutineContext getContext() {
        return EmptyCoroutineContext.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.f;
                Intrinsics.c(it);
                if (it.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.f = null;
            }
            this.b = 5;
            Continuation continuation = this.j;
            Intrinsics.c(continuation);
            this.j = null;
            int i2 = Result.b;
            continuation.resumeWith(Unit.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.b = 1;
            Iterator it = this.f;
            Intrinsics.c(it);
            return it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.b = 0;
        Object obj = this.e;
        this.e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void resumeWith(Object obj) {
        ResultKt.b(obj);
        this.b = 4;
    }
}