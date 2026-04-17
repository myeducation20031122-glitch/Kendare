package z2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.measurement.n3;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import l4.j0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p {

    /* renamed from: f, reason: collision with root package name */
    public static final q2.m f19545f = q2.m.a(q2.b.f16119b, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g, reason: collision with root package name */
    public static final q2.m f19546g = new q2.m("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, q2.m.f16128e);

    /* renamed from: h, reason: collision with root package name */
    public static final q2.m f19547h;

    /* renamed from: i, reason: collision with root package name */
    public static final q2.m f19548i;

    /* renamed from: j, reason: collision with root package name */
    public static final Set f19549j;

    /* renamed from: k, reason: collision with root package name */
    public static final z1.o f19550k;

    /* renamed from: l, reason: collision with root package name */
    public static final ArrayDeque f19551l;

    /* renamed from: a, reason: collision with root package name */
    public final t2.d f19552a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f19553b;

    /* renamed from: c, reason: collision with root package name */
    public final t2.h f19554c;

    /* renamed from: d, reason: collision with root package name */
    public final List f19555d;

    /* renamed from: e, reason: collision with root package name */
    public final v f19556e = v.a();

    static {
        m mVar = n.f19538a;
        Boolean bool = Boolean.FALSE;
        f19547h = q2.m.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f19548i = q2.m.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f19549j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f19550k = new z1.o(3);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = i3.o.f13305a;
        f19551l = new ArrayDeque(0);
    }

    public p(List list, DisplayMetrics displayMetrics, t2.d dVar, t2.h hVar) {
        this.f19555d = list;
        if (displayMetrics == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f19553b = displayMetrics;
        if (dVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f19552a = dVar;
        if (hVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f19554c = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(g.e eVar, BitmapFactory.Options options, o oVar, t2.d dVar) {
        if (!options.inJustDecodeBounds) {
            oVar.o();
            switch (eVar.f12762b) {
                case 18:
                    x xVar = (x) ((com.bumptech.glide.load.data.n) eVar.f12763e).f2317e;
                    synchronized (xVar) {
                        xVar.f19574f = xVar.f19572b.length;
                        break;
                    }
            }
        }
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = b0.f19510b;
        lock.lock();
        try {
            try {
                Bitmap bitmapM = eVar.m(options);
                lock.unlock();
                return bitmapM;
            } catch (IllegalArgumentException e10) {
                IOException iOExceptionE = e(e10, i10, i11, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOExceptionE);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOExceptionE;
                }
                try {
                    dVar.c(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapC = c(eVar, options, oVar, dVar);
                    b0.f19510b.unlock();
                    return bitmapC;
                } catch (IOException unused) {
                    throw iOExceptionE;
                }
            }
        } catch (Throwable th) {
            b0.f19510b.unlock();
            throw th;
        }
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        StringBuilder sbZ = a0.h.z("Exception decoding bitmap, outWidth: ", i10, ", outHeight: ", i11, ", outMimeType: ");
        sbZ.append(str);
        sbZ.append(", inBitmap: ");
        sbZ.append(d(options.inBitmap));
        return new IOException(sbZ.toString(), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        g(options);
        ArrayDeque arrayDeque = f19551l;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    public static void g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final d a(g.e eVar, int i10, int i11, q2.n nVar, o oVar) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f19554c.d(byte[].class, 65536);
        synchronized (p.class) {
            ArrayDeque arrayDeque = f19551l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                g(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        q2.b bVar = (q2.b) nVar.c(f19545f);
        q2.o oVar2 = (q2.o) nVar.c(f19546g);
        n nVar2 = (n) nVar.c(n.f19543f);
        boolean zBooleanValue = ((Boolean) nVar.c(f19547h)).booleanValue();
        q2.m mVar = f19548i;
        try {
            return d.e(b(eVar, options2, nVar2, bVar, oVar2, nVar.c(mVar) != null && ((Boolean) nVar.c(mVar)).booleanValue(), i10, i11, zBooleanValue, oVar), this.f19552a);
        } finally {
            f(options2);
            this.f19554c.h(bArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x042d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(g.e eVar, BitmapFactory.Options options, n nVar, q2.b bVar, q2.o oVar, boolean z7, int i10, int i11, boolean z10, o oVar2) throws Throwable {
        long j10;
        boolean z11;
        String str;
        int iL;
        int i12;
        boolean z12;
        int i13;
        int i14;
        String str2;
        String str3;
        String str4;
        int i15;
        t2.d dVar;
        int i16;
        int i17;
        String str5;
        String str6;
        int i18;
        boolean zB;
        t2.d dVar2;
        int iRound;
        int i19;
        t2.d dVar3;
        Bitmap bitmapC;
        float f10;
        float f11;
        Bitmap.Config config;
        String str7;
        String str8;
        int i20;
        int i21;
        int i22;
        int iFloor;
        int iFloor2;
        n nVar2;
        int i23;
        int i24 = i3.i.f13294b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        t2.d dVar4 = this.f19552a;
        c(eVar, options, oVar2, dVar4);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i25 = iArr[0];
        int i26 = iArr[1];
        String str9 = options.outMimeType;
        if (i25 == -1 || i26 == -1) {
            j10 = jElapsedRealtimeNanos;
            z11 = false;
        } else {
            z11 = z7;
            j10 = jElapsedRealtimeNanos;
        }
        switch (eVar.f12762b) {
            case y4.g.API_NOT_CONNECTED /* 17 */:
                str = str9;
                List list = (List) eVar.f12764f;
                ByteBuffer byteBufferC = i3.c.c((ByteBuffer) eVar.f12763e);
                iL = byteBufferC == null ? -1 : o5.y.l(list, new n3(16, byteBufferC, (t2.h) eVar.f12765j));
                break;
            case 18:
                str = str9;
                List list2 = (List) eVar.f12765j;
                x xVar = (x) ((com.bumptech.glide.load.data.n) eVar.f12763e).f2317e;
                xVar.reset();
                iL = o5.y.k((t2.h) eVar.f12764f, xVar, list2);
                break;
            default:
                str = str9;
                iL = o5.y.l((List) eVar.f12764f, new q2.h((com.bumptech.glide.load.data.n) eVar.f12765j, (t2.h) eVar.f12763e));
                break;
        }
        switch (iL) {
            case 3:
            case 4:
                i12 = 180;
                break;
            case y4.g.INVALID_ACCOUNT /* 5 */:
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                i12 = 90;
                break;
            case y4.g.NETWORK_ERROR /* 7 */:
            case 8:
                i12 = 270;
                break;
            default:
                i12 = 0;
                break;
        }
        switch (iL) {
            case 2:
            case 3:
            case 4:
            case y4.g.INVALID_ACCOUNT /* 5 */:
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
            case y4.g.NETWORK_ERROR /* 7 */:
            case 8:
                z12 = true;
                break;
            default:
                z12 = false;
                break;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (i12 != 90) {
                i13 = 270;
                if (i12 != 270) {
                    i14 = i25;
                }
            } else {
                i13 = 270;
            }
            i14 = i26;
        } else {
            i13 = 270;
            i14 = i10;
        }
        int i27 = i11 == Integer.MIN_VALUE ? (i12 == 90 || i12 == i13) ? i25 : i26 : i11;
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeX = eVar.x();
        int i28 = iL;
        boolean z13 = z11;
        boolean z14 = z12;
        if (i25 <= 0) {
            str2 = ", target density: ";
            str3 = ", density: ";
            str4 = "Downsampler";
            i15 = i25;
            dVar = dVar4;
            i16 = i26;
            i17 = i14;
            str5 = "x";
            str6 = "]";
            i18 = 3;
        } else {
            if (i26 > 0) {
                if (i12 == 90 || i12 == 270) {
                    str7 = ", density: ";
                    str8 = "]";
                    i20 = i26;
                    i21 = i25;
                } else {
                    str7 = ", density: ";
                    str8 = "]";
                    i21 = i26;
                    i20 = i25;
                }
                int i29 = i14;
                float fB = nVar.b(i20, i21, i29, i27);
                if (fB <= 0.0f) {
                    throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + nVar + ", source: [" + i25 + "x" + i26 + "], target: [" + i29 + "x" + i27 + str8);
                }
                int i30 = i12;
                int iA = nVar.a(i20, i21, i29, i27);
                if (iA == 0) {
                    throw new IllegalArgumentException("Cannot round with null rounding");
                }
                float f12 = i20;
                float f13 = i21;
                int i31 = i20 / ((int) ((fB * f12) + 0.5d));
                int i32 = i21 / ((int) ((fB * f13) + 0.5d));
                int iMax = iA == 1 ? Math.max(i31, i32) : Math.min(i31, i32);
                int i33 = Build.VERSION.SDK_INT;
                if (i33 > 23 || !f19549j.contains(options.outMimeType)) {
                    int iMax2 = Math.max(1, Integer.highestOneBit(iMax));
                    if (iA == 1 && iMax2 < 1.0f / fB) {
                        iMax2 <<= 1;
                    }
                    i22 = iMax2;
                } else {
                    i22 = 1;
                }
                options.inSampleSize = i22;
                if (imageHeaderParser$ImageTypeX != ImageHeaderParser$ImageType.JPEG) {
                    if (imageHeaderParser$ImageTypeX == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeX == ImageHeaderParser$ImageType.PNG_A) {
                        float f14 = i22;
                        iFloor = (int) Math.floor(f12 / f14);
                        iFloor2 = (int) Math.floor(f13 / f14);
                    } else if (imageHeaderParser$ImageTypeX.isWebp()) {
                        if (i33 >= 24) {
                            float f15 = i22;
                            iFloor = Math.round(f12 / f15);
                            iFloor2 = Math.round(f13 / f15);
                        }
                    } else if (i20 % i22 == 0 && i21 % i22 == 0) {
                        iFloor = i20 / i22;
                        iFloor2 = i21 / i22;
                    } else {
                        options.inJustDecodeBounds = true;
                        c(eVar, options, oVar2, dVar4);
                        options.inJustDecodeBounds = false;
                        int[] iArr2 = {options.outWidth, options.outHeight};
                        int i34 = iArr2[0];
                        iFloor2 = iArr2[1];
                        nVar2 = nVar;
                        iFloor = i34;
                        i17 = i29;
                        double dB = nVar2.b(iFloor, iFloor2, i17, i27);
                        int i35 = i22;
                        dVar = dVar4;
                        options.inTargetDensity = (int) (((dB / (r8 / r10)) * ((int) ((((int) Math.round((dB > 1.0d ? dB : 1.0d / dB) * 2.147483647E9d)) * dB) + 0.5d))) + 0.5d);
                        int iRound2 = (int) Math.round((dB > 1.0d ? dB : 1.0d / dB) * 2.147483647E9d);
                        options.inDensity = iRound2;
                        i23 = options.inTargetDensity;
                        if (i23 > 0 || iRound2 <= 0 || i23 == iRound2) {
                            options.inTargetDensity = 0;
                            options.inDensity = 0;
                        } else {
                            options.inScaled = true;
                        }
                        str4 = "Downsampler";
                        if (Log.isLoggable(str4, 2)) {
                            str3 = str7;
                            str2 = ", target density: ";
                            str5 = "x";
                            i16 = i26;
                            i15 = i25;
                        } else {
                            str5 = "x";
                            i16 = i26;
                            i15 = i25;
                            StringBuilder sbZ = a0.h.z("Calculate scaling, source: [", i15, str5, i16, "], degreesToRotate: ");
                            sbZ.append(i30);
                            sbZ.append(", target: [");
                            sbZ.append(i17);
                            sbZ.append(str5);
                            sbZ.append(i27);
                            sbZ.append("], power of two scaled: [");
                            sbZ.append(iFloor);
                            sbZ.append(str5);
                            sbZ.append(iFloor2);
                            sbZ.append("], exact scale factor: ");
                            sbZ.append(fB);
                            sbZ.append(", power of 2 sample size: ");
                            sbZ.append(i35);
                            sbZ.append(", adjusted scale factor: ");
                            sbZ.append(dB);
                            str2 = ", target density: ";
                            sbZ.append(str2);
                            sbZ.append(options.inTargetDensity);
                            str3 = str7;
                            sbZ.append(str3);
                            sbZ.append(options.inDensity);
                            Log.v(str4, sbZ.toString());
                        }
                    }
                    zB = this.f19556e.b(i17, i27, z13, z14);
                    if (zB) {
                        options.inPreferredConfig = j0.h();
                        options.inMutable = false;
                    }
                    if (!zB) {
                        if (bVar != q2.b.f16119b) {
                            try {
                            } catch (IOException e10) {
                                if (Log.isLoggable(str4, 3)) {
                                    Log.d(str4, "Cannot determine whether the image has alpha or not from header, format " + bVar, e10);
                                }
                            }
                            Bitmap.Config config2 = eVar.x().hasAlpha() ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                            options.inPreferredConfig = config2;
                            if (config2 == Bitmap.Config.RGB_565) {
                                options.inDither = true;
                            }
                        } else {
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        }
                    }
                    int i36 = Build.VERSION.SDK_INT;
                    if (i15 < 0 || i16 < 0 || !z10) {
                        int i37 = options.inTargetDensity;
                        float f16 = (i37 > 0 || (i19 = options.inDensity) <= 0 || i37 == i19) ? 1.0f : i37 / i19;
                        int i38 = options.inSampleSize;
                        float f17 = i38;
                        dVar2 = dVar;
                        int iCeil = (int) Math.ceil(i15 / f17);
                        int iCeil2 = (int) Math.ceil(i16 / f17);
                        iRound = Math.round(iCeil * f16);
                        int iRound3 = Math.round(iCeil2 * f16);
                        if (Log.isLoggable(str4, 2)) {
                            StringBuilder sbZ2 = a0.h.z("Calculated target [", iRound, str5, iRound3, "] for source [");
                            sbZ2.append(i15);
                            sbZ2.append(str5);
                            sbZ2.append(i16);
                            sbZ2.append("], sampleSize: ");
                            sbZ2.append(i38);
                            sbZ2.append(", targetDensity: ");
                            sbZ2.append(options.inTargetDensity);
                            sbZ2.append(str3);
                            sbZ2.append(options.inDensity);
                            sbZ2.append(", density multiplier: ");
                            sbZ2.append(f16);
                            Log.v(str4, sbZ2.toString());
                        }
                        i27 = iRound3;
                    } else {
                        iRound = i17;
                        dVar2 = dVar;
                    }
                    Bitmap bitmap = null;
                    if (iRound <= 0 || i27 <= 0) {
                        dVar3 = dVar2;
                    } else {
                        if (i36 >= 26) {
                            if (options.inPreferredConfig != j0.h()) {
                                config = options.outConfig;
                            }
                            dVar3 = dVar2;
                        } else {
                            config = null;
                        }
                        if (config == null) {
                            config = options.inPreferredConfig;
                        }
                        dVar3 = dVar2;
                        options.inBitmap = dVar3.g(iRound, i27, config);
                    }
                    if (oVar != null) {
                        if (i36 >= 28) {
                            options.inPreferredColorSpace = ColorSpace.get((oVar == q2.o.f16134b && options.outColorSpace != null && options.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                        } else if (i36 >= 26) {
                            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                        }
                    }
                    bitmapC = c(eVar, options, oVar2, dVar3);
                    oVar2.j(bitmapC, dVar3);
                    if (Log.isLoggable(str4, 2)) {
                        StringBuilder sb = new StringBuilder("Decoded ");
                        sb.append(d(bitmapC));
                        sb.append(" from [");
                        sb.append(i15);
                        sb.append(str5);
                        sb.append(i16);
                        sb.append("] ");
                        sb.append(str);
                        sb.append(" with inBitmap ");
                        sb.append(d(options.inBitmap));
                        sb.append(" for [");
                        sb.append(i10);
                        sb.append(str5);
                        f10 = 0.0f;
                        sb.append(i11);
                        sb.append("], sample size: ");
                        sb.append(options.inSampleSize);
                        sb.append(str3);
                        sb.append(options.inDensity);
                        sb.append(str2);
                        sb.append(options.inTargetDensity);
                        sb.append(", thread: ");
                        sb.append(Thread.currentThread().getName());
                        sb.append(", duration: ");
                        sb.append(i3.i.a(j10));
                        Log.v(str4, sb.toString());
                    } else {
                        f10 = 0.0f;
                    }
                    if (bitmapC != null) {
                        bitmapC.setDensity(this.f19553b.densityDpi);
                        switch (i28) {
                            case 2:
                            case 3:
                            case 4:
                            case y4.g.INVALID_ACCOUNT /* 5 */:
                            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            case y4.g.NETWORK_ERROR /* 7 */:
                            case 8:
                                Matrix matrix = new Matrix();
                                switch (i28) {
                                    case 2:
                                        matrix.setScale(-1.0f, 1.0f);
                                        break;
                                    case 3:
                                        matrix.setRotate(180.0f);
                                        break;
                                    case 4:
                                        f11 = 1.0f;
                                        matrix.setRotate(180.0f);
                                        matrix.postScale(-1.0f, f11);
                                        break;
                                    case y4.g.INVALID_ACCOUNT /* 5 */:
                                        f11 = 1.0f;
                                        matrix.setRotate(90.0f);
                                        matrix.postScale(-1.0f, f11);
                                        break;
                                    case y4.g.RESOLUTION_REQUIRED /* 6 */:
                                        matrix.setRotate(90.0f);
                                        break;
                                    case y4.g.NETWORK_ERROR /* 7 */:
                                        matrix.setRotate(-90.0f);
                                        f11 = 1.0f;
                                        matrix.postScale(-1.0f, f11);
                                        break;
                                    case 8:
                                        matrix.setRotate(-90.0f);
                                        break;
                                }
                                RectF rectF = new RectF(f10, f10, bitmapC.getWidth(), bitmapC.getHeight());
                                matrix.mapRect(rectF);
                                Bitmap bitmapB = dVar3.b(Math.round(rectF.width()), Math.round(rectF.height()), bitmapC.getConfig() != null ? bitmapC.getConfig() : Bitmap.Config.ARGB_8888);
                                matrix.postTranslate(-rectF.left, -rectF.top);
                                bitmapB.setHasAlpha(bitmapC.hasAlpha());
                                b0.a(bitmapC, bitmapB, matrix);
                                bitmap = bitmapB;
                                break;
                            default:
                                bitmap = bitmapC;
                                break;
                        }
                        if (!bitmapC.equals(bitmap)) {
                            dVar3.c(bitmapC);
                        }
                    }
                    return bitmap;
                }
                float fMin = Math.min(i22, 8);
                iFloor = (int) Math.ceil(f12 / fMin);
                iFloor2 = (int) Math.ceil(f13 / fMin);
                int i39 = i22 / 8;
                if (i39 > 0) {
                    iFloor /= i39;
                    iFloor2 /= i39;
                }
                nVar2 = nVar;
                i17 = i29;
                double dB2 = nVar2.b(iFloor, iFloor2, i17, i27);
                int i352 = i22;
                dVar = dVar4;
                options.inTargetDensity = (int) (((dB2 / (r8 / r10)) * ((int) ((((int) Math.round((dB2 > 1.0d ? dB2 : 1.0d / dB2) * 2.147483647E9d)) * dB2) + 0.5d))) + 0.5d);
                int iRound22 = (int) Math.round((dB2 > 1.0d ? dB2 : 1.0d / dB2) * 2.147483647E9d);
                options.inDensity = iRound22;
                i23 = options.inTargetDensity;
                if (i23 > 0) {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                    str4 = "Downsampler";
                    if (Log.isLoggable(str4, 2)) {
                    }
                }
                zB = this.f19556e.b(i17, i27, z13, z14);
                if (zB) {
                }
                if (!zB) {
                }
                int i362 = Build.VERSION.SDK_INT;
                if (i15 < 0) {
                    int i372 = options.inTargetDensity;
                    if (i372 > 0) {
                        int i382 = options.inSampleSize;
                        float f172 = i382;
                        dVar2 = dVar;
                        int iCeil3 = (int) Math.ceil(i15 / f172);
                        int iCeil22 = (int) Math.ceil(i16 / f172);
                        iRound = Math.round(iCeil3 * f16);
                        int iRound32 = Math.round(iCeil22 * f16);
                        if (Log.isLoggable(str4, 2)) {
                        }
                        i27 = iRound32;
                    }
                }
                Bitmap bitmap2 = null;
                if (iRound <= 0) {
                    dVar3 = dVar2;
                }
                if (oVar != null) {
                }
                bitmapC = c(eVar, options, oVar2, dVar3);
                oVar2.j(bitmapC, dVar3);
                if (Log.isLoggable(str4, 2)) {
                }
                if (bitmapC != null) {
                }
                return bitmap2;
            }
            str2 = ", target density: ";
            str3 = ", density: ";
            str4 = "Downsampler";
            i15 = i25;
            i18 = 3;
            dVar = dVar4;
            i16 = i26;
            i17 = i14;
            str5 = "x";
            str6 = "]";
        }
        if (Log.isLoggable(str4, i18)) {
            Log.d(str4, "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeX + " with target [" + i17 + str5 + i27 + str6);
        }
        zB = this.f19556e.b(i17, i27, z13, z14);
        if (zB) {
        }
        if (!zB) {
        }
        int i3622 = Build.VERSION.SDK_INT;
        if (i15 < 0) {
        }
        Bitmap bitmap22 = null;
        if (iRound <= 0) {
        }
        if (oVar != null) {
        }
        bitmapC = c(eVar, options, oVar2, dVar3);
        oVar2.j(bitmapC, dVar3);
        if (Log.isLoggable(str4, 2)) {
        }
        if (bitmapC != null) {
        }
        return bitmap22;
    }
}