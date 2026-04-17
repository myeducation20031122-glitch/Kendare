package kc;

import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import okhttp3.HttpUrl;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class e implements Serializable {
    public final byte[] O;
    public final byte[] P;
    public long Q;
    public final boolean S;
    public transient RandomAccessFile b;
    public transient Socket e;
    public transient InputStream f;
    public transient BufferedOutputStream j;
    public String m;
    public final String t;
    public final int u;
    public final int w;
    public long n = 0;
    public long M = -1;
    public long N = -1;
    public boolean R = true;

    public e(RandomAccessFile randomAccessFile, Socket socket, InputStream inputStream, BufferedOutputStream bufferedOutputStream, String str, long j, int i) throws IOException {
        this.b = randomAccessFile;
        this.e = socket;
        this.f = inputStream;
        this.j = bufferedOutputStream;
        this.m = str;
        this.Q = j;
        this.w = i;
        boolean zStartsWith = str.startsWith("http://");
        this.S = zStartsWith;
        this.O = new byte[i];
        this.P = new byte[i];
        if (zStartsWith && randomAccessFile == null) {
            try {
                URL url = new URL(str);
                this.t = url.getHost();
                int port = url.getPort();
                this.u = port;
                if (port < 0) {
                    this.u = 80;
                }
            } catch (MalformedURLException unused) {
                throw new IOException(a0.h.w("Malformed URL '", str, "'"));
            }
        }
    }

    public static int b(String str) {
        try {
            int iIndexOf = str.indexOf(" ");
            int i = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(" ", i);
            if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf >= 8 && iIndexOf + 4 == iIndexOf2) {
                return Integer.parseInt(str.substring(i, iIndexOf2));
            }
        } catch (NumberFormatException unused) {
        }
        return -1;
    }

    public final String a(InputStream inputStream) throws IOException {
        StringBuffer stringBuffer = new StringBuffer(this.w);
        int i = inputStream.read();
        if (i == -1) {
            throw new IOException("No bytes available.");
        }
        while (true) {
            stringBuffer.append((char) i);
            if (inputStream.available() <= 0) {
                return stringBuffer.toString();
            }
            i = inputStream.read();
        }
    }

    public final void c() throws IOException {
        try {
            this.m = HttpUrl.FRAGMENT_ENCODE_SET;
            RandomAccessFile randomAccessFile = this.b;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.b = null;
            Socket socket = this.e;
            if (socket != null) {
                socket.close();
            }
            this.e = null;
            this.f = null;
            this.j = null;
        } catch (IOException e) {
            Socket socket2 = this.e;
            if (socket2 != null) {
                socket2.close();
            }
            this.e = null;
            this.f = null;
            this.j = null;
            throw e;
        }
    }

    public final long d() {
        return this.n;
    }

    public final long e() throws IOException {
        String strA;
        int iB;
        RandomAccessFile randomAccessFile = this.b;
        if (randomAccessFile != null && this.Q < 0) {
            this.Q = randomAccessFile.length();
        }
        if (this.b != null || this.Q >= 0 || !this.S) {
            return this.Q;
        }
        StringBuilder sb2 = new StringBuilder("HEAD ");
        sb2.append(this.m);
        sb2.append(" HTTP/1.1\r\nUser-Agent: swisseph-java-2.01.00_02\r\nHost: ");
        sb2.append(this.t);
        sb2.append(":");
        String strF = r.f(sb2, this.u, "\r\n\r\n");
        int i = 0;
        while (true) {
            try {
                BufferedOutputStream bufferedOutputStream = this.j;
                for (int i2 = 0; i2 < strF.length(); i2++) {
                    bufferedOutputStream.write((byte) strF.charAt(i2));
                }
                bufferedOutputStream.flush();
                strA = a(this.f);
                iB = b(strA);
            } catch (IOException e) {
                i++;
                if (i >= 100) {
                    throw new IOException("(java.net.SocketException) " + e.getMessage());
                }
            }
            if (iB >= 0) {
                int iIndexOf = strA.indexOf("Content-Length:");
                if (iB == 200 && strA.indexOf("Content-Length:") >= 0) {
                    String strSubstring = strA.substring(iIndexOf + 15);
                    return Long.parseLong(strSubstring.substring(0, strSubstring.indexOf("\n")).trim());
                }
                throw new IOException("Can't determine length of (HTTP-)file '" + this.m + "'. HTTP error code: " + iB);
            }
            i++;
            if (i >= 100) {
                throw new IOException("Failed to read a valid / complete header.");
            }
            l();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0147, code lost:
    
        if ((r19.n + r14) != r5) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte f() throws IOException {
        String str;
        String strA;
        int iB;
        int i;
        long j = this.M;
        byte[] bArr = this.O;
        long j2 = 0;
        if (j >= 0) {
            long j3 = this.n;
            if (j3 < j || j3 > this.N) {
                RandomAccessFile randomAccessFile = this.b;
                if (randomAccessFile != null) {
                    randomAccessFile.seek(this.n);
                    RandomAccessFile randomAccessFile2 = this.b;
                    byte[] bArr2 = this.P;
                    int i2 = randomAccessFile2.read(bArr2);
                    if (i2 == -1) {
                        StringBuilder sb2 = new StringBuilder("Filepointer position ");
                        sb2.append(this.n);
                        sb2.append(" exceeds file length by ");
                        throw new EOFException(a0.h.x(sb2, (this.n - e()) + 1, " byte(s)."));
                    }
                    for (int i3 = 0; i3 < i2; i3++) {
                        bArr[i3] = bArr2[i3];
                    }
                    long j4 = this.n;
                    this.M = j4;
                    this.N = (j4 + i2) - 1;
                } else {
                    if (this.n >= e()) {
                        StringBuilder sb3 = new StringBuilder("Filepointer position ");
                        sb3.append(this.n);
                        sb3.append(" exceeds file length by ");
                        throw new EOFException(a0.h.x(sb3, (this.n - e()) + 1, " byte(s)."));
                    }
                    if (this.S) {
                        StringBuilder sb4 = new StringBuilder("GET ");
                        sb4.append(this.m);
                        sb4.append(" HTTP/1.1\r\nUser-Agent: swisseph-java-2.01.00_02\r\nHost: ");
                        sb4.append(this.t);
                        sb4.append(":");
                        sb4.append(this.u);
                        sb4.append("\r\nRange: bytes=");
                        sb4.append(this.n);
                        sb4.append("-");
                        long jE = e() - 1;
                        long j5 = this.n;
                        int i4 = this.w;
                        String str2 = " byte(s).";
                        String strX = a0.h.x(sb4, Math.min(jE, (j5 + i4) - 1), "\r\n\r\n");
                        int i5 = 0;
                        while (true) {
                            try {
                                BufferedOutputStream bufferedOutputStream = this.j;
                                for (int i6 = 0; i6 < strX.length(); i6++) {
                                    bufferedOutputStream.write((byte) strX.charAt(i6));
                                }
                                bufferedOutputStream.flush();
                                strA = a(this.f);
                                iB = b(strA);
                            } catch (IOException e) {
                                str = str2;
                                i5++;
                                if (i5 >= 100) {
                                    throw new IOException("(java.net.SocketException) " + e.getMessage());
                                }
                                l();
                            }
                            if (iB < 0) {
                                i5++;
                                if (i5 >= 100) {
                                    throw new IOException("Failed to read successfully from address\n'" + this.m + "'. The http reply from the server was " + strA.length() + " bytes long and it's content is:\n\n" + strA);
                                }
                            } else {
                                int iIndexOf = strA.indexOf("\r\n\r\n");
                                String strSubstring = iIndexOf >= 0 ? strA.substring(iIndexOf + 4) : HttpUrl.FRAGMENT_ENCODE_SET;
                                int length = strSubstring.length();
                                if ((iB == 200 || iB == 206) && length <= i4) {
                                    if (length < i4) {
                                        long j6 = this.Q;
                                        if (j6 >= j2) {
                                            i = iB;
                                        }
                                    }
                                    if (length == 0) {
                                        i5++;
                                        if (i5 >= 100) {
                                            StringBuilder sb5 = new StringBuilder("Filepointer position ");
                                            sb5.append(this.n);
                                            sb5.append(" exceeds file length by ");
                                            throw new EOFException(a0.h.x(sb5, (this.n - e()) + 1, str2));
                                        }
                                        j2 = 0;
                                    } else {
                                        long j7 = this.n;
                                        this.M = j7;
                                        this.N = (j7 + length) - 1;
                                        for (int i7 = 0; i7 < length; i7++) {
                                            bArr[i7] = (byte) strSubstring.charAt(i7);
                                        }
                                    }
                                } else {
                                    i = iB;
                                }
                                str = str2;
                                i5++;
                                if (i5 >= 100) {
                                    throw new IOException(r.f(a0.h.z("HTTP read failed with HTTP response ", i, ". Read ", length, " bytes, requested "), i4, " bytes."));
                                }
                                str2 = str;
                                j2 = 0;
                            }
                        }
                    }
                }
            }
        }
        long j8 = this.n;
        this.n = 1 + j8;
        return bArr[(int) (j8 - this.M)];
    }

    public final double g() {
        return Double.longBitsToDouble(this.R ? (k() << 56) + (k() << 48) + (k() << 40) + (k() << 32) + (k() << 24) + (k() << 16) + (k() << 8) + k() : k() + (k() << 8) + (k() << 16) + (k() << 24) + (k() << 32) + (k() << 40) + (k() << 48) + (k() << 56));
    }

    public final int h() {
        if (!this.R) {
            return k() + (k() << 8) + (k() << 16) + (f() << 24);
        }
        return k() + (f() << 24) + (k() << 16) + (k() << 8);
    }

    public final String i() throws EOFException {
        char cK;
        StringBuffer stringBuffer = new StringBuffer(200);
        while (true) {
            try {
                cK = (char) k();
                if (cK == '\n') {
                    break;
                }
                stringBuffer.append(cK);
            } catch (EOFException e) {
                if (stringBuffer.length() == 0) {
                    throw e;
                }
            }
        }
        stringBuffer.append(cK);
        return stringBuffer.toString();
    }

    public final short j() {
        if (!this.R) {
            return (short) (k() + (f() << 8));
        }
        return (short) (k() + (f() << 8));
    }

    public final int k() {
        return f() & 255;
    }

    public final void l() throws IOException {
        System.err.println("reconnecting...");
        this.e.close();
        Socket socket = new Socket(this.t, this.u);
        this.e = socket;
        socket.setSoTimeout(5000);
        this.f = this.e.getInputStream();
        this.j = new BufferedOutputStream(this.e.getOutputStream());
    }

    public final void m(long j) {
        this.n = j;
    }
}