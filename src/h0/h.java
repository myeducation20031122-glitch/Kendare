package h0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.measurement.n3;
import g.v0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m.t;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f13153a;

    /* renamed from: b, reason: collision with root package name */
    public static final t.f f13154b;

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    static {
        v0 iVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            iVar = new m(4);
        } else if (i10 >= 28) {
            iVar = new l();
        } else if (i10 >= 26) {
            iVar = new k();
        } else if (i10 < 24) {
            iVar = new i(4);
        } else {
            Method method = j.f13162m;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                iVar = new j(4);
            }
        }
        f13153a = iVar;
        f13154b = new t.f(16);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, g0.f fVar, Resources resources, int i10, String str, int i11, int i12, com.bumptech.glide.d dVar, boolean z7) throws NoSuchFieldException, InterruptedException, SecurityException {
        Typeface typefaceI;
        Typeface typefaceCreate;
        Typeface typeface;
        if (fVar instanceof g0.i) {
            g0.i iVar = (g0.i) fVar;
            String str2 = iVar.f12963d;
            typefaceI = null;
            int i13 = 0;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
                if (typefaceCreate == null) {
                    if (dVar != null) {
                        dVar.d(typefaceCreate);
                    }
                    return typefaceCreate;
                }
                int i14 = 1;
                boolean z10 = !z7 ? dVar != null : iVar.f12962c != 0;
                int i15 = z7 ? iVar.f12961b : -1;
                Handler handler = new Handler(Looper.getMainLooper());
                v0 v0Var = new v0(dVar);
                t tVar = iVar.f12960a;
                n3 n3Var = new n3(6, v0Var, handler);
                if (z10) {
                    t.f fVar2 = l0.h.f14449a;
                    String str3 = ((String) tVar.f14940g) + "-" + i12;
                    typeface = (Typeface) l0.h.f14449a.b(str3);
                    if (typeface != null) {
                        ((Handler) n3Var.f10910f).post(new l0.a(n3Var, (v0) n3Var.f10909e, typeface, i13));
                        typefaceI = typeface;
                    } else if (i15 == -1) {
                        l0.g gVarA = l0.h.a(str3, context, tVar, i12);
                        n3Var.A(gVarA);
                        typefaceI = gVarA.f14447a;
                    } else {
                        try {
                            try {
                                try {
                                    l0.g gVar = (l0.g) l0.h.f14450b.submit(new l0.e(str3, context, tVar, i12, 0)).get(i15, TimeUnit.MILLISECONDS);
                                    n3Var.A(gVar);
                                    typefaceI = gVar.f14447a;
                                } catch (InterruptedException e10) {
                                    throw e10;
                                }
                            } catch (ExecutionException e11) {
                                throw new RuntimeException(e11);
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException unused2) {
                            ((Handler) n3Var.f10910f).post(new c.d(n3Var, (v0) n3Var.f10909e, -3, 5, 0));
                        }
                    }
                } else {
                    t.f fVar3 = l0.h.f14449a;
                    String str4 = ((String) tVar.f14940g) + "-" + i12;
                    typeface = (Typeface) l0.h.f14449a.b(str4);
                    if (typeface != null) {
                        ((Handler) n3Var.f10910f).post(new l0.a(n3Var, (v0) n3Var.f10909e, typeface, i13));
                        typefaceI = typeface;
                    } else {
                        l0.f fVar4 = new l0.f(n3Var, i13);
                        synchronized (l0.h.f14451c) {
                            try {
                                t.k kVar = l0.h.f14452d;
                                ArrayList arrayList = (ArrayList) kVar.getOrDefault(str4, null);
                                if (arrayList != null) {
                                    arrayList.add(fVar4);
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(fVar4);
                                    kVar.put(str4, arrayList2);
                                    l0.h.f14450b.execute(new l0.a(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new l0.e(str4, context, tVar, i12, 1), new l0.f(str4, i14), 2));
                                }
                            } finally {
                            }
                        }
                    }
                }
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                }
                if (typefaceCreate == null) {
                }
            }
        } else {
            typefaceI = f13153a.i(context, (g0.g) fVar, resources, i12);
            if (dVar != null) {
                if (typefaceI != null) {
                    dVar.d(typefaceI);
                } else {
                    dVar.c(-3);
                }
            }
        }
        if (typefaceI != null) {
            f13154b.c(b(resources, i10, str, i11, i12), typefaceI);
        }
        return typefaceI;
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}