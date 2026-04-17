package t8;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import q8.a0;
import q8.b0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17972b;

    public /* synthetic */ a(int i10) {
        this.f17972b = i10;
    }

    @Override // q8.b0
    public final a0 b(q8.n nVar, x8.a aVar) {
        switch (this.f17972b) {
            case 0:
                Type type = aVar.f19111b;
                boolean z7 = type instanceof GenericArrayType;
                if (!z7 && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z7 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new b(nVar, nVar.c(new x8.a(genericComponentType)), s8.d.f(genericComponentType));
            case QueueFuseable.SYNC /* 1 */:
                if (aVar.f19110a == Date.class) {
                    return new e();
                }
                return null;
            case 2:
                Class superclass = aVar.f19110a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new u(superclass);
            case 3:
                if (aVar.f19110a == java.sql.Date.class) {
                    return new w8.a();
                }
                return null;
            case 4:
                if (aVar.f19110a == Time.class) {
                    return new w8.b();
                }
                return null;
            default:
                if (aVar.f19110a != Timestamp.class) {
                    return null;
                }
                nVar.getClass();
                return new w8.c(nVar.c(new x8.a(Date.class)));
        }
    }
}