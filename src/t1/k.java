package t1;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k extends u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f17047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17049c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17050d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17052f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f17053g;

    public k(m mVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f17053g = mVar;
        this.f17047a = obj;
        this.f17048b = arrayList;
        this.f17051e = obj2;
        this.f17052f = arrayList2;
    }

    @Override // t1.r
    public final void a(t tVar) {
        tVar.A(this);
    }

    @Override // t1.u, t1.r
    public final void c(t tVar) {
        m mVar = this.f17053g;
        Object obj = this.f17047a;
        if (obj != null) {
            mVar.s(obj, this.f17048b, null);
        }
        Object obj2 = this.f17049c;
        if (obj2 != null) {
            mVar.s(obj2, this.f17050d, null);
        }
        Object obj3 = this.f17051e;
        if (obj3 != null) {
            mVar.s(obj3, this.f17052f, null);
        }
    }
}