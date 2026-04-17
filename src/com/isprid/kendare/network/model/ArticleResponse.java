package com.isprid.kendare.network.model;

import com.squareup.moshi.Json;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/isprid/kendare/network/model/ArticleResponse;", "", "message", "", "result", "", "payload", "Lcom/isprid/kendare/network/model/Article;", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/isprid/kendare/network/model/Article;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getPayload", "()Lcom/isprid/kendare/network/model/Article;", "setPayload", "(Lcom/isprid/kendare/network/model/Article;)V", "getResult", "()Ljava/lang/Boolean;", "setResult", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/isprid/kendare/network/model/Article;)Lcom/isprid/kendare/network/model/ArticleResponse;", "equals", "other", "hashCode", "", "toString", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class ArticleResponse {

    @Json(name = "message")
    private String message;

    @Json(name = "payload")
    private Article payload;

    @Json(name = "result")
    private Boolean result;

    public ArticleResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ArticleResponse copy$default(ArticleResponse articleResponse, String str, Boolean bool, Article article, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = articleResponse.message;
        }
        if ((i10 & 2) != 0) {
            bool = articleResponse.result;
        }
        if ((i10 & 4) != 0) {
            article = articleResponse.payload;
        }
        return articleResponse.copy(str, bool, article);
    }

    public final String component1() {
        return this.message;
    }

    public final Boolean component2() {
        return this.result;
    }

    public final Article component3() {
        return this.payload;
    }

    public final ArticleResponse copy(@Json(name = "message") String str, @Json(name = "result") Boolean bool, @Json(name = "payload") Article article) {
        return new ArticleResponse(str, bool, article);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleResponse)) {
            return false;
        }
        ArticleResponse articleResponse = (ArticleResponse) obj;
        return Intrinsics.a(this.message, articleResponse.message) && Intrinsics.a(this.result, articleResponse.result) && Intrinsics.a(this.payload, articleResponse.payload);
    }

    public final String getMessage() {
        return this.message;
    }

    public final Article getPayload() {
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
        Article article = this.payload;
        return iHashCode2 + (article != null ? article.hashCode() : 0);
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setPayload(Article article) {
        this.payload = article;
    }

    public final void setResult(Boolean bool) {
        this.result = bool;
    }

    public String toString() {
        return "ArticleResponse(message=" + this.message + ", result=" + this.result + ", payload=" + this.payload + ")";
    }

    public ArticleResponse(@Json(name = "message") String str, @Json(name = "result") Boolean bool, @Json(name = "payload") Article article) {
        this.message = str;
        this.result = bool;
        this.payload = article;
    }

    public /* synthetic */ ArticleResponse(String str, Boolean bool, Article article, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : article);
    }
}