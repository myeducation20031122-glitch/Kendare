package com.isprid.kendare.network.util;

import io.reactivex.internal.fuseable.QueueFuseable;
import kc.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/isprid/kendare/network/util/Resource;", "T", "", "state", "Lcom/isprid/kendare/network/util/ResourceState;", "data", "message", "", "(Lcom/isprid/kendare/network/util/ResourceState;Ljava/lang/Object;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getState", "()Lcom/isprid/kendare/network/util/ResourceState;", "component1", "component2", "component3", "copy", "(Lcom/isprid/kendare/network/util/ResourceState;Ljava/lang/Object;Ljava/lang/String;)Lcom/isprid/kendare/network/util/Resource;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class Resource<T> {
    private final T data;
    private final String message;
    private final ResourceState state;

    public Resource(ResourceState state, T t10, String str) {
        Intrinsics.f(state, "state");
        this.state = state;
        this.data = t10;
        this.message = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Resource copy$default(Resource resource, ResourceState resourceState, Object obj, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            resourceState = resource.state;
        }
        if ((i10 & 2) != 0) {
            obj = resource.data;
        }
        if ((i10 & 4) != 0) {
            str = resource.message;
        }
        return resource.copy(resourceState, obj, str);
    }

    public final ResourceState component1() {
        return this.state;
    }

    public final T component2() {
        return this.data;
    }

    public final String component3() {
        return this.message;
    }

    public final Resource<T> copy(ResourceState state, T t10, String str) {
        Intrinsics.f(state, "state");
        return new Resource<>(state, t10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) obj;
        return Intrinsics.a(this.state, resource.state) && Intrinsics.a(this.data, resource.data) && Intrinsics.a(this.message, resource.message);
    }

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final ResourceState getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        T t10 = this.data;
        int iHashCode2 = (iHashCode + (t10 == null ? 0 : t10.hashCode())) * 31;
        String str = this.message;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        ResourceState resourceState = this.state;
        T t10 = this.data;
        String str = this.message;
        StringBuilder sb = new StringBuilder("Resource(state=");
        sb.append(resourceState);
        sb.append(", data=");
        sb.append(t10);
        sb.append(", message=");
        return r.g(sb, str, ")");
    }

    public /* synthetic */ Resource(ResourceState resourceState, Object obj, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(resourceState, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? null : str);
    }
}