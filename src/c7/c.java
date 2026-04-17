package c7;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.play.core.install.zza;
import com.isprid.kendare.ui.main.MainActivity;
import g.i0;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final r4.d f2151a;

    /* renamed from: b, reason: collision with root package name */
    public final IntentFilter f2152b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2153c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f2154d;

    /* renamed from: e, reason: collision with root package name */
    public i0 f2155e;

    public c(Context context) {
        r4.d dVar = new r4.d("AppUpdateListenerRegistry", 3);
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.f2154d = new HashSet();
        this.f2155e = null;
        this.f2151a = dVar;
        this.f2152b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f2153c = applicationContext != null ? applicationContext : context;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized void a(MainActivity mainActivity) {
        this.f2151a.c("registerListener", new Object[0]);
        this.f2154d.add(mainActivity);
        f();
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized void c(MainActivity mainActivity) {
        this.f2151a.c("unregisterListener", new Object[0]);
        if (mainActivity == null) {
            throw new NullPointerException("Unregistered Play Core listener should not be null.");
        }
        this.f2154d.remove(mainActivity);
        f();
    }

    public final synchronized void e(zza zzaVar) {
        Iterator it = new HashSet(this.f2154d).iterator();
        while (it.hasNext()) {
            ((MainActivity) ((e7.a) it.next())).n(zzaVar);
        }
    }

    public final void f() {
        i0 i0Var;
        HashSet hashSet = this.f2154d;
        boolean zIsEmpty = hashSet.isEmpty();
        Context context = this.f2153c;
        if (!zIsEmpty && this.f2155e == null) {
            i0 i0Var2 = new i0(10, this);
            this.f2155e = i0Var2;
            int i10 = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f2152b;
            if (i10 >= 33) {
                context.registerReceiver(i0Var2, intentFilter, 2);
            } else {
                context.registerReceiver(i0Var2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (i0Var = this.f2155e) == null) {
            return;
        }
        context.unregisterReceiver(i0Var);
        this.f2155e = null;
    }
}