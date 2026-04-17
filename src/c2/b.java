package c2;

import a2.m;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import i2.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import z1.o;
import z1.p;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements a2.a {

    /* renamed from: j, reason: collision with root package name */
    public static final String f2055j = o.t("CommandHandler");

    /* renamed from: b, reason: collision with root package name */
    public final Context f2056b;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f2057e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Object f2058f = new Object();

    public b(Context context) {
        this.f2056b = context;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // a2.a
    public final void a(String str, boolean z7) {
        synchronized (this.f2058f) {
            try {
                a2.a aVar = (a2.a) this.f2057e.remove(str);
                if (aVar != null) {
                    aVar.a(str, z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        boolean z7;
        synchronized (this.f2058f) {
            z7 = !this.f2057e.isEmpty();
        }
        return z7;
    }

    public final void e(Intent intent, int i10, h hVar) throws Throwable {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            o.r().p(f2055j, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            d dVar = new d(this.f2056b, i10, hVar);
            ArrayList arrayListE = hVar.f2079m.f261e.n().e();
            String str = c.f2059a;
            Iterator it = arrayListE.iterator();
            boolean z7 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            while (it.hasNext()) {
                z1.c cVar = ((j) it.next()).f13267j;
                z7 |= cVar.f19462d;
                z10 |= cVar.f19460b;
                z11 |= cVar.f19463e;
                z12 |= cVar.f19459a != p.f19482b;
                if (z7 && z10 && z11 && z12) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f1802a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = dVar.f2061a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z7).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z10).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z12);
            context.sendBroadcast(intent2);
            e2.c cVar2 = dVar.f2063c;
            cVar2.c(arrayListE);
            ArrayList arrayList = new ArrayList(arrayListE.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it2 = arrayListE.iterator();
            while (it2.hasNext()) {
                j jVar = (j) it2.next();
                String str3 = jVar.f13258a;
                if (jCurrentTimeMillis >= jVar.a() && (!jVar.b() || cVar2.a(str3))) {
                    arrayList.add(jVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str4 = ((j) it3.next()).f13258a;
                Intent intentB = b(context, str4);
                o.r().p(d.f2060d, String.format("Creating a delay_met command for workSpec with id (%s)", str4), new Throwable[0]);
                hVar.f(new c.d(hVar, intentB, dVar.f2062b, 7));
            }
            cVar2.d();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            o.r().p(f2055j, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
            hVar.f2079m.v();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            o.r().q(f2055j, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            String str5 = f2055j;
            o.r().p(str5, String.format("Handling schedule work for %s", string), new Throwable[0]);
            WorkDatabase workDatabase = hVar.f2079m.f261e;
            workDatabase.c();
            try {
                j jVarI = workDatabase.n().i(string);
                if (jVarI == null) {
                    o.r().u(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                } else if (jVarI.f13259b.c()) {
                    o.r().u(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                } else {
                    long jA = jVarI.a();
                    boolean zB = jVarI.b();
                    Context context2 = this.f2056b;
                    m mVar = hVar.f2079m;
                    if (zB) {
                        o.r().p(str5, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                        a.b(context2, mVar, string, jA);
                        Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                        hVar.f(new c.d(hVar, intent3, i10, 7));
                    } else {
                        o.r().p(str5, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                        a.b(context2, mVar, string, jA);
                    }
                    workDatabase.h();
                }
                workDatabase.f();
                return;
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.f2058f) {
                try {
                    String string2 = extras2.getString("KEY_WORKSPEC_ID");
                    o oVarR = o.r();
                    String str6 = f2055j;
                    oVarR.p(str6, String.format("Handing delay met for %s", string2), new Throwable[0]);
                    if (this.f2057e.containsKey(string2)) {
                        o.r().p(str6, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2), new Throwable[0]);
                    } else {
                        e eVar = new e(this.f2056b, i10, string2, hVar);
                        this.f2057e.put(string2, eVar);
                        eVar.d();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                o.r().u(f2055j, String.format("Ignoring intent %s", intent), new Throwable[0]);
                return;
            }
            Bundle extras3 = intent.getExtras();
            String string3 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z13 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            o.r().p(f2055j, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
            a(string3, z13);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        o.r().p(f2055j, String.format("Handing stopWork work for %s", string4), new Throwable[0]);
        hVar.f2079m.x(string4);
        String str7 = a.f2054a;
        g.e eVarK = hVar.f2079m.f261e.k();
        i2.e eVarD = eVarK.D(string4);
        if (eVarD != null) {
            a.a(eVarD.f13249b, this.f2056b, string4);
            o.r().p(a.f2054a, String.format("Removing SystemIdInfo for workSpecId (%s)", string4), new Throwable[0]);
            eVarK.M(string4);
        }
        hVar.a(string4, false);
    }
}