package t8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import q8.a0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f17973c = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final Class f17974a;

    /* renamed from: b, reason: collision with root package name */
    public final u f17975b;

    public b(q8.n nVar, a0 a0Var, Class cls) {
        this.f17975b = new u(nVar, a0Var, cls);
        this.f17974a = cls;
    }

    @Override // q8.a0
    public final Object b(y8.a aVar) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (aVar.w() == 9) {
            aVar.s();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.j()) {
            arrayList.add(this.f17975b.b(aVar));
        }
        aVar.e();
        int size = arrayList.size();
        Class cls = this.f17974a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // q8.a0
    public final void c(y8.b bVar, Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            bVar.j();
            return;
        }
        bVar.b();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f17975b.c(bVar, Array.get(obj, i10));
        }
        bVar.e();
    }
}