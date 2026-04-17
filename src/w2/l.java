package w2;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l implements q2.j {

    /* renamed from: b, reason: collision with root package name */
    public final m f18566b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f18567c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18568d;

    /* renamed from: e, reason: collision with root package name */
    public String f18569e;

    /* renamed from: f, reason: collision with root package name */
    public URL f18570f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f18571g;

    /* renamed from: h, reason: collision with root package name */
    public int f18572h;

    public l(String str) {
        p pVar = m.f18573a;
        this.f18567c = null;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f18568d = str;
        if (pVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f18566b = pVar;
    }

    @Override // q2.j
    public final void a(MessageDigest messageDigest) {
        if (this.f18571g == null) {
            this.f18571g = c().getBytes(q2.j.f16126a);
        }
        messageDigest.update(this.f18571g);
    }

    public final String c() {
        String str = this.f18568d;
        if (str != null) {
            return str;
        }
        URL url = this.f18567c;
        g5.a.f(url);
        return url.toString();
    }

    public final URL d() {
        if (this.f18570f == null) {
            if (TextUtils.isEmpty(this.f18569e)) {
                String string = this.f18568d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f18567c;
                    g5.a.f(url);
                    string = url.toString();
                }
                this.f18569e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f18570f = new URL(this.f18569e);
        }
        return this.f18570f;
    }

    @Override // q2.j
    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return c().equals(lVar.c()) && this.f18566b.equals(lVar.f18566b);
    }

    @Override // q2.j
    public final int hashCode() {
        if (this.f18572h == 0) {
            int iHashCode = c().hashCode();
            this.f18572h = iHashCode;
            this.f18572h = this.f18566b.hashCode() + (iHashCode * 31);
        }
        return this.f18572h;
    }

    public final String toString() {
        return c();
    }

    public l(URL url) {
        p pVar = m.f18573a;
        if (url == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f18567c = url;
        this.f18568d = null;
        if (pVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f18566b = pVar;
    }
}