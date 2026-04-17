package j8;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.l9;
import fc.t;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import m.s3;
import org.json.JSONException;
import org.json.JSONObject;
import t5.j4;
import x5.l;
import x5.s;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements d {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f13846m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final c1 f13847n = new c1();

    /* renamed from: a, reason: collision with root package name */
    public final i7.g f13848a;

    /* renamed from: b, reason: collision with root package name */
    public final l8.c f13849b;

    /* renamed from: c, reason: collision with root package name */
    public final l9 f13850c;

    /* renamed from: d, reason: collision with root package name */
    public final j f13851d;

    /* renamed from: e, reason: collision with root package name */
    public final k8.b f13852e;

    /* renamed from: f, reason: collision with root package name */
    public final h f13853f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f13854g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f13855h;

    /* renamed from: i, reason: collision with root package name */
    public final ThreadPoolExecutor f13856i;

    /* renamed from: j, reason: collision with root package name */
    public String f13857j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f13858k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f13859l;

    public c(i7.g gVar, i8.c cVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        c1 c1Var = f13847n;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, c1Var);
        gVar.a();
        l8.c cVar2 = new l8.c(gVar.f13427a, cVar);
        l9 l9Var = new l9(gVar, 23);
        if (n7.c.f15367e == null) {
            n7.c.f15367e = new n7.c(4);
        }
        n7.c cVar3 = n7.c.f15367e;
        if (j.f13867d == null) {
            j.f13867d = new j(cVar3);
        }
        j jVar = j.f13867d;
        k8.b bVar = new k8.b(gVar);
        h hVar = new h();
        this.f13854g = new Object();
        this.f13858k = new HashSet();
        this.f13859l = new ArrayList();
        this.f13848a = gVar;
        this.f13849b = cVar2;
        this.f13850c = l9Var;
        this.f13851d = jVar;
        this.f13852e = bVar;
        this.f13853f = hVar;
        this.f13855h = threadPoolExecutor;
        this.f13856i = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), c1Var);
    }

    public final void a(i iVar) {
        synchronized (this.f13854g) {
            this.f13859l.add(iVar);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void b(boolean z7) {
        k8.a aVarO;
        synchronized (f13846m) {
            try {
                i7.g gVar = this.f13848a;
                gVar.a();
                l9 l9VarA = l9.a(gVar.f13427a);
                try {
                    aVarO = this.f13850c.o();
                    k8.c cVar = k8.c.f14041e;
                    k8.c cVar2 = aVarO.f14031b;
                    if (cVar2 == cVar || cVar2 == k8.c.f14040b) {
                        String strH = h(aVarO);
                        l9 l9Var = this.f13850c;
                        s3 s3VarA = aVarO.a();
                        s3VarA.f14927b = strH;
                        s3VarA.g(k8.c.f14042f);
                        aVarO = s3VarA.b();
                        l9Var.m(aVarO);
                    }
                    if (l9VarA != null) {
                        l9VarA.p();
                    }
                } catch (Throwable th) {
                    if (l9VarA != null) {
                        l9VarA.p();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z7) {
            s3 s3VarA2 = aVarO.a();
            s3VarA2.f14929f = null;
            aVarO = s3VarA2.b();
        }
        k(aVarO);
        this.f13856i.execute(new b(this, z7, 0));
    }

    public final k8.a c(k8.a aVar) {
        int responseCode;
        l8.b bVarF;
        o5.d dVarA;
        i7.g gVar = this.f13848a;
        gVar.a();
        String str = gVar.f13429c.f13436a;
        gVar.a();
        String str2 = gVar.f13429c.f13442g;
        String str3 = aVar.f14033d;
        l8.c cVar = this.f13849b;
        l8.e eVar = cVar.f14675c;
        if (!eVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = l8.c.a(String.format("projects/%s/installations/%s/authTokens:generate", str2, aVar.f14030a));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str3);
                    httpURLConnectionC.setDoOutput(true);
                    l8.c.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    eVar.d(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    bVarF = l8.c.f(httpURLConnectionC);
                } else {
                    l8.c.b(httpURLConnectionC, null, str, str2);
                    if (responseCode == 401 || responseCode == 404) {
                        dVarA = l8.b.a();
                        dVarA.f15723j = l8.f.f14686f;
                        bVarF = dVarA.h();
                    } else {
                        if (responseCode == 429) {
                            throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            dVarA = l8.b.a();
                            dVarA.f15723j = l8.f.f14685e;
                            bVarF = dVarA.h();
                        } else {
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                }
                int iOrdinal = bVarF.f14670c.ordinal();
                if (iOrdinal == 0) {
                    j jVar = this.f13851d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f13868a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    s3 s3VarA = aVar.a();
                    s3VarA.f14929f = bVarF.f14668a;
                    s3VarA.f14931m = Long.valueOf(bVarF.f14669b);
                    s3VarA.f14932n = Long.valueOf(seconds);
                    return s3VarA.b();
                }
                if (iOrdinal == 1) {
                    s3 s3VarA2 = aVar.a();
                    s3VarA2.f14933t = "BAD CONFIG";
                    s3VarA2.g(k8.c.f14044m);
                    return s3VarA2.b();
                }
                if (iOrdinal != 2) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                l(null);
                s3 s3VarA3 = aVar.a();
                s3VarA3.g(k8.c.f14041e);
                return s3VarA3.b();
            } finally {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final s d() {
        String str;
        g();
        synchronized (this) {
            str = this.f13857j;
        }
        if (str != null) {
            return j4.i(str);
        }
        l lVar = new l();
        a(new g(lVar));
        s sVar = lVar.f19011a;
        this.f13855h.execute(new androidx.activity.d(this, 14));
        return sVar;
    }

    public final s e() {
        g();
        l lVar = new l();
        a(new f(this.f13851d, lVar));
        this.f13855h.execute(new b(this, false, 1));
        return lVar.f19011a;
    }

    /* JADX WARN: Finally extract failed */
    public final void f(k8.a aVar) {
        synchronized (f13846m) {
            try {
                i7.g gVar = this.f13848a;
                gVar.a();
                l9 l9VarA = l9.a(gVar.f13427a);
                try {
                    this.f13850c.m(aVar);
                    if (l9VarA != null) {
                        l9VarA.p();
                    }
                } catch (Throwable th) {
                    if (l9VarA != null) {
                        l9VarA.p();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        i7.g gVar = this.f13848a;
        gVar.a();
        t.h("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", gVar.f13429c.f13437b);
        gVar.a();
        t.h("Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", gVar.f13429c.f13442g);
        gVar.a();
        t.h("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", gVar.f13429c.f13436a);
        gVar.a();
        String str = gVar.f13429c.f13437b;
        Pattern pattern = j.f13866c;
        t.b("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        t.b("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f13866c.matcher(gVar.f13429c.f13436a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String h(k8.a aVar) {
        String strA;
        i7.g gVar = this.f13848a;
        gVar.a();
        if (!gVar.f13428b.equals("CHIME_ANDROID_SDK")) {
            i7.g gVar2 = this.f13848a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f13428b)) {
                if (aVar.f14031b == k8.c.f14040b) {
                    k8.b bVar = this.f13852e;
                    synchronized (bVar.f14038a) {
                        try {
                            strA = bVar.a();
                            if (strA == null) {
                                strA = bVar.b();
                            }
                        } finally {
                        }
                    }
                    if (!TextUtils.isEmpty(strA)) {
                        return strA;
                    }
                    this.f13853f.getClass();
                    return h.a();
                }
            }
        }
        this.f13853f.getClass();
        return h.a();
    }

    public final k8.a i(k8.a aVar) {
        int responseCode;
        l8.a aVarE;
        String str = aVar.f14030a;
        String string = null;
        if (str != null && str.length() == 11) {
            k8.b bVar = this.f13852e;
            synchronized (bVar.f14038a) {
                try {
                    String[] strArr = k8.b.f14037c;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 4) {
                            break;
                        }
                        String str2 = strArr[i10];
                        String string2 = bVar.f14038a.getString("|T|" + bVar.f14039b + "|" + str2, null);
                        if (string2 == null || string2.isEmpty()) {
                            i10++;
                        } else if (string2.startsWith("{")) {
                            try {
                                string = new JSONObject(string2).getString("token");
                            } catch (JSONException unused) {
                            }
                        } else {
                            string = string2;
                        }
                    }
                } finally {
                }
            }
        }
        l8.c cVar = this.f13849b;
        i7.g gVar = this.f13848a;
        gVar.a();
        String str3 = gVar.f13429c.f13436a;
        String str4 = aVar.f14030a;
        i7.g gVar2 = this.f13848a;
        gVar2.a();
        String str5 = gVar2.f13429c.f13442g;
        i7.g gVar3 = this.f13848a;
        gVar3.a();
        String str6 = gVar3.f13429c.f13437b;
        l8.e eVar = cVar.f14675c;
        if (!eVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = l8.c.a(String.format("projects/%s/installations", str5));
        for (int i11 = 0; i11 <= 1; i11++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    l8.c.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    eVar.d(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            if (responseCode < 200 || responseCode >= 300) {
                l8.c.b(httpURLConnectionC, str6, str3, str5);
                if (responseCode == 429) {
                    throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    l8.a aVar2 = new l8.a(null, null, null, null, l8.d.f14677e);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVarE = aVar2;
                } else {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } else {
                aVarE = l8.c.e(httpURLConnectionC);
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            int iOrdinal = aVarE.f14667e.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                s3 s3VarA = aVar.a();
                s3VarA.f14933t = "BAD CONFIG";
                s3VarA.g(k8.c.f14044m);
                return s3VarA.b();
            }
            String str7 = aVarE.f14664b;
            String str8 = aVarE.f14665c;
            j jVar = this.f13851d;
            jVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jVar.f13868a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            l8.b bVar2 = aVarE.f14666d;
            String str9 = bVar2.f14668a;
            long j10 = bVar2.f14669b;
            s3 s3VarA2 = aVar.a();
            s3VarA2.f14927b = str7;
            s3VarA2.g(k8.c.f14043j);
            s3VarA2.f14929f = str9;
            s3VarA2.f14930j = str8;
            s3VarA2.f14931m = Long.valueOf(j10);
            s3VarA2.f14932n = Long.valueOf(seconds);
            return s3VarA2.b();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.f13854g) {
            try {
                Iterator it = this.f13859l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(k8.a aVar) {
        synchronized (this.f13854g) {
            try {
                Iterator it = this.f13859l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void l(String str) {
        this.f13857j = str;
    }

    public final synchronized void m(k8.a aVar, k8.a aVar2) {
        if (this.f13858k.size() != 0 && !aVar.f14030a.equals(aVar2.f14030a)) {
            Iterator it = this.f13858k.iterator();
            if (it.hasNext()) {
                ic1.v(it.next());
                throw null;
            }
        }
    }
}