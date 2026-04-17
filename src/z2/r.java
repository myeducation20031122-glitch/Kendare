package z2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q f19557a = new q();

    public static d a(t2.d dVar, Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        StringBuilder sb;
        String str;
        Drawable current = drawable.getCurrent();
        boolean z7 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else if (i10 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                sb = new StringBuilder("Unable to draw ");
                sb.append(current);
                str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
                sb.append(str);
                Log.w("DrawableToBitmap", sb.toString());
            }
            bitmap = null;
            z7 = true;
        } else if (i11 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
            if (current.getIntrinsicWidth() > 0) {
                i10 = current.getIntrinsicWidth();
            }
            if (current.getIntrinsicHeight() > 0) {
                i11 = current.getIntrinsicHeight();
            }
            Lock lock = b0.f19510b;
            lock.lock();
            Bitmap bitmapB = dVar.b(i10, i11, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(bitmapB);
                current.setBounds(0, 0, i10, i11);
                current.draw(canvas);
                canvas.setBitmap(null);
                lock.unlock();
                bitmap = bitmapB;
                z7 = true;
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        } else {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                sb = new StringBuilder("Unable to draw ");
                sb.append(current);
                str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
                sb.append(str);
                Log.w("DrawableToBitmap", sb.toString());
            }
            bitmap = null;
            z7 = true;
        }
        if (!z7) {
            dVar = f19557a;
        }
        return d.e(bitmap, dVar);
    }
}