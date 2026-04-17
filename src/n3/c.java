package n3;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends m3.g {

    /* renamed from: g0, reason: collision with root package name */
    public final /* synthetic */ int f15350g0;

    @Override // m3.g, m3.f
    public final ValueAnimator d() {
        switch (this.f15350g0) {
            case 0:
                l3.e eVar = new l3.e(this);
                eVar.e(new float[]{0.0f, 1.0f}, m3.f.X, new Integer[]{0, 360});
                eVar.f14541c = 2000L;
                eVar.f14540b = new LinearInterpolator();
                return eVar.a();
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // m3.g
    public final void k(m3.f... fVarArr) {
        int i10 = 0;
        switch (this.f15350g0) {
            case 0:
                if (Build.VERSION.SDK_INT < 24) {
                    fVarArr[1].f15177n = -1000;
                    break;
                } else {
                    fVarArr[1].f15177n = com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS;
                    break;
                }
            case 2:
                if (Build.VERSION.SDK_INT < 24) {
                    fVarArr[1].f15177n = -1000;
                    break;
                } else {
                    fVarArr[1].f15177n = com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS;
                    break;
                }
            case 3:
                while (i10 < fVarArr.length) {
                    m3.f fVar = fVarArr[i10];
                    i10++;
                    fVar.f15177n = i10 * 200;
                }
                break;
            case 4:
                while (i10 < fVarArr.length) {
                    m3.f fVar2 = fVarArr[i10];
                    i10++;
                    fVar2.f15177n = i10 * 200;
                }
                break;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                fVarArr[1].f15177n = 160;
                fVarArr[2].f15177n = 320;
                break;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                if (Build.VERSION.SDK_INT < 24) {
                    fVarArr[1].f15177n = -900;
                    break;
                }
                break;
        }
    }

    @Override // m3.g
    public final m3.f[] l() {
        int i10 = 0;
        switch (this.f15350g0) {
            case 0:
                return new m3.f[]{new b(), new b()};
            case QueueFuseable.SYNC /* 1 */:
                int[] iArr = {200, 300, 400, 100, 200, 300, 0, 100, 200};
                e[] eVarArr = new e[9];
                while (i10 < 9) {
                    e eVar = new e();
                    eVarArr[i10] = eVar;
                    eVar.f15177n = iArr[i10];
                    i10++;
                }
                return eVarArr;
            case 2:
                return new m3.f[]{new b((Object) null), new b((Object) null)};
            case 3:
                return new m3.f[]{new g(0), new g(0), new g(0)};
            case 4:
                return new m3.f[]{new h(), new h(), new h()};
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return new m3.f[]{new b((a) null), new b((a) null), new b((a) null)};
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                return new m3.f[]{new j(0), new j(3)};
            default:
                e[] eVarArr2 = new e[5];
                while (i10 < 5) {
                    e eVar2 = new e((Object) null);
                    eVarArr2[i10] = eVar2;
                    eVar2.f15177n = Build.VERSION.SDK_INT >= 24 ? (i10 * 100) + 600 : (i10 * 100) - 1200;
                    i10++;
                }
                return eVarArr2;
        }
    }

    @Override // m3.g, m3.f, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i10 = 0;
        switch (this.f15350g0) {
            case 0:
                super.onBoundsChange(rect);
                Rect rectA = m3.f.a(rect);
                int iWidth = (int) (rectA.width() * 0.6f);
                m3.f fVarI = i(0);
                int i11 = rectA.right;
                int i12 = rectA.top;
                fVarI.f(i11 - iWidth, i12, i11, i12 + iWidth);
                m3.f fVarI2 = i(1);
                int i13 = rectA.right;
                int i14 = rectA.bottom;
                fVarI2.f(i13 - iWidth, i14 - iWidth, i13, i14);
                break;
            case QueueFuseable.SYNC /* 1 */:
                super.onBoundsChange(rect);
                Rect rectA2 = m3.f.a(rect);
                int iWidth2 = (int) (rectA2.width() * 0.33f);
                int iHeight = (int) (rectA2.height() * 0.33f);
                while (i10 < j()) {
                    int i15 = ((i10 % 3) * iWidth2) + rectA2.left;
                    int i16 = ((i10 / 3) * iHeight) + rectA2.top;
                    i(i10).f(i15, i16, i15 + iWidth2, i16 + iHeight);
                    i10++;
                }
                break;
            case 2:
            case 3:
            case 4:
            default:
                super.onBoundsChange(rect);
                break;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                super.onBoundsChange(rect);
                Rect rectA3 = m3.f.a(rect);
                int iWidth3 = rectA3.width() / 8;
                int iCenterY = rectA3.centerY() - iWidth3;
                int iCenterY2 = rectA3.centerY() + iWidth3;
                while (i10 < j()) {
                    int iWidth4 = ((rectA3.width() * i10) / 3) + rectA3.left;
                    i(i10).f(iWidth4, iCenterY, (iWidth3 * 2) + iWidth4, iCenterY2);
                    i10++;
                }
                break;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                Rect rectA4 = m3.f.a(rect);
                super.onBoundsChange(rectA4);
                while (i10 < j()) {
                    m3.f fVarI3 = i(i10);
                    int i17 = rectA4.left;
                    fVarI3.f(i17, rectA4.top, (rectA4.width() / 4) + i17, (rectA4.height() / 4) + rectA4.top);
                    i10++;
                }
                break;
            case y4.g.NETWORK_ERROR /* 7 */:
                super.onBoundsChange(rect);
                Rect rectA5 = m3.f.a(rect);
                int iWidth5 = rectA5.width() / j();
                int iWidth6 = ((rectA5.width() / 5) * 3) / 5;
                while (i10 < j()) {
                    m3.f fVarI4 = i(i10);
                    int i18 = (iWidth5 / 5) + (i10 * iWidth5) + rectA5.left;
                    fVarI4.f(i18, rectA5.top, i18 + iWidth6, rectA5.bottom);
                    i10++;
                }
                break;
        }
    }
}