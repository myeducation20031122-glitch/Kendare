package o0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j1 implements Iterator, KMutableIterator {

    /* renamed from: b, reason: collision with root package name */
    public int f15571b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f15572e;

    public j1(ViewGroup viewGroup) {
        this.f15572e = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15571b < this.f15572e.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f15571b;
        this.f15571b = i10 + 1;
        View childAt = this.f15572e.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f15571b - 1;
        this.f15571b = i10;
        this.f15572e.removeViewAt(i10);
    }
}