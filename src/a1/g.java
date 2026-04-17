package a1;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kc.r;
import o5.y;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g {
    public static final String[] D;
    public static final int[] E;
    public static final byte[] F;
    public static final d G;
    public static final d[][] H;
    public static final d[] I;
    public static final HashMap[] J;
    public static final HashMap[] K;
    public static final HashSet L;
    public static final HashMap M;
    public static final Charset N;
    public static final byte[] O;
    public static final byte[] P;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f212a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f213b;

    /* renamed from: c, reason: collision with root package name */
    public int f214c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap[] f215d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f216e;

    /* renamed from: f, reason: collision with root package name */
    public ByteOrder f217f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f218g;

    /* renamed from: h, reason: collision with root package name */
    public int f219h;

    /* renamed from: i, reason: collision with root package name */
    public int f220i;

    /* renamed from: j, reason: collision with root package name */
    public int f221j;

    /* renamed from: k, reason: collision with root package name */
    public int f222k;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f197l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final List f198m = Arrays.asList(1, 6, 3, 8);

    /* renamed from: n, reason: collision with root package name */
    public static final List f199n = Arrays.asList(2, 7, 4, 5);

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f200o = {8, 8, 8};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f201p = {8};

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f202q = {-1, -40, -1};

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f203r = {102, 116, 121, 112};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f204s = {109, 105, 102, 49};

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f205t = {104, 101, 105, 99};

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f206u = {79, 76, 89, 77, 80, 0};

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f207v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f208w = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f209x = {101, 88, 73, 102};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f210y = {73, 72, 68, 82};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f211z = {73, 69, 78, 68};
    public static final byte[] A = {82, 73, 70, 70};
    public static final byte[] B = {87, 69, 66, 80};
    public static final byte[] C = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        D = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, 10, "GPSLatitude"), new d("GPSLongitudeRef", 3, 2), new d(4, 5, 10, "GPSLongitude"), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Xmp", 700, 1), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        G = new d("StripOffsets", 273, 3);
        H = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        I = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        J = new HashMap[10];
        K = new HashMap[10];
        L = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        M = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        N = charsetForName;
        O = "Exif\u0000\u0000".getBytes(charsetForName);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr6 = H;
            if (i10 >= dVarArr6.length) {
                HashMap map = M;
                d[] dVarArr7 = I;
                map.put(Integer.valueOf(dVarArr7[0].f191a), 5);
                map.put(Integer.valueOf(dVarArr7[1].f191a), 1);
                map.put(Integer.valueOf(dVarArr7[2].f191a), 2);
                map.put(Integer.valueOf(dVarArr7[3].f191a), 3);
                map.put(Integer.valueOf(dVarArr7[4].f191a), 7);
                map.put(Integer.valueOf(dVarArr7[5].f191a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            J[i10] = new HashMap();
            K[i10] = new HashMap();
            for (d dVar : dVarArr6[i10]) {
                J[i10].put(Integer.valueOf(dVar.f191a), dVar);
                K[i10].put(dVar.f192b, dVar);
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x0060, UnsupportedOperationException -> 0x0063, IOException -> 0x0066, LOOP:0: B:69:0x0051->B:20:0x0054, LOOP_END, TryCatch #1 {all -> 0x0060, blocks: (B:18:0x0051, B:20:0x0054, B:27:0x0069, B:33:0x0086, B:35:0x0091, B:43:0x00a7, B:38:0x0098, B:41:0x00a0, B:42:0x00a4, B:44:0x00b1, B:46:0x00ba, B:48:0x00c0, B:50:0x00c6, B:52:0x00cc, B:57:0x00da), top: B:69:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: all -> 0x0060, UnsupportedOperationException -> 0x0063, IOException -> 0x0066, TryCatch #1 {all -> 0x0060, blocks: (B:18:0x0051, B:20:0x0054, B:27:0x0069, B:33:0x0086, B:35:0x0091, B:43:0x00a7, B:38:0x0098, B:41:0x00a0, B:42:0x00a4, B:44:0x00b1, B:46:0x00ba, B:48:0x00c0, B:50:0x00c6, B:52:0x00cc, B:57:0x00da), top: B:69:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba A[Catch: all -> 0x0060, UnsupportedOperationException -> 0x0063, IOException -> 0x0066, TryCatch #1 {all -> 0x0060, blocks: (B:18:0x0051, B:20:0x0054, B:27:0x0069, B:33:0x0086, B:35:0x0091, B:43:0x00a7, B:38:0x0098, B:41:0x00a0, B:42:0x00a4, B:44:0x00b1, B:46:0x00ba, B:48:0x00c0, B:50:0x00c6, B:52:0x00cc, B:57:0x00da), top: B:69:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00da A[Catch: all -> 0x0060, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0060, blocks: (B:18:0x0051, B:20:0x0054, B:27:0x0069, B:33:0x0086, B:35:0x0091, B:43:0x00a7, B:38:0x0098, B:41:0x00a0, B:42:0x00a4, B:44:0x00b1, B:46:0x00ba, B:48:0x00c0, B:50:0x00c6, B:52:0x00cc, B:57:0x00da), top: B:69:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(InputStream inputStream) throws IOException {
        int i10;
        BufferedInputStream bufferedInputStream;
        int iF;
        int i11;
        d[][] dVarArr = H;
        this.f215d = new HashMap[dVarArr.length];
        this.f216e = new HashSet(dVarArr.length);
        this.f217f = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        boolean z7 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z10 = f197l;
        if (z7) {
            this.f213b = (AssetManager.AssetInputStream) inputStream;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f213b = null;
                    this.f212a = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (z10) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
                for (i10 = 0; i10 < dVarArr.length; i10++) {
                    try {
                        try {
                            this.f215d[i10] = new HashMap();
                        } catch (Throwable th) {
                            a();
                            if (z10) {
                                p();
                            }
                            throw th;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        if (z10) {
                            Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                        }
                        a();
                        if (!z10) {
                            return;
                        }
                        p();
                    } catch (UnsupportedOperationException e11) {
                        e = e11;
                        if (z10) {
                        }
                        a();
                        if (!z10) {
                        }
                        p();
                    }
                }
                bufferedInputStream = new BufferedInputStream(inputStream, 5000);
                iF = f(bufferedInputStream);
                this.f214c = iF;
                if (iF != 4 || iF == 9 || iF == 13 || iF == 14) {
                    b bVar = new b(bufferedInputStream);
                    i11 = this.f214c;
                    if (i11 != 4) {
                        e(bVar, 0, 0);
                    } else if (i11 == 13) {
                        h(bVar);
                    } else if (i11 == 9) {
                        i(bVar);
                    } else if (i11 == 14) {
                        l(bVar);
                    }
                } else {
                    f fVar = new f(bufferedInputStream);
                    int i12 = this.f214c;
                    if (i12 == 12) {
                        d(fVar);
                    } else if (i12 == 7) {
                        g(fVar);
                    } else if (i12 == 10) {
                        k(fVar);
                    } else {
                        j(fVar);
                    }
                    fVar.b(this.f219h);
                    u(fVar);
                }
                a();
                if (!z10) {
                    return;
                }
                p();
            }
            this.f213b = null;
        }
        this.f212a = null;
        while (i10 < dVarArr.length) {
        }
        bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        iF = f(bufferedInputStream);
        this.f214c = iF;
        if (iF != 4) {
            b bVar2 = new b(bufferedInputStream);
            i11 = this.f214c;
            if (i11 != 4) {
            }
            a();
            if (!z10) {
            }
        }
        p();
    }

    public static ByteOrder q(b bVar) throws IOException {
        short s10 = bVar.readShort();
        boolean z7 = f197l;
        if (s10 == 18761) {
            if (z7) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (z7) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f215d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(N);
            map.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.a(0L, this.f217f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.a(0L, this.f217f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", c.a(0L, this.f217f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", c.a(0L, this.f217f));
        }
    }

    public final String b(String str) {
        String str2;
        c cVarC = c(str);
        if (cVarC != null) {
            if (!L.contains(str)) {
                return cVarC.f(this.f217f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = cVarC.f187a;
                if (i10 == 5 || i10 == 10) {
                    e[] eVarArr = (e[]) cVarC.g(this.f217f);
                    if (eVarArr != null && eVarArr.length == 3) {
                        e eVar = eVarArr[0];
                        e eVar2 = eVarArr[1];
                        e eVar3 = eVarArr[2];
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (eVar.f195a / eVar.f196b)), Integer.valueOf((int) (eVar2.f195a / eVar2.f196b)), Integer.valueOf((int) (eVar3.f195a / eVar3.f196b)));
                    }
                    str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr);
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + i10;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(cVarC.d(this.f217f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f197l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < H.length; i10++) {
            c cVar = (c) this.f215d[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void d(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i.a(mediaMetadataRetriever, new a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f215d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.c(Integer.parseInt(strExtractMetadata), this.f217f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", c.c(Integer.parseInt(strExtractMetadata2), this.f217f));
                }
                if (strExtractMetadata3 != null) {
                    int i10 = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", c.c(i10 != 90 ? i10 != 180 ? i10 != 270 ? 1 : 8 : 3 : 6, this.f217f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata4);
                    int i12 = Integer.parseInt(strExtractMetadata5);
                    if (i12 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.b(i11);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i13 = i11 + 6;
                    int i14 = i12 - 6;
                    if (!Arrays.equals(bArr, O)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i14];
                    if (fVar.read(bArr2) != i14) {
                        throw new IOException("Can't read exif");
                    }
                    this.f219h = i13;
                    r(bArr2, 0);
                }
                if (f197l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a1, code lost:
    
        r23.f184e = r22.f217f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a5, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018d A[LOOP:0: B:10:0x0034->B:82:0x018d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(b bVar, int i10, int i11) throws IOException {
        byte[] bArr;
        int i12;
        boolean z7 = f197l;
        if (z7) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + bVar);
        }
        bVar.f184e = ByteOrder.BIG_ENDIAN;
        byte b7 = bVar.readByte();
        byte b10 = -1;
        if (b7 != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(b7 & 255));
        }
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(b7 & 255));
        }
        int i13 = 2;
        int i14 = 2;
        while (true) {
            byte b11 = bVar.readByte();
            if (b11 != b10) {
                throw new IOException("Invalid marker:" + Integer.toHexString(b11 & 255));
            }
            byte b12 = bVar.readByte();
            if (z7) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(b12 & 255));
            }
            if (b12 != -39 && b12 != -38) {
                int unsignedShort = bVar.readUnsignedShort();
                int i15 = unsignedShort - 2;
                int i16 = i14 + 4;
                if (z7) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(b12 & 255) + " (length: " + unsignedShort + ")");
                }
                if (i15 < 0) {
                    throw new IOException("Invalid length");
                }
                HashMap[] mapArr = this.f215d;
                if (b12 == -31) {
                    byte[] bArr2 = new byte[i15];
                    bVar.readFully(bArr2);
                    int i17 = i16 + i15;
                    byte[] bArr3 = O;
                    if (bArr3 != null && i15 >= bArr3.length) {
                        for (int i18 = 0; i18 < bArr3.length; i18++) {
                            if (bArr2[i18] != bArr3[i18]) {
                                bArr = P;
                                if (bArr != null && i15 >= bArr.length) {
                                    i12 = 0;
                                    while (true) {
                                        if (i12 < bArr.length) {
                                            int length = i16 + bArr.length;
                                            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, bArr.length, i15);
                                            if (b("Xmp") == null) {
                                                mapArr[0].put("Xmp", new c(length, bArrCopyOfRange, 1, bArrCopyOfRange.length));
                                            }
                                        } else if (bArr2[i12] == bArr[i12]) {
                                            i12++;
                                        }
                                    }
                                }
                                i16 = i17;
                            }
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, bArr3.length, i15);
                        this.f219h = i10 + i16 + bArr3.length;
                        r(bArrCopyOfRange2, i11);
                        u(new b(bArrCopyOfRange2));
                        i16 = i17;
                    } else {
                        bArr = P;
                        if (bArr != null) {
                            i12 = 0;
                            while (true) {
                                if (i12 < bArr.length) {
                                }
                                i12++;
                            }
                        }
                        i16 = i17;
                    }
                    if (i15 < 0) {
                    }
                } else if (b12 != -2) {
                    switch (b12) {
                        default:
                            switch (b12) {
                                default:
                                    switch (b12) {
                                        default:
                                            switch (b12) {
                                            }
                                        case -55:
                                        case -54:
                                        case -53:
                                            bVar.a(1);
                                            mapArr[i11].put(i11 != 4 ? "ImageLength" : "ThumbnailImageLength", c.a(bVar.readUnsignedShort(), this.f217f));
                                            mapArr[i11].put(i11 != 4 ? "ImageWidth" : "ThumbnailImageWidth", c.a(bVar.readUnsignedShort(), this.f217f));
                                            i15 = unsignedShort - 7;
                                            break;
                                    }
                                case -59:
                                case -58:
                                case -57:
                                    break;
                            }
                        case -64:
                        case -63:
                        case -62:
                        case -61:
                            break;
                    }
                    if (i15 < 0) {
                        throw new IOException("Invalid length");
                    }
                    bVar.a(i15);
                    i14 = i16 + i15;
                    i13 = 2;
                    b10 = -1;
                } else {
                    byte[] bArr4 = new byte[i15];
                    if (bVar.read(bArr4) != i15) {
                        throw new IOException("Invalid exif");
                    }
                    if (b("UserComment") == null) {
                        HashMap map = mapArr[1];
                        Charset charset = N;
                        byte[] bytes = new String(bArr4, charset).concat("\u0000").getBytes(charset);
                        map.put("UserComment", new c(bytes, i13, bytes.length));
                    }
                }
                i15 = 0;
                if (i15 < 0) {
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(5:149|12|139|13|(6:16|(2:18|(1:20))(1:25)|26|(1:28)|29|(1:31)(2:32|(4:38|(3:41|(1:43)(2:44|(1:46))|(1:165)(3:162|49|50))(2:40|163)|51|33))))|15|(2:145|61)|(6:147|62|63|(1:69)(1:68)|70|(1:72))|143|85|141|86|87|(1:89)(1:90)|91|(1:93)|106|(2:107|(2:109|(4:155|111|(2:112|(2:114|(1:157)(1:117))(3:156|118|(2:119|(2:121|(1:159)(1:124))(2:158|125))))|123)(1:127))(2:154|128))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0125, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0128, code lost:
    
        if (r6 != null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x012a, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x012d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x012e, code lost:
    
        if (r6 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0130, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x011c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011d, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x011f, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0122, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0123, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0119 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(BufferedInputStream bufferedInputStream) throws Throwable {
        InputStream inputStream;
        b bVar;
        b bVar2;
        b bVar3;
        int i10;
        byte[] bArr;
        boolean z7;
        boolean z10;
        long j10;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i11 = 0;
        while (true) {
            byte[] bArr3 = f202q;
            if (i11 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i11] != bArr3[i11]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i12 = 0; i12 < bytes.length; i12++) {
                    byte b7 = bArr2[i12];
                    ?? r82 = bytes[i12];
                    try {
                        if (b7 != r82) {
                            try {
                                bVar = new b(bArr2);
                                try {
                                    long j11 = bVar.readInt();
                                    byte[] bArr4 = new byte[4];
                                    bVar.read(bArr4);
                                    if (Arrays.equals(bArr4, f203r)) {
                                        if (j11 == 1) {
                                            j11 = bVar.readLong();
                                            j10 = 16;
                                            if (j11 < 16) {
                                            }
                                        } else {
                                            j10 = 8;
                                        }
                                        long j12 = 5000;
                                        if (j11 > j12) {
                                            j11 = j12;
                                        }
                                        long j13 = j11 - j10;
                                        if (j13 >= 8) {
                                            byte[] bArr5 = new byte[4];
                                            boolean z11 = false;
                                            boolean z12 = false;
                                            for (long j14 = 0; j14 < j13 / 4 && bVar.read(bArr5) == 4; j14++) {
                                                if (j14 != 1) {
                                                    if (Arrays.equals(bArr5, f204s)) {
                                                        z11 = true;
                                                    } else if (Arrays.equals(bArr5, f205t)) {
                                                        z12 = true;
                                                    }
                                                    if (z11 && z12) {
                                                        bVar.close();
                                                        return 12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    if (f197l) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                    if (bVar != null) {
                                        bVar.close();
                                    }
                                    bVar3 = new b(bArr2);
                                    ByteOrder byteOrderQ = q(bVar3);
                                    this.f217f = byteOrderQ;
                                    bVar3.f184e = byteOrderQ;
                                    short s10 = bVar3.readShort();
                                    if (s10 != 20306) {
                                        bVar3.close();
                                        if (z10) {
                                        }
                                    }
                                    b bVar4 = new b(bArr2);
                                    ByteOrder byteOrderQ2 = q(bVar4);
                                    this.f217f = byteOrderQ2;
                                    bVar4.f184e = byteOrderQ2;
                                    if (bVar4.readShort() == 85) {
                                    }
                                    bVar4.close();
                                    if (z7) {
                                    }
                                    i10 = 0;
                                    while (true) {
                                        bArr = f208w;
                                        if (i10 < bArr.length) {
                                        }
                                        i10++;
                                    }
                                }
                            } catch (Exception e11) {
                                e = e11;
                                bVar = null;
                            } catch (Throwable th) {
                                th = th;
                                inputStream = null;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                            bVar.close();
                            try {
                                bVar3 = new b(bArr2);
                            } catch (Exception unused) {
                                bVar3 = null;
                            } catch (Throwable th2) {
                                th = th2;
                                bVar2 = null;
                            }
                            try {
                                ByteOrder byteOrderQ3 = q(bVar3);
                                this.f217f = byteOrderQ3;
                                bVar3.f184e = byteOrderQ3;
                                short s102 = bVar3.readShort();
                                z10 = s102 != 20306 || s102 == 21330;
                                bVar3.close();
                                if (z10) {
                                    return 7;
                                }
                            } catch (Exception unused2) {
                                if (bVar3 != null) {
                                    bVar3.close();
                                }
                                b bVar42 = new b(bArr2);
                                ByteOrder byteOrderQ22 = q(bVar42);
                                this.f217f = byteOrderQ22;
                                bVar42.f184e = byteOrderQ22;
                                if (bVar42.readShort() == 85) {
                                }
                                bVar42.close();
                                if (z7) {
                                }
                                i10 = 0;
                                while (true) {
                                    bArr = f208w;
                                    if (i10 < bArr.length) {
                                    }
                                    i10++;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bVar2 = bVar3;
                                if (bVar2 != null) {
                                    bVar2.close();
                                }
                                throw th;
                            }
                            b bVar422 = new b(bArr2);
                            ByteOrder byteOrderQ222 = q(bVar422);
                            this.f217f = byteOrderQ222;
                            bVar422.f184e = byteOrderQ222;
                            z7 = bVar422.readShort() == 85;
                            bVar422.close();
                            if (z7) {
                                return 10;
                            }
                            i10 = 0;
                            while (true) {
                                bArr = f208w;
                                if (i10 < bArr.length) {
                                    return 13;
                                }
                                if (bArr2[i10] != bArr[i10]) {
                                    int i13 = 0;
                                    while (true) {
                                        byte[] bArr6 = A;
                                        if (i13 >= bArr6.length) {
                                            int i14 = 0;
                                            while (true) {
                                                byte[] bArr7 = B;
                                                if (i14 >= bArr7.length) {
                                                    return 14;
                                                }
                                                if (bArr2[bArr6.length + i14 + 4] != bArr7[i14]) {
                                                    break;
                                                }
                                                i14++;
                                            }
                                        } else {
                                            if (bArr2[i13] != bArr6[i13]) {
                                                break;
                                            }
                                            i13++;
                                        }
                                    }
                                    return 0;
                                }
                                i10++;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = r82;
                    }
                }
                return 9;
            }
            i11++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(f fVar) throws IOException {
        c cVar;
        c cVar2;
        c cVar3;
        int i10;
        int i11;
        long j10;
        j(fVar);
        HashMap[] mapArr = this.f215d;
        c cVar4 = (c) mapArr[1].get("MakerNote");
        if (cVar4 == null) {
            return;
        }
        f fVar2 = new f(cVar4.f190d);
        fVar2.f184e = this.f217f;
        byte[] bArr = f206u;
        byte[] bArr2 = new byte[bArr.length];
        fVar2.readFully(bArr2);
        fVar2.b(0L);
        byte[] bArr3 = f207v;
        byte[] bArr4 = new byte[bArr3.length];
        fVar2.readFully(bArr4);
        if (!Arrays.equals(bArr2, bArr)) {
            j10 = Arrays.equals(bArr4, bArr3) ? 12L : 8L;
            s(fVar2, 6);
            cVar = (c) mapArr[7].get("PreviewImageStart");
            cVar2 = (c) mapArr[7].get("PreviewImageLength");
            if (cVar != null && cVar2 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar2);
            }
            cVar3 = (c) mapArr[8].get("AspectFrame");
            if (cVar3 == null) {
                int[] iArr = (int[]) cVar3.g(this.f217f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                c cVarC = c.c(i14, this.f217f);
                c cVarC2 = c.c(i15, this.f217f);
                mapArr[0].put("ImageWidth", cVarC);
                mapArr[0].put("ImageLength", cVarC2);
                return;
            }
            return;
        }
        fVar2.b(j10);
        s(fVar2, 6);
        cVar = (c) mapArr[7].get("PreviewImageStart");
        cVar2 = (c) mapArr[7].get("PreviewImageLength");
        if (cVar != null) {
            mapArr[5].put("JPEGInterchangeFormat", cVar);
            mapArr[5].put("JPEGInterchangeFormatLength", cVar2);
        }
        cVar3 = (c) mapArr[8].get("AspectFrame");
        if (cVar3 == null) {
        }
    }

    public final void h(b bVar) throws IOException {
        if (f197l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f184e = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f208w;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i10 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i11 = length + 8;
                if (i11 == 16 && !Arrays.equals(bArr2, f210y)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f211z)) {
                    return;
                }
                if (Arrays.equals(bArr2, f209x)) {
                    byte[] bArr3 = new byte[i10];
                    if (bVar.read(bArr3) != i10) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + y.a(bArr2));
                    }
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i12) {
                        this.f219h = i11;
                        r(bArr3, 0);
                        x();
                        u(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                }
                int i13 = i10 + 4;
                bVar.a(i13);
                length = i11 + i13;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) throws IOException {
        boolean z7 = f197l;
        if (z7) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.a(i10 - bVar.f185f);
        bVar.read(bArr4);
        e(new b(bArr4), i10, 5);
        bVar.a(i12 - bVar.f185f);
        bVar.f184e = ByteOrder.BIG_ENDIAN;
        int i13 = bVar.readInt();
        if (z7) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == G.f191a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                c cVarC = c.c(s10, this.f217f);
                c cVarC2 = c.c(s11, this.f217f);
                HashMap[] mapArr = this.f215d;
                mapArr[0].put("ImageLength", cVarC);
                mapArr[0].put("ImageWidth", cVarC2);
                if (z7) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void j(f fVar) throws IOException {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f214c == 8) {
            HashMap[] mapArr = this.f215d;
            c cVar = (c) mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f190d);
                fVar2.f184e = this.f217f;
                fVar2.a(6);
                s(fVar2, 9);
                c cVar2 = (c) mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) throws IOException {
        if (f197l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] mapArr = this.f215d;
        c cVar = (c) mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f190d), (int) cVar.f189c, 5);
        }
        c cVar2 = (c) mapArr[0].get("ISO");
        c cVar3 = (c) mapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) throws IOException {
        if (f197l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f184e = ByteOrder.LITTLE_ENDIAN;
        bVar.a(A.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = B;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(C, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    if (bVar.read(bArr3) == i11) {
                        this.f219h = i12;
                        r(bArr3, 0);
                        u(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + y.a(bArr2));
                    }
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap map) throws IOException {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iE = cVar.e(this.f217f);
        int iE2 = cVar2.e(this.f217f);
        if (this.f214c == 7) {
            iE += this.f220i;
        }
        if (iE > 0 && iE2 > 0 && this.f213b == null && this.f212a == null) {
            bVar.skip(iE);
            bVar.read(new byte[iE2]);
        }
        if (f197l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean n(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f217f) <= 512 && cVar2.e(this.f217f) <= 512;
    }

    public final void o(b bVar) throws IOException {
        ByteOrder byteOrderQ = q(bVar);
        this.f217f = byteOrderQ;
        bVar.f184e = byteOrderQ;
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f214c;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException(r.d("Invalid first Ifd offset: ", i11));
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.a(i12);
        }
    }

    public final void p() {
        int i10 = 0;
        while (true) {
            HashMap[] mapArr = this.f215d;
            if (i10 >= mapArr.length) {
                return;
            }
            StringBuilder sbY = a0.h.y("The size of tag group[", i10, "]: ");
            sbY.append(mapArr[i10].size());
            Log.d("ExifInterface", sbY.toString());
            for (Map.Entry entry : mapArr[i10].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f217f) + "'");
            }
            i10++;
        }
    }

    public final void r(byte[] bArr, int i10) throws IOException {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(f fVar, int i10) throws IOException {
        HashMap[] mapArr;
        StringBuilder sb;
        short s10;
        HashSet hashSet;
        StringBuilder sb2;
        int i11;
        long j10;
        boolean z7;
        int i12;
        long j11;
        d dVar;
        int i13;
        int unsignedShort;
        long j12;
        HashSet hashSet2;
        String str;
        int i14 = i10;
        Integer numValueOf = Integer.valueOf(fVar.f185f);
        HashSet hashSet3 = this.f216e;
        hashSet3.add(numValueOf);
        short s11 = fVar.readShort();
        boolean z10 = f197l;
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s11));
        }
        if (s11 <= 0) {
            return;
        }
        short s12 = 0;
        while (true) {
            mapArr = this.f215d;
            if (s12 >= s11) {
                break;
            }
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i15 = fVar.readInt();
            short s13 = s12;
            long j13 = fVar.f185f + 4;
            d dVar2 = (d) J[i14].get(Integer.valueOf(unsignedShort2));
            if (z10) {
                Object[] objArr = new Object[5];
                objArr[0] = Integer.valueOf(i10);
                objArr[1] = Integer.valueOf(unsignedShort2);
                objArr[2] = dVar2 != null ? dVar2.f192b : null;
                objArr[3] = Integer.valueOf(unsignedShort3);
                objArr[4] = Integer.valueOf(i15);
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr));
            }
            if (dVar2 == null) {
                if (z10) {
                    Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
                }
                s10 = s11;
                hashSet = hashSet3;
            } else {
                if (unsignedShort3 > 0) {
                    if (unsignedShort3 >= E.length) {
                        s10 = s11;
                        hashSet = hashSet3;
                        if (z10) {
                            sb2 = new StringBuilder("Skip the tag entry since data format is invalid: ");
                            sb2.append(unsignedShort3);
                            Log.d("ExifInterface", sb2.toString());
                        }
                    } else {
                        int i16 = dVar2.f193c;
                        s10 = s11;
                        if (i16 == 7 || unsignedShort3 == 7 || i16 == unsignedShort3 || (i12 = dVar2.f194d) == unsignedShort3) {
                            hashSet = hashSet3;
                        } else {
                            hashSet = hashSet3;
                            if (((i16 != 4 && i12 != 4) || unsignedShort3 != 3) && (((i16 != 9 && i12 != 9) || unsignedShort3 != 8) && ((i16 != 12 && i12 != 12) || unsignedShort3 != 11))) {
                                if (z10) {
                                    sb2 = new StringBuilder("Skip the tag entry since data format (");
                                    sb2.append(D[unsignedShort3]);
                                    sb2.append(") is unexpected for tag: ");
                                    sb2.append(dVar2.f192b);
                                    Log.d("ExifInterface", sb2.toString());
                                }
                            }
                        }
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = i16;
                        }
                        i11 = unsignedShort3;
                        j10 = i15 * r10[unsignedShort3];
                        if (j10 < 0 || j10 > 2147483647L) {
                            if (z10) {
                                Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i15);
                            }
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                    }
                }
                if (z7) {
                    fVar.b(j13);
                } else {
                    if (j10 > 4) {
                        int i17 = fVar.readInt();
                        j11 = j13;
                        if (z10) {
                            Log.d("ExifInterface", "seek to data offset: " + i17);
                        }
                        if (this.f214c != 7) {
                            dVar = dVar2;
                            i13 = i15;
                            fVar.b(i17);
                        } else {
                            if ("MakerNote".equals(dVar2.f192b)) {
                                this.f220i = i17;
                            } else {
                                if (i14 == 6 && "ThumbnailImage".equals(dVar2.f192b)) {
                                    this.f221j = i17;
                                    this.f222k = i15;
                                    c cVarC = c.c(6, this.f217f);
                                    dVar = dVar2;
                                    c cVarA = c.a(this.f221j, this.f217f);
                                    i13 = i15;
                                    c cVarA2 = c.a(this.f222k, this.f217f);
                                    mapArr[4].put("Compression", cVarC);
                                    mapArr[4].put("JPEGInterchangeFormat", cVarA);
                                    mapArr[4].put("JPEGInterchangeFormatLength", cVarA2);
                                }
                                fVar.b(i17);
                            }
                            dVar = dVar2;
                            i13 = i15;
                            fVar.b(i17);
                        }
                    } else {
                        j11 = j13;
                        dVar = dVar2;
                        i13 = i15;
                    }
                    Integer num = (Integer) M.get(Integer.valueOf(unsignedShort2));
                    if (z10) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                    }
                    if (num != null) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                j12 = fVar.readInt() & 4294967295L;
                            } else if (i11 == 8) {
                                unsignedShort = fVar.readShort();
                            } else if (i11 == 9 || i11 == 13) {
                                unsignedShort = fVar.readInt();
                            } else {
                                j12 = -1;
                            }
                            if (z10) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j12), dVar.f192b));
                            }
                            if (j12 <= 0) {
                                hashSet2 = hashSet;
                                if (!hashSet2.contains(Integer.valueOf((int) j12))) {
                                    fVar.b(j12);
                                    s(fVar, num.intValue());
                                } else if (z10) {
                                    str = "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j12 + ")";
                                    Log.d("ExifInterface", str);
                                }
                                fVar.b(j11);
                                hashSet = hashSet2;
                            } else {
                                hashSet2 = hashSet;
                                if (z10) {
                                    str = "Skip jump into the IFD since its offset is invalid: " + j12;
                                    Log.d("ExifInterface", str);
                                }
                                fVar.b(j11);
                                hashSet = hashSet2;
                            }
                        } else {
                            unsignedShort = fVar.readUnsignedShort();
                        }
                        j12 = unsignedShort;
                        if (z10) {
                        }
                        if (j12 <= 0) {
                        }
                    } else {
                        d dVar3 = dVar;
                        long j14 = j11;
                        int i18 = fVar.f185f + this.f219h;
                        byte[] bArr = new byte[(int) j10];
                        fVar.readFully(bArr);
                        hashSet = hashSet;
                        c cVar = new c(i18, bArr, i11, i13);
                        mapArr[i10].put(dVar3.f192b, cVar);
                        String str2 = dVar3.f192b;
                        if ("DNGVersion".equals(str2)) {
                            this.f214c = 3;
                        }
                        if ((("Make".equals(str2) || "Model".equals(str2)) && cVar.f(this.f217f).contains("PENTAX")) || ("Compression".equals(str2) && cVar.e(this.f217f) == 65535)) {
                            this.f214c = 8;
                        }
                        if (fVar.f185f != j14) {
                            fVar.b(j14);
                        }
                    }
                }
                s12 = (short) (s13 + 1);
                i14 = i10;
                s11 = s10;
                hashSet3 = hashSet;
            }
            i11 = unsignedShort3;
            j10 = 0;
            z7 = false;
            if (z7) {
            }
            s12 = (short) (s13 + 1);
            i14 = i10;
            s11 = s10;
            hashSet3 = hashSet;
        }
        HashSet hashSet4 = hashSet3;
        int i19 = fVar.readInt();
        if (z10) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i19)));
        }
        long j15 = i19;
        if (j15 > 0) {
            if (!hashSet4.contains(Integer.valueOf(i19))) {
                fVar.b(j15);
                if (mapArr[4].isEmpty()) {
                    s(fVar, 4);
                    return;
                } else {
                    if (mapArr[5].isEmpty()) {
                        s(fVar, 5);
                        return;
                    }
                    return;
                }
            }
            if (!z10) {
                return;
            } else {
                sb = new StringBuilder("Stop reading file since re-reading an IFD may cause an infinite loop: ");
            }
        } else if (!z10) {
            return;
        } else {
            sb = new StringBuilder("Stop reading file since a wrong offset may cause an infinite loop: ");
        }
        sb.append(i19);
        Log.d("ExifInterface", sb.toString());
    }

    public final void t(String str, int i10, String str2) {
        HashMap[] mapArr = this.f215d;
        if (mapArr[i10].isEmpty() || mapArr[i10].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i10];
        map.put(str2, map.get(str));
        mapArr[i10].remove(str);
    }

    public final void u(b bVar) throws IOException {
        String str;
        String string;
        StringBuilder sb;
        c cVar;
        int iE;
        HashMap map = this.f215d[4];
        c cVar2 = (c) map.get("Compression");
        if (cVar2 == null) {
            m(bVar, map);
            return;
        }
        int iE2 = cVar2.e(this.f217f);
        int i10 = 1;
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(bVar, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        c cVar3 = (c) map.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f217f);
            int[] iArr2 = f200o;
            if (Arrays.equals(iArr2, iArr) || (this.f214c == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((iE = cVar.e(this.f217f)) == 1 && Arrays.equals(iArr, f201p)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) map.get("StripOffsets");
                c cVar5 = (c) map.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] jArrD = y.d(cVar4.g(this.f217f));
                long[] jArrD2 = y.d(cVar5.g(this.f217f));
                if (jArrD == null || jArrD.length == 0) {
                    str = "stripOffsets should not be null or have zero length.";
                } else if (jArrD2 == null || jArrD2.length == 0) {
                    str = "stripByteCounts should not be null or have zero length.";
                } else {
                    if (jArrD.length == jArrD2.length) {
                        long j10 = 0;
                        for (long j11 : jArrD2) {
                            j10 += j11;
                        }
                        byte[] bArr = new byte[(int) j10];
                        this.f218g = true;
                        int i11 = 0;
                        int i12 = 0;
                        int i13 = 0;
                        while (i11 < jArrD.length) {
                            int i14 = (int) jArrD[i11];
                            int i15 = (int) jArrD2[i11];
                            if (i11 < jArrD.length - i10 && i14 + i15 != jArrD[i11 + 1]) {
                                this.f218g = false;
                            }
                            int i16 = i14 - i12;
                            if (i16 < 0) {
                                string = "Invalid strip offset value";
                            } else {
                                long j12 = i16;
                                if (bVar.skip(j12) != j12) {
                                    sb = new StringBuilder("Failed to skip ");
                                    sb.append(i16);
                                } else {
                                    int i17 = i12 + i16;
                                    byte[] bArr2 = new byte[i15];
                                    if (bVar.read(bArr2) != i15) {
                                        sb = new StringBuilder("Failed to read ");
                                        sb.append(i15);
                                    } else {
                                        i12 = i17 + i15;
                                        System.arraycopy(bArr2, 0, bArr, i13, i15);
                                        i13 += i15;
                                        i11++;
                                        i10 = 1;
                                    }
                                }
                                sb.append(" bytes.");
                                string = sb.toString();
                            }
                            Log.d("ExifInterface", string);
                            return;
                        }
                        if (this.f218g) {
                            long j13 = jArrD[0];
                            return;
                        }
                        return;
                    }
                    str = "stripOffsets and stripByteCounts should have same length.";
                }
                Log.w("ExifInterface", str);
                return;
            }
        }
        if (f197l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i10, int i11) {
        String str;
        HashMap[] mapArr = this.f215d;
        boolean zIsEmpty = mapArr[i10].isEmpty();
        boolean z7 = f197l;
        if (zIsEmpty || mapArr[i11].isEmpty()) {
            if (z7) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) mapArr[i10].get("ImageLength");
        c cVar2 = (c) mapArr[i10].get("ImageWidth");
        c cVar3 = (c) mapArr[i11].get("ImageLength");
        c cVar4 = (c) mapArr[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (!z7) {
                return;
            } else {
                str = "First image does not contain valid size information";
            }
        } else {
            if (cVar3 != null && cVar4 != null) {
                int iE = cVar.e(this.f217f);
                int iE2 = cVar2.e(this.f217f);
                int iE3 = cVar3.e(this.f217f);
                int iE4 = cVar4.e(this.f217f);
                if (iE >= iE3 || iE2 >= iE4) {
                    return;
                }
                HashMap map = mapArr[i10];
                mapArr[i10] = mapArr[i11];
                mapArr[i11] = map;
                return;
            }
            if (!z7) {
                return;
            } else {
                str = "Second image does not contain valid size information";
            }
        }
        Log.d("ExifInterface", str);
    }

    public final void w(f fVar, int i10) throws IOException {
        StringBuilder sb;
        String string;
        c cVarC;
        c cVarC2;
        HashMap[] mapArr = this.f215d;
        c cVar = (c) mapArr[i10].get("DefaultCropSize");
        c cVar2 = (c) mapArr[i10].get("SensorTopBorder");
        c cVar3 = (c) mapArr[i10].get("SensorLeftBorder");
        c cVar4 = (c) mapArr[i10].get("SensorBottomBorder");
        c cVar5 = (c) mapArr[i10].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f187a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f217f);
                if (eVarArr == null || eVarArr.length != 2) {
                    sb = new StringBuilder("Invalid crop size values. cropSize=");
                    string = Arrays.toString(eVarArr);
                    sb.append(string);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                cVarC = c.b(eVarArr[0], this.f217f);
                cVarC2 = c.b(eVarArr[1], this.f217f);
                mapArr[i10].put("ImageWidth", cVarC);
                mapArr[i10].put("ImageLength", cVarC2);
                return;
            }
            int[] iArr = (int[]) cVar.g(this.f217f);
            if (iArr == null || iArr.length != 2) {
                sb = new StringBuilder("Invalid crop size values. cropSize=");
                string = Arrays.toString(iArr);
                sb.append(string);
                Log.w("ExifInterface", sb.toString());
                return;
            }
            cVarC = c.c(iArr[0], this.f217f);
            cVarC2 = c.c(iArr[1], this.f217f);
            mapArr[i10].put("ImageWidth", cVarC);
            mapArr[i10].put("ImageLength", cVarC2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int iE = cVar2.e(this.f217f);
            int iE2 = cVar4.e(this.f217f);
            int iE3 = cVar5.e(this.f217f);
            int iE4 = cVar3.e(this.f217f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            c cVarC3 = c.c(iE2 - iE, this.f217f);
            c cVarC4 = c.c(iE3 - iE4, this.f217f);
            mapArr[i10].put("ImageLength", cVarC3);
            mapArr[i10].put("ImageWidth", cVarC4);
            return;
        }
        c cVar6 = (c) mapArr[i10].get("ImageLength");
        c cVar7 = (c) mapArr[i10].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) mapArr[i10].get("JPEGInterchangeFormat");
            c cVar9 = (c) mapArr[i10].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int iE5 = cVar8.e(this.f217f);
            int iE6 = cVar8.e(this.f217f);
            fVar.b(iE5);
            byte[] bArr = new byte[iE6];
            fVar.read(bArr);
            e(new b(bArr), iE5, i10);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.f215d;
        c cVar = (c) mapArr[1].get("PixelXDimension");
        c cVar2 = (c) mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t("ThumbnailOrientation", 0, "Orientation");
        t("ThumbnailImageLength", 0, "ImageLength");
        t("ThumbnailImageWidth", 0, "ImageWidth");
        t("ThumbnailOrientation", 5, "Orientation");
        t("ThumbnailImageLength", 5, "ImageLength");
        t("ThumbnailImageWidth", 5, "ImageWidth");
        t("Orientation", 4, "ThumbnailOrientation");
        t("ImageLength", 4, "ThumbnailImageLength");
        t("ImageWidth", 4, "ThumbnailImageWidth");
    }
}