package com.isprid.kendare.model;

import a0.h;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.Serializable;
import kc.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/isprid/kendare/model/Notice;", "Ljava/io/Serializable;", "nid", "", "title", "description", "publishedDate", "isRead", "isNew", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getNid", "getPublishedDate", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class Notice implements Serializable {
    private final String description;
    private final String isNew;
    private final String isRead;
    private final String nid;
    private final String publishedDate;
    private final String title;

    public Notice(String nid, String title, String description, String publishedDate, String isRead, String isNew) {
        Intrinsics.f(nid, "nid");
        Intrinsics.f(title, "title");
        Intrinsics.f(description, "description");
        Intrinsics.f(publishedDate, "publishedDate");
        Intrinsics.f(isRead, "isRead");
        Intrinsics.f(isNew, "isNew");
        this.nid = nid;
        this.title = title;
        this.description = description;
        this.publishedDate = publishedDate;
        this.isRead = isRead;
        this.isNew = isNew;
    }

    public static /* synthetic */ Notice copy$default(Notice notice, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notice.nid;
        }
        if ((i10 & 2) != 0) {
            str2 = notice.title;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = notice.description;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = notice.publishedDate;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = notice.isRead;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = notice.isNew;
        }
        return notice.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.nid;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.publishedDate;
    }

    public final String component5() {
        return this.isRead;
    }

    public final String component6() {
        return this.isNew;
    }

    public final Notice copy(String nid, String title, String description, String publishedDate, String isRead, String isNew) {
        Intrinsics.f(nid, "nid");
        Intrinsics.f(title, "title");
        Intrinsics.f(description, "description");
        Intrinsics.f(publishedDate, "publishedDate");
        Intrinsics.f(isRead, "isRead");
        Intrinsics.f(isNew, "isNew");
        return new Notice(nid, title, description, publishedDate, isRead, isNew);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notice)) {
            return false;
        }
        Notice notice = (Notice) obj;
        return Intrinsics.a(this.nid, notice.nid) && Intrinsics.a(this.title, notice.title) && Intrinsics.a(this.description, notice.description) && Intrinsics.a(this.publishedDate, notice.publishedDate) && Intrinsics.a(this.isRead, notice.isRead) && Intrinsics.a(this.isNew, notice.isNew);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getNid() {
        return this.nid;
    }

    public final String getPublishedDate() {
        return this.publishedDate;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.isNew.hashCode() + ((this.isRead.hashCode() + ((this.publishedDate.hashCode() + ((this.description.hashCode() + ((this.title.hashCode() + (this.nid.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String isNew() {
        return this.isNew;
    }

    public final String isRead() {
        return this.isRead;
    }

    public String toString() {
        String str = this.nid;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.publishedDate;
        String str5 = this.isRead;
        String str6 = this.isNew;
        StringBuilder sbB = h.B("Notice(nid=", str, ", title=", str2, ", description=");
        r.m(sbB, str3, ", publishedDate=", str4, ", isRead=");
        return r.h(sbB, str5, ", isNew=", str6, ")");
    }
}