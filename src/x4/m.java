package x4;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.ads.bu0;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends bu0 {

    /* renamed from: b, reason: collision with root package name */
    public final Context f18973b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f18974c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f fVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1);
        this.f18974c = fVar;
        this.f18973b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int i11 = g.f18963a;
        f fVar = this.f18974c;
        Context context = this.f18973b;
        int iD = fVar.d(context, i11);
        AtomicBoolean atomicBoolean = j.f18966a;
        if (iD == 1 || iD == 2 || iD == 3 || iD == 9) {
            fVar.i(context, iD, fVar.c(context, iD, 0, "n"));
        }
    }
}