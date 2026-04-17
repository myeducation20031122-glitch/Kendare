package p5;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class b0 implements ListIterator, Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15942b;

    public b0(int i10) {
        this.f15942b = i10;
    }

    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f15942b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        switch (this.f15942b) {
            case 0:
                a();
                throw null;
            default:
                b();
                throw null;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f15942b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}