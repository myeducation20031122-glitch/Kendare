package d9;

import a5.y;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import com.isprid.kendare.ui.horoscope.ReportActivity;
import g2.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import o5.b0;
import z4.c0;
import z4.e0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements a9.e, b0, t3.b, c0, y {

    /* renamed from: b, reason: collision with root package name */
    public Object f12366b;

    public c() {
        this.f12366b = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override // a5.y
    public boolean a() {
        return ((z4.b0) this.f12366b).g();
    }

    @Override // z4.c0
    public void b(Bundle bundle) {
    }

    @Override // z4.c0
    public void c(int i10) {
    }

    @Override // z4.c0
    public void d() {
        Object obj = this.f12366b;
        Iterator it = ((e0) obj).f19627n.values().iterator();
        while (it.hasNext()) {
            ((y4.c) it.next()).m();
        }
        ((e0) obj).P.f19605p = Collections.emptySet();
    }

    @Override // z4.c0
    public void e() {
        e0 e0Var = (e0) this.f12366b;
        e0Var.f19622b.lock();
        try {
            e0Var.N = new z4.y(e0Var, e0Var.f19629u, e0Var.f19630w, e0Var.f19625j, e0Var.M, e0Var.f19622b, e0Var.f19624f);
            e0Var.N.d();
            e0Var.f19623e.signalAll();
        } finally {
            e0Var.f19622b.unlock();
        }
    }

    @Override // z4.c0
    public p5.c f(p5.c cVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // z4.c0
    public boolean g() {
        return true;
    }

    @Override // da.a
    public Object get() {
        return this.f12366b;
    }

    @Override // z4.c0
    public void h(x4.b bVar, y4.e eVar, boolean z7) {
    }

    public void i(String report) {
        Intrinsics.f(report, "report");
        h hVar = ((ReportActivity) this.f12366b).f11658f;
        if (hVar != null) {
            ((TextView) hVar.f13013f).setText(Html.fromHtml(report));
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // o5.c0
    public Object zzb() {
        return this.f12366b;
    }

    public /* synthetic */ c(Object obj) {
        this.f12366b = obj;
    }
}