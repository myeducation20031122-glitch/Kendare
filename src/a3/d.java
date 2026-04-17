package a3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b3.h;
import com.bumptech.glide.q;
import com.google.android.gms.internal.measurement.n3;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Drawable drawable, int i10) {
        super(drawable);
        this.f289e = i10;
    }

    @Override // s2.b0
    public final void a() {
        Bitmap bitmap;
        int i10 = this.f289e;
        Drawable drawable = this.f288b;
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                ((b3.c) drawable).f1850b.f1849a.f1880l.prepareToDraw();
                break;
            default:
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                } else if (drawable instanceof b3.c) {
                    bitmap = ((b3.c) drawable).f1850b.f1849a.f1880l;
                }
                bitmap.prepareToDraw();
                break;
        }
    }

    @Override // s2.e0
    public final int b() {
        int i10 = this.f289e;
        Drawable drawable = this.f288b;
        switch (i10) {
            case 0:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                h hVar = ((b3.c) drawable).f1850b.f1849a;
                p2.e eVar = (p2.e) hVar.f1869a;
                return (eVar.f15905j.length * 4) + eVar.f15899d.limit() + eVar.f15904i.length + hVar.f1882n;
        }
    }

    @Override // s2.e0
    public final Class c() {
        switch (this.f289e) {
            case 0:
                return this.f288b.getClass();
            default:
                return b3.c.class;
        }
    }

    @Override // s2.e0
    public final void d() {
        t2.h hVar;
        t2.h hVar2;
        t2.h hVar3;
        switch (this.f289e) {
            case 0:
                break;
            default:
                b3.c cVar = (b3.c) this.f288b;
                cVar.stop();
                cVar.f1853j = true;
                h hVar4 = cVar.f1850b.f1849a;
                hVar4.f1871c.clear();
                Bitmap bitmap = hVar4.f1880l;
                if (bitmap != null) {
                    hVar4.f1873e.c(bitmap);
                    hVar4.f1880l = null;
                }
                hVar4.f1874f = false;
                b3.e eVar = hVar4.f1877i;
                q qVar = hVar4.f1872d;
                if (eVar != null) {
                    qVar.k(eVar);
                    hVar4.f1877i = null;
                }
                b3.e eVar2 = hVar4.f1879k;
                if (eVar2 != null) {
                    qVar.k(eVar2);
                    hVar4.f1879k = null;
                }
                b3.e eVar3 = hVar4.f1881m;
                if (eVar3 != null) {
                    qVar.k(eVar3);
                    hVar4.f1881m = null;
                }
                p2.e eVar4 = (p2.e) hVar4.f1869a;
                eVar4.f15907l = null;
                byte[] bArr = eVar4.f15904i;
                n3 n3Var = eVar4.f15898c;
                if (bArr != null && (hVar3 = (t2.h) n3Var.f10910f) != null) {
                    hVar3.h(bArr);
                }
                int[] iArr = eVar4.f15905j;
                if (iArr != null && (hVar2 = (t2.h) n3Var.f10910f) != null) {
                    hVar2.h(iArr);
                }
                Bitmap bitmap2 = eVar4.f15908m;
                if (bitmap2 != null) {
                    ((t2.d) n3Var.f10909e).c(bitmap2);
                }
                eVar4.f15908m = null;
                eVar4.f15899d = null;
                eVar4.f15914s = null;
                byte[] bArr2 = eVar4.f15900e;
                if (bArr2 != null && (hVar = (t2.h) n3Var.f10910f) != null) {
                    hVar.h(bArr2);
                }
                hVar4.f1878j = true;
                break;
        }
    }
}