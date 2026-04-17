package x4;

import a5.b0;
import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p5.a0;
import p5.d0;
import t5.d6;
import t5.y5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18975a;

    public /* synthetic */ n(int i10) {
        this.f18975a = i10;
    }

    public static void a(t5.q qVar, Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.X(parcel, 2, qVar.f17558b);
        com.bumptech.glide.e.W(parcel, 3, qVar.f17559e, i10);
        com.bumptech.glide.e.X(parcel, 4, qVar.f17560f);
        com.bumptech.glide.e.i0(parcel, 5, 8);
        parcel.writeLong(qVar.f17561j);
        com.bumptech.glide.e.h0(parcel, iC0);
    }

    public static void b(y5 y5Var, Parcel parcel) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        int i10 = y5Var.f17696b;
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(i10);
        com.bumptech.glide.e.X(parcel, 2, y5Var.f17697e);
        com.bumptech.glide.e.i0(parcel, 3, 8);
        parcel.writeLong(y5Var.f17698f);
        Long l10 = y5Var.f17699j;
        if (l10 != null) {
            com.bumptech.glide.e.i0(parcel, 4, 8);
            parcel.writeLong(l10.longValue());
        }
        com.bumptech.glide.e.X(parcel, 6, y5Var.f17700m);
        com.bumptech.glide.e.X(parcel, 7, y5Var.f17701n);
        Double d10 = y5Var.f17702t;
        if (d10 != null) {
            com.bumptech.glide.e.i0(parcel, 8, 8);
            parcel.writeDouble(d10.doubleValue());
        }
        com.bumptech.glide.e.h0(parcel, iC0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long jA = -1;
        switch (this.f18975a) {
            case 0:
                int iH = com.bumptech.glide.d.H(parcel);
                PendingIntent pendingIntent = null;
                String strJ = null;
                int iZ = 0;
                int iZ2 = 0;
                while (parcel.dataPosition() < iH) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        iZ = com.bumptech.glide.d.z(parcel, i10);
                    } else if (c10 == 2) {
                        iZ2 = com.bumptech.glide.d.z(parcel, i10);
                    } else if (c10 == 3) {
                        pendingIntent = (PendingIntent) com.bumptech.glide.d.i(parcel, i10, PendingIntent.CREATOR);
                    } else if (c10 != 4) {
                        com.bumptech.glide.d.E(parcel, i10);
                    } else {
                        strJ = com.bumptech.glide.d.j(parcel, i10);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH);
                return new b(iZ, iZ2, pendingIntent, strJ);
            case QueueFuseable.SYNC /* 1 */:
                int iH2 = com.bumptech.glide.d.H(parcel);
                String strJ2 = null;
                int iZ3 = 0;
                while (parcel.dataPosition() < iH2) {
                    int i11 = parcel.readInt();
                    char c11 = (char) i11;
                    if (c11 == 1) {
                        strJ2 = com.bumptech.glide.d.j(parcel, i11);
                    } else if (c11 == 2) {
                        iZ3 = com.bumptech.glide.d.z(parcel, i11);
                    } else if (c11 != 3) {
                        com.bumptech.glide.d.E(parcel, i11);
                    } else {
                        jA = com.bumptech.glide.d.A(parcel, i11);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH2);
                return new d(iZ3, strJ2, jA);
            case 2:
                int iH3 = com.bumptech.glide.d.H(parcel);
                String strJ3 = null;
                IBinder iBinderY = null;
                boolean zX = false;
                boolean zX2 = false;
                boolean zX3 = false;
                boolean zX4 = false;
                while (parcel.dataPosition() < iH3) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case QueueFuseable.SYNC /* 1 */:
                            strJ3 = com.bumptech.glide.d.j(parcel, i12);
                            break;
                        case 2:
                            zX = com.bumptech.glide.d.x(parcel, i12);
                            break;
                        case 3:
                            zX2 = com.bumptech.glide.d.x(parcel, i12);
                            break;
                        case 4:
                            iBinderY = com.bumptech.glide.d.y(parcel, i12);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            zX3 = com.bumptech.glide.d.x(parcel, i12);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            zX4 = com.bumptech.glide.d.x(parcel, i12);
                            break;
                        default:
                            com.bumptech.glide.d.E(parcel, i12);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH3);
                return new v(strJ3, zX, zX2, iBinderY, zX3, zX4);
            case 3:
                int iH4 = com.bumptech.glide.d.H(parcel);
                String strJ4 = null;
                boolean zX5 = false;
                int iZ4 = 0;
                int iZ5 = 0;
                while (parcel.dataPosition() < iH4) {
                    int i13 = parcel.readInt();
                    char c12 = (char) i13;
                    if (c12 == 1) {
                        zX5 = com.bumptech.glide.d.x(parcel, i13);
                    } else if (c12 == 2) {
                        strJ4 = com.bumptech.glide.d.j(parcel, i13);
                    } else if (c12 == 3) {
                        iZ4 = com.bumptech.glide.d.z(parcel, i13);
                    } else if (c12 != 4) {
                        com.bumptech.glide.d.E(parcel, i13);
                    } else {
                        iZ5 = com.bumptech.glide.d.z(parcel, i13);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH4);
                return new w(strJ4, iZ4, iZ5, zX5);
            case 4:
                int iH5 = com.bumptech.glide.d.H(parcel);
                String strJ5 = null;
                IBinder iBinderY2 = null;
                boolean zX6 = false;
                boolean zX7 = false;
                while (parcel.dataPosition() < iH5) {
                    int i14 = parcel.readInt();
                    char c13 = (char) i14;
                    if (c13 == 1) {
                        strJ5 = com.bumptech.glide.d.j(parcel, i14);
                    } else if (c13 == 2) {
                        iBinderY2 = com.bumptech.glide.d.y(parcel, i14);
                    } else if (c13 == 3) {
                        zX6 = com.bumptech.glide.d.x(parcel, i14);
                    } else if (c13 != 4) {
                        com.bumptech.glide.d.E(parcel, i14);
                    } else {
                        zX7 = com.bumptech.glide.d.x(parcel, i14);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH5);
                return new x(strJ5, iBinderY2, zX6, zX7);
            case y4.g.INVALID_ACCOUNT /* 5 */:
                int iH6 = com.bumptech.glide.d.H(parcel);
                IBinder iBinderY3 = null;
                IBinder iBinderY4 = null;
                PendingIntent pendingIntent2 = null;
                String strJ6 = null;
                String strJ7 = null;
                int iZ6 = 0;
                while (parcel.dataPosition() < iH6) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case QueueFuseable.SYNC /* 1 */:
                            iZ6 = com.bumptech.glide.d.z(parcel, i15);
                            break;
                        case 2:
                            iBinderY3 = com.bumptech.glide.d.y(parcel, i15);
                            break;
                        case 3:
                            iBinderY4 = com.bumptech.glide.d.y(parcel, i15);
                            break;
                        case 4:
                            pendingIntent2 = (PendingIntent) com.bumptech.glide.d.i(parcel, i15, PendingIntent.CREATOR);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            strJ6 = com.bumptech.glide.d.j(parcel, i15);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            strJ7 = com.bumptech.glide.d.j(parcel, i15);
                            break;
                        default:
                            com.bumptech.glide.d.E(parcel, i15);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH6);
                return new p5.r(iZ6, iBinderY3, iBinderY4, pendingIntent2, strJ6, strJ7);
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                int iH7 = com.bumptech.glide.d.H(parcel);
                long jA2 = Long.MAX_VALUE;
                LocationRequest locationRequest = null;
                ArrayList arrayListN = null;
                String strJ8 = null;
                String strJ9 = null;
                boolean zX8 = false;
                boolean zX9 = false;
                boolean zX10 = false;
                boolean zX11 = false;
                while (parcel.dataPosition() < iH7) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 1) {
                        locationRequest = (LocationRequest) com.bumptech.glide.d.i(parcel, i16, LocationRequest.CREATOR);
                    } else if (c14 != 5) {
                        switch (c14) {
                            case '\b':
                                zX8 = com.bumptech.glide.d.x(parcel, i16);
                                break;
                            case '\t':
                                zX9 = com.bumptech.glide.d.x(parcel, i16);
                                break;
                            case y4.g.DEVELOPER_ERROR /* 10 */:
                                strJ8 = com.bumptech.glide.d.j(parcel, i16);
                                break;
                            case 11:
                                zX10 = com.bumptech.glide.d.x(parcel, i16);
                                break;
                            case '\f':
                                zX11 = com.bumptech.glide.d.x(parcel, i16);
                                break;
                            case y4.g.ERROR /* 13 */:
                                strJ9 = com.bumptech.glide.d.j(parcel, i16);
                                break;
                            case y4.g.INTERRUPTED /* 14 */:
                                jA2 = com.bumptech.glide.d.A(parcel, i16);
                                break;
                            default:
                                com.bumptech.glide.d.E(parcel, i16);
                                break;
                        }
                    } else {
                        arrayListN = com.bumptech.glide.d.n(parcel, i16, a5.g.CREATOR);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH7);
                return new p5.s(locationRequest, arrayListN, zX8, zX9, strJ8, zX10, zX11, strJ9, jA2);
            case y4.g.NETWORK_ERROR /* 7 */:
                int iH8 = com.bumptech.glide.d.H(parcel);
                p5.s sVar = null;
                IBinder iBinderY5 = null;
                IBinder iBinderY6 = null;
                PendingIntent pendingIntent3 = null;
                IBinder iBinderY7 = null;
                String strJ10 = null;
                int iZ7 = 1;
                while (parcel.dataPosition() < iH8) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case QueueFuseable.SYNC /* 1 */:
                            iZ7 = com.bumptech.glide.d.z(parcel, i17);
                            break;
                        case 2:
                            sVar = (p5.s) com.bumptech.glide.d.i(parcel, i17, p5.s.CREATOR);
                            break;
                        case 3:
                            iBinderY5 = com.bumptech.glide.d.y(parcel, i17);
                            break;
                        case 4:
                            pendingIntent3 = (PendingIntent) com.bumptech.glide.d.i(parcel, i17, PendingIntent.CREATOR);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            iBinderY6 = com.bumptech.glide.d.y(parcel, i17);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            iBinderY7 = com.bumptech.glide.d.y(parcel, i17);
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                        default:
                            com.bumptech.glide.d.E(parcel, i17);
                            break;
                        case '\b':
                            strJ10 = com.bumptech.glide.d.j(parcel, i17);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH8);
                return new p5.t(iZ7, sVar, iBinderY5, iBinderY6, pendingIntent3, iBinderY7, strJ10);
            case 8:
                int iH9 = com.bumptech.glide.d.H(parcel);
                p5.x xVar = p5.z.f15997e;
                List listN = a0.f15938m;
                String strJ11 = null;
                String strJ12 = null;
                String strJ13 = null;
                p5.p pVar = null;
                int iZ8 = 0;
                int iZ9 = 0;
                int iZ10 = 0;
                while (parcel.dataPosition() < iH9) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case QueueFuseable.SYNC /* 1 */:
                            iZ8 = com.bumptech.glide.d.z(parcel, i18);
                            break;
                        case 2:
                            iZ9 = com.bumptech.glide.d.z(parcel, i18);
                            break;
                        case 3:
                            strJ11 = com.bumptech.glide.d.j(parcel, i18);
                            break;
                        case 4:
                            strJ12 = com.bumptech.glide.d.j(parcel, i18);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            iZ10 = com.bumptech.glide.d.z(parcel, i18);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            strJ13 = com.bumptech.glide.d.j(parcel, i18);
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                            pVar = (p5.p) com.bumptech.glide.d.i(parcel, i18, p5.p.CREATOR);
                            break;
                        case '\b':
                            listN = com.bumptech.glide.d.n(parcel, i18, d.CREATOR);
                            break;
                        default:
                            com.bumptech.glide.d.E(parcel, i18);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH9);
                return new p5.p(iZ8, iZ9, strJ11, strJ12, strJ13, iZ10, listN, pVar);
            case 9:
                int iH10 = com.bumptech.glide.d.H(parcel);
                Status status = null;
                while (parcel.dataPosition() < iH10) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        com.bumptech.glide.d.E(parcel, i19);
                    } else {
                        status = (Status) com.bumptech.glide.d.i(parcel, i19, Status.CREATOR);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH10);
                return new d0(status);
            case y4.g.DEVELOPER_ERROR /* 10 */:
                int iH11 = com.bumptech.glide.d.H(parcel);
                long jA3 = -1;
                long jA4 = -1;
                int iZ11 = 1;
                int iZ12 = 1;
                while (parcel.dataPosition() < iH11) {
                    int i20 = parcel.readInt();
                    char c15 = (char) i20;
                    if (c15 == 1) {
                        iZ11 = com.bumptech.glide.d.z(parcel, i20);
                    } else if (c15 == 2) {
                        iZ12 = com.bumptech.glide.d.z(parcel, i20);
                    } else if (c15 == 3) {
                        jA3 = com.bumptech.glide.d.A(parcel, i20);
                    } else if (c15 != 4) {
                        com.bumptech.glide.d.E(parcel, i20);
                    } else {
                        jA4 = com.bumptech.glide.d.A(parcel, i20);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH11);
                return new r5.f(iZ11, iZ12, jA3, jA4);
            case 11:
                int iH12 = com.bumptech.glide.d.H(parcel);
                WorkSource workSource = new WorkSource();
                long jA5 = Long.MAX_VALUE;
                long jA6 = Long.MAX_VALUE;
                String strJ14 = null;
                p5.p pVar2 = null;
                int iZ13 = 0;
                int iZ14 = 102;
                boolean zX12 = false;
                int iZ15 = 0;
                while (parcel.dataPosition() < iH12) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case QueueFuseable.SYNC /* 1 */:
                            jA5 = com.bumptech.glide.d.A(parcel, i21);
                            break;
                        case 2:
                            iZ13 = com.bumptech.glide.d.z(parcel, i21);
                            break;
                        case 3:
                            iZ14 = com.bumptech.glide.d.z(parcel, i21);
                            break;
                        case 4:
                            jA6 = com.bumptech.glide.d.A(parcel, i21);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            zX12 = com.bumptech.glide.d.x(parcel, i21);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            workSource = (WorkSource) com.bumptech.glide.d.i(parcel, i21, WorkSource.CREATOR);
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                            iZ15 = com.bumptech.glide.d.z(parcel, i21);
                            break;
                        case '\b':
                            strJ14 = com.bumptech.glide.d.j(parcel, i21);
                            break;
                        case '\t':
                            pVar2 = (p5.p) com.bumptech.glide.d.i(parcel, i21, p5.p.CREATOR);
                            break;
                        default:
                            com.bumptech.glide.d.E(parcel, i21);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH12);
                return new r5.a(jA5, iZ13, iZ14, jA6, zX12, iZ15, strJ14, workSource, pVar2);
            case 12:
                int iH13 = com.bumptech.glide.d.H(parcel);
                long jA7 = Long.MAX_VALUE;
                String strJ15 = null;
                p5.p pVar3 = null;
                int iZ16 = 0;
                boolean zX13 = false;
                while (parcel.dataPosition() < iH13) {
                    int i22 = parcel.readInt();
                    char c16 = (char) i22;
                    if (c16 == 1) {
                        jA7 = com.bumptech.glide.d.A(parcel, i22);
                    } else if (c16 == 2) {
                        iZ16 = com.bumptech.glide.d.z(parcel, i22);
                    } else if (c16 == 3) {
                        zX13 = com.bumptech.glide.d.x(parcel, i22);
                    } else if (c16 == 4) {
                        strJ15 = com.bumptech.glide.d.j(parcel, i22);
                    } else if (c16 != 5) {
                        com.bumptech.glide.d.E(parcel, i22);
                    } else {
                        pVar3 = (p5.p) com.bumptech.glide.d.i(parcel, i22, p5.p.CREATOR);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH13);
                return new r5.c(jA7, iZ16, zX13, strJ15, pVar3);
            case y4.g.ERROR /* 13 */:
                int iH14 = com.bumptech.glide.d.H(parcel);
                long jA8 = 0;
                r5.f[] fVarArr = null;
                int iZ17 = com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS;
                int iZ18 = 1;
                int iZ19 = 1;
                while (parcel.dataPosition() < iH14) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case QueueFuseable.SYNC /* 1 */:
                            iZ18 = com.bumptech.glide.d.z(parcel, i23);
                            break;
                        case 2:
                            iZ19 = com.bumptech.glide.d.z(parcel, i23);
                            break;
                        case 3:
                            jA8 = com.bumptech.glide.d.A(parcel, i23);
                            break;
                        case 4:
                            iZ17 = com.bumptech.glide.d.z(parcel, i23);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            fVarArr = (r5.f[]) com.bumptech.glide.d.m(parcel, i23, r5.f.CREATOR);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            com.bumptech.glide.d.x(parcel, i23);
                            break;
                        default:
                            com.bumptech.glide.d.E(parcel, i23);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH14);
                return new LocationAvailability(iZ17, iZ18, iZ19, jA8, fVarArr);
            case y4.g.INTERRUPTED /* 14 */:
                int iH15 = com.bumptech.glide.d.H(parcel);
                WorkSource workSource2 = new WorkSource();
                long jA9 = -1;
                long jA10 = Long.MAX_VALUE;
                long jA11 = Long.MAX_VALUE;
                long jA12 = 0;
                long jA13 = 3600000;
                String strJ16 = null;
                p5.p pVar4 = null;
                long jA14 = 600000;
                int iZ20 = 102;
                int iZ21 = Integer.MAX_VALUE;
                float f10 = 0.0f;
                boolean zX14 = false;
                int iZ22 = 0;
                int iZ23 = 0;
                boolean zX15 = false;
                while (parcel.dataPosition() < iH15) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case QueueFuseable.SYNC /* 1 */:
                            iZ20 = com.bumptech.glide.d.z(parcel, i24);
                            break;
                        case 2:
                            jA13 = com.bumptech.glide.d.A(parcel, i24);
                            break;
                        case 3:
                            jA14 = com.bumptech.glide.d.A(parcel, i24);
                            break;
                        case 4:
                        default:
                            com.bumptech.glide.d.E(parcel, i24);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            jA10 = com.bumptech.glide.d.A(parcel, i24);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            iZ21 = com.bumptech.glide.d.z(parcel, i24);
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                            com.bumptech.glide.d.V(parcel, i24, 4);
                            f10 = parcel.readFloat();
                            break;
                        case '\b':
                            jA12 = com.bumptech.glide.d.A(parcel, i24);
                            break;
                        case '\t':
                            zX14 = com.bumptech.glide.d.x(parcel, i24);
                            break;
                        case y4.g.DEVELOPER_ERROR /* 10 */:
                            jA11 = com.bumptech.glide.d.A(parcel, i24);
                            break;
                        case 11:
                            jA9 = com.bumptech.glide.d.A(parcel, i24);
                            break;
                        case '\f':
                            iZ22 = com.bumptech.glide.d.z(parcel, i24);
                            break;
                        case y4.g.ERROR /* 13 */:
                            iZ23 = com.bumptech.glide.d.z(parcel, i24);
                            break;
                        case y4.g.INTERRUPTED /* 14 */:
                            strJ16 = com.bumptech.glide.d.j(parcel, i24);
                            break;
                        case y4.g.TIMEOUT /* 15 */:
                            zX15 = com.bumptech.glide.d.x(parcel, i24);
                            break;
                        case y4.g.CANCELED /* 16 */:
                            workSource2 = (WorkSource) com.bumptech.glide.d.i(parcel, i24, WorkSource.CREATOR);
                            break;
                        case y4.g.API_NOT_CONNECTED /* 17 */:
                            pVar4 = (p5.p) com.bumptech.glide.d.i(parcel, i24, p5.p.CREATOR);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH15);
                return new LocationRequest(iZ20, jA13, jA14, jA12, jA10, jA11, iZ21, f10, zX14, jA9, iZ22, iZ23, strJ16, zX15, workSource2, pVar4);
            case y4.g.TIMEOUT /* 15 */:
                int iH16 = com.bumptech.glide.d.H(parcel);
                List listN2 = LocationResult.f11290e;
                while (parcel.dataPosition() < iH16) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        com.bumptech.glide.d.E(parcel, i25);
                    } else {
                        listN2 = com.bumptech.glide.d.n(parcel, i25, Location.CREATOR);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH16);
                return new LocationResult(listN2);
            case y4.g.CANCELED /* 16 */:
                int iH17 = com.bumptech.glide.d.H(parcel);
                LatLng latLng = null;
                LatLng latLng2 = null;
                while (parcel.dataPosition() < iH17) {
                    int i26 = parcel.readInt();
                    char c17 = (char) i26;
                    if (c17 == 2) {
                        latLng = (LatLng) com.bumptech.glide.d.i(parcel, i26, LatLng.CREATOR);
                    } else if (c17 != 3) {
                        com.bumptech.glide.d.E(parcel, i26);
                    } else {
                        latLng2 = (LatLng) com.bumptech.glide.d.i(parcel, i26, LatLng.CREATOR);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH17);
                return new LatLngBounds(latLng, latLng2);
            case y4.g.API_NOT_CONNECTED /* 17 */:
                int iH18 = com.bumptech.glide.d.H(parcel);
                double d10 = 0.0d;
                double d11 = 0.0d;
                while (parcel.dataPosition() < iH18) {
                    int i27 = parcel.readInt();
                    char c18 = (char) i27;
                    if (c18 == 2) {
                        com.bumptech.glide.d.V(parcel, i27, 8);
                        d10 = parcel.readDouble();
                    } else if (c18 != 3) {
                        com.bumptech.glide.d.E(parcel, i27);
                    } else {
                        com.bumptech.glide.d.V(parcel, i27, 8);
                        d11 = parcel.readDouble();
                    }
                }
                com.bumptech.glide.d.q(parcel, iH18);
                return new LatLng(d10, d11);
            case 18:
                int iH19 = com.bumptech.glide.d.H(parcel);
                long jA15 = 0;
                long jA16 = 0;
                long jA17 = 0;
                String strJ17 = null;
                String strJ18 = null;
                y5 y5Var = null;
                String strJ19 = null;
                t5.q qVar = null;
                t5.q qVar2 = null;
                t5.q qVar3 = null;
                boolean zX16 = false;
                while (parcel.dataPosition() < iH19) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 2:
                            strJ17 = com.bumptech.glide.d.j(parcel, i28);
                            break;
                        case 3:
                            strJ18 = com.bumptech.glide.d.j(parcel, i28);
                            break;
                        case 4:
                            y5Var = (y5) com.bumptech.glide.d.i(parcel, i28, y5.CREATOR);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            jA15 = com.bumptech.glide.d.A(parcel, i28);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            zX16 = com.bumptech.glide.d.x(parcel, i28);
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                            strJ19 = com.bumptech.glide.d.j(parcel, i28);
                            break;
                        case '\b':
                            qVar = (t5.q) com.bumptech.glide.d.i(parcel, i28, t5.q.CREATOR);
                            break;
                        case '\t':
                            jA16 = com.bumptech.glide.d.A(parcel, i28);
                            break;
                        case y4.g.DEVELOPER_ERROR /* 10 */:
                            qVar2 = (t5.q) com.bumptech.glide.d.i(parcel, i28, t5.q.CREATOR);
                            break;
                        case 11:
                            jA17 = com.bumptech.glide.d.A(parcel, i28);
                            break;
                        case '\f':
                            qVar3 = (t5.q) com.bumptech.glide.d.i(parcel, i28, t5.q.CREATOR);
                            break;
                        default:
                            com.bumptech.glide.d.E(parcel, i28);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH19);
                return new t5.c(strJ17, strJ18, y5Var, jA15, zX16, strJ19, qVar, jA16, qVar2, jA17, qVar3);
            case y4.g.REMOTE_EXCEPTION /* 19 */:
                int iH20 = com.bumptech.glide.d.H(parcel);
                Bundle bundleG = null;
                while (parcel.dataPosition() < iH20) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 2) {
                        com.bumptech.glide.d.E(parcel, i29);
                    } else {
                        bundleG = com.bumptech.glide.d.g(parcel, i29);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH20);
                return new t5.p(bundleG);
            case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                int iH21 = com.bumptech.glide.d.H(parcel);
                long jA18 = 0;
                String strJ20 = null;
                t5.p pVar5 = null;
                String strJ21 = null;
                while (parcel.dataPosition() < iH21) {
                    int i30 = parcel.readInt();
                    char c19 = (char) i30;
                    if (c19 == 2) {
                        strJ20 = com.bumptech.glide.d.j(parcel, i30);
                    } else if (c19 == 3) {
                        pVar5 = (t5.p) com.bumptech.glide.d.i(parcel, i30, t5.p.CREATOR);
                    } else if (c19 == 4) {
                        strJ21 = com.bumptech.glide.d.j(parcel, i30);
                    } else if (c19 != 5) {
                        com.bumptech.glide.d.E(parcel, i30);
                    } else {
                        jA18 = com.bumptech.glide.d.A(parcel, i30);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH21);
                return new t5.q(strJ20, pVar5, strJ21, jA18);
            case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                int iH22 = com.bumptech.glide.d.H(parcel);
                long jA19 = 0;
                String strJ22 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strJ23 = null;
                String strJ24 = null;
                Double dValueOf = null;
                int iZ24 = 0;
                while (parcel.dataPosition() < iH22) {
                    int i31 = parcel.readInt();
                    switch ((char) i31) {
                        case QueueFuseable.SYNC /* 1 */:
                            iZ24 = com.bumptech.glide.d.z(parcel, i31);
                            break;
                        case 2:
                            strJ22 = com.bumptech.glide.d.j(parcel, i31);
                            break;
                        case 3:
                            jA19 = com.bumptech.glide.d.A(parcel, i31);
                            break;
                        case 4:
                            int iB = com.bumptech.glide.d.B(parcel, i31);
                            if (iB != 0) {
                                com.bumptech.glide.d.N(parcel, iB, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                                break;
                            } else {
                                lValueOf = null;
                                break;
                            }
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            int iB2 = com.bumptech.glide.d.B(parcel, i31);
                            if (iB2 != 0) {
                                com.bumptech.glide.d.N(parcel, iB2, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                                break;
                            } else {
                                fValueOf = null;
                                break;
                            }
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            strJ23 = com.bumptech.glide.d.j(parcel, i31);
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                            strJ24 = com.bumptech.glide.d.j(parcel, i31);
                            break;
                        case '\b':
                            int iB3 = com.bumptech.glide.d.B(parcel, i31);
                            if (iB3 != 0) {
                                com.bumptech.glide.d.N(parcel, iB3, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                                break;
                            } else {
                                dValueOf = null;
                                break;
                            }
                        default:
                            com.bumptech.glide.d.E(parcel, i31);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH22);
                return new y5(iZ24, strJ22, jA19, lValueOf, fValueOf, strJ23, strJ24, dValueOf);
            case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                int iH23 = com.bumptech.glide.d.H(parcel);
                String strJ25 = "";
                String strJ26 = strJ25;
                long jA20 = -2147483648L;
                long jA21 = 0;
                long jA22 = 0;
                long jA23 = 0;
                long jA24 = 0;
                long jA25 = 0;
                String strJ27 = null;
                String strJ28 = null;
                String strJ29 = null;
                String strJ30 = null;
                String strJ31 = null;
                String strJ32 = null;
                String strJ33 = null;
                Boolean boolValueOf = null;
                ArrayList arrayListL = null;
                String strJ34 = null;
                String strJ35 = null;
                boolean zX17 = true;
                boolean zX18 = false;
                int iZ25 = 0;
                boolean zX19 = true;
                boolean zX20 = false;
                while (parcel.dataPosition() < iH23) {
                    int i32 = parcel.readInt();
                    switch ((char) i32) {
                        case 2:
                            strJ27 = com.bumptech.glide.d.j(parcel, i32);
                            break;
                        case 3:
                            strJ28 = com.bumptech.glide.d.j(parcel, i32);
                            break;
                        case 4:
                            strJ29 = com.bumptech.glide.d.j(parcel, i32);
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            strJ30 = com.bumptech.glide.d.j(parcel, i32);
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            jA21 = com.bumptech.glide.d.A(parcel, i32);
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                            jA22 = com.bumptech.glide.d.A(parcel, i32);
                            break;
                        case '\b':
                            strJ31 = com.bumptech.glide.d.j(parcel, i32);
                            break;
                        case '\t':
                            zX17 = com.bumptech.glide.d.x(parcel, i32);
                            break;
                        case y4.g.DEVELOPER_ERROR /* 10 */:
                            zX18 = com.bumptech.glide.d.x(parcel, i32);
                            break;
                        case 11:
                            jA20 = com.bumptech.glide.d.A(parcel, i32);
                            break;
                        case '\f':
                            strJ32 = com.bumptech.glide.d.j(parcel, i32);
                            break;
                        case y4.g.ERROR /* 13 */:
                            jA23 = com.bumptech.glide.d.A(parcel, i32);
                            break;
                        case y4.g.INTERRUPTED /* 14 */:
                            jA24 = com.bumptech.glide.d.A(parcel, i32);
                            break;
                        case y4.g.TIMEOUT /* 15 */:
                            iZ25 = com.bumptech.glide.d.z(parcel, i32);
                            break;
                        case y4.g.CANCELED /* 16 */:
                            zX19 = com.bumptech.glide.d.x(parcel, i32);
                            break;
                        case y4.g.API_NOT_CONNECTED /* 17 */:
                        case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                        default:
                            com.bumptech.glide.d.E(parcel, i32);
                            break;
                        case 18:
                            zX20 = com.bumptech.glide.d.x(parcel, i32);
                            break;
                        case y4.g.REMOTE_EXCEPTION /* 19 */:
                            strJ33 = com.bumptech.glide.d.j(parcel, i32);
                            break;
                        case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            int iB4 = com.bumptech.glide.d.B(parcel, i32);
                            if (iB4 != 0) {
                                com.bumptech.glide.d.N(parcel, iB4, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            } else {
                                boolValueOf = null;
                                break;
                            }
                        case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                            jA25 = com.bumptech.glide.d.A(parcel, i32);
                            break;
                        case 23:
                            arrayListL = com.bumptech.glide.d.l(parcel, i32);
                            break;
                        case 24:
                            strJ34 = com.bumptech.glide.d.j(parcel, i32);
                            break;
                        case 25:
                            strJ25 = com.bumptech.glide.d.j(parcel, i32);
                            break;
                        case 26:
                            strJ26 = com.bumptech.glide.d.j(parcel, i32);
                            break;
                        case 27:
                            strJ35 = com.bumptech.glide.d.j(parcel, i32);
                            break;
                    }
                }
                com.bumptech.glide.d.q(parcel, iH23);
                return new d6(strJ27, strJ28, strJ29, strJ30, jA21, jA22, strJ31, zX17, zX18, jA20, strJ32, jA23, jA24, iZ25, zX19, zX20, strJ33, boolValueOf, jA25, arrayListL, strJ34, strJ25, strJ26, strJ35);
            case 23:
                int iH24 = com.bumptech.glide.d.H(parcel);
                Intent intent = null;
                int iZ26 = 0;
                int iZ27 = 0;
                while (parcel.dataPosition() < iH24) {
                    int i33 = parcel.readInt();
                    char c20 = (char) i33;
                    if (c20 == 1) {
                        iZ26 = com.bumptech.glide.d.z(parcel, i33);
                    } else if (c20 == 2) {
                        iZ27 = com.bumptech.glide.d.z(parcel, i33);
                    } else if (c20 != 3) {
                        com.bumptech.glide.d.E(parcel, i33);
                    } else {
                        intent = (Intent) com.bumptech.glide.d.i(parcel, i33, Intent.CREATOR);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH24);
                return new v5.b(iZ26, iZ27, intent);
            case 24:
                int iH25 = com.bumptech.glide.d.H(parcel);
                ArrayList arrayListL2 = null;
                String strJ36 = null;
                while (parcel.dataPosition() < iH25) {
                    int i34 = parcel.readInt();
                    char c21 = (char) i34;
                    if (c21 == 1) {
                        arrayListL2 = com.bumptech.glide.d.l(parcel, i34);
                    } else if (c21 != 2) {
                        com.bumptech.glide.d.E(parcel, i34);
                    } else {
                        strJ36 = com.bumptech.glide.d.j(parcel, i34);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH25);
                return new v5.f(strJ36, arrayListL2);
            case 25:
                int iH26 = com.bumptech.glide.d.H(parcel);
                a5.a0 a0Var = null;
                int iZ28 = 0;
                while (parcel.dataPosition() < iH26) {
                    int i35 = parcel.readInt();
                    char c22 = (char) i35;
                    if (c22 == 1) {
                        iZ28 = com.bumptech.glide.d.z(parcel, i35);
                    } else if (c22 != 2) {
                        com.bumptech.glide.d.E(parcel, i35);
                    } else {
                        a0Var = (a5.a0) com.bumptech.glide.d.i(parcel, i35, a5.a0.CREATOR);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH26);
                return new v5.g(iZ28, a0Var);
            case 26:
                int iH27 = com.bumptech.glide.d.H(parcel);
                b bVar = null;
                b0 b0Var = null;
                int iZ29 = 0;
                while (parcel.dataPosition() < iH27) {
                    int i36 = parcel.readInt();
                    char c23 = (char) i36;
                    if (c23 == 1) {
                        iZ29 = com.bumptech.glide.d.z(parcel, i36);
                    } else if (c23 == 2) {
                        bVar = (b) com.bumptech.glide.d.i(parcel, i36, b.CREATOR);
                    } else if (c23 != 3) {
                        com.bumptech.glide.d.E(parcel, i36);
                    } else {
                        b0Var = (b0) com.bumptech.glide.d.i(parcel, i36, b0.CREATOR);
                    }
                }
                com.bumptech.glide.d.q(parcel, iH27);
                return new v5.h(iZ29, bVar, b0Var);
            case 27:
                b6.b bVar2 = new b6.b();
                bVar2.f1958w = 255;
                bVar2.N = -2;
                bVar2.O = -2;
                bVar2.P = -2;
                bVar2.W = Boolean.TRUE;
                bVar2.f1944b = parcel.readInt();
                bVar2.f1948e = (Integer) parcel.readSerializable();
                bVar2.f1950f = (Integer) parcel.readSerializable();
                bVar2.f1953j = (Integer) parcel.readSerializable();
                bVar2.f1954m = (Integer) parcel.readSerializable();
                bVar2.f1955n = (Integer) parcel.readSerializable();
                bVar2.f1956t = (Integer) parcel.readSerializable();
                bVar2.f1957u = (Integer) parcel.readSerializable();
                bVar2.f1958w = parcel.readInt();
                bVar2.M = parcel.readString();
                bVar2.N = parcel.readInt();
                bVar2.O = parcel.readInt();
                bVar2.P = parcel.readInt();
                bVar2.R = parcel.readString();
                bVar2.S = parcel.readString();
                bVar2.T = parcel.readInt();
                bVar2.V = (Integer) parcel.readSerializable();
                bVar2.X = (Integer) parcel.readSerializable();
                bVar2.Y = (Integer) parcel.readSerializable();
                bVar2.Z = (Integer) parcel.readSerializable();
                bVar2.f1943a0 = (Integer) parcel.readSerializable();
                bVar2.f1945b0 = (Integer) parcel.readSerializable();
                bVar2.f1946c0 = (Integer) parcel.readSerializable();
                bVar2.f1951f0 = (Integer) parcel.readSerializable();
                bVar2.f1947d0 = (Integer) parcel.readSerializable();
                bVar2.f1949e0 = (Integer) parcel.readSerializable();
                bVar2.W = (Boolean) parcel.readSerializable();
                bVar2.Q = (Locale) parcel.readSerializable();
                bVar2.f1952g0 = (Boolean) parcel.readSerializable();
                return bVar2;
            case 28:
                i6.b bVar3 = new i6.b(parcel);
                bVar3.f13397b = ((Integer) parcel.readValue(i6.b.class.getClassLoader())).intValue();
                return bVar3;
            default:
                return new com.google.android.material.datepicker.c((com.google.android.material.datepicker.p) parcel.readParcelable(com.google.android.material.datepicker.p.class.getClassLoader()), (com.google.android.material.datepicker.p) parcel.readParcelable(com.google.android.material.datepicker.p.class.getClassLoader()), (com.google.android.material.datepicker.b) parcel.readParcelable(com.google.android.material.datepicker.b.class.getClassLoader()), (com.google.android.material.datepicker.p) parcel.readParcelable(com.google.android.material.datepicker.p.class.getClassLoader()), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f18975a) {
            case 0:
                return new b[i10];
            case QueueFuseable.SYNC /* 1 */:
                return new d[i10];
            case 2:
                return new v[i10];
            case 3:
                return new w[i10];
            case 4:
                return new x[i10];
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return new p5.r[i10];
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                return new p5.s[i10];
            case y4.g.NETWORK_ERROR /* 7 */:
                return new p5.t[i10];
            case 8:
                return new p5.p[i10];
            case 9:
                return new d0[i10];
            case y4.g.DEVELOPER_ERROR /* 10 */:
                return new r5.f[i10];
            case 11:
                return new r5.a[i10];
            case 12:
                return new r5.c[i10];
            case y4.g.ERROR /* 13 */:
                return new LocationAvailability[i10];
            case y4.g.INTERRUPTED /* 14 */:
                return new LocationRequest[i10];
            case y4.g.TIMEOUT /* 15 */:
                return new LocationResult[i10];
            case y4.g.CANCELED /* 16 */:
                return new LatLngBounds[i10];
            case y4.g.API_NOT_CONNECTED /* 17 */:
                return new LatLng[i10];
            case 18:
                return new t5.c[i10];
            case y4.g.REMOTE_EXCEPTION /* 19 */:
                return new t5.p[i10];
            case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                return new t5.q[i10];
            case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new y5[i10];
            case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                return new d6[i10];
            case 23:
                return new v5.b[i10];
            case 24:
                return new v5.f[i10];
            case 25:
                return new v5.g[i10];
            case 26:
                return new v5.h[i10];
            case 27:
                return new b6.b[i10];
            case 28:
                return new i6.b[i10];
            default:
                return new com.google.android.material.datepicker.c[i10];
        }
    }
}