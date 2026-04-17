package i5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import fc.t;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import o5.y;
import z1.o;
import z2.z;
import z4.d1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final o f13376b;

    /* renamed from: c, reason: collision with root package name */
    public static final w2.k f13377c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f13378d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f13379e = null;

    /* renamed from: f, reason: collision with root package name */
    public static String f13380f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f13381g = false;

    /* renamed from: h, reason: collision with root package name */
    public static int f13382h = -1;

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f13383i;

    /* renamed from: j, reason: collision with root package name */
    public static final ThreadLocal f13384j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public static final d1 f13385k = new d1(1);

    /* renamed from: l, reason: collision with root package name */
    public static final w2.k f13386l;

    /* renamed from: m, reason: collision with root package name */
    public static k f13387m;

    /* renamed from: n, reason: collision with root package name */
    public static l f13388n;

    /* renamed from: a, reason: collision with root package name */
    public final Context f13389a;

    static {
        int i10 = 20;
        f13386l = new w2.k(i10);
        f13376b = new o(i10);
        int i11 = 22;
        f13377c = new w2.k(i11);
        f13378d = new o(i11);
    }

    public f(Context context) {
        this.f13389a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (y.i(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097 A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #5 {all -> 0x0087, blocks: (B:7:0x004f, B:11:0x007d, B:20:0x0091, B:23:0x0097, B:27:0x00ae, B:107:0x021e, B:108:0x0228, B:111:0x022b, B:112:0x022c, B:113:0x0233, B:114:0x0234, B:116:0x0252), top: B:158:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f c(Context context, e eVar, String str) throws Throwable {
        Cursor cursor;
        d dVarF;
        int i10;
        f fVar;
        Boolean bool;
        h5.a aVarS3;
        f fVar2;
        l lVar;
        Boolean boolValueOf;
        h5.a aVarS32;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new b("null application Context");
        }
        ThreadLocal threadLocal = f13384j;
        j jVar = (j) threadLocal.get();
        j jVar2 = new j();
        threadLocal.set(jVar2);
        d1 d1Var = f13385k;
        long jLongValue = ((Long) d1Var.get()).longValue();
        try {
            d1Var.set(Long.valueOf(SystemClock.elapsedRealtime()));
            dVarF = eVar.f(context, str, f13386l);
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + dVarF.f13373b + " and remote module " + str + ":" + dVarF.f13374c);
                i10 = dVarF.f13375d;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (i10 != 0) {
            if (i10 != -1) {
                if (i10 == 1 || dVarF.f13374c != 0) {
                    if (i10 != -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        fVar = new f(applicationContext);
                    } else {
                        if (i10 != 1) {
                            throw new b("VersionPolicy returned invalid code:" + i10);
                        }
                        jVar = null;
                        try {
                            int i11 = dVarF.f13374c;
                            try {
                                synchronized (f.class) {
                                    if (!g(context)) {
                                        throw new b("Remote loading disabled");
                                    }
                                    bool = f13379e;
                                }
                                if (bool == null) {
                                    throw new b("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                    synchronized (f.class) {
                                        lVar = f13388n;
                                    }
                                    if (lVar == null) {
                                        throw new b("DynamiteLoaderV2 was not cached.");
                                    }
                                    j jVar3 = (j) threadLocal.get();
                                    if (jVar3 == null || jVar3.f13394a == null) {
                                        throw new b("No result cursor");
                                    }
                                    Context applicationContext2 = context.getApplicationContext();
                                    Cursor cursor3 = jVar3.f13394a;
                                    new h5.b(null);
                                    synchronized (f.class) {
                                        boolValueOf = Boolean.valueOf(f13382h >= 2);
                                    }
                                    if (boolValueOf.booleanValue()) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        aVarS32 = lVar.t3(new h5.b(applicationContext2), str, i11, new h5.b(cursor3));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        aVarS32 = lVar.s3(new h5.b(applicationContext2), str, i11, new h5.b(cursor3));
                                    }
                                    Context context2 = (Context) h5.b.r3(aVarS32);
                                    if (context2 == null) {
                                        throw new b("Failed to get module context");
                                    }
                                    fVar2 = new f(context2);
                                } else {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                    k kVarH = h(context);
                                    if (kVarH == null) {
                                        throw new b("Failed to create IDynamiteLoader.");
                                    }
                                    Parcel parcelA = kVarH.A(kVarH.T(), 6);
                                    int i12 = parcelA.readInt();
                                    parcelA.recycle();
                                    if (i12 >= 3) {
                                        j jVar4 = (j) threadLocal.get();
                                        if (jVar4 == null) {
                                            throw new b("No cached result cursor holder");
                                        }
                                        aVarS3 = kVarH.t3(new h5.b(context), str, i11, new h5.b(jVar4.f13394a));
                                    } else if (i12 == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        aVarS3 = kVarH.u3(new h5.b(context), str, i11);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        aVarS3 = kVarH.s3(new h5.b(context), str, i11);
                                    }
                                    Object objR3 = h5.b.r3(aVarS3);
                                    if (objR3 == null) {
                                        throw new b("Failed to load remote module.");
                                    }
                                    fVar2 = new f((Context) objR3);
                                }
                                fVar = fVar2;
                            } catch (RemoteException e10) {
                                throw new b("Failed to load remote module.", e10);
                            } catch (b e11) {
                                throw e11;
                            } catch (Throwable th3) {
                                e5.c.a(context, th3);
                                throw new b("Failed to load remote module.", th3);
                            }
                        } catch (b e12) {
                            Log.w("DynamiteModule", "Failed to load remote module: " + e12.getMessage());
                            int i13 = dVarF.f13373b;
                            if (i13 == 0 || eVar.f(context, str, new z(i13, 0, 1)).f13375d != -1) {
                                throw new b("Remote load failed. No local fallback found.", e12);
                            }
                            try {
                                Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                fVar = new f(applicationContext);
                            } catch (Throwable th4) {
                                th = th4;
                                jVar = jVar;
                                d1 d1Var2 = f13385k;
                                if (jLongValue != 0) {
                                }
                                cursor = jVar2.f13394a;
                                if (cursor != null) {
                                }
                                f13384j.set(jVar);
                                throw th;
                            }
                        }
                    }
                    d1 d1Var3 = f13385k;
                    if (jLongValue != 0) {
                        d1Var3.remove();
                    } else {
                        d1Var3.set(Long.valueOf(jLongValue));
                    }
                    cursor2 = jVar2.f13394a;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    f13384j.set(jVar);
                    return fVar;
                }
            } else if (dVarF.f13373b != 0) {
                i10 = -1;
                if (i10 == 1) {
                }
                if (i10 != -1) {
                }
                d1 d1Var32 = f13385k;
                if (jLongValue != 0) {
                }
                cursor2 = jVar2.f13394a;
                if (cursor2 != null) {
                }
                f13384j.set(jVar);
                return fVar;
            }
            d1 d1Var22 = f13385k;
            if (jLongValue != 0) {
                d1Var22.remove();
            } else {
                d1Var22.set(Long.valueOf(jLongValue));
            }
            cursor = jVar2.f13394a;
            if (cursor != null) {
                cursor.close();
            }
            f13384j.set(jVar);
            throw th;
        }
        throw new b("No acceptable module " + str + " found. Local version is " + dVarF.f13373b + " and remote version is " + dVarF.f13374c + ".");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00af A[Catch: all -> 0x0036, TryCatch #9 {, blocks: (B:9:0x0026, B:11:0x0032, B:53:0x00b7, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004e, B:27:0x0052, B:31:0x005c, B:33:0x0064, B:36:0x006b, B:43:0x0097, B:44:0x009f, B:39:0x0072, B:41:0x0078, B:42:0x0089, B:47:0x00a2, B:50:0x00a5, B:51:0x00ac, B:52:0x00af, B:17:0x003e), top: B:143:0x0026, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, String str, boolean z7) {
        Field declaredField;
        Throwable th;
        RemoteException e10;
        int i10;
        j jVar;
        Cursor cursor;
        try {
            synchronized (f.class) {
                Boolean bool = f13379e;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e11.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                f(classLoader);
                            } catch (b unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!g(context)) {
                                return 0;
                            }
                            if (!f13381g) {
                                Boolean bool2 = Boolean.TRUE;
                                if (bool2.equals(null)) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                } else {
                                    try {
                                        int iE = e(context, str, z7, true);
                                        String str2 = f13380f;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader classLoaderG = h.g();
                                            if (classLoaderG == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    a.c();
                                                    String str3 = f13380f;
                                                    t.k(str3);
                                                    classLoaderG = a.b(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f13380f;
                                                    t.k(str4);
                                                    classLoaderG = new i(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            f(classLoaderG);
                                            declaredField.set(null, classLoaderG);
                                            f13379e = bool2;
                                            return iE;
                                        }
                                        return iE;
                                    } catch (b unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    }
                                }
                                bool = Boolean.FALSE;
                            }
                        }
                        f13379e = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z7, false);
                    } catch (b e12) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e12.getMessage());
                        return 0;
                    }
                }
                k kVarH = h(context);
                try {
                    if (kVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelA = kVarH.A(kVarH.T(), 6);
                        int i11 = parcelA.readInt();
                        parcelA.recycle();
                        if (i11 >= 3) {
                            ThreadLocal threadLocal = f13384j;
                            j jVar2 = (j) threadLocal.get();
                            if (jVar2 != null && (cursor = jVar2.f13394a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) h5.b.r3(kVarH.v3(new h5.b(context), str, z7, ((Long) f13385k.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i10 = cursor3.getInt(0);
                                        if (i10 <= 0 || (jVar = (j) threadLocal.get()) == null || jVar.f13394a != null) {
                                            cursor2 = cursor3;
                                        } else {
                                            jVar.f13394a = cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e13) {
                                    e10 = e13;
                                    cursor2 = cursor3;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e10.getMessage());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i11 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            h5.b bVar = new h5.b(context);
                            Parcel parcelT = kVarH.T();
                            n5.a.c(parcelT, bVar);
                            parcelT.writeString(str);
                            parcelT.writeInt(z7 ? 1 : 0);
                            Parcel parcelA2 = kVarH.A(parcelT, 5);
                            i10 = parcelA2.readInt();
                            parcelA2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            h5.b bVar2 = new h5.b(context);
                            Parcel parcelT2 = kVarH.T();
                            n5.a.c(parcelT2, bVar2);
                            parcelT2.writeString(str);
                            parcelT2.writeInt(z7 ? 1 : 0);
                            Parcel parcelA3 = kVarH.A(parcelT2, 3);
                            i10 = parcelA3.readInt();
                            parcelA3.recycle();
                        }
                        return i10;
                    } catch (RemoteException e14) {
                        e10 = e14;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            e5.c.a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097 A[PHI: r9
      0x0097: PHI (r9v8 boolean) = (r9v7 boolean), (r9v12 boolean), (r9v12 boolean) binds: [B:11:0x0055, B:29:0x008e, B:31:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e(Context context, String str, boolean z7, boolean z10) throws Throwable {
        Cursor cursor = null;
        try {
            try {
                boolean z11 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z7 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f13385k.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z12 = false;
                            int i10 = cursorQuery.getInt(0);
                            if (i10 > 0) {
                                synchronized (f.class) {
                                    try {
                                        f13380f = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f13382h = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (cursorQuery.getInt(columnIndex2) == 0) {
                                                z11 = false;
                                            }
                                            f13381g = z11;
                                            z12 = z11;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                j jVar = (j) f13384j.get();
                                if (jVar == null || jVar.f13394a != null) {
                                    cursor = cursorQuery;
                                } else {
                                    jVar.f13394a = cursorQuery;
                                }
                            }
                            if (z10 && z12) {
                                throw new b("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i10;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        if (e instanceof b) {
                            throw e;
                        }
                        throw new b("V2 version check failed: " + e.getMessage(), e);
                    } catch (Throwable th2) {
                        cursor = cursorQuery;
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new b("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void f(ClassLoader classLoader) throws b {
        l lVar;
        String str = "com.google.android.gms.dynamite.IDynamiteLoaderV2";
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                lVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                lVar = iInterfaceQueryLocalInterface instanceof l ? (l) iInterfaceQueryLocalInterface : new l(iBinder, str, 2);
            }
            f13388n = lVar;
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new b("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new b("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new b("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new b("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e14) {
            e = e14;
            throw new b("Failed to instantiate dynamite loader", e);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f13383i)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (f13383i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (x4.g.f18964b.d(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            f13383i = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f13381g = true;
            }
        }
        if (!zBooleanValue) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    public static k h(Context context) {
        k kVar;
        synchronized (f.class) {
            k kVar2 = f13387m;
            if (kVar2 != null) {
                return kVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    kVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    kVar = iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
                }
                if (kVar != null) {
                    f13387m = kVar;
                    return kVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f13389a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new b("Failed to instantiate module class: ".concat(str), e10);
        }
    }
}