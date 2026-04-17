package z2;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.internal.measurement.n3;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements q2.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19503a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19504b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19505c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f19503a = i10;
        this.f19504b = obj;
        this.f19505c = obj2;
    }

    @Override // q2.p
    public final s2.e0 a(Object obj, int i10, int i11, q2.n nVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        x xVar;
        boolean z7;
        i3.f fVar;
        switch (this.f19503a) {
            case 0:
                s2.e0 e0VarA = ((q2.p) this.f19504b).a(obj, i10, i11, nVar);
                Resources resources = (Resources) this.f19505c;
                if (e0VarA == null) {
                    return null;
                }
                return new d(resources, e0VarA);
            case QueueFuseable.SYNC /* 1 */:
                s2.e0 e0VarC = ((a3.e) this.f19504b).c((Uri) obj, nVar);
                if (e0VarC == null) {
                    return null;
                }
                return r.a((t2.d) this.f19505c, (Drawable) ((a3.c) e0VarC).get(), i10, i11);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof x) {
                    xVar = (x) inputStream;
                    z7 = false;
                } else {
                    xVar = new x(inputStream, (t2.h) this.f19505c);
                    z7 = true;
                }
                ArrayDeque arrayDeque = i3.f.f13288f;
                synchronized (arrayDeque) {
                    fVar = (i3.f) arrayDeque.poll();
                }
                if (fVar == null) {
                    fVar = new i3.f();
                }
                fVar.f13289b = xVar;
                i3.l lVar = new i3.l(fVar);
                n3 n3Var = new n3(26, xVar, fVar);
                try {
                    p pVar = (p) this.f19504b;
                    return pVar.a(new g.e(pVar.f19554c, lVar, pVar.f19555d), i10, i11, nVar, n3Var);
                } finally {
                    fVar.a();
                    if (z7) {
                        xVar.b();
                    }
                }
        }
    }

    @Override // q2.p
    public final boolean b(Object obj, q2.n nVar) {
        int i10 = this.f19503a;
        Object obj2 = this.f19504b;
        switch (i10) {
            case 0:
                return ((q2.p) obj2).b(obj, nVar);
            case QueueFuseable.SYNC /* 1 */:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((p) obj2).getClass();
                return true;
        }
    }

    public a(Resources resources, q2.p pVar) {
        this.f19503a = 0;
        this.f19505c = resources;
        this.f19504b = pVar;
    }
}