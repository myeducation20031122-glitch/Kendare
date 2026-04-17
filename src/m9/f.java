package m9;

import androidx.lifecycle.c0;
import androidx.lifecycle.y0;
import com.isprid.kendare.network.client.HoroscopeApiClient;
import io.reactivex.disposables.CompositeDisposable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f15233a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public final HoroscopeApiClient f15234b = new HoroscopeApiClient();

    /* renamed from: c, reason: collision with root package name */
    public final CompositeDisposable f15235c = new CompositeDisposable();

    @Override // androidx.lifecycle.y0
    public final void onCleared() {
        this.f15235c.clear();
    }
}