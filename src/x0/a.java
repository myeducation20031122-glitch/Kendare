package x0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import o0.c1;
import p0.h;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends p8.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f18855j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(9);
        this.f18855j = bVar;
    }

    @Override // p8.c
    public final h p(int i10) {
        return new h(AccessibilityNodeInfo.obtain(this.f18855j.n(i10).f15862a));
    }

    @Override // p8.c
    public final h q(int i10) {
        b bVar = this.f18855j;
        int i11 = i10 == 2 ? bVar.f18866k : bVar.f18867l;
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return p(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    @Override // p8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(int i10, int i11, Bundle bundle) {
        int i12;
        b bVar = this.f18855j;
        View view = bVar.f18864i;
        if (i10 == -1) {
            WeakHashMap weakHashMap = c1.f15515a;
            return view.performAccessibilityAction(i11, bundle);
        }
        boolean z7 = true;
        if (i11 == 1) {
            return bVar.p(i10);
        }
        if (i11 == 2) {
            return bVar.j(i10);
        }
        boolean z10 = false;
        if (i11 == 64) {
            AccessibilityManager accessibilityManager = bVar.f18863h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = bVar.f18866k) != i10) {
                if (i12 != Integer.MIN_VALUE) {
                    bVar.f18866k = Integer.MIN_VALUE;
                    bVar.f18864i.invalidate();
                    bVar.q(i12, 65536);
                }
                bVar.f18866k = i10;
                view.invalidate();
                bVar.q(i10, 32768);
            }
        } else {
            if (i11 != 128) {
                j6.d dVar = (j6.d) bVar;
                if (i11 != 16) {
                    return false;
                }
                Chip chip = dVar.f13801q;
                if (i10 == 0) {
                    return chip.performClick();
                }
                if (i10 != 1) {
                    return false;
                }
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f11409u;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z10 = true;
                }
                if (!chip.V) {
                    return z10;
                }
                chip.U.q(1, 1);
                return z10;
            }
            if (bVar.f18866k == i10) {
                bVar.f18866k = Integer.MIN_VALUE;
                view.invalidate();
                bVar.q(i10, 65536);
            } else {
                z7 = false;
            }
        }
        return z7;
    }
}