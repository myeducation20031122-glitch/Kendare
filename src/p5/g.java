package p5;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.l3;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.onesignal.h4;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeoutException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import o0.c1;
import org.json.JSONException;
import org.json.JSONObject;
import t5.a6;
import t5.b4;
import t5.i3;
import t5.w5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class g implements x5.e, z4.l, a6, x5.g, x5.f, x5.d, p0.r, p7.b, q7.a, x5.c, s8.o, y9.b {

    /* renamed from: b, reason: collision with root package name */
    public Object f15951b;

    public /* synthetic */ g() {
        this.f15951b = new CountDownLatch(1);
    }

    public static String q(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // t5.a6
    public final void a(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            ((w5) this.f15951b).zzaz().x(new l.g(this, str, bundle));
            return;
        }
        b4 b4Var = ((w5) this.f15951b).O;
        if (b4Var != null) {
            i3 i3Var = b4Var.f17251w;
            b4.i(i3Var);
            i3Var.f17397n.b("_err", "AppId not known when logging event");
        }
    }

    @Override // q7.a
    public final void b(r7.k kVar) {
        this.f15951b = kVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // z4.l
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ((n) this.f15951b).f15962f.mo22zzb();
    }

    @Override // z4.l
    public final void d() {
    }

    @Override // p0.r
    public final boolean e(View view) {
        if (!((SwipeDismissBehavior) this.f15951b).s(view)) {
            return false;
        }
        WeakHashMap weakHashMap = c1.f15515a;
        boolean z7 = view.getLayoutDirection() == 1;
        int i10 = ((SwipeDismissBehavior) this.f15951b).f11348e;
        c1.k(view, (!(i10 == 0 && z7) && (i10 != 1 || z7)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        m mVar = ((SwipeDismissBehavior) this.f15951b).f11345b;
        if (mVar != null) {
            mVar.m(view);
        }
        return true;
    }

    @Override // x5.f
    public final void f(Exception exc) {
        ((CountDownLatch) this.f15951b).countDown();
    }

    @Override // y9.b
    public final String g() {
        Object obj = this.f15951b;
        com.onesignal.l lVar = (com.onesignal.l) obj;
        ((com.onesignal.l) obj).getClass();
        String str = h4.f11856a;
        lVar.getClass();
        return h4.e(str, "PREFS_OS_LANGUAGE", "en");
    }

    public final synchronized void h() {
        ((SharedPreferences) this.f15951b).edit().clear().commit();
    }

    @Override // p7.b
    public final void i(String str, Bundle bundle) {
        r7.k kVar = (r7.k) this.f15951b;
        if (kVar != null) {
            try {
                String str2 = "$A$:" + q(str, bundle);
                r7.m mVar = kVar.f16595a;
                mVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - mVar.f16601d;
                r7.j jVar = mVar.f16604g;
                jVar.getClass();
                jVar.f16583d.l(new r7.h(jVar, jCurrentTimeMillis, str2));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // s8.o
    public final Object j() {
        Object obj = this.f15951b;
        if (!(((Type) obj) instanceof ParameterizedType)) {
            throw new m7.p("Invalid EnumSet type: " + ((Type) this.f15951b).toString());
        }
        Type type = ((ParameterizedType) ((Type) obj)).getActualTypeArguments()[0];
        if (type instanceof Class) {
            return EnumSet.noneOf((Class) type);
        }
        throw new m7.p("Invalid EnumSet type: " + ((Type) this.f15951b).toString());
    }

    public final void k(ByteString byteString) {
        if (!byteString.o()) {
            if (!(byteString instanceof kotlin.reflect.jvm.internal.impl.protobuf.g)) {
                String strValueOf = String.valueOf(byteString.getClass());
                throw new IllegalArgumentException(kc.r.g(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
            }
            kotlin.reflect.jvm.internal.impl.protobuf.g gVar = (kotlin.reflect.jvm.internal.impl.protobuf.g) byteString;
            k(gVar.f);
            k(gVar.j);
            return;
        }
        int size = byteString.size();
        int[] iArr = kotlin.reflect.jvm.internal.impl.protobuf.g.u;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i10 = iArr[iBinarySearch + 1];
        if (((Stack) this.f15951b).isEmpty() || ((ByteString) ((Stack) this.f15951b).peek()).size() >= i10) {
            ((Stack) this.f15951b).push(byteString);
            return;
        }
        int i11 = iArr[iBinarySearch];
        ByteString gVar2 = (ByteString) ((Stack) this.f15951b).pop();
        while (!((Stack) this.f15951b).isEmpty() && ((ByteString) ((Stack) this.f15951b).peek()).size() < i11) {
            gVar2 = new kotlin.reflect.jvm.internal.impl.protobuf.g((ByteString) ((Stack) this.f15951b).pop(), gVar2);
        }
        kotlin.reflect.jvm.internal.impl.protobuf.g gVar3 = new kotlin.reflect.jvm.internal.impl.protobuf.g(gVar2, byteString);
        while (!((Stack) this.f15951b).isEmpty()) {
            int[] iArr2 = kotlin.reflect.jvm.internal.impl.protobuf.g.u;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, gVar3.e);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((ByteString) ((Stack) this.f15951b).peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                gVar3 = new kotlin.reflect.jvm.internal.impl.protobuf.g((ByteString) ((Stack) this.f15951b).pop(), gVar3);
            }
        }
        ((Stack) this.f15951b).push(gVar3);
    }

    public final String l(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            m(obj, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public final void m(Object obj, Writer writer) throws IOException {
        d8.d dVar = (d8.d) this.f15951b;
        d8.e eVar = new d8.e(writer, dVar.f12353a, dVar.f12354b, dVar.f12355c, dVar.f12356d);
        eVar.g(obj);
        eVar.i();
        eVar.f12358b.flush();
    }

    public final synchronized boolean n() {
        return ((SharedPreferences) this.f15951b).getAll().isEmpty();
    }

    public final void o(a2.n nVar, Thread thread, Throwable th) {
        r7.j jVar = (r7.j) this.f15951b;
        synchronized (jVar) {
            try {
                String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                try {
                    r7.v.a(jVar.f16583d.m(new r7.g(jVar, System.currentTimeMillis(), th, thread, nVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                } catch (Exception e10) {
                    Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // x5.d
    public final void onCanceled() {
        ((CountDownLatch) this.f15951b).countDown();
    }

    @Override // x5.e
    public final void onComplete(x5.k kVar) {
        x5.l lVar = (x5.l) this.f15951b;
        if (kVar.j()) {
            return;
        }
        Exception excG = kVar.g();
        excG.getClass();
        lVar.c(excG);
    }

    @Override // x5.g
    public final void onSuccess(Object obj) {
        ((CountDownLatch) this.f15951b).countDown();
    }

    public final void p(l7.c cVar) {
        j1 j1Var = (j1) this.f15951b;
        j1Var.getClass();
        synchronized (j1Var.f10828c) {
            for (int i10 = 0; i10 < j1Var.f10828c.size(); i10++) {
                try {
                    if (cVar.equals(((Pair) j1Var.f10828c.get(i10)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } finally {
                }
            }
            f1 f1Var = new f1(cVar);
            j1Var.f10828c.add(new Pair(cVar, f1Var));
            if (j1Var.f10832g != null) {
                try {
                    j1Var.f10832g.registerOnMeasurementEventListener(f1Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            j1Var.b(new u0(j1Var, f1Var, 1));
        }
    }

    public final Object r() {
        l3 l3Var = (l3) this.f15951b;
        Cursor cursorQuery = l3Var.f10868a.query(l3Var.f10869b, l3.f10867i, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map bVar = count <= 256 ? new t.b(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                bVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            cursorQuery.close();
            return bVar;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // x5.c
    public final Object then(x5.k kVar) {
        if (kVar.j()) {
            ((x5.l) ((z4.u0) this.f15951b).f19713f).b(kVar.h());
            return null;
        }
        ((x5.l) ((z4.u0) this.f15951b).f19713f).a(kVar.g());
        return null;
    }

    public g(int i10) {
        if (i10 != 18) {
            return;
        }
        this.f15951b = new Stack();
    }

    public g(Context context) {
        this.f15951b = context.getSharedPreferences("com.google.android.gms.appid", 0);
        Object obj = f0.f.f12651a;
        File file = new File(f0.a.c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || n()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            h();
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    public /* synthetic */ g(Object obj) {
        this.f15951b = obj;
    }
}