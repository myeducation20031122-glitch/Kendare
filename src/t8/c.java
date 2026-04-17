package t8;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import q8.a0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17976a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17977b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17978c;

    public c(q8.n nVar, Type type, a0 a0Var, s8.o oVar) {
        this.f17977b = new u(nVar, a0Var, type);
        this.f17978c = oVar;
    }

    @Override // q8.a0
    public final Object b(y8.a aVar) throws IOException {
        Date dateB;
        Collection collection = null;
        switch (this.f17976a) {
            case 0:
                if (aVar.w() == 9) {
                    aVar.s();
                } else {
                    collection = (Collection) ((s8.o) this.f17978c).j();
                    aVar.a();
                    while (aVar.j()) {
                        collection.add(((a0) this.f17977b).b(aVar));
                    }
                    aVar.e();
                }
                return collection;
            case QueueFuseable.SYNC /* 1 */:
                if (aVar.w() == 9) {
                    aVar.s();
                    return null;
                }
                String strU = aVar.u();
                synchronized (((List) this.f17978c)) {
                    try {
                        Iterator it = ((List) this.f17978c).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                try {
                                    dateB = ((DateFormat) it.next()).parse(strU);
                                } catch (ParseException unused) {
                                }
                            } else {
                                try {
                                    dateB = u8.a.b(strU, new ParsePosition(0));
                                } catch (ParseException e10) {
                                    StringBuilder sbA = a0.h.A("Failed parsing '", strU, "' as Date; at path ");
                                    sbA.append(aVar.h(true));
                                    throw new q8.t(sbA.toString(), e10);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return ((g) this.f17977b).a(dateB);
            default:
                Object objB = ((v) this.f17978c).f18026f.b(aVar);
                if (objB != null) {
                    Class cls = (Class) this.f17977b;
                    if (!cls.isInstance(objB)) {
                        throw new q8.t("Expected a " + cls.getName() + " but was " + objB.getClass().getName() + "; at path " + aVar.h(true));
                    }
                }
                return objB;
        }
    }

    @Override // q8.a0
    public final void c(y8.b bVar, Object obj) throws IOException {
        String str;
        switch (this.f17976a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    bVar.j();
                    return;
                }
                bVar.b();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((a0) this.f17977b).c(bVar, it.next());
                }
                bVar.e();
                return;
            case QueueFuseable.SYNC /* 1 */:
                Date date = (Date) obj;
                if (date == null) {
                    bVar.j();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((List) this.f17978c).get(0);
                synchronized (((List) this.f17978c)) {
                    str = dateFormat.format(date);
                }
                bVar.q(str);
                return;
            default:
                ((v) this.f17978c).f18026f.c(bVar, obj);
                return;
        }
    }

    public final String toString() {
        StringBuilder sb;
        String simpleName;
        switch (this.f17976a) {
            case QueueFuseable.SYNC /* 1 */:
                DateFormat dateFormat = (DateFormat) ((List) this.f17978c).get(0);
                if (dateFormat instanceof SimpleDateFormat) {
                    sb = new StringBuilder("DefaultDateTypeAdapter(");
                    simpleName = ((SimpleDateFormat) dateFormat).toPattern();
                } else {
                    sb = new StringBuilder("DefaultDateTypeAdapter(");
                    simpleName = dateFormat.getClass().getSimpleName();
                }
                sb.append(simpleName);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public c(v vVar, Class cls) {
        this.f17978c = vVar;
        this.f17977b = cls;
    }
}