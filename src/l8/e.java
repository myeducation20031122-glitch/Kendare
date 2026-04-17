package l8;

import j8.j;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long f14679d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f14680e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final j f14681a;

    /* renamed from: b, reason: collision with root package name */
    public long f14682b;

    /* renamed from: c, reason: collision with root package name */
    public int f14683c;

    public e() {
        if (n7.c.f15367e == null) {
            Pattern pattern = j.f13866c;
            n7.c.f15367e = new n7.c(4);
        }
        n7.c cVar = n7.c.f15367e;
        if (j.f13867d == null) {
            j.f13867d = new j(cVar);
        }
        this.f14681a = j.f13867d;
    }

    public final synchronized long a(int i10) {
        if (i10 != 429 && (i10 < 500 || i10 >= 600)) {
            return f14679d;
        }
        double dPow = Math.pow(2.0d, this.f14683c);
        this.f14681a.getClass();
        return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f14680e);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean b() {
        boolean z7;
        if (this.f14683c != 0) {
            this.f14681a.f13868a.getClass();
            z7 = System.currentTimeMillis() > this.f14682b;
        }
        return z7;
    }

    public final synchronized void c() {
        this.f14683c = 0;
    }

    public final synchronized void d(int i10) {
        if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
            c();
            return;
        }
        this.f14683c++;
        long jA = a(i10);
        this.f14681a.f13868a.getClass();
        this.f14682b = System.currentTimeMillis() + jA;
    }
}