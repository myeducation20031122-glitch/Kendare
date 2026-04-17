package com.isprid.kendare.model;

import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÆ\u0003J2\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/isprid/kendare/model/Success;", "", "message", "", "result", "", "payload", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Object;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getPayload", "()Ljava/lang/Object;", "setPayload", "(Ljava/lang/Object;)V", "getResult", "()Ljava/lang/Boolean;", "setResult", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Object;)Lcom/isprid/kendare/model/Success;", "equals", "other", "hashCode", "", "toString", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class Success {
    private String message;
    private Object payload;
    private Boolean result;

    public Success(String str, Boolean bool, Object obj) {
        this.message = str;
        this.result = bool;
        this.payload = obj;
    }

    public static /* synthetic */ Success copy$default(Success success, String str, Boolean bool, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = success.message;
        }
        if ((i10 & 2) != 0) {
            bool = success.result;
        }
        if ((i10 & 4) != 0) {
            obj = success.payload;
        }
        return success.copy(str, bool, obj);
    }

    public final String component1() {
        return this.message;
    }

    public final Boolean component2() {
        return this.result;
    }

    public final Object component3() {
        return this.payload;
    }

    public final Success copy(String str, Boolean bool, Object obj) {
        return new Success(str, bool, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Success)) {
            return false;
        }
        Success success = (Success) obj;
        return Intrinsics.a(this.message, success.message) && Intrinsics.a(this.result, success.result) && Intrinsics.a(this.payload, success.payload);
    }

    public final String getMessage() {
        return this.message;
    }

    public final Object getPayload() {
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
        Object obj = this.payload;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setPayload(Object obj) {
        this.payload = obj;
    }

    public final void setResult(Boolean bool) {
        this.result = bool;
    }

    public String toString() {
        return "Success(message=" + this.message + ", result=" + this.result + ", payload=" + this.payload + ")";
    }
}