package z2;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h0 implements q2.p {

    /* renamed from: d, reason: collision with root package name */
    public static final q2.m f19527d = new q2.m("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new e0(0));

    /* renamed from: e, reason: collision with root package name */
    public static final q2.m f19528e = new q2.m("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new e0(1));

    /* renamed from: f, reason: collision with root package name */
    public static final w2.k f19529f = new w2.k(5);

    /* renamed from: g, reason: collision with root package name */
    public static final List f19530g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    public final g0 f19531a;

    /* renamed from: b, reason: collision with root package name */
    public final t2.d f19532b;

    /* renamed from: c, reason: collision with root package name */
    public final w2.k f19533c;

    public h0(t2.d dVar, g0 g0Var) {
        w2.k kVar = f19529f;
        this.f19532b = dVar;
        this.f19531a = g0Var;
        this.f19533c = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, n nVar) throws NumberFormatException {
        int i13;
        Bitmap bitmapCreateBitmap = null;
        if (Build.VERSION.SDK_INT >= 27 && i11 != Integer.MIN_VALUE && i12 != Integer.MIN_VALUE && nVar != n.f19541d) {
            try {
                int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int i16 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (i16 == 90 || i16 == 270) {
                    i15 = i14;
                    i14 = i15;
                }
                float fB = nVar.b(i14, i15, i11, i12);
                bitmapCreateBitmap = i5.a.a(mediaMetadataRetriever, j10, i10, Math.round(i14 * fB), Math.round(fB * i15));
            } catch (Throwable th) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
                }
            }
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j10, i10);
        }
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            Iterator it = f19530g.iterator();
            while (it.hasNext()) {
                if (Build.ID.startsWith((String) it.next())) {
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                    i13 = Integer.parseInt(strExtractMetadata);
                    int i17 = Integer.parseInt(strExtractMetadata2);
                    if (i13 != 7) {
                        if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                        }
                    } else if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    }
                }
            }
        } else {
            int i18 = Build.VERSION.SDK_INT;
            if (i18 >= 30 && i18 < 33) {
                try {
                    String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                    String strExtractMetadata22 = mediaMetadataRetriever.extractMetadata(35);
                    i13 = Integer.parseInt(strExtractMetadata3);
                    int i172 = Integer.parseInt(strExtractMetadata22);
                    if ((i13 != 7 || i13 == 6) && i172 == 6) {
                        if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                            if (Log.isLoggable("VideoDecoder", 3)) {
                                Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                            }
                            Matrix matrix = new Matrix();
                            matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                        }
                    }
                } catch (NumberFormatException unused) {
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
                    }
                }
            }
        }
        if (bitmapCreateBitmap != null) {
            return bitmapCreateBitmap;
        }
        throw new androidx.fragment.app.y("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }

    @Override // q2.p
    public final s2.e0 a(Object obj, int i10, int i11, q2.n nVar) throws IOException {
        long jLongValue = ((Long) nVar.c(f19527d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(kc.r.e("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", jLongValue));
        }
        Integer num = (Integer) nVar.c(f19528e);
        if (num == null) {
            num = 2;
        }
        n nVar2 = (n) nVar.c(n.f19543f);
        if (nVar2 == null) {
            nVar2 = n.f19542e;
        }
        n nVar3 = nVar2;
        this.f19533c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f19531a.d(mediaMetadataRetriever, obj);
            Bitmap bitmapC = c(mediaMetadataRetriever, jLongValue, num.intValue(), i10, i11, nVar3);
            int i12 = Build.VERSION.SDK_INT;
            mediaMetadataRetriever.release();
            return d.e(bitmapC, this.f19532b);
        } catch (Throwable th) {
            int i13 = Build.VERSION.SDK_INT;
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    @Override // q2.p
    public final boolean b(Object obj, q2.n nVar) {
        return true;
    }
}