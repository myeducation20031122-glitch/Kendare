package s7;

import androidx.recyclerview.widget.g1;
import com.bumptech.glide.manager.t;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h implements Closeable {

    /* renamed from: t, reason: collision with root package name */
    public static final Logger f16884t = Logger.getLogger(h.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final RandomAccessFile f16885b;

    /* renamed from: e, reason: collision with root package name */
    public int f16886e;

    /* renamed from: f, reason: collision with root package name */
    public int f16887f;

    /* renamed from: j, reason: collision with root package name */
    public e f16888j;

    /* renamed from: m, reason: collision with root package name */
    public e f16889m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f16890n;

    public h(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f16890n = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {g1.FLAG_APPEARED_IN_PRE_LAYOUT, 0, 0, 0};
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    o(bArr2, i10, iArr[i11]);
                    i10 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f16885b = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iG = g(bArr, 0);
        this.f16886e = iG;
        if (iG > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f16886e + ", Actual length: " + randomAccessFile2.length());
        }
        this.f16887f = g(bArr, 4);
        int iG2 = g(bArr, 8);
        int iG3 = g(bArr, 12);
        this.f16888j = f(iG2);
        this.f16889m = f(iG3);
    }

    public static int g(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public static void o(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public final void a(byte[] bArr) {
        int iM;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    c(length);
                    boolean zE = e();
                    if (zE) {
                        iM = 16;
                    } else {
                        e eVar = this.f16889m;
                        iM = m(eVar.f16879a + 4 + eVar.f16880b);
                    }
                    e eVar2 = new e(iM, length);
                    o(this.f16890n, 0, length);
                    k(iM, this.f16890n, 4);
                    k(iM + 4, bArr, length);
                    n(this.f16886e, this.f16887f + 1, zE ? iM : this.f16888j.f16879a, iM);
                    this.f16889m = eVar2;
                    this.f16887f++;
                    if (zE) {
                        this.f16888j = eVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final synchronized void b() {
        n(g1.FLAG_APPEARED_IN_PRE_LAYOUT, 0, 0, 0);
        this.f16887f = 0;
        e eVar = e.f16878c;
        this.f16888j = eVar;
        this.f16889m = eVar;
        if (this.f16886e > 4096) {
            RandomAccessFile randomAccessFile = this.f16885b;
            randomAccessFile.setLength(g1.FLAG_APPEARED_IN_PRE_LAYOUT);
            randomAccessFile.getChannel().force(true);
        }
        this.f16886e = g1.FLAG_APPEARED_IN_PRE_LAYOUT;
    }

    public final void c(int i10) throws IOException {
        int i11 = i10 + 4;
        int iL = this.f16886e - l();
        if (iL >= i11) {
            return;
        }
        int i12 = this.f16886e;
        do {
            iL += i12;
            i12 <<= 1;
        } while (iL < i11);
        RandomAccessFile randomAccessFile = this.f16885b;
        randomAccessFile.setLength(i12);
        randomAccessFile.getChannel().force(true);
        e eVar = this.f16889m;
        int iM = m(eVar.f16879a + 4 + eVar.f16880b);
        if (iM < this.f16888j.f16879a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f16886e);
            long j10 = iM - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f16889m.f16879a;
        int i14 = this.f16888j.f16879a;
        if (i13 < i14) {
            int i15 = (this.f16886e + i13) - 16;
            n(i12, this.f16887f, i14, i15);
            this.f16889m = new e(i15, this.f16889m.f16880b);
        } else {
            n(i12, this.f16887f, i14, i13);
        }
        this.f16886e = i12;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f16885b.close();
    }

    public final synchronized void d(g gVar) {
        int iM = this.f16888j.f16879a;
        for (int i10 = 0; i10 < this.f16887f; i10++) {
            e eVarF = f(iM);
            gVar.a(new f(this, eVarF), eVarF.f16880b);
            iM = m(eVarF.f16879a + 4 + eVarF.f16880b);
        }
    }

    public final synchronized boolean e() {
        return this.f16887f == 0;
    }

    public final e f(int i10) throws IOException {
        if (i10 == 0) {
            return e.f16878c;
        }
        RandomAccessFile randomAccessFile = this.f16885b;
        randomAccessFile.seek(i10);
        return new e(i10, randomAccessFile.readInt());
    }

    public final synchronized void h() {
        try {
            if (e()) {
                throw new NoSuchElementException();
            }
            if (this.f16887f == 1) {
                b();
            } else {
                e eVar = this.f16888j;
                int iM = m(eVar.f16879a + 4 + eVar.f16880b);
                j(iM, this.f16890n, 0, 4);
                int iG = g(this.f16890n, 0);
                n(this.f16886e, this.f16887f - 1, iM, this.f16889m.f16879a);
                this.f16887f--;
                this.f16888j = new e(iM, iG);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void j(int i10, byte[] bArr, int i11, int i12) {
        int iM = m(i10);
        int i13 = iM + i12;
        int i14 = this.f16886e;
        RandomAccessFile randomAccessFile = this.f16885b;
        if (i13 <= i14) {
            randomAccessFile.seek(iM);
        } else {
            int i15 = i14 - iM;
            randomAccessFile.seek(iM);
            randomAccessFile.readFully(bArr, i11, i15);
            randomAccessFile.seek(16L);
            i11 += i15;
            i12 -= i15;
        }
        randomAccessFile.readFully(bArr, i11, i12);
    }

    public final void k(int i10, byte[] bArr, int i11) throws IOException {
        int iM = m(i10);
        int i12 = iM + i11;
        int i13 = this.f16886e;
        RandomAccessFile randomAccessFile = this.f16885b;
        if (i12 <= i13) {
            randomAccessFile.seek(iM);
            randomAccessFile.write(bArr, 0, i11);
            return;
        }
        int i14 = i13 - iM;
        randomAccessFile.seek(iM);
        randomAccessFile.write(bArr, 0, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i14, i11 - i14);
    }

    public final int l() {
        if (this.f16887f == 0) {
            return 16;
        }
        e eVar = this.f16889m;
        int i10 = eVar.f16879a;
        int i11 = this.f16888j.f16879a;
        return i10 >= i11 ? (i10 - i11) + 4 + eVar.f16880b + 16 : (((i10 + 4) + eVar.f16880b) + this.f16886e) - i11;
    }

    public final int m(int i10) {
        int i11 = this.f16886e;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final void n(int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr = {i10, i11, i12, i13};
        int i14 = 0;
        int i15 = 0;
        while (true) {
            byte[] bArr = this.f16890n;
            if (i14 >= 4) {
                RandomAccessFile randomAccessFile = this.f16885b;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                o(bArr, i15, iArr[i14]);
                i15 += 4;
                i14++;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(h.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f16886e);
        sb.append(", size=");
        sb.append(this.f16887f);
        sb.append(", first=");
        sb.append(this.f16888j);
        sb.append(", last=");
        sb.append(this.f16889m);
        sb.append(", element lengths=[");
        try {
            d(new t(this, sb));
        } catch (IOException e10) {
            f16884t.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb.append("]]");
        return sb.toString();
    }
}