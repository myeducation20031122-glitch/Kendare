package com.isprid.kendare.model;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.internal.fuseable.QueueFuseable;
import kc.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J^\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010)J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u00020\u0006HÖ\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018¨\u00066"}, d2 = {"Lcom/isprid/kendare/model/Prediction;", "Landroid/os/Parcelable;", "id", "", "conditionId", "sinhala", "", "english", "related", "howMuch", "book", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getBook", "()I", "setBook", "(I)V", "getConditionId", "()Ljava/lang/Integer;", "setConditionId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getEnglish", "()Ljava/lang/String;", "setEnglish", "(Ljava/lang/String;)V", "getHowMuch", "setHowMuch", "getId", "setId", "getRelated", "setRelated", "getSinhala", "setSinhala", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lcom/isprid/kendare/model/Prediction;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class Prediction implements Parcelable {
    public static final Parcelable.Creator<Prediction> CREATOR = new Creator();
    private int book;
    private Integer conditionId;
    private String english;
    private int howMuch;
    private Integer id;
    private String related;
    private String sinhala;

    @Metadata(k = 3, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Prediction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Prediction createFromParcel(Parcel parcel) {
            Intrinsics.f(parcel, "parcel");
            return new Prediction(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Prediction[] newArray(int i10) {
            return new Prediction[i10];
        }
    }

    public Prediction(Integer num, Integer num2, String str, String str2, String str3, int i10, int i11) {
        this.id = num;
        this.conditionId = num2;
        this.sinhala = str;
        this.english = str2;
        this.related = str3;
        this.howMuch = i10;
        this.book = i11;
    }

    public static /* synthetic */ Prediction copy$default(Prediction prediction, Integer num, Integer num2, String str, String str2, String str3, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            num = prediction.id;
        }
        if ((i12 & 2) != 0) {
            num2 = prediction.conditionId;
        }
        Integer num3 = num2;
        if ((i12 & 4) != 0) {
            str = prediction.sinhala;
        }
        String str4 = str;
        if ((i12 & 8) != 0) {
            str2 = prediction.english;
        }
        String str5 = str2;
        if ((i12 & 16) != 0) {
            str3 = prediction.related;
        }
        String str6 = str3;
        if ((i12 & 32) != 0) {
            i10 = prediction.howMuch;
        }
        int i13 = i10;
        if ((i12 & 64) != 0) {
            i11 = prediction.book;
        }
        return prediction.copy(num, num3, str4, str5, str6, i13, i11);
    }

    public final Integer component1() {
        return this.id;
    }

    public final Integer component2() {
        return this.conditionId;
    }

    public final String component3() {
        return this.sinhala;
    }

    public final String component4() {
        return this.english;
    }

    public final String component5() {
        return this.related;
    }

    public final int component6() {
        return this.howMuch;
    }

    public final int component7() {
        return this.book;
    }

    public final Prediction copy(Integer num, Integer num2, String str, String str2, String str3, int i10, int i11) {
        return new Prediction(num, num2, str, str2, str3, i10, i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Prediction)) {
            return false;
        }
        Prediction prediction = (Prediction) obj;
        return Intrinsics.a(this.id, prediction.id) && Intrinsics.a(this.conditionId, prediction.conditionId) && Intrinsics.a(this.sinhala, prediction.sinhala) && Intrinsics.a(this.english, prediction.english) && Intrinsics.a(this.related, prediction.related) && this.howMuch == prediction.howMuch && this.book == prediction.book;
    }

    public final int getBook() {
        return this.book;
    }

    public final Integer getConditionId() {
        return this.conditionId;
    }

    public final String getEnglish() {
        return this.english;
    }

    public final int getHowMuch() {
        return this.howMuch;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getRelated() {
        return this.related;
    }

    public final String getSinhala() {
        return this.sinhala;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.conditionId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.sinhala;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.english;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.related;
        return ((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.howMuch) * 31) + this.book;
    }

    public final void setBook(int i10) {
        this.book = i10;
    }

    public final void setConditionId(Integer num) {
        this.conditionId = num;
    }

    public final void setEnglish(String str) {
        this.english = str;
    }

    public final void setHowMuch(int i10) {
        this.howMuch = i10;
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    public final void setRelated(String str) {
        this.related = str;
    }

    public final void setSinhala(String str) {
        this.sinhala = str;
    }

    public String toString() {
        Integer num = this.id;
        Integer num2 = this.conditionId;
        String str = this.sinhala;
        String str2 = this.english;
        String str3 = this.related;
        int i10 = this.howMuch;
        int i11 = this.book;
        StringBuilder sb = new StringBuilder("Prediction(id=");
        sb.append(num);
        sb.append(", conditionId=");
        sb.append(num2);
        sb.append(", sinhala=");
        r.m(sb, str, ", english=", str2, ", related=");
        sb.append(str3);
        sb.append(", howMuch=");
        sb.append(i10);
        sb.append(", book=");
        return r.f(sb, i11, ")");
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
        Integer num2 = this.conditionId;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        out.writeString(this.sinhala);
        out.writeString(this.english);
        out.writeString(this.related);
        out.writeInt(this.howMuch);
        out.writeInt(this.book);
    }

    public /* synthetic */ Prediction(Integer num, Integer num2, String str, String str2, String str3, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? -1 : num, num2, str, str2, str3, i10, i11);
    }
}