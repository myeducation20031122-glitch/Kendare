package com.isprid.kendare.model;

import a0.h;
import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.internal.fuseable.QueueFuseable;
import kc.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u000fJb\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\"J\t\u0010#\u001a\u00020$HÖ\u0001J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020$HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020$HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\r¨\u0006/"}, d2 = {"Lcom/isprid/kendare/model/DDevice;", "Landroid/os/Parcelable;", "deviceId", "", "deviceName", "androidVersion", "versionName", "versionCode", "devicePushToken", "appType", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAndroidVersion", "()Ljava/lang/String;", "getAppType", "()Ljava/lang/Boolean;", "setAppType", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getDeviceId", "getDeviceName", "getDevicePushToken", "setDevicePushToken", "(Ljava/lang/String;)V", "getVersionCode", "getVersionName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/isprid/kendare/model/DDevice;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class DDevice implements Parcelable {
    public static final Parcelable.Creator<DDevice> CREATOR = new Creator();
    private final String androidVersion;
    private Boolean appType;
    private final String deviceId;
    private final String deviceName;
    private String devicePushToken;
    private final String versionCode;
    private final String versionName;

    @Metadata(k = 3, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DDevice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DDevice createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
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
            return new DDevice(string, string2, string3, string4, string5, string6, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DDevice[] newArray(int i10) {
            return new DDevice[i10];
        }
    }

    public DDevice() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ DDevice copy$default(DDevice dDevice, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dDevice.deviceId;
        }
        if ((i10 & 2) != 0) {
            str2 = dDevice.deviceName;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = dDevice.androidVersion;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = dDevice.versionName;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = dDevice.versionCode;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = dDevice.devicePushToken;
        }
        String str11 = str6;
        if ((i10 & 64) != 0) {
            bool = dDevice.appType;
        }
        return dDevice.copy(str, str7, str8, str9, str10, str11, bool);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final String component2() {
        return this.deviceName;
    }

    public final String component3() {
        return this.androidVersion;
    }

    public final String component4() {
        return this.versionName;
    }

    public final String component5() {
        return this.versionCode;
    }

    public final String component6() {
        return this.devicePushToken;
    }

    public final Boolean component7() {
        return this.appType;
    }

    public final DDevice copy(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool) {
        return new DDevice(str, str2, str3, str4, str5, str6, bool);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DDevice)) {
            return false;
        }
        DDevice dDevice = (DDevice) obj;
        return Intrinsics.a(this.deviceId, dDevice.deviceId) && Intrinsics.a(this.deviceName, dDevice.deviceName) && Intrinsics.a(this.androidVersion, dDevice.androidVersion) && Intrinsics.a(this.versionName, dDevice.versionName) && Intrinsics.a(this.versionCode, dDevice.versionCode) && Intrinsics.a(this.devicePushToken, dDevice.devicePushToken) && Intrinsics.a(this.appType, dDevice.appType);
    }

    public final String getAndroidVersion() {
        return this.androidVersion;
    }

    public final Boolean getAppType() {
        return this.appType;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getDevicePushToken() {
        return this.devicePushToken;
    }

    public final String getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        String str = this.deviceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deviceName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.androidVersion;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.versionName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.versionCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.devicePushToken;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.appType;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setAppType(Boolean bool) {
        this.appType = bool;
    }

    public final void setDevicePushToken(String str) {
        this.devicePushToken = str;
    }

    public String toString() {
        String str = this.deviceId;
        String str2 = this.deviceName;
        String str3 = this.androidVersion;
        String str4 = this.versionName;
        String str5 = this.versionCode;
        String str6 = this.devicePushToken;
        Boolean bool = this.appType;
        StringBuilder sbB = h.B("DDevice(deviceId=", str, ", deviceName=", str2, ", androidVersion=");
        r.m(sbB, str3, ", versionName=", str4, ", versionCode=");
        r.m(sbB, str5, ", devicePushToken=", str6, ", appType=");
        sbB.append(bool);
        sbB.append(")");
        return sbB.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        int iBooleanValue;
        Intrinsics.f(out, "out");
        out.writeString(this.deviceId);
        out.writeString(this.deviceName);
        out.writeString(this.androidVersion);
        out.writeString(this.versionName);
        out.writeString(this.versionCode);
        out.writeString(this.devicePushToken);
        Boolean bool = this.appType;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            out.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        out.writeInt(iBooleanValue);
    }

    public DDevice(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool) {
        this.deviceId = str;
        this.deviceName = str2;
        this.androidVersion = str3;
        this.versionName = str4;
        this.versionCode = str5;
        this.devicePushToken = str6;
        this.appType = bool;
    }

    public /* synthetic */ DDevice(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : bool);
    }
}