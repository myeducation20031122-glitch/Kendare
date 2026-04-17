package z1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.b8;
import com.google.android.gms.internal.ads.cf;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.f50;
import com.google.android.gms.internal.ads.i3;
import com.google.android.gms.internal.ads.ib;
import com.google.android.gms.internal.ads.ie;
import com.google.android.gms.internal.ads.ik;
import com.google.android.gms.internal.ads.is;
import com.google.android.gms.internal.ads.jb;
import com.google.android.gms.internal.ads.jb1;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.lb;
import com.google.android.gms.internal.ads.lk;
import com.google.android.gms.internal.ads.ni;
import com.google.android.gms.internal.ads.r41;
import com.google.android.gms.internal.ads.sn;
import com.google.android.gms.internal.ads.t5;
import com.google.android.gms.internal.ads.un0;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import s2.e0;
import w2.d0;
import w2.i0;
import z2.f0;
import z2.g0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o implements com.google.android.gms.internal.ads.i, i3, jb1, is, kk, lk, w2.v, z2.o, g0, q2.q, com.bumptech.glide.manager.g, com.bumptech.glide.manager.f, j3.c, t3.b, i5.e, o5.b0 {

    /* renamed from: e, reason: collision with root package name */
    public static o f19480e;

    /* renamed from: b, reason: collision with root package name */
    public final int f19481b;

    public /* synthetic */ o() {
        this.f19481b = 5;
    }

    public static synchronized o r() {
        try {
            if (f19480e == null) {
                f19480e = new o(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19480e;
    }

    public static String t(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            str = str.substring(0, 20);
        }
        sb.append(str);
        return sb.toString();
    }

    public static final lb w(Context context, jb jbVar) {
        t5 t5Var = new t5(context);
        lb lbVar = new lb(t5Var);
        sn snVar = new sn(t5Var, jbVar, lbVar, 2, 0);
        r41 r41Var = new r41(7, t5Var, lbVar);
        synchronized (t5Var.f8650b) {
            ib ibVar = new ib((Context) t5Var.f8652d, i4.k.A.f13363r.b(), snVar, r41Var, 0);
            t5Var.f8651c = ibVar;
            ibVar.q();
        }
        return lbVar;
    }

    public static ArrayList x(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new k5((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static final void y(a2.n nVar, un0 un0Var) {
        File externalStorageDirectory;
        if (((Context) un0Var.f9118f) == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty((String) un0Var.f9119j)) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        Context context = (Context) un0Var.f9118f;
        String str = (String) un0Var.f9119j;
        String str2 = (String) un0Var.f9116b;
        Map map = (Map) un0Var.f9117e;
        nVar.f268b = context;
        nVar.f272m = str;
        nVar.f274t = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        nVar.f275u = atomicBoolean;
        atomicBoolean.set(((Boolean) cf.f3339c.k()).booleanValue());
        if (((AtomicBoolean) nVar.f275u).get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            nVar.f276w = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            ((LinkedHashMap) nVar.f270f).put((String) entry.getKey(), (String) entry.getValue());
        }
        es.f4113a.execute(new b8(nVar, 8));
        Map map2 = (Map) nVar.f271j;
        ie ieVar = je.f5689b;
        map2.put("action", ieVar);
        ((Map) nVar.f271j).put("ad_format", ieVar);
        ((Map) nVar.f271j).put("e", je.f5690c);
    }

    public static final void z(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z7) {
        if (adOverlayInfoParcel.N != 4 || adOverlayInfoParcel.f2445f != null) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
            intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.P.f10590j);
            intent.putExtra("shouldCallOnOverlayOpened", z7);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
            intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            l4.g0 g0Var = i4.k.A.f13348c;
            l4.g0.l(context, intent);
            return;
        }
        j4.a aVar = adOverlayInfoParcel.f2444e;
        if (aVar != null) {
            aVar.m();
        }
        f50 f50Var = adOverlayInfoParcel.f2443b0;
        if (f50Var != null) {
            f50Var.zzr();
        }
        Activity activityZzi = adOverlayInfoParcel.f2446j.zzi();
        k4.c cVar = adOverlayInfoParcel.f2442b;
        if (cVar != null && cVar.M && activityZzi != null) {
            context = activityZzi;
        }
        w2.k kVar = i4.k.A.f13346a;
        w2.k.j(context, cVar, adOverlayInfoParcel.f2451w, cVar != null ? cVar.f13989w : null);
    }

    @Override // com.google.android.gms.internal.ads.i3
    public long a(com.google.android.gms.internal.ads.h hVar) {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.i3
    public void b(long j10) {
    }

    @Override // com.bumptech.glide.manager.f
    public void c() {
    }

    @Override // z2.g0
    public void d(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        switch (this.f19481b) {
            case 4:
                mediaMetadataRetriever.setDataSource(new f0((ByteBuffer) obj));
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // com.bumptech.glide.manager.g
    public void e(com.bumptech.glide.manager.h hVar) {
        hVar.j();
    }

    @Override // i5.e
    public i5.d f(Context context, String str, i5.c cVar) {
        int i10 = -1;
        int i11 = 0;
        switch (this.f19481b) {
            case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                i5.d dVar = new i5.d();
                int iE = cVar.e(context, str, true);
                dVar.f13374c = iE;
                if (iE != 0) {
                    dVar.f13375d = 1;
                } else {
                    int iB = cVar.b(context, str);
                    dVar.f13373b = iB;
                    if (iB != 0) {
                        dVar.f13375d = -1;
                    }
                }
                return dVar;
            case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            default:
                i5.d dVar2 = new i5.d();
                int iB2 = cVar.b(context, str);
                dVar2.f13373b = iB2;
                int iE2 = iB2 != 0 ? cVar.e(context, str, false) : cVar.e(context, str, true);
                dVar2.f13374c = iE2;
                int i12 = dVar2.f13373b;
                if (i12 == 0) {
                    if (iE2 == 0) {
                        i10 = 0;
                    }
                    dVar2.f13375d = i10;
                    return dVar2;
                }
                i11 = i12;
                if (iE2 >= i11) {
                    i10 = 1;
                }
                dVar2.f13375d = i10;
                return dVar2;
            case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                i5.d dVar3 = new i5.d();
                int iB3 = cVar.b(context, str);
                dVar3.f13373b = iB3;
                int iE3 = iB3 != 0 ? cVar.e(context, str, false) : cVar.e(context, str, true);
                dVar3.f13374c = iE3;
                int i13 = dVar3.f13373b;
                if (i13 == 0) {
                    if (iE3 == 0) {
                        i10 = 0;
                    }
                    dVar3.f13375d = i10;
                    return dVar3;
                }
                i11 = i13;
                if (i11 < iE3) {
                    i10 = 1;
                }
                dVar3.f13375d = i10;
                return dVar3;
        }
    }

    @Override // com.google.android.gms.internal.ads.i
    public void g() {
        switch (this.f19481b) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // da.a
    public Object get() {
        switch (this.f19481b) {
            case y4.g.ERROR /* 13 */:
                return "com.google.android.datatransport.events";
            case y4.g.INTERRUPTED /* 14 */:
                x3.a aVar = x3.a.f18912f;
                if (aVar != null) {
                    return aVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new z3.c(0);
        }
    }

    @Override // q2.c
    public boolean h(Object obj, File file, q2.n nVar) {
        try {
            i3.c.d(((p2.e) ((b3.c) ((e0) obj).get()).f1850b.f1849a.f1869a).f15899d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }

    @Override // com.bumptech.glide.manager.g
    public void i(com.bumptech.glide.manager.h hVar) {
    }

    @Override // z2.o
    public void j(Bitmap bitmap, t2.d dVar) {
    }

    @Override // com.google.android.gms.internal.ads.i
    public void k(com.google.android.gms.internal.ads.x xVar) {
        switch (this.f19481b) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.gms.internal.ads.kk
    public /* bridge */ /* synthetic */ Object l(JSONObject jSONObject) {
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.i
    public com.google.android.gms.internal.ads.a0 m(int i10, int i11) {
        switch (this.f19481b) {
            case 0:
                return new com.google.android.gms.internal.ads.f();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // q2.q
    public int n(q2.n nVar) {
        return 1;
    }

    @Override // z2.o
    public void o() {
    }

    public void p(String str, String str2, Throwable... thArr) {
        if (this.f19481b <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    public void q(String str, String str2, Throwable... thArr) {
        if (this.f19481b <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public void s(String str, String str2, Throwable... thArr) {
        if (this.f19481b <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public void u(String str, String str2, Throwable... thArr) {
        if (this.f19481b <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    @Override // w2.v
    public w2.u v(w2.a0 a0Var) {
        switch (this.f19481b) {
            case QueueFuseable.SYNC /* 1 */:
                return new d0(a0Var.c(Uri.class, ParcelFileDescriptor.class), 0);
            default:
                return new i0(a0Var.c(w2.l.class, InputStream.class));
        }
    }

    @Override // com.google.android.gms.internal.ads.is
    /* renamed from: zza */
    public void mo4zza(Object obj) {
        l4.b0.k("Ending javascript session.");
        jk jkVar = (jk) ((ik) obj);
        HashSet hashSet = jkVar.f5729e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            l4.b0.k("Unregistering eventhandler: ".concat(String.valueOf(((ni) simpleEntry.getValue()).toString())));
            jkVar.f5728b.e((String) simpleEntry.getKey(), (ni) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // o5.c0
    public Object zzb() {
        switch (this.f19481b) {
            case 25:
                return new o5.b();
            default:
                o5.w wVar = o5.x.f15800b;
                dq0.f0(wVar);
                return wVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.i3
    public com.google.android.gms.internal.ads.x zze() {
        return new com.google.android.gms.internal.ads.m(-9223372036854775807L, 0L);
    }

    public /* synthetic */ o(int i10) {
        this.f19481b = i10;
    }

    @Override // com.google.android.gms.internal.ads.lk
    public /* bridge */ /* synthetic */ JSONObject zzb(Object obj) {
        return (JSONObject) obj;
    }
}