package o5;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.measurement.n3;
import g.u0;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f15801a;

    /* renamed from: b, reason: collision with root package name */
    public static final z1.o f15802b = new z1.o(26);

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b7 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b7)));
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        if (r2 != 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(Context context, String str) {
        int iC;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        int i10 = Build.VERSION.SDK_INT;
        String strD = i10 >= 23 ? e0.l.d(str) : null;
        if (strD != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (iMyUid2 != iMyUid || !Objects.equals(packageName2, packageName)) {
                if (i10 >= 23) {
                    iC = e0.l.c((AppOpsManager) e0.l.a(context, AppOpsManager.class), strD, packageName);
                }
                return -2;
            }
            if (i10 < 29) {
                if (i10 >= 23) {
                    iC = e0.l.c((AppOpsManager) e0.l.a(context, AppOpsManager.class), strD, packageName);
                }
                return -2;
            }
            AppOpsManager appOpsManagerC = e0.m.c(context);
            iC = e0.m.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
            if (iC == 0) {
                iC = e0.m.a(appOpsManagerC, strD, iMyUid, e0.m.b(context));
            }
        }
        return 0;
    }

    public static void c(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] d(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jArr[i10] = iArr[i10];
        }
        return jArr;
    }

    public static boolean e(File file, Resources resources, int i10) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i10);
            try {
                boolean zF = f(file, inputStreamOpenRawResource);
                c(inputStreamOpenRawResource);
                return zF;
            } catch (Throwable th) {
                th = th;
                c(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean f(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    c(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e11) {
            e = e11;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            c(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            c(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static void g(Object obj, String str, String str2) {
        String strM = m(str);
        if (Log.isLoggable(strM, 3)) {
            Log.d(strM, String.format(str2, obj));
        }
    }

    public static void h(String str, String str2, Exception exc) {
        String strM = m(str);
        if (Log.isLoggable(strM, 6)) {
            Log.e(strM, str2, exc);
        }
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static y.o j(x.d dVar, int i10, ArrayList arrayList, y.o oVar) {
        x.c cVar;
        int i11;
        int i12 = i10 == 0 ? dVar.f18793n0 : dVar.f18795o0;
        if (i12 != -1 && (oVar == null || i12 != oVar.f19175b)) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                y.o oVar2 = (y.o) arrayList.get(i13);
                if (oVar2.f19175b == i12) {
                    if (oVar != null) {
                        oVar.c(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i13++;
                }
            }
        } else if (i12 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (dVar instanceof x.j) {
                x.j jVar = (x.j) dVar;
                int i14 = 0;
                while (true) {
                    if (i14 >= jVar.f18852r0) {
                        i11 = -1;
                        break;
                    }
                    x.d dVar2 = jVar.f18851q0[i14];
                    if ((i10 == 0 && (i11 = dVar2.f18793n0) != -1) || (i10 == 1 && (i11 = dVar2.f18795o0) != -1)) {
                        break;
                    }
                    i14++;
                }
                if (i11 != -1) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList.size()) {
                            break;
                        }
                        y.o oVar3 = (y.o) arrayList.get(i15);
                        if (oVar3.f19175b == i11) {
                            oVar = oVar3;
                            break;
                        }
                        i15++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new y.o();
                oVar.f19174a = new ArrayList();
                oVar.f19177d = null;
                oVar.f19178e = -1;
                int i16 = y.o.f19173f;
                y.o.f19173f = i16 + 1;
                oVar.f19175b = i16;
                oVar.f19176c = i10;
            }
            arrayList.add(oVar);
        }
        ArrayList arrayList2 = oVar.f19174a;
        if (!arrayList2.contains(dVar)) {
            arrayList2.add(dVar);
            if (dVar instanceof x.h) {
                x.h hVar = (x.h) dVar;
                hVar.f18848t0.c(hVar.f18849u0 == 0 ? 1 : 0, oVar, arrayList);
            }
            int i17 = oVar.f19175b;
            if (i10 == 0) {
                dVar.f18793n0 = i17;
                dVar.I.c(i10, oVar, arrayList);
                cVar = dVar.K;
            } else {
                dVar.f18795o0 = i17;
                dVar.J.c(i10, oVar, arrayList);
                dVar.M.c(i10, oVar, arrayList);
                cVar = dVar.L;
            }
            cVar.c(i10, oVar, arrayList);
            dVar.P.c(i10, oVar, arrayList);
        }
        return oVar;
    }

    public static int k(t2.h hVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new z2.x(inputStream, hVar);
        }
        inputStream.mark(5242880);
        return l(list, new n3(17, inputStream, hVar));
    }

    public static int l(List list, q2.i iVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iA = iVar.a((q2.f) list.get(i10));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static String m(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static File n(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(cacheDir, str + i10);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static ImageHeaderParser$ImageType o(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = ((q2.f) list.get(i10)).a(byteBuffer);
                i3.c.c(byteBuffer);
                if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeA;
                }
            } catch (Throwable th) {
                i3.c.c(byteBuffer);
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType p(t2.h hVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new z2.x(inputStream, hVar);
        }
        inputStream.mark(5242880);
        u0 u0Var = new u0(inputStream, 17);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeY = u0Var.y((q2.f) list.get(i10));
            if (imageHeaderParser$ImageTypeY != ImageHeaderParser$ImageType.UNKNOWN) {
                return imageHeaderParser$ImageTypeY;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static boolean q() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean r() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static MappedByteBuffer s(Context context, Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static void t(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static boolean u(int i10, int i11, int i12, int i13) {
        return (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2)) || (i13 == 1 || i13 == 2 || (i13 == 4 && i11 != 2));
    }
}