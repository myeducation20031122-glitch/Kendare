package c7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f2177a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2178b;

    public m(int i10, boolean z7) {
        this.f2177a = i10;
        this.f2178b = z7;
    }

    public static m a(int i10) {
        byte b7 = (byte) (((byte) 1) | 2);
        if (b7 == 3) {
            return new m(i10, false);
        }
        StringBuilder sb = new StringBuilder();
        if ((b7 & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((b7 & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f2177a == mVar.f2177a && this.f2178b == mVar.f2178b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2177a ^ 1000003) * 1000003) ^ (true != this.f2178b ? 1237 : 1231);
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.f2177a + ", allowAssetPackDeletion=" + this.f2178b + "}";
    }
}