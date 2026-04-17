package com.isprid.kendare.network.model;

import com.squareup.moshi.Json;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJV\u0010\u001f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\r¨\u0006'"}, d2 = {"Lcom/isprid/kendare/network/model/Paginator;", "", "currentPage", "", "perPage", "from", "to", "total", "lastPage", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCurrentPage", "()Ljava/lang/Integer;", "setCurrentPage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFrom", "setFrom", "getLastPage", "setLastPage", "getPerPage", "setPerPage", "getTo", "setTo", "getTotal", "setTotal", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/isprid/kendare/network/model/Paginator;", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class Paginator {

    @Json(name = "current_page")
    private Integer currentPage;

    @Json(name = "from")
    private Integer from;

    @Json(name = "last_page")
    private Integer lastPage;

    @Json(name = "per_page")
    private Integer perPage;

    @Json(name = "to")
    private Integer to;

    @Json(name = "total")
    private Integer total;

    public Paginator() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Paginator copy$default(Paginator paginator, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = paginator.currentPage;
        }
        if ((i10 & 2) != 0) {
            num2 = paginator.perPage;
        }
        Integer num7 = num2;
        if ((i10 & 4) != 0) {
            num3 = paginator.from;
        }
        Integer num8 = num3;
        if ((i10 & 8) != 0) {
            num4 = paginator.to;
        }
        Integer num9 = num4;
        if ((i10 & 16) != 0) {
            num5 = paginator.total;
        }
        Integer num10 = num5;
        if ((i10 & 32) != 0) {
            num6 = paginator.lastPage;
        }
        return paginator.copy(num, num7, num8, num9, num10, num6);
    }

    public final Integer component1() {
        return this.currentPage;
    }

    public final Integer component2() {
        return this.perPage;
    }

    public final Integer component3() {
        return this.from;
    }

    public final Integer component4() {
        return this.to;
    }

    public final Integer component5() {
        return this.total;
    }

    public final Integer component6() {
        return this.lastPage;
    }

    public final Paginator copy(@Json(name = "current_page") Integer num, @Json(name = "per_page") Integer num2, @Json(name = "from") Integer num3, @Json(name = "to") Integer num4, @Json(name = "total") Integer num5, @Json(name = "last_page") Integer num6) {
        return new Paginator(num, num2, num3, num4, num5, num6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Paginator)) {
            return false;
        }
        Paginator paginator = (Paginator) obj;
        return Intrinsics.a(this.currentPage, paginator.currentPage) && Intrinsics.a(this.perPage, paginator.perPage) && Intrinsics.a(this.from, paginator.from) && Intrinsics.a(this.to, paginator.to) && Intrinsics.a(this.total, paginator.total) && Intrinsics.a(this.lastPage, paginator.lastPage);
    }

    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    public final Integer getFrom() {
        return this.from;
    }

    public final Integer getLastPage() {
        return this.lastPage;
    }

    public final Integer getPerPage() {
        return this.perPage;
    }

    public final Integer getTo() {
        return this.to;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        Integer num = this.currentPage;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.perPage;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.from;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.to;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.total;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.lastPage;
        return iHashCode5 + (num6 != null ? num6.hashCode() : 0);
    }

    public final void setCurrentPage(Integer num) {
        this.currentPage = num;
    }

    public final void setFrom(Integer num) {
        this.from = num;
    }

    public final void setLastPage(Integer num) {
        this.lastPage = num;
    }

    public final void setPerPage(Integer num) {
        this.perPage = num;
    }

    public final void setTo(Integer num) {
        this.to = num;
    }

    public final void setTotal(Integer num) {
        this.total = num;
    }

    public String toString() {
        return "Paginator(currentPage=" + this.currentPage + ", perPage=" + this.perPage + ", from=" + this.from + ", to=" + this.to + ", total=" + this.total + ", lastPage=" + this.lastPage + ")";
    }

    public Paginator(@Json(name = "current_page") Integer num, @Json(name = "per_page") Integer num2, @Json(name = "from") Integer num3, @Json(name = "to") Integer num4, @Json(name = "total") Integer num5, @Json(name = "last_page") Integer num6) {
        this.currentPage = num;
        this.perPage = num2;
        this.from = num3;
        this.to = num4;
        this.total = num5;
        this.lastPage = num6;
    }

    public /* synthetic */ Paginator(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : num3, (i10 & 8) != 0 ? null : num4, (i10 & 16) != 0 ? null : num5, (i10 & 32) != 0 ? null : num6);
    }
}