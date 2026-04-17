package t5;

import android.os.Bundle;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class n4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17517b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f17518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v4 f17519f;

    public /* synthetic */ n4(v4 v4Var, Bundle bundle, int i10) {
        this.f17517b = i10;
        this.f17519f = v4Var;
        this.f17518e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f17517b;
        Bundle bundle = this.f17518e;
        v4 v4Var = this.f17519f;
        switch (i10) {
            case 0:
                Object obj = v4Var.f15046b;
                if (bundle != null) {
                    b4 b4Var = (b4) obj;
                    q3 q3Var = b4Var.f17250u;
                    b4.g(q3Var);
                    Bundle bundleN = q3Var.Y.n();
                    Iterator<String> it = bundle.keySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        p5.m mVar = v4Var.S;
                        i3 i3Var = b4Var.f17251w;
                        b6 b6Var = b4Var.O;
                        if (!zHasNext) {
                            b4.g(b6Var);
                            int iR = b4Var.f17249t.r();
                            if (bundleN.size() > iR) {
                                Iterator it2 = new TreeSet(bundleN.keySet()).iterator();
                                int i11 = 0;
                                while (it2.hasNext()) {
                                    String str = (String) it2.next();
                                    i11++;
                                    if (i11 > iR) {
                                        bundleN.remove(str);
                                    }
                                }
                                b4.g(b6Var);
                                b6Var.getClass();
                                b6.F(mVar, null, 26, null, null, 0);
                                b4.i(i3Var);
                                i3Var.N.a("Too many default event parameters set. Discarding beyond event parameter limit");
                            }
                            q3 q3Var2 = b4Var.f17250u;
                            b4.g(q3Var2);
                            q3Var2.Y.p(bundleN);
                            i5 i5VarR = b4Var.r();
                            i5VarR.o();
                            i5VarR.p();
                            i5VarR.B(new l0.a(i5VarR, i5VarR.y(false), bundleN, 25));
                            break;
                        } else {
                            String next = it.next();
                            Object obj2 = bundle.get(next);
                            if (obj2 != null && !(obj2 instanceof String) && !(obj2 instanceof Long) && !(obj2 instanceof Double)) {
                                b4.g(b6Var);
                                b6Var.getClass();
                                if (b6.Z(obj2)) {
                                    b6.F(mVar, null, 27, null, null, 0);
                                }
                                b4.i(i3Var);
                                i3Var.N.c(next, "Invalid default event parameter type. Name, value", obj2);
                            } else if (b6.b0(next)) {
                                b4.i(i3Var);
                                i3Var.N.b(next, "Invalid default event parameter name. Name");
                            } else if (obj2 == null) {
                                bundleN.remove(next);
                            } else {
                                b4.g(b6Var);
                                if (b6Var.V("param", next, 100, obj2)) {
                                    b6Var.G(bundleN, next, obj2);
                                }
                            }
                        }
                    }
                } else {
                    q3 q3Var3 = ((b4) obj).f17250u;
                    b4.g(q3Var3);
                    q3Var3.Y.p(new Bundle());
                    break;
                }
                break;
            case QueueFuseable.SYNC /* 1 */:
                v4Var.o();
                v4Var.p();
                fc.t.k(bundle);
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                fc.t.g(string);
                fc.t.g(string2);
                fc.t.k(bundle.get("value"));
                Object obj3 = v4Var.f15046b;
                b4 b4Var2 = (b4) obj3;
                if (!b4Var2.e()) {
                    i3 i3Var2 = b4Var2.f17251w;
                    b4.i(i3Var2);
                    i3Var2.Q.a("Conditional property not set since app measurement is disabled");
                    break;
                } else {
                    y5 y5Var = new y5(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                    try {
                        b6 b6Var2 = ((b4) obj3).O;
                        b4.g(b6Var2);
                        bundle.getString("app_id");
                        q qVarX0 = b6Var2.x0(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true);
                        b6 b6Var3 = ((b4) obj3).O;
                        b4.g(b6Var3);
                        bundle.getString("app_id");
                        q qVarX02 = b6Var3.x0(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true);
                        b6 b6Var4 = ((b4) obj3).O;
                        b4.g(b6Var4);
                        bundle.getString("app_id");
                        b4Var2.r().t(new c(bundle.getString("app_id"), string2, y5Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), qVarX02, bundle.getLong("trigger_timeout"), qVarX0, bundle.getLong("time_to_live"), b6Var4.x0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            default:
                v4Var.o();
                v4Var.p();
                fc.t.k(bundle);
                String string3 = bundle.getString("name");
                fc.t.g(string3);
                Object obj4 = v4Var.f15046b;
                b4 b4Var3 = (b4) obj4;
                if (!b4Var3.e()) {
                    i3 i3Var3 = b4Var3.f17251w;
                    b4.i(i3Var3);
                    i3Var3.Q.a("Conditional property not cleared since app measurement is disabled");
                    break;
                } else {
                    y5 y5Var2 = new y5(0L, null, string3, "");
                    try {
                        b6 b6Var5 = ((b4) obj4).O;
                        b4.g(b6Var5);
                        bundle.getString("app_id");
                        b4Var3.r().t(new c(bundle.getString("app_id"), "", y5Var2, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), b6Var5.x0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
        }
    }
}