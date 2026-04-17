package com.onesignal;

import android.net.TrafficStats;
import android.os.Build;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Thread[] f11976b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f11978f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ JSONObject f11979j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q3 f11980m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f11981n;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f11982t;

    public m4(Thread[] threadArr, String str, String str2, JSONObject jSONObject, q3 q3Var, int i10, String str3) {
        this.f11976b = threadArr;
        this.f11977e = str;
        this.f11978f = str2;
        this.f11979j = jSONObject;
        this.f11980m = q3Var;
        this.f11981n = i10;
        this.f11982t = str3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|2|(1:4)|5|(10:150|6|7|(3:148|9|(1:11))|12|16|17|(1:19)|(1:21)|22)|(6:158|24|(4:26|(2:28|(5:30|31|146|32|36)(1:33))(1:34)|35|36)(0)|109|134|135)(1:42)|43|(1:47)|48|139|49|50|154|51|52|(13:86|144|87|88|142|89|(1:91)|92|95|(1:97)(1:98)|99|(1:103)|(3:105|81|108)(3:106|107|108))(5:56|141|(6:156|58|(1:60)|(3:64|(1:66)(1:67)|68)(1:69)|(0)(3:72|73|74)|108)(6:75|(1:77)(1:78)|79|(1:82)|81|108)|71|108)|109|134|135|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(29:0|2|(1:4)|5|150|6|7|(3:148|9|(1:11))|12|16|17|(1:19)|(1:21)|22|(6:158|24|(4:26|(2:28|(5:30|31|146|32|36)(1:33))(1:34)|35|36)(0)|109|134|135)(1:42)|43|(1:47)|48|139|49|50|154|51|52|(13:86|144|87|88|142|89|(1:91)|92|95|(1:97)(1:98)|99|(1:103)|(3:105|81|108)(3:106|107|108))(5:56|141|(6:156|58|(1:60)|(3:64|(1:66)(1:67)|68)(1:69)|(0)(3:72|73|74)|108)(6:75|(1:77)(1:78)|79|(1:82)|81|108)|71|108)|109|134|135|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02eb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02ec, code lost:
    
        r9 = r21;
        r21 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02f1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02f2, code lost:
    
        r9 = r21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02e0 A[PHI: r7 r14
      0x02e0: PHI (r7v2 java.lang.Thread) = 
      (r7v5 java.lang.Thread)
      (r7v8 java.lang.Thread)
      (r7v10 java.lang.Thread)
      (r7v12 java.lang.Thread)
      (r7v13 java.lang.Thread)
     binds: [B:132:0x0344, B:107:0x02df, B:81:0x022f, B:74:0x01f1, B:71:0x01e5] A[DONT_GENERATE, DONT_INLINE]
      0x02e0: PHI (r14v2 java.net.HttpURLConnection) = 
      (r14v3 java.net.HttpURLConnection)
      (r14v7 java.net.HttpURLConnection)
      (r14v7 java.net.HttpURLConnection)
      (r14v7 java.net.HttpURLConnection)
      (r14v7 java.net.HttpURLConnection)
     binds: [B:132:0x0344, B:107:0x02df, B:81:0x022f, B:74:0x01f1, B:71:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ff A[Catch: all -> 0x031a, TryCatch #7 {all -> 0x031a, blocks: (B:119:0x02fb, B:121:0x02ff, B:124:0x0304, B:130:0x0336, B:127:0x031e), top: B:152:0x02fb }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x031e A[Catch: all -> 0x031a, TryCatch #7 {all -> 0x031a, blocks: (B:119:0x02fb, B:121:0x02ff, B:124:0x0304, B:130:0x0336, B:127:0x031e), top: B:152:0x02fb }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0336 A[Catch: all -> 0x031a, TRY_LEAVE, TryCatch #7 {all -> 0x031a, blocks: (B:119:0x02fb, B:121:0x02ff, B:124:0x0304, B:130:0x0336, B:127:0x031e), top: B:152:0x02fb }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int responseCode;
        HttpURLConnection httpURLConnection;
        Thread thread;
        ?? r52;
        y3 y3Var;
        JSONObject jSONObject;
        String str;
        String str2;
        String strReplaceAll;
        String next;
        String headerField;
        ?? thread2;
        String next2;
        String strE;
        String str3 = this.f11977e;
        String str4 = this.f11978f;
        q3 q3Var = this.f11980m;
        int i10 = this.f11981n;
        y3 y3Var2 = y3.f12231j;
        String str5 = "OneSignalRestClient: Failed request to: https://api.onesignal.com/";
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            TrafficStats.setThreadStatsTag(10000);
        }
        try {
            y3Var = y3.f12233n;
            z3.b(y3Var, "OneSignalRestClient: Making request to: https://api.onesignal.com/" + str3, null);
            httpURLConnection = (HttpURLConnection) new URL("https://api.onesignal.com/" + str3).openConnection();
            if (i11 < 22) {
                try {
                    if (httpURLConnection instanceof HttpsURLConnection) {
                        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
                        SSLSocketFactory sSLSocketFactory = httpsURLConnection.getSSLSocketFactory();
                        x4 x4Var = new x4();
                        x4Var.f12223a = sSLSocketFactory;
                        httpsURLConnection.setSSLSocketFactory(x4Var);
                    }
                } catch (Throwable th) {
                    th = th;
                    str5 = "OS_REST_FAILURE_CALLBACK";
                    responseCode = -1;
                    try {
                        if (th instanceof ConnectException) {
                        }
                        this.f11976b[0] = thread;
                    } catch (Throwable th2) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th2;
                    }
                }
            }
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setReadTimeout(i10);
            httpURLConnection.setRequestProperty("SDK-Version", "onesignal/android/040812");
            httpURLConnection.setRequestProperty("Accept", "application/vnd.onesignal.v1+json");
            jSONObject = this.f11979j;
            if (jSONObject != null) {
                httpURLConnection.setDoInput(true);
            }
            if (str4 != null) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                httpURLConnection.setRequestMethod(str4);
                httpURLConnection.setDoOutput(true);
            }
        } catch (Throwable th3) {
            th = th3;
            str5 = "OS_REST_FAILURE_CALLBACK";
            responseCode = -1;
            httpURLConnection = null;
        }
        if (jSONObject != null) {
            try {
                String string = jSONObject.toString();
                if (jSONObject.has("external_user_id")) {
                    Matcher matcher = Pattern.compile("(?<=\"external_user_id\":\").*?(?=\")").matcher(string);
                    if (matcher.find()) {
                        str2 = string;
                        String strGroup = matcher.group(0);
                        if (strGroup != null) {
                            str = "OS_REST_FAILURE_CALLBACK";
                            try {
                                strReplaceAll = matcher.replaceAll(Matcher.quoteReplacement(strGroup.replace("\\/", "/")));
                                z3.b(y3Var, "OneSignalRestClient: " + str4 + " SEND JSON: " + strReplaceAll, null);
                                byte[] bytes = strReplaceAll.getBytes("UTF-8");
                                httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                                httpURLConnection.getOutputStream().write(bytes);
                            } catch (Throwable th4) {
                                th = th4;
                                str5 = str;
                                responseCode = -1;
                                if (th instanceof ConnectException) {
                                }
                                this.f11976b[0] = thread;
                            }
                        } else {
                            str = "OS_REST_FAILURE_CALLBACK";
                        }
                    } else {
                        str = "OS_REST_FAILURE_CALLBACK";
                        str2 = string;
                    }
                    strReplaceAll = str2;
                    z3.b(y3Var, "OneSignalRestClient: " + str4 + " SEND JSON: " + strReplaceAll, null);
                    byte[] bytes2 = strReplaceAll.getBytes("UTF-8");
                    httpURLConnection.setFixedLengthStreamingMode(bytes2.length);
                    httpURLConnection.getOutputStream().write(bytes2);
                }
            } catch (Throwable th5) {
                th = th5;
                str = "OS_REST_FAILURE_CALLBACK";
                str5 = str;
                responseCode = -1;
                if (th instanceof ConnectException) {
                }
                this.f11976b[0] = thread;
            }
            this.f11976b[0] = thread;
        }
        str = "OS_REST_FAILURE_CALLBACK";
        String str6 = this.f11982t;
        if (str6 != null && (strE = h4.e(h4.f11856a, "PREFS_OS_ETAG_PREFIX_".concat(str6), null)) != null) {
            httpURLConnection.setRequestProperty("if-none-match", strE);
            z3.b(y3Var, "OneSignalRestClient: Adding header if-none-match: ".concat(strE), null);
        }
        responseCode = httpURLConnection.getResponseCode();
        z3.b(y3.f12234t, "OneSignalRestClient: After con.getResponseCode to: https://api.onesignal.com/" + str3, null);
        if (responseCode == 200 || responseCode == 202) {
            str5 = str;
            try {
                int i12 = responseCode;
                try {
                    z3.b(y3Var, "OneSignalRestClient: Successfully finished request to: https://api.onesignal.com/" + str3, null);
                    Scanner scanner = new Scanner(httpURLConnection.getInputStream(), "UTF-8");
                    next = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                    scanner.close();
                    StringBuilder sb = new StringBuilder("OneSignalRestClient: ");
                    sb.append(str4 == null ? "GET" : str4);
                    sb.append(" RECEIVED JSON: ");
                    sb.append(next);
                    z3.b(y3Var, sb.toString(), null);
                    if (str6 != null && (headerField = httpURLConnection.getHeaderField("etag")) != null) {
                        z3.b(y3Var, "OneSignalRestClient: Response has etag of " + headerField + " so caching the response.", null);
                        String str7 = h4.f11856a;
                        h4.g(headerField, str7, "PREFS_OS_ETAG_PREFIX_".concat(str6));
                        h4.g(next, str7, "PREFS_OS_HTTP_CACHE_PREFIX_".concat(str6));
                    }
                } catch (Throwable th6) {
                    th = th6;
                    responseCode = i12;
                    if (!(th instanceof ConnectException) || (th instanceof UnknownHostException)) {
                        r52 = 0;
                        z3.b(y3.f12232m, "OneSignalRestClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null);
                    } else {
                        z3.b(y3Var2, "OneSignalRestClient: " + str4 + " Error thrown from network stack. ", th);
                        r52 = 0;
                    }
                    if (q3Var != null) {
                        thread = r52;
                    } else {
                        Thread thread3 = new Thread(new n4(q3Var, responseCode, r52, th), str5);
                        OSUtils.v(thread3);
                        thread = thread3;
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.f11976b[0] = thread;
                }
            } catch (Throwable th7) {
                th = th7;
                if (th instanceof ConnectException) {
                    r52 = 0;
                    z3.b(y3.f12232m, "OneSignalRestClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null);
                    if (q3Var != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                }
                this.f11976b[0] = thread;
            }
            if (q3Var == null) {
                thread = null;
                httpURLConnection.disconnect();
            } else {
                Thread thread4 = new Thread(new o1(q3Var, next, 9), "OS_REST_SUCCESS_CALLBACK");
                OSUtils.v(thread4);
                thread = thread4;
                httpURLConnection.disconnect();
            }
        } else {
            try {
            } catch (Throwable th8) {
                th = th8;
            }
            if (responseCode != 304) {
                try {
                    z3.b(y3Var, "OneSignalRestClient: Failed request to: https://api.onesignal.com/" + str3, null);
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream == null) {
                        errorStream = httpURLConnection.getInputStream();
                    }
                    if (errorStream != null) {
                        Scanner scanner2 = new Scanner(errorStream, "UTF-8");
                        next2 = scanner2.useDelimiter("\\A").hasNext() ? scanner2.next() : "";
                        scanner2.close();
                        z3.b(y3Var2, "OneSignalRestClient: " + str4 + " RECEIVED JSON: " + next2, null);
                        thread2 = 0;
                    } else {
                        thread2 = 0;
                        z3.b(y3Var2, "OneSignalRestClient: " + str4 + " HTTP Code: " + responseCode + " No response body!", null);
                        next2 = null;
                    }
                    if (q3Var != null) {
                        Thread thread5 = new Thread(new n4(q3Var, responseCode, next2, thread2), str);
                        OSUtils.v(thread5);
                        thread = thread5;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    str5 = str;
                    if (th instanceof ConnectException) {
                    }
                    this.f11976b[0] = thread;
                }
                httpURLConnection.disconnect();
            } else {
                String strE2 = h4.e(h4.f11856a, "PREFS_OS_HTTP_CACHE_PREFIX_" + str6, null);
                StringBuilder sb2 = new StringBuilder("OneSignalRestClient: ");
                sb2.append(str4 == null ? "GET" : str4);
                sb2.append(" - Using Cached response due to 304: ");
                sb2.append(strE2);
                z3.b(y3Var, sb2.toString(), null);
                if (q3Var != null) {
                    thread2 = new Thread(new o1(q3Var, strE2, 9), "OS_REST_SUCCESS_CALLBACK");
                    OSUtils.v(thread2);
                }
                thread = null;
                httpURLConnection.disconnect();
            }
            thread = thread2;
            httpURLConnection.disconnect();
        }
        this.f11976b[0] = thread;
    }
}