package j4;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.sr;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f3 extends b5.a {
    public static final Parcelable.Creator<f3> CREATOR = new m2(6);
    public boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;

    /* renamed from: b, reason: collision with root package name */
    public final String f13697b;

    /* renamed from: e, reason: collision with root package name */
    public final int f13698e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13699f;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f13700j;

    /* renamed from: m, reason: collision with root package name */
    public final int f13701m;

    /* renamed from: n, reason: collision with root package name */
    public final int f13702n;

    /* renamed from: t, reason: collision with root package name */
    public final f3[] f13703t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f13704u;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f13705w;

    public f3() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static f3 h() {
        return new f3("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static f3 l() {
        return new f3("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.X(parcel, 2, this.f13697b);
        com.bumptech.glide.e.i0(parcel, 3, 4);
        parcel.writeInt(this.f13698e);
        com.bumptech.glide.e.i0(parcel, 4, 4);
        parcel.writeInt(this.f13699f);
        com.bumptech.glide.e.i0(parcel, 5, 4);
        parcel.writeInt(this.f13700j ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 6, 4);
        parcel.writeInt(this.f13701m);
        com.bumptech.glide.e.i0(parcel, 7, 4);
        parcel.writeInt(this.f13702n);
        com.bumptech.glide.e.a0(parcel, 8, this.f13703t, i10);
        com.bumptech.glide.e.i0(parcel, 9, 4);
        parcel.writeInt(this.f13704u ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 10, 4);
        parcel.writeInt(this.f13705w ? 1 : 0);
        boolean z7 = this.M;
        com.bumptech.glide.e.i0(parcel, 11, 4);
        parcel.writeInt(z7 ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 12, 4);
        parcel.writeInt(this.N ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 13, 4);
        parcel.writeInt(this.O ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 14, 4);
        parcel.writeInt(this.P ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 15, 4);
        parcel.writeInt(this.Q ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 16, 4);
        parcel.writeInt(this.R ? 1 : 0);
        com.bumptech.glide.e.h0(parcel, iC0);
    }

    public f3(Context context, c4.g gVar) {
        this(context, new c4.g[]{gVar});
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f3(Context context, c4.g[] gVarArr) {
        int i10;
        int i11;
        String str;
        int dimensionPixelSize;
        double d10;
        c4.g gVar = gVarArr[0];
        this.f13700j = false;
        int i12 = gVar.f2107a;
        int i13 = gVar.f2108b;
        boolean z7 = i12 == -3 && i13 == -4;
        this.f13705w = z7;
        this.P = gVar.f2110d;
        boolean z10 = gVar.f2111e;
        this.Q = z10;
        boolean z11 = gVar.f2113g;
        this.R = z11;
        if (z7) {
            c4.g gVar2 = c4.g.f2104i;
            this.f13701m = gVar2.f2107a;
            i13 = gVar2.f2108b;
        } else {
            this.f13701m = i12;
            if (z10) {
                i13 = gVar.f2112f;
            } else if (z11) {
                i13 = gVar.f2114h;
            }
        }
        this.f13698e = i13;
        boolean z12 = this.f13701m == -1;
        boolean z13 = i13 == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z12) {
            sr srVar = o.f13771f.f13772a;
            if (context.getResources().getConfiguration().orientation != 2) {
                dimensionPixelSize = displayMetrics.widthPixels;
                this.f13702n = dimensionPixelSize;
                d10 = dimensionPixelSize / displayMetrics.density;
                i10 = (int) d10;
                if (d10 - i10 >= 0.01d) {
                    i10++;
                }
            } else {
                if (((int) (r12.heightPixels / context.getResources().getDisplayMetrics().density)) < 600) {
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics2);
                        int i14 = displayMetrics2.heightPixels;
                        int i15 = displayMetrics2.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics2);
                        int i16 = displayMetrics2.heightPixels;
                        int i17 = displayMetrics2.widthPixels;
                        if (i16 == i14 && i17 == i15) {
                            int i18 = displayMetrics.widthPixels;
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            dimensionPixelSize = i18 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                        }
                        this.f13702n = dimensionPixelSize;
                        d10 = dimensionPixelSize / displayMetrics.density;
                        i10 = (int) d10;
                        if (d10 - i10 >= 0.01d) {
                        }
                    }
                }
            }
        } else {
            i10 = this.f13701m;
            sr srVar2 = o.f13771f.f13772a;
            this.f13702n = sr.i(displayMetrics, i10);
        }
        if (z13) {
            int i19 = (int) (displayMetrics.heightPixels / displayMetrics.density);
            i11 = i19 <= 400 ? 32 : i19 <= 720 ? 50 : 90;
        } else {
            i11 = this.f13698e;
        }
        sr srVar3 = o.f13771f.f13772a;
        this.f13699f = sr.i(displayMetrics, i11);
        if (z12 || z13) {
            str = i10 + "x" + i11 + "_as";
        } else if (z10 || z11) {
            str = this.f13701m + "x" + this.f13698e + "_as";
        } else {
            str = z7 ? "320x50_mb" : gVar.f2109c;
        }
        this.f13697b = str;
        int length = gVarArr.length;
        if (length > 1) {
            this.f13703t = new f3[length];
            for (int i20 = 0; i20 < gVarArr.length; i20++) {
                this.f13703t[i20] = new f3(context, gVarArr[i20]);
            }
        } else {
            this.f13703t = null;
        }
        this.f13704u = false;
        this.M = false;
    }

    public f3(String str, int i10, int i11, boolean z7, int i12, int i13, f3[] f3VarArr, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f13697b = str;
        this.f13698e = i10;
        this.f13699f = i11;
        this.f13700j = z7;
        this.f13701m = i12;
        this.f13702n = i13;
        this.f13703t = f3VarArr;
        this.f13704u = z10;
        this.f13705w = z11;
        this.M = z12;
        this.N = z13;
        this.O = z14;
        this.P = z15;
        this.Q = z16;
        this.R = z17;
    }
}