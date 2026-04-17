package com.isprid.kendare.network.client;

import com.isprid.kendare.model.ConverterKt;
import com.isprid.kendare.model.DHospitalPlace;
import com.isprid.kendare.network.NetworkConfig;
import com.isprid.kendare.network.apis.HoroscopeApi;
import com.isprid.kendare.network.model.HospitalPlacesResponse;
import io.reactivex.Single;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/isprid/kendare/network/client/HoroscopeApiClient;", "", "()V", "horoscopeApi", "Lcom/isprid/kendare/network/apis/HoroscopeApi;", "getHospitalPlaces", "Lio/reactivex/Single;", "", "Lcom/isprid/kendare/model/DHospitalPlace;", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class HoroscopeApiClient {
    private final HoroscopeApi horoscopeApi;

    public HoroscopeApiClient() {
        Object objCreate = NetworkConfig.INSTANCE.getRetrofitInstance().create(HoroscopeApi.class);
        Intrinsics.e(objCreate, "NetworkConfig.getRetrofi…HoroscopeApi::class.java)");
        this.horoscopeApi = (HoroscopeApi) objCreate;
    }

    private static final List getHospitalPlaces$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.f(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    public final Single<List<DHospitalPlace>> getHospitalPlaces() {
        Single<List<DHospitalPlace>> map = this.horoscopeApi.getHospitalPlaces().map(new a(new Function1<HospitalPlacesResponse, List<DHospitalPlace>>() { // from class: com.isprid.kendare.network.client.HoroscopeApiClient.getHospitalPlaces.1
            @Override // kotlin.jvm.functions.Function1
            public final List<DHospitalPlace> invoke(HospitalPlacesResponse it) {
                Intrinsics.f(it, "it");
                return ConverterKt.mapToDomainHospitalPlacesList(it.getPayload());
            }
        }, 4));
        Intrinsics.e(map, "horoscopeApi.getHospital…talPlacesList()\n        }");
        return map;
    }
}