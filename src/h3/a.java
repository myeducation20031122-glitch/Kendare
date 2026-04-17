package h3;

import i3.o;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import q2.j;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements j {

    /* renamed from: b, reason: collision with root package name */
    public final int f13189b;

    /* renamed from: c, reason: collision with root package name */
    public final j f13190c;

    public a(int i10, j jVar) {
        this.f13189b = i10;
        this.f13190c = jVar;
    }

    @Override // q2.j
    public final void a(MessageDigest messageDigest) {
        this.f13190c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f13189b).array());
    }

    @Override // q2.j
    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13189b == aVar.f13189b && this.f13190c.equals(aVar.f13190c);
    }

    @Override // q2.j
    public final int hashCode() {
        return o.h(this.f13189b, this.f13190c);
    }
}