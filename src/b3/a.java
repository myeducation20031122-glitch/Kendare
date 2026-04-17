package b3;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.measurement.n3;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import o5.y;
import q2.n;
import q2.p;
import s2.e0;
import w2.k;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements p {

    /* renamed from: f, reason: collision with root package name */
    public static final k f1842f = new k(6);

    /* renamed from: g, reason: collision with root package name */
    public static final u2.c f1843g = new u2.c(1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f1844a;

    /* renamed from: b, reason: collision with root package name */
    public final List f1845b;

    /* renamed from: c, reason: collision with root package name */
    public final u2.c f1846c;

    /* renamed from: d, reason: collision with root package name */
    public final k f1847d;

    /* renamed from: e, reason: collision with root package name */
    public final n3 f1848e;

    public a(Context context, List list, t2.d dVar, t2.h hVar) {
        k kVar = f1842f;
        this.f1844a = context.getApplicationContext();
        this.f1845b = list;
        this.f1847d = kVar;
        this.f1848e = new n3(28, dVar, hVar);
        this.f1846c = f1843g;
    }

    public static int d(p2.c cVar, int i10, int i11) {
        int iMin = Math.min(cVar.f15887g / i11, cVar.f15886f / i10);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbZ = a0.h.z("Downsampling GIF, sampleSize: ", iMax, ", target dimens: [", i10, "x");
            sbZ.append(i11);
            sbZ.append("], actual dimens: [");
            sbZ.append(cVar.f15886f);
            sbZ.append("x");
            sbZ.append(cVar.f15887g);
            sbZ.append("]");
            Log.v("BufferGifDecoder", sbZ.toString());
        }
        return iMax;
    }

    @Override // q2.p
    public final e0 a(Object obj, int i10, int i11, n nVar) {
        p2.d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        u2.c cVar = this.f1846c;
        synchronized (cVar) {
            try {
                p2.d dVar2 = (p2.d) cVar.f18230a.poll();
                if (dVar2 == null) {
                    dVar2 = new p2.d();
                }
                dVar = dVar2;
                dVar.f15893b = null;
                Arrays.fill(dVar.f15892a, (byte) 0);
                dVar.f15894c = new p2.c();
                dVar.f15895d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                dVar.f15893b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                dVar.f15893b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c(byteBuffer, i10, i11, dVar, nVar);
        } finally {
            this.f1846c.c(dVar);
        }
    }

    @Override // q2.p
    public final boolean b(Object obj, n nVar) {
        return !((Boolean) nVar.c(i.f1886b)).booleanValue() && y.o(this.f1845b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    public final a3.d c(ByteBuffer byteBuffer, int i10, int i11, p2.d dVar, n nVar) throws Throwable {
        Bitmap.Config config;
        int i12 = i3.i.f13294b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int i13 = 2;
        try {
            p2.c cVarB = dVar.b();
            if (cVarB.f15883c > 0 && cVarB.f15882b == 0) {
                if (nVar.c(i.f1885a) == q2.b.f16120e) {
                    try {
                        config = Bitmap.Config.RGB_565;
                    } catch (Throwable th) {
                        th = th;
                        if (Log.isLoggable("BufferGifDecoder", i13)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + i3.i.a(jElapsedRealtimeNanos));
                        }
                        throw th;
                    }
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int iD = d(cVarB, i10, i11);
                k kVar = this.f1847d;
                n3 n3Var = this.f1848e;
                kVar.getClass();
                p2.e eVar = new p2.e(n3Var, cVarB, byteBuffer, iD);
                eVar.c(config);
                eVar.f15906k = (eVar.f15906k + 1) % eVar.f15907l.f15883c;
                Bitmap bitmapB = eVar.b();
                if (bitmapB == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + i3.i.a(jElapsedRealtimeNanos));
                    }
                    return null;
                }
                a3.d dVar2 = new a3.d(new c(new b(new h(com.bumptech.glide.b.b(this.f1844a), eVar, i10, i11, y2.c.f19233b, bitmapB))), 1);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + i3.i.a(jElapsedRealtimeNanos));
                }
                return dVar2;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + i3.i.a(jElapsedRealtimeNanos));
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            i13 = 2;
        }
    }
}