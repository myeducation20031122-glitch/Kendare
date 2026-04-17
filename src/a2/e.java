package a2;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.n3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import z1.v;
import z1.z;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends com.bumptech.glide.e {

    /* renamed from: i, reason: collision with root package name */
    public static final String f233i = z1.o.t("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final m f234a;

    /* renamed from: b, reason: collision with root package name */
    public final String f235b;

    /* renamed from: d, reason: collision with root package name */
    public final List f237d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f238e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240g;

    /* renamed from: h, reason: collision with root package name */
    public n3 f241h;

    /* renamed from: c, reason: collision with root package name */
    public final int f236c = 2;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f239f = new ArrayList();

    public e(m mVar, String str, List list) {
        this.f234a = mVar;
        this.f235b = str;
        this.f237d = list;
        this.f238e = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            String string = ((z) list.get(i10)).f19500a.toString();
            this.f238e.add(string);
            this.f239f.add(string);
        }
    }

    public static boolean k0(e eVar, HashSet hashSet) {
        hashSet.addAll(eVar.f238e);
        HashSet hashSetL0 = l0(eVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSetL0.contains((String) it.next())) {
                return true;
            }
        }
        hashSet.removeAll(eVar.f238e);
        return false;
    }

    public static HashSet l0(e eVar) {
        HashSet hashSet = new HashSet();
        eVar.getClass();
        return hashSet;
    }

    public final v j0() {
        if (this.f240g) {
            z1.o.r().u(f233i, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f238e)), new Throwable[0]);
        } else {
            j2.d dVar = new j2.d(this);
            ((g.e) this.f234a.f262f).n(dVar);
            this.f241h = dVar.f13581e;
        }
        return this.f241h;
    }
}