package com.isprid.kendare.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.isprid.kendare.MyApplication;
import i9.a;
import i9.b;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Authenticator;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/isprid/kendare/network/NetworkConfig;", "", "()V", "authenticator", "Lokhttp3/Authenticator;", "callback", "Lcom/isprid/kendare/network/NetworkConfig$AuthenticatorCallBack;", "getRetrofitInstance", "Lretrofit2/Retrofit;", "setAuthCallBackListener", "", "authenticatorCallBack", "AuthenticatorCallBack", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class NetworkConfig {
    public static final NetworkConfig INSTANCE = new NetworkConfig();
    private static final Authenticator authenticator = new a();
    private static AuthenticatorCallBack callback;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/isprid/kendare/network/NetworkConfig$AuthenticatorCallBack;", "", "onUnAuthorizedResponse", "", "responseCode", "", "(Ljava/lang/Integer;)V", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
    public interface AuthenticatorCallBack {
        void onUnAuthorizedResponse(Integer num);
    }

    private NetworkConfig() {
    }

    private static final Request authenticator$lambda$1(Route route, Response response) {
        Intrinsics.f(response, "response");
        if (response.code() == 200) {
            return response.request().newBuilder().build();
        }
        AuthenticatorCallBack authenticatorCallBack = callback;
        if (authenticatorCallBack != null) {
            authenticatorCallBack.onUnAuthorizedResponse(Integer.valueOf(response.code()));
        }
        return null;
    }

    private static final Response getRetrofitInstance$lambda$0(Interceptor.Chain chain) {
        String string;
        Intrinsics.f(chain, "chain");
        Context contextQ = MyApplication.f11640b.q();
        SharedPreferences sharedPreferences = contextQ.getSharedPreferences(contextQ.getPackageName() + "_preferences", 0);
        String str = "";
        if (sharedPreferences != null && (string = sharedPreferences.getString("pre_token", "")) != null) {
            str = string;
        }
        Log.e("NetworkConfig", "x-access-token > ".concat(str));
        return chain.proceed(chain.request().newBuilder().addHeader("x-api-key", "36ab0fe5a8b3580fccd6762cbf6a7667").addHeader("Content-Type", "application/json").addHeader("x-access-token", str).build());
    }

    public final Retrofit getRetrofitInstance() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(HttpLoggingInterceptor.Logger.DEFAULT);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builderAuthenticator = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).addInterceptor(new b()).authenticator(authenticator);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Retrofit retrofitBuild = new Retrofit.Builder().baseUrl("https://apps.pixinlab.com/kendare/api/v1/").client(builderAuthenticator.connectTimeout(5L, timeUnit).readTimeout(5L, timeUnit).build()).addConverterFactory(MoshiConverterFactory.create()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
        Intrinsics.e(retrofitBuild, "Builder()\n            .b…e())\n            .build()");
        return retrofitBuild;
    }

    public final void setAuthCallBackListener(AuthenticatorCallBack authenticatorCallBack) {
        Intrinsics.f(authenticatorCallBack, "authenticatorCallBack");
        callback = authenticatorCallBack;
    }
}