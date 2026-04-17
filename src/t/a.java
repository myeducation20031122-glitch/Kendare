package t;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends l.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16964e;

    public a(Object obj, int i10) {
        this.f16963d = i10;
        this.f16964e = obj;
    }

    @Override // l.d
    public final void c() {
        int i10 = this.f16963d;
        Object obj = this.f16964e;
        switch (i10) {
            case 0:
                ((b) obj).clear();
                break;
            default:
                ((c) obj).clear();
                break;
        }
    }

    @Override // l.d
    public final Object d(int i10, int i11) {
        int i12 = this.f16963d;
        Object obj = this.f16964e;
        switch (i12) {
            case 0:
                return ((b) obj).f17004e[(i10 << 1) + i11];
            default:
                return ((c) obj).f16972e[i10];
        }
    }

    @Override // l.d
    public final b e() {
        switch (this.f16963d) {
            case 0:
                return (b) this.f16964e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // l.d
    public final int f() {
        int i10 = this.f16963d;
        Object obj = this.f16964e;
        switch (i10) {
            case 0:
                return ((b) obj).f17005f;
            default:
                return ((c) obj).f16973f;
        }
    }

    @Override // l.d
    public final int g(Object obj) {
        int i10 = this.f16963d;
        Object obj2 = this.f16964e;
        switch (i10) {
            case 0:
                return ((b) obj2).f(obj);
            default:
                return ((c) obj2).indexOf(obj);
        }
    }

    @Override // l.d
    public final int h(Object obj) {
        int i10 = this.f16963d;
        Object obj2 = this.f16964e;
        switch (i10) {
            case 0:
                return ((b) obj2).h(obj);
            default:
                return ((c) obj2).indexOf(obj);
        }
    }

    @Override // l.d
    public final void i(Object obj, Object obj2) {
        int i10 = this.f16963d;
        Object obj3 = this.f16964e;
        switch (i10) {
            case 0:
                ((b) obj3).put(obj, obj2);
                break;
            default:
                ((c) obj3).add(obj);
                break;
        }
    }

    @Override // l.d
    public final void j(int i10) {
        int i11 = this.f16963d;
        Object obj = this.f16964e;
        switch (i11) {
            case 0:
                ((b) obj).k(i10);
                break;
            default:
                ((c) obj).m(i10);
                break;
        }
    }

    @Override // l.d
    public final Object k(int i10, Object obj) {
        switch (this.f16963d) {
            case 0:
                return ((b) this.f16964e).l(i10, obj);
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}