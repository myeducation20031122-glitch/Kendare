package p5;

import com.google.android.gms.internal.ads.dq0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y extends z {

    /* renamed from: f, reason: collision with root package name */
    public final transient int f15994f;

    /* renamed from: j, reason: collision with root package name */
    public final transient int f15995j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f15996m;

    public y(z zVar, int i10, int i11) {
        this.f15996m = zVar;
        this.f15994f = i10;
        this.f15995j = i11;
    }

    @Override // p5.w
    public final int e() {
        return this.f15996m.h() + this.f15994f + this.f15995j;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        dq0.z0(i10, this.f15995j);
        return this.f15996m.get(i10 + this.f15994f);
    }

    @Override // p5.w
    public final int h() {
        return this.f15996m.h() + this.f15994f;
    }

    @Override // p5.w
    public final boolean l() {
        return true;
    }

    @Override // p5.w
    public final Object[] m() {
        return this.f15996m.m();
    }

    @Override // p5.z, java.util.List
    /* renamed from: n */
    public final z subList(int i10, int i11) {
        dq0.y1(i10, i11, this.f15995j);
        int i12 = this.f15994f;
        return this.f15996m.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15995j;
    }
}