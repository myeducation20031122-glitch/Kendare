package f1;

import com.google.android.gms.internal.ads.ic1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public List f12657a;

    public d(int i10) {
        if (i10 == 1) {
            this.f12657a = new CopyOnWriteArrayList();
        } else if (i10 != 3) {
            this.f12657a = new ArrayList();
        } else {
            this.f12657a = new ArrayList();
        }
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            ic1.v(it.next());
            throw null;
        }
    }
}