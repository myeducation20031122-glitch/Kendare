package com.isprid.kendare.network.model;

import a0.h;
import com.squareup.moshi.Json;
import io.reactivex.internal.fuseable.QueueFuseable;
import kc.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e¨\u0006)"}, d2 = {"Lcom/isprid/kendare/network/model/PurchasePlan;", "", "id", "", "planName", "productId", "productType", "description", "prefName", "needAccount", "showOffer", "offerText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "getNeedAccount", "getOfferText", "getPlanName", "getPrefName", "getProductId", "getProductType", "getShowOffer", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class PurchasePlan {

    @Json(name = "description")
    private final String description;

    @Json(name = "id")
    private String id;

    @Json(name = "need_account")
    private final String needAccount;

    @Json(name = "offer_text")
    private final String offerText;

    @Json(name = "plan_name")
    private final String planName;

    @Json(name = "pref_name")
    private final String prefName;

    @Json(name = "product_id")
    private final String productId;

    @Json(name = "product_type")
    private final String productType;

    @Json(name = "show_offer")
    private final String showOffer;

    public PurchasePlan() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.planName;
    }

    public final String component3() {
        return this.productId;
    }

    public final String component4() {
        return this.productType;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.prefName;
    }

    public final String component7() {
        return this.needAccount;
    }

    public final String component8() {
        return this.showOffer;
    }

    public final String component9() {
        return this.offerText;
    }

    public final PurchasePlan copy(@Json(name = "id") String str, @Json(name = "plan_name") String str2, @Json(name = "product_id") String str3, @Json(name = "product_type") String str4, @Json(name = "description") String str5, @Json(name = "pref_name") String str6, @Json(name = "need_account") String str7, @Json(name = "show_offer") String str8, @Json(name = "offer_text") String str9) {
        return new PurchasePlan(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasePlan)) {
            return false;
        }
        PurchasePlan purchasePlan = (PurchasePlan) obj;
        return Intrinsics.a(this.id, purchasePlan.id) && Intrinsics.a(this.planName, purchasePlan.planName) && Intrinsics.a(this.productId, purchasePlan.productId) && Intrinsics.a(this.productType, purchasePlan.productType) && Intrinsics.a(this.description, purchasePlan.description) && Intrinsics.a(this.prefName, purchasePlan.prefName) && Intrinsics.a(this.needAccount, purchasePlan.needAccount) && Intrinsics.a(this.showOffer, purchasePlan.showOffer) && Intrinsics.a(this.offerText, purchasePlan.offerText);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNeedAccount() {
        return this.needAccount;
    }

    public final String getOfferText() {
        return this.offerText;
    }

    public final String getPlanName() {
        return this.planName;
    }

    public final String getPrefName() {
        return this.prefName;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final String getShowOffer() {
        return this.showOffer;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.planName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.prefName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.needAccount;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.showOffer;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.offerText;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setId(String str) {
        this.id = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.planName;
        String str3 = this.productId;
        String str4 = this.productType;
        String str5 = this.description;
        String str6 = this.prefName;
        String str7 = this.needAccount;
        String str8 = this.showOffer;
        String str9 = this.offerText;
        StringBuilder sbB = h.B("PurchasePlan(id=", str, ", planName=", str2, ", productId=");
        r.m(sbB, str3, ", productType=", str4, ", description=");
        r.m(sbB, str5, ", prefName=", str6, ", needAccount=");
        r.m(sbB, str7, ", showOffer=", str8, ", offerText=");
        return r.g(sbB, str9, ")");
    }

    public PurchasePlan(@Json(name = "id") String str, @Json(name = "plan_name") String str2, @Json(name = "product_id") String str3, @Json(name = "product_type") String str4, @Json(name = "description") String str5, @Json(name = "pref_name") String str6, @Json(name = "need_account") String str7, @Json(name = "show_offer") String str8, @Json(name = "offer_text") String str9) {
        this.id = str;
        this.planName = str2;
        this.productId = str3;
        this.productType = str4;
        this.description = str5;
        this.prefName = str6;
        this.needAccount = str7;
        this.showOffer = str8;
        this.offerText = str9;
    }

    public /* synthetic */ PurchasePlan(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) == 0 ? str9 : null);
    }
}