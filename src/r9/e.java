package r9;

import androidx.lifecycle.c0;
import androidx.lifecycle.y0;
import com.isprid.kendare.network.client.SettingApiClient;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f16654a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public final SettingApiClient f16655b = new SettingApiClient();

    /* renamed from: c, reason: collision with root package name */
    public final CompositeDisposable f16656c = new CompositeDisposable();

    public final void b() {
        this.f16656c.add(this.f16655b.getAppSetting().subscribeOn(Schedulers.io()).doOnSubscribe(new m9.d(new d(this, 0), 18)).subscribe(new m9.d(new d(this, 1), 19), new m9.d(new d(this, 2), 20)));
    }

    @Override // androidx.lifecycle.y0
    public final void onCleared() {
        this.f16656c.clear();
    }
}