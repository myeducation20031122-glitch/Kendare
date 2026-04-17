package l1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n extends Binder implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f14489e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f14490b;

    public n(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f14490b = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [l1.d] */
    @Override // android.os.Binder
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        d dVar = null;
        c cVar = null;
        if (i10 == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) {
                    c cVar2 = new c();
                    cVar2.f14469b = strongBinder;
                    dVar = cVar2;
                } else {
                    dVar = (d) iInterfaceQueryLocalInterface;
                }
            }
            int iT = T(dVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iT);
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            x(parcel.createStringArray(), parcel.readInt());
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof d)) {
                c cVar3 = new c();
                cVar3.f14469b = strongBinder2;
                cVar = cVar3;
            } else {
                cVar = (d) iInterfaceQueryLocalInterface2;
            }
        }
        int i12 = parcel.readInt();
        synchronized (this.f14490b.f1700f) {
            this.f14490b.f1700f.unregister(cVar);
            this.f14490b.f1699e.remove(Integer.valueOf(i12));
        }
        parcel2.writeNoException();
        return true;
    }

    public final int T(d dVar, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (this.f14490b.f1700f) {
            try {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f14490b;
                int i10 = multiInstanceInvalidationService.f1698b + 1;
                multiInstanceInvalidationService.f1698b = i10;
                if (multiInstanceInvalidationService.f1700f.register(dVar, Integer.valueOf(i10))) {
                    this.f14490b.f1699e.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f14490b;
                multiInstanceInvalidationService2.f1698b--;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public final void x(String[] strArr, int i10) {
        synchronized (this.f14490b.f1700f) {
            try {
                String str = (String) this.f14490b.f1699e.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = this.f14490b.f1700f.beginBroadcast();
                for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                    try {
                        int iIntValue = ((Integer) this.f14490b.f1700f.getBroadcastCookie(i11)).intValue();
                        String str2 = (String) this.f14490b.f1699e.get(Integer.valueOf(iIntValue));
                        if (i10 != iIntValue && str.equals(str2)) {
                            try {
                                ((d) this.f14490b.f1700f.getBroadcastItem(i11)).b1(strArr);
                            } catch (RemoteException e10) {
                                Log.w("ROOM", "Error invoking a remote callback", e10);
                            }
                        }
                    } finally {
                        this.f14490b.f1700f.finishBroadcast();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}