package e3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.i;
import com.google.android.gms.internal.ads.ic1;
import g.w;
import i3.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import s2.a0;
import s2.e0;
import s2.q;
import s2.u;
import w2.k;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements c, f3.d, f {
    public static final boolean C = Log.isLoggable("GlideRequest", 2);
    public final RuntimeException A;
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public final String f12486a;

    /* renamed from: b, reason: collision with root package name */
    public final j3.e f12487b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12488c;

    /* renamed from: d, reason: collision with root package name */
    public final d f12489d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f12490e;

    /* renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.h f12491f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f12492g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f12493h;

    /* renamed from: i, reason: collision with root package name */
    public final a f12494i;

    /* renamed from: j, reason: collision with root package name */
    public final int f12495j;

    /* renamed from: k, reason: collision with root package name */
    public final int f12496k;

    /* renamed from: l, reason: collision with root package name */
    public final i f12497l;

    /* renamed from: m, reason: collision with root package name */
    public final f3.e f12498m;

    /* renamed from: n, reason: collision with root package name */
    public final List f12499n;

    /* renamed from: o, reason: collision with root package name */
    public final k f12500o;

    /* renamed from: p, reason: collision with root package name */
    public final Executor f12501p;

    /* renamed from: q, reason: collision with root package name */
    public e0 f12502q;

    /* renamed from: r, reason: collision with root package name */
    public s2.k f12503r;

    /* renamed from: s, reason: collision with root package name */
    public long f12504s;

    /* renamed from: t, reason: collision with root package name */
    public volatile q f12505t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f12506u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f12507v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f12508w;

    /* renamed from: x, reason: collision with root package name */
    public int f12509x;

    /* renamed from: y, reason: collision with root package name */
    public int f12510y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12511z;

    public g(Context context, com.bumptech.glide.h hVar, Object obj, Object obj2, Class cls, a aVar, int i10, int i11, i iVar, f3.e eVar, ArrayList arrayList, d dVar, q qVar, k kVar) {
        w wVar = i3.g.f13291a;
        this.f12486a = C ? String.valueOf(hashCode()) : null;
        this.f12487b = new j3.e();
        this.f12488c = obj;
        this.f12490e = context;
        this.f12491f = hVar;
        this.f12492g = obj2;
        this.f12493h = cls;
        this.f12494i = aVar;
        this.f12495j = i10;
        this.f12496k = i11;
        this.f12497l = iVar;
        this.f12498m = eVar;
        this.f12499n = arrayList;
        this.f12489d = dVar;
        this.f12505t = qVar;
        this.f12500o = kVar;
        this.f12501p = wVar;
        this.B = 1;
        if (this.A == null && hVar.f2273h.f19470a.containsKey(com.bumptech.glide.d.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // e3.c
    public final boolean a() {
        boolean z7;
        synchronized (this.f12488c) {
            z7 = this.B == 4;
        }
        return z7;
    }

    public final void b() {
        if (this.f12511z) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f12487b.a();
        this.f12498m.e(this);
        s2.k kVar = this.f12503r;
        if (kVar != null) {
            synchronized (((q) kVar.f16759c)) {
                ((u) kVar.f16757a).j((f) kVar.f16758b);
            }
            this.f12503r = null;
        }
    }

    public final Drawable c() {
        int i10;
        if (this.f12507v == null) {
            a aVar = this.f12494i;
            Drawable drawable = aVar.f12477t;
            this.f12507v = drawable;
            if (drawable == null && (i10 = aVar.f12478u) > 0) {
                this.f12507v = f(i10);
            }
        }
        return this.f12507v;
    }

    @Override // e3.c
    public final void clear() {
        synchronized (this.f12488c) {
            try {
                if (this.f12511z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f12487b.a();
                if (this.B == 6) {
                    return;
                }
                b();
                e0 e0Var = this.f12502q;
                if (e0Var != null) {
                    this.f12502q = null;
                } else {
                    e0Var = null;
                }
                d dVar = this.f12489d;
                if (dVar == null || dVar.h(this)) {
                    this.f12498m.h(c());
                }
                this.B = 6;
                if (e0Var != null) {
                    this.f12505t.getClass();
                    q.g(e0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e3.c
    public final boolean d(c cVar) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        a aVar;
        i iVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class cls2;
        a aVar2;
        i iVar2;
        int size2;
        if (!(cVar instanceof g)) {
            return false;
        }
        synchronized (this.f12488c) {
            try {
                i10 = this.f12495j;
                i11 = this.f12496k;
                obj = this.f12492g;
                cls = this.f12493h;
                aVar = this.f12494i;
                iVar = this.f12497l;
                List list = this.f12499n;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        g gVar = (g) cVar;
        synchronized (gVar.f12488c) {
            try {
                i12 = gVar.f12495j;
                i13 = gVar.f12496k;
                obj2 = gVar.f12492g;
                cls2 = gVar.f12493h;
                aVar2 = gVar.f12494i;
                iVar2 = gVar.f12497l;
                List list2 = gVar.f12499n;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i10 == i12 && i11 == i13) {
            char[] cArr = o.f13305a;
            if (obj != null ? obj.equals(obj2) : obj2 == null) {
                if (cls.equals(cls2) && aVar.equals(aVar2) && iVar == iVar2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // e3.c
    public final boolean e() {
        boolean z7;
        synchronized (this.f12488c) {
            z7 = this.B == 6;
        }
        return z7;
    }

    public final Drawable f(int i10) {
        Resources.Theme theme = this.f12494i.X;
        if (theme == null) {
            theme = this.f12490e.getTheme();
        }
        com.bumptech.glide.h hVar = this.f12491f;
        return c7.b.g(hVar, hVar, i10, theme);
    }

    public final void g(String str) {
        StringBuilder sbO = ic1.o(str, " this: ");
        sbO.append(this.f12486a);
        Log.v("GlideRequest", sbO.toString());
    }

    public final void h(a0 a0Var, int i10) {
        int i11;
        int i12;
        this.f12487b.a();
        synchronized (this.f12488c) {
            try {
                a0Var.getClass();
                int i13 = this.f12491f.f2274i;
                if (i13 <= i10) {
                    Log.w("Glide", "Load failed for [" + this.f12492g + "] with dimensions [" + this.f12509x + "x" + this.f12510y + "]", a0Var);
                    if (i13 <= 4) {
                        a0Var.e();
                    }
                }
                Drawable drawableC = null;
                this.f12503r = null;
                this.B = 5;
                d dVar = this.f12489d;
                if (dVar != null) {
                    dVar.g(this);
                }
                this.f12511z = true;
                try {
                    List list = this.f12499n;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            ic1.v(it.next());
                            d dVar2 = this.f12489d;
                            if (dVar2 == null) {
                                throw null;
                            }
                            dVar2.i().a();
                            throw null;
                        }
                    }
                    d dVar3 = this.f12489d;
                    if (dVar3 == null || dVar3.b(this)) {
                        if (this.f12492g == null) {
                            if (this.f12508w == null) {
                                a aVar = this.f12494i;
                                Drawable drawable = aVar.R;
                                this.f12508w = drawable;
                                if (drawable == null && (i12 = aVar.S) > 0) {
                                    this.f12508w = f(i12);
                                }
                            }
                            drawableC = this.f12508w;
                        }
                        if (drawableC == null) {
                            if (this.f12506u == null) {
                                a aVar2 = this.f12494i;
                                Drawable drawable2 = aVar2.f12475m;
                                this.f12506u = drawable2;
                                if (drawable2 == null && (i11 = aVar2.f12476n) > 0) {
                                    this.f12506u = f(i11);
                                }
                            }
                            drawableC = this.f12506u;
                        }
                        if (drawableC == null) {
                            drawableC = c();
                        }
                        this.f12498m.b(drawableC);
                    }
                    this.f12511z = false;
                } catch (Throwable th) {
                    this.f12511z = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(e0 e0Var, Object obj, q2.a aVar) {
        d dVar = this.f12489d;
        if (dVar != null) {
            dVar.i().a();
        }
        this.B = 4;
        this.f12502q = e0Var;
        if (this.f12491f.f2274i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f12492g + " with size [" + this.f12509x + "x" + this.f12510y + "] in " + i3.i.a(this.f12504s) + " ms");
        }
        if (dVar != null) {
            dVar.c(this);
        }
        this.f12511z = true;
        try {
            List list = this.f12499n;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    ic1.v(it.next());
                    throw null;
                }
            }
            this.f12500o.getClass();
            this.f12498m.i(obj);
            this.f12511z = false;
        } catch (Throwable th) {
            this.f12511z = false;
            throw th;
        }
    }

    @Override // e3.c
    public final boolean isRunning() {
        boolean z7;
        synchronized (this.f12488c) {
            int i10 = this.B;
            z7 = i10 == 2 || i10 == 3;
        }
        return z7;
    }

    @Override // e3.c
    public final void j() {
        synchronized (this.f12488c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e3.c
    public final void k() {
        d dVar;
        int i10;
        synchronized (this.f12488c) {
            try {
                if (this.f12511z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f12487b.a();
                int i11 = i3.i.f13294b;
                this.f12504s = SystemClock.elapsedRealtimeNanos();
                if (this.f12492g == null) {
                    if (o.j(this.f12495j, this.f12496k)) {
                        this.f12509x = this.f12495j;
                        this.f12510y = this.f12496k;
                    }
                    if (this.f12508w == null) {
                        a aVar = this.f12494i;
                        Drawable drawable = aVar.R;
                        this.f12508w = drawable;
                        if (drawable == null && (i10 = aVar.S) > 0) {
                            this.f12508w = f(i10);
                        }
                    }
                    h(new a0("Received null model"), this.f12508w == null ? 5 : 3);
                    return;
                }
                int i12 = this.B;
                if (i12 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i12 == 4) {
                    m(this.f12502q, q2.a.f16117m, false);
                    return;
                }
                List list = this.f12499n;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ic1.v(it.next());
                    }
                }
                this.B = 3;
                if (o.j(this.f12495j, this.f12496k)) {
                    n(this.f12495j, this.f12496k);
                } else {
                    this.f12498m.a(this);
                }
                int i13 = this.B;
                if ((i13 == 2 || i13 == 3) && ((dVar = this.f12489d) == null || dVar.b(this))) {
                    this.f12498m.f(c());
                }
                if (C) {
                    g("finished run method in " + i3.i.a(this.f12504s));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e3.c
    public final boolean l() {
        boolean z7;
        synchronized (this.f12488c) {
            z7 = this.B == 4;
        }
        return z7;
    }

    public final void m(e0 e0Var, q2.a aVar, boolean z7) {
        this.f12487b.a();
        e0 e0Var2 = null;
        try {
            synchronized (this.f12488c) {
                try {
                    this.f12503r = null;
                    if (e0Var == null) {
                        h(new a0("Expected to receive a Resource<R> with an object of " + this.f12493h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = e0Var.get();
                    try {
                        if (obj != null && this.f12493h.isAssignableFrom(obj.getClass())) {
                            d dVar = this.f12489d;
                            if (dVar == null || dVar.f(this)) {
                                i(e0Var, obj, aVar);
                                return;
                            }
                            this.f12502q = null;
                            this.B = 4;
                            this.f12505t.getClass();
                            q.g(e0Var);
                            return;
                        }
                        this.f12502q = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.f12493h);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(e0Var);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        h(new a0(sb.toString()), 5);
                        this.f12505t.getClass();
                        q.g(e0Var);
                    } catch (Throwable th) {
                        e0Var2 = e0Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (e0Var2 != null) {
                this.f12505t.getClass();
                q.g(e0Var2);
            }
            throw th3;
        }
    }

    public final void n(int i10, int i11) {
        Object obj;
        int iRound = i10;
        this.f12487b.a();
        Object obj2 = this.f12488c;
        synchronized (obj2) {
            try {
                try {
                    boolean z7 = C;
                    if (z7) {
                        g("Got onSizeReady in " + i3.i.a(this.f12504s));
                    }
                    if (this.B == 3) {
                        this.B = 2;
                        float f10 = this.f12494i.f12472e;
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * f10);
                        }
                        this.f12509x = iRound;
                        this.f12510y = i11 == Integer.MIN_VALUE ? i11 : Math.round(f10 * i11);
                        if (z7) {
                            g("finished setup for calling load in " + i3.i.a(this.f12504s));
                        }
                        q qVar = this.f12505t;
                        com.bumptech.glide.h hVar = this.f12491f;
                        Object obj3 = this.f12492g;
                        a aVar = this.f12494i;
                        try {
                            obj = obj2;
                            try {
                                this.f12503r = qVar.a(hVar, obj3, aVar.O, this.f12509x, this.f12510y, aVar.V, this.f12493h, this.f12497l, aVar.f12473f, aVar.U, aVar.P, aVar.f12470b0, aVar.T, aVar.f12479w, aVar.Z, aVar.f12471c0, aVar.f12468a0, this, this.f12501p);
                                if (this.B != 2) {
                                    this.f12503r = null;
                                }
                                if (z7) {
                                    g("finished onSizeReady in " + i3.i.a(this.f12504s));
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f12488c) {
            obj = this.f12492g;
            cls = this.f12493h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}