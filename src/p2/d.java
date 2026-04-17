package p2;

import a0.h;
import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f15893b;

    /* renamed from: c, reason: collision with root package name */
    public c f15894c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f15892a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f15895d = 0;

    public final boolean a() {
        return this.f15894c.f15882b != 0;
    }

    public final c b() {
        byte[] bArr;
        if (this.f15893b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f15894c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb.append((char) c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f15894c.f15886f = this.f15893b.getShort();
            this.f15894c.f15887g = this.f15893b.getShort();
            int iC = c();
            c cVar = this.f15894c;
            cVar.f15888h = (iC & 128) != 0;
            cVar.f15889i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.f15894c.f15890j = c();
            c cVar2 = this.f15894c;
            c();
            cVar2.getClass();
            if (this.f15894c.f15888h && !a()) {
                c cVar3 = this.f15894c;
                cVar3.f15881a = e(cVar3.f15889i);
                c cVar4 = this.f15894c;
                cVar4.f15891k = cVar4.f15881a[cVar4.f15890j];
            }
        } else {
            this.f15894c.f15882b = 1;
        }
        if (!a()) {
            boolean z7 = false;
            while (!z7 && !a() && this.f15894c.f15883c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 != 1) {
                        if (iC3 == 249) {
                            this.f15894c.f15884d = new b();
                            c();
                            int iC4 = c();
                            b bVar = this.f15894c.f15884d;
                            int i11 = (iC4 & 28) >> 2;
                            bVar.f15876g = i11;
                            if (i11 == 0) {
                                bVar.f15876g = 1;
                            }
                            bVar.f15875f = (iC4 & 1) != 0;
                            short s10 = this.f15893b.getShort();
                            if (s10 < 2) {
                                s10 = 10;
                            }
                            b bVar2 = this.f15894c.f15884d;
                            bVar2.f15878i = s10 * 10;
                            bVar2.f15877h = c();
                            c();
                        } else if (iC3 != 254 && iC3 == 255) {
                            d();
                            StringBuilder sb2 = new StringBuilder();
                            int i12 = 0;
                            while (true) {
                                bArr = this.f15892a;
                                if (i12 >= 11) {
                                    break;
                                }
                                sb2.append((char) bArr[i12]);
                                i12++;
                            }
                            if (sb2.toString().equals("NETSCAPE2.0")) {
                                do {
                                    d();
                                    if (bArr[0] == 1) {
                                        byte b7 = bArr[1];
                                        byte b10 = bArr[2];
                                        this.f15894c.getClass();
                                    }
                                    if (this.f15895d > 0) {
                                    }
                                } while (!a());
                            }
                        }
                    }
                    f();
                } else if (iC2 == 44) {
                    c cVar5 = this.f15894c;
                    if (cVar5.f15884d == null) {
                        cVar5.f15884d = new b();
                    }
                    cVar5.f15884d.f15870a = this.f15893b.getShort();
                    this.f15894c.f15884d.f15871b = this.f15893b.getShort();
                    this.f15894c.f15884d.f15872c = this.f15893b.getShort();
                    this.f15894c.f15884d.f15873d = this.f15893b.getShort();
                    int iC5 = c();
                    boolean z10 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    b bVar3 = this.f15894c.f15884d;
                    bVar3.f15874e = (iC5 & 64) != 0;
                    if (z10) {
                        bVar3.f15880k = e(iPow);
                    } else {
                        bVar3.f15880k = null;
                    }
                    this.f15894c.f15884d.f15879j = this.f15893b.position();
                    c();
                    f();
                    if (!a()) {
                        c cVar6 = this.f15894c;
                        cVar6.f15883c++;
                        cVar6.f15885e.add(cVar6.f15884d);
                    }
                } else if (iC2 != 59) {
                    this.f15894c.f15882b = 1;
                } else {
                    z7 = true;
                }
            }
            c cVar7 = this.f15894c;
            if (cVar7.f15883c < 0) {
                cVar7.f15882b = 1;
            }
        }
        return this.f15894c;
    }

    public final int c() {
        try {
            return this.f15893b.get() & 255;
        } catch (Exception unused) {
            this.f15894c.f15882b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.f15895d = iC;
        if (iC <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                i11 = this.f15895d;
                if (i10 >= i11) {
                    return;
                }
                i11 -= i10;
                this.f15893b.get(this.f15892a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbZ = h.z("Error Reading Block n: ", i10, " count: ", i11, " blockSize: ");
                    sbZ.append(this.f15895d);
                    Log.d("GifHeaderParser", sbZ.toString(), e10);
                }
                this.f15894c.f15882b = 1;
                return;
            }
        }
    }

    public final int[] e(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f15893b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & 255);
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f15894c.f15882b = 1;
        }
        return iArr;
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.f15893b.position(Math.min(this.f15893b.position() + iC, this.f15893b.limit()));
        } while (iC > 0);
    }
}