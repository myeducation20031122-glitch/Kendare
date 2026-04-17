package com.isprid.kendare.model;

import a0.h;
import com.google.android.libraries.places.api.model.PlaceTypes;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006%"}, d2 = {"Lcom/isprid/kendare/model/DHospitalPlace;", "Ljava/io/Serializable;", "id", "", "placeName", PlaceTypes.COUNTRY, "longitude", "", "latitude", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", "getId", "setId", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "setLongitude", "getPlaceName", "setPlaceName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class DHospitalPlace implements Serializable {
    private String country;
    private String id;
    private double latitude;
    private double longitude;
    private String placeName;

    public DHospitalPlace() {
        this(null, null, null, 0.0d, 0.0d, 31, null);
    }

    public static /* synthetic */ DHospitalPlace copy$default(DHospitalPlace dHospitalPlace, String str, String str2, String str3, double d10, double d11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dHospitalPlace.id;
        }
        if ((i10 & 2) != 0) {
            str2 = dHospitalPlace.placeName;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = dHospitalPlace.country;
        }
        String str5 = str3;
        if ((i10 & 8) != 0) {
            d10 = dHospitalPlace.longitude;
        }
        double d12 = d10;
        if ((i10 & 16) != 0) {
            d11 = dHospitalPlace.latitude;
        }
        return dHospitalPlace.copy(str, str4, str5, d12, d11);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.placeName;
    }

    public final String component3() {
        return this.country;
    }

    public final double component4() {
        return this.longitude;
    }

    public final double component5() {
        return this.latitude;
    }

    public final DHospitalPlace copy(String str, String str2, String str3, double d10, double d11) {
        return new DHospitalPlace(str, str2, str3, d10, d11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DHospitalPlace)) {
            return false;
        }
        DHospitalPlace dHospitalPlace = (DHospitalPlace) obj;
        return Intrinsics.a(this.id, dHospitalPlace.id) && Intrinsics.a(this.placeName, dHospitalPlace.placeName) && Intrinsics.a(this.country, dHospitalPlace.country) && Double.compare(this.longitude, dHospitalPlace.longitude) == 0 && Double.compare(this.latitude, dHospitalPlace.latitude) == 0;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getId() {
        return this.id;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getPlaceName() {
        return this.placeName;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.placeName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.longitude);
        int i10 = (iHashCode3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.latitude);
        return i10 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLatitude(double d10) {
        this.latitude = d10;
    }

    public final void setLongitude(double d10) {
        this.longitude = d10;
    }

    public final void setPlaceName(String str) {
        this.placeName = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.placeName;
        String str3 = this.country;
        double d10 = this.longitude;
        double d11 = this.latitude;
        StringBuilder sbB = h.B("DHospitalPlace(id=", str, ", placeName=", str2, ", country=");
        sbB.append(str3);
        sbB.append(", longitude=");
        sbB.append(d10);
        sbB.append(", latitude=");
        sbB.append(d11);
        sbB.append(")");
        return sbB.toString();
    }

    public DHospitalPlace(String str, String str2, String str3, double d10, double d11) {
        this.id = str;
        this.placeName = str2;
        this.country = str3;
        this.longitude = d10;
        this.latitude = d11;
    }

    public /* synthetic */ DHospitalPlace(String str, String str2, String str3, double d10, double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) == 0 ? str3 : null, (i10 & 8) != 0 ? 0.0d : d10, (i10 & 16) != 0 ? 0.0d : d11);
    }
}