package o;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class e extends f implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public c f15490b;

    /* renamed from: e, reason: collision with root package name */
    public c f15491e;

    @Override // o.f
    public final void a(c cVar) {
        c cVar2;
        c cVar3;
        c cVar4 = null;
        if (this.f15490b == cVar && cVar == this.f15491e) {
            this.f15491e = null;
            this.f15490b = null;
        }
        c cVar5 = this.f15490b;
        if (cVar5 == cVar) {
            switch (((b) this).f15482f) {
                case 0:
                    cVar3 = cVar5.f15486j;
                    break;
                default:
                    cVar3 = cVar5.f15485f;
                    break;
            }
            this.f15490b = cVar3;
        }
        c cVar6 = this.f15491e;
        if (cVar6 == cVar) {
            c cVar7 = this.f15490b;
            if (cVar6 != cVar7 && cVar7 != null) {
                switch (((b) this).f15482f) {
                    case 0:
                        cVar2 = cVar6.f15485f;
                        break;
                    default:
                        cVar2 = cVar6.f15486j;
                        break;
                }
                cVar4 = cVar2;
            }
            this.f15491e = cVar4;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15491e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        c cVar2 = this.f15491e;
        c cVar3 = this.f15490b;
        if (cVar2 != cVar3 && cVar3 != null) {
            switch (((b) this).f15482f) {
                case 0:
                    cVar = cVar2.f15485f;
                    break;
                default:
                    cVar = cVar2.f15486j;
                    break;
            }
        } else {
            cVar = null;
        }
        this.f15491e = cVar;
        return cVar2;
    }
}