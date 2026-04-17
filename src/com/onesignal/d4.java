package com.onesignal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d4 extends q.c {

    /* renamed from: e, reason: collision with root package name */
    public String f11754e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11755f;

    @Override // q.c
    public final void a(n8.s sVar) {
        Parcel parcelObtain;
        Parcel parcelObtain2;
        try {
            a.c cVar = (a.c) ((a.e) sVar.f15435b);
            cVar.getClass();
            parcelObtain = Parcel.obtain();
            parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                parcelObtain.writeLong(0L);
                if (!cVar.f0b.transact(2, parcelObtain, parcelObtain2, 0)) {
                    int i10 = a.d.f1b;
                }
                parcelObtain2.readException();
                parcelObtain2.readInt();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException unused) {
        }
        q.d dVarH = sVar.h();
        if (dVarH == null) {
            return;
        }
        Uri uri = Uri.parse(this.f11754e);
        Bundle bundle = new Bundle();
        PendingIntent pendingIntent = (PendingIntent) dVarH.f16091m;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        try {
            a.e eVar = (a.e) dVarH.f16088e;
            a.b bVar = (a.b) dVarH.f16089f;
            a.c cVar2 = (a.c) eVar;
            cVar2.getClass();
            parcelObtain = Parcel.obtain();
            parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                if (uri != null) {
                    parcelObtain.writeInt(1);
                    uri.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
                parcelObtain.writeTypedList(null);
                if (!cVar2.f0b.transact(4, parcelObtain, parcelObtain2, 0)) {
                    int i11 = a.d.f1b;
                }
                parcelObtain2.readException();
                parcelObtain2.readInt();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (Throwable th) {
                throw th;
            }
        } catch (RemoteException unused2) {
        }
        if (this.f11755f) {
            com.google.android.gms.internal.measurement.n3 n3VarA = new q.b(dVarH).a();
            ((Intent) n3VarA.f10909e).setData(uri);
            ((Intent) n3VarA.f10909e).addFlags(268435456);
            z3.f12248b.startActivity((Intent) n3VarA.f10909e, (Bundle) n3VarA.f10910f);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}