package n8;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b0 extends Binder {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f15391e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final a5.x f15392b;

    public b0(a5.x xVar) {
        this.f15392b = xVar;
    }

    public final void a(c0 c0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = c0Var.f15394a;
        g gVar = (g) this.f15392b.f423e;
        int i10 = g.f15406n;
        gVar.getClass();
        x5.l lVar = new x5.l();
        gVar.f15407b.execute(new androidx.emoji2.text.m(gVar, intent, lVar, 1));
        lVar.f19011a.a(new n.a(12), new e0.g(c0Var, 15));
    }
}