package o2;

import android.os.Build;
import android.os.StrictMode;
import com.bumptech.glide.m;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l4.j0;
import m2.p;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements Closeable {
    public int N;

    /* renamed from: b, reason: collision with root package name */
    public final File f15675b;

    /* renamed from: e, reason: collision with root package name */
    public final File f15676e;

    /* renamed from: f, reason: collision with root package name */
    public final File f15677f;

    /* renamed from: j, reason: collision with root package name */
    public final File f15678j;

    /* renamed from: n, reason: collision with root package name */
    public final long f15680n;

    /* renamed from: w, reason: collision with root package name */
    public BufferedWriter f15683w;

    /* renamed from: u, reason: collision with root package name */
    public long f15682u = 0;
    public final LinkedHashMap M = new LinkedHashMap(0, 0.75f, true);
    public long O = 0;
    public final ThreadPoolExecutor P = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());
    public final p Q = new p(this, 1);

    /* renamed from: m, reason: collision with root package name */
    public final int f15679m = 1;

    /* renamed from: t, reason: collision with root package name */
    public final int f15681t = 1;

    public d(File file, long j10) {
        this.f15675b = file;
        this.f15676e = new File(file, "journal");
        this.f15677f = new File(file, "journal.tmp");
        this.f15678j = new File(file, "journal.bkp");
        this.f15680n = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051 A[Catch: all -> 0x002d, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000c, B:10:0x0011, B:12:0x0015, B:14:0x001d, B:16:0x0027, B:22:0x0033, B:23:0x004c, B:24:0x004d, B:26:0x0051, B:28:0x0057, B:30:0x005d, B:32:0x007a, B:31:0x0077, B:33:0x007d, B:35:0x008f, B:37:0x00b4, B:39:0x00dd, B:41:0x00ea, B:43:0x00f0, B:38:0x00be, B:45:0x00fa, B:46:0x00ff), top: B:49:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f A[Catch: all -> 0x002d, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000c, B:10:0x0011, B:12:0x0015, B:14:0x001d, B:16:0x0027, B:22:0x0033, B:23:0x004c, B:24:0x004d, B:26:0x0051, B:28:0x0057, B:30:0x005d, B:32:0x007a, B:31:0x0077, B:33:0x007d, B:35:0x008f, B:37:0x00b4, B:39:0x00dd, B:41:0x00ea, B:43:0x00f0, B:38:0x00be, B:45:0x00fa, B:46:0x00ff), top: B:49:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be A[Catch: all -> 0x002d, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000c, B:10:0x0011, B:12:0x0015, B:14:0x001d, B:16:0x0027, B:22:0x0033, B:23:0x004c, B:24:0x004d, B:26:0x0051, B:28:0x0057, B:30:0x005d, B:32:0x007a, B:31:0x0077, B:33:0x007d, B:35:0x008f, B:37:0x00b4, B:39:0x00dd, B:41:0x00ea, B:43:0x00f0, B:38:0x00be, B:45:0x00fa, B:46:0x00ff), top: B:49:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0 A[Catch: all -> 0x002d, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000c, B:10:0x0011, B:12:0x0015, B:14:0x001d, B:16:0x0027, B:22:0x0033, B:23:0x004c, B:24:0x004d, B:26:0x0051, B:28:0x0057, B:30:0x005d, B:32:0x007a, B:31:0x0077, B:33:0x007d, B:35:0x008f, B:37:0x00b4, B:39:0x00dd, B:41:0x00ea, B:43:0x00f0, B:38:0x00be, B:45:0x00fa, B:46:0x00ff), top: B:49:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(d dVar, m mVar, boolean z7) {
        synchronized (dVar) {
            b bVar = (b) mVar.f2320e;
            if (bVar.f15667f != mVar) {
                throw new IllegalStateException();
            }
            if (!z7 || bVar.f15666e) {
                for (int i10 = 0; i10 < dVar.f15681t; i10++) {
                    File file = bVar.f15665d[i10];
                    if (!z7) {
                        c(file);
                    } else if (file.exists()) {
                        File file2 = bVar.f15664c[i10];
                        file.renameTo(file2);
                        long j10 = bVar.f15663b[i10];
                        long length = file2.length();
                        bVar.f15663b[i10] = length;
                        dVar.f15682u = (dVar.f15682u - j10) + length;
                    }
                }
                dVar.N++;
                bVar.f15667f = null;
                if (bVar.f15666e || z7) {
                    dVar.M.remove(bVar.f15662a);
                    dVar.f15683w.append((CharSequence) "REMOVE");
                    dVar.f15683w.append(' ');
                    dVar.f15683w.append((CharSequence) bVar.f15662a);
                    dVar.f15683w.append('\n');
                } else {
                    bVar.f15666e = true;
                    dVar.f15683w.append((CharSequence) "CLEAN");
                    dVar.f15683w.append(' ');
                    dVar.f15683w.append((CharSequence) bVar.f15662a);
                    dVar.f15683w.append((CharSequence) bVar.a());
                    dVar.f15683w.append('\n');
                    if (z7) {
                        long j11 = dVar.O;
                        dVar.O = 1 + j11;
                        bVar.f15668g = j11;
                    }
                }
                e(dVar.f15683w);
                if (dVar.f15682u <= dVar.f15680n || dVar.g()) {
                    dVar.P.submit(dVar.Q);
                }
            } else {
                for (int i11 = 0; i11 < dVar.f15681t; i11++) {
                    if (!((boolean[]) mVar.f2321f)[i11]) {
                        mVar.c();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                    }
                    if (!bVar.f15665d[i11].exists()) {
                        mVar.c();
                        break;
                    }
                }
                while (i10 < dVar.f15681t) {
                }
                dVar.N++;
                bVar.f15667f = null;
                if (!(bVar.f15666e | z7)) {
                }
                e(dVar.f15683w);
                if (dVar.f15682u <= dVar.f15680n) {
                    dVar.P.submit(dVar.Q);
                }
            }
        }
    }

    public static void b(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(j0.i(new StrictMode.ThreadPolicy.Builder(threadPolicy)).build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void c(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void e(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(j0.i(new StrictMode.ThreadPolicy.Builder(threadPolicy)).build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static d h(File file, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                n(file2, file3, false);
            }
        }
        d dVar = new d(file, j10);
        if (dVar.f15676e.exists()) {
            try {
                dVar.k();
                dVar.j();
                return dVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                dVar.close();
                g.a(dVar.f15675b);
            }
        }
        file.mkdirs();
        d dVar2 = new d(file, j10);
        dVar2.m();
        return dVar2;
    }

    public static void n(File file, File file2, boolean z7) throws IOException {
        if (z7) {
            c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f15683w == null) {
                return;
            }
            Iterator it = new ArrayList(this.M.values()).iterator();
            while (it.hasNext()) {
                m mVar = ((b) it.next()).f15667f;
                if (mVar != null) {
                    mVar.c();
                }
            }
            o();
            b(this.f15683w);
            this.f15683w = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final m d(String str) {
        synchronized (this) {
            try {
                if (this.f15683w == null) {
                    throw new IllegalStateException("cache is closed");
                }
                b bVar = (b) this.M.get(str);
                if (bVar == null) {
                    bVar = new b(this, str);
                    this.M.put(str, bVar);
                } else if (bVar.f15667f != null) {
                    return null;
                }
                m mVar = new m(this, bVar);
                bVar.f15667f = mVar;
                this.f15683w.append((CharSequence) "DIRTY");
                this.f15683w.append(' ');
                this.f15683w.append((CharSequence) str);
                this.f15683w.append('\n');
                e(this.f15683w);
                return mVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized c f(String str) {
        if (this.f15683w == null) {
            throw new IllegalStateException("cache is closed");
        }
        b bVar = (b) this.M.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f15666e) {
            return null;
        }
        for (File file : bVar.f15664c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.N++;
        this.f15683w.append((CharSequence) "READ");
        this.f15683w.append(' ');
        this.f15683w.append((CharSequence) str);
        this.f15683w.append('\n');
        if (g()) {
            this.P.submit(this.Q);
        }
        long j10 = bVar.f15668g;
        File[] fileArr = bVar.f15664c;
        long[] jArr = bVar.f15663b;
        c cVar = new c();
        cVar.f15671e = this;
        cVar.f15672f = str;
        cVar.f15670b = j10;
        cVar.f15674m = fileArr;
        cVar.f15673j = jArr;
        return cVar;
    }

    public final boolean g() {
        int i10 = this.N;
        return i10 >= 2000 && i10 >= this.M.size();
    }

    public final void j() throws IOException {
        c(this.f15677f);
        Iterator it = this.M.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            m mVar = bVar.f15667f;
            int i10 = this.f15681t;
            int i11 = 0;
            if (mVar == null) {
                while (i11 < i10) {
                    this.f15682u += bVar.f15663b[i11];
                    i11++;
                }
            } else {
                bVar.f15667f = null;
                while (i11 < i10) {
                    c(bVar.f15664c[i11]);
                    c(bVar.f15665d[i11]);
                    i11++;
                }
                it.remove();
            }
        }
    }

    public final void k() {
        File file = this.f15676e;
        f fVar = new f(new FileInputStream(file), g.f15690a);
        try {
            String strA = fVar.a();
            String strA2 = fVar.a();
            String strA3 = fVar.a();
            String strA4 = fVar.a();
            String strA5 = fVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f15679m).equals(strA3) || !Integer.toString(this.f15681t).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    l(fVar.a());
                    i10++;
                } catch (EOFException unused) {
                    this.N = i10 - this.M.size();
                    if (fVar.f15689m == -1) {
                        m();
                    } else {
                        this.f15683w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), g.f15690a));
                    }
                    try {
                        fVar.close();
                        return;
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                fVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void l(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        LinkedHashMap linkedHashMap = this.M;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        b bVar = (b) linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(this, strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f15667f = new m(this, bVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        bVar.f15666e = true;
        bVar.f15667f = null;
        if (strArrSplit.length != bVar.f15669h.f15681t) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            try {
                bVar.f15663b[i11] = Long.parseLong(strArrSplit[i11]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void m() {
        try {
            BufferedWriter bufferedWriter = this.f15683w;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f15677f), g.f15690a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f15679m));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f15681t));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (b bVar : this.M.values()) {
                    bufferedWriter2.write(bVar.f15667f != null ? "DIRTY " + bVar.f15662a + '\n' : "CLEAN " + bVar.f15662a + bVar.a() + '\n');
                }
                b(bufferedWriter2);
                if (this.f15676e.exists()) {
                    n(this.f15676e, this.f15678j, true);
                }
                n(this.f15677f, this.f15676e, false);
                this.f15678j.delete();
                this.f15683w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f15676e, true), g.f15690a));
            } catch (Throwable th) {
                b(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void o() {
        while (this.f15682u > this.f15680n) {
            String str = (String) ((Map.Entry) this.M.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f15683w == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    b bVar = (b) this.M.get(str);
                    if (bVar != null && bVar.f15667f == null) {
                        for (int i10 = 0; i10 < this.f15681t; i10++) {
                            File file = bVar.f15664c[i10];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j10 = this.f15682u;
                            long[] jArr = bVar.f15663b;
                            this.f15682u = j10 - jArr[i10];
                            jArr[i10] = 0;
                        }
                        this.N++;
                        this.f15683w.append((CharSequence) "REMOVE");
                        this.f15683w.append(' ');
                        this.f15683w.append((CharSequence) str);
                        this.f15683w.append('\n');
                        this.M.remove(str);
                        if (g()) {
                            this.P.submit(this.Q);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}