package z2;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements q2.q {

    /* renamed from: e, reason: collision with root package name */
    public static final q2.m f19506e = q2.m.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: f, reason: collision with root package name */
    public static final q2.m f19507f = new q2.m("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, q2.m.f16128e);

    /* renamed from: b, reason: collision with root package name */
    public final t2.h f19508b;

    public b(t2.h hVar) {
        this.f19508b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    @Override // q2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(Object obj, File file, q2.n nVar) throws Throwable {
        boolean z7;
        Bitmap bitmap = (Bitmap) ((s2.e0) obj).get();
        q2.m mVar = f19507f;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) nVar.c(mVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i10 = i3.i.f13294b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) nVar.c(f19506e)).intValue();
        OutputStream cVar = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                t2.h hVar = this.f19508b;
                if (hVar != null) {
                    try {
                        cVar = new com.bumptech.glide.load.data.c(fileOutputStream, hVar);
                    } catch (IOException e10) {
                        e = e10;
                        cVar = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (cVar != null) {
                            try {
                                cVar.close();
                            } catch (IOException unused) {
                            }
                        }
                        z7 = false;
                        if (Log.isLoggable("BitmapEncoder", 2)) {
                        }
                        return z7;
                    } catch (Throwable th) {
                        th = th;
                        cVar = fileOutputStream;
                        if (cVar != null) {
                            try {
                                cVar.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    cVar = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, cVar);
                cVar.close();
                try {
                    cVar.close();
                } catch (IOException unused3) {
                }
                z7 = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + i3.o.c(bitmap) + " in " + i3.i.a(jElapsedRealtimeNanos) + ", options format: " + nVar.c(mVar) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z7;
    }

    @Override // q2.q
    public final int n(q2.n nVar) {
        return 2;
    }
}