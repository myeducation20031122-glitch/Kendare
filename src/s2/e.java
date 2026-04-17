package s2;

import java.io.File;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements h, com.bumptech.glide.load.data.d {

    /* renamed from: b, reason: collision with root package name */
    public final List f16702b;

    /* renamed from: e, reason: collision with root package name */
    public final i f16703e;

    /* renamed from: f, reason: collision with root package name */
    public final g f16704f;

    /* renamed from: j, reason: collision with root package name */
    public int f16705j = -1;

    /* renamed from: m, reason: collision with root package name */
    public q2.j f16706m;

    /* renamed from: n, reason: collision with root package name */
    public List f16707n;

    /* renamed from: t, reason: collision with root package name */
    public int f16708t;

    /* renamed from: u, reason: collision with root package name */
    public volatile w2.t f16709u;

    /* renamed from: w, reason: collision with root package name */
    public File f16710w;

    public e(List list, i iVar, g gVar) {
        this.f16702b = list;
        this.f16703e = iVar;
        this.f16704f = gVar;
    }

    @Override // s2.h
    public final boolean a() {
        while (true) {
            List list = this.f16707n;
            boolean z7 = false;
            if (list != null && this.f16708t < list.size()) {
                this.f16709u = null;
                while (!z7 && this.f16708t < this.f16707n.size()) {
                    List list2 = this.f16707n;
                    int i10 = this.f16708t;
                    this.f16708t = i10 + 1;
                    w2.u uVar = (w2.u) list2.get(i10);
                    File file = this.f16710w;
                    i iVar = this.f16703e;
                    this.f16709u = uVar.a(file, iVar.f16736e, iVar.f16737f, iVar.f16740i);
                    if (this.f16709u != null && this.f16703e.c(this.f16709u.f18589c.a()) != null) {
                        this.f16709u.f18589c.d(this.f16703e.f16746o, this);
                        z7 = true;
                    }
                }
                return z7;
            }
            int i11 = this.f16705j + 1;
            this.f16705j = i11;
            if (i11 >= this.f16702b.size()) {
                return false;
            }
            q2.j jVar = (q2.j) this.f16702b.get(this.f16705j);
            i iVar2 = this.f16703e;
            File fileI = iVar2.f16739h.a().i(new f(jVar, iVar2.f16745n));
            this.f16710w = fileI;
            if (fileI != null) {
                this.f16706m = jVar;
                this.f16707n = this.f16703e.f16734c.a().g(fileI);
                this.f16708t = 0;
            }
        }
    }

    @Override // s2.h
    public final void cancel() {
        w2.t tVar = this.f16709u;
        if (tVar != null) {
            tVar.f18589c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(Exception exc) {
        this.f16704f.e(this.f16706m, exc, this.f16709u.f18589c, q2.a.f16115f);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void g(Object obj) {
        this.f16704f.j(this.f16706m, obj, this.f16709u.f18589c, q2.a.f16115f, this.f16706m);
    }
}