package n3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j extends m3.b {

    /* renamed from: i0, reason: collision with root package name */
    public final int f15354i0;

    public j(int i10) {
        super(1);
        this.f15354i0 = i10;
    }

    @Override // m3.f
    public final ValueAnimator d() {
        float[] fArr = {0.0f, 0.25f, 0.5f, 0.51f, 0.75f, 1.0f};
        l3.e eVar = new l3.e(this);
        int i10 = 0;
        eVar.e(fArr, m3.f.X, new Integer[]{0, -90, -179, -180, -270, -360});
        eVar.d(fArr, m3.f.Z, new Float[]{Float.valueOf(0.0f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.0f), Float.valueOf(0.0f)});
        eVar.d(fArr, m3.f.f15168a0, new Float[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.0f)});
        eVar.d(fArr, m3.f.f15170c0, new Float[]{Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(1.0f)});
        eVar.f14541c = 1800L;
        eVar.b(fArr);
        if (Build.VERSION.SDK_INT >= 24) {
            int i11 = this.f15354i0;
            if (i11 < 0) {
                Log.w("SpriteAnimatorBuilder", "startFrame should always be non-negative");
            } else {
                i10 = i11;
            }
            eVar.f14542d = i10;
        }
        return eVar.a();
    }
}