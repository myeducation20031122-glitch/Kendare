package e9;

import android.content.Context;
import com.isprid.kendare.MyApplication;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.HashMap;
import kc.r;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c {

    /* renamed from: b, reason: collision with root package name */
    public int f12573b;

    /* renamed from: c, reason: collision with root package name */
    public a f12574c;

    /* renamed from: d, reason: collision with root package name */
    public e f12575d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12576e;

    /* renamed from: g, reason: collision with root package name */
    public double f12578g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12572a = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f12577f = new HashMap();

    public static f9.a a(int i10, a aVar, double d10, boolean z7) {
        f9.a aVar2;
        f9.a aVar3;
        int i11 = 0;
        switch (i10) {
            case 0:
                aVar2 = new f9.a(8);
                break;
            case QueueFuseable.SYNC /* 1 */:
                aVar2 = new f9.a(1);
                break;
            case 2:
                aVar3 = new f9.a(0);
                aVar2 = aVar3;
                break;
            case 3:
                aVar2 = new f9.a(10);
                break;
            case 4:
                aVar2 = new f9.a(4);
                break;
            case g.INVALID_ACCOUNT /* 5 */:
                aVar2 = new f9.a(2);
                break;
            case g.RESOLUTION_REQUIRED /* 6 */:
                aVar2 = new f9.a(9);
                break;
            case g.NETWORK_ERROR /* 7 */:
                aVar3 = new f9.a(11, i11);
                aVar2 = aVar3;
                break;
            case 8:
                aVar3 = new f9.a(5, i11);
                aVar2 = aVar3;
                break;
            case 9:
                aVar3 = new f9.a(6, i11);
                aVar2 = aVar3;
                break;
            case g.DEVELOPER_ERROR /* 10 */:
                aVar2 = new f9.a(3);
                break;
            case 11:
                aVar2 = new f9.a(7);
                break;
            default:
                aVar2 = null;
                break;
        }
        if (aVar2 != null) {
            aVar2.f12573b = i10;
            aVar2.f12574c = aVar;
            aVar2.f12578g = d10;
            aVar2.f12576e = z7;
            aVar2.f12575d = new e(d10);
        }
        return aVar2;
    }

    public abstract int b();

    public final String c() {
        HashMap map = this.f12572a;
        int iIntValue = map.isEmpty() ? 0 : ((Integer) map.get(Integer.valueOf(this.f12574c.f12565d.f3242a))).intValue();
        return iIntValue == 1 ? "asuba" : iIntValue == 2 ? "madyastha" : "suba";
    }

    public abstract int[] d();

    public final String e(d dVar, boolean z7) {
        String str;
        StringBuilder sb = new StringBuilder();
        n7.c cVar = MyApplication.f11640b;
        Context contextQ = cVar.q();
        String strG = g();
        s9.f fVar = s9.c.f16951a;
        sb.append(contextQ.getResources().getString(s9.c.b(contextQ, strG)));
        sb.append(" (");
        sb.append(s9.c.a(cVar.q(), i()));
        boolean zE = dVar.E(this.f12573b, z7);
        String str2 = "";
        if (zE) {
            str = "*" + s9.c.a(cVar.q(), "banga");
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", ");
        sb.append(s9.c.a(cVar.q(), c()));
        if (l()) {
            str2 = ", " + s9.c.a(cVar.q(), "digbala");
        }
        return r.g(sb, str2, ")");
    }

    public abstract String f();

    public final String g() {
        n7.c cVar = MyApplication.f11640b;
        return "grahaSin" + this.f12573b;
    }

    public final int h() {
        int i10 = this.f12574c.f12564c;
        if (i10 == 1) {
            return 12;
        }
        return ((i10 - 2) % 12) + 1;
    }

    public final String i() {
        HashMap map = this.f12577f;
        return map.isEmpty() ? "" : (String) map.get(Integer.valueOf(this.f12574c.f12565d.f3242a));
    }

    public final boolean j(String... strArr) {
        String strI = i();
        for (String str : strArr) {
            if (str.equals(strI)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        return o() || n() || l();
    }

    public final boolean l() {
        int i10 = this.f12574c.f12564c;
        int i11 = 10;
        switch (((f9.a) this).f12708h) {
            case QueueFuseable.SYNC /* 1 */:
            case g.DEVELOPER_ERROR /* 10 */:
                i11 = 4;
                break;
            case 2:
            case g.INVALID_ACCOUNT /* 5 */:
            case g.RESOLUTION_REQUIRED /* 6 */:
            default:
                i11 = 1;
                break;
            case 3:
            case g.NETWORK_ERROR /* 7 */:
                i11 = 0;
                break;
            case 4:
            case 8:
                break;
            case 9:
                i11 = 7;
                break;
        }
        return i10 == i11;
    }

    public final boolean m() {
        return this.f12574c.k() || this.f12574c.l();
    }

    public final boolean n() {
        return i().equals("swakshestra");
    }

    public final boolean o() {
        return i().equals("uchcha");
    }

    public final boolean p(String... strArr) {
        String strI = i();
        for (String str : strArr) {
            if (strI.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        return o() || n();
    }
}