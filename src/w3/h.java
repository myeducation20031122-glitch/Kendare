package w3;

import t7.r0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class h implements y3.b, i8.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18624b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18626f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f18627j;

    public /* synthetic */ h(String str, String str2, long j10, r0 r0Var) {
        this.f18625e = str;
        this.f18626f = str2;
        this.f18624b = j10;
        this.f18627j = r0Var;
    }

    @Override // i8.a
    public final void d(i8.c cVar) {
        ((o7.b) ((o7.a) cVar.get())).d((String) this.f18625e, (String) this.f18626f, this.f18624b, (r0) this.f18627j);
    }

    @Override // y3.b
    public final Object execute() {
        k kVar = (k) this.f18625e;
        Iterable iterable = (Iterable) this.f18626f;
        r3.i iVar = (r3.i) this.f18627j;
        x3.l lVar = (x3.l) kVar.f18636c;
        lVar.getClass();
        if (iterable.iterator().hasNext()) {
            lVar.c(new t1.h(lVar, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + x3.l.g(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", 3));
        }
        lVar.c(new x3.f(((z3.c) kVar.f18640g).a() + this.f18624b, iVar));
        return null;
    }

    public /* synthetic */ h(k kVar, Iterable iterable, r3.i iVar, long j10) {
        this.f18625e = kVar;
        this.f18626f = iterable;
        this.f18627j = iVar;
        this.f18624b = j10;
    }
}