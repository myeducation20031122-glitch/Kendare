package t5;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f4 extends com.google.android.gms.internal.measurement.x implements c3 {

    /* renamed from: b, reason: collision with root package name */
    public final w5 f17347b;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f17348e;

    /* renamed from: f, reason: collision with root package name */
    public String f17349f;

    public f4(w5 w5Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        fc.t.k(w5Var);
        this.f17347b = w5Var;
        this.f17349f = null;
    }

    public final void A(q qVar, d6 d6Var) {
        w5 w5Var = this.f17347b;
        w5Var.a();
        w5Var.g(qVar, d6Var);
    }

    @Override // t5.c3
    public final List E0(String str, String str2, String str3, boolean z7) {
        k2(str, true);
        w5 w5Var = this.f17347b;
        try {
            List<z5> list = (List) w5Var.zzaz().u(new c4(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (z5 z5Var : list) {
                if (z7 || !b6.b0(z5Var.f17724c)) {
                    arrayList.add(new y5(z5Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            i3 i3VarC = w5Var.c();
            i3VarC.f17397n.c(i3.y(str), "Failed to get user properties as. appId", e);
            return Collections.emptyList();
        } catch (ExecutionException e11) {
            e = e11;
            i3 i3VarC2 = w5Var.c();
            i3VarC2.f17397n.c(i3.y(str), "Failed to get user properties as. appId", e);
            return Collections.emptyList();
        }
    }

    @Override // t5.c3
    public final void F1(d6 d6Var) {
        fc.t.g(d6Var.f17307b);
        k2(d6Var.f17307b, false);
        T(new d4(this, d6Var, 0));
    }

    @Override // t5.c3
    public final List I1(String str, String str2, String str3) {
        k2(str, true);
        w5 w5Var = this.f17347b;
        try {
            return (List) w5Var.zzaz().u(new c4(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            w5Var.c().f17397n.b(e10, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    @Override // t5.c3
    public final List N0(String str, String str2, d6 d6Var) {
        p1(d6Var);
        String str3 = d6Var.f17307b;
        fc.t.k(str3);
        w5 w5Var = this.f17347b;
        try {
            return (List) w5Var.zzaz().u(new c4(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            w5Var.c().f17397n.b(e10, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    @Override // t5.c3
    public final byte[] R1(q qVar, String str) {
        fc.t.g(str);
        fc.t.k(qVar);
        k2(str, true);
        w5 w5Var = this.f17347b;
        i3 i3VarC = w5Var.c();
        b4 b4Var = w5Var.O;
        f3 f3Var = b4Var.P;
        String str2 = qVar.f17558b;
        i3VarC.P.b(f3Var.d(str2), "Log and bundle. event");
        ((e5.b) w5Var.d()).getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        a4 a4VarZzaz = w5Var.zzaz();
        m2.n nVar = new m2.n(this, qVar, str);
        a4VarZzaz.q();
        y3 y3Var = new y3(a4VarZzaz, nVar, true);
        if (Thread.currentThread() == a4VarZzaz.f17215f) {
            y3Var.run();
        } else {
            a4VarZzaz.A(y3Var);
        }
        try {
            byte[] bArr = (byte[]) y3Var.get();
            if (bArr == null) {
                w5Var.c().f17397n.b(i3.y(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((e5.b) w5Var.d()).getClass();
            w5Var.c().P.d("Log and bundle processed. event, size, time_ms", b4Var.P.d(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            i3 i3VarC2 = w5Var.c();
            i3VarC2.f17397n.d("Failed to log and bundle. appId, event, error", i3.y(str), b4Var.P.d(str2), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            i3 i3VarC22 = w5Var.c();
            i3VarC22.f17397n.d("Failed to log and bundle. appId, event, error", i3.y(str), b4Var.P.d(str2), e);
            return null;
        }
    }

    public final void T(Runnable runnable) {
        w5 w5Var = this.f17347b;
        if (w5Var.zzaz().z()) {
            runnable.run();
        } else {
            w5Var.zzaz().x(runnable);
        }
    }

    @Override // t5.c3
    public final List U1(String str, String str2, boolean z7, d6 d6Var) {
        p1(d6Var);
        String str3 = d6Var.f17307b;
        fc.t.k(str3);
        w5 w5Var = this.f17347b;
        try {
            List<z5> list = (List) w5Var.zzaz().u(new c4(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (z5 z5Var : list) {
                if (z7 || !b6.b0(z5Var.f17724c)) {
                    arrayList.add(new y5(z5Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            i3 i3VarC = w5Var.c();
            i3VarC.f17397n.c(i3.y(str3), "Failed to query user properties. appId", e);
            return Collections.emptyList();
        } catch (ExecutionException e11) {
            e = e11;
            i3 i3VarC2 = w5Var.c();
            i3VarC2.f17397n.c(i3.y(str3), "Failed to query user properties. appId", e);
            return Collections.emptyList();
        }
    }

    @Override // t5.c3
    public final void V(y5 y5Var, d6 d6Var) {
        fc.t.k(y5Var);
        p1(d6Var);
        T(new l0.a(this, y5Var, d6Var, 22));
    }

    @Override // t5.c3
    public final void Y(d6 d6Var) {
        p1(d6Var);
        T(new d4(this, d6Var, 3));
    }

    @Override // t5.c3
    public final String Y1(d6 d6Var) {
        p1(d6Var);
        w5 w5Var = this.f17347b;
        try {
            return (String) w5Var.zzaz().u(new l4.z(w5Var, d6Var, 5)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            i3 i3VarC = w5Var.c();
            i3VarC.f17397n.c(i3.y(d6Var.f17307b), "Failed to get app instance id. appId", e10);
            return null;
        }
    }

    @Override // t5.c3
    public final void Y2(d6 d6Var) {
        p1(d6Var);
        T(new d4(this, d6Var, 1));
    }

    @Override // t5.c3
    public final void c3(q qVar, d6 d6Var) {
        fc.t.k(qVar);
        p1(d6Var);
        T(new l0.a(this, qVar, d6Var, 20));
    }

    @Override // t5.c3
    public final void f0(long j10, String str, String str2, String str3) {
        T(new e4(this, str2, str3, str, j10, 0));
    }

    public final void k2(String str, boolean z7) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        w5 w5Var = this.f17347b;
        if (zIsEmpty) {
            w5Var.c().f17397n.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z7) {
            try {
                if (this.f17348e == null) {
                    this.f17348e = Boolean.valueOf("com.google.android.gms".equals(this.f17349f) || e5.c.d(w5Var.O.f17234b, Binder.getCallingUid()) || x4.k.c(w5Var.O.f17234b).d(Binder.getCallingUid()));
                }
                if (this.f17348e.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                w5Var.c().f17397n.b(i3.y(str), "Measurement Service called with invalid calling package. appId");
                throw e10;
            }
        }
        if (this.f17349f == null) {
            Context context = w5Var.O.f17234b;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = x4.j.f18966a;
            if (e5.c.f(callingUid, context, str)) {
                this.f17349f = str;
            }
        }
        if (str.equals(this.f17349f)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // t5.c3
    public final void l2(d6 d6Var) {
        fc.t.g(d6Var.f17307b);
        fc.t.k(d6Var.Y);
        d4 d4Var = new d4(this, d6Var, 2);
        w5 w5Var = this.f17347b;
        if (w5Var.zzaz().z()) {
            d4Var.run();
        } else {
            w5Var.zzaz().y(d4Var);
        }
    }

    @Override // t5.c3
    public final void m1(Bundle bundle, d6 d6Var) {
        p1(d6Var);
        String str = d6Var.f17307b;
        fc.t.k(str);
        T(new l0.a(this, str, bundle, 18, 0));
    }

    public final void p1(d6 d6Var) {
        fc.t.k(d6Var);
        String str = d6Var.f17307b;
        fc.t.g(str);
        k2(str, false);
        this.f17347b.N().P(d6Var.f17308e, d6Var.T);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final boolean x(int i10, Parcel parcel, Parcel parcel2) {
        boolean z7;
        ArrayList arrayList;
        List listU1;
        List listN0;
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                q qVar = (q) com.google.android.gms.internal.measurement.y.a(parcel, q.CREATOR);
                d6 d6Var = (d6) com.google.android.gms.internal.measurement.y.a(parcel, d6.CREATOR);
                com.google.android.gms.internal.measurement.y.b(parcel);
                c3(qVar, d6Var);
                parcel2.writeNoException();
                return true;
            case 2:
                y5 y5Var = (y5) com.google.android.gms.internal.measurement.y.a(parcel, y5.CREATOR);
                d6 d6Var2 = (d6) com.google.android.gms.internal.measurement.y.a(parcel, d6.CREATOR);
                com.google.android.gms.internal.measurement.y.b(parcel);
                V(y5Var, d6Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                d6 d6Var3 = (d6) com.google.android.gms.internal.measurement.y.a(parcel, d6.CREATOR);
                com.google.android.gms.internal.measurement.y.b(parcel);
                Y(d6Var3);
                parcel2.writeNoException();
                return true;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                q qVar2 = (q) com.google.android.gms.internal.measurement.y.a(parcel, q.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                com.google.android.gms.internal.measurement.y.b(parcel);
                fc.t.k(qVar2);
                fc.t.g(string);
                k2(string, true);
                T(new l0.a(this, qVar2, string, 21));
                parcel2.writeNoException();
                return true;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                d6 d6Var4 = (d6) com.google.android.gms.internal.measurement.y.a(parcel, d6.CREATOR);
                com.google.android.gms.internal.measurement.y.b(parcel);
                Y2(d6Var4);
                parcel2.writeNoException();
                return true;
            case y4.g.NETWORK_ERROR /* 7 */:
                d6 d6Var5 = (d6) com.google.android.gms.internal.measurement.y.a(parcel, d6.CREATOR);
                z7 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.y.b(parcel);
                p1(d6Var5);
                String str = d6Var5.f17307b;
                fc.t.k(str);
                w5 w5Var = this.f17347b;
                try {
                    List<z5> list = (List) w5Var.zzaz().u(new l4.z(this, str, 4)).get();
                    arrayList = new ArrayList(list.size());
                    for (z5 z5Var : list) {
                        if (z7 || !b6.b0(z5Var.f17724c)) {
                            arrayList.add(new y5(z5Var));
                        }
                    }
                } catch (InterruptedException e10) {
                    e = e10;
                    w5Var.c().f17397n.c(i3.y(str), "Failed to get user properties. appId", e);
                    arrayList = null;
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e11) {
                    e = e11;
                    w5Var.c().f17397n.c(i3.y(str), "Failed to get user properties. appId", e);
                    arrayList = null;
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                q qVar3 = (q) com.google.android.gms.internal.measurement.y.a(parcel, q.CREATOR);
                String string2 = parcel.readString();
                com.google.android.gms.internal.measurement.y.b(parcel);
                byte[] bArrR1 = R1(qVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrR1);
                return true;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                long j10 = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                com.google.android.gms.internal.measurement.y.b(parcel);
                f0(j10, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                d6 d6Var6 = (d6) com.google.android.gms.internal.measurement.y.a(parcel, d6.CREATOR);
                com.google.android.gms.internal.measurement.y.b(parcel);
                String strY1 = Y1(d6Var6);
                parcel2.writeNoException();
                parcel2.writeString(strY1);
                return true;
            case 12:
                c cVar = (c) com.google.android.gms.internal.measurement.y.a(parcel, c.CREATOR);
                d6 d6Var7 = (d6) com.google.android.gms.internal.measurement.y.a(parcel, d6.CREATOR);
                com.google.android.gms.internal.measurement.y.b(parcel);
                z0(cVar, d6Var7);
                parcel2.writeNoException();
                return true;
            case y4.g.ERROR /* 13 */:
                c cVar2 = (c) com.google.android.gms.internal.measurement.y.a(parcel, c.CREATOR);
                com.google.android.gms.internal.measurement.y.b(parcel);
                fc.t.k(cVar2);
                fc.t.k(cVar2.f17267f);
                fc.t.g(cVar2.f17265b);
                k2(cVar2.f17265b, true);
                T(new z4.u0(7, this, new c(cVar2)));
                parcel2.writeNoException();
                return true;
            case y4.g.INTERRUPTED /* 14 */:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = com.google.android.gms.internal.measurement.y.f11107a;
                z7 = parcel.readInt() != 0;
                d6 d6Var8 = (d6) com.google.android.gms.internal.measurement.y.a(parcel, d6.CREATOR);
                com.google.android.gms.internal.measurement.y.b(parcel);
                listU1 = U1(string6, string7, z7, d6Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listU1);
                return true;
            case y4.g.TIMEOUT /* 15 */:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = com.google.android.gms.internal.measurement.y.f11107a;
                z7 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.y.b(parcel);
                listU1 = E0(string8, string9, string10, z7);
                parcel2.writeNoException();
                parcel2.writeTypedList(listU1);
                return true;
            case y4.g.CANCELED /* 16 */:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                d6 d6Var9 = (d6) com.google.android.gms.internal.measurement.y.a(parcel, d6.CREATOR);
                com.google.android.gms.internal.measurement.y.b(parcel);
                listN0 = N0(string11, string12, d6Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listN0);
                return true;
            case y4.g.API_NOT_CONNECTED /* 17 */:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                com.google.android.gms.internal.measurement.y.b(parcel);
                listN0 = I1(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listN0);
                return true;
            case 18:
                d6 d6Var10 = (d6) com.google.android.gms.internal.measurement.y.a(parcel, d6.CREATOR);
                com.google.android.gms.internal.measurement.y.b(parcel);
                F1(d6Var10);
                parcel2.writeNoException();
                return true;
            case y4.g.REMOTE_EXCEPTION /* 19 */:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.y.a(parcel, Bundle.CREATOR);
                d6 d6Var11 = (d6) com.google.android.gms.internal.measurement.y.a(parcel, d6.CREATOR);
                com.google.android.gms.internal.measurement.y.b(parcel);
                m1(bundle, d6Var11);
                parcel2.writeNoException();
                return true;
            case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                d6 d6Var12 = (d6) com.google.android.gms.internal.measurement.y.a(parcel, d6.CREATOR);
                com.google.android.gms.internal.measurement.y.b(parcel);
                l2(d6Var12);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // t5.c3
    public final void z0(c cVar, d6 d6Var) {
        fc.t.k(cVar);
        fc.t.k(cVar.f17267f);
        p1(d6Var);
        c cVar2 = new c(cVar);
        cVar2.f17265b = d6Var.f17307b;
        T(new l0.a(this, cVar2, d6Var, 19));
    }
}