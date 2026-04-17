package com.isprid.kendare.network.util;

import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/isprid/kendare/network/util/ErrorHandler;", "", "()V", "getApiErrorMessage", "", "response", "", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class ErrorHandler {
    public static final ErrorHandler INSTANCE = new ErrorHandler();

    private ErrorHandler() {
    }

    public final String getApiErrorMessage(Throwable response) throws JSONException {
        String string;
        ResponseBody responseBodyErrorBody;
        Intrinsics.f(response, "response");
        response.printStackTrace();
        try {
            HttpException httpException = (HttpException) response;
            if (httpException.code() == 500) {
                string = "Sorry! Service Unavailable At the Moment";
            } else {
                Response response2 = httpException.response();
                byte[] bArrBytes = (response2 == null || (responseBodyErrorBody = response2.errorBody()) == null) ? null : responseBodyErrorBody.bytes();
                Intrinsics.c(bArrBytes);
                string = new JSONObject(new String(bArrBytes, Charsets.b)).getString("message");
            }
            Intrinsics.e(string, "{\n            val mRespo…}\n            }\n        }");
            return string;
        } catch (Exception unused) {
            return "Oops, something went wrong. Let's try it again.";
        }
    }
}