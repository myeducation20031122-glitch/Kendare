package h5;

import android.os.IBinder;
import android.os.IInterface;
import fc.t;
import java.lang.reflect.Field;
import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends l5.a implements a {

    /* renamed from: e, reason: collision with root package name */
    public final Object f13197e;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 1);
        this.f13197e = obj;
    }

    public static a q3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        String str = "com.google.android.gms.dynamic.IObjectWrapper";
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new d(iBinder, str, 2);
    }

    public static Object r3(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f13197e;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException(r.d("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
        t.k(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }
}