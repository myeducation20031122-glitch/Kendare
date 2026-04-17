package c3;

import d3.e;
import java.util.ArrayList;
import java.util.Iterator;
import q2.q;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2089a;

    public c(int i10) {
        if (i10 != 1) {
            this.f2089a = new ArrayList();
        } else {
            this.f2089a = new ArrayList();
        }
    }

    public final synchronized a a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return d.f2090b;
        }
        Iterator it = this.f2089a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f2086a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f2087b)) {
                return bVar.f2088c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public final synchronized q b(Class cls) {
        int size = this.f2089a.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.f2089a.get(i10);
            if (eVar.f12311a.isAssignableFrom(cls)) {
                return eVar.f12312b;
            }
        }
        return null;
    }

    public final synchronized ArrayList c(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f2089a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f2086a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f2087b) && !arrayList.contains(bVar.f2087b)) {
                arrayList.add(bVar.f2087b);
            }
        }
        return arrayList;
    }
}