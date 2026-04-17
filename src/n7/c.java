package n7;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.j1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.isprid.kendare.MyApplication;
import ec.h;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks;
import kotlin.text.Regex;
import m2.f;
import o0.y;
import org.json.JSONObject;
import s8.n;
import s8.o;
import x5.k;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements x5.c, p7.a, s7.a, x7.c, o, SourceFile, JavaResolverCache, TypeCheckingProcedureCallbacks {

    /* renamed from: e, reason: collision with root package name */
    public static c f15367e;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15368b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c() {
        this(2);
        this.f15368b = 2;
    }

    public static /* synthetic */ void k(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                objArr[0] = "member";
                break;
            case 2:
            case 4:
            case g.RESOLUTION_REQUIRED /* 6 */:
            case 8:
                objArr[0] = "descriptor";
                break;
            case 3:
                objArr[0] = "element";
                break;
            case g.INVALID_ACCOUNT /* 5 */:
                objArr[0] = "field";
                break;
            case g.NETWORK_ERROR /* 7 */:
                objArr[0] = "javaClass";
                break;
            default:
                objArr[0] = "fqName";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
            case 2:
                objArr[2] = "recordMethod";
                break;
            case 3:
            case 4:
                objArr[2] = "recordConstructor";
                break;
            case g.INVALID_ACCOUNT /* 5 */:
            case g.RESOLUTION_REQUIRED /* 6 */:
                objArr[2] = "recordField";
                break;
            case g.NETWORK_ERROR /* 7 */:
            case 8:
                objArr[2] = "recordClass";
                break;
            default:
                objArr[2] = "getClassResolvedFromSource";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static /* synthetic */ void l(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case g.NETWORK_ERROR /* 7 */:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case g.INVALID_ACCOUNT /* 5 */:
            case g.DEVELOPER_ERROR /* 10 */:
                objArr[0] = "subtype";
                break;
            case g.RESOLUTION_REQUIRED /* 6 */:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i10) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case g.INVALID_ACCOUNT /* 5 */:
            case g.RESOLUTION_REQUIRED /* 6 */:
            case g.NETWORK_ERROR /* 7 */:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case g.DEVELOPER_ERROR /* 10 */:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean n(Context mContext) {
        Intrinsics.f(mContext, "mContext");
        Object systemService = mContext.getSystemService("connectivity");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return ((ConnectivityManager) systemService).getActiveNetworkInfo() != null;
    }

    public static x7.a o(q6.b bVar) {
        y yVar = new y(8, 4);
        f fVar = new f(true, false);
        bVar.getClass();
        return new x7.a(System.currentTimeMillis() + 3600000, yVar, fVar, 10.0d, 1.2d, 60);
    }

    public static x9.c p(String str) {
        x9.c cVar = null;
        if (str != null) {
            x9.c[] cVarArrValues = x9.c.values();
            int length = cVarArrValues.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                x9.c cVar2 = cVarArrValues[length];
                if (h.u(cVar2.name(), str, true)) {
                    cVar = cVar2;
                    break;
                }
            }
        }
        return cVar == null ? x9.c.f19122f : cVar;
    }

    public static String r(String str, int i10) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f14209a;
        String str2 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i10 & 16777215)}, 1));
        Intrinsics.e(str2, "format(format, *args)");
        return "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///android_res/font/outfit_regular.ttf\")}body{font-family: MyFont;color: " + str2 + ";text-align: justify;font-size: 14px;}</style></head><body>" + str + "</body></html>";
    }

    public static boolean s() {
        return g5.a.f13039k && !u();
    }

    public static boolean t(Context context) {
        Intrinsics.f(context, "context");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
            Intrinsics.e(allNetworkInfo, "it.allNetworkInfo");
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean u() {
        if (s9.h.f16959c == null) {
            s9.h.f16959c = new s9.h();
        }
        return s9.h.f16959c.f16960a.getBoolean("IS_SUBSCRIBED", false);
    }

    public static void v(Class cls) {
        String strB = new Regex("[^A-Za-z0-9_]").b(cls.getSimpleName(), "");
        Bundle bundle = new Bundle();
        bundle.putString("select_content", strB);
        c cVar = MyApplication.f11640b;
        FirebaseAnalytics firebaseAnalytics = MyApplication.f11641e;
        if (firebaseAnalytics == null) {
            Intrinsics.n("firebaseAnalytics");
            throw null;
        }
        j1 j1Var = firebaseAnalytics.f11624a;
        j1Var.getClass();
        j1Var.b(new d1(j1Var, null, strB, bundle, false));
    }

    public static void w(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("select_content", str);
        c cVar = MyApplication.f11640b;
        FirebaseAnalytics firebaseAnalytics = MyApplication.f11641e;
        if (firebaseAnalytics == null) {
            Intrinsics.n("firebaseAnalytics");
            throw null;
        }
        j1 j1Var = firebaseAnalytics.f11624a;
        j1Var.getClass();
        j1Var.b(new d1(j1Var, null, str, bundle, false));
    }

    public final void a(JavaField javaField, JavaPropertyDescriptor javaPropertyDescriptor) {
    }

    @Override // s7.a
    public final void b() {
    }

    public final void c(JavaElement javaElement, JavaClassConstructorDescriptor javaClassConstructorDescriptor) {
        if (javaElement != null) {
            return;
        }
        k(3);
        throw null;
    }

    public final void d(JavaMember javaMember, JavaMethodDescriptor javaMethodDescriptor) {
    }

    @Override // s7.a
    public final String e() {
        return null;
    }

    @Override // x7.c
    public final x7.a f(q6.b bVar, JSONObject jSONObject) {
        return o(bVar);
    }

    public final void g(JavaClass javaClass, ClassDescriptor classDescriptor) {
        if (javaClass == null) {
            k(7);
            throw null;
        }
        if (classDescriptor != null) {
            return;
        }
        k(8);
        throw null;
    }

    @Override // p7.a
    public final void h(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // s7.a
    public final void i(long j10, String str) {
    }

    @Override // s8.o
    public final Object j() {
        switch (this.f15368b) {
            case g.INVALID_ACCOUNT /* 5 */:
                return new TreeSet();
            case g.RESOLUTION_REQUIRED /* 6 */:
                return new ArrayDeque();
            case g.NETWORK_ERROR /* 7 */:
                return new ConcurrentSkipListMap();
            case 8:
                return new TreeMap();
            default:
                return new n(true);
        }
    }

    public final boolean m(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        if (typeConstructor == null) {
            l(3);
            throw null;
        }
        if (typeConstructor2 != null) {
            return typeConstructor.equals(typeConstructor2);
        }
        l(4);
        throw null;
    }

    public final Context q() {
        MyApplication myApplication = MyApplication.f11642f;
        if (myApplication != null) {
            return myApplication;
        }
        Intrinsics.n("context");
        throw null;
    }

    @Override // x5.c
    public final Object then(k kVar) {
        if (kVar.j()) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", kVar.g());
        return null;
    }

    public /* synthetic */ c(int i10) {
        this.f15368b = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11) {
        this(10);
        this.f15368b = i10;
        int i12 = 24;
        if (i10 == 24) {
            this(i12);
            return;
        }
        int i13 = 25;
        if (i10 == 25) {
            this(i13);
            return;
        }
        int i14 = 29;
        if (i10 != 29) {
            switch (i10) {
                case 11:
                    this(11);
                    break;
                case 12:
                    this(12);
                    break;
                case g.ERROR /* 13 */:
                    this(13);
                    break;
                case g.INTERRUPTED /* 14 */:
                    this(14);
                    break;
                case g.TIMEOUT /* 15 */:
                    this(15);
                    break;
                case g.CANCELED /* 16 */:
                    this(16);
                    break;
                case g.API_NOT_CONNECTED /* 17 */:
                    this(17);
                    break;
                case 18:
                    this(18);
                    break;
                case g.REMOTE_EXCEPTION /* 19 */:
                    this(19);
                    break;
                case g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                    this(20);
                    break;
                case g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    this(21);
                    break;
                case g.RECONNECTION_TIMED_OUT /* 22 */:
                    this(22);
                    break;
                default:
                    break;
            }
            return;
        }
        this(i14);
    }
}