package g;

import android.animation.Animator;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.r1;
import androidx.lifecycle.c1;
import androidx.lifecycle.d1;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.ads.q90;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.measurement.n3;
import j4.x1;
import j4.y2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements u0.j, t0.g, k0.d, p1.c, l2.a, c3.a, n0.c, o4.c, x5.e {

    /* renamed from: m, reason: collision with root package name */
    public static e f12761m;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12762b;

    /* renamed from: e, reason: collision with root package name */
    public Object f12763e;

    /* renamed from: f, reason: collision with root package name */
    public Object f12764f;

    /* renamed from: j, reason: collision with root package name */
    public Object f12765j;

    public e(int i10) {
        this.f12762b = i10;
        switch (i10) {
            case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                break;
            case 23:
                break;
            case 24:
                this.f12763e = new Object();
                break;
            case 25:
            default:
                this.f12763e = Collections.emptyList();
                this.f12764f = Collections.emptyList();
                break;
            case 26:
                this.f12763e = new ArrayList();
                this.f12764f = new ArrayList();
                this.f12765j = new ArrayList();
                break;
        }
    }

    public static e I(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new e(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public final Executor A() {
        switch (this.f12762b) {
            case 9:
                return (Executor) this.f12763e;
            default:
                return (Executor) this.f12765j;
        }
    }

    public final int B(int i10, int i11) {
        return ((TypedArray) this.f12764f).getResourceId(i10, i11);
    }

    public final String C(int i10) {
        return ((TypedArray) this.f12764f).getString(i10);
    }

    public final i2.e D(String str) {
        l1.r rVarA = l1.r.a(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            rVarA.c(1);
        } else {
            rVarA.d(1, str);
        }
        ((l1.p) this.f12763e).b();
        Cursor cursorG = ((l1.p) this.f12763e).g(rVarA);
        try {
            return cursorG.moveToFirst() ? new i2.e(cursorG.getString(fc.t.r(cursorG, "work_spec_id")), cursorG.getInt(fc.t.r(cursorG, "system_id"))) : null;
        } finally {
            cursorG.close();
            rVarA.e();
        }
    }

    public final CharSequence E(int i10) {
        return ((TypedArray) this.f12764f).getText(i10);
    }

    public final boolean F(int i10) {
        return ((TypedArray) this.f12764f).hasValue(i10);
    }

    public final void G(i2.e eVar) {
        ((l1.p) this.f12763e).b();
        ((l1.p) this.f12763e).c();
        try {
            ((l1.b) this.f12764f).e(eVar);
            ((l1.p) this.f12763e).h();
        } finally {
            ((l1.p) this.f12763e).f();
        }
    }

    public final boolean H(int i10, x.d dVar, y.n nVar) {
        y.b bVar = (y.b) this.f12764f;
        int[] iArr = dVar.f18797p0;
        bVar.f19125a = iArr[0];
        bVar.f19126b = iArr[1];
        bVar.f19127c = dVar.r();
        ((y.b) this.f12764f).f19128d = dVar.l();
        y.b bVar2 = (y.b) this.f12764f;
        bVar2.f19133i = false;
        bVar2.f19134j = i10;
        boolean z7 = bVar2.f19125a == 3;
        boolean z10 = bVar2.f19126b == 3;
        boolean z11 = z7 && dVar.W > 0.0f;
        boolean z12 = z10 && dVar.W > 0.0f;
        int[] iArr2 = dVar.f18801t;
        if (z11 && iArr2[0] == 4) {
            bVar2.f19125a = 1;
        }
        if (z12 && iArr2[1] == 4) {
            bVar2.f19126b = 1;
        }
        nVar.b(dVar, bVar2);
        dVar.P(((y.b) this.f12764f).f19129e);
        dVar.M(((y.b) this.f12764f).f19130f);
        y.b bVar3 = (y.b) this.f12764f;
        dVar.E = bVar3.f19132h;
        dVar.J(bVar3.f19131g);
        y.b bVar4 = (y.b) this.f12764f;
        bVar4.f19134j = 0;
        return bVar4.f19133i;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0179 A[LOOP:0: B:3:0x0004->B:79:0x0179, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n2.j J(n2.p pVar) throws IOException, n2.x {
        byte[] bArr;
        n3 n3Var;
        n3 n3Var2;
        int timeoutMs;
        n2.e eVar;
        int i10;
        Map mapEmptyMap;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            com.android.volley.toolbox.e eVar2 = null;
            try {
                n2.b cacheEntry = pVar.getCacheEntry();
                if (cacheEntry == null) {
                    try {
                        mapEmptyMap = Collections.emptyMap();
                    } catch (IOException e10) {
                        bArr = null;
                        e = e10;
                        if (e instanceof SocketTimeoutException) {
                        }
                        n2.u retryPolicy = pVar.getRetryPolicy();
                        timeoutMs = pVar.getTimeoutMs();
                        try {
                            n2.x xVar = (n2.x) n3Var.f10910f;
                            eVar = (n2.e) retryPolicy;
                            i10 = eVar.f15304b + 1;
                            eVar.f15304b = i10;
                            int i11 = eVar.f15303a;
                            eVar.f15303a = i11 + ((int) (i11 * eVar.f15306d));
                            if (i10 > eVar.f15305c) {
                            }
                        } catch (n2.x e11) {
                            pVar.addMarker(String.format("%s-timeout-giveup [timeout=%s]", (String) n3Var.f10909e, Integer.valueOf(timeoutMs)));
                            throw e11;
                        }
                    }
                } else {
                    HashMap map = new HashMap();
                    String str = cacheEntry.f15285b;
                    if (str != null) {
                        map.put("If-None-Match", str);
                    }
                    long j10 = cacheEntry.f15287d;
                    if (j10 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        map.put("If-Modified-Since", simpleDateFormat.format(new Date(j10)));
                    }
                    mapEmptyMap = map;
                }
                try {
                    com.android.volley.toolbox.e eVarF = ((i7.a) this.f12764f).f(pVar, mapEmptyMap);
                    try {
                        int i12 = eVarF.f2219a;
                        List listE = eVarF.e();
                        if (i12 == 304) {
                            return g5.a.q(pVar, SystemClock.elapsedRealtime() - jElapsedRealtime, listE);
                        }
                        InputStream inputStreamC = eVarF.c();
                        byte[] bArrT = inputStreamC != null ? g5.a.t(inputStreamC, eVarF.f2220b, (com.android.volley.toolbox.a) this.f12765j) : new byte[0];
                        g5.a.w(SystemClock.elapsedRealtime() - jElapsedRealtime, pVar, bArrT, i12);
                        if (i12 < 200 || i12 > 299) {
                            throw new IOException();
                        }
                        return new n2.j(i12, bArrT, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listE);
                    } catch (IOException e12) {
                        e = e12;
                        bArr = null;
                        eVar2 = eVarF;
                        if (e instanceof SocketTimeoutException) {
                            n3Var = new n3("socket", new n2.w());
                        } else {
                            if (e instanceof MalformedURLException) {
                                throw new RuntimeException("Bad URL " + pVar.getUrl(), e);
                            }
                            if (eVar2 != null) {
                                int i13 = eVar2.f2219a;
                                n2.a0.c("Unexpected response code %d for %s", Integer.valueOf(i13), pVar.getUrl());
                                if (bArr != null) {
                                    n2.j jVar = new n2.j(i13, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, eVar2.e());
                                    if (i13 == 401 || i13 == 403) {
                                        n3Var2 = new n3("auth", new n2.a(jVar));
                                    } else {
                                        if (i13 >= 400 && i13 <= 499) {
                                            throw new n2.d(jVar);
                                        }
                                        if (i13 < 500 || i13 > 599 || !pVar.shouldRetryServerErrors()) {
                                            throw new n2.v(jVar);
                                        }
                                        n3Var2 = new n3("server", new n2.v(jVar));
                                    }
                                    n3Var = n3Var2;
                                } else {
                                    n3Var = new n3("network", new n2.i());
                                }
                            } else {
                                if (!pVar.shouldRetryConnectionErrors()) {
                                    throw new n2.k(e);
                                }
                                n3Var = new n3("connection", new n2.k());
                            }
                        }
                        n2.u retryPolicy2 = pVar.getRetryPolicy();
                        timeoutMs = pVar.getTimeoutMs();
                        n2.x xVar2 = (n2.x) n3Var.f10910f;
                        eVar = (n2.e) retryPolicy2;
                        i10 = eVar.f15304b + 1;
                        eVar.f15304b = i10;
                        int i112 = eVar.f15303a;
                        eVar.f15303a = i112 + ((int) (i112 * eVar.f15306d));
                        if (i10 > eVar.f15305c) {
                            throw xVar2;
                        }
                        pVar.addMarker(String.format("%s-retry [timeout=%s]", (String) n3Var.f10909e, Integer.valueOf(timeoutMs)));
                    }
                } catch (IOException e13) {
                    e = e13;
                    bArr = null;
                    if (e instanceof SocketTimeoutException) {
                    }
                    n2.u retryPolicy22 = pVar.getRetryPolicy();
                    timeoutMs = pVar.getTimeoutMs();
                    n2.x xVar22 = (n2.x) n3Var.f10910f;
                    eVar = (n2.e) retryPolicy22;
                    i10 = eVar.f15304b + 1;
                    eVar.f15304b = i10;
                    int i1122 = eVar.f15303a;
                    eVar.f15303a = i1122 + ((int) (i1122 * eVar.f15306d));
                    if (i10 > eVar.f15305c) {
                    }
                }
            } catch (IOException e14) {
                e = e14;
            }
            pVar.addMarker(String.format("%s-retry [timeout=%s]", (String) n3Var.f10909e, Integer.valueOf(timeoutMs)));
        }
    }

    public final void K(androidx.lifecycle.m mVar) {
        androidx.lifecycle.x0 x0Var = (androidx.lifecycle.x0) this.f12765j;
        if (x0Var != null) {
            x0Var.run();
        }
        androidx.lifecycle.x0 x0Var2 = new androidx.lifecycle.x0((androidx.lifecycle.v) this.f12763e, mVar);
        this.f12765j = x0Var2;
        ((Handler) this.f12764f).postAtFrontOfQueue(x0Var2);
    }

    public final void L() {
        ((TypedArray) this.f12764f).recycle();
    }

    public final void M(String str) {
        ((l1.p) this.f12763e).b();
        q1.g gVarA = ((l1.t) this.f12765j).a();
        if (str == null) {
            gVarA.d(1);
        } else {
            gVarA.e(1, str);
        }
        ((l1.p) this.f12763e).c();
        try {
            gVarA.f();
            ((l1.p) this.f12763e).h();
        } finally {
            ((l1.p) this.f12763e).f();
            ((l1.t) this.f12765j).c(gVarA);
        }
    }

    public final void N(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f12763e = str;
    }

    public final void O(o3.d dVar) {
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f12765j = dVar;
    }

    public final void P(q90 q90Var) {
        synchronized (this.f12763e) {
            this.f12765j = q90Var;
            x1 x1Var = (x1) this.f12764f;
            if (x1Var != null) {
                try {
                    x1Var.H1(new y2(q90Var));
                } catch (RemoteException e10) {
                    wr.e("Unable to call setVideoLifecycleCallbacks on video controller.", e10);
                }
            }
        }
    }

    public final void Q(x.e eVar, int i10, int i11, int i12) {
        int i13 = eVar.f18769b0;
        int i14 = eVar.f18771c0;
        eVar.f18769b0 = 0;
        eVar.f18771c0 = 0;
        eVar.P(i11);
        eVar.M(i12);
        if (i13 < 0) {
            eVar.f18769b0 = 0;
        } else {
            eVar.f18769b0 = i13;
        }
        if (i14 < 0) {
            eVar.f18771c0 = 0;
        } else {
            eVar.f18771c0 = i14;
        }
        x.e eVar2 = (x.e) this.f12765j;
        eVar2.f18810t0 = i10;
        eVar2.S();
    }

    public final void R(x.e eVar) {
        ((ArrayList) this.f12763e).clear();
        int size = eVar.f18854q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            x.d dVar = (x.d) eVar.f18854q0.get(i10);
            int[] iArr = dVar.f18797p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                ((ArrayList) this.f12763e).add(dVar);
            }
        }
        eVar.f18809s0.f19137a = true;
    }

    public final void S(String str, double d10, double d11) {
        int i10 = 0;
        while (i10 < ((List) this.f12763e).size()) {
            double dDoubleValue = ((Double) ((List) this.f12765j).get(i10)).doubleValue();
            double dDoubleValue2 = ((Double) ((List) this.f12764f).get(i10)).doubleValue();
            if (d10 < dDoubleValue || (dDoubleValue == d10 && d11 < dDoubleValue2)) {
                break;
            } else {
                i10++;
            }
        }
        ((List) this.f12763e).add(i10, str);
        ((List) this.f12765j).add(i10, Double.valueOf(d10));
        ((List) this.f12764f).add(i10, Double.valueOf(d11));
    }

    public final void T(x1 x1Var) {
        synchronized (this.f12763e) {
            try {
                this.f12764f = x1Var;
                q90 q90Var = (q90) this.f12765j;
                if (q90Var != null) {
                    P(q90Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t0.g
    public final ClipDescription a() {
        return (ClipDescription) this.f12764f;
    }

    @Override // k0.d
    public final void b() {
        ((Animator) this.f12763e).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((r1) this.f12764f) + " has been canceled.");
        }
    }

    @Override // c3.a
    public final s2.e0 c(s2.e0 e0Var, q2.n nVar) {
        Drawable drawable = (Drawable) e0Var.get();
        if (drawable instanceof BitmapDrawable) {
            return ((c3.a) this.f12764f).c(z2.d.e(((BitmapDrawable) drawable).getBitmap(), (t2.d) this.f12763e), nVar);
        }
        if (drawable instanceof b3.c) {
            return ((c3.a) this.f12765j).c(e0Var, nVar);
        }
        return null;
    }

    @Override // n0.c
    public final boolean d(Object obj) {
        if (obj instanceof j3.b) {
            ((j3.b) obj).g().f13624a = true;
        }
        switch (((z1.o) ((j3.c) this.f12764f)).f19481b) {
            case 11:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((n0.c) this.f12765j).d(obj);
    }

    @Override // t0.g
    public final Object e() {
        return null;
    }

    @Override // p1.c
    public final p1.d f(p1.b bVar) {
        return new l1.s(bVar.f15866a, (String) this.f12763e, (File) this.f12764f, bVar.f15868c.f14716a, ((p1.c) this.f12765j).f(bVar));
    }

    @Override // t0.g
    public final Uri g() {
        return (Uri) this.f12763e;
    }

    @Override // t0.g
    public final void h() {
    }

    @Override // t0.g
    public final Uri i() {
        return (Uri) this.f12765j;
    }

    @Override // n0.c
    public final Object j() {
        Object objJ = ((n0.c) this.f12765j).j();
        if (objJ == null) {
            objJ = ((j3.a) this.f12763e).k();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objJ.getClass());
            }
        }
        if (objJ instanceof j3.b) {
            ((j3.b) objJ).g().f13624a = false;
        }
        return objJ;
    }

    public final r3.i k() {
        String strConcat = ((String) this.f12763e) == null ? " backendName" : "";
        if (((o3.d) this.f12765j) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new r3.i((String) this.f12763e, (byte[]) this.f12764f, (o3.d) this.f12765j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public final w3.c l() {
        String strF = ((Long) this.f12763e) == null ? " delta" : "";
        if (((Long) this.f12764f) == null) {
            strF = strF.concat(" maxAllowedDelay");
        }
        if (((Set) this.f12765j) == null) {
            strF = a0.h.F(strF, " flags");
        }
        if (strF.isEmpty()) {
            return new w3.c(((Long) this.f12763e).longValue(), ((Long) this.f12764f).longValue(), (Set) this.f12765j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strF));
    }

    public final Bitmap m(BitmapFactory.Options options) {
        switch (this.f12762b) {
            case y4.g.API_NOT_CONNECTED /* 17 */:
                return BitmapFactory.decodeStream(new i3.a(i3.c.c((ByteBuffer) this.f12763e)), null, options);
            case 18:
                z2.x xVar = (z2.x) ((com.bumptech.glide.load.data.n) this.f12763e).f2317e;
                xVar.reset();
                return BitmapFactory.decodeStream(xVar, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.n) this.f12765j).a().getFileDescriptor(), null, options);
        }
    }

    public final void n(Runnable runnable) {
        ((j2.i) this.f12763e).execute(runnable);
    }

    public final androidx.lifecycle.y0 o(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return p(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // x5.e
    public final void onComplete(x5.k kVar) {
        w4.b bVar = (w4.b) this.f12763e;
        String str = (String) this.f12764f;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f12765j;
        synchronized (bVar.f18651a) {
            bVar.f18651a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public final androidx.lifecycle.y0 p(Class cls, String key) {
        androidx.lifecycle.y0 viewModel;
        Intrinsics.f(key, "key");
        c1 c1Var = (c1) this.f12763e;
        c1Var.getClass();
        androidx.lifecycle.y0 y0Var = (androidx.lifecycle.y0) c1Var.f1202a.get(key);
        if (cls.isInstance(y0Var)) {
            androidx.lifecycle.b1 b1Var = (androidx.lifecycle.b1) this.f12764f;
            androidx.lifecycle.v0 v0Var = b1Var instanceof androidx.lifecycle.v0 ? (androidx.lifecycle.v0) b1Var : null;
            if (v0Var != null) {
                Intrinsics.c(y0Var);
                androidx.lifecycle.o oVar = v0Var.f1259j;
                if (oVar != null) {
                    o1.d dVar = v0Var.f1260m;
                    Intrinsics.c(dVar);
                    androidx.lifecycle.r0.a(y0Var, dVar, oVar);
                }
            }
            Intrinsics.d(y0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return y0Var;
        }
        f1.e eVar = new f1.e((f1.b) this.f12765j);
        eVar.f12655a.put(androidx.lifecycle.z0.f1275e, key);
        try {
            viewModel = ((androidx.lifecycle.b1) this.f12764f).create(cls, eVar);
        } catch (AbstractMethodError unused) {
            viewModel = ((androidx.lifecycle.b1) this.f12764f).create(cls);
        }
        c1 c1Var2 = (c1) this.f12763e;
        c1Var2.getClass();
        Intrinsics.f(viewModel, "viewModel");
        androidx.lifecycle.y0 y0Var2 = (androidx.lifecycle.y0) c1Var2.f1202a.put(key, viewModel);
        if (y0Var2 != null) {
            y0Var2.onCleared();
        }
        return viewModel;
    }

    public final boolean q(int i10, boolean z7) {
        return ((TypedArray) this.f12764f).getBoolean(i10, z7);
    }

    public final ColorStateList r(int i10) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!((TypedArray) this.f12764f).hasValue(i10) || (resourceId = ((TypedArray) this.f12764f).getResourceId(i10, 0)) == 0 || (colorStateListC = f0.f.c((Context) this.f12763e, resourceId)) == null) ? ((TypedArray) this.f12764f).getColorStateList(i10) : colorStateListC;
    }

    public final int s(int i10, int i11) {
        return ((TypedArray) this.f12764f).getDimensionPixelOffset(i10, i11);
    }

    public final int t(int i10, int i11) {
        return ((TypedArray) this.f12764f).getDimensionPixelSize(i10, i11);
    }

    public final String toString() {
        switch (this.f12762b) {
            case 3:
                String string = "[ ";
                if (((v.i) this.f12763e) != null) {
                    for (int i10 = 0; i10 < 9; i10++) {
                        StringBuilder sbN = ic1.n(string);
                        sbN.append(((v.i) this.f12763e).f18360u[i10]);
                        sbN.append(" ");
                        string = sbN.toString();
                    }
                }
                StringBuilder sbO = ic1.o(string, "] ");
                sbO.append((v.i) this.f12763e);
                return sbO.toString();
            default:
                return super.toString();
        }
    }

    public final Drawable u(int i10) {
        int resourceId;
        return (!((TypedArray) this.f12764f).hasValue(i10) || (resourceId = ((TypedArray) this.f12764f).getResourceId(i10, 0)) == 0) ? ((TypedArray) this.f12764f).getDrawable(i10) : com.bumptech.glide.c.c((Context) this.f12763e, resourceId);
    }

    public final Drawable v(int i10) {
        int resourceId;
        Drawable drawableG;
        if (!((TypedArray) this.f12764f).hasValue(i10) || (resourceId = ((TypedArray) this.f12764f).getResourceId(i10, 0)) == 0) {
            return null;
        }
        m.x xVarA = m.x.a();
        Context context = (Context) this.f12763e;
        synchronized (xVarA) {
            drawableG = xVarA.f14989a.g(context, resourceId, true);
        }
        return drawableG;
    }

    public final Typeface w(int i10, int i11, m.x0 x0Var) {
        int resourceId = ((TypedArray) this.f12764f).getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f12765j) == null) {
            this.f12765j = new TypedValue();
        }
        Context context = (Context) this.f12763e;
        TypedValue typedValue = (TypedValue) this.f12765j;
        ThreadLocal threadLocal = g0.q.f12975a;
        if (context.isRestricted()) {
            return null;
        }
        return g0.q.b(context, resourceId, typedValue, i11, x0Var, true, false);
    }

    public final ImageHeaderParser$ImageType x() throws Throwable {
        switch (this.f12762b) {
            case y4.g.API_NOT_CONNECTED /* 17 */:
                return o5.y.o((List) this.f12764f, i3.c.c((ByteBuffer) this.f12763e));
            case 18:
                List list = (List) this.f12765j;
                z2.x xVar = (z2.x) ((com.bumptech.glide.load.data.n) this.f12763e).f2317e;
                xVar.reset();
                return o5.y.p((t2.h) this.f12764f, xVar, list);
            default:
                List list2 = (List) this.f12764f;
                com.bumptech.glide.load.data.n nVar = (com.bumptech.glide.load.data.n) this.f12765j;
                t2.h hVar = (t2.h) this.f12763e;
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    q2.f fVar = (q2.f) list2.get(i10);
                    z2.x xVar2 = null;
                    try {
                        z2.x xVar3 = new z2.x(new FileInputStream(nVar.a().getFileDescriptor()), hVar);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeD = fVar.d(xVar3);
                            xVar3.b();
                            nVar.a();
                            if (imageHeaderParser$ImageTypeD != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeD;
                            }
                        } catch (Throwable th) {
                            th = th;
                            xVar2 = xVar3;
                            if (xVar2 != null) {
                                xVar2.b();
                            }
                            nVar.a();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public final int y(int i10, int i11) {
        return ((TypedArray) this.f12764f).getInt(i10, i11);
    }

    public final Location z(String str) {
        try {
            if (((LocationManager) this.f12764f).isProviderEnabled(str)) {
                return ((LocationManager) this.f12764f).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    public e(Context context, TypedArray typedArray) {
        this.f12762b = 2;
        this.f12763e = context;
        this.f12764f = typedArray;
    }

    public e(Context context, LocationManager locationManager) {
        this.f12762b = 1;
        this.f12765j = new y0();
        this.f12763e = context;
        this.f12764f = locationManager;
    }

    public e(ParcelFileDescriptor parcelFileDescriptor, List list, t2.h hVar) {
        this.f12762b = 19;
        if (hVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f12763e = hVar;
        if (list != null) {
            this.f12764f = list;
            this.f12765j = new com.bumptech.glide.load.data.n(parcelFileDescriptor);
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public e(androidx.lifecycle.t provider) {
        this.f12762b = 7;
        Intrinsics.f(provider, "provider");
        this.f12763e = new androidx.lifecycle.v(provider);
        this.f12764f = new Handler();
    }

    public e(c1 store, androidx.lifecycle.b1 factory, f1.b defaultCreationExtras) {
        this.f12762b = 8;
        Intrinsics.f(store, "store");
        Intrinsics.f(factory, "factory");
        Intrinsics.f(defaultCreationExtras, "defaultCreationExtras");
        this.f12763e = store;
        this.f12764f = factory;
        this.f12765j = defaultCreationExtras;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(c1 c1Var, v6.e eVar) {
        this(c1Var, eVar, f1.a.f12654b);
        this.f12762b = 8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(c1 store, v6.e eVar, int i10) {
        this(store, eVar);
        this.f12762b = 8;
        Intrinsics.f(store, "store");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(d1 owner) {
        this(owner.getViewModelStore(), owner instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) owner).getDefaultViewModelProviderFactory() : g8.e.A(), fc.t.p(owner));
        this.f12762b = 8;
        Intrinsics.f(owner, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(d1 owner, androidx.lifecycle.b1 b1Var) {
        this(owner.getViewModelStore(), b1Var, fc.t.p(owner));
        this.f12762b = 8;
        Intrinsics.f(owner, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(com.android.volley.toolbox.g gVar) {
        this(gVar, new com.android.volley.toolbox.a());
        this.f12762b = 16;
    }

    public e(com.android.volley.toolbox.g gVar, com.android.volley.toolbox.a aVar) {
        this.f12762b = 16;
        this.f12764f = gVar;
        this.f12763e = gVar;
        this.f12765j = aVar;
    }

    public e(qe qeVar, Context context, Uri uri) {
        this.f12762b = 27;
        this.f12763e = qeVar;
        this.f12764f = context;
        this.f12765j = uri;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i10) {
        this.f12762b = i10;
        this.f12765j = obj;
        this.f12763e = obj2;
        this.f12764f = obj3;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f12762b = i10;
        this.f12763e = obj;
        this.f12764f = obj2;
        this.f12765j = obj3;
    }

    public e(ExecutorService executorService) {
        this.f12762b = 14;
        this.f12764f = new Handler(Looper.getMainLooper());
        this.f12765j = new l2.b(this, 0);
        this.f12763e = new j2.i(executorService);
    }

    public e(l1.p pVar) {
        this.f12762b = 13;
        this.f12763e = pVar;
        this.f12764f = new i2.b(this, pVar, 2);
        this.f12765j = new i2.h(this, pVar, 2);
    }

    public e(t2.h hVar, i3.l lVar, List list) {
        this.f12762b = 18;
        if (hVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f12764f = hVar;
        if (list != null) {
            this.f12765j = list;
            this.f12763e = new com.bumptech.glide.load.data.n(lVar, hVar);
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public e(v.g gVar, v.g gVar2) {
        this.f12762b = 3;
        this.f12765j = gVar;
        this.f12764f = gVar2;
    }

    public e(x.e eVar) {
        this.f12762b = 4;
        this.f12763e = new ArrayList();
        this.f12764f = new y.b();
        this.f12765j = eVar;
    }
}