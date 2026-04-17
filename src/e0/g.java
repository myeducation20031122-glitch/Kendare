package e0;

import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.ads.le;
import com.google.android.gms.internal.ads.wh0;
import com.google.android.gms.internal.ads.yl0;
import com.google.android.gms.internal.measurement.l9;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.isprid.kendare.model.DArticle;
import com.isprid.kendare.model.DPurchasePlan;
import com.isprid.kendare.model.DSetting;
import com.isprid.kendare.network.util.Resource;
import com.isprid.kendare.network.util.ResourceState;
import com.isprid.kendare.ui.info.AboutAppActivity;
import com.isprid.kendare.ui.info.PrivacyPolicy;
import com.isprid.kendare.ui.main.MainActivity;
import com.isprid.kendare.ui.premium.PremiumActivity;
import com.isprid.kendare.ui.services.ArticleInfoActivity;
import com.isprid.kendare.ui.splash.IntroActivity;
import com.isprid.kendare.util.LollipopFixedWebView;
import g.u0;
import g.v0;
import io.reactivex.internal.fuseable.QueueFuseable;
import j4.i2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.Thread;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import m.s3;
import o0.c1;
import org.json.JSONObject;
import t5.j4;
import t7.z0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class g implements y3.b, x3.j, i8.a, x5.c, x5.e, androidx.lifecycle.d0, x5.g, m7.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12371b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12372e;

    public /* synthetic */ g(Object obj, int i10) {
        this.f12371b = i10;
        this.f12372e = obj;
    }

    @Override // m7.d
    public Object a(m7.s sVar) throws Resources.NotFoundException {
        String str;
        x5.s sVar2;
        int i10;
        ExecutorService executorService;
        x5.s sVarK;
        s3 s3Var;
        boolean z7;
        String str2;
        ExecutorService executorService2;
        boolean z10;
        String str3;
        boolean zExists;
        Resources resources;
        x7.a aVarC;
        int i11 = this.f12371b;
        Object obj = this.f12372e;
        switch (i11) {
            case 0:
            case QueueFuseable.SYNC /* 1 */:
                return obj;
            default:
                ((CrashlyticsRegistrar) obj).getClass();
                i7.g gVar = (i7.g) sVar.a(i7.g.class);
                i8.b bVarE = sVar.e(o7.a.class);
                i8.b bVarE2 = sVar.e(k7.a.class);
                j8.d dVar = (j8.d) sVar.a(j8.d.class);
                gVar.a();
                Context context = gVar.f13427a;
                String packageName = context.getPackageName();
                o7.c cVar = o7.c.f15807a;
                String strV = a0.h.v("Initializing Firebase Crashlytics 18.2.12 for ", packageName);
                if (cVar.a(4)) {
                    Log.i("FirebaseCrashlytics", strV, null);
                }
                v7.b bVar = new v7.b();
                bVar.f18509b = context.getFilesDir();
                if (Build.VERSION.SDK_INT >= 28) {
                    str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + a3.a.p().replaceAll("[^a-zA-Z0-9.]", "_");
                } else {
                    str = ".com.google.firebase.crashlytics.files.v1";
                }
                File file = new File((File) bVar.f18509b, str);
                v7.b.i(file);
                bVar.f18510e = file;
                File file2 = new File((File) bVar.f18510e, "open-sessions");
                v7.b.i(file2);
                bVar.f18511f = file2;
                File file3 = new File((File) bVar.f18510e, "reports");
                v7.b.i(file3);
                bVar.f18512j = file3;
                File file4 = new File((File) bVar.f18510e, "priority-reports");
                v7.b.i(file4);
                bVar.f18513m = file4;
                File file5 = new File((File) bVar.f18510e, "native-reports");
                v7.b.i(file5);
                bVar.f18514n = file5;
                i2 i2Var = new i2(gVar);
                r7.r rVar = new r7.r(context, packageName, dVar, i2Var);
                o7.b bVar2 = new o7.b(bVarE);
                n7.b bVar3 = new n7.b(bVarE2);
                r7.m mVar = new r7.m(gVar, rVar, bVar2, i2Var, new n7.a(bVar3), new n7.a(bVar3), bVar, fc.t.a("Crashlytics Exception Handler"));
                gVar.a();
                String str4 = gVar.f13429c.f13437b;
                int iD = r7.e.d(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (iD == 0) {
                    iD = r7.e.d(context, "com.crashlytics.android.build_id", "string");
                }
                String string = iD != 0 ? context.getResources().getString(iD) : null;
                cVar.b("Mapping file ID is: " + string);
                try {
                    s3 s3VarE = s3.e(context, rVar, str4, string, new l9(context, 13, 0));
                    cVar.c("Installer package name is: " + ((String) s3VarE.f14929f));
                    ExecutorService executorServiceA = fc.t.a("com.google.firebase.crashlytics.startup");
                    q6.b bVar4 = new q6.b(3);
                    String str5 = (String) s3VarE.f14931m;
                    String str6 = (String) s3VarE.f14932n;
                    String strD = rVar.d();
                    q6.b bVar5 = new q6.b(2);
                    x7.b bVar6 = new x7.b(bVar5);
                    x7.b bVar7 = new x7.b(bVar);
                    Locale locale = Locale.US;
                    o5.d dVar2 = new o5.d(String.format(locale, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str4), bVar4);
                    String str7 = Build.MANUFACTURER;
                    String str8 = r7.r.f16629h;
                    String str9 = String.format(locale, "%s/%s", str7.replaceAll(str8, ""), Build.MODEL.replaceAll(str8, ""));
                    String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str8, "");
                    String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str8, "");
                    int iD2 = r7.e.d(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (iD2 == 0) {
                        iD2 = r7.e.d(context, "com.crashlytics.android.build_id", "string");
                    }
                    String[] strArr = {iD2 != 0 ? context.getResources().getString(iD2) : null, str4, str6, str5};
                    ArrayList arrayList = new ArrayList();
                    int i12 = 0;
                    while (i12 < 4) {
                        String str10 = strArr[i12];
                        String[] strArr2 = strArr;
                        if (str10 != null) {
                            arrayList.add(str10.replace("-", "").toLowerCase(Locale.US));
                        }
                        i12++;
                        strArr = strArr2;
                    }
                    Collections.sort(arrayList);
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                    }
                    String string2 = sb.toString();
                    x7.d dVar3 = new x7.d(str4, str9, strReplaceAll, strReplaceAll2, rVar, string2.length() > 0 ? r7.e.i(string2) : null, str6, str5, kc.r.a(strD != null ? 4 : 1));
                    a2.n nVar = new a2.n();
                    nVar.f275u = new AtomicReference();
                    nVar.f276w = new AtomicReference(new x5.l());
                    nVar.f268b = context;
                    nVar.f269e = dVar3;
                    nVar.f271j = bVar5;
                    nVar.f270f = bVar6;
                    nVar.f272m = bVar7;
                    nVar.f273n = dVar2;
                    nVar.f274t = i2Var;
                    ((AtomicReference) nVar.f275u).set(n7.c.o(bVar5));
                    if ((!((Context) nVar.f268b).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((x7.d) nVar.f269e).f19106f)) || (aVarC = nVar.c(1)) == null) {
                        x7.a aVarC2 = nVar.c(3);
                        if (aVarC2 != null) {
                            ((AtomicReference) nVar.f275u).set(aVarC2);
                            ((x5.l) ((AtomicReference) nVar.f276w).get()).d(aVarC2);
                        }
                        i2 i2Var2 = (i2) nVar.f274t;
                        x5.s sVar3 = ((x5.l) i2Var2.f13745h).f19011a;
                        synchronized (i2Var2.f13738a) {
                            sVar2 = ((x5.l) i2Var2.f13743f).f19011a;
                        }
                        ExecutorService executorService3 = r7.v.f16643a;
                        x5.l lVar = new x5.l();
                        i10 = 0;
                        r7.u uVar = new r7.u(i10, lVar);
                        executorService = executorServiceA;
                        sVar3.e(executorService, uVar);
                        sVar2.e(executorService, uVar);
                        sVarK = lVar.f19011a.k(executorService, new x7.b(nVar));
                    } else {
                        ((AtomicReference) nVar.f275u).set(aVarC);
                        ((x5.l) ((AtomicReference) nVar.f276w).get()).d(aVarC);
                        sVarK = j4.i(null);
                        executorService = executorServiceA;
                        i10 = 0;
                    }
                    sVarK.e(executorService, new n7.c(i10));
                    g2.h hVar = mVar.f16610m;
                    Context context2 = mVar.f16598a;
                    if (context2 == null || (resources = context2.getResources()) == null) {
                        s3Var = s3VarE;
                        z7 = true;
                    } else {
                        int iD3 = r7.e.d(context2, "com.crashlytics.RequireBuildId", "bool");
                        if (iD3 > 0) {
                            z7 = resources.getBoolean(iD3);
                        } else {
                            int iD4 = r7.e.d(context2, "com.crashlytics.RequireBuildId", "string");
                            if (iD4 > 0) {
                                z7 = Boolean.parseBoolean(context2.getString(iD4));
                            }
                            s3Var = s3VarE;
                            z7 = true;
                        }
                        s3Var = s3VarE;
                    }
                    String str11 = (String) s3Var.f14928e;
                    if (z7) {
                        str2 = "FirebaseCrashlytics";
                        if (TextUtils.isEmpty(str11)) {
                            Log.e(str2, ".");
                            Log.e(str2, ".     |  | ");
                            Log.e(str2, ".     |  |");
                            Log.e(str2, ".     |  |");
                            Log.e(str2, ".   \\ |  | /");
                            Log.e(str2, ".    \\    /");
                            Log.e(str2, ".     \\  /");
                            Log.e(str2, ".      \\/");
                            Log.e(str2, ".");
                            Log.e(str2, "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                            Log.e(str2, ".");
                            Log.e(str2, ".      /\\");
                            Log.e(str2, ".     /  \\");
                            Log.e(str2, ".    /    \\");
                            Log.e(str2, ".   / |  | \\");
                            Log.e(str2, ".     |  |");
                            Log.e(str2, ".     |  |");
                            Log.e(str2, ".     |  |");
                            Log.e(str2, ".");
                            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                        }
                    } else {
                        str2 = "FirebaseCrashlytics";
                        if (Log.isLoggable(str2, 2)) {
                            Log.v(str2, "Configured not to require a build ID.", null);
                        }
                    }
                    new r7.c(mVar.f16605h);
                    String str12 = r7.c.f16561b;
                    try {
                        v7.b bVar8 = mVar.f16606i;
                        int i13 = 17;
                        mVar.f16603f = new l9("crash_marker", bVar8, i13);
                        mVar.f16602e = new l9("initialization_marker", bVar8, i13);
                        v7.b bVar9 = new v7.b(str12, bVar8, hVar);
                        v7.b bVar10 = mVar.f16606i;
                        s7.c cVar2 = new s7.c(bVar10);
                        y7.a[] aVarArr = {new z2.z(10, 16)};
                        g0.d dVar4 = new g0.d();
                        dVar4.f12950b = 1024;
                        dVar4.f12951e = aVarArr;
                        dVar4.f12952f = new z2.z(1024, 15);
                        executorService2 = executorService;
                        try {
                            str3 = str2;
                            try {
                                mVar.f16604g = new r7.j(mVar.f16598a, mVar.f16610m, mVar.f16605h, mVar.f16599b, mVar.f16606i, mVar.f16603f, s3Var, cVar2, r7.t.b(mVar.f16598a, mVar.f16605h, bVar10, s3Var, cVar2, bVar9, dVar4, nVar, mVar.f16600c), mVar.f16611n, mVar.f16608k);
                                l9 l9Var = mVar.f16602e;
                                v7.b bVar11 = (v7.b) l9Var.f10882f;
                                String str13 = (String) l9Var.f10881e;
                                bVar11.getClass();
                                zExists = new File((File) bVar11.f18510e, str13).exists();
                                try {
                                    Boolean.TRUE.equals((Boolean) r7.v.a(hVar.l(new r7.l(mVar, 1))));
                                } catch (Exception unused) {
                                }
                                r7.j jVar = mVar.f16604g;
                                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                                jVar.getClass();
                                jVar.f16583d.l(new l4.z(jVar, str12, 7));
                                r7.o oVar = new r7.o(new p5.g(jVar), nVar, defaultUncaughtExceptionHandler, jVar.f16588i);
                                jVar.f16591l = oVar;
                                Thread.setDefaultUncaughtExceptionHandler(oVar);
                            } catch (Exception e10) {
                                e = e10;
                                str2 = str3;
                                Log.e(str2, "Crashlytics was not started due to an exception during initialization", e);
                                mVar.f16604g = null;
                                z10 = false;
                                j4.c(new x4.o(1, mVar, nVar, z10), executorService2);
                                return new n7.d(mVar);
                            }
                        } catch (Exception e11) {
                            e = e11;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        executorService2 = executorService;
                    }
                    if (zExists) {
                        if (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo();
                            if (activeNetworkInfo != null) {
                                if (activeNetworkInfo.isConnectedOrConnecting()) {
                                }
                            }
                        }
                        str2 = str3;
                        if (Log.isLoggable(str2, 3)) {
                            Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                        }
                        mVar.b(nVar);
                        z10 = false;
                        j4.c(new x4.o(1, mVar, nVar, z10), executorService2);
                        return new n7.d(mVar);
                    }
                    if (Log.isLoggable(str3, 3)) {
                        Log.d(str3, "Successfully configured exception handler.", null);
                    }
                    z10 = true;
                    j4.c(new x4.o(1, mVar, nVar, z10), executorService2);
                    return new n7.d(mVar);
                } catch (PackageManager.NameNotFoundException e13) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e13);
                    return null;
                }
        }
    }

    @Override // x3.j
    public Object apply(Object obj) {
        URL url;
        int i10 = this.f12371b;
        Object obj2 = this.f12372e;
        switch (i10) {
            case 2:
                p3.d dVar = (p3.d) obj2;
                p3.b bVar = (p3.b) obj;
                dVar.getClass();
                URL url2 = bVar.f15922a;
                String strM = o5.y.m("CctTransportBackend");
                if (Log.isLoggable(strM, 4)) {
                    Log.i(strM, String.format("Making request to: %s", url2));
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) bVar.f15922a.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(dVar.f15934g);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.2.0"));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                String str = bVar.f15924c;
                if (str != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
                }
                try {
                    try {
                        try {
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            try {
                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                                try {
                                    dVar.f15928a.m(bVar.f15923b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                                    gZIPOutputStream.close();
                                    if (outputStream != null) {
                                        outputStream.close();
                                    }
                                    int responseCode = httpURLConnection.getResponseCode();
                                    Integer numValueOf = Integer.valueOf(responseCode);
                                    String strM2 = o5.y.m("CctTransportBackend");
                                    if (Log.isLoggable(strM2, 4)) {
                                        Log.i(strM2, String.format("Status Code: %d", numValueOf));
                                    }
                                    o5.y.g(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                                    o5.y.g(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                                        return new p3.c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                                    }
                                    if (responseCode != 200) {
                                        return new p3.c(responseCode, null, 0L);
                                    }
                                    InputStream inputStream = httpURLConnection.getInputStream();
                                    try {
                                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                                        try {
                                            p3.c cVar = new p3.c(responseCode, null, q3.u.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f16234a);
                                            if (gZIPInputStream != null) {
                                                gZIPInputStream.close();
                                            }
                                            if (inputStream != null) {
                                                inputStream.close();
                                            }
                                            return cVar;
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (ConnectException | UnknownHostException e10) {
                            e = e10;
                            url = null;
                            o5.y.h("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                            return new p3.c(500, url, 0L);
                        }
                    } catch (b8.b | IOException e11) {
                        o5.y.h("CctTransportBackend", "Couldn't encode request, returning with 400", e11);
                        return new p3.c(400, null, 0L);
                    }
                } catch (ConnectException | UnknownHostException e12) {
                    e = e12;
                    url = null;
                    o5.y.h("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new p3.c(500, url, 0L);
                }
            default:
                Map map = (Map) obj2;
                Cursor cursor = (Cursor) obj;
                o3.c cVar2 = x3.l.f18936n;
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    Set hashSet = (Set) map.get(Long.valueOf(j10));
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(Long.valueOf(j10), hashSet);
                    }
                    hashSet.add(new x3.k(cursor.getString(1), cursor.getString(2)));
                }
                return null;
        }
    }

    public boolean b(v0 v0Var, int i10, Bundle bundle) {
        View view = (View) this.f12372e;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                ((t0.g) v0Var.f12909e).h();
                Parcelable parcelable = (Parcelable) ((t0.g) v0Var.f12909e).e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        v0 v0Var2 = new v0(new ClipData(((t0.g) v0Var.f12909e).a(), new ClipData.Item(((t0.g) v0Var.f12909e).g())), 2);
        ((o0.d) v0Var2.f12909e).d(((t0.g) v0Var.f12909e).i());
        ((o0.d) v0Var2.f12909e).c(bundle);
        return c1.n(view, ((o0.d) v0Var2.f12909e).a()) == null;
    }

    public void c(m2.e eVar, List list) {
        Throwable th;
        m2.e eVar2;
        int i10;
        t9.g gVar = (t9.g) this.f12372e;
        Date date = t9.g.N;
        gVar.getClass();
        int i11 = eVar.f15097b;
        int i12 = 3;
        int i13 = 8;
        if (i11 != 0) {
            if (i11 == 7) {
                String strQ = gVar.q();
                if (TextUtils.isEmpty(strQ)) {
                    gVar.w(null);
                } else {
                    gVar.r(strQ.split(":")[1]);
                    gVar.C(null);
                }
                th = new Throwable(eVar.f15098c);
            } else if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5 && i11 != 6 && i11 != 8) {
                return;
            } else {
                th = new Throwable(eVar.f15098c);
            }
            gVar.y(i11, th);
            return;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                if (purchase.f2196c.optInt("purchaseState", 1) != 4) {
                    JSONObject jSONObject = purchase.f2196c;
                    if (jSONObject.optBoolean("acknowledged", true)) {
                        gVar.D(purchase);
                    } else {
                        String strOptString = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
                        if (strOptString == null) {
                            throw new IllegalArgumentException("Purchase token must be set");
                        }
                        androidx.emoji2.text.t tVar = new androidx.emoji2.text.t();
                        tVar.f887b = strOptString;
                        m2.a aVar = gVar.f18077u;
                        w3.i iVar = new w3.i(i13, gVar, purchase);
                        if (aVar.a()) {
                            if (TextUtils.isEmpty(tVar.f887b)) {
                                com.google.android.gms.internal.play_billing.r.e("BillingClient", "Please provide a valid purchase token.");
                                eVar2 = m2.t.f15140i;
                                i10 = 26;
                            } else if (!aVar.f15065l) {
                                eVar2 = m2.t.f15133b;
                                i10 = 27;
                            } else if (aVar.h(new m2.n(aVar, tVar, iVar, i12), 30000L, new m.k(aVar, iVar, 15), aVar.d()) == null) {
                                m2.e eVarF = aVar.f();
                                aVar.i(m2.r.a(25, 3, eVarF));
                                iVar.a(eVarF);
                            }
                            aVar.i(m2.r.a(i10, 3, eVar2));
                            iVar.a(eVar2);
                        } else {
                            m2.e eVar3 = m2.t.f15143l;
                            aVar.i(m2.r.a(2, 3, eVar3));
                            iVar.a(eVar3);
                        }
                    }
                }
            }
        }
    }

    @Override // i8.a
    public void d(i8.c cVar) {
        o7.b bVar = (o7.b) this.f12372e;
        bVar.getClass();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        bVar.f15806b.set((o7.a) cVar.get());
    }

    @Override // y3.b
    public Object execute() {
        int i10 = this.f12371b;
        int i11 = 0;
        Object obj = this.f12372e;
        switch (i10) {
            case 3:
                x3.l lVar = (x3.l) ((x3.d) obj);
                return Integer.valueOf(((Integer) lVar.c(new x3.f(lVar, ((z3.c) lVar.f18938e).a() - lVar.f18940j.f18916d))).intValue());
            case 4:
                x3.l lVar2 = (x3.l) ((w3.k) obj).f18642i;
                lVar2.getClass();
                lVar2.c(new x3.h(lVar2, i11));
                return null;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                x3.l lVar3 = (x3.l) ((x3.c) obj);
                lVar3.getClass();
                int i12 = u3.a.f18247e;
                int i13 = 5;
                n8.s sVar = new n8.s(5);
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseA = lVar3.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    u3.a aVar = (u3.a) x3.l.h(sQLiteDatabaseA.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new t1.h(lVar3, map, sVar, i13));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return aVar;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            default:
                w3.l lVar4 = (w3.l) obj;
                x3.l lVar5 = (x3.l) lVar4.f18644b;
                lVar5.getClass();
                Iterator it = ((Iterable) lVar5.c(new o0.h(9))).iterator();
                while (it.hasNext()) {
                    ((w3.d) lVar4.f18645c).a((r3.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // androidx.lifecycle.d0
    public void onChanged(Object obj) throws IllegalAccessException, KotlinReflectionInternalError, IllegalPropertyDelegateAccessException, SecurityException, IOException, IllegalArgumentException {
        String appPrivacyPolicy;
        String localizedMessage;
        String description;
        int i10 = this.f12371b;
        int i11 = 4;
        int i12 = 0;
        int i13 = 1;
        Object obj2 = this.f12372e;
        switch (i10) {
            case y4.g.API_NOT_CONNECTED /* 17 */:
                AboutAppActivity this$0 = (AboutAppActivity) obj2;
                Resource it = (Resource) obj;
                int i14 = AboutAppActivity.f11660m;
                Intrinsics.f(this$0, "this$0");
                Intrinsics.e(it, "it");
                ResourceState state = it.getState();
                if (Intrinsics.a(state, ResourceState.LOADING.INSTANCE)) {
                    return;
                }
                if (Intrinsics.a(state, ResourceState.SUCCESS.INSTANCE)) {
                    DSetting dSetting = (DSetting) it.getData();
                    if (dSetting != null) {
                        this$0.k(dSetting);
                        return;
                    }
                    return;
                }
                if (!Intrinsics.a(state, ResourceState.ERROR.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                n7.c.w("Server_Connect_Fail");
                Log.e("PrivacyPolicy", "Fail to load about");
                return;
            case 18:
                PrivacyPolicy this$02 = (PrivacyPolicy) obj2;
                Resource it2 = (Resource) obj;
                int i15 = PrivacyPolicy.f11663m;
                Intrinsics.f(this$02, "this$0");
                Intrinsics.e(it2, "it");
                ResourceState state2 = it2.getState();
                if (Intrinsics.a(state2, ResourceState.LOADING.INSTANCE)) {
                    return;
                }
                if (!Intrinsics.a(state2, ResourceState.SUCCESS.INSTANCE)) {
                    if (!Intrinsics.a(state2, ResourceState.ERROR.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n7.c.w("Server_Connect_Fail");
                    Log.e("PrivacyPolicy", "Fail to load about");
                    return;
                }
                DSetting dSetting2 = (DSetting) it2.getData();
                if (dSetting2 == null || (appPrivacyPolicy = dSetting2.getAppPrivacyPolicy()) == null) {
                    return;
                }
                this$02.k(appPrivacyPolicy);
                return;
            case y4.g.REMOTE_EXCEPTION /* 19 */:
                m9.c this$03 = (m9.c) obj2;
                Resource it3 = (Resource) obj;
                int i16 = m9.c.f15228a0;
                Intrinsics.f(this$03, "this$0");
                Intrinsics.e(it3, "it");
                ResourceState state3 = it3.getState();
                if (Intrinsics.a(state3, ResourceState.LOADING.INSTANCE)) {
                    this$03.l(true);
                    return;
                }
                if (Intrinsics.a(state3, ResourceState.SUCCESS.INSTANCE)) {
                    this$03.l(false);
                    List list = (List) it3.getData();
                    if (list != null) {
                        this$03.V.addAll(list);
                    }
                    z8.p pVar = this$03.U;
                    if (pVar != null) {
                        pVar.notifyDataSetChanged();
                        return;
                    } else {
                        Intrinsics.n("mAdapter");
                        throw null;
                    }
                }
                if (!Intrinsics.a(state3, ResourceState.ERROR.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                this$03.l(false);
                String message = it3.getMessage();
                if (message != null) {
                    Context contextRequireContext = this$03.requireContext();
                    Intrinsics.e(contextRequireContext, "requireContext()");
                    z0.k(contextRequireContext, message);
                    return;
                }
                return;
            case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
            default:
                IntroActivity this$04 = (IntroActivity) obj2;
                Resource it4 = (Resource) obj;
                int i17 = IntroActivity.f11685t;
                Intrinsics.f(this$04, "this$0");
                Intrinsics.e(it4, "it");
                ResourceState state4 = it4.getState();
                if (Intrinsics.a(state4, ResourceState.LOADING.INSTANCE)) {
                    return;
                }
                if (Intrinsics.a(state4, ResourceState.SUCCESS.INSTANCE)) {
                    SharedPreferences.Editor editor = this$04.h().f16961b;
                    editor.putBoolean("first_open", true);
                    editor.apply();
                    DSetting dSetting3 = (DSetting) it4.getData();
                    if (dSetting3 != null) {
                        d9.b bVar = this$04.f11686f;
                        if (bVar == null) {
                            Intrinsics.n("dbHelper");
                            throw null;
                        }
                        bVar.a(dSetting3);
                    }
                    SharedPreferences.Editor editor2 = this$04.h().f16961b;
                    editor2.putBoolean("first_open", false);
                    editor2.apply();
                    if (!g5.a.f13047s) {
                        wh0 wh0Var = new wh0(this$04, this$04.getString(2131886987), "This app is no longer available");
                        wh0Var.d("Exit", true, new r9.c(this$04, i12));
                        ((g.i) ((yl0) wh0Var.f9513f).f10133f).f12795l = new u9.a(new r9.c(this$04, i13));
                        wh0Var.a().show();
                        return;
                    }
                } else {
                    if (!Intrinsics.a(state4, ResourceState.ERROR.INSTANCE)) {
                        return;
                    }
                    n7.c.w("Server_Connect_Fail");
                    Log.e("IntroActivity", "failed to fetch about data");
                }
                this$04.l(false);
                return;
            case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                o9.c this$05 = (o9.c) obj2;
                Resource it5 = (Resource) obj;
                int i18 = o9.c.M;
                Intrinsics.f(this$05, "this$0");
                Intrinsics.e(it5, "it");
                ResourceState state5 = it5.getState();
                if (Intrinsics.a(state5, ResourceState.LOADING.INSTANCE)) {
                    boolean z7 = this$05.f15842w;
                    androidx.lifecycle.s0 s0Var = new androidx.lifecycle.s0(this$05, 3);
                    if (z7) {
                        s0Var.invoke();
                        return;
                    }
                    return;
                }
                if (!Intrinsics.a(state5, ResourceState.SUCCESS.INSTANCE)) {
                    if (!Intrinsics.a(state5, ResourceState.ERROR.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j9.b bVar2 = this$05.f13873b;
                    if (bVar2 != null) {
                        bVar2.i();
                    }
                    String message2 = it5.getMessage();
                    if (message2 != null) {
                        Context contextRequireContext2 = this$05.requireContext();
                        Intrinsics.e(contextRequireContext2, "requireContext()");
                        z0.k(contextRequireContext2, message2);
                        return;
                    }
                    return;
                }
                j9.b bVar3 = this$05.f13873b;
                if (bVar3 != null) {
                    bVar3.i();
                }
                if (((List) it5.getData()) != null && (!r2.isEmpty())) {
                    List list2 = (List) it5.getData();
                    ArrayList arrayList = this$05.f15839n;
                    arrayList.clear();
                    arrayList.addAll(list2);
                    z8.l lVar = this$05.f15838m;
                    if (lVar != null) {
                        lVar.notifyDataSetChanged();
                        return;
                    } else {
                        Intrinsics.n("mAdapter");
                        throw null;
                    }
                }
                o5.d dVar = this$05.f15836f;
                if (dVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ((TextView) dVar.f15723j).setVisibility(0);
                o5.d dVar2 = this$05.f15836f;
                if (dVar2 != null) {
                    ((RecyclerView) dVar2.f15722f).setVisibility(8);
                    return;
                } else {
                    Intrinsics.n("binding");
                    throw null;
                }
            case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                PremiumActivity this$06 = (PremiumActivity) obj2;
                Resource it6 = (Resource) obj;
                int i19 = PremiumActivity.N;
                Intrinsics.f(this$06, "this$0");
                Intrinsics.e(it6, "it");
                ResourceState state6 = it6.getState();
                if (Intrinsics.a(state6, ResourceState.LOADING.INSTANCE)) {
                    this$06.j();
                    return;
                }
                if (!Intrinsics.a(state6, ResourceState.SUCCESS.INSTANCE)) {
                    if (!Intrinsics.a(state6, ResourceState.ERROR.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this$06.i();
                    String message3 = it6.getMessage();
                    if (message3 != null) {
                        z0.k(this$06, message3);
                        return;
                    }
                    return;
                }
                this$06.i();
                if (((List) it6.getData()) == null || !(!r2.isEmpty())) {
                    this$06.k();
                    return;
                }
                if (!this$06.f11678u) {
                    Log.e("PremiumActivity", "Ready To Purchase is false");
                    return;
                }
                ArrayList arrayList2 = new ArrayList((Collection) it6.getData());
                ArrayList arrayList3 = new ArrayList(fa.d.f3(arrayList2));
                Iterator it7 = arrayList2.iterator();
                while (it7.hasNext()) {
                    arrayList3.add(((DPurchasePlan) it7.next()).getProductId());
                }
                t9.g gVar = this$06.f11677t;
                if (gVar == null) {
                    Intrinsics.n("bp");
                    throw null;
                }
                ArrayList arrayList4 = new ArrayList(arrayList3);
                p9.a aVar = new p9.a(this$06, arrayList2);
                m2.a aVar2 = gVar.f18077u;
                if (aVar2 == null || !aVar2.a()) {
                    localizedMessage = "Failed to call getSkuDetails. Service may not be connected";
                } else if (arrayList4.isEmpty()) {
                    localizedMessage = "Empty products list";
                } else {
                    try {
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it8 = arrayList4.iterator();
                        while (it8.hasNext()) {
                            String str = (String) it8.next();
                            le leVar = new le();
                            leVar.f6293b = str;
                            leVar.f6294e = "subs";
                            arrayList5.add(leVar.a());
                        }
                        u0 u0Var = new u0();
                        u0Var.z(arrayList5);
                        m2.k kVar = new m2.k(u0Var);
                        new ArrayList();
                        gVar.f18077u.b(kVar, new t1.h(gVar, aVar, arrayList4, 6));
                        return;
                    } catch (Exception e10) {
                        Log.e("BillingProcessor", "Failed to call getSkuDetails", e10);
                        gVar.y(112, e10);
                        localizedMessage = e10.getLocalizedMessage();
                    }
                }
                gVar.A(aVar, localizedMessage);
                return;
            case 23:
                ArticleInfoActivity this$07 = (ArticleInfoActivity) obj2;
                Resource it9 = (Resource) obj;
                int i20 = ArticleInfoActivity.f11680t;
                Intrinsics.f(this$07, "this$0");
                Intrinsics.e(it9, "it");
                ResourceState state7 = it9.getState();
                if (Intrinsics.a(state7, ResourceState.LOADING.INSTANCE)) {
                    this$07.j();
                    return;
                }
                if (Intrinsics.a(state7, ResourceState.SUCCESS.INSTANCE)) {
                    this$07.i();
                    DArticle dArticle = (DArticle) it9.getData();
                    s3 s3Var = this$07.f11681f;
                    if (s3Var == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ((LollipopFixedWebView) s3Var.f14933t).a();
                    String strR = (dArticle == null || (description = dArticle.getDescription()) == null) ? null : n7.c.r(description, f0.f.b(this$07, 2131035300));
                    s3 s3Var2 = this$07.f11681f;
                    if (s3Var2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ((LollipopFixedWebView) s3Var2.f14933t).loadDataWithBaseURL(null, String.valueOf(strR), "text/html", "utf-8", null);
                    s3 s3Var3 = this$07.f11681f;
                    if (s3Var3 != null) {
                        ((LollipopFixedWebView) s3Var3.f14933t).setWebViewClient(new i4.h(this$07, i11));
                        return;
                    } else {
                        Intrinsics.n("binding");
                        throw null;
                    }
                }
                if (!Intrinsics.a(state7, ResourceState.ERROR.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                this$07.i();
                s3 s3Var4 = this$07.f11681f;
                if (s3Var4 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ScrollView scrollView = (ScrollView) s3Var4.f14931m;
                Intrinsics.e(scrollView, "binding.scroll");
                com.bumptech.glide.f.l(scrollView);
                s3 s3Var5 = this$07.f11681f;
                if (s3Var5 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                LinearLayout linearLayout = (LinearLayout) s3Var5.f14930j;
                Intrinsics.e(linearLayout, "binding.llPanel");
                com.bumptech.glide.f.x(linearLayout);
                s3 s3Var6 = this$07.f11681f;
                if (s3Var6 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                TextView textView = (TextView) s3Var6.f14929f;
                Intrinsics.e(textView, "binding.txtNotFound");
                com.bumptech.glide.f.x(textView);
                String message4 = it9.getMessage();
                if (message4 != null) {
                    z0.k(this$07, message4);
                    return;
                }
                return;
            case 24:
                q9.b this$08 = (q9.b) obj2;
                Resource it10 = (Resource) obj;
                int i21 = q9.b.f16344w;
                Intrinsics.f(this$08, "this$0");
                Intrinsics.e(it10, "it");
                ResourceState state8 = it10.getState();
                if (Intrinsics.a(state8, ResourceState.LOADING.INSTANCE)) {
                    boolean z10 = this$08.f16350u;
                    androidx.lifecycle.s0 s0Var2 = new androidx.lifecycle.s0(this$08, i11);
                    if (z10) {
                        s0Var2.invoke();
                        return;
                    }
                    return;
                }
                if (!Intrinsics.a(state8, ResourceState.SUCCESS.INSTANCE)) {
                    if (!Intrinsics.a(state8, ResourceState.ERROR.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j9.b bVar4 = this$08.f13873b;
                    if (bVar4 != null) {
                        bVar4.i();
                    }
                    this$08.k();
                    String message5 = it10.getMessage();
                    if (message5 != null) {
                        Context contextRequireContext3 = this$08.requireContext();
                        Intrinsics.e(contextRequireContext3, "requireContext()");
                        z0.k(contextRequireContext3, message5);
                        return;
                    }
                    return;
                }
                j9.b bVar5 = this$08.f13873b;
                if (bVar5 != null) {
                    bVar5.i();
                }
                if (((List) it10.getData()) == null || !(!r2.isEmpty())) {
                    this$08.k();
                    return;
                }
                ArrayList arrayList6 = this$08.f16347m;
                arrayList6.clear();
                arrayList6.addAll((Collection) it10.getData());
                z8.b bVar6 = this$08.f16345f;
                if (bVar6 == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                bVar6.notifyDataSetChanged();
                q.d dVar3 = this$08.f16346j;
                if (dVar3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                RecyclerView recyclerView = (RecyclerView) dVar3.f16091m;
                Intrinsics.e(recyclerView, "binding.rvArticles");
                com.bumptech.glide.f.x(recyclerView);
                q.d dVar4 = this$08.f16346j;
                if (dVar4 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                LinearLayout linearLayout2 = (LinearLayout) dVar4.f16089f;
                Intrinsics.e(linearLayout2, "binding.noPostLayout");
                com.bumptech.glide.f.l(linearLayout2);
                return;
        }
    }

    @Override // x5.e
    public void onComplete(x5.k kVar) {
        int i10 = this.f12371b;
        Object obj = this.f12372e;
        switch (i10) {
            case y4.g.TIMEOUT /* 15 */:
                int i11 = n8.b0.f15391e;
                ((n8.c0) obj).f15395b.d(null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // x5.g
    public void onSuccess(Object obj) {
        Function1 tmp0 = (Function1) this.f12372e;
        int i10 = MainActivity.f11666w;
        Intrinsics.f(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // x5.c
    public Object then(x5.k kVar) throws IOException {
        boolean z7;
        Object obj;
        switch (this.f12371b) {
            case 12:
                ((r7.t) this.f12372e).getClass();
                if (kVar.j()) {
                    r7.a aVar = (r7.a) kVar.h();
                    o7.c cVar = o7.c.f15807a;
                    cVar.b("Crashlytics report successfully enqueued to DataTransport: " + aVar.f16558b);
                    File file = aVar.f16559c;
                    if (file.delete()) {
                        cVar.b("Deleted report file: " + file.getPath());
                    } else {
                        cVar.d("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                    z7 = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", kVar.g());
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            case y4.g.ERROR /* 13 */:
                CountDownLatch countDownLatch = (CountDownLatch) this.f12372e;
                ExecutorService executorService = r7.v.f16643a;
                countDownLatch.countDown();
                return null;
            default:
                ((v7.b) this.f12372e).getClass();
                x5.s sVar = (x5.s) kVar;
                synchronized (sVar.f19031a) {
                    fc.t.m("Task is not yet complete", sVar.f19033c);
                    if (sVar.f19034d) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    if (IOException.class.isInstance(sVar.f19036f)) {
                        throw ((Throwable) IOException.class.cast(sVar.f19036f));
                    }
                    Exception exc = sVar.f19036f;
                    if (exc != null) {
                        throw new x5.i(exc);
                    }
                    obj = sVar.f19035e;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}