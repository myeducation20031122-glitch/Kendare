package a6;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class g extends c0.b {

    /* renamed from: a, reason: collision with root package name */
    public h f452a;

    /* renamed from: b, reason: collision with root package name */
    public int f453b;

    public g() {
        this.f453b = 0;
    }

    @Override // c0.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        t(coordinatorLayout, view, i10);
        if (this.f452a == null) {
            this.f452a = new h(view);
        }
        h hVar = this.f452a;
        View view2 = hVar.f454a;
        hVar.f455b = view2.getTop();
        hVar.f456c = view2.getLeft();
        this.f452a.a();
        int i11 = this.f453b;
        if (i11 == 0) {
            return true;
        }
        h hVar2 = this.f452a;
        if (hVar2.f457d != i11) {
            hVar2.f457d = i11;
            hVar2.a();
        }
        this.f453b = 0;
        return true;
    }

    public final int s() {
        h hVar = this.f452a;
        if (hVar != null) {
            return hVar.f457d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.q(view, i10);
    }

    public g(int i10) {
        super(0);
        this.f453b = 0;
    }
}