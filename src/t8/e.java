package t8;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import q8.a0;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17981b = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f17982a;

    public e() {
        ArrayList arrayList = new ArrayList();
        this.f17982a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (s8.h.f16913a >= 9) {
            arrayList.add(j4.s(2, 2));
        }
    }

    @Override // q8.a0
    public final Object b(y8.a aVar) throws IOException {
        Date dateB;
        if (aVar.w() == 9) {
            aVar.s();
            return null;
        }
        String strU = aVar.u();
        synchronized (this.f17982a) {
            try {
                Iterator it = this.f17982a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            dateB = u8.a.b(strU, new ParsePosition(0));
                            break;
                        } catch (ParseException e10) {
                            StringBuilder sbA = a0.h.A("Failed parsing '", strU, "' as Date; at path ");
                            sbA.append(aVar.h(true));
                            throw new q8.t(sbA.toString(), e10);
                        }
                    }
                    try {
                        dateB = ((DateFormat) it.next()).parse(strU);
                    } catch (ParseException unused) {
                    }
                }
            } finally {
            }
        }
        return dateB;
    }

    @Override // q8.a0
    public final void c(y8.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.j();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f17982a.get(0);
        synchronized (this.f17982a) {
            str = dateFormat.format(date);
        }
        bVar.q(str);
    }
}