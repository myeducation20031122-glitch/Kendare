package s2;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w implements q2.j {

    /* renamed from: b, reason: collision with root package name */
    public final Object f16816b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16817c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16818d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f16819e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f16820f;

    /* renamed from: g, reason: collision with root package name */
    public final q2.j f16821g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f16822h;

    /* renamed from: i, reason: collision with root package name */
    public final q2.n f16823i;

    /* renamed from: j, reason: collision with root package name */
    public int f16824j;

    public w(Object obj, q2.j jVar, int i10, int i11, i3.d dVar, Class cls, Class cls2, q2.n nVar) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f16816b = obj;
        if (jVar == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.f16821g = jVar;
        this.f16817c = i10;
        this.f16818d = i11;
        if (dVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f16822h = dVar;
        if (cls == null) {
            throw new NullPointerException("Resource class must not be null");
        }
        this.f16819e = cls;
        if (cls2 == null) {
            throw new NullPointerException("Transcode class must not be null");
        }
        this.f16820f = cls2;
        if (nVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f16823i = nVar;
    }

    @Override // q2.j
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // q2.j
    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f16816b.equals(wVar.f16816b) && this.f16821g.equals(wVar.f16821g) && this.f16818d == wVar.f16818d && this.f16817c == wVar.f16817c && this.f16822h.equals(wVar.f16822h) && this.f16819e.equals(wVar.f16819e) && this.f16820f.equals(wVar.f16820f) && this.f16823i.equals(wVar.f16823i);
    }

    @Override // q2.j
    public final int hashCode() {
        if (this.f16824j == 0) {
            int iHashCode = this.f16816b.hashCode();
            this.f16824j = iHashCode;
            int iHashCode2 = ((((this.f16821g.hashCode() + (iHashCode * 31)) * 31) + this.f16817c) * 31) + this.f16818d;
            this.f16824j = iHashCode2;
            int iHashCode3 = this.f16822h.hashCode() + (iHashCode2 * 31);
            this.f16824j = iHashCode3;
            int iHashCode4 = this.f16819e.hashCode() + (iHashCode3 * 31);
            this.f16824j = iHashCode4;
            int iHashCode5 = this.f16820f.hashCode() + (iHashCode4 * 31);
            this.f16824j = iHashCode5;
            this.f16824j = this.f16823i.f16133b.hashCode() + (iHashCode5 * 31);
        }
        return this.f16824j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f16816b + ", width=" + this.f16817c + ", height=" + this.f16818d + ", resourceClass=" + this.f16819e + ", transcodeClass=" + this.f16820f + ", signature=" + this.f16821g + ", hashCode=" + this.f16824j + ", transformations=" + this.f16822h + ", options=" + this.f16823i + '}';
    }
}