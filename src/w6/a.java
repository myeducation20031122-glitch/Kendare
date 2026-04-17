package w6;

import android.view.View;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends dq0 {
    public final /* synthetic */ int B;
    public final SideSheetBehavior C;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i10) {
        this.B = i10;
        this.C = sideSheetBehavior;
    }

    public final float f3(int i10) {
        switch (this.B) {
            case 0:
                float fH3 = h3();
                return (i10 - fH3) / (g3() - fH3);
            default:
                float fH32 = h3();
                return (fH32 - i10) / (fH32 - g3());
        }
    }

    public final int g3() {
        int i10 = this.B;
        SideSheetBehavior sideSheetBehavior = this.C;
        switch (i10) {
            case 0:
                return Math.max(0, sideSheetBehavior.f11521n + sideSheetBehavior.f11522o);
            default:
                return Math.max(0, (h3() - sideSheetBehavior.f11519l) - sideSheetBehavior.f11522o);
        }
    }

    public final int h3() {
        int i10 = this.B;
        SideSheetBehavior sideSheetBehavior = this.C;
        switch (i10) {
            case 0:
                return (-sideSheetBehavior.f11519l) - sideSheetBehavior.f11522o;
            default:
                return sideSheetBehavior.f11520m;
        }
    }

    public final boolean i3(float f10) {
        switch (this.B) {
            case 0:
                if (f10 > 0.0f) {
                }
                break;
            default:
                if (f10 < 0.0f) {
                }
                break;
        }
        return false;
    }

    public final boolean j3(View view) {
        switch (this.B) {
            case 0:
                if (view.getRight() < (g3() - h3()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (g3() + h3()) / 2) {
                }
                break;
        }
        return false;
    }

    public final boolean k3(float f10, float f11) {
        int i10 = this.B;
        SideSheetBehavior sideSheetBehavior = this.C;
        switch (i10) {
            case 0:
                if (Math.abs(f10) > Math.abs(f11)) {
                    float fAbs = Math.abs(f10);
                    sideSheetBehavior.getClass();
                    if (fAbs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f10) > Math.abs(f11)) {
                    float fAbs2 = Math.abs(f10);
                    sideSheetBehavior.getClass();
                    if (fAbs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    public final boolean l3(View view, float f10) {
        int i10 = this.B;
        SideSheetBehavior sideSheetBehavior = this.C;
        switch (i10) {
            case 0:
                if (Math.abs((f10 * sideSheetBehavior.f11518k) + view.getLeft()) > 0.5f) {
                }
                break;
            default:
                if (Math.abs((f10 * sideSheetBehavior.f11518k) + view.getRight()) > 0.5f) {
                }
                break;
        }
        return false;
    }
}