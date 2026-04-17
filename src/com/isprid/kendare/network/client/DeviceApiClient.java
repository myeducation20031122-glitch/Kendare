package com.isprid.kendare.network.client;

import com.isprid.kendare.model.ConverterKt;
import com.isprid.kendare.model.DDevice;
import com.isprid.kendare.model.Success;
import com.isprid.kendare.network.NetworkConfig;
import com.isprid.kendare.network.apis.DeviceApi;
import com.isprid.kendare.network.model.SuccessResponse;
import io.reactivex.Single;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/isprid/kendare/network/client/DeviceApiClient;", "", "()V", "deviceApi", "Lcom/isprid/kendare/network/apis/DeviceApi;", "registerDevice", "Lio/reactivex/Single;", "Lcom/isprid/kendare/model/Success;", "device", "Lcom/isprid/kendare/model/DDevice;", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class DeviceApiClient {
    private final DeviceApi deviceApi;

    public DeviceApiClient() {
        Object objCreate = NetworkConfig.INSTANCE.getRetrofitInstance().create(DeviceApi.class);
        Intrinsics.e(objCreate, "NetworkConfig.getRetrofi…te(DeviceApi::class.java)");
        this.deviceApi = (DeviceApi) objCreate;
    }

    private static final Success registerDevice$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.f(tmp0, "$tmp0");
        return (Success) tmp0.invoke(obj);
    }

    public final Single<Success> registerDevice(DDevice device) {
        Intrinsics.f(device, "device");
        Single<Success> map = this.deviceApi.registerDevice(String.valueOf(device.getDeviceId()), String.valueOf(device.getDeviceName()), String.valueOf(device.getAndroidVersion()), String.valueOf(device.getVersionName()), String.valueOf(device.getVersionCode()), String.valueOf(device.getDevicePushToken())).map(new a(new Function1<SuccessResponse, Success>() { // from class: com.isprid.kendare.network.client.DeviceApiClient.registerDevice.1
            @Override // kotlin.jvm.functions.Function1
            public final Success invoke(SuccessResponse it) {
                Intrinsics.f(it, "it");
                return ConverterKt.mapToDomain(it);
            }
        }, 3));
        Intrinsics.e(map, "deviceApi.registerDevice…t.mapToDomain()\n        }");
        return map;
    }
}