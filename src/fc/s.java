package fc;

import com.google.android.gms.internal.ads.ic1;
import java.lang.Thread;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public abstract class s {
    public static final List a;

    static {
        Iterator itP = ic1.p();
        Intrinsics.f(itP, "<this>");
        Sequence sequencesKt__SequencesKt$asSequence$$inlined$Sequence$1 = new SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1(itP);
        if (!(sequencesKt__SequencesKt$asSequence$$inlined$Sequence$1 instanceof ConstrainedOnceSequence)) {
            sequencesKt__SequencesKt$asSequence$$inlined$Sequence$1 = new ConstrainedOnceSequence(sequencesKt__SequencesKt$asSequence$$inlined$Sequence$1);
        }
        a = SequencesKt.y(sequencesKt__SequencesKt$asSequence$$inlined$Sequence$1);
    }

    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        Throwable runtimeException;
        Iterator it = a.iterator();
        while (it.hasNext()) {
            try {
                ((gc.b) ((r) it.next())).j(coroutineContext, th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    ExceptionsKt.a(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            int i = Result.b;
            ExceptionsKt.a(th, new x(coroutineContext));
            Unit unit = Unit.a;
        } catch (Throwable th3) {
            int i2 = Result.b;
            ResultKt.a(th3);
        }
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}