package a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f132j;

    /* renamed from: a, reason: collision with root package name */
    public int f133a;

    /* renamed from: b, reason: collision with root package name */
    public int f134b;

    /* renamed from: c, reason: collision with root package name */
    public int f135c;

    /* renamed from: d, reason: collision with root package name */
    public float f136d;

    /* renamed from: e, reason: collision with root package name */
    public float f137e;

    /* renamed from: f, reason: collision with root package name */
    public float f138f;

    /* renamed from: g, reason: collision with root package name */
    public int f139g;

    /* renamed from: h, reason: collision with root package name */
    public String f140h;

    /* renamed from: i, reason: collision with root package name */
    public int f141i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f132j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f172f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (f132j.get(index)) {
                case QueueFuseable.SYNC /* 1 */:
                    this.f137e = typedArrayObtainStyledAttributes.getFloat(index, this.f137e);
                    break;
                case 2:
                    this.f135c = typedArrayObtainStyledAttributes.getInt(index, this.f135c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = w.a.f18518a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case y4.g.INVALID_ACCOUNT /* 5 */:
                    this.f133a = o.f(typedArrayObtainStyledAttributes, index, this.f133a);
                    break;
                case y4.g.RESOLUTION_REQUIRED /* 6 */:
                    this.f134b = typedArrayObtainStyledAttributes.getInteger(index, this.f134b);
                    break;
                case y4.g.NETWORK_ERROR /* 7 */:
                    this.f136d = typedArrayObtainStyledAttributes.getFloat(index, this.f136d);
                    break;
                case 8:
                    this.f139g = typedArrayObtainStyledAttributes.getInteger(index, this.f139g);
                    break;
                case 9:
                    this.f138f = typedArrayObtainStyledAttributes.getFloat(index, this.f138f);
                    break;
                case y4.g.DEVELOPER_ERROR /* 10 */:
                    int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i11 != 1) {
                        if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f140h = string;
                            if (string.indexOf("/") > 0) {
                                this.f141i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index, this.f141i);
                            break;
                        }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}