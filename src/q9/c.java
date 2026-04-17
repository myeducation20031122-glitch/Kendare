package q9;

import androidx.lifecycle.c0;
import com.isprid.kendare.model.DArticle;
import com.isprid.kendare.network.util.ErrorHandler;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import u9.h;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16351b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f16352e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(1);
        this.f16351b = i10;
        this.f16352e = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f16351b;
        d dVar = this.f16352e;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        h.b(dVar.f16354b);
                        break;
                    default:
                        h.b(dVar.f16353a);
                        break;
                }
                break;
            case QueueFuseable.SYNC /* 1 */:
                DArticle response = (DArticle) obj;
                c0 c0Var = dVar.f16354b;
                Intrinsics.e(response, "response");
                h.c(c0Var, response);
                break;
            case 2:
                invoke((Throwable) obj);
                break;
            case 3:
                switch (i10) {
                    case 0:
                        h.b(dVar.f16354b);
                        break;
                    default:
                        h.b(dVar.f16353a);
                        break;
                }
                break;
            case 4:
                List response2 = (List) obj;
                c0 c0Var2 = dVar.f16353a;
                Intrinsics.e(response2, "response");
                h.c(c0Var2, response2);
                break;
            default:
                invoke((Throwable) obj);
                break;
        }
        return Unit.f14090a;
    }

    public final void invoke(Throwable e10) {
        int i10 = this.f16351b;
        d dVar = this.f16352e;
        switch (i10) {
            case 2:
                c0 c0Var = dVar.f16354b;
                ErrorHandler errorHandler = ErrorHandler.INSTANCE;
                Intrinsics.e(e10, "e");
                h.a(c0Var, errorHandler.getApiErrorMessage(e10));
                break;
            default:
                c0 c0Var2 = dVar.f16353a;
                ErrorHandler errorHandler2 = ErrorHandler.INSTANCE;
                Intrinsics.e(e10, "e");
                h.a(c0Var2, errorHandler2.getApiErrorMessage(e10));
                break;
        }
    }
}