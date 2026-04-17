package com.isprid.kendare.model;

import a0.h;
import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.internal.fuseable.QueueFuseable;
import kc.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m2.i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b@\u0010AJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\u0086\u0001\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\u0019\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001cHÖ\u0001R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b*\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b+\u0010)R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b,\u0010)R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b-\u0010)R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b.\u0010)R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010/\u001a\u0004\b0\u0010\u000bR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010/\u001a\u0004\b1\u0010\u000bR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010'\u001a\u0004\b2\u0010)R\"\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00103\u001a\u0004\b\u0018\u00104\"\u0004\b5\u00106R*\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b8\u00109\u0012\u0004\b>\u0010?\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006B"}, d2 = {"Lcom/isprid/kendare/model/DPurchasePlan;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "component5", "component6", "", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "id", "planName", "productId", "productType", "description", "prefName", "needAccount", "showOffer", "offerText", "isPurchased", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Z)Lcom/isprid/kendare/model/DPurchasePlan;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getPlanName", "getProductId", "getProductType", "getDescription", "getPrefName", "Ljava/lang/Boolean;", "getNeedAccount", "getShowOffer", "getOfferText", "Z", "()Z", "setPurchased", "(Z)V", "Lm2/i;", "productDetails", "Lm2/i;", "getProductDetails", "()Lm2/i;", "setProductDetails", "(Lm2/i;)V", "getProductDetails$annotations", "()V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Z)V", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class DPurchasePlan implements Parcelable {
    public static final Parcelable.Creator<DPurchasePlan> CREATOR = new Creator();
    private final String description;
    private final String id;
    private boolean isPurchased;
    private final Boolean needAccount;
    private final String offerText;
    private final String planName;
    private final String prefName;
    private i productDetails;
    private final String productId;
    private final String productType;
    private final Boolean showOffer;

    @Metadata(k = 3, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DPurchasePlan> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DPurchasePlan createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.f(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DPurchasePlan(string, string2, string3, string4, string5, string6, boolValueOf, boolValueOf2, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DPurchasePlan[] newArray(int i10) {
            return new DPurchasePlan[i10];
        }
    }

    public DPurchasePlan() {
        this(null, null, null, null, null, null, null, null, null, false, 1023, null);
    }

    public static /* synthetic */ void getProductDetails$annotations() {
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.isPurchased;
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

    public final Boolean component7() {
        return this.needAccount;
    }

    public final Boolean component8() {
        return this.showOffer;
    }

    public final String component9() {
        return this.offerText;
    }

    public final DPurchasePlan copy(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, boolean z7) {
        return new DPurchasePlan(str, str2, str3, str4, str5, str6, bool, bool2, str7, z7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DPurchasePlan)) {
            return false;
        }
        DPurchasePlan dPurchasePlan = (DPurchasePlan) obj;
        return Intrinsics.a(this.id, dPurchasePlan.id) && Intrinsics.a(this.planName, dPurchasePlan.planName) && Intrinsics.a(this.productId, dPurchasePlan.productId) && Intrinsics.a(this.productType, dPurchasePlan.productType) && Intrinsics.a(this.description, dPurchasePlan.description) && Intrinsics.a(this.prefName, dPurchasePlan.prefName) && Intrinsics.a(this.needAccount, dPurchasePlan.needAccount) && Intrinsics.a(this.showOffer, dPurchasePlan.showOffer) && Intrinsics.a(this.offerText, dPurchasePlan.offerText) && this.isPurchased == dPurchasePlan.isPurchased;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final Boolean getNeedAccount() {
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

    public final i getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final Boolean getShowOffer() {
        return this.showOffer;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        Boolean bool = this.needAccount;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showOffer;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.offerText;
        int iHashCode9 = (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        boolean z7 = this.isPurchased;
        int i10 = z7;
        if (z7 != 0) {
            i10 = 1;
        }
        return iHashCode9 + i10;
    }

    public final boolean isPurchased() {
        return this.isPurchased;
    }

    public final void setProductDetails(i iVar) {
        this.productDetails = iVar;
    }

    public final void setPurchased(boolean z7) {
        this.isPurchased = z7;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.planName;
        String str3 = this.productId;
        String str4 = this.productType;
        String str5 = this.description;
        String str6 = this.prefName;
        Boolean bool = this.needAccount;
        Boolean bool2 = this.showOffer;
        String str7 = this.offerText;
        boolean z7 = this.isPurchased;
        StringBuilder sbB = h.B("DPurchasePlan(id=", str, ", planName=", str2, ", productId=");
        r.m(sbB, str3, ", productType=", str4, ", description=");
        r.m(sbB, str5, ", prefName=", str6, ", needAccount=");
        sbB.append(bool);
        sbB.append(", showOffer=");
        sbB.append(bool2);
        sbB.append(", offerText=");
        sbB.append(str7);
        sbB.append(", isPurchased=");
        sbB.append(z7);
        sbB.append(")");
        return sbB.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        Intrinsics.f(out, "out");
        out.writeString(this.id);
        out.writeString(this.planName);
        out.writeString(this.productId);
        out.writeString(this.productType);
        out.writeString(this.description);
        out.writeString(this.prefName);
        Boolean bool = this.needAccount;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.showOffer;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        out.writeString(this.offerText);
        out.writeInt(this.isPurchased ? 1 : 0);
    }

    public DPurchasePlan(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, boolean z7) {
        this.id = str;
        this.planName = str2;
        this.productId = str3;
        this.productType = str4;
        this.description = str5;
        this.prefName = str6;
        this.needAccount = bool;
        this.showOffer = bool2;
        this.offerText = str7;
        this.isPurchased = z7;
    }

    public /* synthetic */ DPurchasePlan(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, boolean z7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? Boolean.FALSE : bool, (i10 & 128) != 0 ? Boolean.FALSE : bool2, (i10 & 256) == 0 ? str7 : null, (i10 & 512) != 0 ? false : z7);
    }
}