package v5;

import a5.a0;
import a5.k;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import fc.t;
import org.json.JSONException;
import y4.l;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends k implements u5.c {

    /* renamed from: i0, reason: collision with root package name */
    public final boolean f18398i0;

    /* renamed from: j0, reason: collision with root package name */
    public final a5.h f18399j0;

    /* renamed from: k0, reason: collision with root package name */
    public final Bundle f18400k0;

    /* renamed from: l0, reason: collision with root package name */
    public final Integer f18401l0;

    public a(Context context, Looper looper, a5.h hVar, Bundle bundle, y4.k kVar, l lVar) {
        super(context, looper, 44, hVar, kVar, lVar);
        this.f18398i0 = true;
        this.f18399j0 = hVar;
        this.f18400k0 = bundle;
        this.f18401l0 = hVar.f338i;
    }

    @Override // a5.f
    public final String A() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // a5.f
    public final String B() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // u5.c
    public final void f(d dVar) throws NumberFormatException {
        GoogleSignInAccount googleSignInAccountH;
        if (dVar == null) {
            throw new NullPointerException("Expecting a valid ISignInCallbacks");
        }
        try {
            Account account = this.f18399j0.f330a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                v4.a aVarA = v4.a.a(this.f325u);
                String strB = aVarA.b("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(strB)) {
                    String strB2 = aVarA.b("googleSignInAccount:" + strB);
                    if (strB2 != null) {
                        try {
                            googleSignInAccountH = GoogleSignInAccount.h(strB2);
                        } catch (JSONException unused) {
                        }
                    }
                }
                googleSignInAccountH = null;
            } else {
                googleSignInAccountH = null;
            }
            Integer num = this.f18401l0;
            t.k(num);
            a0 a0Var = new a0(2, account, num.intValue(), googleSignInAccountH);
            e eVar = (e) z();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(eVar.f9704f);
            int i10 = l5.b.f14646a;
            parcelObtain.writeInt(1);
            int iC0 = com.bumptech.glide.e.c0(parcelObtain, 20293);
            com.bumptech.glide.e.i0(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            com.bumptech.glide.e.W(parcelObtain, 2, a0Var, 0);
            com.bumptech.glide.e.h0(parcelObtain, iC0);
            parcelObtain.writeStrongBinder(dVar.asBinder());
            eVar.x(parcelObtain, 12);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                dVar.Y0(new h(1, new x4.b(8, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // u5.c
    public final void h(a5.l lVar, boolean z7) {
        try {
            e eVar = (e) z();
            Integer num = this.f18401l0;
            t.k(num);
            int iIntValue = num.intValue();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(eVar.f9704f);
            int i10 = l5.b.f14646a;
            parcelObtain.writeStrongBinder(lVar.asBinder());
            parcelObtain.writeInt(iIntValue);
            parcelObtain.writeInt(z7 ? 1 : 0);
            eVar.x(parcelObtain, 9);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // a5.f, y4.c
    public final int j() {
        return 12451000;
    }

    @Override // u5.c
    public final void l() {
        try {
            e eVar = (e) z();
            Integer num = this.f18401l0;
            t.k(num);
            int iIntValue = num.intValue();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(eVar.f9704f);
            parcelObtain.writeInt(iIntValue);
            eVar.x(parcelObtain, 7);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // a5.f, y4.c
    public final boolean o() {
        return this.f18398i0;
    }

    @Override // u5.c
    public final void p() {
        c(new a5.e(this));
    }

    @Override // a5.f
    public final IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        String str = "com.google.android.gms.signin.internal.ISignInService";
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new e(iBinder, str, 1);
    }

    @Override // a5.f
    public final Bundle x() {
        a5.h hVar = this.f18399j0;
        boolean zEquals = this.f325u.getPackageName().equals(hVar.f335f);
        Bundle bundle = this.f18400k0;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", hVar.f335f);
        }
        return bundle;
    }
}