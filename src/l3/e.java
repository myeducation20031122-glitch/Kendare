package l3;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import m3.f;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f14539a;

    /* renamed from: b, reason: collision with root package name */
    public Interpolator f14540b;

    /* renamed from: c, reason: collision with root package name */
    public long f14541c = 2000;

    /* renamed from: d, reason: collision with root package name */
    public int f14542d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f14543e = new HashMap();

    public e(f fVar) {
        this.f14539a = fVar;
    }

    public static void c(int i10, int i11) {
        if (i10 != i11) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public final ObjectAnimator a() {
        HashMap map = this.f14543e;
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[map.size()];
        Iterator it = map.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            c cVar = (c) ((Map.Entry) it.next()).getValue();
            float[] fArr = cVar.f14536a;
            Keyframe[] keyframeArr = new Keyframe[fArr.length];
            int i11 = this.f14542d;
            float f10 = fArr[i11];
            while (true) {
                int i12 = this.f14542d;
                Object[] objArr = cVar.f14538c;
                if (i11 < objArr.length + i12) {
                    int i13 = i11 - i12;
                    int length = i11 % objArr.length;
                    float f11 = fArr[length] - f10;
                    if (f11 < 0.0f) {
                        f11 += fArr[fArr.length - 1];
                    }
                    if (cVar instanceof d) {
                        keyframeArr[i13] = Keyframe.ofInt(f11, ((Integer) objArr[length]).intValue());
                    } else if (cVar instanceof b) {
                        keyframeArr[i13] = Keyframe.ofFloat(f11, ((Float) objArr[length]).floatValue());
                    } else {
                        keyframeArr[i13] = Keyframe.ofObject(f11, objArr[length]);
                    }
                    i11++;
                }
            }
            propertyValuesHolderArr[i10] = PropertyValuesHolder.ofKeyframe(cVar.f14537b, keyframeArr);
            i10++;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f14539a, propertyValuesHolderArr);
        objectAnimatorOfPropertyValuesHolder.setDuration(this.f14541c);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(this.f14540b);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final void b(float... fArr) {
        q0.a aVar = new q0.a(new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f), new float[0]);
        aVar.f16093b = fArr;
        this.f14540b = aVar;
    }

    public final void d(float[] fArr, m3.d dVar, Float[] fArr2) {
        c(fArr.length, fArr2.length);
        this.f14543e.put(dVar.getName(), new b(fArr, dVar, fArr2));
    }

    public final void e(float[] fArr, m3.e eVar, Integer[] numArr) {
        c(fArr.length, numArr.length);
        this.f14543e.put(eVar.getName(), new d(fArr, eVar, numArr));
    }
}