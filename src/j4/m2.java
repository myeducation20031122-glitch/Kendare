package j4;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.zr;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m2 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13765a;

    public /* synthetic */ m2(int i10) {
        this.f13765a = i10;
    }

    public static void a(a5.j jVar, Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        int i11 = jVar.f348b;
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(i11);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(jVar.f349e);
        com.bumptech.glide.e.i0(parcel, 3, 4);
        parcel.writeInt(jVar.f350f);
        com.bumptech.glide.e.X(parcel, 4, jVar.f351j);
        com.bumptech.glide.e.V(parcel, 5, jVar.f352m);
        com.bumptech.glide.e.a0(parcel, 6, jVar.f353n, i10);
        com.bumptech.glide.e.T(parcel, 7, jVar.f354t);
        com.bumptech.glide.e.W(parcel, 8, jVar.f355u, i10);
        com.bumptech.glide.e.a0(parcel, 10, jVar.f356w, i10);
        com.bumptech.glide.e.a0(parcel, 11, jVar.M, i10);
        com.bumptech.glide.e.i0(parcel, 12, 4);
        parcel.writeInt(jVar.N ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 13, 4);
        parcel.writeInt(jVar.O);
        boolean z7 = jVar.P;
        com.bumptech.glide.e.i0(parcel, 14, 4);
        parcel.writeInt(z7 ? 1 : 0);
        com.bumptech.glide.e.X(parcel, 15, jVar.Q);
        com.bumptech.glide.e.h0(parcel, iC0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iZ = 0;
        int iZ2 = 0;
        int iZ3 = 0;
        int iZ4 = 0;
        int iZ5 = 0;
        int iZ6 = 0;
        int iZ7 = 0;
        int iZ8 = 0;
        int iZ9 = 0;
        int iZ10 = 0;
        boolean zX = false;
        int iZ11 = 0;
        String strJ = null;
        Bundle bundleG = null;
        Account account = null;
        ArrayList arrayListN = null;
        String strJ2 = null;
        String strJ3 = null;
        String strJ4 = null;
        Intent intent = null;
        String strJ5 = null;
        String strJ6 = null;
        String strJ7 = null;
        String strJ8 = null;
        switch (this.f13765a) {
            case 0:
                int iH = com.bumptech.glide.d.H(parcel);
                int iZ12 = 0;
                while (parcel.dataPosition() < iH) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        iZ = com.bumptech.glide.d.z(parcel, i10);
                    } else if (c10 == 2) {
                        iZ12 = com.bumptech.glide.d.z(parcel, i10);
                    } else if (c10 != 3) {
                        com.bumptech.glide.d.E(parcel, i10);
                    } else {
                        strJ = com.bumptech.glide.d.j(parcel, i10);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH);
                return new l2(iZ, iZ12, strJ);
            case QueueFuseable.SYNC /* 1 */:
                int iH2 = com.bumptech.glide.d.H(parcel);
                String strJ9 = null;
                String strJ10 = null;
                e2 e2Var = null;
                IBinder iBinderY = null;
                int iZ13 = 0;
                while (parcel.dataPosition() < iH2) {
                    int i11 = parcel.readInt();
                    char c11 = (char) i11;
                    if (c11 == 1) {
                        iZ13 = com.bumptech.glide.d.z(parcel, i11);
                    } else if (c11 == 2) {
                        strJ9 = com.bumptech.glide.d.j(parcel, i11);
                    } else if (c11 == 3) {
                        strJ10 = com.bumptech.glide.d.j(parcel, i11);
                    } else if (c11 == 4) {
                        e2Var = (e2) com.bumptech.glide.d.i(parcel, i11, e2.CREATOR);
                    } else if (c11 != 5) {
                        com.bumptech.glide.d.E(parcel, i11);
                    } else {
                        iBinderY = com.bumptech.glide.d.y(parcel, i11);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH2);
                return new e2(iZ13, strJ9, strJ10, e2Var, iBinderY);
            case 2:
                int iH3 = com.bumptech.glide.d.H(parcel);
                int iZ14 = 0;
                while (parcel.dataPosition() < iH3) {
                    int i12 = parcel.readInt();
                    char c12 = (char) i12;
                    if (c12 == 1) {
                        iZ11 = com.bumptech.glide.d.z(parcel, i12);
                    } else if (c12 != 2) {
                        com.bumptech.glide.d.E(parcel, i12);
                    } else {
                        iZ14 = com.bumptech.glide.d.z(parcel, i12);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH3);
                return new w2(iZ11, iZ14);
            case 3:
                int iH4 = com.bumptech.glide.d.H(parcel);
                while (parcel.dataPosition() < iH4) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 15) {
                        com.bumptech.glide.d.E(parcel, i13);
                    } else {
                        strJ8 = com.bumptech.glide.d.j(parcel, i13);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH4);
                return new x2(strJ8);
            case 4:
                int iH5 = com.bumptech.glide.d.H(parcel);
                boolean zX2 = false;
                boolean zX3 = false;
                while (parcel.dataPosition() < iH5) {
                    int i14 = parcel.readInt();
                    char c13 = (char) i14;
                    if (c13 == 2) {
                        zX = com.bumptech.glide.d.x(parcel, i14);
                    } else if (c13 == 3) {
                        zX2 = com.bumptech.glide.d.x(parcel, i14);
                    } else if (c13 != 4) {
                        com.bumptech.glide.d.E(parcel, i14);
                    } else {
                        zX3 = com.bumptech.glide.d.x(parcel, i14);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH5);
                return new z2(zX, zX2, zX3);
            case y4.g.INVALID_ACCOUNT /* 5 */:
                int iH6 = com.bumptech.glide.d.H(parcel);
                long jA = 0;
                Bundle bundleG2 = null;
                ArrayList arrayListL = null;
                String strJ11 = null;
                x2 x2Var = null;
                Location location = null;
                String strJ12 = null;
                Bundle bundleG3 = null;
                Bundle bundleG4 = null;
                ArrayList arrayListL2 = null;
                String strJ13 = null;
                String strJ14 = null;
                n0 n0Var = null;
                String strJ15 = null;
                ArrayList arrayListL3 = null;
                String strJ16 = null;
                int iZ15 = 0;
                int iZ16 = 0;
                boolean zX4 = false;
                int iZ17 = 0;
                boolean zX5 = false;
                boolean zX6 = false;
                int iZ18 = 0;
                int iZ19 = 0;
                while (parcel.dataPosition() < iH6) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case QueueFuseable.SYNC /* 1 */:
                            iZ15 = com.bumptech.glide.d.z(parcel, i15);
                            break;
                        case 2:
                            jA = com.bumptech.glide.d.A(parcel, i15);
                            break;
                        case 3:
                            bundleG2 = com.bumptech.glide.d.g(parcel, i15);
                            break;
                        case 4:
                            iZ16 = com.bumptech.glide.d.z(parcel, i15);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            arrayListL = com.bumptech.glide.d.l(parcel, i15);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            zX4 = com.bumptech.glide.d.x(parcel, i15);
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                            iZ17 = com.bumptech.glide.d.z(parcel, i15);
                            break;
                        case '\b':
                            zX5 = com.bumptech.glide.d.x(parcel, i15);
                            break;
                        case '\t':
                            strJ11 = com.bumptech.glide.d.j(parcel, i15);
                            break;
                        case y4.g.DEVELOPER_ERROR /* 10 */:
                            x2Var = (x2) com.bumptech.glide.d.i(parcel, i15, x2.CREATOR);
                            break;
                        case 11:
                            location = (Location) com.bumptech.glide.d.i(parcel, i15, Location.CREATOR);
                            break;
                        case '\f':
                            strJ12 = com.bumptech.glide.d.j(parcel, i15);
                            break;
                        case y4.g.ERROR /* 13 */:
                            bundleG3 = com.bumptech.glide.d.g(parcel, i15);
                            break;
                        case y4.g.INTERRUPTED /* 14 */:
                            bundleG4 = com.bumptech.glide.d.g(parcel, i15);
                            break;
                        case y4.g.TIMEOUT /* 15 */:
                            arrayListL2 = com.bumptech.glide.d.l(parcel, i15);
                            break;
                        case y4.g.CANCELED /* 16 */:
                            strJ13 = com.bumptech.glide.d.j(parcel, i15);
                            break;
                        case y4.g.API_NOT_CONNECTED /* 17 */:
                            strJ14 = com.bumptech.glide.d.j(parcel, i15);
                            break;
                        case 18:
                            zX6 = com.bumptech.glide.d.x(parcel, i15);
                            break;
                        case y4.g.REMOTE_EXCEPTION /* 19 */:
                            n0Var = (n0) com.bumptech.glide.d.i(parcel, i15, n0.CREATOR);
                            break;
                        case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                            iZ18 = com.bumptech.glide.d.z(parcel, i15);
                            break;
                        case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            strJ15 = com.bumptech.glide.d.j(parcel, i15);
                            break;
                        case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                            arrayListL3 = com.bumptech.glide.d.l(parcel, i15);
                            break;
                        case 23:
                            iZ19 = com.bumptech.glide.d.z(parcel, i15);
                            break;
                        case 24:
                            strJ16 = com.bumptech.glide.d.j(parcel, i15);
                            break;
                        default:
                            com.bumptech.glide.d.E(parcel, i15);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH6);
                return new c3(iZ15, jA, bundleG2, iZ16, arrayListL, zX4, iZ17, zX5, strJ11, x2Var, location, strJ12, bundleG3, bundleG4, arrayListL2, strJ13, strJ14, zX6, n0Var, iZ18, strJ15, arrayListL3, iZ19, strJ16);
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                int iH7 = com.bumptech.glide.d.H(parcel);
                String strJ17 = null;
                f3[] f3VarArr = null;
                int iZ20 = 0;
                int iZ21 = 0;
                boolean zX7 = false;
                int iZ22 = 0;
                int iZ23 = 0;
                boolean zX8 = false;
                boolean zX9 = false;
                boolean zX10 = false;
                boolean zX11 = false;
                boolean zX12 = false;
                boolean zX13 = false;
                boolean zX14 = false;
                boolean zX15 = false;
                while (parcel.dataPosition() < iH7) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 2:
                            strJ17 = com.bumptech.glide.d.j(parcel, i16);
                            break;
                        case 3:
                            iZ20 = com.bumptech.glide.d.z(parcel, i16);
                            break;
                        case 4:
                            iZ21 = com.bumptech.glide.d.z(parcel, i16);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            zX7 = com.bumptech.glide.d.x(parcel, i16);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            iZ22 = com.bumptech.glide.d.z(parcel, i16);
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                            iZ23 = com.bumptech.glide.d.z(parcel, i16);
                            break;
                        case '\b':
                            f3VarArr = (f3[]) com.bumptech.glide.d.m(parcel, i16, f3.CREATOR);
                            break;
                        case '\t':
                            zX8 = com.bumptech.glide.d.x(parcel, i16);
                            break;
                        case y4.g.DEVELOPER_ERROR /* 10 */:
                            zX9 = com.bumptech.glide.d.x(parcel, i16);
                            break;
                        case 11:
                            zX10 = com.bumptech.glide.d.x(parcel, i16);
                            break;
                        case '\f':
                            zX11 = com.bumptech.glide.d.x(parcel, i16);
                            break;
                        case y4.g.ERROR /* 13 */:
                            zX12 = com.bumptech.glide.d.x(parcel, i16);
                            break;
                        case y4.g.INTERRUPTED /* 14 */:
                            zX13 = com.bumptech.glide.d.x(parcel, i16);
                            break;
                        case y4.g.TIMEOUT /* 15 */:
                            zX14 = com.bumptech.glide.d.x(parcel, i16);
                            break;
                        case y4.g.CANCELED /* 16 */:
                            zX15 = com.bumptech.glide.d.x(parcel, i16);
                            break;
                        default:
                            com.bumptech.glide.d.E(parcel, i16);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH7);
                return new f3(strJ17, iZ20, iZ21, zX7, iZ22, iZ23, f3VarArr, zX8, zX9, zX10, zX11, zX12, zX13, zX14, zX15);
            case y4.g.NETWORK_ERROR /* 7 */:
                int iH8 = com.bumptech.glide.d.H(parcel);
                long jA2 = 0;
                String strJ18 = null;
                int iZ24 = 0;
                int iZ25 = 0;
                while (parcel.dataPosition() < iH8) {
                    int i17 = parcel.readInt();
                    char c14 = (char) i17;
                    if (c14 == 1) {
                        iZ24 = com.bumptech.glide.d.z(parcel, i17);
                    } else if (c14 == 2) {
                        iZ25 = com.bumptech.glide.d.z(parcel, i17);
                    } else if (c14 == 3) {
                        strJ18 = com.bumptech.glide.d.j(parcel, i17);
                    } else if (c14 != 4) {
                        com.bumptech.glide.d.E(parcel, i17);
                    } else {
                        jA2 = com.bumptech.glide.d.A(parcel, i17);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH8);
                return new g3(iZ24, iZ25, jA2, strJ18);
            case 8:
                int iH9 = com.bumptech.glide.d.H(parcel);
                long jA3 = 0;
                String strJ19 = null;
                e2 e2Var2 = null;
                Bundle bundleG5 = null;
                String strJ20 = null;
                String strJ21 = null;
                String strJ22 = null;
                String strJ23 = null;
                while (parcel.dataPosition() < iH9) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case QueueFuseable.SYNC /* 1 */:
                            strJ19 = com.bumptech.glide.d.j(parcel, i18);
                            break;
                        case 2:
                            jA3 = com.bumptech.glide.d.A(parcel, i18);
                            break;
                        case 3:
                            e2Var2 = (e2) com.bumptech.glide.d.i(parcel, i18, e2.CREATOR);
                            break;
                        case 4:
                            bundleG5 = com.bumptech.glide.d.g(parcel, i18);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            strJ20 = com.bumptech.glide.d.j(parcel, i18);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            strJ21 = com.bumptech.glide.d.j(parcel, i18);
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                            strJ22 = com.bumptech.glide.d.j(parcel, i18);
                            break;
                        case '\b':
                            strJ23 = com.bumptech.glide.d.j(parcel, i18);
                            break;
                        default:
                            com.bumptech.glide.d.E(parcel, i18);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH9);
                return new h3(strJ19, jA3, e2Var2, bundleG5, strJ20, strJ21, strJ22, strJ23);
            case 9:
                int iH10 = com.bumptech.glide.d.H(parcel);
                while (parcel.dataPosition() < iH10) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 2) {
                        com.bumptech.glide.d.E(parcel, i19);
                    } else {
                        iZ10 = com.bumptech.glide.d.z(parcel, i19);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH10);
                return new i3(iZ10);
            case y4.g.DEVELOPER_ERROR /* 10 */:
                int iH11 = com.bumptech.glide.d.H(parcel);
                String strJ24 = null;
                String strJ25 = null;
                String strJ26 = null;
                String strJ27 = null;
                String strJ28 = null;
                String strJ29 = null;
                String strJ30 = null;
                Intent intent2 = null;
                IBinder iBinderY2 = null;
                boolean zX16 = false;
                while (parcel.dataPosition() < iH11) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 2:
                            strJ24 = com.bumptech.glide.d.j(parcel, i20);
                            break;
                        case 3:
                            strJ25 = com.bumptech.glide.d.j(parcel, i20);
                            break;
                        case 4:
                            strJ26 = com.bumptech.glide.d.j(parcel, i20);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            strJ27 = com.bumptech.glide.d.j(parcel, i20);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            strJ28 = com.bumptech.glide.d.j(parcel, i20);
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                            strJ29 = com.bumptech.glide.d.j(parcel, i20);
                            break;
                        case '\b':
                            strJ30 = com.bumptech.glide.d.j(parcel, i20);
                            break;
                        case '\t':
                            intent2 = (Intent) com.bumptech.glide.d.i(parcel, i20, Intent.CREATOR);
                            break;
                        case y4.g.DEVELOPER_ERROR /* 10 */:
                            iBinderY2 = com.bumptech.glide.d.y(parcel, i20);
                            break;
                        case 11:
                            zX16 = com.bumptech.glide.d.x(parcel, i20);
                            break;
                        default:
                            com.bumptech.glide.d.E(parcel, i20);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH11);
                return new k4.c(strJ24, strJ25, strJ26, strJ27, strJ28, strJ29, strJ30, intent2, iBinderY2, zX16);
            case 11:
                int iH12 = com.bumptech.glide.d.H(parcel);
                k4.c cVar = null;
                IBinder iBinderY3 = null;
                IBinder iBinderY4 = null;
                IBinder iBinderY5 = null;
                IBinder iBinderY6 = null;
                String strJ31 = null;
                String strJ32 = null;
                IBinder iBinderY7 = null;
                String strJ33 = null;
                zr zrVar = null;
                String strJ34 = null;
                i4.f fVar = null;
                IBinder iBinderY8 = null;
                String strJ35 = null;
                IBinder iBinderY9 = null;
                IBinder iBinderY10 = null;
                IBinder iBinderY11 = null;
                IBinder iBinderY12 = null;
                String strJ36 = null;
                String strJ37 = null;
                IBinder iBinderY13 = null;
                IBinder iBinderY14 = null;
                boolean zX17 = false;
                int iZ26 = 0;
                int iZ27 = 0;
                while (parcel.dataPosition() < iH12) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 2:
                            cVar = (k4.c) com.bumptech.glide.d.i(parcel, i21, k4.c.CREATOR);
                            break;
                        case 3:
                            iBinderY3 = com.bumptech.glide.d.y(parcel, i21);
                            break;
                        case 4:
                            iBinderY4 = com.bumptech.glide.d.y(parcel, i21);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            iBinderY5 = com.bumptech.glide.d.y(parcel, i21);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            iBinderY6 = com.bumptech.glide.d.y(parcel, i21);
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                            strJ31 = com.bumptech.glide.d.j(parcel, i21);
                            break;
                        case '\b':
                            zX17 = com.bumptech.glide.d.x(parcel, i21);
                            break;
                        case '\t':
                            strJ32 = com.bumptech.glide.d.j(parcel, i21);
                            break;
                        case y4.g.DEVELOPER_ERROR /* 10 */:
                            iBinderY7 = com.bumptech.glide.d.y(parcel, i21);
                            break;
                        case 11:
                            iZ26 = com.bumptech.glide.d.z(parcel, i21);
                            break;
                        case '\f':
                            iZ27 = com.bumptech.glide.d.z(parcel, i21);
                            break;
                        case y4.g.ERROR /* 13 */:
                            strJ33 = com.bumptech.glide.d.j(parcel, i21);
                            break;
                        case y4.g.INTERRUPTED /* 14 */:
                            zrVar = (zr) com.bumptech.glide.d.i(parcel, i21, zr.CREATOR);
                            break;
                        case y4.g.TIMEOUT /* 15 */:
                        default:
                            com.bumptech.glide.d.E(parcel, i21);
                            break;
                        case y4.g.CANCELED /* 16 */:
                            strJ34 = com.bumptech.glide.d.j(parcel, i21);
                            break;
                        case y4.g.API_NOT_CONNECTED /* 17 */:
                            fVar = (i4.f) com.bumptech.glide.d.i(parcel, i21, i4.f.CREATOR);
                            break;
                        case 18:
                            iBinderY8 = com.bumptech.glide.d.y(parcel, i21);
                            break;
                        case y4.g.REMOTE_EXCEPTION /* 19 */:
                            strJ35 = com.bumptech.glide.d.j(parcel, i21);
                            break;
                        case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                            iBinderY9 = com.bumptech.glide.d.y(parcel, i21);
                            break;
                        case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            iBinderY10 = com.bumptech.glide.d.y(parcel, i21);
                            break;
                        case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                            iBinderY11 = com.bumptech.glide.d.y(parcel, i21);
                            break;
                        case 23:
                            iBinderY12 = com.bumptech.glide.d.y(parcel, i21);
                            break;
                        case 24:
                            strJ36 = com.bumptech.glide.d.j(parcel, i21);
                            break;
                        case 25:
                            strJ37 = com.bumptech.glide.d.j(parcel, i21);
                            break;
                        case 26:
                            iBinderY13 = com.bumptech.glide.d.y(parcel, i21);
                            break;
                        case 27:
                            iBinderY14 = com.bumptech.glide.d.y(parcel, i21);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH12);
                return new AdOverlayInfoParcel(cVar, iBinderY3, iBinderY4, iBinderY5, iBinderY6, strJ31, zX17, strJ32, iBinderY7, iZ26, iZ27, strJ33, zrVar, strJ34, fVar, iBinderY8, strJ35, iBinderY9, iBinderY10, iBinderY11, iBinderY12, strJ36, strJ37, iBinderY13, iBinderY14);
            case 12:
                int iH13 = com.bumptech.glide.d.H(parcel);
                while (parcel.dataPosition() < iH13) {
                    int i22 = parcel.readInt();
                    char c15 = (char) i22;
                    if (c15 == 1) {
                        strJ7 = com.bumptech.glide.d.j(parcel, i22);
                    } else if (c15 != 2) {
                        com.bumptech.glide.d.E(parcel, i22);
                    } else {
                        iZ9 = com.bumptech.glide.d.z(parcel, i22);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH13);
                return new l4.o(strJ7, iZ9);
            case y4.g.ERROR /* 13 */:
                int iH14 = com.bumptech.glide.d.H(parcel);
                String strJ38 = null;
                boolean zX18 = false;
                boolean zX19 = false;
                boolean zX20 = false;
                float f10 = 0.0f;
                int iZ28 = 0;
                boolean zX21 = false;
                boolean zX22 = false;
                boolean zX23 = false;
                while (parcel.dataPosition() < iH14) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 2:
                            zX18 = com.bumptech.glide.d.x(parcel, i23);
                            break;
                        case 3:
                            zX19 = com.bumptech.glide.d.x(parcel, i23);
                            break;
                        case 4:
                            strJ38 = com.bumptech.glide.d.j(parcel, i23);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            zX20 = com.bumptech.glide.d.x(parcel, i23);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            com.bumptech.glide.d.V(parcel, i23, 4);
                            f10 = parcel.readFloat();
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                            iZ28 = com.bumptech.glide.d.z(parcel, i23);
                            break;
                        case '\b':
                            zX21 = com.bumptech.glide.d.x(parcel, i23);
                            break;
                        case '\t':
                            zX22 = com.bumptech.glide.d.x(parcel, i23);
                            break;
                        case y4.g.DEVELOPER_ERROR /* 10 */:
                            zX23 = com.bumptech.glide.d.x(parcel, i23);
                            break;
                        default:
                            com.bumptech.glide.d.E(parcel, i23);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH14);
                return new i4.f(zX18, zX19, strJ38, zX20, f10, iZ28, zX21, zX22, zX23);
            case y4.g.INTERRUPTED /* 14 */:
                int iH15 = com.bumptech.glide.d.H(parcel);
                String strJ39 = null;
                while (parcel.dataPosition() < iH15) {
                    int i24 = parcel.readInt();
                    char c16 = (char) i24;
                    if (c16 == 1) {
                        strJ6 = com.bumptech.glide.d.j(parcel, i24);
                    } else if (c16 != 2) {
                        com.bumptech.glide.d.E(parcel, i24);
                    } else {
                        strJ39 = com.bumptech.glide.d.j(parcel, i24);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH15);
                return new u4.c(strJ6, strJ39);
            case y4.g.TIMEOUT /* 15 */:
                int iH16 = com.bumptech.glide.d.H(parcel);
                while (parcel.dataPosition() < iH16) {
                    int i25 = parcel.readInt();
                    char c17 = (char) i25;
                    if (c17 == 1) {
                        strJ5 = com.bumptech.glide.d.j(parcel, i25);
                    } else if (c17 != 2) {
                        com.bumptech.glide.d.E(parcel, i25);
                    } else {
                        iZ8 = com.bumptech.glide.d.z(parcel, i25);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH16);
                return new u4.d(strJ5, iZ8);
            case y4.g.CANCELED /* 16 */:
                int iH17 = com.bumptech.glide.d.H(parcel);
                long jA4 = 0;
                String strJ40 = null;
                String strJ41 = null;
                String strJ42 = null;
                String strJ43 = null;
                Uri uri = null;
                String strJ44 = null;
                String strJ45 = null;
                ArrayList arrayListN2 = null;
                String strJ46 = null;
                String strJ47 = null;
                int iZ29 = 0;
                while (parcel.dataPosition() < iH17) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case QueueFuseable.SYNC /* 1 */:
                            iZ29 = com.bumptech.glide.d.z(parcel, i26);
                            break;
                        case 2:
                            strJ40 = com.bumptech.glide.d.j(parcel, i26);
                            break;
                        case 3:
                            strJ41 = com.bumptech.glide.d.j(parcel, i26);
                            break;
                        case 4:
                            strJ42 = com.bumptech.glide.d.j(parcel, i26);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            strJ43 = com.bumptech.glide.d.j(parcel, i26);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            uri = (Uri) com.bumptech.glide.d.i(parcel, i26, Uri.CREATOR);
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                            strJ44 = com.bumptech.glide.d.j(parcel, i26);
                            break;
                        case '\b':
                            jA4 = com.bumptech.glide.d.A(parcel, i26);
                            break;
                        case '\t':
                            strJ45 = com.bumptech.glide.d.j(parcel, i26);
                            break;
                        case y4.g.DEVELOPER_ERROR /* 10 */:
                            arrayListN2 = com.bumptech.glide.d.n(parcel, i26, Scope.CREATOR);
                            break;
                        case 11:
                            strJ46 = com.bumptech.glide.d.j(parcel, i26);
                            break;
                        case '\f':
                            strJ47 = com.bumptech.glide.d.j(parcel, i26);
                            break;
                        default:
                            com.bumptech.glide.d.E(parcel, i26);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH17);
                return new GoogleSignInAccount(iZ29, strJ40, strJ41, strJ42, strJ43, uri, strJ44, jA4, strJ45, arrayListN2, strJ46, strJ47);
            case y4.g.API_NOT_CONNECTED /* 17 */:
                int iH18 = com.bumptech.glide.d.H(parcel);
                while (parcel.dataPosition() < iH18) {
                    int i27 = parcel.readInt();
                    if (((char) i27) != 1) {
                        com.bumptech.glide.d.E(parcel, i27);
                    } else {
                        intent = (Intent) com.bumptech.glide.d.i(parcel, i27, Intent.CREATOR);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH18);
                return new w4.a(intent);
            case 18:
                return new w4.e(parcel.readStrongBinder());
            case y4.g.REMOTE_EXCEPTION /* 19 */:
                int iH19 = com.bumptech.glide.d.H(parcel);
                while (parcel.dataPosition() < iH19) {
                    int i28 = parcel.readInt();
                    char c18 = (char) i28;
                    if (c18 == 1) {
                        iZ7 = com.bumptech.glide.d.z(parcel, i28);
                    } else if (c18 != 2) {
                        com.bumptech.glide.d.E(parcel, i28);
                    } else {
                        strJ4 = com.bumptech.glide.d.j(parcel, i28);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH19);
                return new Scope(iZ7, strJ4);
            case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                int iH20 = com.bumptech.glide.d.H(parcel);
                PendingIntent pendingIntent = null;
                x4.b bVar = null;
                while (parcel.dataPosition() < iH20) {
                    int i29 = parcel.readInt();
                    char c19 = (char) i29;
                    if (c19 == 1) {
                        iZ6 = com.bumptech.glide.d.z(parcel, i29);
                    } else if (c19 == 2) {
                        strJ3 = com.bumptech.glide.d.j(parcel, i29);
                    } else if (c19 == 3) {
                        pendingIntent = (PendingIntent) com.bumptech.glide.d.i(parcel, i29, PendingIntent.CREATOR);
                    } else if (c19 != 4) {
                        com.bumptech.glide.d.E(parcel, i29);
                    } else {
                        bVar = (x4.b) com.bumptech.glide.d.i(parcel, i29, x4.b.CREATOR);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH20);
                return new Status(iZ6, strJ3, pendingIntent, bVar);
            case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                int iH21 = com.bumptech.glide.d.H(parcel);
                while (parcel.dataPosition() < iH21) {
                    int i30 = parcel.readInt();
                    char c20 = (char) i30;
                    if (c20 == 1) {
                        iZ5 = com.bumptech.glide.d.z(parcel, i30);
                    } else if (c20 != 2) {
                        com.bumptech.glide.d.E(parcel, i30);
                    } else {
                        strJ2 = com.bumptech.glide.d.j(parcel, i30);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH21);
                return new a5.g(iZ5, strJ2);
            case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                int iH22 = com.bumptech.glide.d.H(parcel);
                while (parcel.dataPosition() < iH22) {
                    int i31 = parcel.readInt();
                    char c21 = (char) i31;
                    if (c21 == 1) {
                        iZ4 = com.bumptech.glide.d.z(parcel, i31);
                    } else if (c21 != 2) {
                        com.bumptech.glide.d.E(parcel, i31);
                    } else {
                        arrayListN = com.bumptech.glide.d.n(parcel, i31, a5.o.CREATOR);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH22);
                return new a5.r(iZ4, arrayListN);
            case 23:
                int iH23 = com.bumptech.glide.d.H(parcel);
                long jA5 = 0;
                long jA6 = 0;
                String strJ48 = null;
                String strJ49 = null;
                int iZ30 = 0;
                int iZ31 = 0;
                int iZ32 = 0;
                int iZ33 = 0;
                int iZ34 = -1;
                while (parcel.dataPosition() < iH23) {
                    int i32 = parcel.readInt();
                    switch ((char) i32) {
                        case QueueFuseable.SYNC /* 1 */:
                            iZ30 = com.bumptech.glide.d.z(parcel, i32);
                            break;
                        case 2:
                            iZ31 = com.bumptech.glide.d.z(parcel, i32);
                            break;
                        case 3:
                            iZ32 = com.bumptech.glide.d.z(parcel, i32);
                            break;
                        case 4:
                            jA5 = com.bumptech.glide.d.A(parcel, i32);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            jA6 = com.bumptech.glide.d.A(parcel, i32);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            strJ48 = com.bumptech.glide.d.j(parcel, i32);
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                            strJ49 = com.bumptech.glide.d.j(parcel, i32);
                            break;
                        case '\b':
                            iZ33 = com.bumptech.glide.d.z(parcel, i32);
                            break;
                        case '\t':
                            iZ34 = com.bumptech.glide.d.z(parcel, i32);
                            break;
                        default:
                            com.bumptech.glide.d.E(parcel, i32);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH23);
                return new a5.o(iZ30, iZ31, iZ32, jA5, jA6, strJ48, strJ49, iZ33, iZ34);
            case 24:
                int iH24 = com.bumptech.glide.d.H(parcel);
                GoogleSignInAccount googleSignInAccount = null;
                int iZ35 = 0;
                while (parcel.dataPosition() < iH24) {
                    int i33 = parcel.readInt();
                    char c22 = (char) i33;
                    if (c22 == 1) {
                        iZ3 = com.bumptech.glide.d.z(parcel, i33);
                    } else if (c22 == 2) {
                        account = (Account) com.bumptech.glide.d.i(parcel, i33, Account.CREATOR);
                    } else if (c22 == 3) {
                        iZ35 = com.bumptech.glide.d.z(parcel, i33);
                    } else if (c22 != 4) {
                        com.bumptech.glide.d.E(parcel, i33);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) com.bumptech.glide.d.i(parcel, i33, GoogleSignInAccount.CREATOR);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH24);
                return new a5.a0(iZ3, account, iZ35, googleSignInAccount);
            case 25:
                int iH25 = com.bumptech.glide.d.H(parcel);
                IBinder iBinderY15 = null;
                x4.b bVar2 = null;
                int iZ36 = 0;
                boolean zX24 = false;
                boolean zX25 = false;
                while (parcel.dataPosition() < iH25) {
                    int i34 = parcel.readInt();
                    char c23 = (char) i34;
                    if (c23 == 1) {
                        iZ36 = com.bumptech.glide.d.z(parcel, i34);
                    } else if (c23 == 2) {
                        iBinderY15 = com.bumptech.glide.d.y(parcel, i34);
                    } else if (c23 == 3) {
                        bVar2 = (x4.b) com.bumptech.glide.d.i(parcel, i34, x4.b.CREATOR);
                    } else if (c23 == 4) {
                        zX24 = com.bumptech.glide.d.x(parcel, i34);
                    } else if (c23 != 5) {
                        com.bumptech.glide.d.E(parcel, i34);
                    } else {
                        zX25 = com.bumptech.glide.d.x(parcel, i34);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH25);
                return new a5.b0(iZ36, iBinderY15, bVar2, zX24, zX25);
            case 26:
                int iH26 = com.bumptech.glide.d.H(parcel);
                int iZ37 = 0;
                boolean zX26 = false;
                boolean zX27 = false;
                int iZ38 = 0;
                int iZ39 = 0;
                while (parcel.dataPosition() < iH26) {
                    int i35 = parcel.readInt();
                    char c24 = (char) i35;
                    if (c24 == 1) {
                        iZ37 = com.bumptech.glide.d.z(parcel, i35);
                    } else if (c24 == 2) {
                        zX26 = com.bumptech.glide.d.x(parcel, i35);
                    } else if (c24 == 3) {
                        zX27 = com.bumptech.glide.d.x(parcel, i35);
                    } else if (c24 == 4) {
                        iZ38 = com.bumptech.glide.d.z(parcel, i35);
                    } else if (c24 != 5) {
                        com.bumptech.glide.d.E(parcel, i35);
                    } else {
                        iZ39 = com.bumptech.glide.d.z(parcel, i35);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH26);
                return new a5.q(iZ37, zX26, zX27, iZ38, iZ39);
            case 27:
                int iH27 = com.bumptech.glide.d.H(parcel);
                x4.d[] dVarArr = null;
                a5.i iVar = null;
                while (parcel.dataPosition() < iH27) {
                    int i36 = parcel.readInt();
                    char c25 = (char) i36;
                    if (c25 == 1) {
                        bundleG = com.bumptech.glide.d.g(parcel, i36);
                    } else if (c25 == 2) {
                        dVarArr = (x4.d[]) com.bumptech.glide.d.m(parcel, i36, x4.d.CREATOR);
                    } else if (c25 == 3) {
                        iZ2 = com.bumptech.glide.d.z(parcel, i36);
                    } else if (c25 != 4) {
                        com.bumptech.glide.d.E(parcel, i36);
                    } else {
                        iVar = (a5.i) com.bumptech.glide.d.i(parcel, i36, a5.i.CREATOR);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH27);
                a5.o0 o0Var = new a5.o0();
                o0Var.f377b = bundleG;
                o0Var.f378e = dVarArr;
                o0Var.f379f = iZ2;
                o0Var.f380j = iVar;
                return o0Var;
            case 28:
                int iH28 = com.bumptech.glide.d.H(parcel);
                a5.q qVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean zX28 = false;
                boolean zX29 = false;
                int iZ40 = 0;
                while (parcel.dataPosition() < iH28) {
                    int i37 = parcel.readInt();
                    switch ((char) i37) {
                        case QueueFuseable.SYNC /* 1 */:
                            qVar = (a5.q) com.bumptech.glide.d.i(parcel, i37, a5.q.CREATOR);
                            break;
                        case 2:
                            zX28 = com.bumptech.glide.d.x(parcel, i37);
                            break;
                        case 3:
                            zX29 = com.bumptech.glide.d.x(parcel, i37);
                            break;
                        case 4:
                            int iB = com.bumptech.glide.d.B(parcel, i37);
                            int iDataPosition = parcel.dataPosition();
                            if (iB != 0) {
                                int[] iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition + iB);
                                iArr = iArrCreateIntArray;
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            iZ40 = com.bumptech.glide.d.z(parcel, i37);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            int iB2 = com.bumptech.glide.d.B(parcel, i37);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iB2 != 0) {
                                int[] iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iB2);
                                iArr2 = iArrCreateIntArray2;
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            com.bumptech.glide.d.E(parcel, i37);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH28);
                return new a5.i(qVar, zX28, zX29, iArr, iZ40, iArr2);
            default:
                int iH29 = com.bumptech.glide.d.H(parcel);
                Scope[] scopeArr = a5.j.R;
                Bundle bundle = new Bundle();
                x4.d[] dVarArr2 = a5.j.S;
                x4.d[] dVarArr3 = dVarArr2;
                String strJ50 = null;
                IBinder iBinderY16 = null;
                Account account2 = null;
                String strJ51 = null;
                int iZ41 = 0;
                int iZ42 = 0;
                int iZ43 = 0;
                boolean zX30 = false;
                int iZ44 = 0;
                boolean zX31 = false;
                while (parcel.dataPosition() < iH29) {
                    int i38 = parcel.readInt();
                    switch ((char) i38) {
                        case QueueFuseable.SYNC /* 1 */:
                            iZ41 = com.bumptech.glide.d.z(parcel, i38);
                            break;
                        case 2:
                            iZ42 = com.bumptech.glide.d.z(parcel, i38);
                            break;
                        case 3:
                            iZ43 = com.bumptech.glide.d.z(parcel, i38);
                            break;
                        case 4:
                            strJ50 = com.bumptech.glide.d.j(parcel, i38);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            iBinderY16 = com.bumptech.glide.d.y(parcel, i38);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            scopeArr = (Scope[]) com.bumptech.glide.d.m(parcel, i38, Scope.CREATOR);
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                            bundle = com.bumptech.glide.d.g(parcel, i38);
                            break;
                        case '\b':
                            account2 = (Account) com.bumptech.glide.d.i(parcel, i38, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            com.bumptech.glide.d.E(parcel, i38);
                            break;
                        case y4.g.DEVELOPER_ERROR /* 10 */:
                            dVarArr2 = (x4.d[]) com.bumptech.glide.d.m(parcel, i38, x4.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (x4.d[]) com.bumptech.glide.d.m(parcel, i38, x4.d.CREATOR);
                            break;
                        case '\f':
                            zX30 = com.bumptech.glide.d.x(parcel, i38);
                            break;
                        case y4.g.ERROR /* 13 */:
                            iZ44 = com.bumptech.glide.d.z(parcel, i38);
                            break;
                        case y4.g.INTERRUPTED /* 14 */:
                            zX31 = com.bumptech.glide.d.x(parcel, i38);
                            break;
                        case y4.g.TIMEOUT /* 15 */:
                            strJ51 = com.bumptech.glide.d.j(parcel, i38);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH29);
                return new a5.j(iZ41, iZ42, iZ43, strJ50, iBinderY16, scopeArr, bundle, account2, dVarArr2, dVarArr3, zX30, iZ44, zX31, strJ51);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f13765a) {
            case 0:
                return new l2[i10];
            case QueueFuseable.SYNC /* 1 */:
                return new e2[i10];
            case 2:
                return new w2[i10];
            case 3:
                return new x2[i10];
            case 4:
                return new z2[i10];
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return new c3[i10];
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                return new f3[i10];
            case y4.g.NETWORK_ERROR /* 7 */:
                return new g3[i10];
            case 8:
                return new h3[i10];
            case 9:
                return new i3[i10];
            case y4.g.DEVELOPER_ERROR /* 10 */:
                return new k4.c[i10];
            case 11:
                return new AdOverlayInfoParcel[i10];
            case 12:
                return new l4.o[i10];
            case y4.g.ERROR /* 13 */:
                return new i4.f[i10];
            case y4.g.INTERRUPTED /* 14 */:
                return new u4.c[i10];
            case y4.g.TIMEOUT /* 15 */:
                return new u4.d[i10];
            case y4.g.CANCELED /* 16 */:
                return new GoogleSignInAccount[i10];
            case y4.g.API_NOT_CONNECTED /* 17 */:
                return new w4.a[i10];
            case 18:
                return new w4.e[i10];
            case y4.g.REMOTE_EXCEPTION /* 19 */:
                return new Scope[i10];
            case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                return new Status[i10];
            case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new a5.g[i10];
            case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                return new a5.r[i10];
            case 23:
                return new a5.o[i10];
            case 24:
                return new a5.a0[i10];
            case 25:
                return new a5.b0[i10];
            case 26:
                return new a5.q[i10];
            case 27:
                return new a5.o0[i10];
            case 28:
                return new a5.i[i10];
            default:
                return new a5.j[i10];
        }
    }
}