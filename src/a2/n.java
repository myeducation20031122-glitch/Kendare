package a2;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.ar0;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.e40;
import com.google.android.gms.internal.ads.e60;
import com.google.android.gms.internal.ads.er0;
import com.google.android.gms.internal.ads.fw;
import com.google.android.gms.internal.ads.hi0;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.ads.iy;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jn0;
import com.google.android.gms.internal.ads.kw;
import com.google.android.gms.internal.ads.kz;
import com.google.android.gms.internal.ads.kz0;
import com.google.android.gms.internal.ads.le;
import com.google.android.gms.internal.ads.mk;
import com.google.android.gms.internal.ads.nk;
import com.google.android.gms.internal.ads.ok;
import com.google.android.gms.internal.ads.pv;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.ads.t00;
import com.google.android.gms.internal.ads.v00;
import com.google.android.gms.internal.ads.vz;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.zc0;
import com.google.android.gms.internal.ads.zr;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import l4.g0;
import m.t;
import o5.b0;
import o5.f0;
import o5.r;
import o5.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t7.e0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n implements t3.b, t00 {

    /* renamed from: b, reason: collision with root package name */
    public Object f268b;

    /* renamed from: e, reason: collision with root package name */
    public Object f269e;

    /* renamed from: f, reason: collision with root package name */
    public Object f270f;

    /* renamed from: j, reason: collision with root package name */
    public Object f271j;

    /* renamed from: m, reason: collision with root package name */
    public Object f272m;

    /* renamed from: n, reason: collision with root package name */
    public Object f273n;

    /* renamed from: t, reason: collision with root package name */
    public Object f274t;

    /* renamed from: u, reason: collision with root package name */
    public Object f275u;

    /* renamed from: w, reason: collision with root package name */
    public Object f276w;

    public n(int i10) {
        if (i10 != 7) {
            this.f269e = new ArrayBlockingQueue(100);
            this.f270f = new LinkedHashMap();
            this.f271j = new HashMap();
            this.f273n = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
        }
    }

    public static void d(String str, JSONObject jSONObject) {
        StringBuilder sbN = ic1.n(str);
        sbN.append(jSONObject.toString());
        String string = sbN.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public static final String i(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final o a() {
        o oVar = new o();
        oVar.f284u = new z1.k();
        oVar.T = new k2.j();
        oVar.U = null;
        oVar.f277b = (Context) this.f268b;
        oVar.f283t = (l2.a) this.f271j;
        oVar.M = (h2.a) this.f270f;
        oVar.f278e = (String) this.f274t;
        oVar.f279f = (List) this.f275u;
        oVar.f280j = (g.e) this.f276w;
        oVar.f282n = (ListenableWorker) this.f269e;
        oVar.f285w = (z1.b) this.f272m;
        WorkDatabase workDatabase = (WorkDatabase) this.f273n;
        oVar.N = workDatabase;
        oVar.O = workDatabase.n();
        oVar.P = workDatabase.i();
        oVar.Q = workDatabase.o();
        return oVar;
    }

    public final e0 b() {
        String strF = ((Integer) this.f268b) == null ? " arch" : "";
        if (((String) this.f274t) == null) {
            strF = strF.concat(" model");
        }
        if (((Integer) this.f269e) == null) {
            strF = a0.h.F(strF, " cores");
        }
        if (((Long) this.f270f) == null) {
            strF = a0.h.F(strF, " ram");
        }
        if (((Long) this.f271j) == null) {
            strF = a0.h.F(strF, " diskSpace");
        }
        if (((Boolean) this.f272m) == null) {
            strF = a0.h.F(strF, " simulator");
        }
        if (((Integer) this.f273n) == null) {
            strF = a0.h.F(strF, " state");
        }
        if (((String) this.f275u) == null) {
            strF = a0.h.F(strF, " manufacturer");
        }
        if (((String) this.f276w) == null) {
            strF = a0.h.F(strF, " modelClass");
        }
        if (strF.isEmpty()) {
            return new e0(((Integer) this.f268b).intValue(), (String) this.f274t, ((Integer) this.f269e).intValue(), ((Long) this.f270f).longValue(), ((Long) this.f271j).longValue(), ((Boolean) this.f272m).booleanValue(), ((Integer) this.f273n).intValue(), (String) this.f275u, (String) this.f276w);
        }
        throw new IllegalStateException("Missing required properties:".concat(strF));
    }

    public final x7.a c(int i10) {
        x7.a aVar = null;
        try {
            if (!v.h.a(2, i10)) {
                JSONObject jSONObjectB = ((x7.b) this.f272m).b();
                if (jSONObjectB != null) {
                    x7.a aVarA = ((x7.b) this.f270f).a(jSONObjectB);
                    if (aVarA != null) {
                        d("Loaded cached settings: ", jSONObjectB);
                        ((q6.b) this.f271j).getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (v.h.a(3, i10) || aVarA.f19096c >= jCurrentTimeMillis) {
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                                }
                                aVar = aVarA;
                            } catch (Exception e10) {
                                e = e10;
                                aVar = aVarA;
                                Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                                return aVar;
                            }
                        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        }
                    } else {
                        Log.e("FirebaseCrashlytics", "Failed to parse cached settings data.", null);
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return aVar;
    }

    public final LinkedHashMap e(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap3.get(str);
            je jeVar = (je) ((Map) this.f271j).get(str);
            if (jeVar == null) {
                jeVar = je.f5688a;
            }
            linkedHashMap3.put(str, jeVar.a(str3, str2));
        }
        return linkedHashMap3;
    }

    public final kz0 f(String str, String str2) {
        ar0 ar0VarG = dq0.G((Context) this.f268b, 11);
        ar0VarG.zzh();
        ok okVarC = i4.k.A.f13361p.C((Context) this.f268b, (zr) this.f270f, ((pv) this.f269e).d());
        z1.o oVar = mk.f6566b;
        kz0 kz0VarW2 = dq0.W2(dq0.W2(dq0.W2(dq0.x2(""), new vz(this, str, str2, 2), (Executor) this.f272m), new zc0(okVarC.a("google.afma.response.normalize", oVar, oVar), 0), (Executor) this.f272m), new zc0(this, 9), (Executor) this.f272m);
        e5.c.D(kz0VarW2, (er0) this.f273n, ar0VarG, false);
        return kz0VarW2;
    }

    public final String g(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put((String) this.f274t));
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            wr.g("Failed to update the ad types for rendering. ".concat(e10.toString()));
            return str;
        }
    }

    @Override // da.a
    public final Object get() {
        return new w3.k((Context) ((da.a) this.f268b).get(), (s3.g) ((da.a) this.f269e).get(), (x3.d) ((da.a) this.f270f).get(), (w3.m) ((da.a) this.f271j).get(), (Executor) ((da.a) this.f272m).get(), (y3.c) ((da.a) this.f273n).get(), (z3.a) ((da.a) this.f274t).get(), (z3.a) ((da.a) this.f275u).get(), (x3.c) ((da.a) this.f276w).get());
    }

    public final t h(r5 r5Var) throws f0, IOException {
        String str;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent((Application) this.f268b));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str2 = (String) r5Var.f7937a;
                    if (str2 != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str2);
                    }
                    Boolean bool = (Boolean) r5Var.f7938b;
                    if (bool != null) {
                        jsonWriter.name("is_lat");
                        jsonWriter.value(bool.booleanValue());
                    }
                    String str3 = (String) r5Var.f7939c;
                    if (str3 != null) {
                        jsonWriter.name("adid");
                        jsonWriter.value(str3);
                    }
                    g0.d dVar = (g0.d) r5Var.f7940d;
                    if (dVar != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i10 = dVar.f12950b;
                        if (i10 != 1) {
                            jsonWriter.name("os_type");
                            if (i10 == 0) {
                                throw null;
                            }
                            jsonWriter.value(i10 + (-1) != 0 ? "ANDROID" : "UNKNOWN");
                        }
                        String str4 = (String) dVar.f12951e;
                        if (str4 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str4);
                        }
                        Integer num = (Integer) dVar.f12952f;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str5 = (String) r5Var.f7941e;
                    if (str5 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str5);
                    }
                    Boolean bool2 = (Boolean) r5Var.f7942f;
                    if (bool2 != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool2.booleanValue());
                    }
                    Map map = (Map) r5Var.f7943g;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    g2.h hVar = (g2.h) r5Var.f7944h;
                    if (hVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = (Integer) hVar.f13011b;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = (Integer) hVar.f13012e;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d10 = (Double) hVar.f13013f;
                        if (d10 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d10);
                        }
                        List<s> list = (List) hVar.f13014j;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (s sVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = sVar.f15787a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = sVar.f15788b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = sVar.f15789c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = sVar.f15790d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    o5.d dVar2 = (o5.d) r5Var.f7946j;
                    if (dVar2 != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str6 = (String) dVar2.f15721e;
                        if (str6 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str6);
                        }
                        String str7 = (String) dVar2.f15722f;
                        if (str7 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str7);
                        }
                        String str8 = (String) dVar2.f15723j;
                        if (str8 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str8);
                        }
                        jsonWriter.endObject();
                    }
                    m2.l lVar = (m2.l) r5Var.f7947k;
                    if (lVar != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str9 = lVar.f15113b;
                        if (str9 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str9);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = (List) r5Var.f7945i;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            int iOrdinal = ((r) it.next()).ordinal();
                            if (iOrdinal == 0) {
                                str = "DEBUG_PARAM_UNKNOWN";
                            } else if (iOrdinal == 1) {
                                str = "ALWAYS_SHOW";
                            } else if (iOrdinal == 2) {
                                str = "GEO_OVERRIDE_EEA";
                            } else if (iOrdinal == 3) {
                                str = "GEO_OVERRIDE_NON_EEA";
                            } else if (iOrdinal == 4) {
                                str = "PREVIEWING_DEBUG_MESSAGES";
                            }
                            jsonWriter.value(str);
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        String next = new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next();
                        StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 31);
                        sb.append("Http error code - ");
                        sb.append(responseCode);
                        sb.append(".\n");
                        sb.append(next);
                        throw new IOException(sb.toString());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        t tVarK = t.k(new JsonReader(new StringReader(headerField)));
                        tVarK.f14936c = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return tVarK;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            t tVarK2 = t.k(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return tVarK2;
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (SocketTimeoutException e10) {
            throw new f0(4, "The server timed out.", e10);
        } catch (IOException e11) {
            throw new f0(2, "Error making request.", e11);
        }
    }

    public final void j(LinkedHashMap linkedHashMap, le leVar) throws Throwable {
        FileOutputStream fileOutputStream;
        Uri.Builder builderBuildUpon = Uri.parse((String) this.f274t).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (leVar != null) {
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(leVar.f6293b)) {
                sb.append("&it=");
                sb.append(leVar.f6293b);
            }
            if (!TextUtils.isEmpty(leVar.f6294e)) {
                sb.append("&blat=");
                sb.append(leVar.f6294e);
            }
            string = sb.toString();
        }
        if (!((AtomicBoolean) this.f275u).get()) {
            g0 g0Var = i4.k.A.f13348c;
            g0.f((Context) this.f268b, (String) this.f272m, string);
            return;
        }
        File file = (File) this.f276w;
        if (file == null) {
            wr.g("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(string.getBytes());
            fileOutputStream.write(10);
            try {
                fileOutputStream.close();
            } catch (IOException e11) {
                wr.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
            }
        } catch (IOException e12) {
            e = e12;
            fileOutputStream2 = fileOutputStream;
            wr.h("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e13) {
                    wr.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e13);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e14) {
                    wr.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e14);
                }
            }
            throw th;
        }
    }

    public final kw k() {
        dq0.z1((e40) this.f271j, e40.class);
        dq0.z1((v00) this.f272m, v00.class);
        dq0.z1((hi0) this.f273n, hi0.class);
        dq0.z1((kz) this.f274t, kz.class);
        dq0.z1((iy) this.f275u, iy.class);
        dq0.z1((e60) this.f276w, e60.class);
        return new kw((fw) this.f268b, (iy) this.f275u, (e60) this.f276w, new v6.e(7), new nk(), (e40) this.f271j, (v00) this.f272m, new v6.e(3), (hi0) this.f273n, (kz) this.f274t, (bo0) this.f269e, (jn0) this.f270f);
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, b0 b0Var, b0 b0Var2, Object obj7) {
        this.f268b = obj;
        this.f269e = obj2;
        this.f270f = obj3;
        this.f271j = obj4;
        this.f272m = obj5;
        this.f273n = obj6;
        this.f274t = b0Var;
        this.f275u = b0Var2;
        this.f276w = obj7;
    }
}