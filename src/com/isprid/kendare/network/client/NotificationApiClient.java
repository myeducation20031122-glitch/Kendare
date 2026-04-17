package com.isprid.kendare.network.client;

import com.isprid.kendare.model.ConverterKt;
import com.isprid.kendare.model.DNotification;
import com.isprid.kendare.network.NetworkConfig;
import com.isprid.kendare.network.apis.NotificationApi;
import com.isprid.kendare.network.model.NotificationsResponse;
import io.reactivex.Single;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/isprid/kendare/network/client/NotificationApiClient;", "", "()V", "notificationApi", "Lcom/isprid/kendare/network/apis/NotificationApi;", "getNotifications", "Lio/reactivex/Single;", "", "Lcom/isprid/kendare/model/DNotification;", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class NotificationApiClient {
    private final NotificationApi notificationApi;

    public NotificationApiClient() {
        Object objCreate = NetworkConfig.INSTANCE.getRetrofitInstance().create(NotificationApi.class);
        Intrinsics.e(objCreate, "NetworkConfig.getRetrofi…tionApi::class.java\n    )");
        this.notificationApi = (NotificationApi) objCreate;
    }

    private static final List getNotifications$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.f(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    public final Single<List<DNotification>> getNotifications() {
        Single<List<DNotification>> map = this.notificationApi.getNotifications().map(new a(new Function1<NotificationsResponse, List<DNotification>>() { // from class: com.isprid.kendare.network.client.NotificationApiClient.getNotifications.1
            @Override // kotlin.jvm.functions.Function1
            public final List<DNotification> invoke(NotificationsResponse it) {
                Intrinsics.f(it, "it");
                return ConverterKt.mapToDomainNotificationList(it.getPayload());
            }
        }, 5));
        Intrinsics.e(map, "notificationApi.getNotif…ificationList()\n        }");
        return map;
    }
}