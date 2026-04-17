package t5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q extends b5.a {
    public static final Parcelable.Creator<q> CREATOR = new x4.n(20);

    /* renamed from: b, reason: collision with root package name */
    public final String f17558b;

    /* renamed from: e, reason: collision with root package name */
    public final p f17559e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17560f;

    /* renamed from: j, reason: collision with root package name */
    public final long f17561j;

    public q(String str, p pVar, String str2, long j10) {
        this.f17558b = str;
        this.f17559e = pVar;
        this.f17560f = str2;
        this.f17561j = j10;
    }

    public final String toString() {
        return "origin=" + this.f17560f + ",name=" + this.f17558b + ",params=" + String.valueOf(this.f17559e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        x4.n.a(this, parcel, i10);
    }

    public q(q qVar, long j10) {
        fc.t.k(qVar);
        this.f17558b = qVar.f17558b;
        this.f17559e = qVar.f17559e;
        this.f17560f = qVar.f17560f;
        this.f17561j = j10;
    }
}