package w8;

import java.sql.Timestamp;
import java.util.Date;
import q8.a0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t8.a f18722b = new t8.a(5);

    /* renamed from: a, reason: collision with root package name */
    public final a0 f18723a;

    public c(a0 a0Var) {
        this.f18723a = a0Var;
    }

    @Override // q8.a0
    public final Object b(y8.a aVar) {
        Date date = (Date) this.f18723a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // q8.a0
    public final void c(y8.b bVar, Object obj) {
        this.f18723a.c(bVar, (Timestamp) obj);
    }
}