package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MenuItem;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.google.android.gms.internal.ads.hc0;
import com.google.android.gms.internal.ads.rj;
import com.google.android.gms.internal.ads.sn;
import com.google.android.gms.internal.ads.ta0;
import com.google.android.gms.internal.ads.up;
import com.google.android.gms.internal.ads.vn;
import com.google.android.gms.internal.ads.za0;
import com.google.android.gms.internal.ads.zp;
import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import g.u0;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import o0.s1;
import t5.a4;
import t5.b4;
import t5.b6;
import t5.c3;
import t5.i3;
import t5.i5;
import t5.v4;
import t5.w5;
import t5.x4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14321b;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14322e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14323f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f14324j;

    /* renamed from: m, reason: collision with root package name */
    public final Object f14325m;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f14321b = i10;
        this.f14325m = obj;
        this.f14322e = obj2;
        this.f14323f = obj3;
        this.f14324j = obj4;
    }

    public final void a(int i10, IOException iOException, byte[] bArr, Map map) {
        a4 a4Var = ((b4) ((x4) this.f14324j).f15046b).M;
        b4.i(a4Var);
        a4Var.x(new e4.a(this, i10, iOException, bArr, map));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f2  */
    /* JADX WARN: Type inference failed for: r18v0, types: [l.g] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Map] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Throwable {
        i2.j jVarI;
        ConcurrentHashMap concurrentHashMap;
        HttpURLConnection httpURLConnection;
        int responseCode;
        InputStream inputStream;
        int i10 = this.f14321b;
        ?? r42 = 1;
        ?? r43 = 1;
        byte[] bArrR1 = null;
        bArrR1 = null;
        bArrR1 = null;
        int i11 = 0;
        Object obj = this.f14325m;
        Object obj2 = this.f14323f;
        Object obj3 = this.f14324j;
        Object obj4 = this.f14322e;
        switch (i10) {
            case 0:
                h hVar = (h) obj4;
                if (hVar != null) {
                    u0 u0Var = (u0) obj;
                    ((i) u0Var.f12903e).f14333d0 = true;
                    hVar.f14328b.c(false);
                    ((i) u0Var.f12903e).f14333d0 = false;
                }
                MenuItem menuItem = (MenuItem) obj2;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((o) obj3).q(menuItem, null, 4);
                    return;
                }
                return;
            case QueueFuseable.SYNC /* 1 */:
                try {
                    boolean booleanExtra = ((Intent) obj4).getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = ((Intent) obj4).getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = ((Intent) obj4).getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = ((Intent) obj4).getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    z1.o.r().p(ConstraintProxyUpdateReceiver.f1802a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                    j2.g.a((Context) obj2, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    j2.g.a((Context) obj2, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    j2.g.a((Context) obj2, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    j2.g.a((Context) obj2, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    ((BroadcastReceiver.PendingResult) obj3).finish();
                }
            case 2:
                UUID uuid = (UUID) obj4;
                String string = uuid.toString();
                z1.o oVarR = z1.o.r();
                String str = j2.o.f13613c;
                oVarR.p(str, String.format("Updating progress for %s (%s)", uuid, (z1.g) obj2), new Throwable[0]);
                j2.o oVar = (j2.o) obj;
                WorkDatabase workDatabase = oVar.f13614a;
                WorkDatabase workDatabase2 = oVar.f13614a;
                workDatabase.c();
                try {
                    jVarI = ((j2.o) obj).f13614a.n().i(string);
                } catch (Throwable th) {
                    try {
                        z1.o.r().q(j2.o.f13613c, "Error updating Worker progress", th);
                        ((k2.j) obj3).l(th);
                    } finally {
                        workDatabase2.f();
                    }
                }
                if (jVarI == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (jVarI.f13259b == z1.x.f19491e) {
                    ((j2.o) obj).f13614a.m().k(new i2.g(string, (z1.g) obj2));
                } else {
                    z1.o.r().u(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new Throwable[0]);
                }
                ((k2.j) obj3).k(null);
                ((j2.o) obj).f13614a.h();
                return;
            case 3:
                Context context = (Context) obj4;
                try {
                    new rj(context, (String) obj2).d(((c4.f) obj3).f2103a, (m4.b) obj);
                    return;
                } catch (IllegalStateException e10) {
                    vn.a(context).c("InterstitialAd.load", e10);
                    return;
                }
            case 4:
                r4.j jVar = (r4.j) obj4;
                ta0 ta0Var = (ta0) obj2;
                jVar.d(ta0Var, (ArrayDeque) obj3, "to");
                jVar.d(ta0Var, (ArrayDeque) obj, "of");
                return;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                za0 za0Var = (za0) obj4;
                ta0 ta0Var2 = (ta0) obj2;
                String str2 = (String) obj3;
                Pair[] pairArr = (Pair[]) obj;
                if (ta0Var2 == null) {
                    za0Var.getClass();
                    concurrentHashMap = new ConcurrentHashMap(za0Var.f2675a);
                } else {
                    concurrentHashMap = ta0Var2.f8699a;
                }
                if (!TextUtils.isEmpty("action") && !TextUtils.isEmpty(str2)) {
                    concurrentHashMap.put("action", str2);
                }
                for (Pair pair : pairArr) {
                    String str3 = (String) pair.first;
                    String str4 = (String) pair.second;
                    if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                        concurrentHashMap.put(str3, str4);
                    }
                }
                za0Var.a(concurrentHashMap, false);
                return;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                ((r4.b) obj4).P.a((String) obj2, (String) obj3, (ta0) obj);
                return;
            case y4.g.NETWORK_ERROR /* 7 */:
                c4.f fVar = (c4.f) obj3;
                new sn((Context) obj4, (c4.a) obj2, fVar != null ? fVar.f2103a : null, i11).n((d3.d) obj);
                return;
            case 8:
                Context context2 = (Context) obj4;
                try {
                    new up(context2, (String) obj2).b(((c4.f) obj3).f2103a, (hc0) obj);
                    return;
                } catch (IllegalStateException e11) {
                    vn.a(context2).c("RewardedAd.load", e11);
                    return;
                }
            case 9:
                Context context3 = (Context) obj4;
                try {
                    new zp(context3, (String) obj2).b(((c4.f) obj3).f2103a, (hc0) obj);
                    return;
                } catch (IllegalStateException e12) {
                    vn.a(context3).c("RewardedInterstitialAd.load", e12);
                    return;
                }
            case y4.g.DEVELOPER_ERROR /* 10 */:
                i5 i5VarR = ((b4) ((v4) obj).f15046b).r();
                i5VarR.o();
                i5VarR.p();
                i5VarR.B(new s1(i5VarR, (AtomicReference) obj4, (String) obj2, (String) obj3, i5VarR.y(false)));
                return;
            case 11:
                a4 a4Var = ((b4) ((x4) obj3).f15046b).M;
                b4.i(a4Var);
                a4Var.s();
                try {
                    x4 x4Var = (x4) obj3;
                    URLConnection uRLConnectionOpenConnection = ((URL) obj4).openConnection();
                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    ((b4) x4Var.f15046b).getClass();
                    httpURLConnection.setConnectTimeout(60000);
                    ((b4) x4Var.f15046b).getClass();
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    try {
                        responseCode = httpURLConnection.getResponseCode();
                    } catch (IOException e13) {
                        e = e13;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int i12 = inputStream.read(bArr);
                                        if (i12 <= 0) {
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            a(responseCode, null, byteArray, headerFields);
                                            return;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, i12);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                inputStream = null;
                            }
                        } catch (IOException e14) {
                            e = e14;
                            i11 = responseCode;
                            r43 = 0;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            a(i11, e, null, r43);
                            return;
                        } catch (Throwable th5) {
                            th = th5;
                            i11 = responseCode;
                            r42 = 0;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            a(i11, null, null, r42);
                            throw th;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        i11 = responseCode;
                        if (httpURLConnection != null) {
                        }
                        a(i11, e, null, r43);
                        return;
                    } catch (Throwable th6) {
                        th = th6;
                        i11 = responseCode;
                        if (httpURLConnection != null) {
                        }
                        a(i11, null, null, r42);
                        throw th;
                    }
                } catch (IOException e16) {
                    e = e16;
                    httpURLConnection = null;
                    r43 = 0;
                } catch (Throwable th7) {
                    th = th7;
                    httpURLConnection = null;
                    r42 = 0;
                }
            case 12:
                i5 i5VarR2 = ((AppMeasurementDynamiteService) obj).f11301b.r();
                l0 l0Var = (l0) obj4;
                t5.q qVar = (t5.q) obj2;
                String str5 = (String) obj3;
                i5VarR2.o();
                i5VarR2.p();
                b4 b4Var = (b4) i5VarR2.f15046b;
                b6 b6Var = b4Var.O;
                b4.g(b6Var);
                b6Var.getClass();
                if (x4.g.f18964b.d(((b4) b6Var.f15046b).f17234b, 12451000) == 0) {
                    i5VarR2.B(new g(i5VarR2, qVar, str5, l0Var, 13));
                    return;
                }
                i3 i3Var = b4Var.f17251w;
                b4.i(i3Var);
                i3Var.f17400w.a("Not bundling data. Service unavailable or out of date");
                b6 b6Var2 = b4Var.O;
                b4.g(b6Var2);
                b6Var2.K(l0Var, new byte[0]);
                return;
            case y4.g.ERROR /* 13 */:
                try {
                    i5 i5Var = (i5) obj;
                    c3 c3Var = i5Var.f17428j;
                    if (c3Var == null) {
                        i3 i3Var2 = ((b4) i5Var.f15046b).f17251w;
                        b4.i(i3Var2);
                        i3Var2.f17397n.a("Discarding data. Failed to send event to service to bundle");
                    } else {
                        bArrR1 = c3Var.R1((t5.q) obj4, (String) obj2);
                        ((i5) obj).A();
                        i5 i5Var2 = (i5) obj;
                        b6 b6Var3 = ((b4) i5Var2.f15046b).O;
                        b4.g(b6Var3);
                        l0 l0Var2 = (l0) obj3;
                        b6Var3.K(l0Var2, bArrR1);
                        obj = i5Var2;
                        obj3 = l0Var2;
                    }
                    return;
                } catch (RemoteException e17) {
                    i3 i3Var3 = ((b4) ((i5) obj).f15046b).f17251w;
                    b4.i(i3Var3);
                    i3Var3.f17397n.b(e17, "Failed to send event to the service to bundle");
                    return;
                } finally {
                    b6 b6Var4 = ((b4) ((i5) obj).f15046b).O;
                    b4.g(b6Var4);
                    b6Var4.K((l0) obj3, bArrR1);
                }
            case y4.g.INTERRUPTED /* 14 */:
                p5.g gVar = (p5.g) obj;
                ((e5.b) ((w5) gVar.f15951b).d()).getClass();
                t5.q qVarX0 = ((w5) gVar.f15951b).N().x0((String) obj2, (Bundle) obj3, "auto", System.currentTimeMillis(), false);
                w5 w5Var = (w5) gVar.f15951b;
                fc.t.k(qVarX0);
                w5Var.h(qVarX0, (String) obj4);
                return;
            default:
                i5 i5VarR3 = ((AppMeasurementDynamiteService) obj).f11301b.r();
                i5VarR3.o();
                i5VarR3.p();
                i5VarR3.B(new s1(i5VarR3, (String) obj2, (String) obj3, i5VarR3.y(false), (l0) obj4, 4));
                return;
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f14321b = i10;
        this.f14322e = obj;
        this.f14323f = obj2;
        this.f14324j = obj3;
        this.f14325m = obj4;
    }

    public g(p5.g gVar, String str, Bundle bundle) {
        this.f14321b = 14;
        this.f14325m = gVar;
        this.f14322e = str;
        this.f14323f = "_err";
        this.f14324j = bundle;
    }

    public g(v4 v4Var, AtomicReference atomicReference, String str, String str2) {
        this.f14321b = 10;
        this.f14325m = v4Var;
        this.f14322e = atomicReference;
        this.f14323f = str;
        this.f14324j = str2;
    }

    public g(x4 x4Var, String str, URL url, p5.g gVar) {
        this.f14321b = 11;
        this.f14324j = x4Var;
        fc.t.g(str);
        this.f14322e = url;
        this.f14325m = gVar;
        this.f14323f = str;
    }
}