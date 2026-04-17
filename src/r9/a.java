package r9;

import androidx.lifecycle.c0;
import com.isprid.kendare.model.Success;
import com.isprid.kendare.network.util.ErrorHandler;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import u9.h;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16644b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f16645e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i10) {
        super(1);
        this.f16644b = i10;
        this.f16645e = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f16644b;
        b bVar = this.f16645e;
        switch (i10) {
            case 0:
                h.b(bVar.f16646a);
                break;
            case QueueFuseable.SYNC /* 1 */:
                Success response = (Success) obj;
                c0 c0Var = bVar.f16646a;
                Intrinsics.e(response, "response");
                h.c(c0Var, response);
                break;
            default:
                Throwable e10 = (Throwable) obj;
                c0 c0Var2 = bVar.f16646a;
                ErrorHandler errorHandler = ErrorHandler.INSTANCE;
                Intrinsics.e(e10, "e");
                h.a(c0Var2, errorHandler.getApiErrorMessage(e10));
                break;
        }
        return Unit.f14090a;
    }
}