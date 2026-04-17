package g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.gms.internal.ads.bi1;
import com.google.android.gms.internal.ads.ed0;
import com.google.android.gms.internal.ads.es0;
import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.gm0;
import com.google.android.gms.internal.ads.mn0;
import com.google.android.gms.internal.ads.ut;
import com.google.android.gms.internal.ads.y8;
import com.google.android.play.core.install.zza;
import com.google.firebase.messaging.FirebaseMessaging;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12802a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12803b;

    public /* synthetic */ i0(int i10, Object obj) {
        this.f12802a = i10;
        this.f12803b = obj;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((ut) this.f12803b).a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0153  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        int i10 = 3;
        int i11 = 2;
        switch (this.f12802a) {
            case 0:
                ((j0) this.f12803b).f();
                return;
            case QueueFuseable.SYNC /* 1 */:
                if (intent != null) {
                    ((g2.c) this.f12803b).g(intent);
                    return;
                }
                return;
            case 2:
                if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    return;
                }
                z1.o.r().p(g2.f.f13005j, "Network broadcast received", new Throwable[0]);
                g2.f fVar = (g2.f) this.f12803b;
                fVar.c(fVar.f());
                return;
            case 3:
                com.bumptech.glide.manager.s sVar = (com.bumptech.glide.manager.s) this.f12803b;
                sVar.getClass();
                com.bumptech.glide.manager.s.f2355t.execute(new com.bumptech.glide.manager.r(sVar, i11));
                return;
            case 4:
                l1.g gVar = (l1.g) this.f12803b;
                synchronized (gVar) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : ((Map) gVar.f14474j).entrySet()) {
                            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                                arrayList.add((BroadcastReceiver) entry.getKey());
                            }
                        }
                        int size = arrayList.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            ((BroadcastReceiver) arrayList.get(i12)).onReceive(context, intent);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                    ((l4.g0) this.f12803b).f14593c = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        ((l4.g0) this.f12803b).f14593c = false;
                        return;
                    }
                    return;
                }
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                y8 y8Var = (y8) this.f12803b;
                Handler handler = y8.P;
                y8Var.c();
                return;
            case y4.g.NETWORK_ERROR /* 7 */:
                ga gaVar = (ga) this.f12803b;
                int i13 = ga.S;
                gaVar.c(3);
                return;
            case 8:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    i10 = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i10 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case QueueFuseable.SYNC /* 1 */:
                                    case 2:
                                        break;
                                    case 3:
                                    case 4:
                                    case y4.g.INVALID_ACCOUNT /* 5 */:
                                    case y4.g.RESOLUTION_REQUIRED /* 6 */:
                                    case y4.g.NETWORK_ERROR /* 7 */:
                                    case 8:
                                    case 9:
                                    case y4.g.DEVELOPER_ERROR /* 10 */:
                                    case 11:
                                    case 12:
                                    case y4.g.INTERRUPTED /* 14 */:
                                    case y4.g.TIMEOUT /* 15 */:
                                    case y4.g.API_NOT_CONNECTED /* 17 */:
                                        i10 = 4;
                                        break;
                                    case y4.g.ERROR /* 13 */:
                                        i10 = 5;
                                        break;
                                    case y4.g.CANCELED /* 16 */:
                                    case y4.g.REMOTE_EXCEPTION /* 19 */:
                                    default:
                                        i10 = 6;
                                        break;
                                    case 18:
                                        i10 = 2;
                                        break;
                                    case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                                        if (es0.f4119a >= 29) {
                                            i10 = 9;
                                            break;
                                        }
                                        break;
                                }
                            } else if (type != 1) {
                                if (type != 4 && type != 5) {
                                    if (type != 6) {
                                        i10 = type != 9 ? 8 : 7;
                                    }
                                }
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (es0.f4119a < 31 || i10 != 5) {
                    mn0.e(i10, (mn0) this.f12803b);
                    return;
                }
                mn0 mn0Var = (mn0) this.f12803b;
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    telephonyManager.getClass();
                    gm0 gm0Var = new gm0(mn0Var);
                    a5.q0.B(telephonyManager, a3.a.r(context), gm0Var);
                    a5.q0.A(telephonyManager, gm0Var);
                    return;
                } catch (RuntimeException unused2) {
                    mn0.e(5, mn0Var);
                    return;
                }
            case 9:
                bi1 bi1Var = (bi1) this.f12803b;
                bi1Var.f3014b.post(new ed0(bi1Var, 15));
                return;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                c7.c cVar = (c7.c) this.f12803b;
                cVar.getClass();
                boolean zEquals = context.getPackageName().equals(intent.getStringExtra("package.name"));
                r4.d dVar = cVar.f2151a;
                if (!zEquals) {
                    dVar.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
                    return;
                }
                dVar.a("List of extras in received intent:", new Object[0]);
                for (String str : intent.getExtras().keySet()) {
                    dVar.a("Key: %s; value: %s", str, intent.getExtras().get(str));
                }
                dVar.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                dVar.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
                dVar.a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
                zza zzaVar = new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
                dVar.a("ListenerRegistryBroadcastReceiver.onReceive: %s", zzaVar);
                cVar.e(zzaVar);
                return;
            default:
                ut utVar = (ut) this.f12803b;
                if (utVar != null && utVar.b()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    ut utVar2 = (ut) this.f12803b;
                    ((FirebaseMessaging) utVar2.f9155j).getClass();
                    FirebaseMessaging.b(utVar2, 0L);
                    ((ut) this.f12803b).a().unregisterReceiver(this);
                    this.f12803b = null;
                    return;
                }
                return;
        }
    }

    public i0(ut utVar) {
        this.f12802a = 11;
        this.f12803b = utVar;
    }

    public /* synthetic */ i0(Object obj, int i10) {
        this.f12802a = i10;
        this.f12803b = obj;
    }
}