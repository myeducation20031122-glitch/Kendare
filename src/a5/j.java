package a5;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import j4.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j extends b5.a {
    public static final Parcelable.Creator<j> CREATOR = new m2(29);
    public static final Scope[] R = new Scope[0];
    public static final x4.d[] S = new x4.d[0];
    public x4.d[] M;
    public final boolean N;
    public final int O;
    public boolean P;
    public final String Q;

    /* renamed from: b, reason: collision with root package name */
    public final int f348b;

    /* renamed from: e, reason: collision with root package name */
    public final int f349e;

    /* renamed from: f, reason: collision with root package name */
    public final int f350f;

    /* renamed from: j, reason: collision with root package name */
    public String f351j;

    /* renamed from: m, reason: collision with root package name */
    public IBinder f352m;

    /* renamed from: n, reason: collision with root package name */
    public Scope[] f353n;

    /* renamed from: t, reason: collision with root package name */
    public Bundle f354t;

    /* renamed from: u, reason: collision with root package name */
    public Account f355u;

    /* renamed from: w, reason: collision with root package name */
    public x4.d[] f356w;

    public j(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, x4.d[] dVarArr, x4.d[] dVarArr2, boolean z7, int i13, boolean z10, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? R : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        x4.d[] dVarArr3 = S;
        x4.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f348b = i10;
        this.f349e = i11;
        this.f350f = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f351j = "com.google.android.gms";
        } else {
            this.f351j = str;
        }
        int i14 = 2;
        if (i10 < 2) {
            account2 = null;
            if (iBinder != null) {
                int i15 = a.f294e;
                String str3 = "com.google.android.gms.common.internal.IAccountAccessor";
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface t0Var = iInterfaceQueryLocalInterface instanceof l ? (l) iInterfaceQueryLocalInterface : new t0(iBinder, str3, i14);
                if (t0Var != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            t0 t0Var2 = (t0) t0Var;
                            Parcel parcelA = t0Var2.A(t0Var2.T(), 2);
                            Account account3 = (Account) n5.a.a(parcelA, Account.CREATOR);
                            parcelA.recycle();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
        } else {
            this.f352m = iBinder;
            account2 = account;
        }
        this.f355u = account2;
        this.f353n = scopeArr2;
        this.f354t = bundle2;
        this.f356w = dVarArr4;
        this.M = dVarArr3;
        this.N = z7;
        this.O = i13;
        this.P = z10;
        this.Q = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        m2.a(this, parcel, i10);
    }
}