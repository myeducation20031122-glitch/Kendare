package z2;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import g.v0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l implements q2.f {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f19535a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f19536b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(k kVar, t2.h hVar) {
        try {
            int iE = kVar.e();
            if ((iE & 65496) != 65496 && iE != 19789 && iE != 18761) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iE);
                }
                return -1;
            }
            int iG = g(kVar);
            if (iG == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) hVar.d(byte[].class, iG);
            try {
                return h(kVar, bArr, iG);
            } finally {
                hVar.h(bArr);
            }
        } catch (j unused) {
            return -1;
        }
    }

    public static ImageHeaderParser$ImageType f(k kVar) {
        try {
            int iE = kVar.e();
            if (iE == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iC = (iE << 8) | kVar.c();
            if (iC == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iC2 = (iC << 8) | kVar.c();
            if (iC2 == -1991225785) {
                kVar.skip(21L);
                try {
                    return kVar.c() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (j unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iC2 == 1380533830) {
                kVar.skip(4L);
                if (((kVar.e() << 16) | kVar.e()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iE2 = (kVar.e() << 16) | kVar.e();
                if ((iE2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i10 = iE2 & 255;
                if (i10 == 88) {
                    kVar.skip(4L);
                    short sC = kVar.c();
                    return (sC & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sC & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i10 != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                kVar.skip(4L);
                return (kVar.c() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((kVar.e() << 16) | kVar.e()) == 1718909296) {
                int iE3 = (kVar.e() << 16) | kVar.e();
                if (iE3 != 1635150182 && iE3 != 1635150195) {
                    kVar.skip(4L);
                    int i11 = iC2 - 16;
                    if (i11 % 4 == 0) {
                        int i12 = 0;
                        while (i12 < 5 && i11 > 0) {
                            int iE4 = (kVar.e() << 16) | kVar.e();
                            if (iE4 != 1635150182 && iE4 != 1635150195) {
                                i12++;
                                i11 -= 4;
                            }
                        }
                    }
                }
                return ImageHeaderParser$ImageType.AVIF;
            }
            return ImageHeaderParser$ImageType.UNKNOWN;
        } catch (j unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int g(k kVar) {
        short sC;
        int iE;
        long j10;
        long jSkip;
        do {
            short sC2 = kVar.c();
            if (sC2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sC2));
                }
                return -1;
            }
            sC = kVar.c();
            if (sC == 218) {
                return -1;
            }
            if (sC == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iE = kVar.e() - 2;
            if (sC == 225) {
                return iE;
            }
            j10 = iE;
            jSkip = kVar.skip(j10);
        } while (jSkip == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sbZ = a0.h.z("Unable to skip enough data, type: ", sC, ", wanted to skip: ", iE, ", but actually skipped: ");
            sbZ.append(jSkip);
            Log.d("DfltImageHeaderParser", sbZ.toString());
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int h(k kVar, byte[] bArr, int i10) {
        ByteOrder byteOrder;
        StringBuilder sb;
        int iA = kVar.a(bArr, i10);
        if (iA != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + iA);
            }
            return -1;
        }
        byte[] bArr2 = f19535a;
        short s10 = 1;
        int i11 = 0;
        boolean z7 = i10 > bArr2.length;
        if (z7) {
            for (int i12 = 0; i12 < bArr2.length; i12++) {
                if (bArr[i12] != bArr2[i12]) {
                    break;
                }
            }
            if (z7) {
                q2.g gVar = new q2.g(bArr, i10);
                short sF = gVar.f(6);
                if (sF != 18761) {
                    if (sF != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sF));
                    }
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                }
                ByteBuffer byteBuffer = gVar.f16123b;
                byteBuffer.order(byteOrder);
                int i13 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
                short sF2 = gVar.f(i13 + 6);
                while (i11 < sF2) {
                    int i14 = (i11 * 12) + i13 + 8;
                    short sF3 = gVar.f(i14);
                    if (sF3 == 274) {
                        short sF4 = gVar.f(i14 + 2);
                        if (sF4 >= s10 && sF4 <= 12) {
                            int i15 = i14 + 4;
                            int i16 = byteBuffer.remaining() - i15 >= 4 ? byteBuffer.getInt(i15) : -1;
                            if (i16 >= 0) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sbZ = a0.h.z("Got tagIndex=", i11, " tagType=", sF3, " formatCode=");
                                    sbZ.append((int) sF4);
                                    sbZ.append(" componentCount=");
                                    sbZ.append(i16);
                                    Log.d("DfltImageHeaderParser", sbZ.toString());
                                }
                                int i17 = i16 + f19536b[sF4];
                                if (i17 <= 4) {
                                    int i18 = i14 + 8;
                                    if (i18 >= 0 && i18 <= byteBuffer.remaining()) {
                                        if (i17 >= 0 && i17 + i18 <= byteBuffer.remaining()) {
                                            return gVar.f(i18);
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            sb = new StringBuilder("Illegal number of bytes for TI tag data tagType=");
                                            sb.append((int) sF3);
                                        }
                                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        sb = new StringBuilder("Illegal tagValueOffset=");
                                        sb.append(i18);
                                        sb.append(" tagType=");
                                        sb.append((int) sF3);
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    sb = new StringBuilder("Got byte count > 4, not orientation, continuing, formatCode=");
                                    sb.append((int) sF4);
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            sb = new StringBuilder("Got invalid format code = ");
                            sb.append((int) sF4);
                        }
                        Log.d("DfltImageHeaderParser", sb.toString());
                    }
                    i11++;
                    s10 = 1;
                }
                return -1;
            }
        } else if (z7) {
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // q2.f
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            return f(new q2.g(0, byteBuffer));
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // q2.f
    public final int b(InputStream inputStream, t2.h hVar) {
        if (inputStream == null) {
            throw new NullPointerException("Argument must not be null");
        }
        v0 v0Var = new v0(inputStream, 19);
        if (hVar != null) {
            return e(v0Var, hVar);
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // q2.f
    public final int c(ByteBuffer byteBuffer, t2.h hVar) {
        if (byteBuffer == null) {
            throw new NullPointerException("Argument must not be null");
        }
        q2.g gVar = new q2.g(0, byteBuffer);
        if (hVar != null) {
            return e(gVar, hVar);
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // q2.f
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        if (inputStream != null) {
            return f(new v0(inputStream, 19));
        }
        throw new NullPointerException("Argument must not be null");
    }
}