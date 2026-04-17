package h0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import g.v0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import o5.y;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j extends v0 {

    /* renamed from: f, reason: collision with root package name */
    public static final Class f13160f;

    /* renamed from: j, reason: collision with root package name */
    public static final Constructor f13161j;

    /* renamed from: m, reason: collision with root package name */
    public static final Method f13162m;

    /* renamed from: n, reason: collision with root package name */
    public static final Method f13163n;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f13161j = constructor;
        f13160f = cls;
        f13162m = method2;
        f13163n = method;
    }

    public static Typeface A(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f13160f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f13163n.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean z(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z7) {
        try {
            return ((Boolean) f13162m.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005d A[SYNTHETIC] */
    @Override // g.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface i(Context context, g0.g gVar, Resources resources, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        FileInputStream fileInputStream;
        try {
            objNewInstance = f13161j.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (g0.h hVar : gVar.f12953a) {
            int i11 = hVar.f12959f;
            File fileN = y.n(context);
            if (fileN != null) {
                try {
                    if (y.e(fileN, resources, i11)) {
                        try {
                            fileInputStream = new FileInputStream(fileN);
                        } catch (IOException unused2) {
                            map = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (map != null) {
                                return null;
                            }
                            if (!z(objNewInstance, map, hVar.f12958e, hVar.f12955b, hVar.f12956c)) {
                                return null;
                            }
                        } finally {
                        }
                    }
                } finally {
                    fileN.delete();
                }
            }
            map = null;
            if (map != null) {
            }
        }
        return A(objNewInstance);
    }

    @Override // g.v0
    public final Typeface o(Context context, l0.i[] iVarArr, int i10) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = f13161j.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        t.k kVar = new t.k();
        for (l0.i iVar : iVarArr) {
            Uri uri = iVar.f14453a;
            ByteBuffer byteBufferS = (ByteBuffer) kVar.getOrDefault(uri, null);
            if (byteBufferS == null) {
                byteBufferS = y.s(context, uri);
                kVar.put(uri, byteBufferS);
            }
            if (byteBufferS == null) {
                return null;
            }
            if (!z(objNewInstance, byteBufferS, iVar.f14454b, iVar.f14455c, iVar.f14456d)) {
                return null;
            }
        }
        Typeface typefaceA = A(objNewInstance);
        if (typefaceA == null) {
            return null;
        }
        return Typeface.create(typefaceA, i10);
    }
}