package c2;

import a2.m;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import z1.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2054a = o.t("Alarms");

    public static void a(int i10, Context context, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        o.r().p(f2054a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, m mVar, String str, long j10) {
        int iIntValue;
        WorkDatabase workDatabase = mVar.f261e;
        g.e eVarK = workDatabase.k();
        i2.e eVarD = eVarK.D(str);
        if (eVarD != null) {
            a(eVarD.f13249b, context, str);
            c(context, str, eVarD.f13249b, j10);
            return;
        }
        synchronized (j2.f.class) {
            workDatabase.c();
            try {
                Long lB = workDatabase.j().b("next_alarm_manager_id");
                int i10 = 0;
                iIntValue = lB != null ? lB.intValue() : 0;
                if (iIntValue != Integer.MAX_VALUE) {
                    i10 = iIntValue + 1;
                }
                workDatabase.j().e(new i2.d("next_alarm_manager_id", i10));
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        eVarK.G(new i2.e(str, iIntValue));
        c(context, str, iIntValue, j10);
    }

    public static void c(Context context, String str, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j10, service);
        }
    }
}