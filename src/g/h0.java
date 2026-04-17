package g;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h0 extends j0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12781f = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m0 f12782j;

    /* renamed from: m, reason: collision with root package name */
    public final Object f12783m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m0 m0Var, Context context) {
        super(m0Var);
        this.f12782j = m0Var;
        this.f12783m = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // g.j0
    public final IntentFilter b() {
        switch (this.f12781f) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef A[ORIG_RETURN, RETURN] */
    @Override // g.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c() {
        long j10;
        int i10 = this.f12781f;
        Object obj = this.f12783m;
        switch (i10) {
            case 0:
                return d0.a((PowerManager) obj) ? 2 : 1;
            default:
                e eVar = (e) obj;
                y0 y0Var = (y0) eVar.f12765j;
                if (y0Var.f12935b <= System.currentTimeMillis()) {
                    Location locationZ = o5.y.b((Context) eVar.f12763e, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? eVar.z("network") : null;
                    Location locationZ2 = o5.y.b((Context) eVar.f12763e, "android.permission.ACCESS_FINE_LOCATION") == 0 ? eVar.z("gps") : null;
                    if (locationZ2 == null || locationZ == null ? locationZ2 != null : locationZ2.getTime() > locationZ.getTime()) {
                        locationZ = locationZ2;
                    }
                    if (locationZ == null) {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i11 = Calendar.getInstance().get(11);
                        return (i11 < 6 || i11 >= 22) ? 2 : 1;
                    }
                    y0 y0Var2 = (y0) eVar.f12765j;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (x0.f12928d == null) {
                        x0.f12928d = new x0();
                    }
                    x0 x0Var = x0.f12928d;
                    x0Var.a(jCurrentTimeMillis - 86400000, locationZ.getLatitude(), locationZ.getLongitude());
                    x0Var.a(jCurrentTimeMillis, locationZ.getLatitude(), locationZ.getLongitude());
                    boolean z7 = x0Var.f12931c == 1;
                    long j11 = x0Var.f12930b;
                    long j12 = x0Var.f12929a;
                    x0Var.a(jCurrentTimeMillis + 86400000, locationZ.getLatitude(), locationZ.getLongitude());
                    long j13 = x0Var.f12930b;
                    if (j11 == -1 || j12 == -1) {
                        j10 = 43200000 + jCurrentTimeMillis;
                    } else {
                        if (jCurrentTimeMillis > j12) {
                            j11 = j13;
                        } else if (jCurrentTimeMillis > j11) {
                            j11 = j12;
                        }
                        j10 = j11 + 60000;
                    }
                    y0Var2.f12934a = z7;
                    y0Var2.f12935b = j10;
                }
                if (y0Var.f12934a) {
                }
                break;
        }
    }

    @Override // g.j0
    public final void f() {
        int i10 = this.f12781f;
        m0 m0Var = this.f12782j;
        switch (i10) {
            case 0:
                m0Var.n(true, true);
                break;
            default:
                m0Var.n(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m0 m0Var, e eVar) {
        super(m0Var);
        this.f12782j = m0Var;
        this.f12783m = eVar;
    }
}