package l9;

import com.isprid.kendare.ui.horoscope.HoroscopeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14693b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14695f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, int i10, int i11) {
        super(0);
        this.f14693b = i11;
        this.f14695f = obj;
        this.f14694e = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f14693b;
        int i11 = this.f14694e;
        Object obj = this.f14695f;
        switch (i10) {
            case 0:
                int i12 = a.f14688a0;
                HoroscopeActivity horoscopeActivity = (HoroscopeActivity) obj;
                e9.d dVar = horoscopeActivity.f11647j;
                if (dVar == null) {
                    Intrinsics.n("mHoroscope");
                    throw null;
                }
                boolean z7 = horoscopeActivity.f11648m;
                a aVar = new a();
                aVar.U = dVar;
                aVar.W = i11;
                aVar.X = z7;
                aVar.k(horoscopeActivity.getSupportFragmentManager(), "bawa");
                return Unit.f14090a;
            default:
                Object obj2 = ((CallableMemberDescriptor) obj).i().get(i11);
                Intrinsics.e(obj2, "descriptor.valueParameters[i]");
                return (ParameterDescriptor) obj2;
        }
    }
}