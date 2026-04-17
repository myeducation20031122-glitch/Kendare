package t5;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.s8;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17321b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17323f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f17324j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f17325m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f17326n;

    public /* synthetic */ e4(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i10) {
        this.f17321b = i10;
        this.f17326n = obj;
        this.f17322e = obj2;
        this.f17323f = obj3;
        this.f17325m = obj4;
        this.f17324j = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w5 w5Var;
        String str;
        y4 y4Var = null;
        switch (this.f17321b) {
            case 0:
                ((s8) r8.f10981e.f10982b.zza()).getClass();
                if (!((f4) this.f17326n).f17347b.H().y(null, a3.f17178h0)) {
                    if (((String) this.f17322e) == null) {
                        b5 b5Var = ((f4) this.f17326n).f17347b.O.R;
                        b4.h(b5Var);
                        b5Var.z((String) this.f17323f);
                        return;
                    }
                    b5 b5Var2 = ((f4) this.f17326n).f17347b.O.R;
                    b4.h(b5Var2);
                    String str2 = (String) this.f17323f;
                    b5Var2.o();
                    synchronized (b5Var2) {
                        try {
                            String str3 = b5Var2.P;
                            if (str3 != null) {
                                str3.equals(str2);
                            }
                            b5Var2.P = str2;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                String str4 = (String) this.f17322e;
                if (str4 == null) {
                    w5Var = ((f4) this.f17326n).f17347b;
                    str = (String) this.f17323f;
                    w5Var.zzaz().o();
                    String str5 = w5Var.f17668g0;
                    if (str5 != null && !str5.equals(str)) {
                        return;
                    }
                } else {
                    y4Var = new y4((String) this.f17325m, str4, this.f17324j);
                    w5Var = ((f4) this.f17326n).f17347b;
                    str = (String) this.f17323f;
                    w5Var.zzaz().o();
                    String str6 = w5Var.f17668g0;
                    if (str6 != null) {
                        str6.equals(str);
                    }
                }
                w5Var.f17668g0 = str;
                w5Var.f17667f0 = y4Var;
                return;
            case QueueFuseable.SYNC /* 1 */:
                v4 v4Var = (v4) this.f17326n;
                String str7 = (String) this.f17322e;
                String str8 = (String) this.f17323f;
                v4Var.F(this.f17324j, this.f17325m, str7, str8);
                return;
            default:
                b5 b5Var3 = (b5) this.f17326n;
                Bundle bundle = (Bundle) this.f17322e;
                y4 y4Var2 = (y4) this.f17323f;
                y4 y4Var3 = (y4) this.f17325m;
                long j10 = this.f17324j;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                b6 b6Var = ((b4) b5Var3.f15046b).O;
                b4.g(b6Var);
                b5Var3.t(y4Var2, y4Var3, j10, true, b6Var.w0("screen_view", bundle, null, false));
                return;
        }
    }
}