package r3;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f16409a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f16410b;

    /* renamed from: c, reason: collision with root package name */
    public final o3.d f16411c;

    public i(String str, byte[] bArr, o3.d dVar) {
        this.f16409a = str;
        this.f16410b = bArr;
        this.f16411c = dVar;
    }

    public static g.e a() {
        g.e eVar = new g.e(22);
        eVar.O(o3.d.f15696b);
        return eVar;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = this.f16409a;
        objArr[1] = this.f16411c;
        byte[] bArr = this.f16410b;
        objArr[2] = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f16409a.equals(iVar.f16409a) && Arrays.equals(this.f16410b, iVar.f16410b) && this.f16411c.equals(iVar.f16411c);
    }

    public final int hashCode() {
        return ((((this.f16409a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f16410b)) * 1000003) ^ this.f16411c.hashCode();
    }
}