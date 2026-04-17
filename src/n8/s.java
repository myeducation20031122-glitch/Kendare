package n8;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.onesignal.f4;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import t7.i0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s implements t3.b {

    /* renamed from: m, reason: collision with root package name */
    public static s f15434m;

    /* renamed from: b, reason: collision with root package name */
    public Object f15435b;

    /* renamed from: e, reason: collision with root package name */
    public Object f15436e;

    /* renamed from: f, reason: collision with root package name */
    public Object f15437f;

    /* renamed from: j, reason: collision with root package name */
    public Object f15438j;

    public s(int i10) {
        if (i10 != 1 && i10 != 10) {
            if (i10 == 3) {
                this.f15435b = new v.e(10, 1);
                this.f15436e = new t.k();
                this.f15437f = new ArrayList();
                this.f15438j = new HashSet();
                return;
            }
            if (i10 == 4) {
                this.f15435b = new t.b();
                this.f15436e = new SparseArray();
                this.f15437f = new t.e();
                this.f15438j = new t.b();
                return;
            }
            if (i10 != 5) {
                this.f15435b = null;
                this.f15436e = null;
                this.f15437f = null;
                this.f15438j = new ArrayDeque();
                return;
            }
            this.f15436e = null;
            this.f15437f = new ArrayList();
            this.f15438j = null;
            this.f15435b = "";
        }
    }

    public static synchronized s d() {
        try {
            if (f15434m == null) {
                f15434m = new s(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f15434m;
    }

    public final i0 a() {
        String strF = ((Long) this.f15436e) == null ? " baseAddress" : "";
        if (((Long) this.f15437f) == null) {
            strF = strF.concat(" size");
        }
        if (((String) this.f15435b) == null) {
            strF = a0.h.F(strF, " name");
        }
        if (strF.isEmpty()) {
            return new i0(((Long) this.f15436e).longValue(), ((Long) this.f15437f).longValue(), (String) this.f15435b, (String) this.f15438j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strF));
    }

    public final z9.b b() {
        if (((o5.d) this.f15437f).s()) {
            com.onesignal.l logger = (com.onesignal.l) this.f15435b;
            o5.d outcomeEventsCache = (o5.d) this.f15437f;
            z9.e eVar = new z9.e((com.onesignal.l) this.f15436e, 1);
            Intrinsics.f(logger, "logger");
            Intrinsics.f(outcomeEventsCache, "outcomeEventsCache");
            return new z9.f(logger, outcomeEventsCache, eVar);
        }
        com.onesignal.l logger2 = (com.onesignal.l) this.f15435b;
        o5.d outcomeEventsCache2 = (o5.d) this.f15437f;
        z9.e eVar2 = new z9.e((com.onesignal.l) this.f15436e, 0);
        Intrinsics.f(logger2, "logger");
        Intrinsics.f(outcomeEventsCache2, "outcomeEventsCache");
        return new z9.d(logger2, outcomeEventsCache2, eVar2);
    }

    public final void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((t.k) this.f15436e).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                c(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if ((r0 instanceof z9.f) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z9.b e() {
        z9.b bVar;
        if (((z9.b) this.f15438j) == null) {
            return b();
        }
        if (!((o5.d) this.f15437f).s()) {
            bVar = (z9.b) this.f15438j;
            if (!(bVar instanceof z9.d)) {
                if (((o5.d) this.f15437f).s()) {
                    bVar = (z9.b) this.f15438j;
                }
                return b();
            }
        }
        Intrinsics.c(bVar);
        return bVar;
    }

    public final boolean f(Context context) {
        if (((Boolean) this.f15437f) == null) {
            this.f15437f = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f15436e).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f15437f).booleanValue();
    }

    public final boolean g(Context context) {
        if (((Boolean) this.f15436e) == null) {
            this.f15436e = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f15436e).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f15436e).booleanValue();
    }

    @Override // da.a
    public final Object get() {
        return new w3.l((Executor) ((da.a) this.f15435b).get(), (x3.d) ((da.a) this.f15436e).get(), (w3.m) ((da.a) this.f15437f).get(), (y3.c) ((da.a) this.f15438j).get());
    }

    public final q.d h() {
        q.a aVar = new q.a();
        aVar.attachInterface(aVar, "android.support.customtabs.ICustomTabsCallback");
        new Handler(Looper.getMainLooper());
        try {
            a.c cVar = (a.c) ((a.e) this.f15435b);
            cVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                parcelObtain.writeStrongBinder(aVar);
                if (!cVar.f0b.transact(3, parcelObtain, parcelObtain2, 0)) {
                    int i10 = a.d.f1b;
                }
                parcelObtain2.readException();
                if (parcelObtain2.readInt() != 0) {
                    return new q.d((a.e) this.f15435b, aVar, (ComponentName) this.f15436e);
                }
                return null;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final s i() {
        return new s(this, (d3.d) this.f15436e);
    }

    public final com.google.android.gms.internal.measurement.n j(com.google.android.gms.internal.measurement.n nVar) {
        return ((d3.d) this.f15436e).j(this, nVar);
    }

    public final com.google.android.gms.internal.measurement.n k(com.google.android.gms.internal.measurement.d dVar) {
        com.google.android.gms.internal.measurement.n nVarJ = com.google.android.gms.internal.measurement.n.f10899l;
        Iterator itM = dVar.m();
        while (itM.hasNext()) {
            nVarJ = ((d3.d) this.f15436e).j(this, dVar.h(((Integer) itM.next()).intValue()));
            if (nVarJ instanceof com.google.android.gms.internal.measurement.f) {
                break;
            }
        }
        return nVarJ;
    }

    public final com.google.android.gms.internal.measurement.n l(String str) {
        if (((Map) this.f15437f).containsKey(str)) {
            return (com.google.android.gms.internal.measurement.n) ((Map) this.f15437f).get(str);
        }
        s sVar = (s) this.f15435b;
        if (sVar != null) {
            return sVar.l(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final void m(String str, com.google.android.gms.internal.measurement.n nVar) {
        if (((Map) this.f15438j).containsKey(str)) {
            return;
        }
        if (nVar == null) {
            ((Map) this.f15437f).remove(str);
        } else {
            ((Map) this.f15437f).put(str, nVar);
        }
    }

    public final void n(String str, com.google.android.gms.internal.measurement.n nVar) {
        s sVar;
        if (!((Map) this.f15437f).containsKey(str) && (sVar = (s) this.f15435b) != null && sVar.o(str)) {
            ((s) this.f15435b).n(str, nVar);
        } else {
            if (((Map) this.f15438j).containsKey(str)) {
                return;
            }
            if (nVar == null) {
                ((Map) this.f15437f).remove(str);
            } else {
                ((Map) this.f15437f).put(str, nVar);
            }
        }
    }

    public final boolean o(String str) {
        if (((Map) this.f15437f).containsKey(str)) {
            return true;
        }
        s sVar = (s) this.f15435b;
        if (sVar != null) {
            return sVar.o(str);
        }
        return false;
    }

    public s(com.onesignal.l logger, com.onesignal.l apiClient, f4 f4Var, com.onesignal.l lVar) {
        Intrinsics.f(logger, "logger");
        Intrinsics.f(apiClient, "apiClient");
        this.f15435b = logger;
        this.f15436e = apiClient;
        Intrinsics.c(f4Var);
        Intrinsics.c(lVar);
        this.f15437f = new o5.d(logger, f4Var, lVar);
    }

    public s(Throwable th, y7.a aVar) {
        this.f15435b = th.getLocalizedMessage();
        this.f15436e = th.getClass().getName();
        this.f15437f = aVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f15438j = cause != null ? new s(cause, aVar) : null;
    }

    public s(s sVar, d3.d dVar) {
        this.f15437f = new HashMap();
        this.f15438j = new HashMap();
        this.f15435b = sVar;
        this.f15436e = dVar;
    }
}