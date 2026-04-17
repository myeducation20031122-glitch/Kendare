package z1;

import android.app.Notification;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f19474a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19475b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f19476c;

    public h(int i10, int i11, Notification notification) {
        this.f19474a = i10;
        this.f19476c = notification;
        this.f19475b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f19474a == hVar.f19474a && this.f19475b == hVar.f19475b) {
            return this.f19476c.equals(hVar.f19476c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19476c.hashCode() + (((this.f19474a * 31) + this.f19475b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f19474a + ", mForegroundServiceType=" + this.f19475b + ", mNotification=" + this.f19476c + '}';
    }
}