package m;

import android.util.SparseIntArray;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14776a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14777b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14778c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14779d;

    public f3(int i10) {
        if (i10 != 1) {
            return;
        }
        this.f14778c = new SparseIntArray();
        this.f14779d = new SparseIntArray();
        this.f14776a = false;
        this.f14777b = false;
    }

    public final int a(int i10, int i11) {
        if (!this.f14777b) {
            return c(i10, i11);
        }
        int i12 = ((SparseIntArray) this.f14779d).get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int iC = c(i10, i11);
        ((SparseIntArray) this.f14779d).put(i10, iC);
        return iC;
    }

    public final int b(int i10, int i11) {
        if (!this.f14776a) {
            return i10 % i11;
        }
        int i12 = ((SparseIntArray) this.f14778c).get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int i13 = i10 % i11;
        ((SparseIntArray) this.f14778c).put(i10, i13);
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(int i10, int i11) {
        int iB;
        int i12;
        int i13;
        if (this.f14777b) {
            SparseIntArray sparseIntArray = (SparseIntArray) this.f14779d;
            int size = sparseIntArray.size() - 1;
            int i14 = 0;
            while (i14 <= size) {
                int i15 = (i14 + size) >>> 1;
                if (sparseIntArray.keyAt(i15) < i10) {
                    i14 = i15 + 1;
                } else {
                    size = i15 - 1;
                }
            }
            int i16 = i14 - 1;
            int iKeyAt = (i16 < 0 || i16 >= sparseIntArray.size()) ? -1 : sparseIntArray.keyAt(i16);
            if (iKeyAt != -1) {
                i12 = ((SparseIntArray) this.f14779d).get(iKeyAt);
                i13 = iKeyAt + 1;
                iB = b(iKeyAt, i11) + 1;
                if (iB == i11) {
                    i12++;
                    iB = 0;
                }
            } else {
                iB = 0;
                i12 = 0;
                i13 = 0;
            }
        }
        while (i13 < i10) {
            iB++;
            if (iB == i11) {
                i12++;
                iB = 0;
            } else if (iB > i11) {
                i12++;
                iB = 1;
            }
            i13++;
        }
        return iB + 1 > i11 ? i12 + 1 : i12;
    }

    public final void d() {
        ((SparseIntArray) this.f14778c).clear();
    }
}