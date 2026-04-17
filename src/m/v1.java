package m;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f14963a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f14964b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f14965c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f14966d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f14963a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f14964b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f14965c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f14966d = true;
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
        }
    }
}