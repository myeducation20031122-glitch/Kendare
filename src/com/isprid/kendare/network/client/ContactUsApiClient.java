package com.isprid.kendare.network.client;

import com.isprid.kendare.model.ConverterKt;
import com.isprid.kendare.model.DMessage;
import com.isprid.kendare.model.Success;
import com.isprid.kendare.network.NetworkConfig;
import com.isprid.kendare.network.apis.ContactUsApi;
import com.isprid.kendare.network.model.SuccessResponse;
import io.reactivex.Single;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/isprid/kendare/network/client/ContactUsApiClient;", "", "()V", "contactUsApi", "Lcom/isprid/kendare/network/apis/ContactUsApi;", "submitContactMessage", "Lio/reactivex/Single;", "Lcom/isprid/kendare/model/Success;", "message", "Lcom/isprid/kendare/model/DMessage;", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class ContactUsApiClient {
    private final ContactUsApi contactUsApi;

    public ContactUsApiClient() {
        Object objCreate = NetworkConfig.INSTANCE.getRetrofitInstance().create(ContactUsApi.class);
        Intrinsics.e(objCreate, "NetworkConfig.getRetrofi…ContactUsApi::class.java)");
        this.contactUsApi = (ContactUsApi) objCreate;
    }

    private static final Success submitContactMessage$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.f(tmp0, "$tmp0");
        return (Success) tmp0.invoke(obj);
    }

    public final Single<Success> submitContactMessage(DMessage message) {
        Intrinsics.f(message, "message");
        Single<Success> map = this.contactUsApi.submitContactMessage(String.valueOf(message.getEmail()), String.valueOf(message.getSubject()), String.valueOf(message.getDescription()), String.valueOf(message.getOptimization())).map(new a(new Function1<SuccessResponse, Success>() { // from class: com.isprid.kendare.network.client.ContactUsApiClient.submitContactMessage.1
            @Override // kotlin.jvm.functions.Function1
            public final Success invoke(SuccessResponse it) {
                Intrinsics.f(it, "it");
                return ConverterKt.mapToDomain(it);
            }
        }, 2));
        Intrinsics.e(map, "contactUsApi.submitConta…t.mapToDomain()\n        }");
        return map;
    }
}