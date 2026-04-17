package i5;

import com.google.android.gms.internal.ads.ic1;
import j4.f3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13372a;

    /* renamed from: b, reason: collision with root package name */
    public int f13373b;

    /* renamed from: c, reason: collision with root package name */
    public int f13374c;

    /* renamed from: d, reason: collision with root package name */
    public int f13375d;

    public d() {
        this.f13372a = 0;
        this.f13373b = 0;
        this.f13374c = 0;
        this.f13375d = 0;
    }

    public static d a(f3 f3Var) {
        return f3Var.f13700j ? new d(3, 0, 0, 2) : f3Var.f13705w ? new d(2, 0, 0, 2) : f3Var.f13704u ? new d(0, 0, 0, 2) : new d(1, f3Var.f13702n, f3Var.f13699f, 2);
    }

    public final boolean b() {
        return this.f13373b == 3;
    }

    public final String toString() {
        switch (this.f13372a) {
            case y4.g.INVALID_ACCOUNT /* 5 */:
                StringBuilder sb = this.f13373b < 10 ? new StringBuilder("0") : new StringBuilder("");
                sb.append(this.f13373b);
                String strF = a0.h.F(sb.toString(), ":");
                StringBuilder sbO = this.f13374c < 10 ? ic1.o(strF, "0") : ic1.o(strF, "");
                sbO.append(this.f13374c);
                String strF2 = a0.h.F(sbO.toString(), ":");
                StringBuilder sbO2 = this.f13375d < 10 ? ic1.o(strF2, "0") : ic1.o(strF2, "");
                sbO2.append(this.f13375d);
                return sbO2.toString();
            default:
                return super.toString();
        }
    }

    public d(double d10) {
        this.f13372a = 5;
        while (d10 < 0.0d) {
            d10 += 24.0d;
        }
        while (d10 >= 24.0d) {
            d10 -= 24.0d;
        }
        int i10 = (int) d10;
        this.f13373b = i10;
        double d11 = (d10 - i10) * 60.0d;
        int i11 = (int) d11;
        this.f13374c = i11;
        this.f13375d = (int) ((d11 - i11) * 60.0d);
    }

    public /* synthetic */ d(int i10, int i11, int i12) {
        this.f13372a = 4;
        this.f13373b = i10;
        this.f13374c = i11;
        this.f13375d = i12;
    }

    public d(int i10, int i11, int i12, int i13) {
        this.f13372a = i13;
        if (i13 != 3) {
            this.f13373b = i10;
            this.f13375d = i11;
            this.f13374c = i12;
        } else {
            this.f13373b = i10;
            this.f13374c = i11;
            this.f13375d = i12;
        }
    }
}