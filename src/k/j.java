package k;

import io.reactivex.internal.fuseable.QueueFuseable;
import m.o3;
import o0.p1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j extends com.bumptech.glide.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13928a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13929b;

    /* renamed from: c, reason: collision with root package name */
    public int f13930c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13931d;

    public j(k kVar) {
        this.f13928a = 0;
        this.f13931d = kVar;
        this.f13929b = false;
        this.f13930c = 0;
    }

    @Override // o0.p1
    public final void a() {
        int i10 = this.f13928a;
        Object obj = this.f13931d;
        switch (i10) {
            case 0:
                int i11 = this.f13930c + 1;
                this.f13930c = i11;
                k kVar = (k) obj;
                if (i11 == kVar.f13932a.size()) {
                    p1 p1Var = kVar.f13935d;
                    if (p1Var != null) {
                        p1Var.a();
                    }
                    this.f13930c = 0;
                    this.f13929b = false;
                    kVar.f13936e = false;
                    break;
                }
                break;
            default:
                if (!this.f13929b) {
                    ((o3) obj).f14873a.setVisibility(this.f13930c);
                    break;
                }
                break;
        }
    }

    @Override // com.bumptech.glide.e, o0.p1
    public final void b() {
        switch (this.f13928a) {
            case QueueFuseable.SYNC /* 1 */:
                this.f13929b = true;
                break;
        }
    }

    @Override // com.bumptech.glide.e, o0.p1
    public final void c() {
        int i10 = this.f13928a;
        Object obj = this.f13931d;
        switch (i10) {
            case 0:
                if (!this.f13929b) {
                    this.f13929b = true;
                    p1 p1Var = ((k) obj).f13935d;
                    if (p1Var != null) {
                        p1Var.c();
                        break;
                    }
                }
                break;
            default:
                ((o3) obj).f14873a.setVisibility(0);
                break;
        }
    }

    public j(o3 o3Var, int i10) {
        this.f13928a = 1;
        this.f13931d = o3Var;
        this.f13930c = i10;
        this.f13929b = false;
    }
}