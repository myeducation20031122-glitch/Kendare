package t2;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import l4.j0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i implements d {
    public static final Bitmap.Config M = Bitmap.Config.ARGB_8888;

    /* renamed from: b, reason: collision with root package name */
    public final j f17132b;

    /* renamed from: e, reason: collision with root package name */
    public final Set f17133e;

    /* renamed from: f, reason: collision with root package name */
    public final v6.e f17134f;

    /* renamed from: j, reason: collision with root package name */
    public final long f17135j;

    /* renamed from: m, reason: collision with root package name */
    public long f17136m;

    /* renamed from: n, reason: collision with root package name */
    public int f17137n;

    /* renamed from: t, reason: collision with root package name */
    public int f17138t;

    /* renamed from: u, reason: collision with root package name */
    public int f17139u;

    /* renamed from: w, reason: collision with root package name */
    public int f17140w;

    public i(long j10) {
        n nVar = new n();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        Object obj = null;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(j0.h());
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f17135j = j10;
        this.f17132b = nVar;
        this.f17133e = setUnmodifiableSet;
        this.f17134f = new v6.e(25, obj);
    }

    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.f17137n + ", misses=" + this.f17138t + ", puts=" + this.f17139u + ", evictions=" + this.f17140w + ", currentSize=" + this.f17136m + ", maxSize=" + this.f17135j + "\nStrategy=" + this.f17132b);
    }

    @Override // t2.d
    public final Bitmap b(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapD = d(i10, i11, config);
        if (bitmapD != null) {
            bitmapD.eraseColor(0);
            return bitmapD;
        }
        if (config == null) {
            config = M;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // t2.d
    public final synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f17132b.k(bitmap) <= this.f17135j && this.f17133e.contains(bitmap.getConfig())) {
                int iK = this.f17132b.k(bitmap);
                this.f17132b.c(bitmap);
                this.f17134f.getClass();
                this.f17139u++;
                this.f17136m += iK;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f17132b.l(bitmap));
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                e(this.f17135j);
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f17132b.l(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f17133e.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == j0.h()) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.f17132b.b(i10, i11, config != null ? config : M);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f17132b.d(i10, i11, config));
                }
                this.f17138t++;
            } else {
                this.f17137n++;
                this.f17136m -= this.f17132b.k(bitmapB);
                this.f17134f.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f17132b.d(i10, i11, config));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final synchronized void e(long j10) {
        while (this.f17136m > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f17132b.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        a();
                    }
                    this.f17136m = 0L;
                    return;
                }
                this.f17134f.getClass();
                this.f17136m -= this.f17132b.k(bitmapRemoveLast);
                this.f17140w++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f17132b.l(bitmapRemoveLast));
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                bitmapRemoveLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t2.d
    public final Bitmap g(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapD = d(i10, i11, config);
        if (bitmapD != null) {
            return bitmapD;
        }
        if (config == null) {
            config = M;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // t2.d
    public final void p(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || (Build.VERSION.SDK_INT >= 23 && i10 >= 20)) {
            t();
        } else if (i10 >= 20 || i10 == 15) {
            e(this.f17135j / 2);
        }
    }

    @Override // t2.d
    public final void t() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        e(0L);
    }
}