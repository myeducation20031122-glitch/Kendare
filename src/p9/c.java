package p9;

import androidx.lifecycle.c0;
import androidx.lifecycle.y0;
import com.isprid.kendare.network.client.PurchasePlanApiClient;
import io.reactivex.disposables.CompositeDisposable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f16080a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public final PurchasePlanApiClient f16081b = new PurchasePlanApiClient();

    /* renamed from: c, reason: collision with root package name */
    public final CompositeDisposable f16082c = new CompositeDisposable();

    @Override // androidx.lifecycle.y0
    public final void onCleared() {
        this.f16082c.clear();
    }
}