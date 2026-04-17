package com.isprid.kendare.network.model;

import a0.h;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.moshi.Json;
import io.reactivex.internal.fuseable.QueueFuseable;
import kc.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\n\"\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/isprid/kendare/network/model/HospitalPlace;", "", "id", "", "placeName", "longitude", "latitude", PlaceTypes.COUNTRY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "getLatitude", "getLongitude", "getPlaceName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class HospitalPlace {

    @Json(name = PlaceTypes.COUNTRY)
    private final String country;

    @Json(name = "id")
    private String id;

    @Json(name = "latitude")
    private final String latitude;

    @Json(name = "longitude")
    private final String longitude;

    @Json(name = "place_name")
    private final String placeName;

    public HospitalPlace() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ HospitalPlace copy$default(HospitalPlace hospitalPlace, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = hospitalPlace.id;
        }
        if ((i10 & 2) != 0) {
            str2 = hospitalPlace.placeName;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = hospitalPlace.longitude;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = hospitalPlace.latitude;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = hospitalPlace.country;
        }
        return hospitalPlace.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.placeName;
    }

    public final String component3() {
        return this.longitude;
    }

    public final String component4() {
        return this.latitude;
    }

    public final String component5() {
        return this.country;
    }

    public final HospitalPlace copy(@Json(name = "id") String str, @Json(name = "place_name") String str2, @Json(name = "longitude") String longitude, @Json(name = "latitude") String latitude, @Json(name = PlaceTypes.COUNTRY) String str3) {
        Intrinsics.f(longitude, "longitude");
        Intrinsics.f(latitude, "latitude");
        return new HospitalPlace(str, str2, longitude, latitude, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HospitalPlace)) {
            return false;
        }
        HospitalPlace hospitalPlace = (HospitalPlace) obj;
        return Intrinsics.a(this.id, hospitalPlace.id) && Intrinsics.a(this.placeName, hospitalPlace.placeName) && Intrinsics.a(this.longitude, hospitalPlace.longitude) && Intrinsics.a(this.latitude, hospitalPlace.latitude) && Intrinsics.a(this.country, hospitalPlace.country);
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public final String getPlaceName() {
        return this.placeName;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.placeName;
        int iHashCode2 = (this.latitude.hashCode() + ((this.longitude.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        String str3 = this.country;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setId(String str) {
        this.id = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.placeName;
        String str3 = this.longitude;
        String str4 = this.latitude;
        String str5 = this.country;
        StringBuilder sbB = h.B("HospitalPlace(id=", str, ", placeName=", str2, ", longitude=");
        r.m(sbB, str3, ", latitude=", str4, ", country=");
        return r.g(sbB, str5, ")");
    }

    public HospitalPlace(@Json(name = "id") String str, @Json(name = "place_name") String str2, @Json(name = "longitude") String longitude, @Json(name = "latitude") String latitude, @Json(name = PlaceTypes.COUNTRY) String str3) {
        Intrinsics.f(longitude, "longitude");
        Intrinsics.f(latitude, "latitude");
        this.id = str;
        this.placeName = str2;
        this.longitude = longitude;
        this.latitude = latitude;
        this.country = str3;
    }

    public /* synthetic */ HospitalPlace(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? "0.0" : str3, (i10 & 8) != 0 ? "0.0" : str4, (i10 & 16) != 0 ? null : str5);
    }
}