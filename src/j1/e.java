package j1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.ads.ic1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final v6.e f13549a = new v6.e(15, (Object) null);

    /* renamed from: b, reason: collision with root package name */
    public static final g8.e f13550b = new g8.e();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f13551c = {112, 114, 111, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f13552d = {112, 114, 109, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f13553e = {48, 49, 53, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f13554f = {48, 49, 48, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f13555g = {48, 48, 57, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f13556h = {48, 48, 53, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f13557i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f13558j = {48, 48, 49, 0};

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f13559k = {48, 48, 50, 0};

    public static byte[] a(c[] cVarArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int length = 0;
        for (c cVar : cVarArr) {
            length += ((((cVar.f13546g * 2) + 7) & (-8)) / 8) + (cVar.f13544e * 2) + b(cVar.f13540a, cVar.f13541b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f13545f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f13555g)) {
            int length2 = cVarArr.length;
            while (i10 < length2) {
                c cVar2 = cVarArr[i10];
                m(byteArrayOutputStream, cVar2, b(cVar2.f13540a, cVar2.f13541b, bArr));
                o(byteArrayOutputStream, cVar2);
                l(byteArrayOutputStream, cVar2);
                n(byteArrayOutputStream, cVar2);
                i10++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                m(byteArrayOutputStream, cVar3, b(cVar3.f13540a, cVar3.f13541b, bArr));
            }
            int length3 = cVarArr.length;
            while (i10 < length3) {
                c cVar4 = cVarArr[i10];
                o(byteArrayOutputStream, cVar4);
                l(byteArrayOutputStream, cVar4);
                n(byteArrayOutputStream, cVar4);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String b(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f13557i;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f13556h;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return r.g(ic1.n(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static int c(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 4) {
            return i11 + i12;
        }
        throw new IllegalStateException(r.d("Unexpected flag: ", i10));
    }

    public static void d(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static int[] e(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int iS = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iS += (int) com.bumptech.glide.f.s(byteArrayInputStream, 2);
            iArr[i11] = iS;
        }
        return iArr;
    }

    public static c[] f(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) throws IOException {
        byte[] bArr3 = f13558j;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f13559k)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iS = (int) com.bumptech.glide.f.s(fileInputStream, 2);
            byte[] bArrR = com.bumptech.glide.f.r(fileInputStream, (int) com.bumptech.glide.f.s(fileInputStream, 4), (int) com.bumptech.glide.f.s(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrR);
            try {
                c[] cVarArrH = h(byteArrayInputStream, bArr2, iS, cVarArr);
                byteArrayInputStream.close();
                return cVarArrH;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f13553e, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iS2 = (int) com.bumptech.glide.f.s(fileInputStream, 1);
        byte[] bArrR2 = com.bumptech.glide.f.r(fileInputStream, (int) com.bumptech.glide.f.s(fileInputStream, 4), (int) com.bumptech.glide.f.s(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrR2);
        try {
            c[] cVarArrG = g(byteArrayInputStream2, iS2, cVarArr);
            byteArrayInputStream2.close();
            return cVarArrG;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static c[] g(ByteArrayInputStream byteArrayInputStream, int i10, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i10 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iS = (int) com.bumptech.glide.f.s(byteArrayInputStream, 2);
            iArr[i11] = (int) com.bumptech.glide.f.s(byteArrayInputStream, 2);
            strArr[i11] = new String(com.bumptech.glide.f.q(byteArrayInputStream, iS), StandardCharsets.UTF_8);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            c cVar = cVarArr[i12];
            if (!cVar.f13541b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            cVar.f13544e = i13;
            cVar.f13547h = e(byteArrayInputStream, i13);
        }
        return cVarArr;
    }

    public static c[] h(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, c[] cVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i10 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            com.bumptech.glide.f.s(byteArrayInputStream, 2);
            String str = new String(com.bumptech.glide.f.q(byteArrayInputStream, (int) com.bumptech.glide.f.s(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jS = com.bumptech.glide.f.s(byteArrayInputStream, 4);
            int iS = (int) com.bumptech.glide.f.s(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i12 = 0;
                while (true) {
                    if (i12 >= cVarArr.length) {
                        break;
                    }
                    if (cVarArr[i12].f13541b.equals(strSubstring)) {
                        cVar = cVarArr[i12];
                        break;
                    }
                    i12++;
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f13543d = jS;
            int[] iArrE = e(byteArrayInputStream, iS);
            if (Arrays.equals(bArr, f13557i)) {
                cVar.f13544e = iS;
                cVar.f13547h = iArrE;
            }
        }
        return cVarArr;
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f13554f)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iS = (int) com.bumptech.glide.f.s(fileInputStream, 1);
        byte[] bArrR = com.bumptech.glide.f.r(fileInputStream, (int) com.bumptech.glide.f.s(fileInputStream, 4), (int) com.bumptech.glide.f.s(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrR);
        try {
            c[] cVarArrJ = j(byteArrayInputStream, str, iS);
            byteArrayInputStream.close();
            return cVarArrJ;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, String str, int i10) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iS = (int) com.bumptech.glide.f.s(byteArrayInputStream, 2);
            int iS2 = (int) com.bumptech.glide.f.s(byteArrayInputStream, 2);
            cVarArr[i11] = new c(str, new String(com.bumptech.glide.f.q(byteArrayInputStream, iS), StandardCharsets.UTF_8), com.bumptech.glide.f.s(byteArrayInputStream, 4), iS2, (int) com.bumptech.glide.f.s(byteArrayInputStream, 4), (int) com.bumptech.glide.f.s(byteArrayInputStream, 4), new int[iS2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            c cVar = cVarArr[i12];
            int iAvailable = byteArrayInputStream.available() - cVar.f13545f;
            int iS3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = cVar.f13548i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iS3 += (int) com.bumptech.glide.f.s(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iS3), 1);
                for (int iS4 = (int) com.bumptech.glide.f.s(byteArrayInputStream, 2); iS4 > 0; iS4--) {
                    com.bumptech.glide.f.s(byteArrayInputStream, 2);
                    int iS5 = (int) com.bumptech.glide.f.s(byteArrayInputStream, 1);
                    if (iS5 != 6 && iS5 != 7) {
                        while (iS5 > 0) {
                            com.bumptech.glide.f.s(byteArrayInputStream, 1);
                            for (int iS6 = (int) com.bumptech.glide.f.s(byteArrayInputStream, 1); iS6 > 0; iS6--) {
                                com.bumptech.glide.f.s(byteArrayInputStream, 2);
                            }
                            iS5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f13547h = e(byteArrayInputStream, cVar.f13544e);
            int i13 = cVar.f13546g;
            BitSet bitSetValueOf = BitSet.valueOf(com.bumptech.glide.f.q(byteArrayInputStream, (((i13 * 2) + 7) & (-8)) / 8));
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = bitSetValueOf.get(c(2, i14, i13)) ? 2 : 0;
                if (bitSetValueOf.get(c(4, i14, i13))) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
        }
        return cVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean k(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f13553e;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f13554f;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(cVarArr, bArr3);
                com.bumptech.glide.f.y(byteArrayOutputStream, cVarArr.length, 1);
                com.bumptech.glide.f.y(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrC = com.bumptech.glide.f.c(bArrA);
                com.bumptech.glide.f.y(byteArrayOutputStream, bArrC.length, 4);
                byteArrayOutputStream.write(bArrC);
                return true;
            }
            byte[] bArr4 = f13556h;
            if (Arrays.equals(bArr, bArr4)) {
                com.bumptech.glide.f.y(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f13548i.size() * 4;
                    String strB = b(cVar.f13540a, cVar.f13541b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    com.bumptech.glide.f.z(byteArrayOutputStream, strB.getBytes(charset).length);
                    com.bumptech.glide.f.z(byteArrayOutputStream, cVar.f13547h.length);
                    com.bumptech.glide.f.y(byteArrayOutputStream, size, 4);
                    com.bumptech.glide.f.y(byteArrayOutputStream, cVar.f13542c, 4);
                    byteArrayOutputStream.write(strB.getBytes(charset));
                    Iterator it = cVar.f13548i.keySet().iterator();
                    while (it.hasNext()) {
                        com.bumptech.glide.f.z(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        com.bumptech.glide.f.z(byteArrayOutputStream, 0);
                    }
                    for (int i10 : cVar.f13547h) {
                        com.bumptech.glide.f.z(byteArrayOutputStream, i10);
                    }
                }
                return true;
            }
            byte[] bArr5 = f13555g;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA2 = a(cVarArr, bArr5);
                com.bumptech.glide.f.y(byteArrayOutputStream, cVarArr.length, 1);
                com.bumptech.glide.f.y(byteArrayOutputStream, bArrA2.length, 4);
                byte[] bArrC2 = com.bumptech.glide.f.c(bArrA2);
                com.bumptech.glide.f.y(byteArrayOutputStream, bArrC2.length, 4);
                byteArrayOutputStream.write(bArrC2);
                return true;
            }
            byte[] bArr6 = f13557i;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            com.bumptech.glide.f.z(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String strB2 = b(cVar2.f13540a, cVar2.f13541b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                com.bumptech.glide.f.z(byteArrayOutputStream, strB2.getBytes(charset2).length);
                TreeMap treeMap = cVar2.f13548i;
                com.bumptech.glide.f.z(byteArrayOutputStream, treeMap.size());
                com.bumptech.glide.f.z(byteArrayOutputStream, cVar2.f13547h.length);
                com.bumptech.glide.f.y(byteArrayOutputStream, cVar2.f13542c, 4);
                byteArrayOutputStream.write(strB2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    com.bumptech.glide.f.z(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i11 : cVar2.f13547h) {
                    com.bumptech.glide.f.z(byteArrayOutputStream, i11);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            com.bumptech.glide.f.z(byteArrayOutputStream2, cVarArr.length);
            int i12 = 2;
            int i13 = 2;
            for (c cVar3 : cVarArr) {
                com.bumptech.glide.f.y(byteArrayOutputStream2, cVar3.f13542c, 4);
                com.bumptech.glide.f.y(byteArrayOutputStream2, cVar3.f13543d, 4);
                com.bumptech.glide.f.y(byteArrayOutputStream2, cVar3.f13546g, 4);
                String strB3 = b(cVar3.f13540a, cVar3.f13541b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strB3.getBytes(charset3).length;
                com.bumptech.glide.f.z(byteArrayOutputStream2, length2);
                i13 = i13 + 14 + length2;
                byteArrayOutputStream2.write(strB3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i13 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray.length);
            }
            l lVar = new l(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(lVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            for (int i15 = 0; i15 < cVarArr.length; i15++) {
                try {
                    c cVar4 = cVarArr[i15];
                    com.bumptech.glide.f.z(byteArrayOutputStream3, i15);
                    com.bumptech.glide.f.z(byteArrayOutputStream3, cVar4.f13544e);
                    i14 = i14 + 4 + (cVar4.f13544e * 2);
                    l(byteArrayOutputStream3, cVar4);
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i14 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray2.length);
            }
            l lVar2 = new l(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(lVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i16 = 0;
            int i17 = 0;
            while (i16 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i16];
                    Iterator it3 = cVar5.f13548i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        n(byteArrayOutputStream4, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            o(byteArrayOutputStream4, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            com.bumptech.glide.f.z(byteArrayOutputStream3, i16);
                            int length3 = byteArray3.length + i12 + byteArray4.length;
                            int i18 = i17 + 6;
                            ArrayList arrayList4 = arrayList3;
                            com.bumptech.glide.f.y(byteArrayOutputStream3, length3, 4);
                            com.bumptech.glide.f.z(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i17 = i18 + length3;
                            i16++;
                            arrayList3 = arrayList4;
                            i12 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i17 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i17 + ", does not match actual size " + byteArray5.length);
            }
            l lVar3 = new l(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(lVar3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + (arrayList2.size() * 16);
            com.bumptech.glide.f.y(byteArrayOutputStream, arrayList2.size(), 4);
            int i19 = 0;
            while (i19 < arrayList2.size()) {
                l lVar4 = (l) arrayList2.get(i19);
                com.bumptech.glide.f.y(byteArrayOutputStream, ic1.d(lVar4.f13568a), 4);
                com.bumptech.glide.f.y(byteArrayOutputStream, size2, 4);
                boolean z7 = lVar4.f13570c;
                byte[] bArr7 = lVar4.f13569b;
                if (z7) {
                    long length4 = bArr7.length;
                    byte[] bArrC3 = com.bumptech.glide.f.c(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrC3);
                    com.bumptech.glide.f.y(byteArrayOutputStream, bArrC3.length, 4);
                    com.bumptech.glide.f.y(byteArrayOutputStream, length4, 4);
                    length = bArrC3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    com.bumptech.glide.f.y(byteArrayOutputStream, bArr7.length, 4);
                    com.bumptech.glide.f.y(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i19++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i20));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        int iIntValue = 0;
        for (int i10 : cVar.f13547h) {
            Integer numValueOf = Integer.valueOf(i10);
            com.bumptech.glide.f.z(byteArrayOutputStream, numValueOf.intValue() - iIntValue);
            iIntValue = numValueOf.intValue();
        }
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        com.bumptech.glide.f.z(byteArrayOutputStream, str.getBytes(charset).length);
        com.bumptech.glide.f.z(byteArrayOutputStream, cVar.f13544e);
        com.bumptech.glide.f.y(byteArrayOutputStream, cVar.f13545f, 4);
        com.bumptech.glide.f.y(byteArrayOutputStream, cVar.f13542c, 4);
        com.bumptech.glide.f.y(byteArrayOutputStream, cVar.f13546g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        byte[] bArr = new byte[(((cVar.f13546g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f13548i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i10 = iIntValue2 & 2;
            int i11 = cVar.f13546g;
            if (i10 != 0) {
                int iC = c(2, iIntValue, i11);
                int i12 = iC / 8;
                bArr[i12] = (byte) ((1 << (iC % 8)) | bArr[i12]);
            }
            if ((iIntValue2 & 4) != 0) {
                int iC2 = c(4, iIntValue, i11);
                int i13 = iC2 / 8;
                bArr[i13] = (byte) ((1 << (iC2 % 8)) | bArr[i13]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void o(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        int i10 = 0;
        for (Map.Entry entry : cVar.f13548i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                com.bumptech.glide.f.z(byteArrayOutputStream, iIntValue - i10);
                com.bumptech.glide.f.z(byteArrayOutputStream, 0);
                i10 = iIntValue;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c7 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0294 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x01d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void p(Context context, n.a aVar, d dVar, boolean z7) {
        FileInputStream fileInputStreamA;
        IOException iOException;
        int i10;
        c[] cVarArrI;
        c[] cVarArr;
        b bVar;
        c[] cVarArr2;
        byte[] bArr;
        int i11;
        boolean z10;
        FileOutputStream fileOutputStream;
        byte[] bArr2;
        ByteArrayOutputStream byteArrayOutputStream;
        int i12;
        int i13;
        FileInputStream fileInputStreamA2;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z11 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z7) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j10 = dataInputStream.readLong();
                            dataInputStream.close();
                            boolean z12 = j10 == packageInfo.lastUpdateTime;
                            if (z12) {
                                dVar.u(2, null);
                            }
                            if (z12) {
                                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                } else {
                    Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
                    int i14 = Build.VERSION.SDK_INT;
                    File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
                    b bVar2 = new b(assets, aVar, dVar, name, file2);
                    byte[] bArr3 = bVar2.f13534c;
                    if (bArr3 == null) {
                        bVar2.b(3, Integer.valueOf(i14));
                    } else if (!file2.exists()) {
                        try {
                            file2.createNewFile();
                            bVar2.f13537f = true;
                            byte[] bArr4 = f13551c;
                            fileInputStreamA = bVar2.a(assets, "dexopt/baseline.prof");
                            if (fileInputStreamA != null) {
                            }
                            cVarArr = bVar2.f13538g;
                            if (cVarArr != null) {
                                bVar = bVar2;
                                d dVar2 = bVar.f13533b;
                                cVarArr2 = bVar.f13538g;
                                if (cVarArr2 != null) {
                                }
                                bArr = bVar.f13539h;
                                if (bArr != null) {
                                }
                                if (z10) {
                                }
                                if (!z10) {
                                }
                            }
                        } catch (IOException unused2) {
                        }
                    } else if (file2.canWrite()) {
                        bVar2.f13537f = true;
                        byte[] bArr42 = f13551c;
                        try {
                            try {
                                fileInputStreamA = bVar2.a(assets, "dexopt/baseline.prof");
                            } catch (FileNotFoundException e10) {
                                dVar.u(6, e10);
                                fileInputStreamA = null;
                                if (fileInputStreamA != null) {
                                }
                                cVarArr = bVar2.f13538g;
                                if (cVarArr != null) {
                                }
                                k.c(context, z11);
                            } catch (IOException e11) {
                                dVar.u(7, e11);
                                fileInputStreamA = null;
                                if (fileInputStreamA != null) {
                                }
                                cVarArr = bVar2.f13538g;
                                if (cVarArr != null) {
                                }
                                k.c(context, z11);
                            }
                            if (fileInputStreamA != null) {
                                try {
                                } catch (IOException e12) {
                                    i10 = 7;
                                    dVar.u(7, e12);
                                    try {
                                        fileInputStreamA.close();
                                    } catch (IOException e13) {
                                        iOException = e13;
                                        dVar.u(i10, iOException);
                                        cVarArrI = null;
                                        bVar2.f13538g = cVarArrI;
                                        cVarArr = bVar2.f13538g;
                                        if (cVarArr != null) {
                                        }
                                        k.c(context, z11);
                                    }
                                    cVarArrI = null;
                                    bVar2.f13538g = cVarArrI;
                                    cVarArr = bVar2.f13538g;
                                    if (cVarArr != null) {
                                    }
                                    k.c(context, z11);
                                } catch (IllegalStateException e14) {
                                    try {
                                        dVar.u(8, e14);
                                        try {
                                            fileInputStreamA.close();
                                        } catch (IOException e15) {
                                            iOException = e15;
                                            i10 = 7;
                                            dVar.u(i10, iOException);
                                            cVarArrI = null;
                                            bVar2.f13538g = cVarArrI;
                                            cVarArr = bVar2.f13538g;
                                            if (cVarArr != null) {
                                            }
                                            k.c(context, z11);
                                        }
                                        cVarArrI = null;
                                        bVar2.f13538g = cVarArrI;
                                        cVarArr = bVar2.f13538g;
                                        if (cVarArr != null) {
                                        }
                                        k.c(context, z11);
                                    } catch (Throwable th) {
                                        th = th;
                                        Throwable th2 = th;
                                        try {
                                            fileInputStreamA.close();
                                            throw th2;
                                        } catch (IOException e16) {
                                            dVar.u(7, e16);
                                            throw th2;
                                        }
                                    }
                                }
                                if (!Arrays.equals(bArr42, com.bumptech.glide.f.q(fileInputStreamA, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                cVarArrI = i(fileInputStreamA, com.bumptech.glide.f.q(fileInputStreamA, 4), bVar2.f13536e);
                                try {
                                    fileInputStreamA.close();
                                } catch (IOException e17) {
                                    dVar.u(7, e17);
                                }
                                bVar2.f13538g = cVarArrI;
                            }
                            cVarArr = bVar2.f13538g;
                            if (cVarArr != null || (i12 = Build.VERSION.SDK_INT) < 24 || i12 > 34) {
                                bVar = bVar2;
                                d dVar22 = bVar.f13533b;
                                cVarArr2 = bVar.f13538g;
                                if (cVarArr2 != null && (bArr2 = bVar.f13534c) != null) {
                                    if (bVar.f13537f) {
                                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    }
                                    try {
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            byteArrayOutputStream.write(bArr42);
                                            byteArrayOutputStream.write(bArr2);
                                        } finally {
                                        }
                                    } catch (IOException e18) {
                                        dVar22.u(7, e18);
                                    } catch (IllegalStateException e19) {
                                        dVar22.u(8, e19);
                                    }
                                    if (k(byteArrayOutputStream, bArr2, cVarArr2)) {
                                        bVar.f13539h = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        bVar.f13538g = null;
                                    } else {
                                        dVar22.u(5, null);
                                        bVar.f13538g = null;
                                        byteArrayOutputStream.close();
                                    }
                                }
                                bArr = bVar.f13539h;
                                if (bArr != null) {
                                    z10 = false;
                                } else {
                                    try {
                                        if (!bVar.f13537f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            try {
                                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                                try {
                                                    fileOutputStream = new FileOutputStream(bVar.f13535d);
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                                try {
                                                    try {
                                                        byte[] bArr5 = new byte[512];
                                                        while (true) {
                                                            int i15 = byteArrayInputStream.read(bArr5);
                                                            if (i15 > 0) {
                                                                fileOutputStream.write(bArr5, 0, i15);
                                                            } else {
                                                                try {
                                                                    bVar.b(1, null);
                                                                    fileOutputStream.close();
                                                                    byteArrayInputStream.close();
                                                                    bVar.f13539h = null;
                                                                    bVar.f13538g = null;
                                                                    z10 = true;
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    Throwable th5 = th;
                                                                    try {
                                                                        fileOutputStream.close();
                                                                        throw th5;
                                                                    } catch (Throwable th6) {
                                                                        th5.addSuppressed(th6);
                                                                        throw th5;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    Throwable th9 = th;
                                                    try {
                                                        byteArrayInputStream.close();
                                                        throw th9;
                                                    } catch (Throwable th10) {
                                                        th9.addSuppressed(th10);
                                                        throw th9;
                                                    }
                                                }
                                            } catch (FileNotFoundException e20) {
                                                e = e20;
                                                i11 = 6;
                                                bVar.b(i11, e);
                                                bVar.f13539h = null;
                                                bVar.f13538g = null;
                                                z10 = false;
                                                if (z10) {
                                                }
                                                if (!z10) {
                                                    z11 = false;
                                                }
                                                k.c(context, z11);
                                            } catch (IOException e21) {
                                                e = e21;
                                                i11 = 7;
                                                bVar.b(i11, e);
                                                bVar.f13539h = null;
                                                bVar.f13538g = null;
                                                z10 = false;
                                                if (z10) {
                                                }
                                                if (!z10) {
                                                }
                                                k.c(context, z11);
                                            }
                                        } catch (FileNotFoundException e22) {
                                            e = e22;
                                            i11 = 6;
                                            bVar.b(i11, e);
                                            bVar.f13539h = null;
                                            bVar.f13538g = null;
                                            z10 = false;
                                            if (z10) {
                                            }
                                            if (!z10) {
                                            }
                                            k.c(context, z11);
                                        } catch (IOException e23) {
                                            e = e23;
                                            i11 = 7;
                                            bVar.b(i11, e);
                                            bVar.f13539h = null;
                                            bVar.f13538g = null;
                                            z10 = false;
                                            if (z10) {
                                            }
                                            if (!z10) {
                                            }
                                            k.c(context, z11);
                                        }
                                    } catch (Throwable th11) {
                                        bVar.f13539h = null;
                                        bVar.f13538g = null;
                                        throw th11;
                                    }
                                }
                                if (z10) {
                                    d(packageInfo, filesDir);
                                }
                                if (!z10 && z7) {
                                    z11 = true;
                                }
                            } else if (i12 == 24 || i12 == 25) {
                                try {
                                    fileInputStreamA2 = bVar2.a(assets, "dexopt/baseline.profm");
                                } catch (FileNotFoundException e24) {
                                    e = e24;
                                    i13 = 9;
                                    dVar.u(i13, e);
                                } catch (IOException e25) {
                                    e = e25;
                                    i13 = 7;
                                    dVar.u(i13, e);
                                } catch (IllegalStateException e26) {
                                    bVar2.f13538g = null;
                                    dVar.u(8, e26);
                                }
                                if (fileInputStreamA2 != null) {
                                    try {
                                        if (!Arrays.equals(f13552d, com.bumptech.glide.f.q(fileInputStreamA2, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        bVar2.f13538g = f(fileInputStreamA2, com.bumptech.glide.f.q(fileInputStreamA2, 4), bArr3, cVarArr);
                                        fileInputStreamA2.close();
                                        bVar = bVar2;
                                        if (bVar == null) {
                                        }
                                        d dVar222 = bVar.f13533b;
                                        cVarArr2 = bVar.f13538g;
                                        if (cVarArr2 != null) {
                                            if (bVar.f13537f) {
                                            }
                                        }
                                        bArr = bVar.f13539h;
                                        if (bArr != null) {
                                        }
                                        if (z10) {
                                        }
                                        if (!z10) {
                                        }
                                    } finally {
                                    }
                                } else {
                                    if (fileInputStreamA2 != null) {
                                        fileInputStreamA2.close();
                                    }
                                    bVar = null;
                                    if (bVar == null) {
                                    }
                                    d dVar2222 = bVar.f13533b;
                                    cVarArr2 = bVar.f13538g;
                                    if (cVarArr2 != null) {
                                    }
                                    bArr = bVar.f13539h;
                                    if (bArr != null) {
                                    }
                                    if (z10) {
                                    }
                                    if (!z10) {
                                    }
                                }
                            } else {
                                switch (i12) {
                                }
                            }
                        } catch (Throwable th12) {
                            th = th12;
                        }
                    } else {
                        bVar2.b(4, null);
                    }
                    z11 = false;
                }
            }
            k.c(context, z11);
        } catch (PackageManager.NameNotFoundException e27) {
            dVar.u(7, e27);
            k.c(context, false);
        }
    }
}