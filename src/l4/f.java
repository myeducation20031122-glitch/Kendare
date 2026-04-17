package l4;

import android.content.DialogInterface;
import android.net.Uri;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class f implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14583b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14584e;

    public /* synthetic */ f(Object obj, int i10) {
        this.f14583b = i10;
        this.f14584e = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f14583b;
        Object obj = this.f14584e;
        switch (i11) {
            case 0:
                ((AtomicInteger) obj).set(i10);
                break;
            case QueueFuseable.SYNC /* 1 */:
                ((j) obj).b();
                break;
            default:
                g0 g0Var = i4.k.A.f13348c;
                g0.m(((l) obj).f14620b, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                break;
        }
    }
}