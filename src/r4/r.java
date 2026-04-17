package r4;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.c01;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.on;
import com.google.android.gms.internal.ads.qn;
import com.google.android.gms.internal.ads.qr0;
import com.google.android.gms.internal.ads.wr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r implements c01 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16512b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn f16513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f16514f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f16515j;

    public /* synthetic */ r(b bVar, qn qnVar, boolean z7, int i10) {
        this.f16512b = i10;
        this.f16515j = bVar;
        this.f16513e = qnVar;
        this.f16514f = z7;
    }

    @Override // com.google.android.gms.internal.ads.c01
    public final void zza(Throwable th) {
        int i10 = this.f16512b;
        qn qnVar = this.f16513e;
        switch (i10) {
            case 0:
                try {
                    String str = "Internal error: " + th.getMessage();
                    on onVar = (on) qnVar;
                    Parcel parcelT = onVar.T();
                    parcelT.writeString(str);
                    onVar.q2(parcelT, 2);
                    break;
                } catch (RemoteException e10) {
                    wr.e("", e10);
                    return;
                }
            default:
                try {
                    String str2 = "Internal error: " + th.getMessage();
                    on onVar2 = (on) qnVar;
                    Parcel parcelT2 = onVar2.T();
                    parcelT2.writeString(str2);
                    onVar2.q2(parcelT2, 2);
                    break;
                } catch (RemoteException e11) {
                    wr.e("", e11);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.c01
    /* renamed from: zzb */
    public final void mo28zzb(Object obj) {
        String string;
        String string2;
        int i10 = this.f16512b;
        boolean z7 = this.f16514f;
        qn qnVar = this.f16513e;
        b bVar = this.f16515j;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                try {
                    on onVar = (on) qnVar;
                    Parcel parcelT = onVar.T();
                    parcelT.writeTypedList(arrayList);
                    onVar.q2(parcelT, 1);
                    if (bVar.S || z7) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Uri uri = (Uri) it.next();
                            boolean zW3 = b.w3(uri, bVar.f16455e0, bVar.f16457f0);
                            qr0 qr0Var = bVar.R;
                            if (zW3) {
                                string = b.x3(uri, bVar.f16451b0, "1").toString();
                            } else {
                                if (((Boolean) j4.q.f13781d.f13784c.a(ge.f4817s6)).booleanValue()) {
                                    string = uri.toString();
                                }
                            }
                            qr0Var.a(string, null);
                        }
                        break;
                    }
                } catch (RemoteException e10) {
                    wr.e("", e10);
                    return;
                }
            default:
                List<Uri> list = (List) obj;
                try {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (b.w3((Uri) it2.next(), bVar.f16452c0, bVar.f16453d0)) {
                                bVar.Y.getAndIncrement();
                            }
                        }
                    }
                    on onVar2 = (on) qnVar;
                    Parcel parcelT2 = onVar2.T();
                    parcelT2.writeTypedList(list);
                    onVar2.q2(parcelT2, 1);
                    if (bVar.T || z7) {
                        for (Uri uri2 : list) {
                            boolean zW32 = b.w3(uri2, bVar.f16452c0, bVar.f16453d0);
                            qr0 qr0Var2 = bVar.R;
                            if (zW32) {
                                string2 = b.x3(uri2, bVar.f16451b0, "1").toString();
                            } else {
                                if (((Boolean) j4.q.f13781d.f13784c.a(ge.f4817s6)).booleanValue()) {
                                    string2 = uri2.toString();
                                }
                            }
                            qr0Var2.a(string2, null);
                        }
                        break;
                    }
                } catch (RemoteException e11) {
                    wr.e("", e11);
                }
        }
    }
}