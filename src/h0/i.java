package h0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import g.v0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o5.y;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class i extends v0 {

    /* renamed from: f, reason: collision with root package name */
    public static Class f13155f = null;

    /* renamed from: j, reason: collision with root package name */
    public static Constructor f13156j = null;

    /* renamed from: m, reason: collision with root package name */
    public static Method f13157m = null;

    /* renamed from: n, reason: collision with root package name */
    public static Method f13158n = null;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f13159t = false;

    public static void A() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f13159t) {
            return;
        }
        f13159t = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f13156j = constructor;
        f13155f = cls;
        f13157m = method2;
        f13158n = method;
    }

    public static boolean z(boolean z7, String str, int i10, Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        A();
        try {
            return ((Boolean) f13157m.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // g.v0
    public Typeface i(Context context, g0.g gVar, Resources resources, int i10) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        A();
        try {
            Object objNewInstance = f13156j.newInstance(new Object[0]);
            for (g0.h hVar : gVar.f12953a) {
                File fileN = y.n(context);
                if (fileN == null) {
                    return null;
                }
                try {
                    if (!y.e(fileN, resources, hVar.f12959f)) {
                        return null;
                    }
                    if (!z(hVar.f12956c, fileN.getPath(), hVar.f12955b, objNewInstance)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileN.delete();
                }
            }
            A();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f13155f, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f13158n.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // g.v0
    public Typeface o(Context context, l0.i[] iVarArr, int i10) throws IOException {
        String str;
        if (iVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(u(i10, iVarArr).f14453a, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                } catch (ErrnoException unused) {
                }
                File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                if (file != null && file.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceP = p(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceP;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}