package com.isprid.kendare.model;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.internal.fuseable.QueueFuseable;
import kc.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013Jb\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000f¨\u00064"}, d2 = {"Lcom/isprid/kendare/model/Condition;", "Landroid/os/Parcelable;", "id", "", "condition", "", "conditionDetail", "titleEn", "titleSn", "orderNo", "predictionCount", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCondition", "()Ljava/lang/String;", "setCondition", "(Ljava/lang/String;)V", "getConditionDetail", "setConditionDetail", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOrderNo", "setOrderNo", "getPredictionCount", "setPredictionCount", "getTitleEn", "setTitleEn", "getTitleSn", "setTitleSn", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/isprid/kendare/model/Condition;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class Condition implements Parcelable {
    public static final Parcelable.Creator<Condition> CREATOR = new Creator();
    private String condition;
    private String conditionDetail;
    private Integer id;
    private Integer orderNo;
    private Integer predictionCount;
    private String titleEn;
    private String titleSn;

    @Metadata(k = 3, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Condition> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Condition createFromParcel(Parcel parcel) {
            Intrinsics.f(parcel, "parcel");
            return new Condition(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Condition[] newArray(int i10) {
            return new Condition[i10];
        }
    }

    public Condition(Integer num, String str, String str2, String str3, String str4, Integer num2, Integer num3) {
        this.id = num;
        this.condition = str;
        this.conditionDetail = str2;
        this.titleEn = str3;
        this.titleSn = str4;
        this.orderNo = num2;
        this.predictionCount = num3;
    }

    public static /* synthetic */ Condition copy$default(Condition condition, Integer num, String str, String str2, String str3, String str4, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = condition.id;
        }
        if ((i10 & 2) != 0) {
            str = condition.condition;
        }
        String str5 = str;
        if ((i10 & 4) != 0) {
            str2 = condition.conditionDetail;
        }
        String str6 = str2;
        if ((i10 & 8) != 0) {
            str3 = condition.titleEn;
        }
        String str7 = str3;
        if ((i10 & 16) != 0) {
            str4 = condition.titleSn;
        }
        String str8 = str4;
        if ((i10 & 32) != 0) {
            num2 = condition.orderNo;
        }
        Integer num4 = num2;
        if ((i10 & 64) != 0) {
            num3 = condition.predictionCount;
        }
        return condition.copy(num, str5, str6, str7, str8, num4, num3);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.condition;
    }

    public final String component3() {
        return this.conditionDetail;
    }

    public final String component4() {
        return this.titleEn;
    }

    public final String component5() {
        return this.titleSn;
    }

    public final Integer component6() {
        return this.orderNo;
    }

    public final Integer component7() {
        return this.predictionCount;
    }

    public final Condition copy(Integer num, String str, String str2, String str3, String str4, Integer num2, Integer num3) {
        return new Condition(num, str, str2, str3, str4, num2, num3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Condition)) {
            return false;
        }
        Condition condition = (Condition) obj;
        return Intrinsics.a(this.id, condition.id) && Intrinsics.a(this.condition, condition.condition) && Intrinsics.a(this.conditionDetail, condition.conditionDetail) && Intrinsics.a(this.titleEn, condition.titleEn) && Intrinsics.a(this.titleSn, condition.titleSn) && Intrinsics.a(this.orderNo, condition.orderNo) && Intrinsics.a(this.predictionCount, condition.predictionCount);
    }

    public final String getCondition() {
        return this.condition;
    }

    public final String getConditionDetail() {
        return this.conditionDetail;
    }

    public final Integer getId() {
        return this.id;
    }

    public final Integer getOrderNo() {
        return this.orderNo;
    }

    public final Integer getPredictionCount() {
        return this.predictionCount;
    }

    public final String getTitleEn() {
        return this.titleEn;
    }

    public final String getTitleSn() {
        return this.titleSn;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.condition;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.conditionDetail;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.titleEn;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.titleSn;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.orderNo;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.predictionCount;
        return iHashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setCondition(String str) {
        this.condition = str;
    }

    public final void setConditionDetail(String str) {
        this.conditionDetail = str;
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    public final void setOrderNo(Integer num) {
        this.orderNo = num;
    }

    public final void setPredictionCount(Integer num) {
        this.predictionCount = num;
    }

    public final void setTitleEn(String str) {
        this.titleEn = str;
    }

    public final void setTitleSn(String str) {
        this.titleSn = str;
    }

    public String toString() {
        Integer num = this.id;
        String str = this.condition;
        String str2 = this.conditionDetail;
        String str3 = this.titleEn;
        String str4 = this.titleSn;
        Integer num2 = this.orderNo;
        Integer num3 = this.predictionCount;
        StringBuilder sb = new StringBuilder("Condition(id=");
        sb.append(num);
        sb.append(", condition=");
        sb.append(str);
        sb.append(", conditionDetail=");
        r.m(sb, str2, ", titleEn=", str3, ", titleSn=");
        sb.append(str4);
        sb.append(", orderNo=");
        sb.append(num2);
        sb.append(", predictionCount=");
        sb.append(num3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        Intrinsics.f(out, "out");
        Integer num = this.id;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.condition);
        out.writeString(this.conditionDetail);
        out.writeString(this.titleEn);
        out.writeString(this.titleSn);
        Integer num2 = this.orderNo;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        Integer num3 = this.predictionCount;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
    }

    public /* synthetic */ Condition(Integer num, String str, String str2, String str3, String str4, Integer num2, Integer num3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? -1 : num, str, str2, str3, str4, num2, num3);
    }
}