package e3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.g1;
import com.bumptech.glide.i;
import q2.j;
import q2.n;
import q2.r;
import s2.o;
import s2.p;
import z2.m;
import z2.s;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a implements Cloneable {
    public boolean P;
    public Drawable R;
    public int S;
    public boolean W;
    public Resources.Theme X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f12468a0;

    /* renamed from: b, reason: collision with root package name */
    public int f12469b;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f12471c0;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f12475m;

    /* renamed from: n, reason: collision with root package name */
    public int f12476n;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f12477t;

    /* renamed from: u, reason: collision with root package name */
    public int f12478u;

    /* renamed from: e, reason: collision with root package name */
    public float f12472e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public p f12473f = p.f16789c;

    /* renamed from: j, reason: collision with root package name */
    public i f12474j = i.f2278f;

    /* renamed from: w, reason: collision with root package name */
    public boolean f12479w = true;
    public int M = -1;
    public int N = -1;
    public j O = h3.c.f13192b;
    public boolean Q = true;
    public n T = new n();
    public i3.d U = new i3.d();
    public Class V = Object.class;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f12470b0 = true;

    public static boolean f(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public a b(a aVar) {
        if (this.Y) {
            return clone().b(aVar);
        }
        if (f(aVar.f12469b, 2)) {
            this.f12472e = aVar.f12472e;
        }
        if (f(aVar.f12469b, 262144)) {
            this.Z = aVar.Z;
        }
        if (f(aVar.f12469b, 1048576)) {
            this.f12471c0 = aVar.f12471c0;
        }
        if (f(aVar.f12469b, 4)) {
            this.f12473f = aVar.f12473f;
        }
        if (f(aVar.f12469b, 8)) {
            this.f12474j = aVar.f12474j;
        }
        if (f(aVar.f12469b, 16)) {
            this.f12475m = aVar.f12475m;
            this.f12476n = 0;
            this.f12469b &= -33;
        }
        if (f(aVar.f12469b, 32)) {
            this.f12476n = aVar.f12476n;
            this.f12475m = null;
            this.f12469b &= -17;
        }
        if (f(aVar.f12469b, 64)) {
            this.f12477t = aVar.f12477t;
            this.f12478u = 0;
            this.f12469b &= -129;
        }
        if (f(aVar.f12469b, 128)) {
            this.f12478u = aVar.f12478u;
            this.f12477t = null;
            this.f12469b &= -65;
        }
        if (f(aVar.f12469b, 256)) {
            this.f12479w = aVar.f12479w;
        }
        if (f(aVar.f12469b, 512)) {
            this.N = aVar.N;
            this.M = aVar.M;
        }
        if (f(aVar.f12469b, 1024)) {
            this.O = aVar.O;
        }
        if (f(aVar.f12469b, g1.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            this.V = aVar.V;
        }
        if (f(aVar.f12469b, 8192)) {
            this.R = aVar.R;
            this.S = 0;
            this.f12469b &= -16385;
        }
        if (f(aVar.f12469b, 16384)) {
            this.S = aVar.S;
            this.R = null;
            this.f12469b &= -8193;
        }
        if (f(aVar.f12469b, 32768)) {
            this.X = aVar.X;
        }
        if (f(aVar.f12469b, 65536)) {
            this.Q = aVar.Q;
        }
        if (f(aVar.f12469b, 131072)) {
            this.P = aVar.P;
        }
        if (f(aVar.f12469b, g1.FLAG_MOVED)) {
            this.U.putAll(aVar.U);
            this.f12470b0 = aVar.f12470b0;
        }
        if (f(aVar.f12469b, 524288)) {
            this.f12468a0 = aVar.f12468a0;
        }
        if (!this.Q) {
            this.U.clear();
            int i10 = this.f12469b;
            this.P = false;
            this.f12469b = i10 & (-133121);
            this.f12470b0 = true;
        }
        this.f12469b |= aVar.f12469b;
        this.T.f16133b.j(aVar.T.f16133b);
        l();
        return this;
    }

    @Override // 
    /* renamed from: c */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            n nVar = new n();
            aVar.T = nVar;
            nVar.f16133b.j(this.T.f16133b);
            i3.d dVar = new i3.d();
            aVar.U = dVar;
            dVar.putAll(this.U);
            aVar.W = false;
            aVar.Y = false;
            return aVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final a d(Class cls) {
        if (this.Y) {
            return clone().d(cls);
        }
        this.V = cls;
        this.f12469b |= g1.FLAG_APPEARED_IN_PRE_LAYOUT;
        l();
        return this;
    }

    public final a e(o oVar) {
        if (this.Y) {
            return clone().e(oVar);
        }
        this.f12473f = oVar;
        this.f12469b |= 4;
        l();
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(aVar.f12472e, this.f12472e) == 0 && this.f12476n == aVar.f12476n && i3.o.b(this.f12475m, aVar.f12475m) && this.f12478u == aVar.f12478u && i3.o.b(this.f12477t, aVar.f12477t) && this.S == aVar.S && i3.o.b(this.R, aVar.R) && this.f12479w == aVar.f12479w && this.M == aVar.M && this.N == aVar.N && this.P == aVar.P && this.Q == aVar.Q && this.Z == aVar.Z && this.f12468a0 == aVar.f12468a0 && this.f12473f.equals(aVar.f12473f) && this.f12474j == aVar.f12474j && this.T.equals(aVar.T) && this.U.equals(aVar.U) && this.V.equals(aVar.V) && i3.o.b(this.O, aVar.O) && i3.o.b(this.X, aVar.X);
    }

    public final a g(m mVar, z2.e eVar) {
        if (this.Y) {
            return clone().g(mVar, eVar);
        }
        m(z2.n.f19543f, mVar);
        return q(eVar, false);
    }

    public int hashCode() {
        float f10 = this.f12472e;
        char[] cArr = i3.o.f13305a;
        return i3.o.h(i3.o.h(i3.o.h(i3.o.h(i3.o.h(i3.o.h(i3.o.h(i3.o.i(i3.o.i(i3.o.i(i3.o.i(i3.o.g(this.N, i3.o.g(this.M, i3.o.i(i3.o.h(i3.o.g(this.S, i3.o.h(i3.o.g(this.f12478u, i3.o.h(i3.o.g(this.f12476n, i3.o.g(Float.floatToIntBits(f10), 17)), this.f12475m)), this.f12477t)), this.R), this.f12479w))), this.P), this.Q), this.Z), this.f12468a0), this.f12473f), this.f12474j), this.T), this.U), this.V), this.O), this.X);
    }

    public final a i(int i10, int i11) {
        if (this.Y) {
            return clone().i(i10, i11);
        }
        this.N = i10;
        this.M = i11;
        this.f12469b |= 512;
        l();
        return this;
    }

    public final a j() {
        if (this.Y) {
            return clone().j();
        }
        this.f12478u = 2131165305;
        int i10 = this.f12469b | 128;
        this.f12477t = null;
        this.f12469b = i10 & (-65);
        l();
        return this;
    }

    public final a k() {
        i iVar = i.f2279j;
        if (this.Y) {
            return clone().k();
        }
        this.f12474j = iVar;
        this.f12469b |= 8;
        l();
        return this;
    }

    public final void l() {
        if (this.W) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a m(q2.m mVar, m mVar2) {
        if (this.Y) {
            return clone().m(mVar, mVar2);
        }
        g5.a.f(mVar);
        this.T.f16133b.put(mVar, mVar2);
        l();
        return this;
    }

    public final a n(j jVar) {
        if (this.Y) {
            return clone().n(jVar);
        }
        this.O = jVar;
        this.f12469b |= 1024;
        l();
        return this;
    }

    public final a o() {
        if (this.Y) {
            return clone().o();
        }
        this.f12479w = false;
        this.f12469b |= 256;
        l();
        return this;
    }

    public final a p(Class cls, r rVar, boolean z7) {
        if (this.Y) {
            return clone().p(cls, rVar, z7);
        }
        g5.a.f(rVar);
        this.U.put(cls, rVar);
        int i10 = this.f12469b;
        this.Q = true;
        this.f12469b = 67584 | i10;
        this.f12470b0 = false;
        if (z7) {
            this.f12469b = i10 | 198656;
            this.P = true;
        }
        l();
        return this;
    }

    public final a q(r rVar, boolean z7) {
        if (this.Y) {
            return clone().q(rVar, z7);
        }
        s sVar = new s(rVar, z7);
        p(Bitmap.class, rVar, z7);
        p(Drawable.class, sVar, z7);
        p(BitmapDrawable.class, sVar, z7);
        p(b3.c.class, new b3.d(rVar), z7);
        l();
        return this;
    }

    public final a r() {
        if (this.Y) {
            return clone().r();
        }
        this.f12471c0 = true;
        this.f12469b |= 1048576;
        l();
        return this;
    }
}