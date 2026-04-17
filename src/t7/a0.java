package t7;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a0 extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17745a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f17746b;

    public a0(String str, byte[] bArr) {
        this.f17745a = str;
        this.f17746b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (this.f17745a.equals(((a0) x0Var).f17745a)) {
            if (Arrays.equals(this.f17746b, (x0Var instanceof a0 ? (a0) x0Var : (a0) x0Var).f17746b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f17745a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f17746b);
    }

    public final String toString() {
        return "File{filename=" + this.f17745a + ", contents=" + Arrays.toString(this.f17746b) + "}";
    }
}