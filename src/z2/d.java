package z2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements s2.e0, s2.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19515b = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f19516e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f19517f;

    public d(Resources resources, s2.e0 e0Var) {
        if (resources == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f19516e = resources;
        if (e0Var == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f19517f = e0Var;
    }

    public static d e(Bitmap bitmap, t2.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new d(bitmap, dVar);
    }

    @Override // s2.b0
    public final void a() {
        switch (this.f19515b) {
            case 0:
                ((Bitmap) this.f19516e).prepareToDraw();
                break;
            default:
                s2.e0 e0Var = (s2.e0) this.f19517f;
                if (e0Var instanceof s2.b0) {
                    ((s2.b0) e0Var).a();
                    break;
                }
                break;
        }
    }

    @Override // s2.e0
    public final int b() {
        switch (this.f19515b) {
            case 0:
                return i3.o.c((Bitmap) this.f19516e);
            default:
                return ((s2.e0) this.f19517f).b();
        }
    }

    @Override // s2.e0
    public final Class c() {
        switch (this.f19515b) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // s2.e0
    public final void d() {
        int i10 = this.f19515b;
        Object obj = this.f19517f;
        switch (i10) {
            case 0:
                ((t2.d) obj).c((Bitmap) this.f19516e);
                break;
            default:
                ((s2.e0) obj).d();
                break;
        }
    }

    @Override // s2.e0
    public final Object get() {
        int i10 = this.f19515b;
        Object obj = this.f19516e;
        switch (i10) {
            case 0:
                return (Bitmap) obj;
            default:
                return new BitmapDrawable((Resources) obj, (Bitmap) ((s2.e0) this.f19517f).get());
        }
    }

    public d(Bitmap bitmap, t2.d dVar) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        this.f19516e = bitmap;
        if (dVar == null) {
            throw new NullPointerException("BitmapPool must not be null");
        }
        this.f19517f = dVar;
    }
}