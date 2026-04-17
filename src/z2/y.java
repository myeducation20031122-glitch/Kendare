package z2;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import l4.j0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f19578c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(q2.j.f16126a);

    /* renamed from: b, reason: collision with root package name */
    public final int f19579b;

    public y(int i10) {
        g5.a.c("roundingRadius must be greater than 0.", i10 > 0);
        this.f19579b = i10;
    }

    @Override // q2.j
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f19578c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f19579b).array());
    }

    @Override // z2.e
    public final Bitmap c(t2.d dVar, Bitmap bitmap, int i10, int i11) {
        Bitmap bitmapB;
        Paint paint = b0.f19509a;
        int i12 = this.f19579b;
        int i13 = 0;
        g5.a.c("roundingRadius must be greater than 0.", i12 > 0);
        z zVar = new z(i12, i13);
        int i14 = Build.VERSION.SDK_INT;
        Bitmap.Config configC = (i14 < 26 || !j0.C().equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : j0.C();
        Bitmap.Config configC2 = (i14 < 26 || !j0.C().equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : j0.C();
        if (configC2.equals(bitmap.getConfig())) {
            bitmapB = bitmap;
        } else {
            bitmapB = dVar.b(bitmap.getWidth(), bitmap.getHeight(), configC2);
            new Canvas(bitmapB).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap bitmapB2 = dVar.b(bitmapB.getWidth(), bitmapB.getHeight(), configC);
        bitmapB2.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapB, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapB2.getWidth(), bitmapB2.getHeight());
        Lock lock = b0.f19510b;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapB2);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f10 = zVar.f19581e;
            canvas.drawRoundRect(rectF, f10, f10, paint2);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapB.equals(bitmap)) {
                dVar.c(bitmapB);
            }
            return bitmapB2;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // q2.j
    public final boolean equals(Object obj) {
        return (obj instanceof y) && this.f19579b == ((y) obj).f19579b;
    }

    @Override // q2.j
    public final int hashCode() {
        return i3.o.g(-569625254, i3.o.g(this.f19579b, 17));
    }
}