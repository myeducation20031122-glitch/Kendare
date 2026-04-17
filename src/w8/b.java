package w8;

import a0.h;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import q8.a0;
import q8.t;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t8.a f18720b = new t8.a(4);

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f18721a = new SimpleDateFormat("hh:mm:ss a");

    @Override // q8.a0
    public final Object b(y8.a aVar) throws IOException {
        Time time;
        if (aVar.w() == 9) {
            aVar.s();
            return null;
        }
        String strU = aVar.u();
        try {
            synchronized (this) {
                time = new Time(this.f18721a.parse(strU).getTime());
            }
            return time;
        } catch (ParseException e10) {
            StringBuilder sbA = h.A("Failed parsing '", strU, "' as SQL Time; at path ");
            sbA.append(aVar.h(true));
            throw new t(sbA.toString(), e10);
        }
    }

    @Override // q8.a0
    public final void c(y8.b bVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            bVar.j();
            return;
        }
        synchronized (this) {
            str = this.f18721a.format((Date) time);
        }
        bVar.q(str);
    }
}