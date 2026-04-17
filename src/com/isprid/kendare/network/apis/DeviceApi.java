package com.isprid.kendare.network.apis;

import com.isprid.kendare.network.model.SuccessResponse;
import io.reactivex.Single;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.Metadata;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JJ\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'¨\u0006\f"}, d2 = {"Lcom/isprid/kendare/network/apis/DeviceApi;", "", "registerDevice", "Lio/reactivex/Single;", "Lcom/isprid/kendare/network/model/SuccessResponse;", "deviceId", "", "deviceName", "androidVersion", "versionName", "versionCode", "devicePushToken", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public interface DeviceApi {
    @FormUrlEncoded
    @POST("register-device")
    Single<SuccessResponse> registerDevice(@Field("device_id") String str, @Field("device_name") String str2, @Field("android_version") String str3, @Field("version_name") String str4, @Field("version_code") String str5, @Field("device_push_token") String str6);
}