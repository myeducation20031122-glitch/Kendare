package v7;

import a0.h;
import android.R;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.android.volley.toolbox.e;
import e0.g;
import f0.f;
import j8.c;
import j8.d;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.d3;
import m.v2;
import m.x;
import o5.b0;
import o5.c0;
import o5.m;
import o5.p;
import t5.j4;
import t7.n0;
import w4.j;
import w4.k;
import w4.l;
import x5.s;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public Object f18509b;

    /* renamed from: e, reason: collision with root package name */
    public Object f18510e;

    /* renamed from: f, reason: collision with root package name */
    public Object f18511f;

    /* renamed from: j, reason: collision with root package name */
    public Object f18512j;

    /* renamed from: m, reason: collision with root package name */
    public Object f18513m;

    /* renamed from: n, reason: collision with root package name */
    public Object f18514n;

    public b(int i10) {
        if (i10 != 6) {
            this.f18509b = new int[]{2131165300, 2131165298, 2131165224};
            this.f18510e = new int[]{2131165248, 2131165283, 2131165255, 2131165250, 2131165251, 2131165254, 2131165253};
            this.f18511f = new int[]{2131165297, 2131165299, 2131165241, 2131165293, 2131165294, 2131165295, 2131165296};
            this.f18512j = new int[]{2131165273, 2131165239, 2131165272};
            this.f18513m = new int[]{2131165291, 2131165301};
            this.f18514n = new int[]{2131165227, 2131165233, 2131165228, 2131165234};
        }
    }

    public static boolean a(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static void c(File file) {
        if (file.exists() && j(file)) {
            String str = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    public static ColorStateList d(Context context, int i10) {
        int iC = d3.c(context, 2130903315);
        return new ColorStateList(new int[][]{d3.f14751b, d3.f14753d, d3.f14752c, d3.f14755f}, new int[]{d3.b(context, 2130903312), h0.a.b(iC, i10), h0.a.b(iC, i10), i10});
    }

    public static LayerDrawable f(v2 v2Var, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable drawableF = v2Var.f(context, 2131165287);
        Drawable drawableF2 = v2Var.f(context, 2131165288);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static synchronized void i(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean j(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                j(file2);
            }
        }
        return file.delete();
    }

    public static List k(Object[] objArr) {
        return objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
    }

    public static void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterH;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = x.f14987b;
        }
        PorterDuff.Mode mode2 = x.f14987b;
        synchronized (x.class) {
            porterDuffColorFilterH = v2.h(i10, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterH);
    }

    public final n0 b() {
        String strF = ((Integer) this.f18510e) == null ? " batteryVelocity" : "";
        if (((Boolean) this.f18511f) == null) {
            strF = strF.concat(" proximityOn");
        }
        if (((Integer) this.f18512j) == null) {
            strF = h.F(strF, " orientation");
        }
        if (((Long) this.f18513m) == null) {
            strF = h.F(strF, " ramUsed");
        }
        if (((Long) this.f18514n) == null) {
            strF = h.F(strF, " diskUsed");
        }
        if (strF.isEmpty()) {
            return new n0((Double) this.f18509b, ((Integer) this.f18510e).intValue(), ((Boolean) this.f18511f).booleanValue(), ((Integer) this.f18512j).intValue(), ((Long) this.f18513m).longValue(), ((Long) this.f18514n).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strF));
    }

    public final s e(s sVar) {
        return sVar.e(new n.a(10), new g(this, 14));
    }

    public final File g(String str, String str2) {
        File file = new File((File) this.f18511f, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public final ColorStateList h(Context context, int i10) {
        if (i10 == 2131165244) {
            return f.c(context, 2131034133);
        }
        if (i10 == 2131165290) {
            return f.c(context, 2131034136);
        }
        if (i10 != 2131165289) {
            if (i10 == 2131165232) {
                return d(context, d3.c(context, 2130903312));
            }
            if (i10 == 2131165226) {
                return d(context, 0);
            }
            if (i10 == 2131165231) {
                return d(context, d3.c(context, 2130903310));
            }
            if (i10 == 2131165285 || i10 == 2131165286) {
                return f.c(context, 2131034135);
            }
            if (a((int[]) this.f18510e, i10)) {
                return d3.d(context, 2130903316);
            }
            if (a((int[]) this.f18513m, i10)) {
                return f.c(context, 2131034132);
            }
            if (a((int[]) this.f18514n, i10)) {
                return f.c(context, 2131034131);
            }
            if (i10 == 2131165282) {
                return f.c(context, 2131034134);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = d3.d(context, 2130903366);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = d3.f14751b;
            iArr2[0] = d3.b(context, 2130903366);
            iArr[1] = d3.f14754e;
            iArr2[1] = d3.c(context, 2130903314);
            iArr[2] = d3.f14755f;
            iArr2[2] = d3.c(context, 2130903366);
        } else {
            int[] iArr3 = d3.f14751b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = d3.f14754e;
            iArr2[1] = d3.c(context, 2130903314);
            iArr[2] = d3.f14755f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(String str, String str2, Bundle bundle) {
        int i10;
        String strEncodeToString;
        g8.g gVar;
        int iA;
        PackageInfo packageInfoF;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        i7.g gVar2 = (i7.g) this.f18509b;
        gVar2.a();
        bundle.putString("gmp_app_id", gVar2.f13429c.f13437b);
        e eVar = (e) this.f18510e;
        synchronized (eVar) {
            try {
                if (eVar.f2219a == 0 && (packageInfoF = eVar.f("com.google.android.gms")) != null) {
                    eVar.f2219a = packageInfoF.versionCode;
                }
                i10 = eVar.f2219a;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((e) this.f18510e).a());
        bundle.putString("app_ver_name", ((e) this.f18510e).b());
        i7.g gVar3 = (i7.g) this.f18509b;
        gVar3.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar3.f13428b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str3 = ((j8.a) j4.a(((c) ((d) this.f18514n)).e())).f13840a;
            if (TextUtils.isEmpty(str3)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str3);
            }
        } catch (InterruptedException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) j4.a(((c) ((d) this.f18514n)).d()));
            bundle.putString("cliv", "fcm-23.0.6");
            gVar = (g8.g) ((i8.c) this.f18513m).get();
            p8.b bVar = (p8.b) ((i8.c) this.f18512j).get();
            if (gVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) j4.a(((c) ((d) this.f18514n)).d()));
            bundle.putString("cliv", "fcm-23.0.6");
            gVar = (g8.g) ((i8.c) this.f18513m).get();
            p8.b bVar2 = (p8.b) ((i8.c) this.f18512j).get();
            if (gVar == null) {
            }
        }
        bundle.putString("appid", (String) j4.a(((c) ((d) this.f18514n)).d()));
        bundle.putString("cliv", "fcm-23.0.6");
        gVar = (g8.g) ((i8.c) this.f18513m).get();
        p8.b bVar22 = (p8.b) ((i8.c) this.f18512j).get();
        if (gVar == null || bVar22 == null || (iA = ((g8.d) gVar).a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(v.h.b(iA)));
        bundle.putString("Firebase-Client", bVar22.a());
    }

    public final s n(String str, String str2, Bundle bundle) {
        int i10;
        PackageInfo packageInfoG;
        try {
            l(str, str2, bundle);
            w4.b bVar = (w4.b) this.f18511f;
            z0.b bVar2 = bVar.f18653c;
            synchronized (bVar2) {
                if (bVar2.f19424a == 0) {
                    try {
                        packageInfoG = g5.b.a((Context) bVar2.f19426c).g(0, "com.google.android.gms");
                    } catch (PackageManager.NameNotFoundException e10) {
                        String strValueOf = String.valueOf(e10);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
                        sb.append("Failed to find package ");
                        sb.append(strValueOf);
                        Log.w("Metadata", sb.toString());
                        packageInfoG = null;
                    }
                    if (packageInfoG != null) {
                        bVar2.f19424a = packageInfoG.versionCode;
                    }
                    i10 = bVar2.f19424a;
                } else {
                    i10 = bVar2.f19424a;
                }
            }
            if (i10 < 12000000) {
                return bVar.f18653c.b() != 0 ? bVar.a(bundle).f(l.f18681b, new d3.d(17, bVar, bundle)) : j4.h(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            j jVarD = j.d(bVar.f18652b);
            return jVarD.f(new w4.h(jVarD.e(), bundle, 1)).e(l.f18681b, k.f18679b);
        } catch (InterruptedException | ExecutionException e11) {
            return j4.h(e11);
        }
    }

    @Override // o5.c0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Application application = (Application) ((c0) this.f18509b).zzb();
        return new o5.j(application, (p) ((c0) this.f18511f).zzb(), (o5.f) ((c0) this.f18512j).zzb(), (m) ((c0) this.f18513m).zzb(), (c0) this.f18514n);
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f18509b = obj;
        this.f18510e = obj2;
        this.f18511f = obj3;
        this.f18512j = obj4;
        this.f18513m = obj5;
        this.f18514n = obj6;
    }

    public b(String str, b bVar, g2.h hVar) {
        this.f18512j = new com.bumptech.glide.m(this, false);
        this.f18513m = new com.bumptech.glide.m(this, true);
        this.f18514n = new AtomicMarkableReference(null, false);
        this.f18511f = str;
        this.f18509b = new s7.d(bVar);
        this.f18510e = hVar;
    }
}