package d8;

import b8.f;
import b8.g;
import java.util.Date;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements c8.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f12350f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f12351g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12353a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f12354b;

    /* renamed from: c, reason: collision with root package name */
    public final a f12355c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12356d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f12349e = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f12352h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [d8.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [d8.b] */
    static {
        final int i10 = 0;
        f12350f = new f() { // from class: d8.b
            @Override // b8.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i11 = 1;
        f12351g = new f() { // from class: d8.b
            @Override // b8.a
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.f12353a = map;
        HashMap map2 = new HashMap();
        this.f12354b = map2;
        this.f12355c = f12349e;
        this.f12356d = false;
        map2.put(String.class, f12350f);
        map.remove(String.class);
        map2.put(Boolean.class, f12351g);
        map.remove(Boolean.class);
        map2.put(Date.class, f12352h);
        map.remove(Date.class);
    }

    public final c8.a a(Class cls, b8.d dVar) {
        this.f12353a.put(cls, dVar);
        this.f12354b.remove(cls);
        return this;
    }
}