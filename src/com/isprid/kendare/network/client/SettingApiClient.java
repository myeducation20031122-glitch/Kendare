package com.isprid.kendare.network.client;

import com.isprid.kendare.model.ConverterKt;
import com.isprid.kendare.model.DSetting;
import com.isprid.kendare.network.NetworkConfig;
import com.isprid.kendare.network.apis.SettingApi;
import com.isprid.kendare.network.model.Setting;
import com.isprid.kendare.network.model.SettingsResponse;
import io.reactivex.Single;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/isprid/kendare/network/client/SettingApiClient;", "", "()V", "deviceApi", "Lcom/isprid/kendare/network/apis/SettingApi;", "getAppSetting", "Lio/reactivex/Single;", "Lcom/isprid/kendare/model/DSetting;", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class SettingApiClient {
    private final SettingApi deviceApi;

    public SettingApiClient() {
        Object objCreate = NetworkConfig.INSTANCE.getRetrofitInstance().create(SettingApi.class);
        Intrinsics.e(objCreate, "NetworkConfig.getRetrofi…e(SettingApi::class.java)");
        this.deviceApi = (SettingApi) objCreate;
    }

    private static final DSetting getAppSetting$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.f(tmp0, "$tmp0");
        return (DSetting) tmp0.invoke(obj);
    }

    public final Single<DSetting> getAppSetting() {
        Single<DSetting> map = this.deviceApi.getAppSetting().map(new a(new Function1<SettingsResponse, DSetting>() { // from class: com.isprid.kendare.network.client.SettingApiClient.getAppSetting.1
            @Override // kotlin.jvm.functions.Function1
            public final DSetting invoke(SettingsResponse it) throws NumberFormatException {
                Intrinsics.f(it, "it");
                Setting payload = it.getPayload();
                g5.a.f13048t = payload != null ? ConverterKt.mapToDomain(payload) : null;
                Setting payload2 = it.getPayload();
                g5.a.f13044p = String.valueOf(payload2 != null ? payload2.getReleaseVersion() : null);
                Setting payload3 = it.getPayload();
                g5.a.f13045q = Boolean.parseBoolean(payload3 != null ? payload3.getShowUpdate() : null);
                Setting payload4 = it.getPayload();
                g5.a.f13046r = Boolean.parseBoolean(payload4 != null ? payload4.getForceUpdate() : null);
                Setting payload5 = it.getPayload();
                g5.a.f13047s = Boolean.parseBoolean(payload5 != null ? payload5.getAppStatus() : null);
                Setting payload6 = it.getPayload();
                g5.a.f13041m = String.valueOf(payload6 != null ? payload6.getBannerAdId() : null);
                Setting payload7 = it.getPayload();
                g5.a.f13043o = String.valueOf(payload7 != null ? payload7.getInterstitialAdId() : null);
                Setting payload8 = it.getPayload();
                g5.a.f13042n = String.valueOf(payload8 != null ? payload8.getNativeAdId() : null);
                Setting payload9 = it.getPayload();
                g5.a.f13038j = Boolean.parseBoolean(payload9 != null ? payload9.getBannerAd() : null);
                Setting payload10 = it.getPayload();
                g5.a.f13039k = Boolean.parseBoolean(payload10 != null ? payload10.getInterstitialAd() : null);
                Setting payload11 = it.getPayload();
                g5.a.f13040l = Boolean.parseBoolean(payload11 != null ? payload11.getNativeAd() : null);
                Setting payload12 = it.getPayload();
                Integer.parseInt(String.valueOf(payload12 != null ? payload12.getInterstitialAdClick() : null));
                Setting payload13 = it.getPayload();
                if (payload13 != null) {
                    return ConverterKt.mapToDomain(payload13);
                }
                return null;
            }
        }, 7));
        Intrinsics.e(map, "deviceApi.getAppSetting(…?.mapToDomain()\n        }");
        return map;
    }
}