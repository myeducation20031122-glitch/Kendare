package e5;

import a0.h;
import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.Pair;
import androidx.emoji2.text.o;
import c4.g;
import com.bumptech.glide.manager.t;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.af;
import com.google.android.gms.internal.ads.ar0;
import com.google.android.gms.internal.ads.b5;
import com.google.android.gms.internal.ads.c5;
import com.google.android.gms.internal.ads.ct;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.ads.er0;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.internal.ads.fp0;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.gu0;
import com.google.android.gms.internal.ads.h01;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.ads.k8;
import com.google.android.gms.internal.ads.m31;
import com.google.android.gms.internal.ads.o11;
import com.google.android.gms.internal.ads.qo0;
import com.google.android.gms.internal.ads.sm0;
import com.google.android.gms.internal.ads.t8;
import com.google.android.gms.internal.ads.wz0;
import com.google.android.gms.internal.ads.x01;
import com.google.android.gms.internal.ads.zo0;
import com.google.android.gms.internal.ads.zz0;
import j4.f3;
import j4.q;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kc.r;
import l4.y;
import x4.j;
import x4.k;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f12526a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f12527b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    public static String f12528c;

    /* renamed from: d, reason: collision with root package name */
    public static int f12529d;

    /* renamed from: e, reason: collision with root package name */
    public static x01 f12530e;

    public static int A(zo0 zo0Var) {
        int iF0 = com.bumptech.glide.d.f0(zo0Var) - 1;
        return (iF0 == 0 || iF0 == 1) ? 7 : 23;
    }

    public static Pair B(RandomAccessFile randomAccessFile, int i10) throws IOException {
        int i11;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i10, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - byteBufferAllocate.capacity();
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        E(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i11 = -1;
        } else {
            int i12 = iCapacity - 22;
            int iMin = Math.min(i12, 65535);
            for (int i13 = 0; i13 < iMin; i13++) {
                i11 = i12 - i13;
                if (byteBufferAllocate.getInt(i11) == 101010256 && ((char) byteBufferAllocate.getShort(i11 + 20)) == i13) {
                    break;
                }
            }
            i11 = -1;
        }
        if (i11 == -1) {
            return null;
        }
        byteBufferAllocate.position(i11);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + i11));
    }

    public static ByteBuffer C(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(r.d("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            return z(i10, byteBuffer);
        }
        throw new IOException(h.s("Length-prefixed field longer than remaining buffer. Field length: ", i10, ", remaining: ", byteBuffer.remaining()));
    }

    public static void D(h01 h01Var, er0 er0Var, ar0 ar0Var, boolean z7) {
        if (((Boolean) af.f2700c.k()).booleanValue()) {
            dq0.e3(zz0.s(h01Var), new t(5, er0Var, ar0Var, z7), es.f4118f);
        }
    }

    public static void E(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static void F(byte[] bArr, int i10) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    public static byte[] G(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        }
        if (i10 > byteBuffer.remaining()) {
            throw new IOException(h.s("Underflow while reading length-prefixed value. Length: ", i10, ", available: ", byteBuffer.remaining()));
        }
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return bArr;
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1111)
        	at java.util.ArrayList$Itr.next(ArrayList.java:1064)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(SourceFile:40)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(SourceFile:124)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(SourceFile:60)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(SourceFile:8)
        */
    public static java.security.cert.X509Certificate[] H(
    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1111)
        	at java.util.ArrayList$Itr.next(ArrayList.java:1064)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(SourceFile:40)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(SourceFile:124)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(SourceFile:60)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
        */

    public static byte[][] I(int[] iArr, a5[] a5VarArr) throws DigestException {
        long j10;
        int i10;
        int length;
        long j11 = 0;
        long jZza = 0;
        int i11 = 0;
        while (true) {
            j10 = 1048576;
            if (i11 >= 3) {
                break;
            }
            jZza += (a5VarArr[i11].zza() + 1048575) / 1048576;
            i11++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(r.e("Too many chunks: ", jZza));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i12 = 0;
        while (true) {
            length = iArr.length;
            if (i12 >= length) {
                break;
            }
            int i13 = (int) jZza;
            byte[] bArr2 = new byte[(o(iArr[i12]) * i13) + 5];
            bArr2[0] = 90;
            F(bArr2, i13);
            bArr[i12] = bArr2;
            i12++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            String strX = x(iArr[i14]);
            try {
                messageDigestArr[i14] = MessageDigest.getInstance(strX);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(strX.concat(" digest not supported"), e10);
            }
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (i10 = 3; i15 < i10; i10 = 3) {
            a5 a5Var = a5VarArr[i15];
            int i18 = i16;
            long j12 = j11;
            int i19 = i15;
            long jZza2 = a5Var.zza();
            while (jZza2 > j11) {
                int iMin = (int) Math.min(jZza2, j10);
                F(bArr3, iMin);
                for (int i20 = 0; i20 < length; i20++) {
                    messageDigestArr[i20].update(bArr3);
                }
                try {
                    a5Var.a(messageDigestArr, j12, iMin);
                    int i21 = 0;
                    while (i21 < iArr.length) {
                        int i22 = iArr[i21];
                        byte[] bArr4 = bArr[i21];
                        int iO = o(i22);
                        a5 a5Var2 = a5Var;
                        MessageDigest messageDigest = messageDigestArr[i21];
                        byte[] bArr5 = bArr3;
                        int iDigest = messageDigest.digest(bArr4, (i18 * iO) + 5, iO);
                        if (iDigest != iO) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i21++;
                        a5Var = a5Var2;
                        bArr3 = bArr5;
                    }
                    a5 a5Var3 = a5Var;
                    long j13 = iMin;
                    j12 += j13;
                    jZza2 -= j13;
                    i18++;
                    a5Var = a5Var3;
                    j11 = 0;
                    j10 = 1048576;
                } catch (IOException e11) {
                    throw new DigestException(h.s("Failed to digest chunk #", i18, " of section #", i17), e11);
                }
            }
            i16 = i18;
            i17++;
            i15 = i19 + 1;
            j11 = 0;
            j10 = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i23 = 0; i23 < iArr.length; i23++) {
            int i24 = iArr[i23];
            byte[] bArr7 = bArr[i23];
            String strX2 = x(i24);
            try {
                bArr6[i23] = MessageDigest.getInstance(strX2).digest(bArr7);
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(strX2.concat(" digest not supported"), e12);
            }
        }
        return bArr6;
    }

    public static X509Certificate[][] J(FileChannel fileChannel, b5 b5Var) throws CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferC = C((ByteBuffer) b5Var.f2889d);
                int i10 = 0;
                while (byteBufferC.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(H(C(byteBufferC), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        throw new SecurityException(ic1.m("Failed to parse/verify signer #", i10, " block"), e10);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j10 = b5Var.f2886a;
                long j11 = b5Var.f2887b;
                long j12 = b5Var.f2888c;
                ByteBuffer byteBuffer = (ByteBuffer) b5Var.f2890e;
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                y yVar = new y(fileChannel, 0L, j10);
                y yVar2 = new y(fileChannel, j11, j12 - j11);
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                E(byteBufferDuplicate);
                int iPosition = byteBufferDuplicate.position() + 16;
                if (j10 < 0 || j10 > 4294967295L) {
                    throw new IllegalArgumentException(r.e("uint32 value of out range: ", j10));
                }
                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j10);
                k8 k8Var = new k8(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    iArr[i11] = ((Integer) it.next()).intValue();
                    i11++;
                }
                try {
                    byte[][] bArrI = I(iArr, new a5[]{yVar, yVar2, k8Var});
                    for (int i12 = 0; i12 < size; i12++) {
                        int i13 = iArr[i12];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i13)), bArrI[i12])) {
                            throw new SecurityException(x(i13).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e11) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e11);
                }
            } catch (IOException e12) {
                throw new SecurityException("Failed to read list of signers", e12);
            }
        } catch (CertificateException e13) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e13);
        }
    }

    public static void a(Context context, Throwable th) {
        try {
            fc.t.k(context);
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
        }
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b7 : bArr) {
            char[] cArr2 = f12527b;
            cArr[i10] = cArr2[(b7 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b7 & 15];
            i10 += 2;
        }
        return new String(cArr);
    }

    public static String c() throws Throwable {
        BufferedReader bufferedReader;
        if (f12528c == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f12528c = Application.getProcessName();
            } else {
                int iMyPid = f12529d;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f12529d = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        String str = "/proc/" + iMyPid + "/cmdline";
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str));
                            try {
                                String line = bufferedReader.readLine();
                                fc.t.k(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                g5.a.g(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    g5.a.g(bufferedReader);
                }
                f12528c = strTrim;
            }
        }
        return f12528c;
    }

    public static boolean d(Context context, int i10) throws PackageManager.NameNotFoundException {
        if (f(i10, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                k kVarC = k.c(context);
                kVarC.getClass();
                if (packageInfo == null) {
                    return false;
                }
                if (!k.f(packageInfo, false)) {
                    if (!k.f(packageInfo, true)) {
                        return false;
                    }
                    if (!j.a((Context) kVarC.f18971b)) {
                        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        return false;
                    }
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static byte[] e(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 2;
            bArr[i10 / 2] = (byte) Integer.parseInt(str.substring(i10, i11), 16);
            i10 = i11;
        }
        return bArr;
    }

    public static boolean f(int i10, Context context, String str) {
        o oVarA = g5.b.a(context);
        oVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) oVarA.f883b.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static f7 g(Context context, String str, String str2) {
        f7 f7Var;
        try {
            f7Var = (f7) ((LinkedBlockingQueue) new sm0(context, str, str2).f8466m).poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            f7Var = null;
        }
        return f7Var == null ? sm0.d() : f7Var;
    }

    public static gu0 h(x5.k kVar) {
        gu0 gu0Var = new gu0();
        gu0Var.f4993u = kVar;
        kVar.a(wz0.f9606b, new em0(gu0Var, 24));
        return gu0Var;
    }

    public static f3 i(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qo0 qo0Var = (qo0) it.next();
            if (qo0Var.f7803c) {
                arrayList.add(g.f2105j);
            } else {
                arrayList.add(new g(qo0Var.f7801a, qo0Var.f7802b));
            }
        }
        return new f3(context, (g[]) arrayList.toArray(new g[arrayList.size()]));
    }

    public static String j(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static void k(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void l(t8 t8Var) throws GeneralSecurityException {
        Method methodC;
        if (f12530e != null) {
            return;
        }
        String str = (String) q.f13781d.f13784c.a(ge.C2);
        if (str == null || str.length() == 0) {
            str = null;
            if (t8Var != null && (methodC = t8Var.c("hunjs8A/5DNYOOAMFalGgcT5i4IxfyPvlvtXNFOaD034Wz4GSxVvrwBSs7k+Xuhr", "SWC7heB+iJvjMtyDTDnMRbHSVyBQ/kwwuxCjVwpzEBg=")) != null) {
                str = (String) methodC.invoke(null, new Object[0]);
            }
            if (str == null) {
                return;
            }
        }
        try {
            fp0 fp0VarF = dq0.F(dq0.c1(str, true));
            dq0.X();
            o11.f(m31.f6426a);
            f12530e = (x01) fp0VarF.k(x01.class);
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
    }

    public static X509Certificate[][] m(String str) {
        Pair pairB;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                pairB = null;
            } else {
                pairB = B(randomAccessFile, 0);
                if (pairB == null) {
                    pairB = B(randomAccessFile, 65535);
                }
            }
            if (pairB == null) {
                throw new c5("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairB.first;
            long jLongValue = ((Long) pairB.second).longValue();
            long j10 = (-20) + jLongValue;
            if (j10 >= 0) {
                randomAccessFile.seek(j10);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new c5("ZIP64 APK not supported");
                }
            }
            E(byteBuffer);
            long j11 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
            if (j11 >= jLongValue) {
                throw new c5("ZIP Central Directory offset out of range: " + j11 + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            E(byteBuffer);
            long j12 = j11;
            if (j12 + (byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) != jLongValue) {
                throw new c5("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j12 < 32) {
                throw new c5("APK too small for APK Signing Block. ZIP Central Directory offset: " + j12);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(j12 - byteBufferAllocate.capacity());
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new c5("No APK Signing Block before ZIP Central Directory");
            }
            long j13 = byteBufferAllocate.getLong(0);
            if (j13 < byteBufferAllocate.capacity() || j13 > 2147483639) {
                throw new c5("APK Signing Block size out of range: " + j13);
            }
            int i10 = (int) (8 + j13);
            long j14 = j12 - i10;
            if (j14 < 0) {
                throw new c5("APK Signing Block offset out of range: " + j14);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i10);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j14);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j15 = byteBufferAllocate2.getLong(0);
            if (j15 != j13) {
                throw new c5("APK Signing Block sizes in header and footer do not match: " + j15 + " vs " + j13);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j14));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                int i11 = 0;
                while (byteBufferSlice.hasRemaining()) {
                    i11++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new c5("Insufficient data to read size of APK Signing Block entry #" + i11);
                    }
                    long j16 = byteBufferSlice.getLong();
                    if (j16 < 4 || j16 > 2147483647L) {
                        throw new c5("APK Signing Block entry #" + i11 + " size out of range: " + j16);
                    }
                    int i12 = (int) j16;
                    int iPosition2 = byteBufferSlice.position() + i12;
                    if (i12 > byteBufferSlice.remaining()) {
                        throw new c5("APK Signing Block entry #" + i11 + " size out of range: " + i12 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrJ = J(randomAccessFile.getChannel(), new b5(z(i12 - 4, byteBufferSlice), jLongValue2, j12, jLongValue, byteBuffer));
                        randomAccessFile.close();
                        return x509CertificateArrJ;
                    }
                    long j17 = j12;
                    byteBufferSlice.position(iPosition2);
                    j12 = j17;
                }
                throw new c5("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th;
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int n(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static int o(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(r.d("Unknown content digest algorthm: ", i10));
    }

    public static int p(Object obj) {
        return n(obj == null ? 0 : obj.hashCode());
    }

    public static String q(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static void r(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(r.d("csd-", i10), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static void s(String str, boolean z7) throws ct {
        if (!z7) {
            throw ct.a(str, null);
        }
    }

    public static final void t(StringBuilder sb, Iterable iterable, String str) {
        Iterator it = iterable.iterator();
        try {
            if (!it.hasNext()) {
                return;
            }
            Object next = it.next();
            next.getClass();
            CharSequence string = next instanceof CharSequence ? (CharSequence) next : next.toString();
            while (true) {
                sb.append(string);
                if (!it.hasNext()) {
                    return;
                }
                sb.append((CharSequence) str);
                Object next2 = it.next();
                next2.getClass();
                string = next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString();
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public static void u(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(r.d("at index ", i11));
            }
        }
    }

    public static int v(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
        }
    }

    public static boolean w(String str, CharSequence charSequence) {
        char c10;
        int length = str.length();
        if (str == charSequence) {
            return true;
        }
        if (length != charSequence.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != charSequence.charAt(i10) && ((c10 = (char) ((r4 | ' ') - 97)) >= 26 || c10 != ((char) ((r5 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static String x(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(r.d("Unknown content digest algorthm: ", i10));
    }

    public static void y(h01 h01Var, ar0 ar0Var) {
        if (((Boolean) af.f2700c.k()).booleanValue()) {
            dq0.e3(zz0.s(h01Var), new k8(ar0Var, 25), es.f4118f);
        }
    }

    public static ByteBuffer z(int i10, ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 < iPosition || i11 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }
}