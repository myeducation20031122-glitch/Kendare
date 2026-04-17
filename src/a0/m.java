package a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f142a;

    /* renamed from: b, reason: collision with root package name */
    public int f143b;

    /* renamed from: c, reason: collision with root package name */
    public float f144c;

    /* renamed from: d, reason: collision with root package name */
    public float f145d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f173g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 1) {
                this.f144c = typedArrayObtainStyledAttributes.getFloat(index, this.f144c);
            } else if (index == 0) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f142a);
                this.f142a = i11;
                this.f142a = o.f160d[i11];
            } else if (index == 4) {
                this.f143b = typedArrayObtainStyledAttributes.getInt(index, this.f143b);
            } else if (index == 3) {
                this.f145d = typedArrayObtainStyledAttributes.getFloat(index, this.f145d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}