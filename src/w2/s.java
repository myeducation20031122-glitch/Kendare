package w2;

import java.util.ArrayDeque;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayDeque f18583d;

    /* renamed from: a, reason: collision with root package name */
    public int f18584a;

    /* renamed from: b, reason: collision with root package name */
    public int f18585b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18586c;

    static {
        char[] cArr = i3.o.f13305a;
        f18583d = new ArrayDeque(0);
    }

    public static s a(Object obj) {
        s sVar;
        ArrayDeque arrayDeque = f18583d;
        synchronized (arrayDeque) {
            sVar = (s) arrayDeque.poll();
        }
        if (sVar == null) {
            sVar = new s();
        }
        sVar.f18586c = obj;
        sVar.f18585b = 0;
        sVar.f18584a = 0;
        return sVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f18585b == sVar.f18585b && this.f18584a == sVar.f18584a && this.f18586c.equals(sVar.f18586c);
    }

    public final int hashCode() {
        return this.f18586c.hashCode() + (((this.f18584a * 31) + this.f18585b) * 31);
    }
}