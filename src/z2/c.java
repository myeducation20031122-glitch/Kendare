package z2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements q2.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19511a;

    /* renamed from: b, reason: collision with root package name */
    public final t2.d f19512b;

    public c() {
        this.f19511a = 0;
        this.f19512b = new g8.e();
    }

    @Override // q2.p
    public final s2.e0 a(Object obj, int i10, int i11, q2.n nVar) {
        switch (this.f19511a) {
            case 0:
                return c(o0.j.f(obj), i10, i11, nVar);
            default:
                return d.e(((p2.e) ((p2.a) obj)).b(), this.f19512b);
        }
    }

    @Override // q2.p
    public final /* bridge */ /* synthetic */ boolean b(Object obj, q2.n nVar) {
        switch (this.f19511a) {
            case 0:
                o0.j.u(obj);
                break;
            default:
                break;
        }
        return true;
    }

    public final d c(ImageDecoder.Source source, int i10, int i11, q2.n nVar) {
        Bitmap bitmapD = o0.j.d(source, new y2.b(i10, i11, nVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapD.getWidth() + "x" + bitmapD.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new d(bitmapD, this.f19512b);
    }

    public c(t2.d dVar) {
        this.f19511a = 1;
        this.f19512b = dVar;
    }
}