package h0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o5.y;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class k extends i {
    public final Method M;
    public final Method N;
    public final Method O;
    public final Method P;
    public final Method Q;

    /* renamed from: u, reason: collision with root package name */
    public final Class f13164u;

    /* renamed from: w, reason: collision with root package name */
    public final Constructor f13165w;

    public k() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodH;
        Method methodI;
        Method method2;
        Method methodJ;
        super(4);
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodH = H(cls);
            methodI = I(cls);
            method2 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodJ = J(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            cls = null;
            method = null;
            constructor = null;
            methodH = null;
            methodI = null;
            method2 = null;
            methodJ = null;
        }
        this.f13164u = cls;
        this.f13165w = constructor;
        this.M = methodH;
        this.N = methodI;
        this.O = method2;
        this.P = method;
        this.Q = methodJ;
    }

    public static Method H(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method I(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public final void B(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.P.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean C(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.M.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface D(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f13164u, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.Q.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean E(Object obj) {
        try {
            return ((Boolean) this.O.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean F() {
        Method method = this.M;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object G() {
        try {
            return this.f13165w.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method J(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // h0.i, g.v0
    public final Typeface i(Context context, g0.g gVar, Resources resources, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!F()) {
            return super.i(context, gVar, resources, i10);
        }
        Object objG = G();
        if (objG == null) {
            return null;
        }
        for (g0.h hVar : gVar.f12953a) {
            if (!C(context, objG, hVar.f12954a, hVar.f12958e, hVar.f12955b, hVar.f12956c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.f12957d))) {
                B(objG);
                return null;
            }
        }
        if (E(objG)) {
            return D(objG);
        }
        return null;
    }

    @Override // h0.i, g.v0
    public final Typeface o(Context context, l0.i[] iVarArr, int i10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceD;
        if (iVarArr.length < 1) {
            return null;
        }
        if (!F()) {
            l0.i iVarU = u(i10, iVarArr);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(iVarU.f14453a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(iVarU.f14455c).setItalic(iVarU.f14456d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (l0.i iVar : iVarArr) {
            if (iVar.f14457e == 0) {
                Uri uri = iVar.f14453a;
                if (!map.containsKey(uri)) {
                    map.put(uri, y.s(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objG = G();
        if (objG == null) {
            return null;
        }
        boolean z7 = false;
        for (l0.i iVar2 : iVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(iVar2.f14453a);
            if (byteBuffer != null) {
                if (!((Boolean) this.N.invoke(objG, byteBuffer, Integer.valueOf(iVar2.f14454b), null, Integer.valueOf(iVar2.f14455c), Integer.valueOf(iVar2.f14456d ? 1 : 0))).booleanValue()) {
                    B(objG);
                    return null;
                }
                z7 = true;
            }
        }
        if (!z7) {
            B(objG);
            return null;
        }
        if (E(objG) && (typefaceD = D(objG)) != null) {
            return Typeface.create(typefaceD, i10);
        }
        return null;
    }

    @Override // g.v0
    public final Typeface q(Context context, Resources resources, int i10, String str, int i11) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!F()) {
            return super.q(context, resources, i10, str, i11);
        }
        Object objG = G();
        if (objG == null) {
            return null;
        }
        if (!C(context, objG, str, 0, -1, -1, null)) {
            B(objG);
            return null;
        }
        if (E(objG)) {
            return D(objG);
        }
        return null;
    }
}