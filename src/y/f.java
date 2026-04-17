package y;

import java.util.ArrayList;
import java.util.Iterator;
import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final p f19149d;

    /* renamed from: f, reason: collision with root package name */
    public int f19151f;

    /* renamed from: g, reason: collision with root package name */
    public int f19152g;

    /* renamed from: a, reason: collision with root package name */
    public p f19146a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19147b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19148c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f19150e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f19153h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f19154i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19155j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f19156k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f19157l = new ArrayList();

    public f(p pVar) {
        this.f19149d = pVar;
    }

    @Override // y.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f19157l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f19155j) {
                return;
            }
        }
        this.f19148c = true;
        p pVar = this.f19146a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f19147b) {
            this.f19149d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i10 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f19155j) {
            g gVar = this.f19154i;
            if (gVar != null) {
                if (!gVar.f19155j) {
                    return;
                } else {
                    this.f19151f = this.f19153h * gVar.f19152g;
                }
            }
            d(fVar.f19152g + this.f19151f);
        }
        p pVar2 = this.f19146a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.f19156k.add(dVar);
        if (this.f19155j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f19157l.clear();
        this.f19156k.clear();
        this.f19155j = false;
        this.f19152g = 0;
        this.f19148c = false;
        this.f19147b = false;
    }

    public void d(int i10) {
        if (this.f19155j) {
            return;
        }
        this.f19155j = true;
        this.f19152g = i10;
        Iterator it = this.f19156k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19149d.f19180b.f18781h0);
        sb.append(":");
        sb.append(r.s(this.f19150e));
        sb.append("(");
        sb.append(this.f19155j ? Integer.valueOf(this.f19152g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f19157l.size());
        sb.append(":d=");
        sb.append(this.f19156k.size());
        sb.append(">");
        return sb.toString();
    }
}