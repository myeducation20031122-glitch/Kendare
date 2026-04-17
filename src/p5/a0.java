package p5;

import com.google.android.gms.internal.ads.dq0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a0 extends z {

    /* renamed from: m, reason: collision with root package name */
    public static final a0 f15938m = new a0(new Object[0], 0);

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f15939f;

    /* renamed from: j, reason: collision with root package name */
    public final transient int f15940j;

    public a0(Object[] objArr, int i10) {
        this.f15939f = objArr;
        this.f15940j = i10;
    }

    @Override // p5.z, p5.w
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f15939f;
        int i10 = this.f15940j;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // p5.w
    public final int e() {
        return this.f15940j;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        dq0.z0(i10, this.f15940j);
        Object obj = this.f15939f[i10];
        obj.getClass();
        return obj;
    }

    @Override // p5.w
    public final int h() {
        return 0;
    }

    @Override // p5.w
    public final boolean l() {
        return false;
    }

    @Override // p5.w
    public final Object[] m() {
        return this.f15939f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15940j;
    }
}