package u9;

import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.internal.ads.wh0;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18299b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wh0 f18300e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(wh0 wh0Var, int i10) {
        super(0);
        this.f18299b = i10;
        this.f18300e = wh0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        wh0 wh0Var = this.f18300e;
        int i10 = this.f18299b;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return (TextView) wh0Var.b().findViewById(2131296484);
                    default:
                        return (TextView) wh0Var.b().findViewById(2131296487);
                }
            case QueueFuseable.SYNC /* 1 */:
                switch (i10) {
                    case QueueFuseable.SYNC /* 1 */:
                        return (Button) wh0Var.b().findViewById(2131296485);
                    default:
                        return (Button) wh0Var.b().findViewById(2131296486);
                }
            case 2:
                switch (i10) {
                    case QueueFuseable.SYNC /* 1 */:
                        return (Button) wh0Var.b().findViewById(2131296485);
                    default:
                        return (Button) wh0Var.b().findViewById(2131296486);
                }
            default:
                switch (i10) {
                    case 0:
                        return (TextView) wh0Var.b().findViewById(2131296484);
                    default:
                        return (TextView) wh0Var.b().findViewById(2131296487);
                }
        }
    }
}