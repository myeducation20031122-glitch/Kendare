package o0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.dq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g0 implements Iterator, KMappedMarker {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15545b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public Iterator f15546e;

    public g0(Iterator it) {
        this.f15546e = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15546e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f15546e.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        Iterator it = viewGroup != null ? g5.a.n(viewGroup).iterator() : null;
        ArrayList arrayList = this.f15545b;
        if (it == null || !it.hasNext()) {
            while (!this.f15546e.hasNext() && (!arrayList.isEmpty())) {
                this.f15546e = (Iterator) fa.g.y3(arrayList);
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                arrayList.remove(dq0.j(arrayList));
            }
        } else {
            arrayList.add(this.f15546e);
            this.f15546e = it;
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}