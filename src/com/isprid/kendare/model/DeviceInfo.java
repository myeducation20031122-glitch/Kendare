package com.isprid.kendare.model;

import a0.h;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.Serializable;
import kc.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/isprid/kendare/model/DeviceInfo;", "Ljava/io/Serializable;", "appVersion", "", "deviceId", "deviceName", "osVersion", "regid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppVersion", "()Ljava/lang/String;", "getDeviceId", "getDeviceName", "getOsVersion", "getRegid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class DeviceInfo implements Serializable {
    private final String appVersion;
    private final String deviceId;
    private final String deviceName;
    private final String osVersion;
    private final String regid;

    public DeviceInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deviceInfo.appVersion;
        }
        if ((i10 & 2) != 0) {
            str2 = deviceInfo.deviceId;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = deviceInfo.deviceName;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = deviceInfo.osVersion;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = deviceInfo.regid;
        }
        return deviceInfo.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.appVersion;
    }

    public final String component2() {
        return this.deviceId;
    }

    public final String component3() {
        return this.deviceName;
    }

    public final String component4() {
        return this.osVersion;
    }

    public final String component5() {
        return this.regid;
    }

    public final DeviceInfo copy(String str, String str2, String str3, String str4, String str5) {
        return new DeviceInfo(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return Intrinsics.a(this.appVersion, deviceInfo.appVersion) && Intrinsics.a(this.deviceId, deviceInfo.deviceId) && Intrinsics.a(this.deviceName, deviceInfo.deviceName) && Intrinsics.a(this.osVersion, deviceInfo.osVersion) && Intrinsics.a(this.regid, deviceInfo.regid);
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getRegid() {
        return this.regid;
    }

    public int hashCode() {
        String str = this.appVersion;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deviceId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.osVersion;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.regid;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.appVersion;
        String str2 = this.deviceId;
        String str3 = this.deviceName;
        String str4 = this.osVersion;
        String str5 = this.regid;
        StringBuilder sbB = h.B("DeviceInfo(appVersion=", str, ", deviceId=", str2, ", deviceName=");
        r.m(sbB, str3, ", osVersion=", str4, ", regid=");
        return r.g(sbB, str5, ")");
    }

    public DeviceInfo(String str, String str2, String str3, String str4, String str5) {
        this.appVersion = str;
        this.deviceId = str2;
        this.deviceName = str3;
        this.osVersion = str4;
        this.regid = str5;
    }

    public /* synthetic */ DeviceInfo(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }
}