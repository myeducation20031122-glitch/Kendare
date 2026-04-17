package r7;

import java.io.File;
import t7.p1;
import t7.w;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f16557a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16558b;

    /* renamed from: c, reason: collision with root package name */
    public final File f16559c;

    public a(w wVar, String str, File file) {
        this.f16557a = wVar;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f16558b = str;
        this.f16559c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16557a.equals(aVar.f16557a) && this.f16558b.equals(aVar.f16558b) && this.f16559c.equals(aVar.f16559c);
    }

    public final int hashCode() {
        return ((((this.f16557a.hashCode() ^ 1000003) * 1000003) ^ this.f16558b.hashCode()) * 1000003) ^ this.f16559c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f16557a + ", sessionId=" + this.f16558b + ", reportFile=" + this.f16559c + "}";
    }
}