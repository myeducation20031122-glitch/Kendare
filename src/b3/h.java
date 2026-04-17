package b3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.o;
import com.bumptech.glide.q;
import java.util.ArrayList;
import q2.r;
import s2.p;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final p2.a f1869a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1870b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1871c;

    /* renamed from: d, reason: collision with root package name */
    public final q f1872d;

    /* renamed from: e, reason: collision with root package name */
    public final t2.d f1873e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1874f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1875g;

    /* renamed from: h, reason: collision with root package name */
    public o f1876h;

    /* renamed from: i, reason: collision with root package name */
    public e f1877i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1878j;

    /* renamed from: k, reason: collision with root package name */
    public e f1879k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f1880l;

    /* renamed from: m, reason: collision with root package name */
    public e f1881m;

    /* renamed from: n, reason: collision with root package name */
    public int f1882n;

    /* renamed from: o, reason: collision with root package name */
    public int f1883o;

    /* renamed from: p, reason: collision with root package name */
    public int f1884p;

    public h(com.bumptech.glide.b bVar, p2.e eVar, int i10, int i11, y2.c cVar, Bitmap bitmap) {
        t2.d dVar = bVar.f2230b;
        com.bumptech.glide.h hVar = bVar.f2232f;
        Context baseContext = hVar.getBaseContext();
        if (baseContext == null) {
            throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        }
        q qVarB = com.bumptech.glide.b.b(baseContext).f2234m.b(baseContext);
        Context baseContext2 = hVar.getBaseContext();
        if (baseContext2 == null) {
            throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        }
        q qVarB2 = com.bumptech.glide.b.b(baseContext2).f2234m.b(baseContext2);
        qVarB2.getClass();
        o oVarT = new o(qVarB2.f2390b, qVarB2, Bitmap.class, qVarB2.f2391e).t(q.N).t(((e3.e) ((e3.e) ((e3.e) new e3.e().e(p.f16787a)).r()).o()).i(i10, i11));
        this.f1871c = new ArrayList();
        this.f1872d = qVarB;
        Handler handler = new Handler(Looper.getMainLooper(), new g(this, 0));
        this.f1873e = dVar;
        this.f1870b = handler;
        this.f1876h = oVarT;
        this.f1869a = eVar;
        c(cVar, bitmap);
    }

    public final void a() {
        int i10;
        if (!this.f1874f || this.f1875g) {
            return;
        }
        e eVar = this.f1881m;
        if (eVar != null) {
            this.f1881m = null;
            b(eVar);
            return;
        }
        this.f1875g = true;
        p2.a aVar = this.f1869a;
        p2.e eVar2 = (p2.e) aVar;
        int i11 = eVar2.f15907l.f15883c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((i11 <= 0 || (i10 = eVar2.f15906k) < 0) ? 0 : (i10 < 0 || i10 >= i11) ? -1 : ((p2.b) r3.f15885e.get(i10)).f15878i);
        int i12 = (eVar2.f15906k + 1) % eVar2.f15907l.f15883c;
        eVar2.f15906k = i12;
        this.f1879k = new e(this.f1870b, i12, jUptimeMillis);
        o oVarY = this.f1876h.t((e3.e) new e3.e().n(new h3.d(Double.valueOf(Math.random())))).y(aVar);
        oVarY.x(this.f1879k, oVarY);
    }

    public final void b(e eVar) {
        this.f1875g = false;
        boolean z7 = this.f1878j;
        Handler handler = this.f1870b;
        if (z7) {
            handler.obtainMessage(2, eVar).sendToTarget();
            return;
        }
        if (!this.f1874f) {
            this.f1881m = eVar;
            return;
        }
        if (eVar.f1866t != null) {
            Bitmap bitmap = this.f1880l;
            if (bitmap != null) {
                this.f1873e.c(bitmap);
                this.f1880l = null;
            }
            e eVar2 = this.f1877i;
            this.f1877i = eVar;
            ArrayList arrayList = this.f1871c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) ((f) arrayList.get(size));
                Object callback = cVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    cVar.stop();
                    cVar.invalidateSelf();
                } else {
                    cVar.invalidateSelf();
                    e eVar3 = cVar.f1850b.f1849a.f1877i;
                    if ((eVar3 != null ? eVar3.f1864m : -1) == ((p2.e) r5.f1869a).f15907l.f15883c - 1) {
                        cVar.f1855n++;
                    }
                    int i10 = cVar.f1856t;
                    if (i10 != -1 && cVar.f1855n >= i10) {
                        cVar.stop();
                    }
                }
            }
            if (eVar2 != null) {
                handler.obtainMessage(2, eVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(r rVar, Bitmap bitmap) {
        if (rVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        if (bitmap == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f1880l = bitmap;
        this.f1876h = this.f1876h.t(new e3.e().q(rVar, true));
        this.f1882n = i3.o.c(bitmap);
        this.f1883o = bitmap.getWidth();
        this.f1884p = bitmap.getHeight();
    }
}