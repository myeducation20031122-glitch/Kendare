package e0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l0 implements Handler.Callback, ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final Context f12404b;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f12405e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f12406f = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public HashSet f12407j = new HashSet();

    public l0(Context context) {
        this.f12404b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f12405e = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(k0 k0Var) {
        ArrayDeque arrayDeque;
        boolean zIsLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = k0Var.f12399a;
        if (zIsLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + k0Var.f12402d.size() + " queued tasks");
        }
        if (k0Var.f12402d.isEmpty()) {
            return;
        }
        if (!k0Var.f12400b) {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f12404b;
            boolean zBindService = context.bindService(component, this, 33);
            k0Var.f12400b = zBindService;
            if (zBindService) {
                k0Var.f12403e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            if (k0Var.f12400b) {
            }
        } else if (k0Var.f12401c != null) {
            while (true) {
                arrayDeque = k0Var.f12402d;
                m0 m0Var = (m0) arrayDeque.peek();
                if (m0Var == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + m0Var);
                    }
                    ((i0) m0Var).a(k0Var.f12401c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + componentName);
                    }
                } catch (RemoteException e10) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e10);
                }
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            b(k0Var);
            return;
        }
        b(k0Var);
    }

    public final void b(k0 k0Var) {
        Handler handler = this.f12405e;
        ComponentName componentName = k0Var.f12399a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i10 = k0Var.f12403e;
        int i11 = i10 + 1;
        k0Var.f12403e = i11;
        if (i11 <= 6) {
            int i12 = (1 << i10) * com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i12);
            return;
        }
        StringBuilder sb = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = k0Var.f12402d;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(k0Var.f12403e);
        sb.append(" retries");
        Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i10 = message.what;
        b.c cVar = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return false;
                    }
                    k0 k0Var = (k0) this.f12406f.get((ComponentName) message.obj);
                    if (k0Var != null) {
                        a(k0Var);
                    }
                    return true;
                }
                k0 k0Var2 = (k0) this.f12406f.get((ComponentName) message.obj);
                if (k0Var2 != null) {
                    if (k0Var2.f12400b) {
                        this.f12404b.unbindService(this);
                        k0Var2.f12400b = false;
                    }
                    k0Var2.f12401c = null;
                }
                return true;
            }
            j0 j0Var = (j0) message.obj;
            ComponentName componentName = j0Var.f12396a;
            IBinder iBinder = j0Var.f12397b;
            k0 k0Var3 = (k0) this.f12406f.get(componentName);
            if (k0Var3 != null) {
                int i11 = b.b.f1823b;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.c.f1824a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b.c)) {
                        b.a aVar = new b.a();
                        aVar.f1822b = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (b.c) iInterfaceQueryLocalInterface;
                    }
                }
                k0Var3.f12401c = cVar;
                k0Var3.f12403e = 0;
                a(k0Var3);
            }
            return true;
        }
        m0 m0Var = (m0) message.obj;
        String string = Settings.Secure.getString(this.f12404b.getContentResolver(), "enabled_notification_listeners");
        synchronized (n0.f12408c) {
            if (string != null) {
                try {
                    if (!string.equals(n0.f12409d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet2.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        n0.f12410e = hashSet2;
                        n0.f12409d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashSet = n0.f12410e;
        }
        if (!hashSet.equals(this.f12407j)) {
            this.f12407j = hashSet;
            List<ResolveInfo> listQueryIntentServices = this.f12404b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSet3 = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                    } else {
                        hashSet3.add(componentName2);
                    }
                }
            }
            Iterator it = hashSet3.iterator();
            while (it.hasNext()) {
                ComponentName componentName3 = (ComponentName) it.next();
                if (!this.f12406f.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                    }
                    this.f12406f.put(componentName3, new k0(componentName3));
                }
            }
            Iterator it2 = this.f12406f.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet3.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    k0 k0Var4 = (k0) entry.getValue();
                    if (k0Var4.f12400b) {
                        this.f12404b.unbindService(this);
                        k0Var4.f12400b = false;
                    }
                    k0Var4.f12401c = null;
                    it2.remove();
                }
            }
        }
        for (k0 k0Var5 : this.f12406f.values()) {
            k0Var5.f12402d.add(m0Var);
            a(k0Var5);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f12405e.obtainMessage(1, new j0(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f12405e.obtainMessage(2, componentName).sendToTarget();
    }
}