package a0;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f84a;

    /* renamed from: b, reason: collision with root package name */
    public final m f85b;

    /* renamed from: c, reason: collision with root package name */
    public final l f86c;

    /* renamed from: d, reason: collision with root package name */
    public final k f87d;

    /* renamed from: e, reason: collision with root package name */
    public final n f88e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f89f;

    public j() {
        m mVar = new m();
        mVar.f142a = 0;
        mVar.f143b = 0;
        mVar.f144c = 1.0f;
        mVar.f145d = Float.NaN;
        this.f85b = mVar;
        l lVar = new l();
        lVar.f133a = -1;
        lVar.f134b = 0;
        lVar.f135c = -1;
        lVar.f136d = Float.NaN;
        lVar.f137e = Float.NaN;
        lVar.f138f = Float.NaN;
        lVar.f139g = -1;
        lVar.f140h = null;
        lVar.f141i = -1;
        this.f86c = lVar;
        k kVar = new k();
        kVar.f91a = false;
        kVar.f97d = -1;
        kVar.f99e = -1;
        kVar.f101f = -1.0f;
        kVar.f103g = true;
        kVar.f105h = -1;
        kVar.f107i = -1;
        kVar.f109j = -1;
        kVar.f111k = -1;
        kVar.f113l = -1;
        kVar.f115m = -1;
        kVar.f117n = -1;
        kVar.f119o = -1;
        kVar.f121p = -1;
        kVar.f122q = -1;
        kVar.f123r = -1;
        kVar.f124s = -1;
        kVar.f125t = -1;
        kVar.f126u = -1;
        kVar.f127v = -1;
        kVar.f128w = 0.5f;
        kVar.f129x = 0.5f;
        kVar.f130y = null;
        kVar.f131z = -1;
        kVar.A = 0;
        kVar.B = 0.0f;
        kVar.C = -1;
        kVar.D = -1;
        kVar.E = -1;
        kVar.F = 0;
        kVar.G = 0;
        kVar.H = 0;
        kVar.I = 0;
        kVar.J = 0;
        kVar.K = 0;
        kVar.L = 0;
        kVar.M = Integer.MIN_VALUE;
        kVar.N = Integer.MIN_VALUE;
        kVar.O = Integer.MIN_VALUE;
        kVar.P = Integer.MIN_VALUE;
        kVar.Q = Integer.MIN_VALUE;
        kVar.R = Integer.MIN_VALUE;
        kVar.S = Integer.MIN_VALUE;
        kVar.T = -1.0f;
        kVar.U = -1.0f;
        kVar.V = 0;
        kVar.W = 0;
        kVar.X = 0;
        kVar.Y = 0;
        kVar.Z = 0;
        kVar.f92a0 = 0;
        kVar.f94b0 = 0;
        kVar.f96c0 = 0;
        kVar.f98d0 = 1.0f;
        kVar.f100e0 = 1.0f;
        kVar.f102f0 = -1;
        kVar.f104g0 = 0;
        kVar.f106h0 = -1;
        kVar.f114l0 = false;
        kVar.f116m0 = false;
        kVar.f118n0 = true;
        kVar.f120o0 = 0;
        this.f87d = kVar;
        n nVar = new n();
        nVar.f147a = 0.0f;
        nVar.f148b = 0.0f;
        nVar.f149c = 0.0f;
        nVar.f150d = 1.0f;
        nVar.f151e = 1.0f;
        nVar.f152f = Float.NaN;
        nVar.f153g = Float.NaN;
        nVar.f154h = -1;
        nVar.f155i = 0.0f;
        nVar.f156j = 0.0f;
        nVar.f157k = 0.0f;
        nVar.f158l = false;
        nVar.f159m = 0.0f;
        this.f88e = nVar;
        this.f89f = new HashMap();
    }

    public final void a(e eVar) {
        k kVar = this.f87d;
        eVar.f27e = kVar.f105h;
        eVar.f29f = kVar.f107i;
        eVar.f31g = kVar.f109j;
        eVar.f33h = kVar.f111k;
        eVar.f35i = kVar.f113l;
        eVar.f37j = kVar.f115m;
        eVar.f39k = kVar.f117n;
        eVar.f41l = kVar.f119o;
        eVar.f43m = kVar.f121p;
        eVar.f45n = kVar.f122q;
        eVar.f47o = kVar.f123r;
        eVar.f53s = kVar.f124s;
        eVar.f54t = kVar.f125t;
        eVar.f55u = kVar.f126u;
        eVar.f56v = kVar.f127v;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = kVar.F;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = kVar.G;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = kVar.H;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = kVar.I;
        eVar.A = kVar.R;
        eVar.B = kVar.Q;
        eVar.f58x = kVar.N;
        eVar.f60z = kVar.P;
        eVar.E = kVar.f128w;
        eVar.F = kVar.f129x;
        eVar.f49p = kVar.f131z;
        eVar.f51q = kVar.A;
        eVar.f52r = kVar.B;
        eVar.G = kVar.f130y;
        eVar.T = kVar.C;
        eVar.U = kVar.D;
        eVar.I = kVar.T;
        eVar.H = kVar.U;
        eVar.K = kVar.W;
        eVar.J = kVar.V;
        eVar.W = kVar.f114l0;
        eVar.X = kVar.f116m0;
        eVar.L = kVar.X;
        eVar.M = kVar.Y;
        eVar.P = kVar.Z;
        eVar.Q = kVar.f92a0;
        eVar.N = kVar.f94b0;
        eVar.O = kVar.f96c0;
        eVar.R = kVar.f98d0;
        eVar.S = kVar.f100e0;
        eVar.V = kVar.E;
        eVar.f23c = kVar.f101f;
        eVar.f19a = kVar.f97d;
        eVar.f21b = kVar.f99e;
        ((ViewGroup.MarginLayoutParams) eVar).width = kVar.f93b;
        ((ViewGroup.MarginLayoutParams) eVar).height = kVar.f95c;
        String str = kVar.f112k0;
        if (str != null) {
            eVar.Y = str;
        }
        eVar.Z = kVar.f120o0;
        eVar.setMarginStart(kVar.K);
        eVar.setMarginEnd(kVar.J);
        eVar.a();
    }

    public final Object clone() {
        j jVar = new j();
        k kVar = jVar.f87d;
        kVar.getClass();
        k kVar2 = this.f87d;
        kVar.f91a = kVar2.f91a;
        kVar.f93b = kVar2.f93b;
        kVar.f95c = kVar2.f95c;
        kVar.f97d = kVar2.f97d;
        kVar.f99e = kVar2.f99e;
        kVar.f101f = kVar2.f101f;
        kVar.f103g = kVar2.f103g;
        kVar.f105h = kVar2.f105h;
        kVar.f107i = kVar2.f107i;
        kVar.f109j = kVar2.f109j;
        kVar.f111k = kVar2.f111k;
        kVar.f113l = kVar2.f113l;
        kVar.f115m = kVar2.f115m;
        kVar.f117n = kVar2.f117n;
        kVar.f119o = kVar2.f119o;
        kVar.f121p = kVar2.f121p;
        kVar.f122q = kVar2.f122q;
        kVar.f123r = kVar2.f123r;
        kVar.f124s = kVar2.f124s;
        kVar.f125t = kVar2.f125t;
        kVar.f126u = kVar2.f126u;
        kVar.f127v = kVar2.f127v;
        kVar.f128w = kVar2.f128w;
        kVar.f129x = kVar2.f129x;
        kVar.f130y = kVar2.f130y;
        kVar.f131z = kVar2.f131z;
        kVar.A = kVar2.A;
        kVar.B = kVar2.B;
        kVar.C = kVar2.C;
        kVar.D = kVar2.D;
        kVar.E = kVar2.E;
        kVar.F = kVar2.F;
        kVar.G = kVar2.G;
        kVar.H = kVar2.H;
        kVar.I = kVar2.I;
        kVar.J = kVar2.J;
        kVar.K = kVar2.K;
        kVar.L = kVar2.L;
        kVar.M = kVar2.M;
        kVar.N = kVar2.N;
        kVar.O = kVar2.O;
        kVar.P = kVar2.P;
        kVar.Q = kVar2.Q;
        kVar.R = kVar2.R;
        kVar.S = kVar2.S;
        kVar.T = kVar2.T;
        kVar.U = kVar2.U;
        kVar.V = kVar2.V;
        kVar.W = kVar2.W;
        kVar.X = kVar2.X;
        kVar.Y = kVar2.Y;
        kVar.Z = kVar2.Z;
        kVar.f92a0 = kVar2.f92a0;
        kVar.f94b0 = kVar2.f94b0;
        kVar.f96c0 = kVar2.f96c0;
        kVar.f98d0 = kVar2.f98d0;
        kVar.f100e0 = kVar2.f100e0;
        kVar.f102f0 = kVar2.f102f0;
        kVar.f104g0 = kVar2.f104g0;
        kVar.f106h0 = kVar2.f106h0;
        kVar.f112k0 = kVar2.f112k0;
        int[] iArr = kVar2.f108i0;
        if (iArr == null || kVar2.f110j0 != null) {
            kVar.f108i0 = null;
        } else {
            kVar.f108i0 = Arrays.copyOf(iArr, iArr.length);
        }
        kVar.f110j0 = kVar2.f110j0;
        kVar.f114l0 = kVar2.f114l0;
        kVar.f116m0 = kVar2.f116m0;
        kVar.f118n0 = kVar2.f118n0;
        kVar.f120o0 = kVar2.f120o0;
        l lVar = jVar.f86c;
        lVar.getClass();
        l lVar2 = this.f86c;
        lVar2.getClass();
        lVar.f133a = lVar2.f133a;
        lVar.f135c = lVar2.f135c;
        lVar.f137e = lVar2.f137e;
        lVar.f136d = lVar2.f136d;
        m mVar = jVar.f85b;
        mVar.getClass();
        m mVar2 = this.f85b;
        mVar2.getClass();
        mVar.f142a = mVar2.f142a;
        mVar.f144c = mVar2.f144c;
        mVar.f145d = mVar2.f145d;
        mVar.f143b = mVar2.f143b;
        n nVar = jVar.f88e;
        nVar.getClass();
        n nVar2 = this.f88e;
        nVar2.getClass();
        nVar.f147a = nVar2.f147a;
        nVar.f148b = nVar2.f148b;
        nVar.f149c = nVar2.f149c;
        nVar.f150d = nVar2.f150d;
        nVar.f151e = nVar2.f151e;
        nVar.f152f = nVar2.f152f;
        nVar.f153g = nVar2.f153g;
        nVar.f154h = nVar2.f154h;
        nVar.f155i = nVar2.f155i;
        nVar.f156j = nVar2.f156j;
        nVar.f157k = nVar2.f157k;
        nVar.f158l = nVar2.f158l;
        nVar.f159m = nVar2.f159m;
        jVar.f84a = this.f84a;
        return jVar;
    }
}