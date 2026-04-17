package a1;

import android.util.Log;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f187a;

    /* renamed from: b, reason: collision with root package name */
    public final int f188b;

    /* renamed from: c, reason: collision with root package name */
    public final long f189c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f190d;

    public c(long j10, byte[] bArr, int i10, int i11) {
        this.f187a = i10;
        this.f188b = i11;
        this.f189c = j10;
        this.f190d = bArr;
    }

    public static c a(long j10, ByteOrder byteOrder) {
        long[] jArr = {j10};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.E[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new c(byteBufferWrap.array(), 4, 1);
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        e[] eVarArr = {eVar};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.E[5]]);
        byteBufferWrap.order(byteOrder);
        e eVar2 = eVarArr[0];
        byteBufferWrap.putInt((int) eVar2.f195a);
        byteBufferWrap.putInt((int) eVar2.f196b);
        return new c(byteBufferWrap.array(), 5, 1);
    }

    public static c c(int i10, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.E[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i10}[0]);
        return new c(byteBufferWrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objG instanceof String) {
            return Double.parseDouble((String) objG);
        }
        if (objG instanceof long[]) {
            if (((long[]) objG).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof int[]) {
            if (((int[]) objG).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) objG;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.f195a / eVar.f196b;
    }

    public final int e(ByteOrder byteOrder) {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objG instanceof String) {
            return Integer.parseInt((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objG;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            return null;
        }
        if (objG instanceof String) {
            return (String) objG;
        }
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            while (i10 < jArr.length) {
                sb.append(jArr[i10]);
                i10++;
                if (i10 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            while (i10 < iArr.length) {
                sb.append(iArr[i10]);
                i10++;
                if (i10 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            while (i10 < dArr.length) {
                sb.append(dArr[i10]);
                i10++;
                if (i10 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objG instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) objG;
        while (i10 < eVarArr.length) {
            sb.append(eVarArr[i10].f195a);
            sb.append('/');
            sb.append(eVarArr[i10].f196b);
            i10++;
            if (i10 != eVarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:88|(2:90|(2:91|(2:93|(2:180|95)(1:96))(2:179|97)))|98|(2:100|(6:182|102|108|155|109|113)(3:103|(2:105|184)(2:106|183)|107))|181|108|155|109|113) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0131, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0132, code lost:
    
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:166:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v24, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [a1.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v28, types: [a1.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v30, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ByteOrder byteOrder) throws Throwable {
        b bVar;
        InputStream inputStream;
        byte b7;
        byte[] bArr = this.f190d;
        InputStream inputStream2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    bVar.f184e = byteOrder;
                    int i10 = this.f187a;
                    int length = 0;
                    int i11 = this.f188b;
                    switch (i10) {
                        case QueueFuseable.SYNC /* 1 */:
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            if (bArr.length != 1 || (b7 = bArr[0]) < 0 || b7 > 1) {
                                String str = new String(bArr, g.N);
                                try {
                                    bVar.close();
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b7 + 48)});
                            try {
                                bVar.close();
                            } catch (IOException e11) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                            }
                            return str2;
                        case 2:
                        case y4.g.NETWORK_ERROR /* 7 */:
                            if (i11 >= g.F.length) {
                                int i12 = 0;
                                while (true) {
                                    byte[] bArr2 = g.F;
                                    if (i12 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i12] == bArr2[i12]) {
                                        i12++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < i11) {
                                byte b10 = bArr[length];
                                if (b10 == 0) {
                                    String string = sb.toString();
                                    bVar.close();
                                    return string;
                                }
                                if (b10 >= 32) {
                                    sb.append((char) b10);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            String string2 = sb.toString();
                            bVar.close();
                            return string2;
                        case 3:
                            ?? r14 = new int[i11];
                            while (length < i11) {
                                r14[length] = bVar.readUnsignedShort();
                                length++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e12) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                            }
                            return r14;
                        case 4:
                            ?? r142 = new long[i11];
                            while (length < i11) {
                                r142[length] = bVar.readInt() & 4294967295L;
                                length++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e13) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                            }
                            return r142;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            ?? r143 = new e[i11];
                            while (length < i11) {
                                r143[length] = new e(bVar.readInt() & 4294967295L, bVar.readInt() & 4294967295L);
                                length++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e14) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                            }
                            return r143;
                        case 8:
                            ?? r144 = new int[i11];
                            while (length < i11) {
                                r144[length] = bVar.readShort();
                                length++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e15) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                            }
                            return r144;
                        case 9:
                            ?? r145 = new int[i11];
                            while (length < i11) {
                                r145[length] = bVar.readInt();
                                length++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e16) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                            }
                            return r145;
                        case y4.g.DEVELOPER_ERROR /* 10 */:
                            ?? r146 = new e[i11];
                            while (length < i11) {
                                r146[length] = new e(bVar.readInt(), bVar.readInt());
                                length++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e17) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                            }
                            return r146;
                        case 11:
                            ?? r147 = new double[i11];
                            while (length < i11) {
                                r147[length] = bVar.readFloat();
                                length++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e18) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                            }
                            return r147;
                        case 12:
                            ?? r148 = new double[i11];
                            while (length < i11) {
                                r148[length] = bVar.readDouble();
                                length++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e19) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e19);
                            }
                            return r148;
                        default:
                            try {
                                bVar.close();
                            } catch (IOException e20) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e20);
                            }
                            return null;
                    }
                } catch (IOException e21) {
                    e = e21;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e22) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e22);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e23) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e23);
                    }
                }
                throw th;
            }
        } catch (IOException e24) {
            e = e24;
            bVar = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(g.D[this.f187a]);
        sb.append(", data length:");
        return r.f(sb, this.f190d.length, ")");
    }

    public c(byte[] bArr, int i10, int i11) {
        this(-1L, bArr, i10, i11);
    }
}