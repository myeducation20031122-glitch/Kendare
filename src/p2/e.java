package p2;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.recyclerview.widget.g1;
import com.google.android.gms.internal.measurement.n3;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import t2.h;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public int[] f15896a;

    /* renamed from: c, reason: collision with root package name */
    public final n3 f15898c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f15899d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f15900e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f15901f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f15902g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f15903h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f15904i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f15905j;

    /* renamed from: k, reason: collision with root package name */
    public int f15906k;

    /* renamed from: l, reason: collision with root package name */
    public c f15907l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f15908m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f15909n;

    /* renamed from: o, reason: collision with root package name */
    public int f15910o;

    /* renamed from: p, reason: collision with root package name */
    public final int f15911p;

    /* renamed from: q, reason: collision with root package name */
    public final int f15912q;

    /* renamed from: r, reason: collision with root package name */
    public final int f15913r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f15914s;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f15897b = new int[256];

    /* renamed from: t, reason: collision with root package name */
    public Bitmap.Config f15915t = Bitmap.Config.ARGB_8888;

    public e(n3 n3Var, c cVar, ByteBuffer byteBuffer, int i10) {
        this.f15898c = n3Var;
        this.f15907l = new c();
        synchronized (this) {
            try {
                if (i10 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
                }
                int iHighestOneBit = Integer.highestOneBit(i10);
                this.f15910o = 0;
                this.f15907l = cVar;
                this.f15906k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f15899d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f15899d.order(ByteOrder.LITTLE_ENDIAN);
                this.f15909n = false;
                Iterator it = cVar.f15885e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((b) it.next()).f15876g == 3) {
                        this.f15909n = true;
                        break;
                    }
                }
                this.f15911p = iHighestOneBit;
                int i11 = cVar.f15886f;
                this.f15913r = i11 / iHighestOneBit;
                int i12 = cVar.f15887g;
                this.f15912q = i12 / iHighestOneBit;
                this.f15904i = this.f15898c.y(i11 * i12);
                n3 n3Var2 = this.f15898c;
                int i13 = this.f15913r * this.f15912q;
                Object obj = n3Var2.f10910f;
                this.f15905j = ((h) obj) == null ? new int[i13] : (int[]) ((h) obj).d(int[].class, i13);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.f15914s;
        Bitmap bitmapG = ((t2.d) this.f15898c.f10909e).g(this.f15913r, this.f15912q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f15915t);
        bitmapG.setHasAlpha(true);
        return bitmapG;
    }

    public final synchronized Bitmap b() {
        try {
            if (this.f15907l.f15883c <= 0 || this.f15906k < 0) {
                if (Log.isLoggable("e", 3)) {
                    Log.d("e", "Unable to decode frame, frameCount=" + this.f15907l.f15883c + ", framePointer=" + this.f15906k);
                }
                this.f15910o = 1;
            }
            int i10 = this.f15910o;
            if (i10 != 1 && i10 != 2) {
                this.f15910o = 0;
                if (this.f15900e == null) {
                    this.f15900e = this.f15898c.y(255);
                }
                b bVar = (b) this.f15907l.f15885e.get(this.f15906k);
                int i11 = this.f15906k - 1;
                b bVar2 = i11 >= 0 ? (b) this.f15907l.f15885e.get(i11) : null;
                int[] iArr = bVar.f15880k;
                if (iArr == null) {
                    iArr = this.f15907l.f15881a;
                }
                this.f15896a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("e", 3)) {
                        Log.d("e", "No valid color table found for frame #" + this.f15906k);
                    }
                    this.f15910o = 1;
                    return null;
                }
                if (bVar.f15875f) {
                    System.arraycopy(iArr, 0, this.f15897b, 0, iArr.length);
                    int[] iArr2 = this.f15897b;
                    this.f15896a = iArr2;
                    iArr2[bVar.f15877h] = 0;
                    if (bVar.f15876g == 2 && this.f15906k == 0) {
                        this.f15914s = Boolean.TRUE;
                    }
                }
                return d(bVar, bVar2);
            }
            if (Log.isLoggable("e", 3)) {
                Log.d("e", "Unable to decode frame, status=" + this.f15910o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f15915t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap d(b bVar, b bVar2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        short s10;
        int i22;
        Bitmap bitmap;
        int[] iArr = this.f15905j;
        n3 n3Var = this.f15898c;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f15908m;
            if (bitmap2 != null) {
                ((t2.d) n3Var.f10909e).c(bitmap2);
            }
            this.f15908m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f15876g == 3 && this.f15908m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i22 = bVar2.f15876g) > 0) {
            if (i22 == 2) {
                if (!bVar.f15875f) {
                    c cVar = this.f15907l;
                    int i23 = cVar.f15891k;
                    if (bVar.f15880k != null && cVar.f15890j == bVar.f15877h) {
                        i23 = 0;
                    }
                    int i24 = bVar2.f15873d;
                    int i25 = this.f15911p;
                    int i26 = i24 / i25;
                    int i27 = bVar2.f15871b / i25;
                    int i28 = bVar2.f15872c / i25;
                    int i29 = bVar2.f15870a / i25;
                    int i30 = this.f15913r;
                    int i31 = (i27 * i30) + i29;
                    int i32 = (i26 * i30) + i31;
                    while (i31 < i32) {
                        int i33 = i31 + i28;
                        for (int i34 = i31; i34 < i33; i34++) {
                            iArr[i34] = i23;
                        }
                        i31 += this.f15913r;
                    }
                }
            } else if (i22 == 3 && (bitmap = this.f15908m) != null) {
                int i35 = this.f15913r;
                bitmap.getPixels(iArr, 0, i35, 0, 0, i35, this.f15912q);
            }
        }
        this.f15899d.position(bVar.f15879j);
        int i36 = bVar.f15872c * bVar.f15873d;
        byte[] bArr = this.f15904i;
        if (bArr == null || bArr.length < i36) {
            this.f15904i = n3Var.y(i36);
        }
        byte[] bArr2 = this.f15904i;
        if (this.f15901f == null) {
            this.f15901f = new short[g1.FLAG_APPEARED_IN_PRE_LAYOUT];
        }
        short[] sArr = this.f15901f;
        if (this.f15902g == null) {
            this.f15902g = new byte[g1.FLAG_APPEARED_IN_PRE_LAYOUT];
        }
        byte[] bArr3 = this.f15902g;
        if (this.f15903h == null) {
            this.f15903h = new byte[4097];
        }
        byte[] bArr4 = this.f15903h;
        int i37 = this.f15899d.get() & 255;
        int i38 = 1 << i37;
        int i39 = i38 + 1;
        int i40 = i38 + 2;
        int i41 = i37 + 1;
        int i42 = (1 << i41) - 1;
        for (int i43 = 0; i43 < i38; i43++) {
            sArr[i43] = 0;
            bArr3[i43] = (byte) i43;
        }
        byte[] bArr5 = this.f15900e;
        int i44 = i41;
        int i45 = i40;
        int i46 = i42;
        int i47 = 0;
        short s11 = -1;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        short s12 = 0;
        int i53 = 0;
        while (true) {
            if (i47 >= i36) {
                break;
            }
            if (i48 == 0) {
                int i54 = this.f15899d.get() & 255;
                if (i54 <= 0) {
                    i20 = i41;
                    i21 = i47;
                } else {
                    ByteBuffer byteBuffer = this.f15899d;
                    i20 = i41;
                    i21 = i47;
                    byteBuffer.get(this.f15900e, 0, Math.min(i54, byteBuffer.remaining()));
                }
                if (i54 <= 0) {
                    this.f15910o = 3;
                    break;
                }
                i48 = i54;
                i49 = 0;
            } else {
                i20 = i41;
                i21 = i47;
            }
            i51 += (bArr5[i49] & 255) << i50;
            i49++;
            i48--;
            short s13 = s11;
            int i55 = i50 + 8;
            int i56 = i45;
            int i57 = i44;
            i47 = i21;
            byte[] bArr6 = bArr5;
            short s14 = s12;
            while (true) {
                if (i55 < i57) {
                    s12 = s14;
                    i44 = i57;
                    i50 = i55;
                    i45 = i56;
                    bArr5 = bArr6;
                    i41 = i20;
                    s11 = s13;
                    break;
                }
                int[] iArr2 = iArr;
                int i58 = i51 & i46;
                i51 >>= i57;
                i55 -= i57;
                if (i58 == i38) {
                    i56 = i40;
                    i46 = i42;
                    iArr = iArr2;
                    i57 = i20;
                    s13 = -1;
                } else {
                    if (i58 == i39) {
                        s12 = s14;
                        i44 = i57;
                        i45 = i56;
                        bArr5 = bArr6;
                        iArr = iArr2;
                        i41 = i20;
                        s11 = s13;
                        i50 = i55;
                        break;
                    }
                    if (s13 == -1) {
                        bArr2[i52] = bArr3[i58 == true ? 1 : 0];
                        i52++;
                        i47++;
                        s14 = i58 == true ? 1 : 0;
                        s13 = s14;
                        iArr = iArr2;
                        i55 = i55;
                    } else {
                        if (i58 >= i56) {
                            bArr4[i53] = (byte) s14;
                            i53++;
                            s10 = s13;
                        } else {
                            s10 = i58 == true ? 1 : 0;
                        }
                        while (s10 >= i38) {
                            bArr4[i53] = bArr3[s10];
                            i53++;
                            s10 = sArr[s10];
                        }
                        boolean z7 = bArr3[s10] & 255;
                        byte b7 = z7 ? (byte) 1 : (byte) 0;
                        bArr2[i52] = b7;
                        while (true) {
                            i52++;
                            i47++;
                            if (i53 <= 0) {
                                break;
                            }
                            i53--;
                            bArr2[i52] = bArr4[i53];
                        }
                        if (i56 < 4096) {
                            sArr[i56] = s13;
                            bArr3[i56] = b7;
                            i56++;
                            if ((i56 & i46) == 0 && i56 < 4096) {
                                i57++;
                                i46 += i56;
                            }
                        }
                        s13 = i58 == true ? 1 : 0;
                        iArr = iArr2;
                        i55 = i55;
                        s14 = z7 ? 1 : 0;
                    }
                }
            }
        }
        int[] iArr3 = iArr;
        Arrays.fill(bArr2, i52, i36, (byte) 0);
        if (bVar.f15874e || this.f15911p != 1) {
            int[] iArr4 = this.f15905j;
            int i59 = bVar.f15873d;
            int i60 = this.f15911p;
            int i61 = i59 / i60;
            int i62 = bVar.f15871b / i60;
            int i63 = bVar.f15872c / i60;
            int i64 = bVar.f15870a / i60;
            boolean z10 = this.f15906k == 0;
            int i65 = this.f15913r;
            int i66 = this.f15912q;
            byte[] bArr7 = this.f15904i;
            int[] iArr5 = this.f15896a;
            Boolean bool = this.f15914s;
            int i67 = 0;
            int i68 = 0;
            int i69 = 1;
            int i70 = 8;
            while (i67 < i61) {
                Boolean bool2 = bool;
                if (bVar.f15874e) {
                    if (i68 >= i61) {
                        int i71 = i69 + 1;
                        i10 = i61;
                        if (i71 == 2) {
                            i69 = i71;
                            i68 = 4;
                        } else if (i71 != 3) {
                            i69 = i71;
                            if (i71 == 4) {
                                i68 = 1;
                                i70 = 2;
                            }
                        } else {
                            i69 = i71;
                            i68 = 2;
                            i70 = 4;
                        }
                    } else {
                        i10 = i61;
                    }
                    i11 = i68 + i70;
                } else {
                    i10 = i61;
                    i11 = i68;
                    i68 = i67;
                }
                int i72 = i68 + i62;
                boolean z11 = i60 == 1;
                if (i72 < i66) {
                    int i73 = i72 * i65;
                    int i74 = i73 + i64;
                    i12 = i11;
                    int i75 = i74 + i63;
                    int i76 = i73 + i65;
                    if (i76 < i75) {
                        i75 = i76;
                    }
                    i13 = i62;
                    int i77 = i67 * i60 * bVar.f15872c;
                    if (z11) {
                        bool = bool2;
                        int i78 = i74;
                        while (true) {
                            i14 = i63;
                            if (i78 >= i75) {
                                break;
                            }
                            int i79 = iArr5[bArr7[i77] & 255];
                            if (i79 != 0) {
                                iArr4[i78] = i79;
                            } else if (z10 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i77 += i60;
                            i78++;
                            i63 = i14;
                        }
                    } else {
                        i14 = i63;
                        int i80 = ((i75 - i74) * i60) + i77;
                        bool = bool2;
                        int i81 = i74;
                        while (i81 < i75) {
                            int i82 = i75;
                            int i83 = bVar.f15872c;
                            int i84 = i64;
                            int i85 = i65;
                            int i86 = i77;
                            int i87 = 0;
                            int i88 = 0;
                            int i89 = 0;
                            int i90 = 0;
                            int i91 = 0;
                            while (true) {
                                if (i86 >= this.f15911p + i77) {
                                    i18 = i66;
                                    break;
                                }
                                byte[] bArr8 = this.f15904i;
                                i18 = i66;
                                if (i86 >= bArr8.length || i86 >= i80) {
                                    break;
                                }
                                int i92 = this.f15896a[bArr8[i86] & 255];
                                if (i92 != 0) {
                                    i87 += (i92 >> 24) & 255;
                                    i88 += (i92 >> 16) & 255;
                                    i89 += (i92 >> 8) & 255;
                                    i90 += i92 & 255;
                                    i91++;
                                }
                                i86++;
                                i66 = i18;
                            }
                            int i93 = i83 + i77;
                            for (int i94 = i93; i94 < this.f15911p + i93; i94++) {
                                byte[] bArr9 = this.f15904i;
                                if (i94 >= bArr9.length || i94 >= i80) {
                                    break;
                                }
                                int i95 = this.f15896a[bArr9[i94] & 255];
                                if (i95 != 0) {
                                    i87 += (i95 >> 24) & 255;
                                    i88 += (i95 >> 16) & 255;
                                    i89 += (i95 >> 8) & 255;
                                    i90 += i95 & 255;
                                    i91++;
                                }
                            }
                            int i96 = i91 == 0 ? 0 : ((i87 / i91) << 24) | ((i88 / i91) << 16) | ((i89 / i91) << 8) | (i90 / i91);
                            if (i96 != 0) {
                                iArr4[i81] = i96;
                            } else if (z10 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i77 += i60;
                            i81++;
                            i75 = i82;
                            i64 = i84;
                            i65 = i85;
                            i66 = i18;
                        }
                    }
                    i15 = i64;
                    i16 = i65;
                    i17 = i66;
                } else {
                    i12 = i11;
                    i13 = i62;
                    i14 = i63;
                    i15 = i64;
                    i16 = i65;
                    i17 = i66;
                    bool = bool2;
                }
                i67++;
                i61 = i10;
                i68 = i12;
                i62 = i13;
                i63 = i14;
                i64 = i15;
                i65 = i16;
                i66 = i17;
            }
            Boolean bool3 = bool;
            if (this.f15914s == null) {
                this.f15914s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
            }
        } else {
            int[] iArr6 = this.f15905j;
            int i97 = bVar.f15873d;
            int i98 = bVar.f15871b;
            int i99 = bVar.f15872c;
            int i100 = bVar.f15870a;
            boolean z12 = this.f15906k == 0;
            int i101 = this.f15913r;
            byte[] bArr10 = this.f15904i;
            int[] iArr7 = this.f15896a;
            int i102 = -1;
            for (int i103 = 0; i103 < i97; i103++) {
                int i104 = (i103 + i98) * i101;
                int i105 = i104 + i100;
                int i106 = i105 + i99;
                int i107 = i104 + i101;
                if (i107 < i106) {
                    i106 = i107;
                }
                int i108 = bVar.f15872c * i103;
                while (true) {
                    int i109 = i97;
                    if (i105 < i106) {
                        int i110 = bArr10[i108];
                        int i111 = i98;
                        int i112 = i110 & 255;
                        if (i112 != i102) {
                            int i113 = iArr7[i112];
                            if (i113 != 0) {
                                iArr6[i105] = i113;
                            } else {
                                i102 = i110;
                            }
                        }
                        i108++;
                        i105++;
                        i97 = i109;
                        i98 = i111;
                    }
                }
            }
            Boolean bool4 = this.f15914s;
            this.f15914s = Boolean.valueOf((bool4 != null && bool4.booleanValue()) || (this.f15914s == null && z12 && i102 != -1));
        }
        if (this.f15909n && ((i19 = bVar.f15876g) == 0 || i19 == 1)) {
            if (this.f15908m == null) {
                this.f15908m = a();
            }
            Bitmap bitmap3 = this.f15908m;
            int i114 = this.f15913r;
            bitmap3.setPixels(iArr3, 0, i114, 0, 0, i114, this.f15912q);
        }
        Bitmap bitmapA = a();
        int i115 = this.f15913r;
        bitmapA.setPixels(iArr3, 0, i115, 0, 0, i115, this.f15912q);
        return bitmapA;
    }
}