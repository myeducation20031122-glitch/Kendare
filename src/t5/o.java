package t5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f17522a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17523b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17524c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17525d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17526e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17527f;

    /* renamed from: g, reason: collision with root package name */
    public final long f17528g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f17529h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f17530i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f17531j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f17532k;

    public o(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        fc.t.g(str);
        fc.t.g(str2);
        fc.t.c(j10 >= 0);
        fc.t.c(j11 >= 0);
        fc.t.c(j12 >= 0);
        fc.t.c(j14 >= 0);
        this.f17522a = str;
        this.f17523b = str2;
        this.f17524c = j10;
        this.f17525d = j11;
        this.f17526e = j12;
        this.f17527f = j13;
        this.f17528g = j14;
        this.f17529h = l10;
        this.f17530i = l11;
        this.f17531j = l12;
        this.f17532k = bool;
    }

    public final o a(Long l10, Long l11, Boolean bool) {
        return new o(this.f17522a, this.f17523b, this.f17524c, this.f17525d, this.f17526e, this.f17527f, this.f17528g, this.f17529h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }
}