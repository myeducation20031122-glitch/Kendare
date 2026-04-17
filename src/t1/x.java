package t1;

import android.view.ViewGroup;
import com.google.android.gms.internal.ads.ic1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17103a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f17104b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f17105c = new ArrayList();

    public static void a(ViewGroup viewGroup, t tVar) {
        ArrayList arrayList = f17105c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (tVar == null) {
            tVar = f17103a;
        }
        t tVarClone = tVar.clone();
        ArrayList arrayList2 = (ArrayList) b().getOrDefault(viewGroup, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((t) it.next()).z(viewGroup);
            }
        }
        if (tVarClone != null) {
            tVarClone.j(viewGroup, true);
        }
        ic1.v(viewGroup.getTag(2131296970));
        viewGroup.setTag(2131296970, null);
        if (tVarClone != null) {
            w wVar = new w();
            wVar.f17101b = tVarClone;
            wVar.f17102e = viewGroup;
            viewGroup.addOnAttachStateChangeListener(wVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(wVar);
        }
    }

    public static t.b b() {
        t.b bVar;
        ThreadLocal threadLocal = f17104b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (t.b) weakReference.get()) != null) {
            return bVar;
        }
        t.b bVar2 = new t.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}