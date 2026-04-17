package w8;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f18725a;

    /* renamed from: b, reason: collision with root package name */
    public static final t8.a f18726b;

    /* renamed from: c, reason: collision with root package name */
    public static final t8.a f18727c;

    /* renamed from: d, reason: collision with root package name */
    public static final t8.a f18728d;

    static {
        t8.a aVar;
        boolean z7 = true;
        try {
            Class.forName("java.sql.Date");
        } catch (ClassNotFoundException unused) {
            z7 = false;
        }
        f18725a = z7;
        if (z7) {
            f18726b = a.f18718b;
            f18727c = b.f18720b;
            aVar = c.f18722b;
        } else {
            aVar = null;
            f18726b = null;
            f18727c = null;
        }
        f18728d = aVar;
    }
}