package c2;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import i2.j;
import z1.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i implements a2.c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f2084e = o.t("SystemAlarmScheduler");

    /* renamed from: b, reason: collision with root package name */
    public final Context f2085b;

    public i(Context context) {
        this.f2085b = context.getApplicationContext();
    }

    @Override // a2.c
    public final void b(String str) {
        String str2 = b.f2055j;
        Context context = this.f2085b;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        context.startService(intent);
    }

    @Override // a2.c
    public final void d(j... jVarArr) {
        for (j jVar : jVarArr) {
            o.r().p(f2084e, String.format("Scheduling work with workSpecId %s", jVar.f13258a), new Throwable[0]);
            String str = jVar.f13258a;
            Context context = this.f2085b;
            context.startService(b.c(context, str));
        }
    }

    @Override // a2.c
    public final boolean f() {
        return true;
    }
}