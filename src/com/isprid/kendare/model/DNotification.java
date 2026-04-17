package com.isprid.kendare.model;

import a0.h;
import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.internal.fuseable.QueueFuseable;
import kc.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006#"}, d2 = {"Lcom/isprid/kendare/model/DNotification;", "Landroid/os/Parcelable;", "id", "", "noticeTitle", "noticeDescription", "createdDate", "isRead", "isNew", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedDate", "()Ljava/lang/String;", "getId", "getNoticeDescription", "getNoticeTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class DNotification implements Parcelable {
    public static final Parcelable.Creator<DNotification> CREATOR = new Creator();
    private final String createdDate;
    private final String id;
    private final String isNew;
    private final String isRead;
    private final String noticeDescription;
    private final String noticeTitle;

    @Metadata(k = 3, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DNotification> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DNotification createFromParcel(Parcel parcel) {
            Intrinsics.f(parcel, "parcel");
            return new DNotification(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DNotification[] newArray(int i10) {
            return new DNotification[i10];
        }
    }

    public DNotification() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ DNotification copy$default(DNotification dNotification, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dNotification.id;
        }
        if ((i10 & 2) != 0) {
            str2 = dNotification.noticeTitle;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = dNotification.noticeDescription;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = dNotification.createdDate;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = dNotification.isRead;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = dNotification.isNew;
        }
        return dNotification.copy(str, str7, str8, str9, str10, str6);
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

    public final DNotification copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new DNotification(str, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DNotification)) {
            return false;
        }
        DNotification dNotification = (DNotification) obj;
        return Intrinsics.a(this.id, dNotification.id) && Intrinsics.a(this.noticeTitle, dNotification.noticeTitle) && Intrinsics.a(this.noticeDescription, dNotification.noticeDescription) && Intrinsics.a(this.createdDate, dNotification.createdDate) && Intrinsics.a(this.isRead, dNotification.isRead) && Intrinsics.a(this.isNew, dNotification.isNew);
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

    public String toString() {
        String str = this.id;
        String str2 = this.noticeTitle;
        String str3 = this.noticeDescription;
        String str4 = this.createdDate;
        String str5 = this.isRead;
        String str6 = this.isNew;
        StringBuilder sbB = h.B("DNotification(id=", str, ", noticeTitle=", str2, ", noticeDescription=");
        r.m(sbB, str3, ", createdDate=", str4, ", isRead=");
        return r.h(sbB, str5, ", isNew=", str6, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        Intrinsics.f(out, "out");
        out.writeString(this.id);
        out.writeString(this.noticeTitle);
        out.writeString(this.noticeDescription);
        out.writeString(this.createdDate);
        out.writeString(this.isRead);
        out.writeString(this.isNew);
    }

    public DNotification(String str, String str2, String str3, String str4, String str5, String str6) {
        this.id = str;
        this.noticeTitle = str2;
        this.noticeDescription = str3;
        this.createdDate = str4;
        this.isRead = str5;
        this.isNew = str6;
    }

    public /* synthetic */ DNotification(String str, String str2, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6);
    }
}