package a5;

import android.app.ActivityManager;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.measurement.m7;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.u8;
import com.google.android.gms.location.LocationResult;
import com.onesignal.y3;
import com.onesignal.z3;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import o0.c1;
import o0.m2;
import t5.a3;
import t5.b4;
import t5.i3;
import t5.j4;
import t5.q3;
import t5.q5;
import t5.t3;
import t5.v4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x implements b, z4.o, z4.l, p6.p, o0.z, d7.c, p7.a, x5.j, s8.o, DFS.Neighbors {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f422b;

    /* renamed from: e, reason: collision with root package name */
    public Object f423e;

    public x() {
        this.f422b = 15;
        this.f423e = null;
    }

    @Override // a5.b
    public final void A(int i10) {
        ((z4.f) this.f423e).A(i10);
    }

    @Override // a5.b
    public final void T(Bundle bundle) {
        ((z4.f) this.f423e).T(null);
    }

    @Override // p6.p
    public final m2 a(View view, m2 m2Var, k4.j jVar) {
        jVar.f14006d = m2Var.a() + jVar.f14006d;
        WeakHashMap weakHashMap = c1.f15515a;
        boolean z7 = view.getLayoutDirection() == 1;
        int iB = m2Var.b();
        int iC = m2Var.c();
        int i10 = jVar.f14003a + (z7 ? iC : iB);
        jVar.f14003a = i10;
        int i11 = jVar.f14005c;
        if (!z7) {
            iB = iC;
        }
        int i12 = i11 + iB;
        jVar.f14005c = i12;
        view.setPaddingRelative(i10, jVar.f14004b, i12, jVar.f14006d);
        return m2Var;
    }

    public final Iterable b(Object obj) {
        JvmBuiltInsCustomizer this$0 = (JvmBuiltInsCustomizer) this.f423e;
        KProperty[] kPropertyArr = JvmBuiltInsCustomizer.h;
        Intrinsics.f(this$0, "this$0");
        Collection collectionG = ((ClassDescriptor) obj).k().g();
        Intrinsics.e(collectionG, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionG.iterator();
        while (it.hasNext()) {
            ClassifierDescriptor classifierDescriptorC = ((KotlinType) it.next()).L0().c();
            ClassifierDescriptor classifierDescriptorB = classifierDescriptorC != null ? classifierDescriptorC.b() : null;
            ClassDescriptor classDescriptor = classifierDescriptorB instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorB : null;
            LazyJavaClassDescriptor lazyJavaClassDescriptorF = classDescriptor != null ? this$0.f(classDescriptor) : null;
            if (lazyJavaClassDescriptorF != null) {
                arrayList.add(lazyJavaClassDescriptorF);
            }
        }
        return arrayList;
    }

    @Override // z4.l
    public final void c(Object obj) {
        switch (this.f422b) {
            case 3:
                p5.h hVar = (p5.h) obj;
                List list = ((LocationResult) this.f423e).f11291b;
                int size = list.size();
                hVar.f15952a.d(size != 0 ? (Location) list.get(size - 1) : null);
                try {
                    p5.q qVar = hVar.f15953b;
                    fc.t.h("Listener type must not be empty", "GetCurrentLocation");
                    qVar.J(new z4.k(hVar, "GetCurrentLocation"), false, new x5.l());
                    break;
                } catch (RemoteException unused) {
                    return;
                }
            default:
                Location location = (Location) this.f423e;
                z3.b(y3.f12233n, "GMSLocationController onLocationChanged: " + location, null);
                com.onesignal.o0.f12037h = location;
                break;
        }
    }

    @Override // z4.l
    public final void d() {
    }

    public final void e(m2.e eVar) {
        if (eVar.f15097b != 0) {
            t9.g gVar = (t9.g) this.f423e;
            Date date = t9.g.N;
            gVar.B();
            ((t9.g) this.f423e).y(eVar.f15097b, new Throwable(eVar.f15098c));
            return;
        }
        ((t9.g) this.f423e).f18076t = 1000L;
        Log.d("GooglePlayConnection; ", "IsConnected");
        if (((t9.g) this.f423e).f18078w) {
            return;
        }
        new i4.i((t9.g) this.f423e, 0).execute(new Void[0]);
    }

    public final void f() {
        ((q5) this.f423e).o();
        q3 q3Var = ((b4) ((q5) this.f423e).f15046b).f17250u;
        b4.g(q3Var);
        ((b4) ((q5) this.f423e).f15046b).Q.getClass();
        if (q3Var.x(System.currentTimeMillis())) {
            q3 q3Var2 = ((b4) ((q5) this.f423e).f15046b).f17250u;
            b4.g(q3Var2);
            q3Var2.N.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                i3 i3Var = ((b4) ((q5) this.f423e).f15046b).f17251w;
                b4.i(i3Var);
                i3Var.Q.a("Detected application was in foreground");
                ((b4) ((q5) this.f423e).f15046b).Q.getClass();
                l(System.currentTimeMillis(), false);
            }
        }
    }

    @Override // z4.o
    public final void g(k kVar, Object obj) {
        k5.d dVar = (k5.d) ((k5.b) kVar).z();
        k5.g gVar = new k5.g((x5.l) obj);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i10 = k5.a.f14013a;
        parcelObtain.writeInt(1);
        com.bumptech.glide.e.h0(parcelObtain, com.bumptech.glide.e.c0(parcelObtain, 20293));
        parcelObtain.writeStrongBinder(gVar);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            dVar.f14014b.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // p7.a
    public final void h(Bundle bundle) {
        ((k7.b) ((k7.a) this.f423e)).a("clx", "_ae", bundle);
    }

    @Override // o0.z
    public final m2 i(View view, m2 m2Var) {
        ((x6.j) this.f423e).f19075m = m2Var.a();
        ((x6.j) this.f423e).f19076n = m2Var.b();
        ((x6.j) this.f423e).f19077o = m2Var.c();
        ((x6.j) this.f423e).e();
        return m2Var;
    }

    @Override // s8.o
    public final Object j() {
        Object obj = this.f423e;
        if (!(((Type) obj) instanceof ParameterizedType)) {
            throw new m7.p("Invalid EnumMap type: " + ((Type) this.f423e).toString());
        }
        Type type = ((ParameterizedType) ((Type) obj)).getActualTypeArguments()[0];
        if (type instanceof Class) {
            return new EnumMap((Class) type);
        }
        throw new m7.p("Invalid EnumMap type: " + ((Type) this.f423e).toString());
    }

    public final void k(long j10, boolean z7) {
        ((q5) this.f423e).o();
        ((q5) this.f423e).s();
        q3 q3Var = ((b4) ((q5) this.f423e).f15046b).f17250u;
        b4.g(q3Var);
        if (q3Var.x(j10)) {
            q3 q3Var2 = ((b4) ((q5) this.f423e).f15046b).f17250u;
            b4.g(q3Var2);
            q3Var2.N.a(true);
            u8.a();
            if (((b4) ((q5) this.f423e).f15046b).f17249t.y(null, a3.f17204u0)) {
                ((b4) ((q5) this.f423e).f15046b).n().w();
            }
        }
        q3 q3Var3 = ((b4) ((q5) this.f423e).f15046b).f17250u;
        b4.g(q3Var3);
        q3Var3.Q.c(j10);
        q3 q3Var4 = ((b4) ((q5) this.f423e).f15046b).f17250u;
        b4.g(q3Var4);
        if (q3Var4.N.b()) {
            l(j10, z7);
        }
    }

    public final void l(long j10, boolean z7) {
        ((q5) this.f423e).o();
        if (((b4) ((q5) this.f423e).f15046b).e()) {
            q3 q3Var = ((b4) ((q5) this.f423e).f15046b).f17250u;
            b4.g(q3Var);
            q3Var.Q.c(j10);
            ((b4) ((q5) this.f423e).f15046b).Q.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            i3 i3Var = ((b4) ((q5) this.f423e).f15046b).f17251w;
            b4.i(i3Var);
            i3Var.Q.b(Long.valueOf(jElapsedRealtime), "Session started, time");
            Long lValueOf = Long.valueOf(j10 / 1000);
            v4 v4Var = ((b4) ((q5) this.f423e).f15046b).S;
            b4.h(v4Var);
            v4Var.F(j10, lValueOf, "auto", "_sid");
            q3 q3Var2 = ((b4) ((q5) this.f423e).f15046b).f17250u;
            b4.g(q3Var2);
            q3Var2.N.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", lValueOf.longValue());
            if (((b4) ((q5) this.f423e).f15046b).f17249t.y(null, a3.Z) && z7) {
                bundle.putLong("_aib", 1L);
            }
            v4 v4Var2 = ((b4) ((q5) this.f423e).f15046b).S;
            b4.h(v4Var2);
            v4Var2.x(j10, bundle, "auto", "_s");
            ((n7) m7.f10897e.f10898b.zza()).getClass();
            if (((b4) ((q5) this.f423e).f15046b).f17249t.y(null, a3.f17168c0)) {
                q3 q3Var3 = ((b4) ((q5) this.f423e).f15046b).f17250u;
                b4.g(q3Var3);
                String strF = q3Var3.V.f();
                if (TextUtils.isEmpty(strF)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strF);
                v4 v4Var3 = ((b4) ((q5) this.f423e).f15046b).S;
                b4.h(v4Var3);
                v4Var3.x(j10, bundle2, "auto", "_ssr");
            }
        }
    }

    @Override // x5.j
    public final x5.k then(Object obj) {
        return j4.i(Boolean.TRUE);
    }

    @Override // d7.c
    public final Object zza() {
        Context context = ((c7.f) ((d7.c) this.f423e)).f2161b.f243e;
        if (context != null) {
            return new c7.l(context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public /* synthetic */ x(int i10, Object obj) {
        this.f422b = i10;
        this.f423e = obj;
    }

    public /* synthetic */ x(Object obj, int i10) {
        this.f422b = i10;
        this.f423e = obj;
    }

    public x(t3 t3Var) {
        this.f422b = 5;
        fc.t.k(t3Var);
        this.f423e = t3Var;
    }
}