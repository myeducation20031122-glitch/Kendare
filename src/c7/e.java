package c7;

import a5.x;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.isprid.kendare.ui.main.MainActivity;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final k f2158a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2159b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2160c;

    public e(k kVar, c cVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f2158a = kVar;
        this.f2159b = cVar;
        this.f2160c = context;
    }

    public static void b(a aVar, int i10, Activity activity, int i11) {
        m mVarA = m.a(i10);
        if (activity == null) {
            return;
        }
        x xVar = new x(10, activity);
        if (aVar == null || aVar.a(mVarA) == null || aVar.f2148i) {
            return;
        }
        aVar.f2148i = true;
        ((Activity) xVar.f423e).startIntentSenderForResult(aVar.a(mVarA).getIntentSender(), i11, null, 0, 0, 0, null);
    }

    public final synchronized void a(MainActivity mainActivity) {
        this.f2159b.a(mainActivity);
    }
}