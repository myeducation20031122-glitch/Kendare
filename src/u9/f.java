package u9;

import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18304b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f18305e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Function1 function1, int i10) {
        super(1);
        this.f18304b = i10;
        this.f18305e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f18304b;
        Function1 function1 = this.f18305e;
        switch (i10) {
            case 0:
                Calendar setDatePickerListener = (Calendar) obj;
                Intrinsics.f(setDatePickerListener, "$this$setDatePickerListener");
                function1.invoke(setDatePickerListener);
                return Unit.f14090a;
            default:
                KotlinType it = (KotlinType) obj;
                Intrinsics.e(it, "it");
                return function1.invoke(it).toString();
        }
    }
}