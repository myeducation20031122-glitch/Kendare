package t5;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class o4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17539b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v4 f17540e;

    public /* synthetic */ o4(v4 v4Var, int i10) {
        this.f17539b = i10;
        this.f17540e = v4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Pair pair;
        String str;
        g3 g3Var;
        NetworkInfo activeNetworkInfo;
        int i10 = this.f17539b;
        URL url = null;
        v4 v4Var = this.f17540e;
        switch (i10) {
            case 0:
                v4Var.o();
                b4 b4Var = (b4) v4Var.f15046b;
                q3 q3Var = b4Var.f17250u;
                b4.g(q3Var);
                boolean zB = q3Var.T.b();
                i3 i3Var = b4Var.f17251w;
                if (zB) {
                    b4.i(i3Var);
                    i3Var.P.a("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                } else {
                    q3 q3Var2 = b4Var.f17250u;
                    b4.g(q3Var2);
                    long jZza = q3Var2.U.zza();
                    b4.g(q3Var2);
                    q3Var2.U.c(1 + jZza);
                    if (jZza >= 5) {
                        b4.i(i3Var);
                        i3Var.f17400w.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        b4.g(q3Var2);
                        q3Var2.T.a(true);
                        break;
                    } else {
                        a4 a4Var = b4Var.M;
                        b4.i(a4Var);
                        a4Var.o();
                        x4 x4Var = b4Var.U;
                        b4.i(x4Var);
                        b4.i(x4Var);
                        String strT = b4Var.n().t();
                        b4.g(q3Var2);
                        q3Var2.o();
                        Object obj = q3Var2.f15046b;
                        b4 b4Var2 = (b4) obj;
                        b4Var2.Q.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        String str2 = q3Var2.f17569t;
                        if (str2 == null || jElapsedRealtime >= q3Var2.f17571w) {
                            q3Var2.f17571w = b4Var2.f17249t.u(strT, a3.f17165b) + jElapsedRealtime;
                            try {
                                g4.a aVarA = g4.b.a(((b4) obj).f17234b);
                                q3Var2.f17569t = "";
                                String str3 = aVarA.f13016a;
                                if (str3 != null) {
                                    q3Var2.f17569t = str3;
                                }
                                q3Var2.f17570u = aVarA.f13017b;
                            } catch (Exception e10) {
                                i3 i3Var2 = b4Var2.f17251w;
                                b4.i(i3Var2);
                                i3Var2.P.b(e10, "Unable to get advertising id");
                                q3Var2.f17569t = "";
                            }
                            pair = new Pair(q3Var2.f17569t, Boolean.valueOf(q3Var2.f17570u));
                        } else {
                            pair = new Pair(str2, Boolean.valueOf(q3Var2.f17570u));
                        }
                        Boolean boolX = b4Var.f17249t.x("google_analytics_adid_collection_enabled");
                        if (!(boolX == null || boolX.booleanValue()) || ((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                            b4.i(i3Var);
                            str = "ADID unavailable to retrieve Deferred Deep Link. Skipping";
                            g3Var = i3Var.P;
                        } else {
                            b4.i(x4Var);
                            x4Var.q();
                            b4 b4Var3 = (b4) x4Var.f15046b;
                            ConnectivityManager connectivityManager = (ConnectivityManager) b4Var3.f17234b.getSystemService("connectivity");
                            if (connectivityManager != null) {
                                try {
                                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                } catch (SecurityException unused) {
                                }
                                if (activeNetworkInfo == null && activeNetworkInfo.isConnected()) {
                                    b6 b6Var = b4Var.O;
                                    b4.g(b6Var);
                                    ((b4) b4Var.n().f15046b).f17249t.t();
                                    String str4 = (String) pair.first;
                                    long jZza2 = q3Var2.U.zza() - 1;
                                    Object obj2 = b6Var.f15046b;
                                    try {
                                        fc.t.g(str4);
                                        fc.t.g(strT);
                                        String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 68000L, Integer.valueOf(b6Var.r0())), str4, strT, Long.valueOf(jZza2));
                                        if (strT.equals(((b4) obj2).f17249t.p("debug.deferred.deeplink"))) {
                                            strConcat = strConcat.concat("&ddl_test=1");
                                        }
                                        url = new URL(strConcat);
                                    } catch (IllegalArgumentException e11) {
                                        e = e11;
                                        i3 i3Var3 = ((b4) obj2).f17251w;
                                        b4.i(i3Var3);
                                        i3Var3.f17397n.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                        if (url != null) {
                                            return;
                                        }
                                    } catch (MalformedURLException e12) {
                                        e = e12;
                                        i3 i3Var32 = ((b4) obj2).f17251w;
                                        b4.i(i3Var32);
                                        i3Var32.f17397n.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                        if (url != null) {
                                        }
                                    }
                                    if (url != null) {
                                        b4.i(x4Var);
                                        p5.g gVar = new p5.g(b4Var);
                                        x4Var.o();
                                        x4Var.q();
                                        a4 a4Var2 = b4Var3.M;
                                        b4.i(a4Var2);
                                        a4Var2.w(new l.g(x4Var, strT, url, gVar));
                                        break;
                                    }
                                } else {
                                    b4.i(i3Var);
                                    str = "Network is not available for Deferred Deep Link request. Skipping";
                                    g3Var = i3Var.f17400w;
                                }
                            } else {
                                activeNetworkInfo = null;
                                if (activeNetworkInfo == null) {
                                }
                                b4.i(i3Var);
                                str = "Network is not available for Deferred Deep Link request. Skipping";
                                g3Var = i3Var.f17400w;
                            }
                        }
                        g3Var.a(str);
                        break;
                    }
                }
                break;
            default:
                l4 l4Var = v4Var.Q;
                b4 b4Var4 = l4Var.f17485a;
                a4 a4Var3 = b4Var4.M;
                b4.i(a4Var3);
                a4Var3.o();
                if (l4Var.c()) {
                    boolean zD = l4Var.d();
                    v4 v4Var2 = b4Var4.S;
                    q3 q3Var3 = b4Var4.f17250u;
                    if (zD) {
                        b4.g(q3Var3);
                        q3Var3.W.g(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        b4.h(v4Var2);
                        v4Var2.w("auto", "_cmpx", bundle);
                    } else {
                        b4.g(q3Var3);
                        com.bumptech.glide.m mVar = q3Var3.W;
                        String strF = mVar.f();
                        if (TextUtils.isEmpty(strF)) {
                            i3 i3Var4 = b4Var4.f17251w;
                            b4.i(i3Var4);
                            i3Var4.f17398t.a("Cache still valid but referrer not found");
                        } else {
                            long jZza3 = ((q3Var3.X.zza() / 3600000) - 1) * 3600000;
                            Uri uri = Uri.parse(strF);
                            Bundle bundle2 = new Bundle();
                            Pair pair2 = new Pair(uri.getPath(), bundle2);
                            for (String str5 : uri.getQueryParameterNames()) {
                                bundle2.putString(str5, uri.getQueryParameter(str5));
                            }
                            ((Bundle) pair2.second).putLong("_cc", jZza3);
                            Object obj3 = pair2.first;
                            String str6 = obj3 == null ? "app" : (String) obj3;
                            b4.h(v4Var2);
                            v4Var2.w(str6, "_cmp", (Bundle) pair2.second);
                        }
                        mVar.g(null);
                    }
                    b4.g(q3Var3);
                    q3Var3.X.c(0L);
                    break;
                }
                break;
        }
    }
}