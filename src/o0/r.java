package o0;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f15610a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f15611b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f15612c = new HashMap();

    public r(Runnable runnable) {
        this.f15610a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.f15611b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.q0) ((t) it.next())).f1082a.o(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(t tVar) {
        this.f15611b.remove(tVar);
        q qVar = (q) this.f15612c.remove(tVar);
        if (qVar != null) {
            qVar.f15605a.b(qVar.f15606b);
            qVar.f15606b = null;
        }
        this.f15610a.run();
    }
}