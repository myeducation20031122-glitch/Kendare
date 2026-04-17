package n1;

import a0.h;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f15254e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final File f15255a;

    /* renamed from: b, reason: collision with root package name */
    public final Lock f15256b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15257c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f15258d;

    public a(String str, File file, boolean z7) {
        Lock reentrantLock;
        File file2 = new File(file, h.F(str, ".lck"));
        this.f15255a = file2;
        String absolutePath = file2.getAbsolutePath();
        HashMap map = f15254e;
        synchronized (map) {
            try {
                reentrantLock = (Lock) map.get(absolutePath);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(absolutePath, reentrantLock);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15256b = reentrantLock;
        this.f15257c = z7;
    }

    public final void a() {
        FileChannel fileChannel = this.f15258d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f15256b.unlock();
    }
}