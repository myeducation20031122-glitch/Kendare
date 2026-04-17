package z4;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.ads.bu0;
import com.google.android.gms.internal.ads.ic1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends bu0 {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("BasePendingResult", kc.r.d("Don't know how to handle message: ", i10), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).k0(Status.f2480t);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        ic1.v(pair.first);
        y4.n nVar = (y4.n) pair.second;
        try {
            throw null;
        } catch (RuntimeException e10) {
            BasePendingResult.q0(nVar);
            throw e10;
        }
    }
}