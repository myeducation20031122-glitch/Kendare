package y8;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class b implements Closeable, Flushable {
    public static final Pattern M = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] N = new String[128];
    public static final String[] O;

    /* renamed from: b, reason: collision with root package name */
    public final Writer f19411b;

    /* renamed from: e, reason: collision with root package name */
    public int[] f19412e;

    /* renamed from: f, reason: collision with root package name */
    public int f19413f;

    /* renamed from: j, reason: collision with root package name */
    public String f19414j;

    /* renamed from: m, reason: collision with root package name */
    public String f19415m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19416n;

    /* renamed from: t, reason: collision with root package name */
    public boolean f19417t;

    /* renamed from: u, reason: collision with root package name */
    public String f19418u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f19419w;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            N[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = N;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        O = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f19412e = iArr;
        this.f19413f = 0;
        if (iArr.length == 0) {
            this.f19412e = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f19412e;
        int i10 = this.f19413f;
        this.f19413f = i10 + 1;
        iArr2[i10] = 6;
        this.f19415m = ":";
        this.f19419w = true;
        Objects.requireNonNull(writer, "out == null");
        this.f19411b = writer;
    }

    public final void a() throws IOException {
        int iK = k();
        if (iK != 1) {
            Writer writer = this.f19411b;
            if (iK != 2) {
                if (iK == 4) {
                    writer.append((CharSequence) this.f19415m);
                    this.f19412e[this.f19413f - 1] = 5;
                    return;
                }
                if (iK != 6) {
                    if (iK != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f19416n) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                this.f19412e[this.f19413f - 1] = 7;
                return;
            }
            writer.append(',');
        } else {
            this.f19412e[this.f19413f - 1] = 2;
        }
        h();
    }

    public void b() {
        s();
        a();
        int i10 = this.f19413f;
        int[] iArr = this.f19412e;
        if (i10 == iArr.length) {
            this.f19412e = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f19412e;
        int i11 = this.f19413f;
        this.f19413f = i11 + 1;
        iArr2[i11] = 1;
        this.f19411b.write(91);
    }

    public void c() throws IOException {
        s();
        a();
        int i10 = this.f19413f;
        int[] iArr = this.f19412e;
        if (i10 == iArr.length) {
            this.f19412e = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f19412e;
        int i11 = this.f19413f;
        this.f19413f = i11 + 1;
        iArr2[i11] = 3;
        this.f19411b.write(123);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f19411b.close();
        int i10 = this.f19413f;
        if (i10 > 1 || (i10 == 1 && this.f19412e[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f19413f = 0;
    }

    public final void d(int i10, int i11, char c10) throws IOException {
        int iK = k();
        if (iK != i11 && iK != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f19418u != null) {
            throw new IllegalStateException("Dangling name: " + this.f19418u);
        }
        this.f19413f--;
        if (iK == i11) {
            h();
        }
        this.f19411b.write(c10);
    }

    public void e() {
        d(1, 2, ']');
    }

    public void f() throws IOException {
        d(3, 5, '}');
    }

    public void flush() throws IOException {
        if (this.f19413f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f19411b.flush();
    }

    public void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f19418u != null) {
            throw new IllegalStateException();
        }
        if (this.f19413f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f19418u = str;
    }

    public final void h() throws IOException {
        if (this.f19414j == null) {
            return;
        }
        Writer writer = this.f19411b;
        writer.write(10);
        int i10 = this.f19413f;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(this.f19414j);
        }
    }

    public b j() {
        if (this.f19418u != null) {
            if (!this.f19419w) {
                this.f19418u = null;
                return this;
            }
            s();
        }
        a();
        this.f19411b.write("null");
        return this;
    }

    public final int k() {
        int i10 = this.f19413f;
        if (i10 != 0) {
            return this.f19412e[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(String str) throws IOException {
        String str2;
        String[] strArr = this.f19417t ? O : N;
        Writer writer = this.f19411b;
        writer.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        writer.write(str, i10, i11 - i10);
                    }
                    writer.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                }
                writer.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            writer.write(str, i10, length - i10);
        }
        writer.write(34);
    }

    public void m(double d10) throws IOException {
        s();
        if (this.f19416n || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            a();
            this.f19411b.append((CharSequence) Double.toString(d10));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
    }

    public void n(long j10) throws IOException {
        s();
        a();
        this.f19411b.write(Long.toString(j10));
    }

    public void o(Boolean bool) throws IOException {
        if (bool == null) {
            j();
            return;
        }
        s();
        a();
        this.f19411b.write(bool.booleanValue() ? "true" : "false");
    }

    public void p(Number number) throws IOException {
        if (number == null) {
            j();
            return;
        }
        s();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !M.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f19416n) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        a();
        this.f19411b.append((CharSequence) string);
    }

    public void q(String str) throws IOException {
        if (str == null) {
            j();
            return;
        }
        s();
        a();
        l(str);
    }

    public void r(boolean z7) throws IOException {
        s();
        a();
        this.f19411b.write(z7 ? "true" : "false");
    }

    public final void s() throws IOException {
        if (this.f19418u != null) {
            int iK = k();
            if (iK == 5) {
                this.f19411b.write(44);
            } else if (iK != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            h();
            this.f19412e[this.f19413f - 1] = 4;
            l(this.f19418u);
            this.f19418u = null;
        }
    }
}