package g;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12888b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f12889e;

    public /* synthetic */ r(Context context, int i10) {
        this.f12888b = i10;
        this.f12889e = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        k0.i iVar;
        Object systemService;
        Context context;
        int i10 = this.f12888b;
        Context context2 = this.f12889e;
        switch (i10) {
            case 0:
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i11 >= 33) {
                            Iterator it = x.f12925t.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    x xVar = (x) ((WeakReference) it.next()).get();
                                    if (xVar != null && (context = ((m0) xVar).N) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            iVar = systemService != null ? new k0.i(new k0.l(t.a(systemService))) : k0.i.f13943b;
                            if (iVar.f13944a.isEmpty()) {
                                String strB = e0.k.b(context2);
                                Object systemService2 = context2.getSystemService("locale");
                                if (systemService2 != null) {
                                    t.b(systemService2, s.a(strB));
                                }
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        } else {
                            iVar = x.f12921f;
                            if (iVar == null) {
                            }
                            if (iVar.f13944a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                x.f12924n = true;
                break;
            case QueueFuseable.SYNC /* 1 */:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new r(context2, 2));
                break;
            default:
                j1.e.p(context2, new n.a(5), j1.e.f13549a, false);
                break;
        }
    }
}