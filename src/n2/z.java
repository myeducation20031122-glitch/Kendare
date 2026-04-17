package n2;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f15346c = a0.f15282a;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15347a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f15348b = false;

    public final synchronized void a(long j10, String str) {
        if (this.f15348b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f15347a.add(new y(j10, SystemClock.elapsedRealtime(), str));
    }

    public final synchronized void b(String str) {
        this.f15348b = true;
        ArrayList arrayList = this.f15347a;
        long j10 = arrayList.size() == 0 ? 0L : ((y) arrayList.get(arrayList.size() - 1)).f15345c - ((y) arrayList.get(0)).f15345c;
        if (j10 <= 0) {
            return;
        }
        long j11 = ((y) this.f15347a.get(0)).f15345c;
        a0.b("(%-4d ms) %s", Long.valueOf(j10), str);
        Iterator it = this.f15347a.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            long j12 = yVar.f15345c;
            a0.b("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(yVar.f15344b), yVar.f15343a);
            j11 = j12;
        }
    }

    public final void finalize() {
        if (this.f15348b) {
            return;
        }
        b("Request on the loose");
        a0.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}