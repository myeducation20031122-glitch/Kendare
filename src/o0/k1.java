package o0;

import android.view.View;
import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k1 extends RestrictedSuspendLambda implements Function2 {

    /* renamed from: e, reason: collision with root package name */
    public int f15575e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f15576f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ View f15577j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(View view, Continuation continuation) {
        super(continuation);
        this.f15577j = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        k1 k1Var = new k1(this.f15577j, continuation);
        k1Var.f15576f = obj;
        return k1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14090a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = CoroutineSingletons.f14171b;
        int i10 = this.f15575e;
        View view = this.f15577j;
        if (i10 == 0) {
            ResultKt.b(obj);
            SequenceScope sequenceScope = (SequenceScope) this.f15576f;
            this.f15576f = sequenceScope;
            this.f15575e = 1;
            sequenceScope.a(view, this);
            return obj2;
        }
        if (i10 == 1) {
            SequenceScope sequenceScope2 = (SequenceScope) this.f15576f;
            ResultKt.b(obj);
            if (view instanceof ViewGroup) {
                this.f15576f = null;
                this.f15575e = 2;
                sequenceScope2.getClass();
                Object objB = sequenceScope2.b(new g0(new j1((ViewGroup) view)), this);
                if (objB != obj2) {
                    objB = Unit.f14090a;
                }
                if (objB == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f14090a;
    }
}