package i4;

import android.content.SharedPreferences;
import android.os.Binder;
import com.google.android.gms.internal.ads.ar0;
import com.google.android.gms.internal.ads.bd0;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.fr0;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.h01;
import com.google.android.gms.internal.ads.i01;
import com.google.android.gms.internal.ads.i9;
import com.google.android.gms.internal.ads.jz0;
import com.google.android.gms.internal.ads.kr;
import com.google.android.gms.internal.ads.od0;
import com.google.android.gms.internal.ads.pc0;
import com.google.android.gms.internal.ads.po;
import com.google.android.gms.internal.ads.rz0;
import com.google.android.gms.internal.ads.sm0;
import com.google.android.gms.internal.ads.zz0;
import j4.q;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l4.e0;
import l4.g0;
import org.json.JSONException;
import org.json.JSONObject;
import r4.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class c implements rz0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13312a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13313b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13314c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f13312a = i10;
        this.f13313b = obj;
        this.f13314c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final h01 zza(Object obj) throws ExecutionException, JSONException, InterruptedException, TimeoutException {
        h01 h01VarC;
        switch (this.f13312a) {
            case 0:
                fr0 fr0Var = (fr0) this.f13313b;
                ar0 ar0Var = (ar0) this.f13314c;
                JSONObject jSONObject = (JSONObject) obj;
                boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
                if (zOptBoolean) {
                    String string = jSONObject.getString("appSettingsJson");
                    k kVar = k.A;
                    e0 e0VarC = kVar.f13352g.c();
                    e0VarC.q();
                    synchronized (e0VarC.f14557a) {
                        try {
                            kVar.f13355j.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (string == null || string.equals(e0VarC.f14572p.f6068e)) {
                                e0VarC.f14572p.f6069f = jCurrentTimeMillis;
                            } else {
                                e0VarC.f14572p = new kr(string, jCurrentTimeMillis);
                                SharedPreferences.Editor editor = e0VarC.f14563g;
                                if (editor != null) {
                                    editor.putString("app_settings_json", string);
                                    e0VarC.f14563g.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                                    e0VarC.f14563g.apply();
                                }
                                e0VarC.r();
                                Iterator it = e0VarC.f14559c.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                            }
                        } finally {
                        }
                    }
                }
                ar0Var.K(zOptBoolean);
                fr0Var.b(ar0Var.zzl());
                return dq0.x2(null);
            default:
                po poVar = (po) obj;
                sm0 sm0Var = (sm0) this.f13314c;
                sm0Var.getClass();
                String str = poVar.f7453j;
                g0 g0Var = k.A.f13348c;
                int i10 = 1;
                if (g0.F(str)) {
                    h01VarC = dq0.q2(new od0(1));
                } else {
                    if (((Boolean) q.f13781d.f13784c.a(ge.f4847v6)).booleanValue()) {
                        h01VarC = ((jz0) ((i01) sm0Var.f8465j)).b(new i9(7, sm0Var, poVar));
                    } else {
                        h01VarC = ((bd0) sm0Var.f8466m).c(poVar);
                    }
                }
                return dq0.W2(dq0.j2((zz0) dq0.Z2(zz0.s(h01VarC), ((Integer) q.f13781d.f13784c.a(ge.f4875y4)).intValue(), TimeUnit.SECONDS, (ScheduledExecutorService) sm0Var.f8463e), Throwable.class, new pc0(sm0Var, poVar, Binder.getCallingUid(), i10), (i01) sm0Var.f8464f), new o(poVar, 2), (Executor) this.f13313b);
        }
    }
}