package i7;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements z4.b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f13420a = new AtomicReference();

    @Override // z4.b
    public final void a(boolean z7) {
        synchronized (g.f13424j) {
            try {
                Iterator it = new ArrayList(g.f13426l.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.f13431e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = gVar.f13435i.iterator();
                        while (it2.hasNext()) {
                            g gVar2 = ((c) it2.next()).f13419a;
                            if (z7) {
                                gVar2.getClass();
                            } else {
                                ((g8.d) gVar2.f13434h.get()).c();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}