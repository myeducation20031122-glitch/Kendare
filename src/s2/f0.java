package s2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f0 implements h, com.bumptech.glide.load.data.d {
    public g0 M;

    /* renamed from: b, reason: collision with root package name */
    public final g f16713b;

    /* renamed from: e, reason: collision with root package name */
    public final i f16714e;

    /* renamed from: f, reason: collision with root package name */
    public int f16715f;

    /* renamed from: j, reason: collision with root package name */
    public int f16716j = -1;

    /* renamed from: m, reason: collision with root package name */
    public q2.j f16717m;

    /* renamed from: n, reason: collision with root package name */
    public List f16718n;

    /* renamed from: t, reason: collision with root package name */
    public int f16719t;

    /* renamed from: u, reason: collision with root package name */
    public volatile w2.t f16720u;

    /* renamed from: w, reason: collision with root package name */
    public File f16721w;

    public f0(i iVar, g gVar) {
        this.f16714e = iVar;
        this.f16713b = gVar;
    }

    @Override // s2.h
    public final boolean a() {
        ArrayList arrayListA = this.f16714e.a();
        boolean z7 = false;
        if (arrayListA.isEmpty()) {
            return false;
        }
        List listD = this.f16714e.d();
        if (listD.isEmpty()) {
            if (File.class.equals(this.f16714e.f16742k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f16714e.f16735d.getClass() + " to " + this.f16714e.f16742k);
        }
        while (true) {
            List list = this.f16718n;
            if (list != null && this.f16719t < list.size()) {
                this.f16720u = null;
                while (!z7 && this.f16719t < this.f16718n.size()) {
                    List list2 = this.f16718n;
                    int i10 = this.f16719t;
                    this.f16719t = i10 + 1;
                    w2.u uVar = (w2.u) list2.get(i10);
                    File file = this.f16721w;
                    i iVar = this.f16714e;
                    this.f16720u = uVar.a(file, iVar.f16736e, iVar.f16737f, iVar.f16740i);
                    if (this.f16720u != null && this.f16714e.c(this.f16720u.f18589c.a()) != null) {
                        this.f16720u.f18589c.d(this.f16714e.f16746o, this);
                        z7 = true;
                    }
                }
                return z7;
            }
            int i11 = this.f16716j + 1;
            this.f16716j = i11;
            if (i11 >= listD.size()) {
                int i12 = this.f16715f + 1;
                this.f16715f = i12;
                if (i12 >= arrayListA.size()) {
                    return false;
                }
                this.f16716j = 0;
            }
            q2.j jVar = (q2.j) arrayListA.get(this.f16715f);
            Class cls = (Class) listD.get(this.f16716j);
            q2.r rVarF = this.f16714e.f(cls);
            i iVar2 = this.f16714e;
            this.M = new g0(iVar2.f16734c.f2266a, jVar, iVar2.f16745n, iVar2.f16736e, iVar2.f16737f, rVarF, cls, iVar2.f16740i);
            File fileI = iVar2.f16739h.a().i(this.M);
            this.f16721w = fileI;
            if (fileI != null) {
                this.f16717m = jVar;
                this.f16718n = this.f16714e.f16734c.a().g(fileI);
                this.f16719t = 0;
            }
        }
    }

    @Override // s2.h
    public final void cancel() {
        w2.t tVar = this.f16720u;
        if (tVar != null) {
            tVar.f18589c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(Exception exc) {
        this.f16713b.e(this.M, exc, this.f16720u.f18589c, q2.a.f16116j);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void g(Object obj) {
        this.f16713b.j(this.f16717m, obj, this.f16720u.f18589c, q2.a.f16116j, this.M);
    }
}