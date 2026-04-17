package a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f146n;

    /* renamed from: a, reason: collision with root package name */
    public float f147a;

    /* renamed from: b, reason: collision with root package name */
    public float f148b;

    /* renamed from: c, reason: collision with root package name */
    public float f149c;

    /* renamed from: d, reason: collision with root package name */
    public float f150d;

    /* renamed from: e, reason: collision with root package name */
    public float f151e;

    /* renamed from: f, reason: collision with root package name */
    public float f152f;

    /* renamed from: g, reason: collision with root package name */
    public float f153g;

    /* renamed from: h, reason: collision with root package name */
    public int f154h;

    /* renamed from: i, reason: collision with root package name */
    public float f155i;

    /* renamed from: j, reason: collision with root package name */
    public float f156j;

    /* renamed from: k, reason: collision with root package name */
    public float f157k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f158l;

    /* renamed from: m, reason: collision with root package name */
    public float f159m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f146n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f175i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (f146n.get(index)) {
                case QueueFuseable.SYNC /* 1 */:
                    this.f147a = typedArrayObtainStyledAttributes.getFloat(index, this.f147a);
                    break;
                case 2:
                    this.f148b = typedArrayObtainStyledAttributes.getFloat(index, this.f148b);
                    break;
                case 3:
                    this.f149c = typedArrayObtainStyledAttributes.getFloat(index, this.f149c);
                    break;
                case 4:
                    this.f150d = typedArrayObtainStyledAttributes.getFloat(index, this.f150d);
                    break;
                case y4.g.INVALID_ACCOUNT /* 5 */:
                    this.f151e = typedArrayObtainStyledAttributes.getFloat(index, this.f151e);
                    break;
                case y4.g.RESOLUTION_REQUIRED /* 6 */:
                    this.f152f = typedArrayObtainStyledAttributes.getDimension(index, this.f152f);
                    break;
                case y4.g.NETWORK_ERROR /* 7 */:
                    this.f153g = typedArrayObtainStyledAttributes.getDimension(index, this.f153g);
                    break;
                case 8:
                    this.f155i = typedArrayObtainStyledAttributes.getDimension(index, this.f155i);
                    break;
                case 9:
                    this.f156j = typedArrayObtainStyledAttributes.getDimension(index, this.f156j);
                    break;
                case y4.g.DEVELOPER_ERROR /* 10 */:
                    this.f157k = typedArrayObtainStyledAttributes.getDimension(index, this.f157k);
                    break;
                case 11:
                    this.f158l = true;
                    this.f159m = typedArrayObtainStyledAttributes.getDimension(index, this.f159m);
                    break;
                case 12:
                    this.f154h = o.f(typedArrayObtainStyledAttributes, index, this.f154h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}