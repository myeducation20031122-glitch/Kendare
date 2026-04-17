package com.isprid.kendare.network.model;

import a0.h;
import com.squareup.moshi.Json;
import io.reactivex.internal.fuseable.QueueFuseable;
import kc.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e¨\u0006)"}, d2 = {"Lcom/isprid/kendare/network/model/Device;", "", "id", "", "tripId", "title", "amount", "date", "imageUrl", "createdAt", "createdBy", "remainCount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCreatedAt", "getCreatedBy", "getDate", "getId", "setId", "(Ljava/lang/String;)V", "getImageUrl", "getRemainCount", "getTitle", "getTripId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class Device {

    @Json(name = "amount")
    private final String amount;

    @Json(name = "created_at")
    private final String createdAt;

    @Json(name = "created_by")
    private final String createdBy;

    @Json(name = "date")
    private final String date;

    @Json(name = "id")
    private String id;

    @Json(name = "image_url")
    private final String imageUrl;

    @Json(name = "remain_count")
    private final String remainCount;

    @Json(name = "title")
    private final String title;

    @Json(name = "trip_id")
    private final String tripId;

    public Device() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.tripId;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.amount;
    }

    public final String component5() {
        return this.date;
    }

    public final String component6() {
        return this.imageUrl;
    }

    public final String component7() {
        return this.createdAt;
    }

    public final String component8() {
        return this.createdBy;
    }

    public final String component9() {
        return this.remainCount;
    }

    public final Device copy(@Json(name = "id") String str, @Json(name = "trip_id") String str2, @Json(name = "title") String str3, @Json(name = "amount") String str4, @Json(name = "date") String str5, @Json(name = "image_url") String str6, @Json(name = "created_at") String str7, @Json(name = "created_by") String str8, @Json(name = "remain_count") String str9) {
        return new Device(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        return Intrinsics.a(this.id, device.id) && Intrinsics.a(this.tripId, device.tripId) && Intrinsics.a(this.title, device.title) && Intrinsics.a(this.amount, device.amount) && Intrinsics.a(this.date, device.date) && Intrinsics.a(this.imageUrl, device.imageUrl) && Intrinsics.a(this.createdAt, device.createdAt) && Intrinsics.a(this.createdBy, device.createdBy) && Intrinsics.a(this.remainCount, device.remainCount);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getRemainCount() {
        return this.remainCount;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTripId() {
        return this.tripId;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tripId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.amount;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.date;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.imageUrl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.createdAt;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.createdBy;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.remainCount;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setId(String str) {
        this.id = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.tripId;
        String str3 = this.title;
        String str4 = this.amount;
        String str5 = this.date;
        String str6 = this.imageUrl;
        String str7 = this.createdAt;
        String str8 = this.createdBy;
        String str9 = this.remainCount;
        StringBuilder sbB = h.B("Device(id=", str, ", tripId=", str2, ", title=");
        r.m(sbB, str3, ", amount=", str4, ", date=");
        r.m(sbB, str5, ", imageUrl=", str6, ", createdAt=");
        r.m(sbB, str7, ", createdBy=", str8, ", remainCount=");
        return r.g(sbB, str9, ")");
    }

    public Device(@Json(name = "id") String str, @Json(name = "trip_id") String str2, @Json(name = "title") String str3, @Json(name = "amount") String str4, @Json(name = "date") String str5, @Json(name = "image_url") String str6, @Json(name = "created_at") String str7, @Json(name = "created_by") String str8, @Json(name = "remain_count") String str9) {
        this.id = str;
        this.tripId = str2;
        this.title = str3;
        this.amount = str4;
        this.date = str5;
        this.imageUrl = str6;
        this.createdAt = str7;
        this.createdBy = str8;
        this.remainCount = str9;
    }

    public /* synthetic */ Device(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) == 0 ? str9 : null);
    }
}