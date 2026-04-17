package y8;

import a0.h;
import com.google.android.gms.internal.ads.ic1;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import kc.r;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class a implements Closeable {
    public int M;
    public String N;
    public int[] O;
    public String[] Q;
    public int[] R;

    /* renamed from: b, reason: collision with root package name */
    public final Reader f19402b;

    /* renamed from: w, reason: collision with root package name */
    public long f19410w;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19403e = false;

    /* renamed from: f, reason: collision with root package name */
    public final char[] f19404f = new char[1024];

    /* renamed from: j, reason: collision with root package name */
    public int f19405j = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f19406m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f19407n = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f19408t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f19409u = 0;
    public int P = 1;

    static {
        q6.b.f16252e = new q6.b();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.O = iArr;
        iArr[0] = 6;
        this.Q = new String[32];
        this.R = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f19402b = reader;
    }

    public final void A() {
        char c10;
        do {
            if (this.f19405j >= this.f19406m && !g(1)) {
                return;
            }
            int i10 = this.f19405j;
            int i11 = i10 + 1;
            this.f19405j = i11;
            c10 = this.f19404f[i10];
            if (c10 == '\n') {
                this.f19407n++;
                this.f19408t = i11;
                return;
            }
        } while (c10 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B() throws c {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f19405j;
                if (i11 + i10 < this.f19406m) {
                    char c10 = this.f19404f[i11 + i10];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i10++;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.f19405j = i11 + i10;
                }
            }
            this.f19405j += i10;
            return;
        } while (g(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void C() throws IOException {
        int i10 = 0;
        do {
            int iD = this.f19409u;
            if (iD == 0) {
                iD = d();
            }
            switch (iD) {
                case QueueFuseable.SYNC /* 1 */:
                    x(3);
                    i10++;
                    this.f19409u = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.Q[this.P - 1] = null;
                    }
                    this.P--;
                    i10--;
                    this.f19409u = 0;
                    break;
                case 3:
                    x(1);
                    i10++;
                    this.f19409u = 0;
                    break;
                case 4:
                    this.P--;
                    i10--;
                    this.f19409u = 0;
                    break;
                case g.INVALID_ACCOUNT /* 5 */:
                case g.RESOLUTION_REQUIRED /* 6 */:
                case g.NETWORK_ERROR /* 7 */:
                case 11:
                case g.TIMEOUT /* 15 */:
                default:
                    this.f19409u = 0;
                    break;
                case 8:
                    z('\'');
                    this.f19409u = 0;
                    break;
                case 9:
                    z('\"');
                    this.f19409u = 0;
                    break;
                case g.DEVELOPER_ERROR /* 10 */:
                    B();
                    this.f19409u = 0;
                    break;
                case 12:
                    z('\'');
                    if (i10 == 0) {
                        this.Q[this.P - 1] = "<skipped>";
                    }
                    this.f19409u = 0;
                    break;
                case g.ERROR /* 13 */:
                    z('\"');
                    if (i10 == 0) {
                        this.Q[this.P - 1] = "<skipped>";
                    }
                    this.f19409u = 0;
                    break;
                case g.INTERRUPTED /* 14 */:
                    B();
                    if (i10 == 0) {
                        this.Q[this.P - 1] = "<skipped>";
                    }
                    this.f19409u = 0;
                    break;
                case g.CANCELED /* 16 */:
                    this.f19405j += this.M;
                    this.f19409u = 0;
                    break;
                case g.API_NOT_CONNECTED /* 17 */:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.R;
        int i11 = this.P - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final void D(String str) throws c {
        StringBuilder sbN = ic1.n(str);
        sbN.append(l());
        throw new c(sbN.toString());
    }

    public final void a() {
        int iD = this.f19409u;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 3) {
            x(1);
            this.R[this.P - 1] = 0;
            this.f19409u = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + r.t(w()) + l());
        }
    }

    public final void b() throws IOException {
        int iD = this.f19409u;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 1) {
            x(3);
            this.f19409u = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + r.t(w()) + l());
        }
    }

    public final void c() throws c {
        if (this.f19403e) {
            return;
        }
        D("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f19409u = 0;
        this.O[0] = 8;
        this.P = 1;
        this.f19402b.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0213, code lost:
    
        if (k(r1) != false) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0279 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d() throws IOException {
        int i10;
        int i11;
        int iR;
        int iR2;
        int i12;
        String str;
        String str2;
        int i13;
        char c10;
        char c11;
        int i14;
        int i15;
        int[] iArr = this.O;
        boolean z7 = true;
        int i16 = this.P - 1;
        int i17 = iArr[i16];
        char[] cArr = this.f19404f;
        if (i17 == 1) {
            iArr[i16] = 2;
        } else {
            if (i17 != 2) {
                if (i17 == 3 || i17 == 5) {
                    iArr[i16] = 4;
                    if (i17 == 5 && (iR = r(true)) != 44) {
                        if (iR == 59) {
                            c();
                        } else {
                            if (iR != 125) {
                                D("Unterminated object");
                                throw null;
                            }
                            i10 = 2;
                        }
                    }
                    int iR3 = r(true);
                    if (iR3 == 34) {
                        i10 = 13;
                    } else if (iR3 == 39) {
                        c();
                        i10 = 12;
                    } else {
                        if (iR3 == 125) {
                            if (i17 == 5) {
                                D("Expected name");
                                throw null;
                            }
                            i11 = 2;
                            this.f19409u = i11;
                            return i11;
                        }
                        c();
                        this.f19405j--;
                        if (!k((char) iR3)) {
                            D("Expected name");
                            throw null;
                        }
                        i10 = 14;
                    }
                } else if (i17 == 4) {
                    iArr[i16] = 5;
                    int iR4 = r(true);
                    if (iR4 != 58) {
                        if (iR4 != 61) {
                            D("Expected ':'");
                            throw null;
                        }
                        c();
                        if (this.f19405j < this.f19406m || g(1)) {
                            int i18 = this.f19405j;
                            if (cArr[i18] == '>') {
                                this.f19405j = i18 + 1;
                            }
                        }
                    }
                } else if (i17 == 6) {
                    if (this.f19403e) {
                        r(true);
                        int i19 = this.f19405j;
                        this.f19405j = i19 - 1;
                        if (i19 + 4 <= this.f19406m || g(5)) {
                            int i20 = this.f19405j;
                            if (cArr[i20] == ')' && cArr[i20 + 1] == ']' && cArr[i20 + 2] == '}' && cArr[i20 + 3] == '\'' && cArr[i20 + 4] == '\n') {
                                this.f19405j = i20 + 5;
                            }
                        }
                    }
                    this.O[this.P - 1] = 7;
                } else {
                    if (i17 == 7) {
                        if (r(false) == -1) {
                            i10 = 17;
                        } else {
                            c();
                            this.f19405j--;
                        }
                    } else if (i17 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    iR2 = r(true);
                    if (iR2 != 34) {
                        i10 = 9;
                    } else if (iR2 != 39) {
                        if (iR2 == 44 || iR2 == 59) {
                            i12 = 1;
                        } else {
                            if (iR2 == 91) {
                                this.f19409u = 3;
                                return 3;
                            }
                            if (iR2 == 93) {
                                i12 = 1;
                                if (i17 == 1) {
                                    i11 = 4;
                                    this.f19409u = i11;
                                    return i11;
                                }
                            } else if (iR2 != 123) {
                                int i21 = this.f19405j - 1;
                                this.f19405j = i21;
                                char c12 = cArr[i21];
                                if (c12 == 't' || c12 == 'T') {
                                    str = "true";
                                    str2 = "TRUE";
                                    i13 = 5;
                                } else if (c12 == 'f' || c12 == 'F') {
                                    str = "false";
                                    str2 = "FALSE";
                                    i13 = 6;
                                } else {
                                    if (c12 == 'n' || c12 == 'N') {
                                        str = "null";
                                        str2 = "NULL";
                                        i13 = 7;
                                    }
                                    i13 = 0;
                                    if (i13 == 0) {
                                        return i13;
                                    }
                                    int i22 = this.f19405j;
                                    int i23 = this.f19406m;
                                    long j10 = 0;
                                    char c13 = 0;
                                    int i24 = 0;
                                    boolean z10 = true;
                                    boolean z11 = false;
                                    while (true) {
                                        if (i22 + i24 == i23) {
                                            if (i24 == cArr.length) {
                                                break;
                                            }
                                            if (!g(i24 + 1)) {
                                                break;
                                            }
                                            int i25 = this.f19405j;
                                            i23 = this.f19406m;
                                            i22 = i25;
                                            c11 = cArr[i22 + i24];
                                            if (c11 == '+') {
                                            }
                                        } else {
                                            c11 = cArr[i22 + i24];
                                            if (c11 == '+') {
                                                if (c11 == 'E' || c11 == 'e') {
                                                    i14 = i23;
                                                    if (c13 != 2 && c13 != 4) {
                                                        break;
                                                    }
                                                    c13 = 5;
                                                    i24++;
                                                    i23 = i14;
                                                    z7 = true;
                                                } else if (c11 == '-') {
                                                    i14 = i23;
                                                    if (c13 == 0) {
                                                        c13 = 1;
                                                        z11 = true;
                                                        i24++;
                                                        i23 = i14;
                                                        z7 = true;
                                                    } else {
                                                        if (c13 != 5) {
                                                            break;
                                                        }
                                                        c13 = 6;
                                                        i24++;
                                                        i23 = i14;
                                                        z7 = true;
                                                    }
                                                } else if (c11 == '.') {
                                                    i14 = i23;
                                                    if (c13 != 2) {
                                                        break;
                                                    }
                                                    c13 = 3;
                                                    i24++;
                                                    i23 = i14;
                                                    z7 = true;
                                                } else {
                                                    if (c11 < '0' || c11 > '9') {
                                                        break;
                                                    }
                                                    if (c13 == z7 || c13 == 0) {
                                                        i14 = i23;
                                                        j10 = -(c11 - '0');
                                                        c13 = 2;
                                                    } else if (c13 != 2) {
                                                        i14 = i23;
                                                        if (c13 == 3) {
                                                            c13 = 4;
                                                        } else if (c13 == 5 || c13 == 6) {
                                                            c13 = 7;
                                                        }
                                                    } else {
                                                        if (j10 == 0) {
                                                            break;
                                                        }
                                                        i14 = i23;
                                                        long j11 = (10 * j10) - (c11 - '0');
                                                        z10 &= j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10);
                                                        j10 = j11;
                                                    }
                                                    i24++;
                                                    i23 = i14;
                                                    z7 = true;
                                                }
                                                if (i15 != 0) {
                                                    return i15;
                                                }
                                                if (!k(cArr[this.f19405j])) {
                                                    D("Expected value");
                                                    throw null;
                                                }
                                                c();
                                                i10 = 10;
                                            } else {
                                                i14 = i23;
                                                if (c13 != 5) {
                                                    break;
                                                }
                                                c13 = 6;
                                                i24++;
                                                i23 = i14;
                                                z7 = true;
                                            }
                                        }
                                    }
                                    char c14 = 2;
                                    if (c13 != 2) {
                                        if (c13 != c14 || c13 == 4 || c13 == 7) {
                                            this.M = i24;
                                            i15 = 16;
                                            this.f19409u = i15;
                                            if (i15 != 0) {
                                            }
                                        }
                                        i15 = 0;
                                        if (i15 != 0) {
                                        }
                                    } else if (!z10 || ((j10 == Long.MIN_VALUE && !z11) || (j10 == 0 && z11))) {
                                        c14 = 2;
                                        if (c13 != c14) {
                                        }
                                        this.M = i24;
                                        i15 = 16;
                                        this.f19409u = i15;
                                        if (i15 != 0) {
                                        }
                                    } else {
                                        if (!z11) {
                                            j10 = -j10;
                                        }
                                        this.f19410w = j10;
                                        this.f19405j += i24;
                                        i15 = 15;
                                        this.f19409u = i15;
                                        if (i15 != 0) {
                                        }
                                    }
                                }
                                int length = str.length();
                                int i26 = 1;
                                while (true) {
                                    if (i26 < length) {
                                        if ((this.f19405j + i26 >= this.f19406m && !g(i26 + 1)) || ((c10 = cArr[this.f19405j + i26]) != str.charAt(i26) && c10 != str2.charAt(i26))) {
                                            break;
                                        }
                                        i26++;
                                    } else {
                                        if ((this.f19405j + length < this.f19406m || g(length + 1)) && k(cArr[this.f19405j + length])) {
                                            break;
                                        }
                                        this.f19405j += length;
                                        this.f19409u = i13;
                                    }
                                }
                                if (i13 == 0) {
                                }
                            } else {
                                i10 = 1;
                            }
                        }
                        if (i17 != i12 && i17 != 2) {
                            D("Unexpected value");
                            throw null;
                        }
                        c();
                        this.f19405j -= i12;
                        i10 = 7;
                    } else {
                        c();
                        i10 = 8;
                    }
                }
                this.f19409u = i10;
                return i10;
            }
            int iR5 = r(true);
            if (iR5 != 44) {
                if (iR5 != 59) {
                    if (iR5 == 93) {
                        this.f19409u = 4;
                        return 4;
                    }
                    D("Unterminated array");
                    throw null;
                }
                c();
            }
        }
        iR2 = r(true);
        if (iR2 != 34) {
        }
        this.f19409u = i10;
        return i10;
    }

    public final void e() {
        int iD = this.f19409u;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + r.t(w()) + l());
        }
        int i10 = this.P;
        this.P = i10 - 1;
        int[] iArr = this.R;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f19409u = 0;
    }

    public final void f() throws IOException {
        int iD = this.f19409u;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + r.t(w()) + l());
        }
        int i10 = this.P;
        int i11 = i10 - 1;
        this.P = i11;
        this.Q[i11] = null;
        int[] iArr = this.R;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f19409u = 0;
    }

    public final boolean g(int i10) throws IOException {
        int i11;
        int i12;
        int i13 = this.f19408t;
        int i14 = this.f19405j;
        this.f19408t = i13 - i14;
        int i15 = this.f19406m;
        char[] cArr = this.f19404f;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f19406m = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f19406m = 0;
        }
        this.f19405j = 0;
        do {
            int i17 = this.f19406m;
            int i18 = this.f19402b.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f19406m + i18;
            this.f19406m = i11;
            if (this.f19407n == 0 && (i12 = this.f19408t) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f19405j++;
                this.f19408t = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public final String h(boolean z7) {
        StringBuilder sb = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.P;
            if (i10 >= i11) {
                return sb.toString();
            }
            int i12 = this.O[i10];
            if (i12 == 1 || i12 == 2) {
                int i13 = this.R[i10];
                if (z7 && i13 > 0 && i10 == i11 - 1) {
                    i13--;
                }
                sb.append('[');
                sb.append(i13);
                sb.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb.append('.');
                String str = this.Q[i10];
                if (str != null) {
                    sb.append(str);
                }
            }
            i10++;
        }
    }

    public final boolean j() throws IOException {
        int iD = this.f19409u;
        if (iD == 0) {
            iD = d();
        }
        return (iD == 2 || iD == 4 || iD == 17) ? false : true;
    }

    public final boolean k(char c10) throws c {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        c();
        return false;
    }

    public final String l() {
        StringBuilder sbZ = h.z(" at line ", this.f19407n + 1, " column ", (this.f19405j - this.f19408t) + 1, " path ");
        sbZ.append(h(false));
        return sbZ.toString();
    }

    public final boolean m() throws IOException {
        int iD = this.f19409u;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 5) {
            this.f19409u = 0;
            int[] iArr = this.R;
            int i10 = this.P - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iD != 6) {
            throw new IllegalStateException("Expected a boolean but was " + r.t(w()) + l());
        }
        this.f19409u = 0;
        int[] iArr2 = this.R;
        int i11 = this.P - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public final double n() throws IOException, NumberFormatException {
        String strT;
        int iD = this.f19409u;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            this.f19409u = 0;
            int[] iArr = this.R;
            int i10 = this.P - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f19410w;
        }
        if (iD == 16) {
            this.N = new String(this.f19404f, this.f19405j, this.M);
            this.f19405j += this.M;
        } else {
            if (iD == 8 || iD == 9) {
                strT = t(iD == 8 ? '\'' : '\"');
            } else if (iD == 10) {
                strT = v();
            } else if (iD != 11) {
                throw new IllegalStateException("Expected a double but was " + r.t(w()) + l());
            }
            this.N = strT;
        }
        this.f19409u = 11;
        double d10 = Double.parseDouble(this.N);
        if (!this.f19403e && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new c("JSON forbids NaN and infinities: " + d10 + l());
        }
        this.N = null;
        this.f19409u = 0;
        int[] iArr2 = this.R;
        int i11 = this.P - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public final int o() throws IOException, NumberFormatException {
        String strT;
        int iD = this.f19409u;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            long j10 = this.f19410w;
            int i10 = (int) j10;
            if (j10 != i10) {
                throw new NumberFormatException("Expected an int but was " + this.f19410w + l());
            }
            this.f19409u = 0;
            int[] iArr = this.R;
            int i11 = this.P - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (iD == 16) {
            this.N = new String(this.f19404f, this.f19405j, this.M);
            this.f19405j += this.M;
        } else {
            if (iD != 8 && iD != 9 && iD != 10) {
                throw new IllegalStateException("Expected an int but was " + r.t(w()) + l());
            }
            if (iD == 10) {
                strT = v();
            } else {
                strT = t(iD == 8 ? '\'' : '\"');
            }
            this.N = strT;
            try {
                int i12 = Integer.parseInt(this.N);
                this.f19409u = 0;
                int[] iArr2 = this.R;
                int i13 = this.P - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f19409u = 11;
        double d10 = Double.parseDouble(this.N);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.N + l());
        }
        this.N = null;
        this.f19409u = 0;
        int[] iArr3 = this.R;
        int i15 = this.P - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public final long p() throws IOException, NumberFormatException {
        String strT;
        int iD = this.f19409u;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            this.f19409u = 0;
            int[] iArr = this.R;
            int i10 = this.P - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f19410w;
        }
        if (iD == 16) {
            this.N = new String(this.f19404f, this.f19405j, this.M);
            this.f19405j += this.M;
        } else {
            if (iD != 8 && iD != 9 && iD != 10) {
                throw new IllegalStateException("Expected a long but was " + r.t(w()) + l());
            }
            if (iD == 10) {
                strT = v();
            } else {
                strT = t(iD == 8 ? '\'' : '\"');
            }
            this.N = strT;
            try {
                long j10 = Long.parseLong(this.N);
                this.f19409u = 0;
                int[] iArr2 = this.R;
                int i11 = this.P - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f19409u = 11;
        double d10 = Double.parseDouble(this.N);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.N + l());
        }
        this.N = null;
        this.f19409u = 0;
        int[] iArr3 = this.R;
        int i12 = this.P - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public final String q() throws IOException {
        char c10;
        String strT;
        int iD = this.f19409u;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 14) {
            strT = v();
        } else {
            if (iD == 12) {
                c10 = '\'';
            } else {
                if (iD != 13) {
                    throw new IllegalStateException("Expected a name but was " + r.t(w()) + l());
                }
                c10 = '\"';
            }
            strT = t(c10);
        }
        this.f19409u = 0;
        this.Q[this.P - 1] = strT;
        return strT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r1 == '/') goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r(boolean z7) throws IOException {
        int i10;
        while (true) {
            int i11 = this.f19405j;
            int i12 = this.f19406m;
            while (true) {
                if (i11 == i12) {
                    this.f19405j = i11;
                    if (!g(1)) {
                        if (!z7) {
                            return -1;
                        }
                        throw new EOFException("End of input" + l());
                    }
                    i11 = this.f19405j;
                    i12 = this.f19406m;
                }
                int i13 = i11 + 1;
                char[] cArr = this.f19404f;
                char c10 = cArr[i11];
                if (c10 == '\n') {
                    this.f19407n++;
                    this.f19408t = i13;
                } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                    if (c10 == '/') {
                        this.f19405j = i13;
                        if (i13 == i12) {
                            this.f19405j = i11;
                            boolean zG = g(2);
                            this.f19405j++;
                            if (!zG) {
                                return c10;
                            }
                        }
                        c();
                        i10 = this.f19405j;
                        char c11 = cArr[i10];
                        if (c11 != '*') {
                            break;
                        }
                        this.f19405j = i10 + 1;
                        while (true) {
                            if (this.f19405j + 2 > this.f19406m && !g(2)) {
                                D("Unterminated comment");
                                throw null;
                            }
                            int i14 = this.f19405j;
                            if (cArr[i14] != '\n') {
                                for (int i15 = 0; i15 < 2; i15++) {
                                    if (cArr[this.f19405j + i15] != "*/".charAt(i15)) {
                                        break;
                                    }
                                }
                                i11 = this.f19405j + 2;
                                break;
                            }
                            this.f19407n++;
                            this.f19408t = i14 + 1;
                            this.f19405j++;
                        }
                    } else {
                        this.f19405j = i13;
                        if (c10 != '#') {
                            return c10;
                        }
                        c();
                        A();
                        i11 = this.f19405j;
                    }
                    i12 = this.f19406m;
                }
                i11 = i13;
            }
            this.f19405j = i10 + 1;
            A();
        }
    }

    public final void s() {
        int iD = this.f19409u;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 7) {
            throw new IllegalStateException("Expected null but was " + r.t(w()) + l());
        }
        this.f19409u = 0;
        int[] iArr = this.R;
        int i10 = this.P - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public final String t(char c10) throws c {
        StringBuilder sb = null;
        while (true) {
            int i10 = this.f19405j;
            int i11 = this.f19406m;
            while (true) {
                char[] cArr = this.f19404f;
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f19405j = i12;
                        int i13 = (i12 - i10) - 1;
                        if (sb == null) {
                            return new String(cArr, i10, i13);
                        }
                        sb.append(cArr, i10, i13);
                        return sb.toString();
                    }
                    if (c11 == '\\') {
                        this.f19405j = i12;
                        int i14 = i12 - i10;
                        int i15 = i14 - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i14 * 2, 16));
                        }
                        sb.append(cArr, i10, i15);
                        sb.append(y());
                    } else {
                        if (c11 == '\n') {
                            this.f19407n++;
                            this.f19408t = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i10 - i10) * 2, 16));
                    }
                    sb.append(cArr, i10, i10 - i10);
                    this.f19405j = i10;
                    if (!g(1)) {
                        D("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public final String toString() {
        return a.class.getSimpleName() + l();
    }

    public final String u() throws IOException {
        String str;
        char c10;
        int iD = this.f19409u;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 10) {
            str = v();
        } else {
            if (iD == 8) {
                c10 = '\'';
            } else if (iD == 9) {
                c10 = '\"';
            } else if (iD == 11) {
                str = this.N;
                this.N = null;
            } else if (iD == 15) {
                str = Long.toString(this.f19410w);
            } else {
                if (iD != 16) {
                    throw new IllegalStateException("Expected a string but was " + r.t(w()) + l());
                }
                str = new String(this.f19404f, this.f19405j, this.M);
                this.f19405j += this.M;
            }
            str = t(c10);
        }
        this.f19409u = 0;
        int[] iArr = this.R;
        int i10 = this.P - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String v() throws c {
        char[] cArr;
        String string;
        StringBuilder sb = null;
        int i10 = 0;
        do {
            int i11 = 0;
            while (true) {
                int i12 = this.f19405j;
                int i13 = i12 + i11;
                int i14 = this.f19406m;
                cArr = this.f19404f;
                if (i13 < i14) {
                    char c10 = cArr[i12 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i11 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i11, 16));
                    }
                    sb.append(cArr, this.f19405j, i11);
                    this.f19405j += i11;
                } else if (g(i11 + 1)) {
                }
            }
            i10 = i11;
            if (sb != null) {
                string = new String(cArr, this.f19405j, i10);
            } else {
                sb.append(cArr, this.f19405j, i10);
                string = sb.toString();
            }
            this.f19405j += i10;
            return string;
        } while (g(1));
        if (sb != null) {
        }
        this.f19405j += i10;
        return string;
    }

    public final int w() throws IOException {
        int iD = this.f19409u;
        if (iD == 0) {
            iD = d();
        }
        switch (iD) {
            case QueueFuseable.SYNC /* 1 */:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case g.INVALID_ACCOUNT /* 5 */:
            case g.RESOLUTION_REQUIRED /* 6 */:
                return 8;
            case g.NETWORK_ERROR /* 7 */:
                return 9;
            case 8:
            case 9:
            case g.DEVELOPER_ERROR /* 10 */:
            case 11:
                return 6;
            case 12:
            case g.ERROR /* 13 */:
            case g.INTERRUPTED /* 14 */:
                return 5;
            case g.TIMEOUT /* 15 */:
            case g.CANCELED /* 16 */:
                return 7;
            case g.API_NOT_CONNECTED /* 17 */:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void x(int i10) {
        int i11 = this.P;
        int[] iArr = this.O;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.O = Arrays.copyOf(iArr, i12);
            this.R = Arrays.copyOf(this.R, i12);
            this.Q = (String[]) Arrays.copyOf(this.Q, i12);
        }
        int[] iArr2 = this.O;
        int i13 = this.P;
        this.P = i13 + 1;
        iArr2[i13] = i10;
    }

    public final char y() throws c {
        int i10;
        if (this.f19405j == this.f19406m && !g(1)) {
            D("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f19405j;
        int i12 = i11 + 1;
        this.f19405j = i12;
        char[] cArr = this.f19404f;
        char c10 = cArr[i11];
        if (c10 == '\n') {
            this.f19407n++;
            this.f19408t = i12;
        } else if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
            if (c10 == 'b') {
                return '\b';
            }
            if (c10 == 'f') {
                return '\f';
            }
            if (c10 == 'n') {
                return '\n';
            }
            if (c10 == 'r') {
                return '\r';
            }
            if (c10 == 't') {
                return '\t';
            }
            if (c10 != 'u') {
                D("Invalid escape sequence");
                throw null;
            }
            if (i11 + 5 > this.f19406m && !g(4)) {
                D("Unterminated escape sequence");
                throw null;
            }
            int i13 = this.f19405j;
            int i14 = i13 + 4;
            char c11 = 0;
            while (i13 < i14) {
                char c12 = cArr[i13];
                char c13 = (char) (c11 << 4);
                if (c12 >= '0' && c12 <= '9') {
                    i10 = c12 - '0';
                } else if (c12 >= 'a' && c12 <= 'f') {
                    i10 = c12 - 'W';
                } else {
                    if (c12 < 'A' || c12 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(cArr, this.f19405j, 4)));
                    }
                    i10 = c12 - '7';
                }
                c11 = (char) (i10 + c13);
                i13++;
            }
            this.f19405j += 4;
            return c11;
        }
        return c10;
    }

    public final void z(char c10) throws c {
        while (true) {
            int i10 = this.f19405j;
            int i11 = this.f19406m;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = this.f19404f[i10];
                    if (c11 == c10) {
                        this.f19405j = i12;
                        return;
                    }
                    if (c11 == '\\') {
                        this.f19405j = i12;
                        y();
                        break;
                    } else {
                        if (c11 == '\n') {
                            this.f19407n++;
                            this.f19408t = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    this.f19405j = i10;
                    if (!g(1)) {
                        D("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }
}