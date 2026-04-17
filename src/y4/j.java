package y4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import fc.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import z4.b0;
import z4.f1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public final String f19252c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19253d;

    /* renamed from: f, reason: collision with root package name */
    public final Context f19255f;

    /* renamed from: i, reason: collision with root package name */
    public Looper f19258i;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f19250a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f19251b = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final t.b f19254e = new t.b();

    /* renamed from: g, reason: collision with root package name */
    public final t.b f19256g = new t.b();

    /* renamed from: h, reason: collision with root package name */
    public final int f19257h = -1;

    /* renamed from: j, reason: collision with root package name */
    public final x4.f f19259j = x4.f.f18962d;

    /* renamed from: k, reason: collision with root package name */
    public final c5.b f19260k = u5.b.f18281a;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f19261l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f19262m = new ArrayList();

    public j(Context context) {
        this.f19255f = context;
        this.f19258i = context.getMainLooper();
        this.f19252c = context.getPackageName();
        this.f19253d = context.getClass().getName();
    }

    public final b0 a() {
        t.b("must call addApi() to add at least one API", !this.f19256g.isEmpty());
        u5.a aVar = u5.a.f18280b;
        t.b bVar = this.f19256g;
        e eVar = u5.b.f18282b;
        if (bVar.containsKey(eVar)) {
            aVar = (u5.a) bVar.getOrDefault(eVar, null);
        }
        a5.h hVar = new a5.h(null, this.f19250a, this.f19254e, this.f19252c, this.f19253d, aVar);
        Map map = hVar.f333d;
        t.b bVar2 = new t.b();
        t.b bVar3 = new t.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((t.h) this.f19256g.keySet()).iterator();
        while (it.hasNext()) {
            e eVar2 = (e) it.next();
            Object orDefault = this.f19256g.getOrDefault(eVar2, null);
            boolean z7 = map.get(eVar2) != null;
            bVar2.put(eVar2, Boolean.valueOf(z7));
            f1 f1Var = new f1(eVar2, z7);
            arrayList.add(f1Var);
            g5.a aVar2 = eVar2.f19235a;
            t.k(aVar2);
            bVar3.put(eVar2.f19236b, aVar2.a(this.f19255f, this.f19258i, hVar, orDefault, f1Var, f1Var));
        }
        b0 b0Var = new b0(this.f19255f, new ReentrantLock(), this.f19258i, hVar, this.f19259j, this.f19260k, bVar2, this.f19261l, this.f19262m, bVar3, this.f19257h, b0.i(bVar3.values(), true), arrayList);
        Set set = GoogleApiClient.f2475a;
        synchronized (set) {
            set.add(b0Var);
        }
        if (this.f19257h < 0) {
            return b0Var;
        }
        throw null;
    }
}