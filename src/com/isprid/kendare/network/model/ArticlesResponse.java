package com.isprid.kendare.network.model;

import com.squareup.moshi.Json;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J8\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/isprid/kendare/network/model/ArticlesResponse;", "", "message", "", "result", "", "payload", "", "Lcom/isprid/kendare/network/model/Article;", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getPayload", "()Ljava/util/List;", "setPayload", "(Ljava/util/List;)V", "getResult", "()Ljava/lang/Boolean;", "setResult", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lcom/isprid/kendare/network/model/ArticlesResponse;", "equals", "other", "hashCode", "", "toString", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class ArticlesResponse {

    @Json(name = "message")
    private String message;

    @Json(name = "payload")
    private List<Article> payload;

    @Json(name = "result")
    private Boolean result;

    public ArticlesResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArticlesResponse copy$default(ArticlesResponse articlesResponse, String str, Boolean bool, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = articlesResponse.message;
        }
        if ((i10 & 2) != 0) {
            bool = articlesResponse.result;
        }
        if ((i10 & 4) != 0) {
            list = articlesResponse.payload;
        }
        return articlesResponse.copy(str, bool, list);
    }

    public final String component1() {
        return this.message;
    }

    public final Boolean component2() {
        return this.result;
    }

    public final List<Article> component3() {
        return this.payload;
    }

    public final ArticlesResponse copy(@Json(name = "message") String str, @Json(name = "result") Boolean bool, @Json(name = "payload") List<Article> list) {
        return new ArticlesResponse(str, bool, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticlesResponse)) {
            return false;
        }
        ArticlesResponse articlesResponse = (ArticlesResponse) obj;
        return Intrinsics.a(this.message, articlesResponse.message) && Intrinsics.a(this.result, articlesResponse.result) && Intrinsics.a(this.payload, articlesResponse.payload);
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<Article> getPayload() {
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
        List<Article> list = this.payload;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setPayload(List<Article> list) {
        this.payload = list;
    }

    public final void setResult(Boolean bool) {
        this.result = bool;
    }

    public String toString() {
        return "ArticlesResponse(message=" + this.message + ", result=" + this.result + ", payload=" + this.payload + ")";
    }

    public ArticlesResponse(@Json(name = "message") String str, @Json(name = "result") Boolean bool, @Json(name = "payload") List<Article> list) {
        this.message = str;
        this.result = bool;
        this.payload = list;
    }

    public /* synthetic */ ArticlesResponse(String str, Boolean bool, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : list);
    }
}