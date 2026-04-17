package w7;

import android.util.Log;
import com.google.android.gms.internal.measurement.l9;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o3.f;
import q.d;
import w3.i;
import x5.l;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final double f18708a;

    /* renamed from: b, reason: collision with root package name */
    public final double f18709b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18710c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18711d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayBlockingQueue f18712e;

    /* renamed from: f, reason: collision with root package name */
    public final ThreadPoolExecutor f18713f;

    /* renamed from: g, reason: collision with root package name */
    public final f f18714g;

    /* renamed from: h, reason: collision with root package name */
    public final l9 f18715h;

    /* renamed from: i, reason: collision with root package name */
    public int f18716i;

    /* renamed from: j, reason: collision with root package name */
    public long f18717j;

    public b(d dVar, x7.a aVar, l9 l9Var) {
        double d10 = aVar.f19097d;
        this.f18708a = d10;
        this.f18709b = aVar.f19098e;
        this.f18710c = aVar.f19099f * 1000;
        this.f18714g = dVar;
        this.f18715h = l9Var;
        int i10 = (int) d10;
        this.f18711d = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f18712e = arrayBlockingQueue;
        this.f18713f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f18716i = 0;
        this.f18717j = 0L;
    }

    public final int a() {
        if (this.f18717j == 0) {
            this.f18717j = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f18717j) / this.f18710c);
        int iMin = this.f18712e.size() == this.f18711d ? Math.min(100, this.f18716i + iCurrentTimeMillis) : Math.max(0, this.f18716i - iCurrentTimeMillis);
        if (this.f18716i != iMin) {
            this.f18716i = iMin;
            this.f18717j = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(r7.a aVar, l lVar) {
        String str = "Sending report through Google DataTransport: " + aVar.f16558b;
        int i10 = 3;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        ((d) this.f18714g).f(new o3.a(aVar.f16557a, o3.d.f15698f, null), new i(i10, lVar, aVar));
    }
}