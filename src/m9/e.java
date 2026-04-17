package m9;

import androidx.lifecycle.c0;
import com.isprid.kendare.network.util.ErrorHandler;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15231b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f15232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i10) {
        super(1);
        this.f15231b = i10;
        this.f15232e = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f15231b;
        f fVar = this.f15232e;
        switch (i10) {
            case 0:
                u9.h.b(fVar.f15233a);
                break;
            case QueueFuseable.SYNC /* 1 */:
                List response = (List) obj;
                c0 c0Var = fVar.f15233a;
                Intrinsics.e(response, "response");
                u9.h.c(c0Var, response);
                break;
            default:
                Throwable e10 = (Throwable) obj;
                c0 c0Var2 = fVar.f15233a;
                ErrorHandler errorHandler = ErrorHandler.INSTANCE;
                Intrinsics.e(e10, "e");
                u9.h.a(c0Var2, errorHandler.getApiErrorMessage(e10));
                break;
        }
        return Unit.f14090a;
    }
}