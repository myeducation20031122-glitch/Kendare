package m9;

import c7.m;
import com.isprid.kendare.ui.main.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15237b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainActivity f15238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z7, MainActivity mainActivity) {
        super(1);
        this.f15237b = z7;
        this.f15238e = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c7.a aVar = (c7.a) obj;
        boolean z7 = this.f15237b;
        MainActivity mainActivity = this.f15238e;
        if (z7) {
            if ((aVar.f2140a == 2 && aVar.a(m.a(1)) != null) || aVar.f2140a == 3) {
                MainActivity.k(mainActivity, aVar, true);
            }
        } else if (aVar.f2140a == 2 && aVar.a(m.a(0)) != null) {
            MainActivity.k(mainActivity, aVar, false);
        } else if (aVar.f2141b == 11) {
            int i10 = MainActivity.f11666w;
            mainActivity.o();
        }
        return Unit.f14090a;
    }
}