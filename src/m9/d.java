package m9;

import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class d implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15229b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f15230e;

    public /* synthetic */ d(Function1 function1, int i10) {
        this.f15229b = i10;
        this.f15230e = function1;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        int i10 = this.f15229b;
        Function1 tmp0 = this.f15230e;
        switch (i10) {
            case 0:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case QueueFuseable.SYNC /* 1 */:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 2:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 3:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 4:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case y4.g.NETWORK_ERROR /* 7 */:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 8:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 9:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 11:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 12:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case y4.g.ERROR /* 13 */:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case y4.g.INTERRUPTED /* 14 */:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case y4.g.TIMEOUT /* 15 */:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case y4.g.CANCELED /* 16 */:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case y4.g.API_NOT_CONNECTED /* 17 */:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 18:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case y4.g.REMOTE_EXCEPTION /* 19 */:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            default:
                Intrinsics.f(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
        }
    }
}