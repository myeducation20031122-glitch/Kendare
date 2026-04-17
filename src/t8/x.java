package t8;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f18031a;

    public x(Class cls) {
        this.f18031a = cls;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() throws SecurityException {
        Field[] declaredFields = this.f18031a.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            if (field.isEnumConstant()) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
        AccessibleObject.setAccessible(fieldArr, true);
        return fieldArr;
    }
}