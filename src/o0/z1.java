package o0;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f15648a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f15649b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f15650c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f15651d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f15648a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f15649b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f15650c = declaredField3;
            declaredField3.setAccessible(true);
            f15651d = true;
        } catch (ReflectiveOperationException e10) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
        }
    }
}