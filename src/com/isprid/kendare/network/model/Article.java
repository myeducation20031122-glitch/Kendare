package com.isprid.kendare.network.model;

import a0.h;
import com.squareup.moshi.Json;
import io.reactivex.internal.fuseable.QueueFuseable;
import kc.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/isprid/kendare/network/model/Article;", "", "id", "", "title", "icon", "description", "isPremium", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getIcon", "getId", "setId", "(Ljava/lang/String;)V", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class Article {

    @Json(name = "description")
    private final String description;

    @Json(name = "icon")
    private final String icon;

    @Json(name = "id")
    private String id;

    @Json(name = "is_premium")
    private final String isPremium;

    @Json(name = "title")
    private final String title;

    public Article() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Article copy$default(Article article, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = article.id;
        }
        if ((i10 & 2) != 0) {
            str2 = article.title;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = article.icon;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = article.description;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = article.isPremium;
        }
        return article.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.icon;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.isPremium;
    }

    public final Article copy(@Json(name = "id") String str, @Json(name = "title") String str2, @Json(name = "icon") String str3, @Json(name = "description") String str4, @Json(name = "is_premium") String str5) {
        return new Article(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Article)) {
            return false;
        }
        Article article = (Article) obj;
        return Intrinsics.a(this.id, article.id) && Intrinsics.a(this.title, article.title) && Intrinsics.a(this.icon, article.icon) && Intrinsics.a(this.description, article.description) && Intrinsics.a(this.isPremium, article.isPremium);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.isPremium;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String isPremium() {
        return this.isPremium;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.icon;
        String str4 = this.description;
        String str5 = this.isPremium;
        StringBuilder sbB = h.B("Article(id=", str, ", title=", str2, ", icon=");
        r.m(sbB, str3, ", description=", str4, ", isPremium=");
        return r.g(sbB, str5, ")");
    }

    public Article(@Json(name = "id") String str, @Json(name = "title") String str2, @Json(name = "icon") String str3, @Json(name = "description") String str4, @Json(name = "is_premium") String str5) {
        this.id = str;
        this.title = str2;
        this.icon = str3;
        this.description = str4;
        this.isPremium = str5;
    }

    public /* synthetic */ Article(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }
}