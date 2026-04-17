package com.isprid.kendare.network.model;

import a0.h;
import androidx.recyclerview.widget.g1;
import com.squareup.moshi.Json;
import io.reactivex.internal.fuseable.QueueFuseable;
import kc.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b_\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bí\u0002\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010!J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jñ\u0002\u0010a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010b\u001a\u00020c2\b\u0010d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010e\u001a\u00020fHÖ\u0001J\t\u0010g\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010#\"\u0004\b4\u00105R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010#R\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010#R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010#R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010#R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010#¨\u0006h"}, d2 = {"Lcom/isprid/kendare/network/model/Setting;", "", "id", "", "onesignalAppId", "onesignalRestKey", "appStatus", "appName", "appLogo", "appEmail", "appVersion", "appAuthor", "appContact", "appWebsite", "appDescription", "appDevelopedBy", "appPrivacyPolicy", "releaseVersion", "versionCode", "showUpdate", "forceUpdate", "pageLimit", "apiOrderByColumn", "apiDataOrderBy", "publisherId", "interstitialAd", "interstitialAdId", "interstitialAdClick", "bannerAd", "bannerAdId", "nativeAdId", "nativeAd", "packageName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiDataOrderBy", "()Ljava/lang/String;", "getApiOrderByColumn", "getAppAuthor", "getAppContact", "getAppDescription", "getAppDevelopedBy", "getAppEmail", "getAppLogo", "getAppName", "getAppPrivacyPolicy", "getAppStatus", "getAppVersion", "getAppWebsite", "getBannerAd", "getBannerAdId", "getForceUpdate", "getId", "setId", "(Ljava/lang/String;)V", "getInterstitialAd", "getInterstitialAdClick", "getInterstitialAdId", "getNativeAd", "getNativeAdId", "getOnesignalAppId", "getOnesignalRestKey", "getPackageName", "getPageLimit", "getPublisherId", "getReleaseVersion", "getShowUpdate", "getVersionCode", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class Setting {

    @Json(name = "api_data_order_by")
    private final String apiDataOrderBy;

    @Json(name = "api_order_by_column")
    private final String apiOrderByColumn;

    @Json(name = "app_author")
    private final String appAuthor;

    @Json(name = "app_contact")
    private final String appContact;

    @Json(name = "app_description")
    private final String appDescription;

    @Json(name = "app_developed_by")
    private final String appDevelopedBy;

    @Json(name = "app_email")
    private final String appEmail;

    @Json(name = "app_logo")
    private final String appLogo;

    @Json(name = "app_name")
    private final String appName;

    @Json(name = "app_privacy_policy")
    private final String appPrivacyPolicy;

    @Json(name = "app_status")
    private final String appStatus;

    @Json(name = "app_version")
    private final String appVersion;

    @Json(name = "app_website")
    private final String appWebsite;

    @Json(name = "banner_ad")
    private final String bannerAd;

    @Json(name = "banner_ad_id")
    private final String bannerAdId;

    @Json(name = "force_update")
    private final String forceUpdate;

    @Json(name = "id")
    private String id;

    @Json(name = "interstitial_ad")
    private final String interstitialAd;

    @Json(name = "interstitial_ad_click")
    private final String interstitialAdClick;

    @Json(name = "interstitial_ad_id")
    private final String interstitialAdId;

    @Json(name = "native_ad")
    private final String nativeAd;

    @Json(name = "native_ad_id")
    private final String nativeAdId;

    @Json(name = "onesignal_app_id")
    private final String onesignalAppId;

    @Json(name = "onesignal_rest_key")
    private final String onesignalRestKey;

    @Json(name = "package_name")
    private final String packageName;

    @Json(name = "page_limit")
    private final String pageLimit;

    @Json(name = "publisher_id")
    private final String publisherId;

    @Json(name = "release_version")
    private final String releaseVersion;

    @Json(name = "show_update")
    private final String showUpdate;

    @Json(name = "version_code")
    private final String versionCode;

    public Setting() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.appContact;
    }

    public final String component11() {
        return this.appWebsite;
    }

    public final String component12() {
        return this.appDescription;
    }

    public final String component13() {
        return this.appDevelopedBy;
    }

    public final String component14() {
        return this.appPrivacyPolicy;
    }

    public final String component15() {
        return this.releaseVersion;
    }

    public final String component16() {
        return this.versionCode;
    }

    public final String component17() {
        return this.showUpdate;
    }

    public final String component18() {
        return this.forceUpdate;
    }

    public final String component19() {
        return this.pageLimit;
    }

    public final String component2() {
        return this.onesignalAppId;
    }

    public final String component20() {
        return this.apiOrderByColumn;
    }

    public final String component21() {
        return this.apiDataOrderBy;
    }

    public final String component22() {
        return this.publisherId;
    }

    public final String component23() {
        return this.interstitialAd;
    }

    public final String component24() {
        return this.interstitialAdId;
    }

    public final String component25() {
        return this.interstitialAdClick;
    }

    public final String component26() {
        return this.bannerAd;
    }

    public final String component27() {
        return this.bannerAdId;
    }

    public final String component28() {
        return this.nativeAdId;
    }

    public final String component29() {
        return this.nativeAd;
    }

    public final String component3() {
        return this.onesignalRestKey;
    }

    public final String component30() {
        return this.packageName;
    }

    public final String component4() {
        return this.appStatus;
    }

    public final String component5() {
        return this.appName;
    }

    public final String component6() {
        return this.appLogo;
    }

    public final String component7() {
        return this.appEmail;
    }

    public final String component8() {
        return this.appVersion;
    }

    public final String component9() {
        return this.appAuthor;
    }

    public final Setting copy(@Json(name = "id") String str, @Json(name = "onesignal_app_id") String str2, @Json(name = "onesignal_rest_key") String str3, @Json(name = "app_status") String str4, @Json(name = "app_name") String str5, @Json(name = "app_logo") String str6, @Json(name = "app_email") String str7, @Json(name = "app_version") String str8, @Json(name = "app_author") String str9, @Json(name = "app_contact") String str10, @Json(name = "app_website") String str11, @Json(name = "app_description") String str12, @Json(name = "app_developed_by") String str13, @Json(name = "app_privacy_policy") String str14, @Json(name = "release_version") String str15, @Json(name = "version_code") String str16, @Json(name = "show_update") String str17, @Json(name = "force_update") String str18, @Json(name = "page_limit") String str19, @Json(name = "api_order_by_column") String str20, @Json(name = "api_data_order_by") String str21, @Json(name = "publisher_id") String str22, @Json(name = "interstitial_ad") String str23, @Json(name = "interstitial_ad_id") String str24, @Json(name = "interstitial_ad_click") String str25, @Json(name = "banner_ad") String str26, @Json(name = "banner_ad_id") String str27, @Json(name = "native_ad_id") String str28, @Json(name = "native_ad") String str29, @Json(name = "package_name") String str30) {
        return new Setting(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Setting)) {
            return false;
        }
        Setting setting = (Setting) obj;
        return Intrinsics.a(this.id, setting.id) && Intrinsics.a(this.onesignalAppId, setting.onesignalAppId) && Intrinsics.a(this.onesignalRestKey, setting.onesignalRestKey) && Intrinsics.a(this.appStatus, setting.appStatus) && Intrinsics.a(this.appName, setting.appName) && Intrinsics.a(this.appLogo, setting.appLogo) && Intrinsics.a(this.appEmail, setting.appEmail) && Intrinsics.a(this.appVersion, setting.appVersion) && Intrinsics.a(this.appAuthor, setting.appAuthor) && Intrinsics.a(this.appContact, setting.appContact) && Intrinsics.a(this.appWebsite, setting.appWebsite) && Intrinsics.a(this.appDescription, setting.appDescription) && Intrinsics.a(this.appDevelopedBy, setting.appDevelopedBy) && Intrinsics.a(this.appPrivacyPolicy, setting.appPrivacyPolicy) && Intrinsics.a(this.releaseVersion, setting.releaseVersion) && Intrinsics.a(this.versionCode, setting.versionCode) && Intrinsics.a(this.showUpdate, setting.showUpdate) && Intrinsics.a(this.forceUpdate, setting.forceUpdate) && Intrinsics.a(this.pageLimit, setting.pageLimit) && Intrinsics.a(this.apiOrderByColumn, setting.apiOrderByColumn) && Intrinsics.a(this.apiDataOrderBy, setting.apiDataOrderBy) && Intrinsics.a(this.publisherId, setting.publisherId) && Intrinsics.a(this.interstitialAd, setting.interstitialAd) && Intrinsics.a(this.interstitialAdId, setting.interstitialAdId) && Intrinsics.a(this.interstitialAdClick, setting.interstitialAdClick) && Intrinsics.a(this.bannerAd, setting.bannerAd) && Intrinsics.a(this.bannerAdId, setting.bannerAdId) && Intrinsics.a(this.nativeAdId, setting.nativeAdId) && Intrinsics.a(this.nativeAd, setting.nativeAd) && Intrinsics.a(this.packageName, setting.packageName);
    }

    public final String getApiDataOrderBy() {
        return this.apiDataOrderBy;
    }

    public final String getApiOrderByColumn() {
        return this.apiOrderByColumn;
    }

    public final String getAppAuthor() {
        return this.appAuthor;
    }

    public final String getAppContact() {
        return this.appContact;
    }

    public final String getAppDescription() {
        return this.appDescription;
    }

    public final String getAppDevelopedBy() {
        return this.appDevelopedBy;
    }

    public final String getAppEmail() {
        return this.appEmail;
    }

    public final String getAppLogo() {
        return this.appLogo;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppPrivacyPolicy() {
        return this.appPrivacyPolicy;
    }

    public final String getAppStatus() {
        return this.appStatus;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getAppWebsite() {
        return this.appWebsite;
    }

    public final String getBannerAd() {
        return this.bannerAd;
    }

    public final String getBannerAdId() {
        return this.bannerAdId;
    }

    public final String getForceUpdate() {
        return this.forceUpdate;
    }

    public final String getId() {
        return this.id;
    }

    public final String getInterstitialAd() {
        return this.interstitialAd;
    }

    public final String getInterstitialAdClick() {
        return this.interstitialAdClick;
    }

    public final String getInterstitialAdId() {
        return this.interstitialAdId;
    }

    public final String getNativeAd() {
        return this.nativeAd;
    }

    public final String getNativeAdId() {
        return this.nativeAdId;
    }

    public final String getOnesignalAppId() {
        return this.onesignalAppId;
    }

    public final String getOnesignalRestKey() {
        return this.onesignalRestKey;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPageLimit() {
        return this.pageLimit;
    }

    public final String getPublisherId() {
        return this.publisherId;
    }

    public final String getReleaseVersion() {
        return this.releaseVersion;
    }

    public final String getShowUpdate() {
        return this.showUpdate;
    }

    public final String getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.onesignalAppId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.onesignalRestKey;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appStatus;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.appLogo;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.appEmail;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.appVersion;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.appAuthor;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.appContact;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.appWebsite;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.appDescription;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.appDevelopedBy;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.appPrivacyPolicy;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.releaseVersion;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.versionCode;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.showUpdate;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.forceUpdate;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.pageLimit;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.apiOrderByColumn;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.apiDataOrderBy;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.publisherId;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.interstitialAd;
        int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.interstitialAdId;
        int iHashCode24 = (iHashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.interstitialAdClick;
        int iHashCode25 = (iHashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.bannerAd;
        int iHashCode26 = (iHashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.bannerAdId;
        int iHashCode27 = (iHashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.nativeAdId;
        int iHashCode28 = (iHashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.nativeAd;
        int iHashCode29 = (iHashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.packageName;
        return iHashCode29 + (str30 != null ? str30.hashCode() : 0);
    }

    public final void setId(String str) {
        this.id = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.onesignalAppId;
        String str3 = this.onesignalRestKey;
        String str4 = this.appStatus;
        String str5 = this.appName;
        String str6 = this.appLogo;
        String str7 = this.appEmail;
        String str8 = this.appVersion;
        String str9 = this.appAuthor;
        String str10 = this.appContact;
        String str11 = this.appWebsite;
        String str12 = this.appDescription;
        String str13 = this.appDevelopedBy;
        String str14 = this.appPrivacyPolicy;
        String str15 = this.releaseVersion;
        String str16 = this.versionCode;
        String str17 = this.showUpdate;
        String str18 = this.forceUpdate;
        String str19 = this.pageLimit;
        String str20 = this.apiOrderByColumn;
        String str21 = this.apiDataOrderBy;
        String str22 = this.publisherId;
        String str23 = this.interstitialAd;
        String str24 = this.interstitialAdId;
        String str25 = this.interstitialAdClick;
        String str26 = this.bannerAd;
        String str27 = this.bannerAdId;
        String str28 = this.nativeAdId;
        String str29 = this.nativeAd;
        String str30 = this.packageName;
        StringBuilder sbB = h.B("Setting(id=", str, ", onesignalAppId=", str2, ", onesignalRestKey=");
        r.m(sbB, str3, ", appStatus=", str4, ", appName=");
        r.m(sbB, str5, ", appLogo=", str6, ", appEmail=");
        r.m(sbB, str7, ", appVersion=", str8, ", appAuthor=");
        r.m(sbB, str9, ", appContact=", str10, ", appWebsite=");
        r.m(sbB, str11, ", appDescription=", str12, ", appDevelopedBy=");
        r.m(sbB, str13, ", appPrivacyPolicy=", str14, ", releaseVersion=");
        r.m(sbB, str15, ", versionCode=", str16, ", showUpdate=");
        r.m(sbB, str17, ", forceUpdate=", str18, ", pageLimit=");
        r.m(sbB, str19, ", apiOrderByColumn=", str20, ", apiDataOrderBy=");
        r.m(sbB, str21, ", publisherId=", str22, ", interstitialAd=");
        r.m(sbB, str23, ", interstitialAdId=", str24, ", interstitialAdClick=");
        r.m(sbB, str25, ", bannerAd=", str26, ", bannerAdId=");
        r.m(sbB, str27, ", nativeAdId=", str28, ", nativeAd=");
        return r.h(sbB, str29, ", packageName=", str30, ")");
    }

    public Setting(@Json(name = "id") String str, @Json(name = "onesignal_app_id") String str2, @Json(name = "onesignal_rest_key") String str3, @Json(name = "app_status") String str4, @Json(name = "app_name") String str5, @Json(name = "app_logo") String str6, @Json(name = "app_email") String str7, @Json(name = "app_version") String str8, @Json(name = "app_author") String str9, @Json(name = "app_contact") String str10, @Json(name = "app_website") String str11, @Json(name = "app_description") String str12, @Json(name = "app_developed_by") String str13, @Json(name = "app_privacy_policy") String str14, @Json(name = "release_version") String str15, @Json(name = "version_code") String str16, @Json(name = "show_update") String str17, @Json(name = "force_update") String str18, @Json(name = "page_limit") String str19, @Json(name = "api_order_by_column") String str20, @Json(name = "api_data_order_by") String str21, @Json(name = "publisher_id") String str22, @Json(name = "interstitial_ad") String str23, @Json(name = "interstitial_ad_id") String str24, @Json(name = "interstitial_ad_click") String str25, @Json(name = "banner_ad") String str26, @Json(name = "banner_ad_id") String str27, @Json(name = "native_ad_id") String str28, @Json(name = "native_ad") String str29, @Json(name = "package_name") String str30) {
        this.id = str;
        this.onesignalAppId = str2;
        this.onesignalRestKey = str3;
        this.appStatus = str4;
        this.appName = str5;
        this.appLogo = str6;
        this.appEmail = str7;
        this.appVersion = str8;
        this.appAuthor = str9;
        this.appContact = str10;
        this.appWebsite = str11;
        this.appDescription = str12;
        this.appDevelopedBy = str13;
        this.appPrivacyPolicy = str14;
        this.releaseVersion = str15;
        this.versionCode = str16;
        this.showUpdate = str17;
        this.forceUpdate = str18;
        this.pageLimit = str19;
        this.apiOrderByColumn = str20;
        this.apiDataOrderBy = str21;
        this.publisherId = str22;
        this.interstitialAd = str23;
        this.interstitialAdId = str24;
        this.interstitialAdClick = str25;
        this.bannerAd = str26;
        this.bannerAdId = str27;
        this.nativeAdId = str28;
        this.nativeAd = str29;
        this.packageName = str30;
    }

    public /* synthetic */ Setting(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & 1024) != 0 ? null : str11, (i10 & g1.FLAG_MOVED) != 0 ? null : str12, (i10 & g1.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str13, (i10 & 8192) != 0 ? null : str14, (i10 & 16384) != 0 ? null : str15, (i10 & 32768) != 0 ? null : str16, (i10 & 65536) != 0 ? null : str17, (i10 & 131072) != 0 ? null : str18, (i10 & 262144) != 0 ? null : str19, (i10 & 524288) != 0 ? null : str20, (i10 & 1048576) != 0 ? null : str21, (i10 & 2097152) != 0 ? null : str22, (i10 & 4194304) != 0 ? null : str23, (i10 & 8388608) != 0 ? null : str24, (i10 & 16777216) != 0 ? null : str25, (i10 & 33554432) != 0 ? null : str26, (i10 & 67108864) != 0 ? null : str27, (i10 & 134217728) != 0 ? null : str28, (i10 & 268435456) != 0 ? null : str29, (i10 & 536870912) != 0 ? null : str30);
    }
}