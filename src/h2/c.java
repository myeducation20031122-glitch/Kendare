package h2;

import a2.m;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import g.e;
import i2.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import y1.p;
import z1.h;
import z1.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements e2.b, a2.a {
    public static final String M = o.t("SystemFgDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public final m f13176b;

    /* renamed from: e, reason: collision with root package name */
    public final l2.a f13177e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f13178f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public String f13179j;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f13180m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f13181n;

    /* renamed from: t, reason: collision with root package name */
    public final HashSet f13182t;

    /* renamed from: u, reason: collision with root package name */
    public final e2.c f13183u;

    /* renamed from: w, reason: collision with root package name */
    public b f13184w;

    public c(Context context) {
        m mVarS = m.s(context);
        this.f13176b = mVarS;
        l2.a aVar = mVarS.f262f;
        this.f13177e = aVar;
        this.f13179j = null;
        this.f13180m = new LinkedHashMap();
        this.f13182t = new HashSet();
        this.f13181n = new HashMap();
        this.f13183u = new e2.c(context, aVar, this);
        mVarS.f264h.b(this);
    }

    public static Intent b(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f19474a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f19475b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f19476c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f19474a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f19475b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f19476c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // a2.a
    public final void a(String str, boolean z7) {
        Map.Entry entry;
        synchronized (this.f13178f) {
            try {
                j jVar = (j) this.f13181n.remove(str);
                if (jVar != null && this.f13182t.remove(jVar)) {
                    this.f13183u.c(this.f13182t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h hVar = (h) this.f13180m.remove(str);
        int i10 = 1;
        if (str.equals(this.f13179j) && this.f13180m.size() > 0) {
            Iterator it = this.f13180m.entrySet().iterator();
            do {
                entry = (Map.Entry) it.next();
            } while (it.hasNext());
            this.f13179j = (String) entry.getKey();
            if (this.f13184w != null) {
                h hVar2 = (h) entry.getValue();
                b bVar = this.f13184w;
                SystemForegroundService systemForegroundService = (SystemForegroundService) bVar;
                systemForegroundService.f1812e.post(new d(systemForegroundService, hVar2.f19474a, hVar2.f19476c, hVar2.f19475b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f13184w;
                systemForegroundService2.f1812e.post(new p(systemForegroundService2, hVar2.f19474a, i10));
            }
        }
        b bVar2 = this.f13184w;
        if (hVar == null || bVar2 == null) {
            return;
        }
        o.r().p(M, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(hVar.f19474a), str, Integer.valueOf(hVar.f19475b)), new Throwable[0]);
        SystemForegroundService systemForegroundService3 = (SystemForegroundService) bVar2;
        systemForegroundService3.f1812e.post(new p(systemForegroundService3, hVar.f19474a, i10));
    }

    @Override // e2.b
    public final void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o.r().p(M, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            m mVar = this.f13176b;
            ((e) mVar.f262f).n(new j2.j(mVar, str, true));
        }
    }

    @Override // e2.b
    public final void e(List list) {
    }

    public final void f(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        o.r().p(M, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f13184w == null) {
            return;
        }
        h hVar = new h(intExtra, intExtra2, notification);
        LinkedHashMap linkedHashMap = this.f13180m;
        linkedHashMap.put(stringExtra, hVar);
        if (TextUtils.isEmpty(this.f13179j)) {
            this.f13179j = stringExtra;
            SystemForegroundService systemForegroundService = (SystemForegroundService) this.f13184w;
            systemForegroundService.f1812e.post(new d(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f13184w;
        systemForegroundService2.f1812e.post(new c.d(systemForegroundService2, intExtra, notification, 8));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i10 |= ((h) ((Map.Entry) it.next()).getValue()).f19475b;
        }
        h hVar2 = (h) linkedHashMap.get(this.f13179j);
        if (hVar2 != null) {
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.f13184w;
            systemForegroundService3.f1812e.post(new d(systemForegroundService3, hVar2.f19474a, hVar2.f19476c, i10));
        }
    }

    public final void g() {
        this.f13184w = null;
        synchronized (this.f13178f) {
            this.f13183u.d();
        }
        this.f13176b.f264h.f(this);
    }
}