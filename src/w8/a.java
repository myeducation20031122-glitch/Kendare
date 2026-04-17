package w8;

import a0.h;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import q8.a0;
import q8.t;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t8.a f18718b = new t8.a(3);

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f18719a = new SimpleDateFormat("MMM d, yyyy");

    @Override // q8.a0
    public final Object b(y8.a aVar) throws IOException {
        Date date;
        if (aVar.w() == 9) {
            aVar.s();
            return null;
        }
        String strU = aVar.u();
        try {
            synchronized (this) {
                date = this.f18719a.parse(strU);
            }
            return new java.sql.Date(date.getTime());
        } catch (ParseException e10) {
            StringBuilder sbA = h.A("Failed parsing '", strU, "' as SQL Date; at path ");
            sbA.append(aVar.h(true));
            throw new t(sbA.toString(), e10);
        }
    }

    @Override // q8.a0
    public final void c(y8.b bVar, Object obj) throws IOException {
        String str;
        java.sql.Date date = (java.sql.Date) obj;
        if (date == null) {
            bVar.j();
            return;
        }
        synchronized (this) {
            str = this.f18719a.format((Date) date);
        }
        bVar.q(str);
    }
}