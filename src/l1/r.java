package l1;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r implements p1.e, Closeable {

    /* renamed from: w, reason: collision with root package name */
    public static final TreeMap f14514w = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    public volatile String f14515b;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f14516e;

    /* renamed from: f, reason: collision with root package name */
    public final double[] f14517f;

    /* renamed from: j, reason: collision with root package name */
    public final String[] f14518j;

    /* renamed from: m, reason: collision with root package name */
    public final byte[][] f14519m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f14520n;

    /* renamed from: t, reason: collision with root package name */
    public final int f14521t;

    /* renamed from: u, reason: collision with root package name */
    public int f14522u;

    public r(int i10) {
        this.f14521t = i10;
        int i11 = i10 + 1;
        this.f14520n = new int[i11];
        this.f14516e = new long[i11];
        this.f14517f = new double[i11];
        this.f14518j = new String[i11];
        this.f14519m = new byte[i11][];
    }

    public static r a(int i10, String str) {
        TreeMap treeMap = f14514w;
        synchronized (treeMap) {
            try {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (entryCeilingEntry == null) {
                    r rVar = new r(i10);
                    rVar.f14515b = str;
                    rVar.f14522u = i10;
                    return rVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                r rVar2 = (r) entryCeilingEntry.getValue();
                rVar2.f14515b = str;
                rVar2.f14522u = i10;
                return rVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i10, long j10) {
        this.f14520n[i10] = 2;
        this.f14516e[i10] = j10;
    }

    public final void c(int i10) {
        this.f14520n[i10] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void d(int i10, String str) {
        this.f14520n[i10] = 4;
        this.f14518j[i10] = str;
    }

    public final void e() {
        TreeMap treeMap = f14514w;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f14521t), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
        }
    }

    @Override // p1.e
    public final String f() {
        return this.f14515b;
    }

    @Override // p1.e
    public final void m(q1.f fVar) {
        for (int i10 = 1; i10 <= this.f14522u; i10++) {
            int i11 = this.f14520n[i10];
            if (i11 == 1) {
                fVar.d(i10);
            } else if (i11 == 2) {
                fVar.c(i10, this.f14516e[i10]);
            } else if (i11 == 3) {
                fVar.b(i10, this.f14517f[i10]);
            } else if (i11 == 4) {
                fVar.e(i10, this.f14518j[i10]);
            } else if (i11 == 5) {
                fVar.a(this.f14519m[i10], i10);
            }
        }
    }
}