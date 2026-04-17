package r7;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f16565a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static long f16566b = -1;

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", str, e10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r3 = r4[1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(File file) throws Throwable {
        BufferedReader bufferedReader;
        String str = null;
        str = null;
        str = null;
        BufferedReader bufferedReader2 = null;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file), 1024);
                while (true) {
                    try {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] strArrSplit = Pattern.compile("\\s*:\\s*").split(line, 2);
                            if (strArrSplit.length > 1 && strArrSplit[0].equals("MemTotal")) {
                                break;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            Log.e("FirebaseCrashlytics", "Error parsing " + file, e);
                            a(bufferedReader, "Failed to close system file reader.");
                            return str;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        a(bufferedReader2, "Failed to close system file reader.");
                        throw th;
                    }
                }
                a(bufferedReader, "Failed to close system file reader.");
            } catch (Exception e11) {
                e = e11;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                a(bufferedReader2, "Failed to close system file reader.");
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int c() {
        boolean zG = g();
        ?? r02 = zG;
        if (h()) {
            r02 = (zG ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r02 | 4 : r02;
    }

    public static int d(Context context, String str, String str2) {
        String resourcePackageName;
        Resources resources = context.getResources();
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 > 0) {
            try {
                resourcePackageName = context.getResources().getResourcePackageName(i10);
                if ("android".equals(resourcePackageName)) {
                    resourcePackageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
            }
        } else {
            resourcePackageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, resourcePackageName);
    }

    public static synchronized long e() {
        long j10;
        int i10;
        try {
            if (f16566b == -1) {
                String strB = b(new File("/proc/meminfo"));
                long j11 = 0;
                if (!TextUtils.isEmpty(strB)) {
                    String upperCase = strB.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j10 = Long.parseLong(upperCase.split("KB")[0].trim());
                            i10 = 1024;
                        } else if (upperCase.endsWith("MB")) {
                            j10 = Long.parseLong(upperCase.split("MB")[0].trim());
                            i10 = 1048576;
                        } else if (upperCase.endsWith("GB")) {
                            j10 = Long.parseLong(upperCase.split("GB")[0].trim());
                            i10 = 1073741824;
                        } else {
                            Log.w("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: ".concat(upperCase), null);
                        }
                        j11 = j10 * i10;
                    } catch (NumberFormatException e10) {
                        Log.e("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: " + upperCase, e10);
                    }
                }
                f16566b = j11;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f16566b;
    }

    public static String f(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b7 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f16565a;
            cArr[i11] = cArr2[(b7 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b7 & 15];
        }
        return new String(cArr);
    }

    public static boolean g() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    public static boolean h() {
        boolean zG = g();
        String str = Build.TAGS;
        if ((zG || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zG && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static String i(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return f(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e10);
            return "";
        }
    }

    public static String j(FileInputStream fileInputStream) {
        Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }
}