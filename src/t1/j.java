package t1;

import android.view.View;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f17045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17046b;

    public j(View view, ArrayList arrayList) {
        this.f17045a = view;
        this.f17046b = arrayList;
    }

    @Override // t1.r
    public final void a(t tVar) {
        tVar.A(this);
        this.f17045a.setVisibility(8);
        ArrayList arrayList = this.f17046b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((View) arrayList.get(i10)).setVisibility(0);
        }
    }

    @Override // t1.r
    public final void b(t tVar) {
        a(tVar);
    }

    @Override // t1.r
    public final void c(t tVar) {
        tVar.A(this);
        tVar.b(this);
    }

    @Override // t1.r
    public final void d(t tVar) {
    }

    @Override // t1.r
    public final void e() {
    }

    @Override // t1.r
    public final void f() {
    }

    @Override // t1.r
    public final void g(t tVar) {
        tVar.A(this);
        tVar.b(this);
    }
}