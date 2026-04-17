package s2;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.measurement.n3;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i0 implements h, g {

    /* renamed from: b, reason: collision with root package name */
    public final i f16750b;

    /* renamed from: e, reason: collision with root package name */
    public final g f16751e;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f16752f;

    /* renamed from: j, reason: collision with root package name */
    public volatile e f16753j;

    /* renamed from: m, reason: collision with root package name */
    public volatile Object f16754m;

    /* renamed from: n, reason: collision with root package name */
    public volatile w2.t f16755n;

    /* renamed from: t, reason: collision with root package name */
    public volatile f f16756t;

    public i0(i iVar, g gVar) {
        this.f16750b = iVar;
        this.f16751e = gVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    @Override // s2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        if (this.f16754m != null) {
            Object obj = this.f16754m;
            this.f16754m = null;
            try {
                if (!b(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f16753j != null && this.f16753j.a()) {
            return true;
        }
        this.f16753j = null;
        this.f16755n = null;
        boolean z7 = false;
        while (!z7 && this.f16752f < this.f16750b.b().size()) {
            ArrayList arrayListB = this.f16750b.b();
            int i10 = this.f16752f;
            this.f16752f = i10 + 1;
            this.f16755n = (w2.t) arrayListB.get(i10);
            if (this.f16755n != null) {
                p pVar = this.f16750b.f16747p;
                q2.a aVarC = this.f16755n.f18589c.c();
                switch (((o) pVar).f16786d) {
                    case QueueFuseable.SYNC /* 1 */:
                        if (this.f16750b.c(this.f16755n.f18589c.a()) == null) {
                            break;
                        } else {
                            this.f16755n.f18589c.d(this.f16750b.f16746o, new n3(this, this.f16755n, 19));
                            z7 = true;
                            break;
                        }
                    case 2:
                        if (aVarC == q2.a.f16115f || aVarC == q2.a.f16117m) {
                        }
                        this.f16755n.f18589c.d(this.f16750b.f16746o, new n3(this, this.f16755n, 19));
                        z7 = true;
                        break;
                    default:
                        if (aVarC == q2.a.f16114e) {
                        }
                        this.f16755n.f18589c.d(this.f16750b.f16746o, new n3(this, this.f16755n, 19));
                        z7 = true;
                        break;
                }
            }
        }
        return z7;
    }

    public final boolean b(Object obj) throws Throwable {
        int i10 = i3.i.f13294b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z7 = false;
        try {
            com.bumptech.glide.load.data.g gVarH = this.f16750b.f16734c.a().h(obj);
            Object objD = gVarH.d();
            q2.c cVarE = this.f16750b.e(objD);
            k kVar = new k(cVarE, objD, this.f16750b.f16740i);
            q2.j jVar = this.f16755n.f18587a;
            i iVar = this.f16750b;
            f fVar = new f(jVar, iVar.f16745n);
            u2.a aVarA = iVar.f16739h.a();
            aVarA.e(fVar, kVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + fVar + ", data: " + obj + ", encoder: " + cVarE + ", duration: " + i3.i.a(jElapsedRealtimeNanos));
            }
            if (aVarA.i(fVar) != null) {
                this.f16756t = fVar;
                this.f16753j = new e(Collections.singletonList(this.f16755n.f18587a), this.f16750b, this);
                this.f16755n.f18589c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f16756t + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f16751e.j(this.f16755n.f18587a, gVarH.d(), this.f16755n.f18589c, this.f16755n.f18589c.c(), this.f16755n.f18587a);
                return false;
            } catch (Throwable th) {
                th = th;
                z7 = true;
                if (!z7) {
                    this.f16755n.f18589c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // s2.g
    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // s2.h
    public final void cancel() {
        w2.t tVar = this.f16755n;
        if (tVar != null) {
            tVar.f18589c.cancel();
        }
    }

    @Override // s2.g
    public final void e(q2.j jVar, Exception exc, com.bumptech.glide.load.data.e eVar, q2.a aVar) {
        this.f16751e.e(jVar, exc, eVar, this.f16755n.f18589c.c());
    }

    @Override // s2.g
    public final void j(q2.j jVar, Object obj, com.bumptech.glide.load.data.e eVar, q2.a aVar, q2.j jVar2) {
        this.f16751e.j(jVar, obj, eVar, this.f16755n.f18589c.c(), jVar);
    }
}