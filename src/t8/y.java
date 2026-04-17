package t8;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import q8.a0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class y {
    public static final v A;
    public static final a B;

    /* renamed from: a, reason: collision with root package name */
    public static final v f18032a = a(Class.class, new q8.k(11).a());

    /* renamed from: b, reason: collision with root package name */
    public static final v f18033b = a(BitSet.class, new q8.k(21).a());

    /* renamed from: c, reason: collision with root package name */
    public static final q8.k f18034c;

    /* renamed from: d, reason: collision with root package name */
    public static final w f18035d;

    /* renamed from: e, reason: collision with root package name */
    public static final w f18036e;

    /* renamed from: f, reason: collision with root package name */
    public static final w f18037f;

    /* renamed from: g, reason: collision with root package name */
    public static final w f18038g;

    /* renamed from: h, reason: collision with root package name */
    public static final v f18039h;

    /* renamed from: i, reason: collision with root package name */
    public static final v f18040i;

    /* renamed from: j, reason: collision with root package name */
    public static final v f18041j;

    /* renamed from: k, reason: collision with root package name */
    public static final q8.k f18042k;

    /* renamed from: l, reason: collision with root package name */
    public static final w f18043l;

    /* renamed from: m, reason: collision with root package name */
    public static final q8.k f18044m;

    /* renamed from: n, reason: collision with root package name */
    public static final q8.k f18045n;

    /* renamed from: o, reason: collision with root package name */
    public static final q8.k f18046o;

    /* renamed from: p, reason: collision with root package name */
    public static final v f18047p;

    /* renamed from: q, reason: collision with root package name */
    public static final v f18048q;

    /* renamed from: r, reason: collision with root package name */
    public static final v f18049r;

    /* renamed from: s, reason: collision with root package name */
    public static final v f18050s;

    /* renamed from: t, reason: collision with root package name */
    public static final v f18051t;

    /* renamed from: u, reason: collision with root package name */
    public static final v f18052u;

    /* renamed from: v, reason: collision with root package name */
    public static final v f18053v;

    /* renamed from: w, reason: collision with root package name */
    public static final v f18054w;

    /* renamed from: x, reason: collision with root package name */
    public static final w f18055x;

    /* renamed from: y, reason: collision with root package name */
    public static final v f18056y;

    /* renamed from: z, reason: collision with root package name */
    public static final q8.k f18057z;

    static {
        q8.k kVar = new q8.k(22);
        f18034c = new q8.k(23);
        f18035d = b(Boolean.TYPE, Boolean.class, kVar);
        f18036e = b(Byte.TYPE, Byte.class, new q8.k(24));
        f18037f = b(Short.TYPE, Short.class, new q8.k(25));
        f18038g = b(Integer.TYPE, Integer.class, new q8.k(26));
        f18039h = a(AtomicInteger.class, new q8.k(27).a());
        f18040i = a(AtomicBoolean.class, new q8.k(28).a());
        int i10 = 1;
        f18041j = a(AtomicIntegerArray.class, new q8.k(1).a());
        f18042k = new q8.k(2);
        f18043l = b(Character.TYPE, Character.class, new q8.k(5));
        q8.k kVar2 = new q8.k(6);
        f18044m = new q8.k(7);
        f18045n = new q8.k(8);
        f18046o = new q8.k(9);
        f18047p = a(String.class, kVar2);
        f18048q = a(StringBuilder.class, new q8.k(10));
        f18049r = a(StringBuffer.class, new q8.k(12));
        f18050s = a(URL.class, new q8.k(13));
        f18051t = a(URI.class, new q8.k(14));
        f18052u = new v(InetAddress.class, new q8.k(15), i10);
        f18053v = a(UUID.class, new q8.k(16));
        f18054w = a(Currency.class, new q8.k(17).a());
        f18055x = new w(Calendar.class, GregorianCalendar.class, new q8.k(18), i10);
        f18056y = a(Locale.class, new q8.k(19));
        q8.k kVar3 = new q8.k(20);
        f18057z = kVar3;
        A = new v(q8.p.class, kVar3, i10);
        B = new a(2);
    }

    public static v a(Class cls, a0 a0Var) {
        return new v(cls, a0Var, 0);
    }

    public static w b(Class cls, Class cls2, a0 a0Var) {
        return new w(cls, cls2, a0Var, 0);
    }
}