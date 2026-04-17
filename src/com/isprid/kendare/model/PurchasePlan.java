package com.isprid.kendare.model;

import java.io.Serializable;
import m2.i;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class PurchasePlan implements Serializable {
    private String description;
    private final String id;
    private boolean isPurchased = false;
    private boolean needAccount;
    private String offerText;
    private final String planName;
    private String prefName;
    private i productDetails;
    private final String productId;
    private final String productType;
    private boolean showOffer;

    public PurchasePlan(String str, String str2, String str3, String str4) {
        this.id = str;
        this.planName = str2;
        this.productId = str3;
        this.productType = str4;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }

    public String getOfferText() {
        return this.offerText;
    }

    public String getPlanName() {
        return this.planName;
    }

    public String getPrefName() {
        return this.prefName;
    }

    public i getProductDetails() {
        return this.productDetails;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getProductType() {
        return this.productType;
    }

    public boolean isPurchased() {
        return this.isPurchased;
    }

    public boolean isShowOffer() {
        return this.showOffer;
    }

    public boolean needAccount() {
        return this.needAccount;
    }

    public void setProductDetails(i iVar) {
        this.productDetails = iVar;
    }

    public void setPurchased(boolean z7) {
        this.isPurchased = z7;
    }

    public PurchasePlan(String str, String str2, String str3, String str4, String str5) {
        this.id = str;
        this.planName = str2;
        this.productId = str3;
        this.productType = str4;
        this.description = str5;
    }

    public PurchasePlan(String str, String str2, String str3, String str4, String str5, String str6, boolean z7) {
        this.id = str;
        this.planName = str2;
        this.productId = str3;
        this.productType = str4;
        this.description = str5;
        this.prefName = str6;
        this.needAccount = z7;
    }

    public PurchasePlan(String str, String str2, String str3, String str4, String str5, String str6, boolean z7, String str7, boolean z10) {
        this.id = str;
        this.planName = str2;
        this.productId = str3;
        this.productType = str4;
        this.description = str5;
        this.prefName = str6;
        this.showOffer = z7;
        this.offerText = str7;
        this.needAccount = z10;
    }
}