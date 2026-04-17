package s2;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Queue;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g0 implements q2.j {

    /* renamed from: j, reason: collision with root package name */
    public static final i3.k f16722j = new i3.k(50);

    /* renamed from: b, reason: collision with root package name */
    public final t2.h f16723b;

    /* renamed from: c, reason: collision with root package name */
    public final q2.j f16724c;

    /* renamed from: d, reason: collision with root package name */
    public final q2.j f16725d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16726e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16727f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f16728g;

    /* renamed from: h, reason: collision with root package name */
    public final q2.n f16729h;

    /* renamed from: i, reason: collision with root package name */
    public final q2.r f16730i;

    public g0(t2.h hVar, q2.j jVar, q2.j jVar2, int i10, int i11, q2.r rVar, Class cls, q2.n nVar) {
        this.f16723b = hVar;
        this.f16724c = jVar;
        this.f16725d = jVar2;
        this.f16726e = i10;
        this.f16727f = i11;
        this.f16730i = rVar;
        this.f16728g = cls;
        this.f16729h = nVar;
    }

    @Override // q2.j
    public final void a(MessageDigest messageDigest) {
        Object objF;
        t2.h hVar = this.f16723b;
        synchronized (hVar) {
            t2.c cVar = hVar.f17127b;
            t2.k kVarP = (t2.k) ((Queue) cVar.f15046b).poll();
            if (kVarP == null) {
                kVarP = cVar.p();
            }
            t2.g gVar = (t2.g) kVarP;
            gVar.f17124b = 8;
            gVar.f17125c = byte[].class;
            objF = hVar.f(gVar, byte[].class);
        }
        byte[] bArr = (byte[]) objF;
        ByteBuffer.wrap(bArr).putInt(this.f16726e).putInt(this.f16727f).array();
        this.f16725d.a(messageDigest);
        this.f16724c.a(messageDigest);
        messageDigest.update(bArr);
        q2.r rVar = this.f16730i;
        if (rVar != null) {
            rVar.a(messageDigest);
        }
        this.f16729h.a(messageDigest);
        i3.k kVar = f16722j;
        Class cls = this.f16728g;
        byte[] bytes = (byte[]) kVar.a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(q2.j.f16126a);
            kVar.d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f16723b.h(bArr);
    }

    @Override // q2.j
    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f16727f == g0Var.f16727f && this.f16726e == g0Var.f16726e && i3.o.b(this.f16730i, g0Var.f16730i) && this.f16728g.equals(g0Var.f16728g) && this.f16724c.equals(g0Var.f16724c) && this.f16725d.equals(g0Var.f16725d) && this.f16729h.equals(g0Var.f16729h);
    }

    @Override // q2.j
    public final int hashCode() {
        int iHashCode = ((((this.f16725d.hashCode() + (this.f16724c.hashCode() * 31)) * 31) + this.f16726e) * 31) + this.f16727f;
        q2.r rVar = this.f16730i;
        if (rVar != null) {
            iHashCode = (iHashCode * 31) + rVar.hashCode();
        }
        return this.f16729h.f16133b.hashCode() + ((this.f16728g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f16724c + ", signature=" + this.f16725d + ", width=" + this.f16726e + ", height=" + this.f16727f + ", decodedResourceClass=" + this.f16728g + ", transformation='" + this.f16730i + "', options=" + this.f16729h + '}';
    }
}