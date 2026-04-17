package l8;

import a0.h;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import fc.t;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f14671d = Pattern.compile("[0-9]+s");

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f14672e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Context f14673a;

    /* renamed from: b, reason: collision with root package name */
    public final i8.c f14674b;

    /* renamed from: c, reason: collision with root package name */
    public final e f14675c = new e();

    public c(Context context, i8.c cVar) {
        this.f14673a = context;
        this.f14674b = cVar;
    }

    public static URL a(String str) throws j8.e {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e10) {
            throw new j8.e(e10.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f14672e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        objArr[2] = TextUtils.isEmpty(str) ? "" : h.v(", ", str);
        Log.w("Firebase-Installations", String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr));
    }

    public static long d(String str) {
        t.b("Invalid Expiration Timestamp.", f14671d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static a e(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f14672e));
        o5.d dVarA = b.a();
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        b bVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                strNextString3 = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        dVarA.f15721e = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        dVarA.f15722f = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                b bVarH = dVarA.h();
                jsonReader.endObject();
                bVar = bVarH;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(strNextString, strNextString2, strNextString3, bVar, d.f14676b);
    }

    public static b f(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f14672e));
        o5.d dVarA = b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                dVarA.f15721e = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                dVarA.f15722f = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        dVarA.f15723j = f.f14684b;
        return dVarA.h();
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.1");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007a A[Catch: NameNotFoundException -> 0x00b5, TryCatch #1 {NameNotFoundException -> 0x00b5, blocks: (B:15:0x0068, B:17:0x007a, B:23:0x0084, B:29:0x0091, B:32:0x00a1, B:35:0x00b7, B:37:0x00c1, B:38:0x00da), top: B:46:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1 A[Catch: NameNotFoundException -> 0x00b5, TryCatch #1 {NameNotFoundException -> 0x00b5, blocks: (B:15:0x0068, B:17:0x007a, B:23:0x0084, B:29:0x0091, B:32:0x00a1, B:35:0x00b7, B:37:0x00c1, B:38:0x00da), top: B:46:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7 A[Catch: NameNotFoundException -> 0x00b5, TryCatch #1 {NameNotFoundException -> 0x00b5, blocks: (B:15:0x0068, B:17:0x007a, B:23:0x0084, B:29:0x0091, B:32:0x00a1, B:35:0x00b7, B:37:0x00c1, B:38:0x00da), top: B:46:0x0068 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection c(URL url, String str) throws j8.e, NoSuchAlgorithmException {
        Signature[] signatureArr;
        byte[] bArrDigest;
        MessageDigest messageDigest;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.f14673a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            g8.f fVar = (g8.f) this.f14674b.get();
            if (fVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) j4.a(((g8.d) fVar).b()));
                } catch (InterruptedException e10) {
                    e = e10;
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                    String string = null;
                    PackageInfo packageInfoG = g5.b.a(context).g(64, context.getPackageName());
                    signatureArr = packageInfoG.signatures;
                    if (signatureArr == null) {
                        bArrDigest = null;
                        if (bArrDigest == null) {
                        }
                    }
                    httpURLConnection.addRequestProperty("X-Android-Cert", string);
                    httpURLConnection.addRequestProperty("x-goog-api-key", str);
                    return httpURLConnection;
                } catch (ExecutionException e11) {
                    e = e11;
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                    String string2 = null;
                    PackageInfo packageInfoG2 = g5.b.a(context).g(64, context.getPackageName());
                    signatureArr = packageInfoG2.signatures;
                    if (signatureArr == null) {
                    }
                    httpURLConnection.addRequestProperty("X-Android-Cert", string2);
                    httpURLConnection.addRequestProperty("x-goog-api-key", str);
                    return httpURLConnection;
                }
            }
            String string22 = null;
            try {
                PackageInfo packageInfoG22 = g5.b.a(context).g(64, context.getPackageName());
                signatureArr = packageInfoG22.signatures;
                if (signatureArr == null || signatureArr.length != 1) {
                    bArrDigest = null;
                    if (bArrDigest == null) {
                        Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                    } else {
                        int length = bArrDigest.length;
                        StringBuilder sb = new StringBuilder(length + length);
                        for (int i10 = 0; i10 < length; i10++) {
                            char[] cArr = e5.c.f12526a;
                            sb.append(cArr[(bArrDigest[i10] & 240) >>> 4]);
                            sb.append(cArr[bArrDigest[i10] & 15]);
                        }
                        string22 = sb.toString();
                    }
                } else {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= 2) {
                            messageDigest = null;
                            break;
                        }
                        try {
                            messageDigest = MessageDigest.getInstance("SHA1");
                        } catch (NoSuchAlgorithmException unused) {
                        }
                        if (messageDigest != null) {
                            break;
                        }
                        i11++;
                    }
                    if (messageDigest != null) {
                        bArrDigest = messageDigest.digest(packageInfoG22.signatures[0].toByteArray());
                    }
                    if (bArrDigest == null) {
                    }
                }
            } catch (PackageManager.NameNotFoundException e12) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e12);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", string22);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused2) {
            throw new j8.e("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}