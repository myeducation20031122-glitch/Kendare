package r7;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.internal.ads.a9;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.measurement.l9;
import j4.i2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.s3;
import t5.j4;
import t7.b0;
import t7.f0;
import t7.g0;
import t7.h0;
import t7.o1;
import t7.p1;
import t7.q0;
import t7.q1;
import t7.r0;
import t7.s0;
import t7.t0;
import t7.u0;
import t7.w;
import t7.x;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j {

    /* renamed from: p, reason: collision with root package name */
    public static final f f16579p = new f(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f16580a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f16581b;

    /* renamed from: c, reason: collision with root package name */
    public final l9 f16582c;

    /* renamed from: d, reason: collision with root package name */
    public final g2.h f16583d;

    /* renamed from: e, reason: collision with root package name */
    public final r f16584e;

    /* renamed from: f, reason: collision with root package name */
    public final v7.b f16585f;

    /* renamed from: g, reason: collision with root package name */
    public final s3 f16586g;

    /* renamed from: h, reason: collision with root package name */
    public final s7.c f16587h;

    /* renamed from: i, reason: collision with root package name */
    public final o7.a f16588i;

    /* renamed from: j, reason: collision with root package name */
    public final p7.a f16589j;

    /* renamed from: k, reason: collision with root package name */
    public final t f16590k;

    /* renamed from: l, reason: collision with root package name */
    public o f16591l;

    /* renamed from: m, reason: collision with root package name */
    public final x5.l f16592m = new x5.l();

    /* renamed from: n, reason: collision with root package name */
    public final x5.l f16593n = new x5.l();

    /* renamed from: o, reason: collision with root package name */
    public final x5.l f16594o = new x5.l();

    public j(Context context, g2.h hVar, r rVar, i2 i2Var, v7.b bVar, l9 l9Var, s3 s3Var, s7.c cVar, t tVar, o7.a aVar, p7.a aVar2) {
        new AtomicBoolean(false);
        this.f16580a = context;
        this.f16583d = hVar;
        this.f16584e = rVar;
        this.f16581b = i2Var;
        this.f16585f = bVar;
        this.f16582c = l9Var;
        this.f16586g = s3Var;
        this.f16587h = cVar;
        this.f16588i = aVar;
        this.f16589j = aVar2;
        this.f16590k = tVar;
    }

    public static void a(j jVar, String str) {
        Integer num;
        jVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strV = a0.h.v("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strV, null);
        }
        Locale locale = Locale.US;
        String str2 = String.format(locale, "Crashlytics Android SDK/%s", "18.2.12");
        r rVar = jVar.f16584e;
        String str3 = rVar.f16632c;
        s3 s3Var = jVar.f16586g;
        s0 s0Var = new s0(str3, (String) s3Var.f14931m, (String) s3Var.f14932n, rVar.c(), kc.r.a(((String) s3Var.f14929f) != null ? 4 : 1), (l9) s3Var.f14933t);
        String str4 = Build.VERSION.RELEASE;
        String str5 = Build.VERSION.CODENAME;
        u0 u0Var = new u0(str4, str5, e.h());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        d dVar = d.f16562b;
        String str6 = Build.CPU_ABI;
        boolean zIsEmpty = TextUtils.isEmpty(str6);
        d dVar2 = d.f16562b;
        if (!zIsEmpty) {
            d dVar3 = (d) d.f16563e.get(str6.toLowerCase(locale));
            if (dVar3 != null) {
                dVar2 = dVar3;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = dVar2.ordinal();
        String str7 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jE = e.e();
        boolean zG = e.g();
        int iC = e.c();
        String str8 = Build.MANUFACTURER;
        String str9 = Build.PRODUCT;
        r0 r0Var = new r0(s0Var, u0Var, new t0(iOrdinal, str7, iAvailableProcessors, jE, blockCount, zG, iC, str8, str9));
        int i10 = 0;
        ((o7.b) jVar.f16588i).d(str, str2, jCurrentTimeMillis, r0Var);
        s7.c cVar = jVar.f16587h;
        cVar.f16876b.b();
        cVar.f16876b = s7.c.f16874c;
        if (str != null) {
            cVar.f16876b = new s7.i(cVar.f16875a.g(str, "userlog"));
        }
        t tVar = jVar.f16590k;
        n nVar = tVar.f16636a;
        nVar.getClass();
        Charset charset = p1.f17905a;
        android.support.v4.media.b bVar = new android.support.v4.media.b(11);
        bVar.f486b = "18.2.12";
        s3 s3Var2 = nVar.f16616c;
        String str10 = (String) s3Var2.f14927b;
        if (str10 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        bVar.f487e = str10;
        r rVar2 = nVar.f16615b;
        String strC = rVar2.c();
        if (strC == null) {
            throw new NullPointerException("Null installationUuid");
        }
        bVar.f489j = strC;
        String str11 = (String) s3Var2.f14931m;
        if (str11 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        bVar.f490m = str11;
        String str12 = (String) s3Var2.f14932n;
        if (str12 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        bVar.f491n = str12;
        bVar.f488f = 4;
        r5 r5Var = new r5(4);
        r5Var.f7941e = Boolean.FALSE;
        r5Var.f7939c = Long.valueOf(jCurrentTimeMillis);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        r5Var.f7938b = str;
        String str13 = n.f16613f;
        if (str13 == null) {
            throw new NullPointerException("Null generator");
        }
        r5Var.f7937a = str13;
        s3 s3Var3 = new s3(12);
        String str14 = rVar2.f16632c;
        if (str14 == null) {
            throw new NullPointerException("Null identifier");
        }
        s3Var3.f14927b = str14;
        String str15 = (String) s3Var2.f14931m;
        if (str15 == null) {
            throw new NullPointerException("Null version");
        }
        s3Var3.f14928e = str15;
        s3Var3.f14929f = (String) s3Var2.f14932n;
        s3Var3.f14931m = rVar2.c();
        l9 l9Var = (l9) s3Var2.f14933t;
        if (((o5.d) l9Var.f10882f) == null) {
            l9Var.f10882f = new o5.d(l9Var, i10);
        }
        s3Var3.f14932n = (String) ((o5.d) l9Var.f10882f).f15721e;
        l9 l9Var2 = (l9) s3Var2.f14933t;
        if (((o5.d) l9Var2.f10882f) == null) {
            l9Var2.f10882f = new o5.d(l9Var2, i10);
        }
        s3Var3.f14933t = (String) ((o5.d) l9Var2.f10882f).f15722f;
        r5Var.f7942f = s3Var3.d();
        g2.h hVar = new g2.h(11);
        hVar.f13011b = 3;
        hVar.f13012e = str4;
        hVar.f13013f = str5;
        hVar.f13014j = Boolean.valueOf(e.h());
        r5Var.f7944h = hVar.e();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = (TextUtils.isEmpty(str6) || (num = (Integer) n.f16612e.get(str6.toLowerCase(locale))) == null) ? 7 : num.intValue();
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jE2 = e.e();
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean zG2 = e.g();
        int iC2 = e.c();
        a2.n nVar2 = new a2.n(7);
        nVar2.f268b = Integer.valueOf(iIntValue);
        nVar2.f274t = str7;
        nVar2.f269e = Integer.valueOf(iAvailableProcessors2);
        nVar2.f270f = Long.valueOf(jE2);
        nVar2.f271j = Long.valueOf(blockCount2);
        nVar2.f272m = Boolean.valueOf(zG2);
        nVar2.f273n = Integer.valueOf(iC2);
        nVar2.f275u = str8;
        nVar2.f276w = str9;
        r5Var.f7945i = nVar2.b();
        r5Var.f7947k = 3;
        bVar.f492t = r5Var.a();
        w wVarA = bVar.a();
        v7.b bVar2 = tVar.f16637b.f18507b;
        o1 o1Var = wVarA.f17958h;
        if (o1Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str16 = ((b0) o1Var).f17751b;
        try {
            v7.a.f18503f.getClass();
            v7.a.f(bVar2.g(str16, "report"), u7.c.f18296a.l(wVarA));
            File fileG = bVar2.g(str16, "start-time");
            long j10 = ((b0) o1Var).f17752c;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileG), v7.a.f18501d);
            try {
                outputStreamWriter.write("");
                fileG.setLastModified(j10 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e10) {
            String strV2 = a0.h.v("Could not persist report for session ", str16);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strV2, e10);
            }
        }
    }

    public static x5.s b(j jVar) {
        x5.s sVarC;
        jVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : v7.b.k(((File) jVar.f16585f.f18510e).listFiles(f16579p))) {
            try {
                long j10 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    sVarC = j4.i(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    sVarC = j4.c(new i(jVar, j10), new ScheduledThreadPoolExecutor(1));
                }
                arrayList.add(sVarC);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return j4.R(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z7, a2.n nVar) throws IOException {
        String strD;
        ApplicationExitInfo applicationExitInfoG;
        String string;
        InputStream traceInputStream;
        t tVar = this.f16590k;
        ArrayList arrayList = new ArrayList(tVar.f16637b.c());
        Throwable th = null;
        if (arrayList.size() <= z7) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str = (String) arrayList.get(z7 ? 1 : 0);
        boolean z10 = ((x7.a) ((AtomicReference) nVar.f275u).get()).f19095b.f15100b;
        v7.a aVar = tVar.f16637b;
        if (z10) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                List historicalProcessExitReasons = ((ActivityManager) this.f16580a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    v7.b bVar = this.f16585f;
                    s7.c cVar = new s7.c(bVar, str);
                    s7.d dVar = new s7.d(bVar);
                    v7.b bVar2 = new v7.b(str, bVar, this.f16583d);
                    ((s7.b) ((AtomicMarkableReference) ((com.bumptech.glide.m) bVar2.f18512j).f2320e).getReference()).a(dVar.b(str, false));
                    ((s7.b) ((AtomicMarkableReference) ((com.bumptech.glide.m) bVar2.f18513m).f2320e).getReference()).a(dVar.b(str, true));
                    ((AtomicMarkableReference) bVar2.f18514n).set(dVar.c(str), false);
                    long jLastModified = aVar.f18507b.g(str, "start-time").lastModified();
                    Iterator it = historicalProcessExitReasons.iterator();
                    while (it.hasNext()) {
                        applicationExitInfoG = a9.g(it.next());
                        if (applicationExitInfoG.getTimestamp() < jLastModified) {
                            break;
                        }
                        if (applicationExitInfoG.getReason() == 6) {
                            break;
                        }
                    }
                    applicationExitInfoG = null;
                    if (applicationExitInfoG == null) {
                        String strV = a0.h.v("No relevant ApplicationExitInfo occurred during session: ", str);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strV, null);
                        }
                    } else {
                        try {
                            traceInputStream = applicationExitInfoG.getTraceInputStream();
                        } catch (IOException e10) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + applicationExitInfoG.toString() + " Error: " + e10, null);
                        }
                        if (traceInputStream != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i11 = traceInputStream.read(bArr);
                                if (i11 == -1) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, i11);
                                }
                            }
                            string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        } else {
                            string = null;
                        }
                        android.support.v4.media.b bVar3 = new android.support.v4.media.b(12);
                        bVar3.f489j = Integer.valueOf(applicationExitInfoG.getImportance());
                        String processName = applicationExitInfoG.getProcessName();
                        if (processName == null) {
                            throw new NullPointerException("Null processName");
                        }
                        bVar3.f486b = processName;
                        bVar3.f488f = Integer.valueOf(applicationExitInfoG.getReason());
                        bVar3.f492t = Long.valueOf(applicationExitInfoG.getTimestamp());
                        bVar3.f487e = Integer.valueOf(applicationExitInfoG.getPid());
                        bVar3.f490m = Long.valueOf(applicationExitInfoG.getPss());
                        bVar3.f491n = Long.valueOf(applicationExitInfoG.getRss());
                        bVar3.f493u = string;
                        x xVarC = bVar3.c();
                        n nVar2 = tVar.f16636a;
                        int i12 = nVar2.f16614a.getResources().getConfiguration().orientation;
                        q.d dVar2 = new q.d(6);
                        dVar2.f16088e = "anr";
                        dVar2.f16087b = Long.valueOf(xVarC.f17966g);
                        Boolean boolValueOf = Boolean.valueOf(xVarC.f17963d != 100);
                        Integer numValueOf = Integer.valueOf(i12);
                        o5.d dVar3 = new o5.d(13);
                        dVar3.f15721e = "0";
                        dVar3.f15722f = "0";
                        dVar3.f15723j = 0L;
                        h0 h0Var = new h0(null, null, xVarC, dVar3.i(), nVar2.a());
                        String strConcat = numValueOf == null ? "".concat(" uiOrientation") : "";
                        if (!strConcat.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strConcat));
                        }
                        dVar2.f16089f = new g0(h0Var, null, null, boolValueOf, numValueOf.intValue());
                        dVar2.f16090j = nVar2.b(i12);
                        f0 f0VarC = dVar2.c();
                        String strV2 = a0.h.v("Persisting anr for session ", str);
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", strV2, null);
                        }
                        aVar.d(t.a(f0VarC, cVar, bVar2), str, true);
                    }
                } else {
                    strD = a0.h.v("No ApplicationExitInfo available. Session: ", str);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        th = null;
                        Log.v("FirebaseCrashlytics", strD, th);
                    }
                }
            } else {
                strD = kc.r.d("ANR feature enabled, but device is API ", i10);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strD, th);
                }
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
        }
        o7.b bVar4 = (o7.b) this.f16588i;
        if (bVar4.c(str)) {
            String strV3 = a0.h.v("Finalizing native report for session ", str);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strV3, null);
            }
            bVar4.a(str).getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str, null);
        }
        Object obj = z7 != 0 ? (String) arrayList.get(0) : null;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        v7.b bVar5 = aVar.f18507b;
        bVar5.getClass();
        v7.b.c(new File((File) bVar5.f18509b, ".com.google.firebase.crashlytics"));
        v7.b.c(new File((File) bVar5.f18509b, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT >= 28) {
            v7.b.c(new File((File) bVar5.f18509b, ".com.google.firebase.crashlytics.files.v1"));
        }
        NavigableSet<String> navigableSetC = aVar.c();
        if (obj != null) {
            navigableSetC.remove(obj);
        }
        if (navigableSetC.size() > 8) {
            while (navigableSetC.size() > 8) {
                String str2 = (String) navigableSetC.last();
                String strV4 = a0.h.v("Removing session over cap: ", str2);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strV4, null);
                }
                v7.b.j(new File((File) bVar5.f18511f, str2));
                navigableSetC.remove(str2);
            }
        }
        for (String str3 : navigableSetC) {
            String strV5 = a0.h.v("Finalizing report for session ", str3);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strV5, null);
            }
            f fVar = v7.a.f18505h;
            File file = new File((File) bVar5.f18511f, str3);
            file.mkdirs();
            List listK = v7.b.k(file.listFiles(fVar));
            if (listK.isEmpty()) {
                String strW = a0.h.w("Session ", str3, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strW, null);
                }
            } else {
                Collections.sort(listK);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = listK.iterator();
                boolean z11 = false;
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    u7.c cVar2 = v7.a.f18503f;
                    if (zHasNext) {
                        File file2 = (File) it2.next();
                        try {
                            String strE = v7.a.e(file2);
                            cVar2.getClass();
                            try {
                                JsonReader jsonReader = new JsonReader(new StringReader(strE));
                                try {
                                    f0 f0VarD = u7.c.d(jsonReader);
                                    jsonReader.close();
                                    arrayList2.add(f0VarD);
                                    if (!z11) {
                                        String name = file2.getName();
                                        boolean z12 = name.startsWith("event") && name.endsWith("_");
                                        z11 = z12;
                                    }
                                } finally {
                                }
                            } catch (IllegalStateException e11) {
                                throw new IOException(e11);
                            }
                        } catch (IOException e12) {
                            Log.w("FirebaseCrashlytics", "Could not add event to report for " + file2, e12);
                        }
                    } else if (arrayList2.isEmpty()) {
                        Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str3, null);
                    } else {
                        String strC = new s7.d(bVar5).c(str3);
                        File fileG = bVar5.g(str3, "report");
                        try {
                            String strE2 = v7.a.e(fileG);
                            cVar2.getClass();
                            w wVarG = u7.c.g(strE2);
                            android.support.v4.media.b bVarA = wVarG.a();
                            o1 o1Var = wVarG.f17958h;
                            if (o1Var != null) {
                                r5 r5VarA = o1Var.a();
                                r5VarA.f7940d = Long.valueOf(jCurrentTimeMillis);
                                r5VarA.f7941e = Boolean.valueOf(z11);
                                if (strC != null) {
                                    r5VarA.f7943g = new q0(strC);
                                }
                                bVarA.f492t = r5VarA.a();
                            }
                            w wVarA = bVarA.a();
                            q1 q1Var = new q1(arrayList2);
                            o1 o1Var2 = wVarA.f17958h;
                            if (o1Var2 == null) {
                                throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                            }
                            android.support.v4.media.b bVarA2 = wVarA.a();
                            r5 r5VarA2 = o1Var2.a();
                            r5VarA2.f7946j = q1Var;
                            bVarA2.f492t = r5VarA2.a();
                            w wVarA2 = bVarA2.a();
                            o1 o1Var3 = wVarA2.f17958h;
                            if (o1Var3 != null) {
                                v7.a.f(z11 ? new File((File) bVar5.f18513m, ((b0) o1Var3).f17751b) : new File((File) bVar5.f18512j, ((b0) o1Var3).f17751b), u7.c.f18296a.l(wVarA2));
                            }
                        } catch (IOException e13) {
                            Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileG, e13);
                        }
                    }
                }
            }
            v7.b.j(new File((File) bVar5.f18511f, str3));
        }
        int i13 = ((x7.a) ((AtomicReference) aVar.f18508c.f275u).get()).f19094a.f15645e;
        ArrayList arrayListB = aVar.b();
        int size = arrayListB.size();
        if (size <= i13) {
            return;
        }
        Iterator it3 = arrayListB.subList(i13, size).iterator();
        while (it3.hasNext()) {
            ((File) it3.next()).delete();
        }
    }

    public final boolean d(a2.n nVar) {
        if (!Boolean.TRUE.equals(((ThreadLocal) this.f16583d.f13014j).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        o oVar = this.f16591l;
        if (oVar != null && oVar.f16622e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            c(true, nVar);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    public final x5.s e(x5.s sVar) {
        x5.s sVar2;
        x5.s sVarI;
        v7.b bVar = this.f16590k.f16637b.f18507b;
        boolean zIsEmpty = v7.b.k(((File) bVar.f18512j).listFiles()).isEmpty();
        x5.l lVar = this.f16592m;
        if (zIsEmpty && v7.b.k(((File) bVar.f18513m).listFiles()).isEmpty() && v7.b.k(((File) bVar.f18514n).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            lVar.d(Boolean.FALSE);
            return j4.i(null);
        }
        o7.c cVar = o7.c.f15807a;
        cVar.c("Crash reports are available to be sent.");
        i2 i2Var = this.f16581b;
        if (i2Var.b()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            lVar.d(Boolean.FALSE);
            sVarI = j4.i(Boolean.TRUE);
        } else {
            cVar.b("Automatic data collection is disabled.");
            cVar.c("Notifying that unsent reports are available.");
            lVar.d(Boolean.TRUE);
            synchronized (i2Var.f13738a) {
                sVar2 = ((x5.l) i2Var.f13743f).f19011a;
            }
            x5.s sVarL = sVar2.l(new a5.x(this, 13));
            cVar.b("Waiting for send/deleteUnsentReports to be called.");
            x5.s sVar3 = this.f16593n.f19011a;
            ExecutorService executorService = v.f16643a;
            x5.l lVar2 = new x5.l();
            u uVar = new u(1, lVar2);
            f5.a aVar = x5.m.f19012a;
            sVarL.e(aVar, uVar);
            sVar3.getClass();
            sVar3.e(aVar, uVar);
            sVarI = lVar2.f19011a;
        }
        return sVarI.l(new l9(16, this, sVar));
    }
}