package z4;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e0 implements p0, g1 {
    public final g5.a M;
    public volatile c0 N;
    public int O;
    public final b0 P;
    public final n0 Q;

    /* renamed from: b, reason: collision with root package name */
    public final Lock f19622b;

    /* renamed from: e, reason: collision with root package name */
    public final Condition f19623e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f19624f;

    /* renamed from: j, reason: collision with root package name */
    public final x4.g f19625j;

    /* renamed from: m, reason: collision with root package name */
    public final z f19626m;

    /* renamed from: n, reason: collision with root package name */
    public final Map f19627n;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f19628t = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    public final a5.h f19629u;

    /* renamed from: w, reason: collision with root package name */
    public final Map f19630w;

    public e0(Context context, b0 b0Var, Lock lock, Looper looper, x4.f fVar, Map map, a5.h hVar, Map map2, g5.a aVar, ArrayList arrayList, n0 n0Var) {
        this.f19624f = context;
        this.f19622b = lock;
        this.f19625j = fVar;
        this.f19627n = map;
        this.f19629u = hVar;
        this.f19630w = map2;
        this.M = aVar;
        this.P = b0Var;
        this.Q = n0Var;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f1) arrayList.get(i10)).f19635f = this;
        }
        this.f19626m = new z(this, looper, 1);
        this.f19623e = lock.newCondition();
        this.N = new d9.c(this);
    }

    @Override // z4.f
    public final void A(int i10) {
        this.f19622b.lock();
        try {
            this.N.c(i10);
        } finally {
            this.f19622b.unlock();
        }
    }

    @Override // z4.f
    public final void T(Bundle bundle) {
        this.f19622b.lock();
        try {
            this.N.b(bundle);
        } finally {
            this.f19622b.unlock();
        }
    }

    @Override // z4.p0
    public final void a() {
        this.N.e();
    }

    @Override // z4.p0
    public final void b() {
        if (this.N.g()) {
            this.f19628t.clear();
        }
    }

    @Override // z4.p0
    public final p5.c c(p5.c cVar) {
        cVar.p0();
        return this.N.f(cVar);
    }

    @Override // z4.p0
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.N);
        for (y4.e eVar : this.f19630w.keySet()) {
            String strValueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) eVar.f19237c).println(":");
            y4.c cVar = (y4.c) this.f19627n.get(eVar.f19236b);
            fc.t.k(cVar);
            cVar.k(strValueOf.concat("  "), printWriter);
        }
    }

    @Override // z4.p0
    public final boolean e() {
        return this.N instanceof s;
    }

    public final void f() {
        this.f19622b.lock();
        try {
            this.N = new d9.c(this);
            this.N.d();
            this.f19623e.signalAll();
        } finally {
            this.f19622b.unlock();
        }
    }

    @Override // z4.g1
    public final void p1(x4.b bVar, y4.e eVar, boolean z7) {
        this.f19622b.lock();
        try {
            this.N.h(bVar, eVar, z7);
        } finally {
            this.f19622b.unlock();
        }
    }
}