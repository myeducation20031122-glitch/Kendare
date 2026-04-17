package d7;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.fragment.app.y;
import com.google.android.gms.internal.ads.ic1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f12332n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f12333a;

    /* renamed from: b, reason: collision with root package name */
    public final r4.d f12334b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12339g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f12340h;

    /* renamed from: l, reason: collision with root package name */
    public l1.k f12344l;

    /* renamed from: m, reason: collision with root package name */
    public IInterface f12345m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f12336d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f12337e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f12338f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final l f12342j = new IBinder.DeathRecipient() { // from class: d7.l
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            o oVar = this.f12327a;
            oVar.f12334b.c("reportBinderDeath", new Object[0]);
            ic1.v(oVar.f12341i.get());
            oVar.f12334b.c("%s : Binder has died.", oVar.f12335c);
            Iterator it = oVar.f12336d.iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                RemoteException remoteException = new RemoteException(String.valueOf(oVar.f12335c).concat(" : Binder has died."));
                x5.l lVar = kVar.f12326b;
                if (lVar != null) {
                    lVar.c(remoteException);
                }
            }
            oVar.f12336d.clear();
            synchronized (oVar.f12338f) {
                oVar.d();
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f12343k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f12335c = "AppUpdateService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f12341i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [d7.l] */
    public o(Context context, r4.d dVar, Intent intent) {
        this.f12333a = context;
        this.f12334b = dVar;
        this.f12340h = intent;
    }

    public static void b(o oVar, k kVar) {
        IInterface iInterface = oVar.f12345m;
        ArrayList arrayList = oVar.f12336d;
        r4.d dVar = oVar.f12334b;
        if (iInterface != null || oVar.f12339g) {
            if (!oVar.f12339g) {
                kVar.run();
                return;
            } else {
                dVar.c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(kVar);
                return;
            }
        }
        dVar.c("Initiate binding to the service.", new Object[0]);
        arrayList.add(kVar);
        l1.k kVar2 = new l1.k(oVar);
        oVar.f12344l = kVar2;
        oVar.f12339g = true;
        if (oVar.f12333a.bindService(oVar.f12340h, kVar2, 1)) {
            return;
        }
        dVar.c("Failed to bind to the service.", new Object[0]);
        oVar.f12339g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar3 = (k) it.next();
            y yVar = new y();
            x5.l lVar = kVar3.f12326b;
            if (lVar != null) {
                lVar.c(yVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f12332n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f12335c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f12335c, 10);
                    handlerThread.start();
                    map.put(this.f12335c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f12335c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(x5.l lVar) {
        synchronized (this.f12338f) {
            this.f12337e.remove(lVar);
        }
        a().post(new m(this, 0));
    }

    public final void d() {
        HashSet hashSet = this.f12337e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((x5.l) it.next()).c(new RemoteException(String.valueOf(this.f12335c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}