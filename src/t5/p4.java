package t5;

import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17553b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f17554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v4 f17555f;

    public /* synthetic */ p4(v4 v4Var, long j10, int i10) {
        this.f17553b = i10;
        this.f17555f = v4Var;
        this.f17554e = j10;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        int i10 = this.f17553b;
        v4 v4Var = this.f17555f;
        long j10 = this.f17554e;
        switch (i10) {
            case 0:
                q3 q3Var = ((b4) v4Var.f15046b).f17250u;
                b4.g(q3Var);
                q3Var.M.c(j10);
                i3 i3Var = ((b4) v4Var.f15046b).f17251w;
                b4.i(i3Var);
                i3Var.P.b(Long.valueOf(j10), "Session timeout duration set");
                break;
            default:
                v4Var.z(j10, true);
                ((b4) v4Var.f15046b).r().G(new AtomicReference());
                break;
        }
    }
}