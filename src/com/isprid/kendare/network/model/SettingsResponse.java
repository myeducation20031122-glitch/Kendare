package com.isprid.kendare.network.model;

import com.squareup.moshi.Json;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/isprid/kendare/network/model/SettingsResponse;", "", "message", "", "result", "", "payload", "Lcom/isprid/kendare/network/model/Setting;", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/isprid/kendare/network/model/Setting;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getPayload", "()Lcom/isprid/kendare/network/model/Setting;", "setPayload", "(Lcom/isprid/kendare/network/model/Setting;)V", "getResult", "()Ljava/lang/Boolean;", "setResult", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/isprid/kendare/network/model/Setting;)Lcom/isprid/kendare/network/model/SettingsResponse;", "equals", "other", "hashCode", "", "toString", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class SettingsResponse {

    @Json(name = "message")
    private String message;

    @Json(name = "payload")
    private Setting payload;

    @Json(name = "result")
    private Boolean result;

    public SettingsResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SettingsResponse copy$default(SettingsResponse settingsResponse, String str, Boolean bool, Setting setting, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = settingsResponse.message;
        }
        if ((i10 & 2) != 0) {
            bool = settingsResponse.result;
        }
        if ((i10 & 4) != 0) {
            setting = settingsResponse.payload;
        }
        return settingsResponse.copy(str, bool, setting);
    }

    public final String component1() {
        return this.message;
    }

    public final Boolean component2() {
        return this.result;
    }

    public final Setting component3() {
        return this.payload;
    }

    public final SettingsResponse copy(@Json(name = "message") String str, @Json(name = "result") Boolean bool, @Json(name = "payload") Setting setting) {
        return new SettingsResponse(str, bool, setting);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingsResponse)) {
            return false;
        }
        SettingsResponse settingsResponse = (SettingsResponse) obj;
        return Intrinsics.a(this.message, settingsResponse.message) && Intrinsics.a(this.result, settingsResponse.result) && Intrinsics.a(this.payload, settingsResponse.payload);
    }

    public final String getMessage() {
        return this.message;
    }

    public final Setting getPayload() {
        return this.payload;
    }

    public final Boolean getResult() {
        return this.result;
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.result;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Setting setting = this.payload;
        return iHashCode2 + (setting != null ? setting.hashCode() : 0);
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setPayload(Setting setting) {
        this.payload = setting;
    }

    public final void setResult(Boolean bool) {
        this.result = bool;
    }

    public String toString() {
        return "SettingsResponse(message=" + this.message + ", result=" + this.result + ", payload=" + this.payload + ")";
    }

    public SettingsResponse(@Json(name = "message") String str, @Json(name = "result") Boolean bool, @Json(name = "payload") Setting setting) {
        this.message = str;
        this.result = bool;
        this.payload = setting;
    }

    public /* synthetic */ SettingsResponse(String str, Boolean bool, Setting setting, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : setting);
    }
}