package com.isprid.kendare.network.client;

import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.jvm.functions.Function1;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class a implements Function {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11643b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f11644e;

    public /* synthetic */ a(Function1 function1, int i10) {
        this.f11643b = i10;
        this.f11644e = function1;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        int i10 = this.f11643b;
        Function1 function1 = this.f11644e;
        switch (i10) {
            case 0:
                return ArticlesApiClient.getArticle$lambda$1(function1, obj);
            case QueueFuseable.SYNC /* 1 */:
                return ArticlesApiClient.getArticles$lambda$0(function1, obj);
            case 2:
                return ContactUsApiClient.submitContactMessage$lambda$0(function1, obj);
            case 3:
                return DeviceApiClient.registerDevice$lambda$0(function1, obj);
            case 4:
                return HoroscopeApiClient.getHospitalPlaces$lambda$0(function1, obj);
            case g.INVALID_ACCOUNT /* 5 */:
                return NotificationApiClient.getNotifications$lambda$0(function1, obj);
            case g.RESOLUTION_REQUIRED /* 6 */:
                return PurchasePlanApiClient.getPurchasePlans$lambda$0(function1, obj);
            default:
                return SettingApiClient.getAppSetting$lambda$0(function1, obj);
        }
    }
}