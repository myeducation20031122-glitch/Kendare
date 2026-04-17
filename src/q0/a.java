package q0;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16092a = 3;

    /* renamed from: b, reason: collision with root package name */
    public float[] f16093b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16094c;

    public a(PathInterpolator pathInterpolator, float[] fArr) {
        this.f16094c = pathInterpolator;
        this.f16093b = fArr;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        int i10 = 0;
        switch (this.f16092a) {
            case 0:
                if (f10 <= 0.0f) {
                    return 0.0f;
                }
                if (f10 >= 1.0f) {
                    return 1.0f;
                }
                int length = this.f16093b.length - 1;
                while (length - i10 > 1) {
                    int i11 = (i10 + length) / 2;
                    if (f10 < this.f16093b[i11]) {
                        length = i11;
                    } else {
                        i10 = i11;
                    }
                }
                float[] fArr = this.f16093b;
                float f11 = fArr[length];
                float f12 = fArr[i10];
                float f13 = f11 - f12;
                if (f13 == 0.0f) {
                    return ((float[]) this.f16094c)[i10];
                }
                float f14 = (f10 - f12) / f13;
                float[] fArr2 = (float[]) this.f16094c;
                float f15 = fArr2[i10];
                return ((fArr2[length] - f15) * f14) + f15;
            case QueueFuseable.SYNC /* 1 */:
                if (f10 <= 0.0f) {
                    return 0.0f;
                }
                if (f10 >= 1.0f) {
                    return 1.0f;
                }
                int length2 = this.f16093b.length - 1;
                while (length2 - i10 > 1) {
                    int i12 = (i10 + length2) / 2;
                    if (f10 < this.f16093b[i12]) {
                        length2 = i12;
                    } else {
                        i10 = i12;
                    }
                }
                float[] fArr3 = this.f16093b;
                float f16 = fArr3[length2];
                float f17 = fArr3[i10];
                float f18 = f16 - f17;
                if (f18 == 0.0f) {
                    return ((float[]) this.f16094c)[i10];
                }
                float f19 = (f10 - f17) / f18;
                float[] fArr4 = (float[]) this.f16094c;
                float f20 = fArr4[i10];
                return ((fArr4[length2] - f20) * f19) + f20;
            case 2:
                if (f10 <= 0.0f) {
                    return 0.0f;
                }
                if (f10 >= 1.0f) {
                    return 1.0f;
                }
                int length3 = this.f16093b.length - 1;
                while (length3 - i10 > 1) {
                    int i13 = (i10 + length3) / 2;
                    if (f10 < this.f16093b[i13]) {
                        length3 = i13;
                    } else {
                        i10 = i13;
                    }
                }
                float[] fArr5 = this.f16093b;
                float f21 = fArr5[length3];
                float f22 = fArr5[i10];
                float f23 = f21 - f22;
                if (f23 == 0.0f) {
                    return ((float[]) this.f16094c)[i10];
                }
                float f24 = (f10 - f22) / f23;
                float[] fArr6 = (float[]) this.f16094c;
                float f25 = fArr6[i10];
                return ((fArr6[length3] - f25) * f24) + f25;
            default:
                if (this.f16093b.length > 1) {
                    while (true) {
                        float[] fArr7 = this.f16093b;
                        if (i10 < fArr7.length - 1) {
                            float f26 = fArr7[i10];
                            i10++;
                            float f27 = fArr7[i10];
                            float f28 = f27 - f26;
                            if (f10 >= f26 && f10 <= f27) {
                                return (((TimeInterpolator) this.f16094c).getInterpolation((f10 - f26) / f28) * f28) + f26;
                            }
                        }
                    }
                }
                return ((TimeInterpolator) this.f16094c).getInterpolation(f10);
        }
    }
}