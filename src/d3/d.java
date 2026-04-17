package d3;

import a5.k;
import a5.u0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.WorkSource;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.nk;
import com.google.android.gms.internal.ads.s5;
import com.google.android.gms.internal.ads.u5;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.measurement.i3;
import com.google.android.gms.internal.measurement.j3;
import com.google.android.gms.internal.measurement.n3;
import com.google.android.gms.internal.measurement.o3;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.v;
import com.google.android.gms.internal.measurement.w;
import com.google.android.gms.location.LocationRequest;
import fc.t;
import io.reactivex.internal.fuseable.QueueFuseable;
import j4.g1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p5.f;
import p5.g;
import p5.h0;
import p5.i;
import p5.j;
import p5.l;
import p5.n;
import p5.p;
import p5.q;
import p5.r;
import x5.h;
import z4.m;
import z4.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements t3.b, s5, o4.b, o4.d, x5.c, x5.e, o, h, l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12308b;

    /* renamed from: e, reason: collision with root package name */
    public Object f12309e;

    /* renamed from: f, reason: collision with root package name */
    public Object f12310f;

    public d(int i10) {
        this.f12308b = i10;
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (i10 == 6) {
                this.f12310f = new HashMap();
                return;
            }
            if (i10 == 10) {
                this.f12310f = new ConcurrentHashMap();
                this.f12309e = new AtomicInteger(0);
                return;
            }
            if (i10 != 18) {
                if (i10 != 28) {
                    this.f12309e = new ArrayList();
                    this.f12310f = new HashMap();
                    return;
                }
                this.f12310f = new HashMap();
                this.f12309e = new s(6);
                m(new s(0));
                m(new s(1));
                m(new s(2));
                m(new s(3));
                m(new s(4));
                m(new s(5));
                m(new s(7));
            }
        }
    }

    public static d k() {
        return new d(new nk(), new nk(), 11, 0);
    }

    public final void a(Object obj, String str) {
        ((List) this.f12309e).add(a0.h.G(str, "=", String.valueOf(obj)));
    }

    @Override // p5.l
    public final void b(m mVar) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.ads.s5
    public final void c(u5 u5Var) {
        wr.g("Failed to load URL: " + ((String) this.f12309e) + "\n" + u5Var.toString());
        ((l4.s) this.f12310f).a(null);
    }

    public final synchronized List d(String str) {
        List arrayList;
        try {
            if (!((List) this.f12309e).contains(str)) {
                ((List) this.f12309e).add(str);
            }
            arrayList = (List) ((Map) this.f12310f).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((Map) this.f12310f).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList e(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((List) this.f12309e).iterator();
        while (it.hasNext()) {
            List<c> list = (List) ((Map) this.f12310f).get((String) it.next());
            if (list != null) {
                for (c cVar : list) {
                    if (cVar.f12305a.isAssignableFrom(cls) && cls2.isAssignableFrom(cVar.f12306b) && !arrayList.contains(cVar.f12306b)) {
                        arrayList.add(cVar.f12306b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final String f(String str) {
        int identifier = ((Resources) this.f12309e).getIdentifier(str, "string", (String) this.f12310f);
        if (identifier == 0) {
            return null;
        }
        return ((Resources) this.f12309e).getString(identifier);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // z4.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(k kVar, Object obj) {
        x4.d dVar;
        boolean z7;
        x4.d dVar2;
        boolean z10;
        n nVar;
        x5.a aVar;
        q qVar;
        z4.k kVar2;
        x5.l lVar;
        int i10;
        int i11;
        long j10;
        long jMin;
        x5.l lVar2;
        h dVar3;
        r5.a aVar2 = (r5.a) this.f12309e;
        x5.a aVar3 = (x5.a) this.f12310f;
        q qVar2 = (q) kVar;
        x5.l lVar3 = (x5.l) obj;
        x4.d[] dVarArrU = qVar2.u();
        Object u0Var = null;
        if (dVarArrU == null) {
            z7 = false;
        } else {
            int length = dVarArrU.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    dVar = null;
                    break;
                }
                dVar = dVarArrU[i12];
                if ("get_current_location".equals(dVar.f18958b)) {
                    break;
                } else {
                    i12++;
                }
            }
            if (dVar != null && dVar.h() >= 2) {
                z7 = true;
            }
        }
        int i13 = 2;
        if (z7) {
            h0 h0Var = (h0) qVar2.z();
            j jVar = new j(lVar3);
            Parcel parcelT = h0Var.T();
            f.c(parcelT, aVar2);
            parcelT.writeStrongBinder(jVar);
            Parcel parcelP1 = h0Var.p1(parcelT, 87);
            IBinder strongBinder = parcelP1.readStrongBinder();
            int i14 = a5.m.f364e;
            if (strongBinder != null) {
                String str = "com.google.android.gms.common.internal.ICancelToken";
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                u0Var = iInterfaceQueryLocalInterface instanceof a5.n ? (a5.n) iInterfaceQueryLocalInterface : new u0(strongBinder, str, i13);
            }
            parcelP1.recycle();
            if (aVar3 == null) {
                return;
            } else {
                dVar3 = new p8.c(u0Var, 29);
            }
        } else {
            m mVar = new m(new p5.h(qVar2, lVar3));
            z4.k kVar3 = mVar.f19676c;
            kVar3.getClass();
            d dVar4 = new d(mVar, lVar3, 27);
            x5.l lVar4 = new x5.l();
            int i15 = aVar2.f16518f;
            r5.d dVar5 = new r5.d();
            dq0.v0(i15);
            dVar5.f16530a = i15;
            dVar5.f16531b = 0L;
            dVar5.f16533d = 0L;
            dVar5.f16534e = Long.MAX_VALUE;
            dVar5.f16535f = Integer.MAX_VALUE;
            dVar5.f16536g = 0.0f;
            dVar5.f16537h = true;
            dVar5.f16538i = -1L;
            dVar5.f16539j = 0;
            dVar5.f16540k = 0;
            dVar5.f16541l = null;
            dVar5.f16542m = false;
            dVar5.f16543n = null;
            dVar5.f16544o = null;
            dVar5.f16532c = 0L;
            long j11 = aVar2.f16519j;
            t.b("durationMillis must be greater than 0", j11 > 0);
            dVar5.f16534e = j11;
            dVar5.b(aVar2.f16517e);
            long j12 = aVar2.f16516b;
            t.b("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", j12 == -1 || j12 >= 0);
            dVar5.f16538i = j12;
            dVar5.f16542m = aVar2.f16520m;
            dVar5.c(aVar2.f16521n);
            dVar5.f16537h = true;
            String str2 = aVar2.f16522t;
            if (Build.VERSION.SDK_INT < 30) {
                dVar5.f16541l = str2;
            }
            dVar5.f16543n = aVar2.f16523u;
            LocationRequest locationRequestA = dVar5.a();
            m mVar2 = (m) dVar4.f12309e;
            z4.k kVar4 = mVar2.f19676c;
            kVar4.getClass();
            x4.d[] dVarArrU2 = qVar2.u();
            if (dVarArrU2 == null) {
                z10 = false;
                synchronized (qVar2.f15973j0) {
                    try {
                        n nVar2 = (n) qVar2.f15973j0.getOrDefault(kVar4, null);
                        if (nVar2 == null || z10) {
                            nVar = new n(dVar4);
                            qVar2.f15973j0.put(kVar4, nVar);
                        } else {
                            nVar2.f15962f.b(mVar2);
                            nVar = nVar2;
                            nVar2 = null;
                        }
                        String str3 = kVar4.f19667b + "@" + System.identityHashCode(kVar4.f19666a);
                        if (z10) {
                            h0 h0Var2 = (h0) qVar2.z();
                            r rVar = new r(2, nVar2 == null ? null : nVar2, nVar, null, null, str3);
                            i iVar = new i(null, lVar4);
                            Parcel parcelT2 = h0Var2.T();
                            f.c(parcelT2, rVar);
                            f.c(parcelT2, locationRequestA);
                            parcelT2.writeStrongBinder(iVar);
                            h0Var2.r3(parcelT2, 88);
                            aVar = aVar3;
                            qVar = qVar2;
                            lVar = lVar3;
                            kVar2 = kVar3;
                            lVar2 = lVar4;
                        } else {
                            h0 h0Var3 = (h0) qVar2.z();
                            int i16 = locationRequestA.f11281b;
                            long j13 = locationRequestA.f11282e;
                            long j14 = locationRequestA.f11283f;
                            long j15 = locationRequestA.f11284j;
                            long j16 = locationRequestA.f11285m;
                            int i17 = locationRequestA.f11286n;
                            float f10 = locationRequestA.f11287t;
                            boolean z11 = locationRequestA.f11288u;
                            aVar = aVar3;
                            qVar = qVar2;
                            long j17 = locationRequestA.f11289w;
                            kVar2 = kVar3;
                            int i18 = locationRequestA.M;
                            lVar = lVar3;
                            int i19 = locationRequestA.N;
                            String str4 = locationRequestA.O;
                            boolean z12 = locationRequestA.P;
                            n nVar3 = nVar;
                            WorkSource workSource = locationRequestA.Q;
                            p pVar = locationRequestA.R;
                            String str5 = Build.VERSION.SDK_INT < 30 ? null : str4;
                            if (j14 == -1) {
                                i10 = i19;
                                i11 = i18;
                                j10 = j13;
                                jMin = j10;
                            } else if (i16 == 105) {
                                i10 = i19;
                                i11 = i18;
                                jMin = j14;
                                j10 = j13;
                            } else {
                                i10 = i19;
                                i11 = i18;
                                j10 = j13;
                                jMin = Math.min(j14, j10);
                            }
                            lVar2 = lVar4;
                            p5.t tVar = new p5.t(1, new p5.s(new LocationRequest(i16, j10, jMin, Math.max(j15, j10), Long.MAX_VALUE, j16, i17, f10, z11, j17 == -1 ? j10 : j17, i11, i10, str5, z12, new WorkSource(workSource), pVar), null, false, false, null, false, false, null, Long.MAX_VALUE), null, nVar3, null, new p5.k(lVar2, nVar3, 2), str3);
                            Parcel parcelT3 = h0Var3.T();
                            f.c(parcelT3, tVar);
                            h0Var3.r3(parcelT3, 59);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                lVar2.f19011a.b(new g(lVar));
                if (aVar == null) {
                    return;
                }
                dVar3 = new d(26, qVar, kVar2);
                aVar3 = aVar;
            } else {
                int length2 = dVarArrU2.length;
                int i20 = 0;
                while (true) {
                    if (i20 >= length2) {
                        dVar2 = null;
                        break;
                    }
                    dVar2 = dVarArrU2[i20];
                    if ("location_updates_with_callback".equals(dVar2.f18958b)) {
                        break;
                    } else {
                        i20++;
                    }
                }
                if (dVar2 != null && dVar2.h() >= 1) {
                    z10 = true;
                }
                synchronized (qVar2.f15973j0) {
                }
            }
        }
        aVar3.a(dVar3);
    }

    @Override // da.a
    public final Object get() {
        return new s3.g((Context) ((da.a) this.f12309e).get(), (s3.d) ((da.a) this.f12310f).get());
    }

    public final void h(String str) {
        wr.g("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        ((r4.a) this.f12310f).f16439b.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", (String) this.f12309e, str), null);
    }

    public final int i(Context context, y4.c cVar) {
        t.k(context);
        t.k(cVar);
        cVar.i();
        int iJ = cVar.j();
        int iD = ((SparseIntArray) this.f12309e).get(iJ, -1);
        if (iD == -1) {
            iD = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= ((SparseIntArray) this.f12309e).size()) {
                    iD = -1;
                    break;
                }
                int iKeyAt = ((SparseIntArray) this.f12309e).keyAt(i10);
                if (iKeyAt > iJ && ((SparseIntArray) this.f12309e).get(iKeyAt) == 0) {
                    break;
                }
                i10++;
            }
            if (iD == -1) {
                iD = ((x4.g) this.f12310f).d(context, iJ);
            }
            ((SparseIntArray) this.f12309e).put(iJ, iD);
        }
        return iD;
    }

    /* JADX WARN: Code restructure failed: missing block: B:304:0x08b2, code lost:
    
        if (r14.zzg().booleanValue() != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0900, code lost:
    
        if (r14.zzg().booleanValue() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x09dc, code lost:
    
        if (((com.google.android.gms.internal.measurement.f) r3).f10761e.equals("break") != false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0a0f, code lost:
    
        if (r13.equals("continue") == false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:?, code lost:
    
        return r13.j((com.google.android.gms.internal.measurement.n) r0.get(1));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:471:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0, types: [n8.s] */
    /* JADX WARN: Type inference failed for: r14v102, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r14v108, types: [com.google.android.gms.internal.measurement.e] */
    /* JADX WARN: Type inference failed for: r14v112, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r14v185, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r14v20, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r14v205, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r14v210 */
    /* JADX WARN: Type inference failed for: r14v235 */
    /* JADX WARN: Type inference failed for: r14v259, types: [com.google.android.gms.internal.measurement.d] */
    /* JADX WARN: Type inference failed for: r14v266, types: [com.google.android.gms.internal.measurement.k] */
    /* JADX WARN: Type inference failed for: r14v289, types: [com.google.android.gms.internal.measurement.q] */
    /* JADX WARN: Type inference failed for: r14v294 */
    /* JADX WARN: Type inference failed for: r14v295 */
    /* JADX WARN: Type inference failed for: r14v68, types: [com.google.android.gms.internal.measurement.f] */
    /* JADX WARN: Type inference failed for: r14v75, types: [com.google.android.gms.internal.measurement.h, com.google.android.gms.internal.measurement.m, com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r2v38, types: [com.google.android.gms.internal.measurement.f] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40, types: [com.google.android.gms.internal.measurement.r] */
    /* JADX WARN: Type inference failed for: r2v44, types: [com.google.android.gms.internal.measurement.f] */
    /* JADX WARN: Type inference failed for: r4v11, types: [com.google.android.gms.internal.measurement.r] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v17, types: [com.google.android.gms.internal.measurement.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.internal.measurement.n j(n8.s sVar, com.google.android.gms.internal.measurement.n nVar) {
        com.google.android.gms.internal.measurement.n gVar;
        com.google.android.gms.internal.measurement.n gVar2;
        boolean zD;
        boolean zD2;
        com.google.android.gms.internal.measurement.n nVarJ;
        com.google.android.gms.internal.measurement.n nVar2;
        com.google.android.gms.internal.measurement.n nVarJ2;
        com.google.android.gms.internal.measurement.n nVarJ3;
        v vVar;
        com.google.android.gms.internal.measurement.n nVar3;
        com.google.android.gms.internal.measurement.n nVarJ4;
        com.google.android.gms.internal.measurement.n nVarJ5;
        v vVar2;
        String str;
        o3.q(sVar);
        if (!(nVar instanceof com.google.android.gms.internal.measurement.o)) {
            return nVar;
        }
        com.google.android.gms.internal.measurement.o oVar = (com.google.android.gms.internal.measurement.o) nVar;
        ArrayList arrayList = oVar.f10915e;
        Map map = (Map) this.f12310f;
        String str2 = oVar.f10914b;
        s sVar2 = (s) (map.containsKey(str2) ? (com.google.android.gms.internal.measurement.t) ((Map) this.f12310f).get(str2) : (s) this.f12309e);
        int i10 = 2;
        int i11 = 1;
        int i12 = 0;
        switch (sVar2.f10983b) {
            case 0:
                w wVar = w.ADD;
                switch (o3.u(str2).ordinal()) {
                    case 4:
                        o3.B("BITWISE_AND", 2, arrayList);
                        gVar = new com.google.android.gms.internal.measurement.g(Double.valueOf(o3.g(sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1)).zzh().doubleValue()) & o3.g(sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzh().doubleValue())));
                        return gVar;
                    case y4.g.INVALID_ACCOUNT /* 5 */:
                        o3.B("BITWISE_LEFT_SHIFT", 2, arrayList);
                        return new com.google.android.gms.internal.measurement.g(Double.valueOf(o3.g(sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzh().doubleValue()) << ((int) (o3.g(sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1)).zzh().doubleValue()) & 31))));
                    case y4.g.RESOLUTION_REQUIRED /* 6 */:
                        o3.B("BITWISE_NOT", 1, arrayList);
                        gVar2 = new com.google.android.gms.internal.measurement.g(Double.valueOf(~o3.g(sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzh().doubleValue())));
                        return gVar2;
                    case y4.g.NETWORK_ERROR /* 7 */:
                        o3.B("BITWISE_OR", 2, arrayList);
                        gVar = new com.google.android.gms.internal.measurement.g(Double.valueOf(o3.g(sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1)).zzh().doubleValue()) | o3.g(sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzh().doubleValue())));
                        return gVar;
                    case 8:
                        o3.B("BITWISE_RIGHT_SHIFT", 2, arrayList);
                        return new com.google.android.gms.internal.measurement.g(Double.valueOf(o3.g(sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzh().doubleValue()) >> ((int) (o3.g(sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1)).zzh().doubleValue()) & 31))));
                    case 9:
                        o3.B("BITWISE_UNSIGNED_RIGHT_SHIFT", 2, arrayList);
                        gVar = new com.google.android.gms.internal.measurement.g(Double.valueOf((o3.g(sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzh().doubleValue()) & 4294967295L) >>> ((int) (o3.g(sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1)).zzh().doubleValue()) & 31))));
                        return gVar;
                    case y4.g.DEVELOPER_ERROR /* 10 */:
                        o3.B("BITWISE_XOR", 2, arrayList);
                        gVar = new com.google.android.gms.internal.measurement.g(Double.valueOf(o3.g(sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1)).zzh().doubleValue()) ^ o3.g(sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzh().doubleValue())));
                        return gVar;
                    default:
                        sVar2.a(str2);
                        throw null;
                }
            case QueueFuseable.SYNC /* 1 */:
                o3.B(o3.u(str2).name(), 2, arrayList);
                com.google.android.gms.internal.measurement.n nVarJ6 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0));
                com.google.android.gms.internal.measurement.n nVarJ7 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1));
                int iOrdinal = o3.u(str2).ordinal();
                if (iOrdinal != 23) {
                    if (iOrdinal == 48) {
                        zD2 = s.d(nVarJ6, nVarJ7);
                    } else if (iOrdinal == 42) {
                        zD = s.e(nVarJ6, nVarJ7);
                    } else if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case 37:
                                zD = s.e(nVarJ7, nVarJ6);
                                break;
                            case 38:
                                zD = s.g(nVarJ7, nVarJ6);
                                break;
                            case 39:
                                zD = o3.J(nVarJ6, nVarJ7);
                                break;
                            case 40:
                                zD2 = o3.J(nVarJ6, nVarJ7);
                                break;
                            default:
                                sVar2.a(str2);
                                throw null;
                        }
                    } else {
                        zD = s.g(nVarJ6, nVarJ7);
                    }
                    zD = !zD2;
                } else {
                    zD = s.d(nVarJ6, nVarJ7);
                }
                return zD ? com.google.android.gms.internal.measurement.n.f10904s : com.google.android.gms.internal.measurement.n.f10905v;
            case 2:
                w wVar2 = w.ADD;
                int iOrdinal2 = o3.u(str2).ordinal();
                if (iOrdinal2 == 2) {
                    o3.B("APPLY", 3, arrayList);
                    com.google.android.gms.internal.measurement.n nVarJ8 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0));
                    String strZzi = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1)).zzi();
                    com.google.android.gms.internal.measurement.n nVarJ9 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(2));
                    if (!(nVarJ9 instanceof com.google.android.gms.internal.measurement.d)) {
                        throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", nVarJ9.getClass().getCanonicalName()));
                    }
                    if (strZzi.isEmpty()) {
                        throw new IllegalArgumentException("Function name for apply is undefined");
                    }
                    return nVarJ8.a(strZzi, sVar, ((com.google.android.gms.internal.measurement.d) nVarJ9).n());
                }
                if (iOrdinal2 == 15) {
                    o3.B("BREAK", 0, arrayList);
                    return com.google.android.gms.internal.measurement.n.f10901p;
                }
                if (iOrdinal2 == 25) {
                    return s.b(sVar, arrayList);
                }
                if (iOrdinal2 == 41) {
                    o3.D("IF", 2, arrayList);
                    com.google.android.gms.internal.measurement.n nVarJ10 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0));
                    com.google.android.gms.internal.measurement.n nVarJ11 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1));
                    com.google.android.gms.internal.measurement.n nVarJ12 = arrayList.size() > 2 ? sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(2)) : null;
                    gVar = com.google.android.gms.internal.measurement.n.f10899l;
                    com.google.android.gms.internal.measurement.n nVarK = nVarJ10.zzg().booleanValue() ? sVar.k((com.google.android.gms.internal.measurement.d) nVarJ11) : nVarJ12 != null ? sVar.k((com.google.android.gms.internal.measurement.d) nVarJ12) : gVar;
                    if (nVarK instanceof com.google.android.gms.internal.measurement.f) {
                        return nVarK;
                    }
                    return gVar;
                }
                if (iOrdinal2 == 54) {
                    return new com.google.android.gms.internal.measurement.d(arrayList);
                }
                if (iOrdinal2 != 57) {
                    if (iOrdinal2 == 19) {
                        if (!arrayList.isEmpty()) {
                            com.google.android.gms.internal.measurement.n nVarJ13 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0));
                            if (nVarJ13 instanceof com.google.android.gms.internal.measurement.d) {
                                return sVar.k((com.google.android.gms.internal.measurement.d) nVarJ13);
                            }
                        }
                    } else if (iOrdinal2 == 20) {
                        o3.D("DEFINE_FUNCTION", 2, arrayList);
                        gVar2 = s.b(sVar, arrayList);
                        String str3 = gVar2.f10805b;
                        if (str3 == null) {
                            str3 = "";
                        }
                        sVar.n(str3, gVar2);
                    } else if (iOrdinal2 == 60) {
                        o3.B("SWITCH", 3, arrayList);
                        com.google.android.gms.internal.measurement.n nVarJ14 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0));
                        com.google.android.gms.internal.measurement.n nVarJ15 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1));
                        com.google.android.gms.internal.measurement.n nVarJ16 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(2));
                        if (!(nVarJ15 instanceof com.google.android.gms.internal.measurement.d)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                        }
                        if (!(nVarJ16 instanceof com.google.android.gms.internal.measurement.d)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                        }
                        com.google.android.gms.internal.measurement.d dVar = (com.google.android.gms.internal.measurement.d) nVarJ15;
                        com.google.android.gms.internal.measurement.d dVar2 = (com.google.android.gms.internal.measurement.d) nVarJ16;
                        boolean z7 = false;
                        for (int i13 = 0; i13 < dVar.e(); i13++) {
                            if (z7 || nVarJ14.equals(sVar.j(dVar.h(i13)))) {
                                nVarJ = sVar.j(dVar2.h(i13));
                                if (nVarJ instanceof com.google.android.gms.internal.measurement.f) {
                                    break;
                                } else {
                                    z7 = true;
                                }
                            } else {
                                z7 = false;
                            }
                        }
                        if (dVar.e() + 1 == dVar2.e()) {
                            nVarJ = sVar.j(dVar2.h(dVar.e()));
                            if (nVarJ instanceof com.google.android.gms.internal.measurement.f) {
                                String str4 = ((com.google.android.gms.internal.measurement.f) nVarJ).f10761e;
                                if (!str4.equals("return")) {
                                    break;
                                }
                                return nVarJ;
                            }
                        }
                    } else {
                        if (iOrdinal2 == 61) {
                            o3.B("TERNARY", 3, arrayList);
                            return sVar.j((com.google.android.gms.internal.measurement.n) (sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzg().booleanValue() ? arrayList.get(1) : arrayList.get(2)));
                        }
                        switch (iOrdinal2) {
                            case 11:
                                return sVar.i().k(new com.google.android.gms.internal.measurement.d(arrayList));
                            case 12:
                                o3.B("BREAK", 0, arrayList);
                                return com.google.android.gms.internal.measurement.n.f10902q;
                            case y4.g.ERROR /* 13 */:
                                break;
                            default:
                                sVar2.a(str2);
                                throw null;
                        }
                    }
                    return com.google.android.gms.internal.measurement.n.f10899l;
                }
                if (arrayList.isEmpty()) {
                    return com.google.android.gms.internal.measurement.n.f10903r;
                }
                o3.B("RETURN", 1, arrayList);
                gVar2 = new com.google.android.gms.internal.measurement.f("return", sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0)));
                return gVar2;
            case 3:
                w wVar3 = w.ADD;
                int iOrdinal3 = o3.u(str2).ordinal();
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 47) {
                        if (iOrdinal3 != 50) {
                            sVar2.a(str2);
                            throw null;
                        }
                        o3.B("OR", 2, arrayList);
                        gVar2 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0));
                        break;
                    } else {
                        o3.B("NOT", 1, arrayList);
                        gVar2 = new com.google.android.gms.internal.measurement.e(Boolean.valueOf(!sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzg().booleanValue()));
                    }
                    return gVar2;
                }
                o3.B("AND", 2, arrayList);
                gVar2 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0));
                break;
            case 4:
                w wVar4 = w.ADD;
                int iOrdinal4 = o3.u(str2).ordinal();
                if (iOrdinal4 == 65) {
                    o3.B("WHILE", 4, arrayList);
                    com.google.android.gms.internal.measurement.n nVar4 = (com.google.android.gms.internal.measurement.n) arrayList.get(0);
                    com.google.android.gms.internal.measurement.n nVar5 = (com.google.android.gms.internal.measurement.n) arrayList.get(1);
                    com.google.android.gms.internal.measurement.n nVar6 = (com.google.android.gms.internal.measurement.n) arrayList.get(2);
                    com.google.android.gms.internal.measurement.n nVarJ17 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(3));
                    if (sVar.j(nVar6).zzg().booleanValue()) {
                        com.google.android.gms.internal.measurement.n nVarK2 = sVar.k((com.google.android.gms.internal.measurement.d) nVarJ17);
                        if (nVarK2 instanceof com.google.android.gms.internal.measurement.f) {
                            nVar2 = (com.google.android.gms.internal.measurement.f) nVarK2;
                            if ("break".equals(nVar2.f10761e)) {
                                nVar2 = com.google.android.gms.internal.measurement.n.f10899l;
                            } else if (!"return".equals(nVar2.f10761e)) {
                            }
                        }
                    } else {
                        while (sVar.j(nVar4).zzg().booleanValue()) {
                            com.google.android.gms.internal.measurement.n nVarK3 = sVar.k((com.google.android.gms.internal.measurement.d) nVarJ17);
                            if (nVarK3 instanceof com.google.android.gms.internal.measurement.f) {
                                nVar2 = (com.google.android.gms.internal.measurement.f) nVarK3;
                                if ("break".equals(nVar2.f10761e)) {
                                    nVar2 = com.google.android.gms.internal.measurement.n.f10899l;
                                } else if ("return".equals(nVar2.f10761e)) {
                                }
                            }
                            sVar.j(nVar5);
                        }
                        nVar2 = com.google.android.gms.internal.measurement.n.f10899l;
                    }
                    return nVar2;
                }
                switch (iOrdinal4) {
                    case 26:
                        o3.B("FOR_IN", 3, arrayList);
                        if (!(arrayList.get(0) instanceof com.google.android.gms.internal.measurement.q)) {
                            throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                        }
                        String strZzi2 = ((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzi();
                        nVarJ2 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1));
                        nVarJ3 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(2));
                        vVar = new v(sVar, strZzi2, i10);
                        return s.c(vVar, nVarJ2.zzl(), nVarJ3);
                    case 27:
                        o3.B("FOR_IN_CONST", 3, arrayList);
                        if (!(arrayList.get(0) instanceof com.google.android.gms.internal.measurement.q)) {
                            throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                        }
                        String strZzi3 = ((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzi();
                        nVarJ2 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1));
                        nVarJ3 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(2));
                        vVar = new v(sVar, strZzi3, i12);
                        return s.c(vVar, nVarJ2.zzl(), nVarJ3);
                    case 28:
                        o3.B("FOR_IN_LET", 3, arrayList);
                        if (!(arrayList.get(0) instanceof com.google.android.gms.internal.measurement.q)) {
                            throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                        }
                        String strZzi4 = ((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzi();
                        nVarJ2 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1));
                        nVarJ3 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(2));
                        vVar = new v(sVar, strZzi4, i11);
                        return s.c(vVar, nVarJ2.zzl(), nVarJ3);
                    case 29:
                        o3.B("FOR_LET", 4, arrayList);
                        com.google.android.gms.internal.measurement.n nVarJ18 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0));
                        if (!(nVarJ18 instanceof com.google.android.gms.internal.measurement.d)) {
                            throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                        }
                        com.google.android.gms.internal.measurement.d dVar3 = (com.google.android.gms.internal.measurement.d) nVarJ18;
                        com.google.android.gms.internal.measurement.n nVar7 = (com.google.android.gms.internal.measurement.n) arrayList.get(1);
                        com.google.android.gms.internal.measurement.n nVar8 = (com.google.android.gms.internal.measurement.n) arrayList.get(2);
                        com.google.android.gms.internal.measurement.n nVarJ19 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(3));
                        n8.s sVarI = sVar.i();
                        for (int i14 = 0; i14 < dVar3.e(); i14++) {
                            String strZzi5 = dVar3.h(i14).zzi();
                            sVarI.n(strZzi5, sVar.l(strZzi5));
                        }
                        while (sVar.j(nVar7).zzg().booleanValue()) {
                            com.google.android.gms.internal.measurement.n nVarK4 = sVar.k((com.google.android.gms.internal.measurement.d) nVarJ19);
                            if (nVarK4 instanceof com.google.android.gms.internal.measurement.f) {
                                nVar3 = (com.google.android.gms.internal.measurement.f) nVarK4;
                                if ("break".equals(nVar3.f10761e)) {
                                    nVar3 = com.google.android.gms.internal.measurement.n.f10899l;
                                    return nVar3;
                                }
                                if ("return".equals(nVar3.f10761e)) {
                                    return nVar3;
                                }
                            }
                            n8.s sVarI2 = sVar.i();
                            for (int i15 = 0; i15 < dVar3.e(); i15++) {
                                String strZzi6 = dVar3.h(i15).zzi();
                                sVarI2.n(strZzi6, sVarI.l(strZzi6));
                            }
                            sVarI2.j(nVar8);
                            sVarI = sVarI2;
                        }
                        nVar3 = com.google.android.gms.internal.measurement.n.f10899l;
                        return nVar3;
                    case 30:
                        o3.B("FOR_OF", 3, arrayList);
                        if (!(arrayList.get(0) instanceof com.google.android.gms.internal.measurement.q)) {
                            throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                        }
                        String strZzi7 = ((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzi();
                        nVarJ4 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1));
                        nVarJ5 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(2));
                        vVar2 = new v(sVar, strZzi7, i10);
                        return s.f(vVar2, nVarJ4, nVarJ5);
                    case 31:
                        o3.B("FOR_OF_CONST", 3, arrayList);
                        if (!(arrayList.get(0) instanceof com.google.android.gms.internal.measurement.q)) {
                            throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                        }
                        String strZzi8 = ((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzi();
                        nVarJ4 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1));
                        nVarJ5 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(2));
                        vVar2 = new v(sVar, strZzi8, i12);
                        return s.f(vVar2, nVarJ4, nVarJ5);
                    case 32:
                        o3.B("FOR_OF_LET", 3, arrayList);
                        if (!(arrayList.get(0) instanceof com.google.android.gms.internal.measurement.q)) {
                            throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                        }
                        String strZzi9 = ((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzi();
                        nVarJ4 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1));
                        nVarJ5 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(2));
                        vVar2 = new v(sVar, strZzi9, i11);
                        return s.f(vVar2, nVarJ4, nVarJ5);
                    default:
                        sVar2.a(str2);
                        throw null;
                }
            case y4.g.INVALID_ACCOUNT /* 5 */:
                w wVar5 = w.ADD;
                int iOrdinal5 = o3.u(str2).ordinal();
                if (iOrdinal5 == 0) {
                    o3.B("ADD", 2, arrayList);
                    com.google.android.gms.internal.measurement.n nVarJ20 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0));
                    com.google.android.gms.internal.measurement.n nVarJ21 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1));
                    gVar = ((nVarJ20 instanceof com.google.android.gms.internal.measurement.j) || (nVarJ20 instanceof com.google.android.gms.internal.measurement.q) || (nVarJ21 instanceof com.google.android.gms.internal.measurement.j) || (nVarJ21 instanceof com.google.android.gms.internal.measurement.q)) ? new com.google.android.gms.internal.measurement.q(String.valueOf(nVarJ20.zzi()).concat(String.valueOf(nVarJ21.zzi()))) : new com.google.android.gms.internal.measurement.g(Double.valueOf(nVarJ21.zzh().doubleValue() + nVarJ20.zzh().doubleValue()));
                } else if (iOrdinal5 == 21) {
                    o3.B("DIVIDE", 2, arrayList);
                    gVar = new com.google.android.gms.internal.measurement.g(Double.valueOf(sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzh().doubleValue() / sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1)).zzh().doubleValue()));
                } else {
                    if (iOrdinal5 != 59) {
                        if (iOrdinal5 == 52 || iOrdinal5 == 53) {
                            o3.B(str2, 2, arrayList);
                            gVar2 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0));
                            sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1));
                        } else {
                            if (iOrdinal5 == 55 || iOrdinal5 == 56) {
                                o3.B(str2, 1, arrayList);
                                return sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0));
                            }
                            switch (iOrdinal5) {
                                case 44:
                                    o3.B("MODULUS", 2, arrayList);
                                    gVar = new com.google.android.gms.internal.measurement.g(Double.valueOf(sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzh().doubleValue() % sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1)).zzh().doubleValue()));
                                    break;
                                case 45:
                                    o3.B("MULTIPLY", 2, arrayList);
                                    gVar = new com.google.android.gms.internal.measurement.g(Double.valueOf(sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzh().doubleValue() * sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1)).zzh().doubleValue()));
                                    break;
                                case 46:
                                    o3.B("NEGATE", 1, arrayList);
                                    gVar2 = new com.google.android.gms.internal.measurement.g(Double.valueOf(-sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzh().doubleValue()));
                                    break;
                                default:
                                    sVar2.a(str2);
                                    throw null;
                            }
                        }
                        return gVar2;
                    }
                    o3.B("SUBTRACT", 2, arrayList);
                    com.google.android.gms.internal.measurement.n nVarJ22 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0));
                    Double dValueOf = Double.valueOf(-sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1)).zzh().doubleValue());
                    if (dValueOf == null) {
                        dValueOf = Double.valueOf(Double.NaN);
                    }
                    gVar = new com.google.android.gms.internal.measurement.g(Double.valueOf(dValueOf.doubleValue() + nVarJ22.zzh().doubleValue()));
                }
                return gVar;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                if (str2 == null || str2.isEmpty() || !sVar.o(str2)) {
                    throw new IllegalArgumentException(String.format("Command not found: %s", str2));
                }
                com.google.android.gms.internal.measurement.n nVarL = sVar.l(str2);
                if (nVarL instanceof com.google.android.gms.internal.measurement.h) {
                    return ((com.google.android.gms.internal.measurement.h) nVarL).b(sVar, arrayList);
                }
                throw new IllegalArgumentException(String.format("Function %s is not defined", str2));
            default:
                w wVar6 = w.ADD;
                int iOrdinal6 = o3.u(str2).ordinal();
                if (iOrdinal6 != 3) {
                    if (iOrdinal6 != 14) {
                        if (iOrdinal6 == 24) {
                            o3.D("EXPRESSION_LIST", 1, arrayList);
                            gVar2 = com.google.android.gms.internal.measurement.n.f10899l;
                            while (i12 < arrayList.size()) {
                                com.google.android.gms.internal.measurement.n nVarJ23 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(i12));
                                if (nVarJ23 instanceof com.google.android.gms.internal.measurement.f) {
                                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                                }
                                i12++;
                                gVar2 = nVarJ23;
                            }
                        } else {
                            if (iOrdinal6 == 33) {
                                o3.B("GET", 1, arrayList);
                                com.google.android.gms.internal.measurement.n nVarJ24 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0));
                                if (nVarJ24 instanceof com.google.android.gms.internal.measurement.q) {
                                    return sVar.l(nVarJ24.zzi());
                                }
                                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", nVarJ24.getClass().getCanonicalName()));
                            }
                            if (iOrdinal6 == 49) {
                                o3.B("NULL", 0, arrayList);
                                return com.google.android.gms.internal.measurement.n.f10900o;
                            }
                            if (iOrdinal6 == 58) {
                                o3.B("SET_PROPERTY", 3, arrayList);
                                com.google.android.gms.internal.measurement.n nVarJ25 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0));
                                com.google.android.gms.internal.measurement.n nVarJ26 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1));
                                com.google.android.gms.internal.measurement.n nVarJ27 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(2));
                                if (nVarJ25 == com.google.android.gms.internal.measurement.n.f10899l || nVarJ25 == com.google.android.gms.internal.measurement.n.f10900o) {
                                    throw new IllegalStateException(String.format("Can't set property %s of %s", nVarJ26.zzi(), nVarJ25.zzi()));
                                }
                                if ((nVarJ25 instanceof com.google.android.gms.internal.measurement.d) && (nVarJ26 instanceof com.google.android.gms.internal.measurement.g)) {
                                    ((com.google.android.gms.internal.measurement.d) nVarJ25).p(nVarJ26.zzh().intValue(), nVarJ27);
                                    return nVarJ27;
                                }
                                if (!(nVarJ25 instanceof com.google.android.gms.internal.measurement.j)) {
                                    return nVarJ27;
                                }
                                ((com.google.android.gms.internal.measurement.j) nVarJ25).x(nVarJ26.zzi(), nVarJ27);
                                return nVarJ27;
                            }
                            if (iOrdinal6 == 17) {
                                if (arrayList.isEmpty()) {
                                    return new com.google.android.gms.internal.measurement.d();
                                }
                                gVar2 = new com.google.android.gms.internal.measurement.d();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    com.google.android.gms.internal.measurement.n nVarJ28 = sVar.j((com.google.android.gms.internal.measurement.n) it.next());
                                    if (nVarJ28 instanceof com.google.android.gms.internal.measurement.f) {
                                        throw new IllegalStateException("Failed to evaluate array element");
                                    }
                                    gVar2.p(i12, nVarJ28);
                                    i12++;
                                }
                            } else if (iOrdinal6 == 18) {
                                if (arrayList.isEmpty()) {
                                    return new com.google.android.gms.internal.measurement.k();
                                }
                                if (arrayList.size() % 2 != 0) {
                                    throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(arrayList.size())));
                                }
                                gVar2 = new com.google.android.gms.internal.measurement.k();
                                while (i12 < arrayList.size() - 1) {
                                    com.google.android.gms.internal.measurement.n nVarJ29 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(i12));
                                    com.google.android.gms.internal.measurement.n nVarJ30 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(i12 + 1));
                                    if ((nVarJ29 instanceof com.google.android.gms.internal.measurement.f) || (nVarJ30 instanceof com.google.android.gms.internal.measurement.f)) {
                                        throw new IllegalStateException("Failed to evaluate map entry");
                                    }
                                    gVar2.x(nVarJ29.zzi(), nVarJ30);
                                    i12 += 2;
                                }
                            } else if (iOrdinal6 == 35 || iOrdinal6 == 36) {
                                o3.B("GET_PROPERTY", 2, arrayList);
                                com.google.android.gms.internal.measurement.n nVarJ31 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0));
                                com.google.android.gms.internal.measurement.n nVarJ32 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1));
                                if ((nVarJ31 instanceof com.google.android.gms.internal.measurement.d) && o3.H(nVarJ32)) {
                                    return ((com.google.android.gms.internal.measurement.d) nVarJ31).h(nVarJ32.zzh().intValue());
                                }
                                if (nVarJ31 instanceof com.google.android.gms.internal.measurement.j) {
                                    return ((com.google.android.gms.internal.measurement.j) nVarJ31).w(nVarJ32.zzi());
                                }
                                if (nVarJ31 instanceof com.google.android.gms.internal.measurement.q) {
                                    if ("length".equals(nVarJ32.zzi())) {
                                        return new com.google.android.gms.internal.measurement.g(Double.valueOf(nVarJ31.zzi().length()));
                                    }
                                    if (o3.H(nVarJ32) && nVarJ32.zzh().doubleValue() < nVarJ31.zzi().length()) {
                                        gVar = new com.google.android.gms.internal.measurement.q(String.valueOf(nVarJ31.zzi().charAt(nVarJ32.zzh().intValue())));
                                    }
                                }
                            } else {
                                switch (iOrdinal6) {
                                    case 62:
                                        o3.B("TYPEOF", 1, arrayList);
                                        com.google.android.gms.internal.measurement.n nVarJ33 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0));
                                        if (nVarJ33 instanceof com.google.android.gms.internal.measurement.r) {
                                            str = "undefined";
                                        } else if (nVarJ33 instanceof com.google.android.gms.internal.measurement.e) {
                                            str = "boolean";
                                        } else if (nVarJ33 instanceof com.google.android.gms.internal.measurement.g) {
                                            str = "number";
                                        } else if (nVarJ33 instanceof com.google.android.gms.internal.measurement.q) {
                                            str = "string";
                                        } else if (nVarJ33 instanceof com.google.android.gms.internal.measurement.m) {
                                            str = "function";
                                        } else {
                                            if ((nVarJ33 instanceof com.google.android.gms.internal.measurement.o) || (nVarJ33 instanceof com.google.android.gms.internal.measurement.f)) {
                                                throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", nVarJ33));
                                            }
                                            str = "object";
                                        }
                                        gVar2 = new com.google.android.gms.internal.measurement.q(str);
                                        break;
                                    case 63:
                                        o3.B("UNDEFINED", 0, arrayList);
                                        break;
                                    case 64:
                                        o3.D("VAR", 1, arrayList);
                                        Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            com.google.android.gms.internal.measurement.n nVarJ34 = sVar.j((com.google.android.gms.internal.measurement.n) it2.next());
                                            if (!(nVarJ34 instanceof com.google.android.gms.internal.measurement.q)) {
                                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", nVarJ34.getClass().getCanonicalName()));
                                            }
                                            sVar.m(nVarJ34.zzi(), com.google.android.gms.internal.measurement.n.f10899l);
                                        }
                                        break;
                                    default:
                                        sVar2.a(str2);
                                        throw null;
                                }
                            }
                        }
                        return gVar2;
                    }
                    o3.D("CONST", 2, arrayList);
                    if (arrayList.size() % 2 != 0) {
                        throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(arrayList.size())));
                    }
                    for (int i16 = 0; i16 < arrayList.size() - 1; i16 += 2) {
                        com.google.android.gms.internal.measurement.n nVarJ35 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(i16));
                        if (!(nVarJ35 instanceof com.google.android.gms.internal.measurement.q)) {
                            throw new IllegalArgumentException(String.format("Expected string for const name. got %s", nVarJ35.getClass().getCanonicalName()));
                        }
                        String strZzi10 = nVarJ35.zzi();
                        sVar.m(strZzi10, sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(i16 + 1)));
                        ((Map) sVar.f15438j).put(strZzi10, Boolean.TRUE);
                    }
                    return com.google.android.gms.internal.measurement.n.f10899l;
                }
                o3.B("ASSIGN", 2, arrayList);
                com.google.android.gms.internal.measurement.n nVarJ36 = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(0));
                if (!(nVarJ36 instanceof com.google.android.gms.internal.measurement.q)) {
                    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", nVarJ36.getClass().getCanonicalName()));
                }
                if (!sVar.o(nVarJ36.zzi())) {
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", nVarJ36.zzi()));
                }
                gVar = sVar.j((com.google.android.gms.internal.measurement.n) arrayList.get(1));
                sVar.n(nVarJ36.zzi(), gVar);
                return gVar;
        }
    }

    public final Object l() {
        String str;
        n3 n3Var = (n3) this.f12309e;
        String str2 = (String) this.f12310f;
        ContentResolver contentResolver = ((Context) n3Var.f10909e).getContentResolver();
        Uri uri = j3.f10833a;
        synchronized (j3.class) {
            try {
                if (j3.f10837e == null) {
                    j3.f10836d.set(false);
                    j3.f10837e = new HashMap();
                    j3.f10842j = new Object();
                    contentResolver.registerContentObserver(j3.f10833a, true, new i3(0));
                } else if (j3.f10836d.getAndSet(false)) {
                    j3.f10837e.clear();
                    j3.f10838f.clear();
                    j3.f10839g.clear();
                    j3.f10840h.clear();
                    j3.f10841i.clear();
                    j3.f10842j = new Object();
                }
                Object obj = j3.f10842j;
                str = null;
                if (j3.f10837e.containsKey(str2)) {
                    String str3 = (String) j3.f10837e.get(str2);
                    if (str3 != null) {
                        str = str3;
                    }
                } else {
                    int length = j3.f10843k.length;
                    Cursor cursorQuery = contentResolver.query(j3.f10833a, null, null, new String[]{str2}, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(1);
                                if (string != null && string.equals(null)) {
                                    string = null;
                                }
                                j3.a(obj, str2, string);
                                if (string != null) {
                                    str = string;
                                }
                            } else {
                                j3.a(obj, str2, null);
                            }
                        } finally {
                            cursorQuery.close();
                        }
                    }
                }
            } finally {
            }
        }
        return str;
    }

    public final void m(s sVar) {
        Iterator it = sVar.f10994a.iterator();
        while (it.hasNext()) {
            ((Map) this.f12310f).put(Integer.valueOf(((w) it.next()).f11085b).toString(), sVar);
        }
    }

    @Override // x5.h
    public final void onCanceled() {
        try {
            ((q) this.f12309e).J((z4.k) this.f12310f, true, new x5.l());
        } catch (RemoteException unused) {
        }
    }

    @Override // x5.e
    public final void onComplete(x5.k kVar) {
        switch (this.f12308b) {
            case y4.g.REMOTE_EXCEPTION /* 19 */:
                ((fx) this.f12310f).f4470b.remove((x5.l) this.f12309e);
                break;
            default:
                AtomicReference atomicReference = (AtomicReference) this.f12309e;
                CountDownLatch countDownLatch = (CountDownLatch) this.f12310f;
                if (kVar.j()) {
                    atomicReference.set((Location) kVar.h());
                }
                countDownLatch.countDown();
                break;
        }
    }

    @Override // x5.c
    public final Object then(x5.k kVar) {
        Bundle bundle;
        w4.b bVar = (w4.b) this.f12309e;
        Bundle bundle2 = (Bundle) this.f12310f;
        bVar.getClass();
        return (kVar.j() && (bundle = (Bundle) kVar.h()) != null && bundle.containsKey("google.messenger")) ? bVar.a(bundle2).k(w4.l.f18681b, w4.k.f18680e) : kVar;
    }

    public final String toString() {
        switch (this.f12308b) {
            case y4.g.NETWORK_ERROR /* 7 */:
                return (String) this.f12309e;
            case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f12310f.getClass().getSimpleName());
                sb.append('{');
                int size = ((List) this.f12309e).size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb.append((String) ((List) this.f12309e).get(i10));
                    if (i10 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p5.l
    public final m zza() {
        return (m) this.f12309e;
    }

    @Override // p5.l
    /* renamed from: zzb */
    public final void mo22zzb() {
        ((x5.l) this.f12310f).d(null);
    }

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f12308b = i10;
        this.f12309e = obj;
        this.f12310f = obj2;
    }

    public d(Context context) {
        this.f12308b = 21;
        t.k(context);
        Resources resources = context.getResources();
        this.f12309e = resources;
        this.f12310f = resources.getResourcePackageName(2131886336);
    }

    public d(IBinder iBinder) throws RemoteException {
        this.f12308b = 16;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f12309e = new Messenger(iBinder);
            this.f12310f = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f12310f = new w4.e(iBinder);
            this.f12309e = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", strValueOf.length() != 0 ? "Invalid interface descriptor: ".concat(strValueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    public d(g1 g1Var) {
        String strZze;
        this.f12308b = 7;
        this.f12310f = g1Var;
        try {
            strZze = g1Var.zze();
        } catch (RemoteException e10) {
            wr.e("", e10);
            strZze = null;
        }
        this.f12309e = strZze;
    }

    public /* synthetic */ d(Object obj) {
        this.f12308b = 20;
        t.k(obj);
        this.f12310f = obj;
        this.f12309e = new ArrayList();
    }

    public /* synthetic */ d(Object obj, Object obj2, int i10) {
        this.f12308b = i10;
        this.f12309e = obj;
        this.f12310f = obj2;
    }

    public /* synthetic */ d(Object obj, Object obj2, int i10, int i11) {
        this.f12308b = i10;
        this.f12310f = obj;
        this.f12309e = obj2;
    }

    public /* synthetic */ d(o5.c cVar) {
        this.f12308b = 23;
        this.f12309e = cVar;
    }

    public d(r4.a aVar, String str) {
        this.f12308b = 15;
        this.f12310f = aVar;
        this.f12309e = str;
    }

    public d(x4.g gVar) {
        this.f12308b = 22;
        this.f12309e = new SparseIntArray();
        t.k(gVar);
        this.f12310f = gVar;
    }
}