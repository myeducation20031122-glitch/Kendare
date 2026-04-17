package com.isprid.kendare.model;

import a0.h;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.g1;
import io.reactivex.internal.fuseable.QueueFuseable;
import kc.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\bb\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÙ\u0002\u0010d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010e\u001a\u00020fHÖ\u0001J\u0013\u0010g\u001a\u00020h2\b\u0010i\u001a\u0004\u0018\u00010jHÖ\u0003J\t\u0010k\u001a\u00020fHÖ\u0001J\t\u0010l\u001a\u00020\u0003HÖ\u0001J\u0019\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020fHÖ\u0001R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010!\"\u0004\b$\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010!\"\u0004\b+\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010!\"\u0004\b-\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010!\"\u0004\b1\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010!\"\u0004\b3\u0010%R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010!\"\u0004\b6\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010!\"\u0004\b8\u0010%R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010!R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010!R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010!R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010!R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010!R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010!R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010!R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010!¨\u0006r"}, d2 = {"Lcom/isprid/kendare/model/DSetting;", "Landroid/os/Parcelable;", "id", "", "onesignalAppId", "onesignalRestKey", "appName", "appLogo", "appEmail", "appVersion", "appAuthor", "appContact", "appWebsite", "appDescription", "appDevelopedBy", "appPrivacyPolicy", "releaseVersion", "versionCode", "showUpdate", "forceUpdate", "appStatus", "pageLimit", "apiOrderByColumn", "apiDataOrderBy", "publisherId", "interstitialAd", "interstitialAdId", "interstitialAdClick", "bannerAd", "bannerAdId", "packageName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiDataOrderBy", "()Ljava/lang/String;", "getApiOrderByColumn", "getAppAuthor", "setAppAuthor", "(Ljava/lang/String;)V", "getAppContact", "setAppContact", "getAppDescription", "setAppDescription", "getAppDevelopedBy", "setAppDevelopedBy", "getAppEmail", "setAppEmail", "getAppLogo", "setAppLogo", "getAppName", "setAppName", "getAppPrivacyPolicy", "setAppPrivacyPolicy", "getAppStatus", "getAppVersion", "setAppVersion", "getAppWebsite", "setAppWebsite", "getBannerAd", "getBannerAdId", "getForceUpdate", "getId", "getInterstitialAd", "getInterstitialAdClick", "getInterstitialAdId", "getOnesignalAppId", "getOnesignalRestKey", "getPackageName", "getPageLimit", "getPublisherId", "getReleaseVersion", "getShowUpdate", "getVersionCode", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class DSetting implements Parcelable {
    public static final Parcelable.Creator<DSetting> CREATOR = new Creator();
    private final String apiDataOrderBy;
    private final String apiOrderByColumn;
    private String appAuthor;
    private String appContact;
    private String appDescription;
    private String appDevelopedBy;
    private String appEmail;
    private String appLogo;
    private String appName;
    private String appPrivacyPolicy;
    private final String appStatus;
    private String appVersion;
    private String appWebsite;
    private final String bannerAd;
    private final String bannerAdId;
    private final String forceUpdate;
    private final String id;
    private final String interstitialAd;
    private final String interstitialAdClick;
    private final String interstitialAdId;
    private final String onesignalAppId;
    private final String onesignalRestKey;
    private final String packageName;
    private final String pageLimit;
    private final String publisherId;
    private final String releaseVersion;
    private final String showUpdate;
    private final String versionCode;

    @Metadata(k = 3, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DSetting> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DSetting createFromParcel(Parcel parcel) {
            Intrinsics.f(parcel, "parcel");
            return new DSetting(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DSetting[] newArray(int i10) {
            return new DSetting[i10];
        }
    }

    public DSetting() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.appWebsite;
    }

    public final String component11() {
        return this.appDescription;
    }

    public final String component12() {
        return this.appDevelopedBy;
    }

    public final String component13() {
        return this.appPrivacyPolicy;
    }

    public final String component14() {
        return this.releaseVersion;
    }

    public final String component15() {
        return this.versionCode;
    }

    public final String component16() {
        return this.showUpdate;
    }

    public final String component17() {
        return this.forceUpdate;
    }

    public final String component18() {
        return this.appStatus;
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
        return this.packageName;
    }

    public final String component3() {
        return this.onesignalRestKey;
    }

    public final String component4() {
        return this.appName;
    }

    public final String component5() {
        return this.appLogo;
    }

    public final String component6() {
        return this.appEmail;
    }

    public final String component7() {
        return this.appVersion;
    }

    public final String component8() {
        return this.appAuthor;
    }

    public final String component9() {
        return this.appContact;
    }

    public final DSetting copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
        return new DSetting(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DSetting)) {
            return false;
        }
        DSetting dSetting = (DSetting) obj;
        return Intrinsics.a(this.id, dSetting.id) && Intrinsics.a(this.onesignalAppId, dSetting.onesignalAppId) && Intrinsics.a(this.onesignalRestKey, dSetting.onesignalRestKey) && Intrinsics.a(this.appName, dSetting.appName) && Intrinsics.a(this.appLogo, dSetting.appLogo) && Intrinsics.a(this.appEmail, dSetting.appEmail) && Intrinsics.a(this.appVersion, dSetting.appVersion) && Intrinsics.a(this.appAuthor, dSetting.appAuthor) && Intrinsics.a(this.appContact, dSetting.appContact) && Intrinsics.a(this.appWebsite, dSetting.appWebsite) && Intrinsics.a(this.appDescription, dSetting.appDescription) && Intrinsics.a(this.appDevelopedBy, dSetting.appDevelopedBy) && Intrinsics.a(this.appPrivacyPolicy, dSetting.appPrivacyPolicy) && Intrinsics.a(this.releaseVersion, dSetting.releaseVersion) && Intrinsics.a(this.versionCode, dSetting.versionCode) && Intrinsics.a(this.showUpdate, dSetting.showUpdate) && Intrinsics.a(this.forceUpdate, dSetting.forceUpdate) && Intrinsics.a(this.appStatus, dSetting.appStatus) && Intrinsics.a(this.pageLimit, dSetting.pageLimit) && Intrinsics.a(this.apiOrderByColumn, dSetting.apiOrderByColumn) && Intrinsics.a(this.apiDataOrderBy, dSetting.apiDataOrderBy) && Intrinsics.a(this.publisherId, dSetting.publisherId) && Intrinsics.a(this.interstitialAd, dSetting.interstitialAd) && Intrinsics.a(this.interstitialAdId, dSetting.interstitialAdId) && Intrinsics.a(this.interstitialAdClick, dSetting.interstitialAdClick) && Intrinsics.a(this.bannerAd, dSetting.bannerAd) && Intrinsics.a(this.bannerAdId, dSetting.bannerAdId) && Intrinsics.a(this.packageName, dSetting.packageName);
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
        String str4 = this.appName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appLogo;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.appEmail;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.appVersion;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.appAuthor;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.appContact;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.appWebsite;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.appDescription;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.appDevelopedBy;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.appPrivacyPolicy;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.releaseVersion;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.versionCode;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.showUpdate;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.forceUpdate;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.appStatus;
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
        String str28 = this.packageName;
        return iHashCode27 + (str28 != null ? str28.hashCode() : 0);
    }

    public final void setAppAuthor(String str) {
        this.appAuthor = str;
    }

    public final void setAppContact(String str) {
        this.appContact = str;
    }

    public final void setAppDescription(String str) {
        this.appDescription = str;
    }

    public final void setAppDevelopedBy(String str) {
        this.appDevelopedBy = str;
    }

    public final void setAppEmail(String str) {
        this.appEmail = str;
    }

    public final void setAppLogo(String str) {
        this.appLogo = str;
    }

    public final void setAppName(String str) {
        this.appName = str;
    }

    public final void setAppPrivacyPolicy(String str) {
        this.appPrivacyPolicy = str;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setAppWebsite(String str) {
        this.appWebsite = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.onesignalAppId;
        String str3 = this.onesignalRestKey;
        String str4 = this.appName;
        String str5 = this.appLogo;
        String str6 = this.appEmail;
        String str7 = this.appVersion;
        String str8 = this.appAuthor;
        String str9 = this.appContact;
        String str10 = this.appWebsite;
        String str11 = this.appDescription;
        String str12 = this.appDevelopedBy;
        String str13 = this.appPrivacyPolicy;
        String str14 = this.releaseVersion;
        String str15 = this.versionCode;
        String str16 = this.showUpdate;
        String str17 = this.forceUpdate;
        String str18 = this.appStatus;
        String str19 = this.pageLimit;
        String str20 = this.apiOrderByColumn;
        String str21 = this.apiDataOrderBy;
        String str22 = this.publisherId;
        String str23 = this.interstitialAd;
        String str24 = this.interstitialAdId;
        String str25 = this.interstitialAdClick;
        String str26 = this.bannerAd;
        String str27 = this.bannerAdId;
        String str28 = this.packageName;
        StringBuilder sbB = h.B("DSetting(id=", str, ", onesignalAppId=", str2, ", onesignalRestKey=");
        r.m(sbB, str3, ", appName=", str4, ", appLogo=");
        r.m(sbB, str5, ", appEmail=", str6, ", appVersion=");
        r.m(sbB, str7, ", appAuthor=", str8, ", appContact=");
        r.m(sbB, str9, ", appWebsite=", str10, ", appDescription=");
        r.m(sbB, str11, ", appDevelopedBy=", str12, ", appPrivacyPolicy=");
        r.m(sbB, str13, ", releaseVersion=", str14, ", versionCode=");
        r.m(sbB, str15, ", showUpdate=", str16, ", forceUpdate=");
        r.m(sbB, str17, ", appStatus=", str18, ", pageLimit=");
        r.m(sbB, str19, ", apiOrderByColumn=", str20, ", apiDataOrderBy=");
        r.m(sbB, str21, ", publisherId=", str22, ", interstitialAd=");
        r.m(sbB, str23, ", interstitialAdId=", str24, ", interstitialAdClick=");
        r.m(sbB, str25, ", bannerAd=", str26, ", bannerAdId=");
        return r.h(sbB, str27, ", packageName=", str28, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        Intrinsics.f(out, "out");
        out.writeString(this.id);
        out.writeString(this.onesignalAppId);
        out.writeString(this.onesignalRestKey);
        out.writeString(this.appName);
        out.writeString(this.appLogo);
        out.writeString(this.appEmail);
        out.writeString(this.appVersion);
        out.writeString(this.appAuthor);
        out.writeString(this.appContact);
        out.writeString(this.appWebsite);
        out.writeString(this.appDescription);
        out.writeString(this.appDevelopedBy);
        out.writeString(this.appPrivacyPolicy);
        out.writeString(this.releaseVersion);
        out.writeString(this.versionCode);
        out.writeString(this.showUpdate);
        out.writeString(this.forceUpdate);
        out.writeString(this.appStatus);
        out.writeString(this.pageLimit);
        out.writeString(this.apiOrderByColumn);
        out.writeString(this.apiDataOrderBy);
        out.writeString(this.publisherId);
        out.writeString(this.interstitialAd);
        out.writeString(this.interstitialAdId);
        out.writeString(this.interstitialAdClick);
        out.writeString(this.bannerAd);
        out.writeString(this.bannerAdId);
        out.writeString(this.packageName);
    }

    public DSetting(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
        this.id = str;
        this.onesignalAppId = str2;
        this.onesignalRestKey = str3;
        this.appName = str4;
        this.appLogo = str5;
        this.appEmail = str6;
        this.appVersion = str7;
        this.appAuthor = str8;
        this.appContact = str9;
        this.appWebsite = str10;
        this.appDescription = str11;
        this.appDevelopedBy = str12;
        this.appPrivacyPolicy = str13;
        this.releaseVersion = str14;
        this.versionCode = str15;
        this.showUpdate = str16;
        this.forceUpdate = str17;
        this.appStatus = str18;
        this.pageLimit = str19;
        this.apiOrderByColumn = str20;
        this.apiDataOrderBy = str21;
        this.publisherId = str22;
        this.interstitialAd = str23;
        this.interstitialAdId = str24;
        this.interstitialAdClick = str25;
        this.bannerAd = str26;
        this.bannerAdId = str27;
        this.packageName = str28;
    }

    public /* synthetic */ DSetting(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & 1024) != 0 ? null : str11, (i10 & g1.FLAG_MOVED) != 0 ? null : str12, (i10 & g1.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str13, (i10 & 8192) != 0 ? null : str14, (i10 & 16384) != 0 ? null : str15, (i10 & 32768) != 0 ? null : str16, (i10 & 65536) != 0 ? null : str17, (i10 & 131072) != 0 ? null : str18, (i10 & 262144) != 0 ? null : str19, (i10 & 524288) != 0 ? null : str20, (i10 & 1048576) != 0 ? null : str21, (i10 & 2097152) != 0 ? null : str22, (i10 & 4194304) != 0 ? null : str23, (i10 & 8388608) != 0 ? null : str24, (i10 & 16777216) != 0 ? null : str25, (i10 & 33554432) != 0 ? null : str26, (i10 & 67108864) != 0 ? null : str27, (i10 & 134217728) != 0 ? null : str28);
    }
}