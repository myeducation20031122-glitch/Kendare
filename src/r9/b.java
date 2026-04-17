package r9;

import androidx.lifecycle.c0;
import androidx.lifecycle.y0;
import com.google.firebase.messaging.FirebaseMessaging;
import com.isprid.kendare.model.DDevice;
import com.isprid.kendare.network.client.DeviceApiClient;
import g.u;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import p5.g;
import w3.i;
import x5.l;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f16646a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public final DeviceApiClient f16647b = new DeviceApiClient();

    /* renamed from: c, reason: collision with root package name */
    public final CompositeDisposable f16648c = new CompositeDisposable();

    /* renamed from: d, reason: collision with root package name */
    public String f16649d = "";

    public final void b(DDevice dDevice) {
        FirebaseMessaging firebaseMessaging;
        try {
            g gVar = FirebaseMessaging.f11627k;
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(i7.g.c());
            }
            firebaseMessaging.getClass();
            l lVar = new l();
            firebaseMessaging.f11635f.execute(new u(10, firebaseMessaging, lVar));
            lVar.f19011a.b(new i(7, this, dDevice));
        } catch (Exception e10) {
            c(dDevice);
            e10.printStackTrace();
        }
    }

    public final void c(DDevice dDevice) {
        dDevice.setDevicePushToken(this.f16649d);
        this.f16648c.add(this.f16647b.registerDevice(dDevice).subscribeOn(Schedulers.io()).doOnSubscribe(new m9.d(new a(this, 0), 15)).subscribe(new m9.d(new a(this, 1), 16), new m9.d(new a(this, 2), 17)));
    }

    @Override // androidx.lifecycle.y0
    public final void onCleared() {
        this.f16648c.clear();
    }
}