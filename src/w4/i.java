package w4;

import android.os.Bundle;
import android.util.Log;
import n8.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f18669a;

    /* renamed from: b, reason: collision with root package name */
    public final x5.l f18670b = new x5.l();

    /* renamed from: c, reason: collision with root package name */
    public final int f18671c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f18672d;

    public i(int i10, int i11, Bundle bundle) {
        this.f18669a = i10;
        this.f18671c = i11;
        this.f18672d = bundle;
    }

    public final void a(r rVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(rVar);
            Log.d("MessengerIpcClient", kc.r.h(new StringBuilder(strValueOf.length() + 14 + strValueOf2.length()), "Failing ", strValueOf, " with ", strValueOf2));
        }
        this.f18670b.a(rVar);
    }

    public final void b(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(bundle);
            Log.d("MessengerIpcClient", kc.r.h(new StringBuilder(strValueOf.length() + 16 + strValueOf2.length()), "Finishing ", strValueOf, " with ", strValueOf2));
        }
        this.f18670b.b(bundle);
    }

    public final String toString() {
        boolean z7;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(this.f18671c);
        sb.append(" id=");
        sb.append(this.f18669a);
        sb.append(" oneWay=");
        switch (((h) this).f18668e) {
            case 0:
                z7 = true;
                break;
            default:
                z7 = false;
                break;
        }
        sb.append(z7);
        sb.append("}");
        return sb.toString();
    }
}