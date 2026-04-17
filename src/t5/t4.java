package t5;

import com.google.android.gms.internal.measurement.u8;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f17614b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f17615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17616f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f17617j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f17618m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f17619n;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v4 f17620t;

    public t4(v4 v4Var, h hVar, long j10, int i10, long j11, boolean z7, h hVar2) {
        this.f17620t = v4Var;
        this.f17614b = hVar;
        this.f17615e = j10;
        this.f17616f = i10;
        this.f17617j = j11;
        this.f17618m = z7;
        this.f17619n = hVar2;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        v4 v4Var = this.f17620t;
        h hVar = this.f17614b;
        v4Var.D(hVar);
        v4Var.z(this.f17615e, false);
        v4.J(this.f17620t, this.f17614b, this.f17616f, this.f17617j, true, this.f17618m);
        u8.a();
        if (((b4) v4Var.f15046b).f17249t.y(null, a3.f17204u0)) {
            v4.I(v4Var, hVar, this.f17619n);
        }
    }
}