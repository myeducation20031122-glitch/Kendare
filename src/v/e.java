package v;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class e implements n0.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18343b;

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f18344e;

    /* renamed from: f, reason: collision with root package name */
    public int f18345f;

    public e(int i10, int i11) {
        this.f18343b = i11;
        if (i11 != 1) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f18344e = new Object[i10];
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0".toString());
            }
            this.f18344e = new Object[i10];
        }
    }

    @Override // n0.c
    public boolean d(Object instance) {
        boolean z7;
        int i10 = this.f18343b;
        Object[] objArr = this.f18344e;
        switch (i10) {
            case 0:
                int i11 = this.f18345f;
                if (i11 >= objArr.length) {
                    return false;
                }
                objArr[i11] = instance;
                this.f18345f = i11 + 1;
                return true;
            default:
                Intrinsics.f(instance, "instance");
                int i12 = this.f18345f;
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        z7 = false;
                    } else if (objArr[i13] == instance) {
                        z7 = true;
                    } else {
                        i13++;
                    }
                }
                if (!(!z7)) {
                    throw new IllegalStateException("Already in the pool!".toString());
                }
                int i14 = this.f18345f;
                if (i14 >= objArr.length) {
                    return false;
                }
                objArr[i14] = instance;
                this.f18345f = i14 + 1;
                return true;
        }
    }

    @Override // n0.c
    public Object j() {
        int i10 = this.f18343b;
        Object[] objArr = this.f18344e;
        switch (i10) {
            case 0:
                int i11 = this.f18345f;
                if (i11 <= 0) {
                    return null;
                }
                int i12 = i11 - 1;
                Object obj = objArr[i12];
                objArr[i12] = null;
                this.f18345f = i12;
                return obj;
            default:
                int i13 = this.f18345f;
                if (i13 <= 0) {
                    return null;
                }
                int i14 = i13 - 1;
                Object obj2 = objArr[i14];
                Intrinsics.d(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i14] = null;
                this.f18345f--;
                return obj2;
        }
    }
}