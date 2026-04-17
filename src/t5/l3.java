package t5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final URL f17479b;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f17480e;

    /* renamed from: f, reason: collision with root package name */
    public final k3 f17481f;

    /* renamed from: j, reason: collision with root package name */
    public final String f17482j;

    /* renamed from: m, reason: collision with root package name */
    public final Map f17483m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n3 f17484n;

    public l3(n3 n3Var, String str, URL url, byte[] bArr, t.b bVar, k3 k3Var) {
        this.f17484n = n3Var;
        fc.t.g(str);
        this.f17479b = url;
        this.f17480e = bArr;
        this.f17481f = k3Var;
        this.f17482j = str;
        this.f17483m = bVar;
    }

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0112: MOVE (r14 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:275), block:B:55:0x0111 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0116: MOVE (r14 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:279), block:B:56:0x0114 */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException e10;
        Map map2;
        int i10;
        androidx.fragment.app.m1 m1Var;
        a4 a4Var;
        IOException iOException;
        int i11;
        URLConnection uRLConnectionOpenConnection;
        int responseCode;
        Map map3;
        Map map4;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        String str = this.f17482j;
        n3 n3Var = this.f17484n;
        a4 a4Var2 = ((b4) n3Var.f15046b).M;
        b4.i(a4Var2);
        a4Var2.s();
        OutputStream outputStream = null;
        try {
            uRLConnectionOpenConnection = this.f17479b.openConnection();
        } catch (IOException e11) {
            e10 = e11;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
            map = null;
        }
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain HTTP connection");
        }
        httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setDefaultUseCaches(false);
        ((b4) n3Var.f15046b).getClass();
        httpURLConnection.setConnectTimeout(60000);
        ((b4) n3Var.f15046b).getClass();
        httpURLConnection.setReadTimeout(61000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setDoInput(true);
        try {
            Map map5 = this.f17483m;
            if (map5 != null) {
                for (Map.Entry entry : map5.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            byte[] bArr = this.f17480e;
            if (bArr != null) {
                n3 n3Var2 = n3Var.f17607e.f17673t;
                w5.F(n3Var2);
                byte[] bArrT = n3Var2.T(bArr);
                i3 i3Var = ((b4) n3Var.f15046b).f17251w;
                b4.i(i3Var);
                g3 g3Var = i3Var.Q;
                int length = bArrT.length;
                g3Var.b(Integer.valueOf(length), "Uploading data. size");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setFixedLengthStreamingMode(length);
                httpURLConnection.connect();
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                try {
                    outputStream2.write(bArrT);
                    outputStream2.close();
                } catch (IOException e12) {
                    e10 = e12;
                    map2 = null;
                    outputStream = outputStream2;
                    iOException = e10;
                    i11 = 0;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    a4Var = ((b4) n3Var.f15046b).M;
                    b4.i(a4Var);
                    m1Var = new androidx.fragment.app.m1(this.f17482j, this.f17481f, i11, iOException, null, map2);
                    a4Var.x(m1Var);
                } catch (Throwable th3) {
                    th = th3;
                    map = null;
                    outputStream = outputStream2;
                    i10 = 0;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    a4 a4Var3 = ((b4) n3Var.f15046b).M;
                    b4.i(a4Var3);
                    a4Var3.x(new androidx.fragment.app.m1(this.f17482j, this.f17481f, i10, null, null, map));
                    throw th;
                }
            }
            responseCode = httpURLConnection.getResponseCode();
        } catch (IOException e13) {
            map2 = null;
            iOException = e13;
            i11 = 0;
            if (outputStream != null) {
            }
            if (httpURLConnection != null) {
            }
            a4Var = ((b4) n3Var.f15046b).M;
            b4.i(a4Var);
            m1Var = new androidx.fragment.app.m1(this.f17482j, this.f17481f, i11, iOException, null, map2);
            a4Var.x(m1Var);
        } catch (Throwable th4) {
            map = null;
            th = th4;
        }
        try {
            try {
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    inputStream = httpURLConnection.getInputStream();
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = null;
                }
                try {
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int i12 = inputStream.read(bArr2);
                        if (i12 <= 0) {
                            break;
                        } else {
                            byteArrayOutputStream.write(bArr2, 0, i12);
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    httpURLConnection.disconnect();
                    a4Var = ((b4) n3Var.f15046b).M;
                    b4.i(a4Var);
                    m1Var = new androidx.fragment.app.m1(this.f17482j, this.f17481f, responseCode, null, byteArray, headerFields);
                } catch (Throwable th6) {
                    th = th6;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e14) {
                iOException = e14;
                i11 = responseCode;
                map2 = map4;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e15) {
                        i3 i3Var2 = ((b4) n3Var.f15046b).f17251w;
                        b4.i(i3Var2);
                        i3Var2.f17397n.c(i3.y(str), "Error closing HTTP compressed POST connection output stream. appId", e15);
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                a4Var = ((b4) n3Var.f15046b).M;
                b4.i(a4Var);
                m1Var = new androidx.fragment.app.m1(this.f17482j, this.f17481f, i11, iOException, null, map2);
                a4Var.x(m1Var);
            } catch (Throwable th7) {
                th = th7;
                i10 = responseCode;
                map = map3;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e16) {
                        i3 i3Var3 = ((b4) n3Var.f15046b).f17251w;
                        b4.i(i3Var3);
                        i3Var3.f17397n.c(i3.y(str), "Error closing HTTP compressed POST connection output stream. appId", e16);
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                a4 a4Var32 = ((b4) n3Var.f15046b).M;
                b4.i(a4Var32);
                a4Var32.x(new androidx.fragment.app.m1(this.f17482j, this.f17481f, i10, null, null, map));
                throw th;
            }
        } catch (IOException e17) {
            map2 = null;
            iOException = e17;
            i11 = responseCode;
            if (outputStream != null) {
            }
            if (httpURLConnection != null) {
            }
            a4Var = ((b4) n3Var.f15046b).M;
            b4.i(a4Var);
            m1Var = new androidx.fragment.app.m1(this.f17482j, this.f17481f, i11, iOException, null, map2);
            a4Var.x(m1Var);
        } catch (Throwable th8) {
            th = th8;
            map = null;
            i10 = responseCode;
            if (outputStream != null) {
            }
            if (httpURLConnection != null) {
            }
            a4 a4Var322 = ((b4) n3Var.f15046b).M;
            b4.i(a4Var322);
            a4Var322.x(new androidx.fragment.app.m1(this.f17482j, this.f17481f, i10, null, null, map));
            throw th;
        }
        a4Var.x(m1Var);
    }
}