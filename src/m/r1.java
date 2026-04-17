package m;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f14900a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f14901b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f14902c;

    /* renamed from: d, reason: collision with root package name */
    public static final Field f14903d;

    /* renamed from: e, reason: collision with root package name */
    public static final Field f14904e;

    /* renamed from: f, reason: collision with root package name */
    public static final Field f14905f;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z7;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z7 = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            field4 = null;
                            z7 = false;
                            if (z7) {
                            }
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused3) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z7 = false;
                    if (z7) {
                    }
                } catch (NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z7 = false;
                    if (z7) {
                    }
                } catch (NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z7 = false;
                    if (z7) {
                    }
                }
            } catch (ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z7 = false;
                if (z7) {
                }
            } catch (NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z7 = false;
                if (z7) {
                }
            } catch (NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z7 = false;
                if (z7) {
                }
            }
        } catch (ClassNotFoundException unused9) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused10) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused11) {
            method = null;
            field = null;
        }
        if (z7) {
            f14901b = null;
            f14902c = null;
            f14903d = null;
            f14904e = null;
            f14905f = null;
            f14900a = false;
            return;
        }
        f14901b = method;
        f14902c = field;
        f14903d = field2;
        f14904e = field3;
        f14905f = field4;
        f14900a = true;
    }
}