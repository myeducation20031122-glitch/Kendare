package p5;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.internal.ads.dq0;
import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p extends b5.a {
    public static final Parcelable.Creator<p> CREATOR = new x4.n(8);

    /* renamed from: b, reason: collision with root package name */
    public final int f15964b;

    /* renamed from: e, reason: collision with root package name */
    public final int f15965e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15966f;

    /* renamed from: j, reason: collision with root package name */
    public final String f15967j;

    /* renamed from: m, reason: collision with root package name */
    public final int f15968m;

    /* renamed from: n, reason: collision with root package name */
    public final String f15969n;

    /* renamed from: t, reason: collision with root package name */
    public final p f15970t;

    /* renamed from: u, reason: collision with root package name */
    public final z f15971u;

    static {
        Process.myUid();
        Process.myPid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(int i10, int i11, String str, String str2, String str3, int i12, List list, p pVar) {
        a0 a0Var;
        z zVar;
        this.f15964b = i10;
        this.f15965e = i11;
        this.f15966f = str;
        this.f15967j = str2;
        this.f15969n = str3;
        this.f15968m = i12;
        x xVar = z.f15997e;
        if (list instanceof w) {
            zVar = (z) ((w) list);
            zVar.getClass();
            if (zVar.l()) {
                Object[] array = zVar.toArray(w.f15992b);
                int length = array.length;
                if (length != 0) {
                    a0Var = new a0(array, length);
                    zVar = a0Var;
                }
                zVar = a0.f15938m;
            }
        } else {
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            for (int i13 = 0; i13 < length2; i13++) {
                if (array2[i13] == null) {
                    throw new NullPointerException(kc.r.d("at index ", i13));
                }
            }
            if (length2 != 0) {
                a0Var = new a0(array2, length2);
                zVar = a0Var;
            }
            zVar = a0.f15938m;
        }
        this.f15971u = zVar;
        this.f15970t = pVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f15964b == pVar.f15964b && this.f15965e == pVar.f15965e && this.f15968m == pVar.f15968m && this.f15966f.equals(pVar.f15966f) && dq0.m0(this.f15967j, pVar.f15967j) && dq0.m0(this.f15969n, pVar.f15969n) && dq0.m0(this.f15970t, pVar.f15970t) && this.f15971u.equals(pVar.f15971u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15964b), this.f15966f, this.f15967j, this.f15969n});
    }

    public final String toString() {
        String str = this.f15966f;
        int length = str.length() + 18;
        String str2 = this.f15967j;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(this.f15964b);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (str2.startsWith(str)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.f15969n;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f15964b);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f15965e);
        com.bumptech.glide.e.X(parcel, 3, this.f15966f);
        com.bumptech.glide.e.X(parcel, 4, this.f15967j);
        com.bumptech.glide.e.i0(parcel, 5, 4);
        parcel.writeInt(this.f15968m);
        com.bumptech.glide.e.X(parcel, 6, this.f15969n);
        com.bumptech.glide.e.W(parcel, 7, this.f15970t, i10);
        com.bumptech.glide.e.b0(parcel, 8, this.f15971u);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}