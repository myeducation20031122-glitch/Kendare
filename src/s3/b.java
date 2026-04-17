package s3;

import android.content.Context;
import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16836a;

    /* renamed from: b, reason: collision with root package name */
    public final z3.a f16837b;

    /* renamed from: c, reason: collision with root package name */
    public final z3.a f16838c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16839d;

    public b(Context context, z3.a aVar, z3.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f16836a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f16837b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f16838c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f16839d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f16836a.equals(((b) cVar).f16836a)) {
            b bVar = (b) cVar;
            if (this.f16837b.equals(bVar.f16837b) && this.f16838c.equals(bVar.f16838c) && this.f16839d.equals(bVar.f16839d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f16836a.hashCode() ^ 1000003) * 1000003) ^ this.f16837b.hashCode()) * 1000003) ^ this.f16838c.hashCode()) * 1000003) ^ this.f16839d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f16836a);
        sb.append(", wallClock=");
        sb.append(this.f16837b);
        sb.append(", monotonicClock=");
        sb.append(this.f16838c);
        sb.append(", backendName=");
        return r.g(sb, this.f16839d, "}");
    }
}