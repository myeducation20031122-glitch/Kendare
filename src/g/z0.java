package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import o0.c1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z0 extends com.bumptech.glide.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f12938b;

    public /* synthetic */ z0(b1 b1Var, int i10) {
        this.f12937a = i10;
        this.f12938b = b1Var;
    }

    @Override // o0.p1
    public final void a() {
        View view;
        int i10 = this.f12937a;
        b1 b1Var = this.f12938b;
        switch (i10) {
            case 0:
                if (b1Var.f12747o && (view = b1Var.f12739g) != null) {
                    view.setTranslationY(0.0f);
                    b1Var.f12736d.setTranslationY(0.0f);
                }
                b1Var.f12736d.setVisibility(8);
                b1Var.f12736d.setTransitioning(false);
                b1Var.f12751s = null;
                k.a aVar = b1Var.f12743k;
                if (aVar != null) {
                    aVar.d(b1Var.f12742j);
                    b1Var.f12742j = null;
                    b1Var.f12743k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = b1Var.f12735c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = c1.f15515a;
                    o0.o0.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                b1Var.f12751s = null;
                b1Var.f12736d.requestLayout();
                break;
        }
    }
}