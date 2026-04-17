package g0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import fc.t;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f12975a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f12976b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f12977c = new Object();

    public static void a(m mVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f12977c) {
            try {
                WeakHashMap weakHashMap = f12976b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(mVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(mVar, sparseArray);
                }
                sparseArray.append(i10, new l(colorStateList, mVar.f12967a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface b(Context context, int i10, TypedValue typedValue, int i11, com.bumptech.glide.d dVar, boolean z7, boolean z10) {
        String str;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i12 = typedValue.assetCookie;
            t.f fVar = h0.h.f13154b;
            Typeface typefaceQ = (Typeface) fVar.b(h0.h.b(resources, i10, string, i12, i11));
            if (typefaceQ != null) {
                if (dVar != null) {
                    dVar.d(typefaceQ);
                }
            } else if (!z10) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        f fVarD = t.D(resources.getXml(i10), resources);
                        if (fVarD == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (dVar != null) {
                                dVar.c(-3);
                            }
                        } else {
                            typefaceA = h0.h.a(context, fVarD, resources, i10, string, typedValue.assetCookie, i11, dVar, z7);
                        }
                    } else {
                        int i13 = typedValue.assetCookie;
                        typefaceQ = h0.h.f13153a.q(context, resources, i10, string, i11);
                        if (typefaceQ != null) {
                            fVar.c(h0.h.b(resources, i10, string, i13, i11), typefaceQ);
                        }
                        if (dVar != null) {
                            if (typefaceQ != null) {
                                dVar.d(typefaceQ);
                            } else {
                                dVar.c(-3);
                            }
                        }
                    }
                } catch (IOException e10) {
                    e = e10;
                    str = "Failed to read xml resource ";
                    Log.e("ResourcesCompat", str.concat(string), e);
                    if (dVar != null) {
                        dVar.c(-3);
                    }
                    if (typefaceA == null) {
                    }
                    return typefaceA;
                } catch (XmlPullParserException e11) {
                    e = e11;
                    str = "Failed to parse xml resource ";
                    Log.e("ResourcesCompat", str.concat(string), e);
                    if (dVar != null) {
                    }
                    if (typefaceA == null) {
                    }
                    return typefaceA;
                }
            }
            typefaceA = typefaceQ;
        } else if (dVar != null) {
            dVar.c(-3);
        }
        if (typefaceA == null || dVar != null || z10) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }
}