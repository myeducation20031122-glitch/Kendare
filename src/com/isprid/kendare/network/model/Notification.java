package com.isprid.kendare.network.model;

import a0.h;
import com.squareup.moshi.Json;
import io.reactivex.internal.fuseable.QueueFuseable;
import kc.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/isprid/kendare/network/model/Notification;", "", "id", "", "noticeTitle", "noticeDescription", "createdDate", "isRead", "isNew", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedDate", "()Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "getNoticeDescription", "getNoticeTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class Notification {

    @Json(name = "created_date")
    private final String createdDate;

    @Json(name = "id")
    private String id;

    @Json(name = "is_new")
    private final String isNew;

    @Json(name = "is_read")
    private final String isRead;

    @Json(name = "notice_description")
    private final String noticeDescription;

    @Json(name = "notice_title")
    private final String noticeTitle;

    public Notification() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Notification copy$default(Notification notification, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notification.id;
        }
        if ((i10 & 2) != 0) {
            str2 = notification.noticeTitle;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = notification.noticeDescription;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = notification.createdDate;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = notification.isRead;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = notification.isNew;
        }
        return notification.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.noticeTitle;
    }

    public final String component3() {
        return this.noticeDescription;
    }

    public final String component4() {
        return this.createdDate;
    }

    public final String component5() {
        return this.isRead;
    }

    public final String component6() {
        return this.isNew;
    }

    public final Notification copy(@Json(name = "id") String str, @Json(name = "notice_title") String str2, @Json(name = "notice_description") String str3, @Json(name = "created_date") String str4, @Json(name = "is_read") String str5, @Json(name = "is_new") String str6) {
        return new Notification(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notification)) {
            return false;
        }
        Notification notification = (Notification) obj;
        return Intrinsics.a(this.id, notification.id) && Intrinsics.a(this.noticeTitle, notification.noticeTitle) && Intrinsics.a(this.noticeDescription, notification.noticeDescription) && Intrinsics.a(this.createdDate, notification.createdDate) && Intrinsics.a(this.isRead, notification.isRead) && Intrinsics.a(this.isNew, notification.isNew);
    }

    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNoticeDescription() {
        return this.noticeDescription;
    }

    public final String getNoticeTitle() {
        return this.noticeTitle;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.noticeTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.noticeDescription;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.createdDate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.isRead;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.isNew;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String isNew() {
        return this.isNew;
    }

    public final String isRead() {
        return this.isRead;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.noticeTitle;
        String str3 = this.noticeDescription;
        String str4 = this.createdDate;
        String str5 = this.isRead;
        String str6 = this.isNew;
        StringBuilder sbB = h.B("Notification(id=", str, ", noticeTitle=", str2, ", noticeDescription=");
        r.m(sbB, str3, ", createdDate=", str4, ", isRead=");
        return r.h(sbB, str5, ", isNew=", str6, ")");
    }

    public Notification(@Json(name = "id") String str, @Json(name = "notice_title") String str2, @Json(name = "notice_description") String str3, @Json(name = "created_date") String str4, @Json(name = "is_read") String str5, @Json(name = "is_new") String str6) {
        this.id = str;
        this.noticeTitle = str2;
        this.noticeDescription = str3;
        this.createdDate = str4;
        this.isRead = str5;
        this.isNew = str6;
    }

    public /* synthetic */ Notification(String str, String str2, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6);
    }
}