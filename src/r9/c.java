package r9;

import com.isprid.kendare.ui.splash.IntroActivity;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16650b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ IntroActivity f16651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(IntroActivity introActivity, int i10) {
        super(0);
        this.f16650b = i10;
        this.f16651e = introActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f16650b) {
            case 0:
                m27invoke();
                break;
            case QueueFuseable.SYNC /* 1 */:
                m27invoke();
                break;
            case 2:
                m27invoke();
                break;
            default:
                m27invoke();
                break;
        }
        return Unit.f14090a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m27invoke() {
        int i10 = this.f16650b;
        IntroActivity introActivity = this.f16651e;
        switch (i10) {
            case 0:
                introActivity.finish();
                break;
            case QueueFuseable.SYNC /* 1 */:
                introActivity.finish();
                break;
            case 2:
                int i11 = IntroActivity.f11685t;
                introActivity.k();
                break;
            default:
                introActivity.finish();
                break;
        }
    }
}