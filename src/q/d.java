package q;

import a5.h;
import android.accounts.Account;
import android.content.ComponentName;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.j;
import androidx.fragment.app.m;
import androidx.fragment.app.r1;
import java.util.HashMap;
import java.util.logging.Logger;
import m.s3;
import o3.e;
import o3.f;
import p3.d;
import r3.i;
import r3.l;
import r3.q;
import r3.r;
import t7.d1;
import t7.f0;
import t7.i1;
import t7.j0;
import t7.j1;
import t7.k1;
import t7.m0;
import t7.q1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements k0.d, f {

    /* renamed from: b, reason: collision with root package name */
    public Object f16087b;

    /* renamed from: e, reason: collision with root package name */
    public Object f16088e;

    /* renamed from: f, reason: collision with root package name */
    public Object f16089f;

    /* renamed from: j, reason: collision with root package name */
    public Object f16090j;

    /* renamed from: m, reason: collision with root package name */
    public Object f16091m;

    public d(int i10) {
        if (i10 != 5) {
            return;
        }
        this.f16091m = u5.a.f18280b;
    }

    public final h a() {
        return new h((Account) this.f16087b, (t.c) this.f16088e, null, (String) this.f16089f, (String) this.f16090j, (u5.a) this.f16091m);
    }

    @Override // k0.d
    public final void b() {
        ((View) this.f16087b).clearAnimation();
        ((ViewGroup) this.f16088e).endViewTransition((View) this.f16087b);
        ((j) this.f16089f).a();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((r1) this.f16090j) + " has been cancelled.");
        }
    }

    public final f0 c() {
        String strF = ((Long) this.f16087b) == null ? " timestamp" : "";
        if (((String) this.f16088e) == null) {
            strF = strF.concat(" type");
        }
        if (((i1) this.f16089f) == null) {
            strF = a0.h.F(strF, " app");
        }
        if (((j1) this.f16090j) == null) {
            strF = a0.h.F(strF, " device");
        }
        if (strF.isEmpty()) {
            return new f0(((Long) this.f16087b).longValue(), (String) this.f16088e, (i1) this.f16089f, (j1) this.f16090j, (k1) this.f16091m);
        }
        throw new IllegalStateException("Missing required properties:".concat(strF));
    }

    public final j0 d() {
        String strF = ((String) this.f16087b) == null ? " type" : "";
        if (((q1) this.f16089f) == null) {
            strF = strF.concat(" frames");
        }
        if (((Integer) this.f16091m) == null) {
            strF = a0.h.F(strF, " overflowCount");
        }
        if (strF.isEmpty()) {
            return new j0((String) this.f16087b, (String) this.f16088e, (q1) this.f16089f, (d1) this.f16090j, ((Integer) this.f16091m).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strF));
    }

    public final m0 e() {
        String strF = ((Long) this.f16087b) == null ? " pc" : "";
        if (((String) this.f16088e) == null) {
            strF = strF.concat(" symbol");
        }
        if (((Long) this.f16090j) == null) {
            strF = a0.h.F(strF, " offset");
        }
        if (((Integer) this.f16091m) == null) {
            strF = a0.h.F(strF, " importance");
        }
        if (strF.isEmpty()) {
            return new m0(((Long) this.f16087b).longValue(), (String) this.f16088e, (String) this.f16089f, ((Long) this.f16090j).longValue(), ((Integer) this.f16091m).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strF));
    }

    public final void f(o3.a aVar, final o3.h hVar) {
        Integer num;
        q qVar = (q) this.f16091m;
        d dVar = new d(2);
        i iVar = (i) this.f16087b;
        if (iVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        dVar.f16087b = iVar;
        dVar.f16089f = aVar;
        String str = (String) this.f16088e;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        dVar.f16088e = str;
        e eVar = (e) this.f16090j;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        dVar.f16090j = eVar;
        o3.c cVar = (o3.c) this.f16089f;
        if (cVar == null) {
            throw new NullPointerException("Null encoding");
        }
        dVar.f16091m = cVar;
        String strF = ((o3.c) dVar.f16091m) == null ? a0.h.F("", " encoding") : "";
        if (!strF.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }
        i iVar2 = (i) dVar.f16087b;
        String str2 = (String) dVar.f16088e;
        o3.a aVar2 = (o3.a) dVar.f16089f;
        e eVar2 = (e) dVar.f16090j;
        o3.c cVar2 = (o3.c) dVar.f16091m;
        r rVar = (r) qVar;
        rVar.getClass();
        o3.d dVar2 = aVar2.f15692b;
        iVar2.getClass();
        g.e eVarA = i.a();
        eVarA.N(iVar2.f16409a);
        eVarA.O(dVar2);
        eVarA.f12764f = iVar2.f16410b;
        final i iVarK = eVarA.k();
        s3 s3Var = new s3(3);
        s3Var.f14932n = new HashMap();
        s3Var.f14930j = Long.valueOf(((z3.c) rVar.f16428a).a());
        s3Var.f14931m = Long.valueOf(((z3.c) rVar.f16429b).a());
        if (str2 == null) {
            throw new NullPointerException("Null transportName");
        }
        s3Var.f14927b = str2;
        s3Var.f(new l(cVar2, (byte[]) eVar2.apply(aVar2.f15691a)));
        s3Var.f14928e = null;
        o3.b bVar = aVar2.f15693c;
        if (bVar != null && (num = bVar.f15694a) != null) {
            s3Var.f14933t = num;
        }
        final r3.h hVarC = s3Var.c();
        final v3.b bVar2 = (v3.b) rVar.f16430c;
        bVar2.getClass();
        bVar2.f18390b.execute(new Runnable() { // from class: v3.a
            @Override // java.lang.Runnable
            public final void run() {
                i iVar3 = iVarK;
                o3.h hVar2 = hVar;
                r3.h hVar3 = hVarC;
                b bVar3 = bVar2;
                bVar3.getClass();
                Logger logger = b.f18388f;
                try {
                    s3.h hVarA = bVar3.f18391c.a(iVar3.f16409a);
                    int i10 = 1;
                    if (hVarA == null) {
                        String str3 = String.format("Transport backend '%s' is not registered", iVar3.f16409a);
                        logger.warning(str3);
                        hVar2.c(new IllegalArgumentException(str3));
                    } else {
                        ((x3.l) bVar3.f18393e).f(new t1.h(bVar3, iVar3, ((d) hVarA).a(hVar3), i10));
                        hVar2.c(null);
                    }
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    hVar2.c(e10);
                }
            }
        });
    }

    public d(a.e eVar, a aVar, ComponentName componentName) {
        this.f16087b = new Object();
        this.f16088e = eVar;
        this.f16089f = aVar;
        this.f16090j = componentName;
        this.f16091m = null;
    }

    public d(View view, ViewGroup viewGroup, j jVar, m mVar, r1 r1Var) {
        this.f16091m = mVar;
        this.f16087b = view;
        this.f16088e = viewGroup;
        this.f16089f = jVar;
        this.f16090j = r1Var;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f16087b = obj;
        this.f16088e = obj2;
        this.f16089f = obj3;
        this.f16090j = obj4;
        this.f16091m = obj5;
    }

    public /* synthetic */ d(f0 f0Var) {
        this(f0Var, 0);
    }

    public d(f0 f0Var, int i10) {
        this.f16087b = Long.valueOf(f0Var.f17799a);
        this.f16088e = f0Var.f17800b;
        this.f16089f = f0Var.f17801c;
        this.f16090j = f0Var.f17802d;
        this.f16091m = f0Var.f17803e;
    }
}