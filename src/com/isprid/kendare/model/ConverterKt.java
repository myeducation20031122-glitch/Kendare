package com.isprid.kendare.model;

import com.isprid.kendare.network.model.Article;
import com.isprid.kendare.network.model.HospitalPlace;
import com.isprid.kendare.network.model.Notification;
import com.isprid.kendare.network.model.Setting;
import com.isprid.kendare.network.model.SuccessResponse;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010 \n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\u0000\u001a\u00020\t*\u00020\n\u001a\n\u0010\u0000\u001a\u00020\u000b*\u00020\f\u001a\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f\u001a\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f\u001a\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f\u001a\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f¨\u0006\u0013"}, d2 = {"mapToDomain", "Lcom/isprid/kendare/model/DArticle;", "Lcom/isprid/kendare/network/model/Article;", "Lcom/isprid/kendare/model/DHospitalPlace;", "Lcom/isprid/kendare/network/model/HospitalPlace;", "Lcom/isprid/kendare/model/DNotification;", "Lcom/isprid/kendare/network/model/Notification;", "Lcom/isprid/kendare/model/DPurchasePlan;", "Lcom/isprid/kendare/network/model/PurchasePlan;", "Lcom/isprid/kendare/model/DSetting;", "Lcom/isprid/kendare/network/model/Setting;", "Lcom/isprid/kendare/model/Success;", "Lcom/isprid/kendare/network/model/SuccessResponse;", "mapToDomainHospitalPlacesList", "", "", "mapToDomainNotificationList", "mapToDomainPlanList", "mapToDomainServiceList", "app_release"}, k = 2, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class ConverterKt {
    public static final DArticle mapToDomain(Article article) {
        Intrinsics.f(article, "<this>");
        return new DArticle(article.getId(), article.getTitle(), article.getIcon(), article.getDescription(), article.isPremium());
    }

    public static final List<DHospitalPlace> mapToDomainHospitalPlacesList(List<HospitalPlace> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(mapToDomain((HospitalPlace) it.next()));
            }
        }
        return arrayList;
    }

    public static final List<DNotification> mapToDomainNotificationList(List<Notification> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(mapToDomain((Notification) it.next()));
            }
        }
        return arrayList;
    }

    public static final List<DPurchasePlan> mapToDomainPlanList(List<com.isprid.kendare.network.model.PurchasePlan> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(mapToDomain((com.isprid.kendare.network.model.PurchasePlan) it.next()));
            }
        }
        return arrayList;
    }

    public static final List<DArticle> mapToDomainServiceList(List<Article> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(mapToDomain((Article) it.next()));
            }
        }
        return arrayList;
    }

    public static final DHospitalPlace mapToDomain(HospitalPlace hospitalPlace) throws NumberFormatException {
        Intrinsics.f(hospitalPlace, "<this>");
        return new DHospitalPlace(hospitalPlace.getId(), hospitalPlace.getPlaceName(), hospitalPlace.getCountry(), Double.parseDouble(hospitalPlace.getLongitude()), Double.parseDouble(hospitalPlace.getLatitude()));
    }

    public static final DNotification mapToDomain(Notification notification) {
        Intrinsics.f(notification, "<this>");
        return new DNotification(notification.getId(), notification.getNoticeTitle(), notification.getNoticeDescription(), notification.getCreatedDate(), notification.isRead(), notification.isNew());
    }

    public static final DPurchasePlan mapToDomain(com.isprid.kendare.network.model.PurchasePlan purchasePlan) {
        Intrinsics.f(purchasePlan, "<this>");
        return new DPurchasePlan(purchasePlan.getId(), purchasePlan.getPlanName(), purchasePlan.getProductId(), purchasePlan.getProductType(), purchasePlan.getDescription(), purchasePlan.getPrefName(), Boolean.valueOf(Boolean.parseBoolean(purchasePlan.getNeedAccount())), Boolean.valueOf(Boolean.parseBoolean(purchasePlan.getShowOffer())), purchasePlan.getOfferText(), false, 512, null);
    }

    public static final DSetting mapToDomain(Setting setting) {
        Intrinsics.f(setting, "<this>");
        return new DSetting(setting.getId(), setting.getOnesignalAppId(), setting.getOnesignalRestKey(), setting.getAppName(), setting.getAppLogo(), setting.getAppEmail(), setting.getAppVersion(), setting.getAppAuthor(), setting.getAppContact(), setting.getAppWebsite(), setting.getAppDescription(), setting.getAppDevelopedBy(), setting.getAppPrivacyPolicy(), setting.getReleaseVersion(), setting.getVersionCode(), setting.getShowUpdate(), setting.getForceUpdate(), setting.getAppStatus(), setting.getPageLimit(), setting.getApiOrderByColumn(), setting.getApiDataOrderBy(), setting.getPublisherId(), setting.getInterstitialAd(), setting.getInterstitialAdId(), setting.getInterstitialAdClick(), setting.getBannerAd(), setting.getBannerAdId(), setting.getPackageName());
    }

    public static final Success mapToDomain(SuccessResponse successResponse) {
        Intrinsics.f(successResponse, "<this>");
        return new Success(successResponse.getMessage(), successResponse.getResult(), successResponse.getPayload());
    }
}