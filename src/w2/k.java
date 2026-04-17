package w2;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.location.Location;
import android.media.AudioManager;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.ads.ce;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.wr;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class k implements j, v, z2.g0, c3.a, com.bumptech.glide.manager.n, j3.a, t3.b, i5.c, i5.e, o5.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18565b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k() {
        this(4);
        this.f18565b = 4;
    }

    public static Location g(GoogleApiClient googleApiClient) throws Throwable {
        boolean zAwait;
        boolean z7 = false;
        fc.t.b("GoogleApiClient parameter is required.", googleApiClient != null);
        p5.q qVar = (p5.q) googleApiClient.e();
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        x5.l lVar = new x5.l();
        try {
            qVar.K(new r5.c(Long.MAX_VALUE, 0, false, null, null), lVar);
            lVar.f19011a.b(new d3.d(24, atomicReference, countDownLatch));
            try {
                long nanos = TimeUnit.SECONDS.toNanos(30L);
                long jNanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            zAwait = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th) {
                            th = th;
                            z7 = true;
                            if (z7) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = jNanoTime - System.nanoTime();
                        z7 = true;
                    }
                }
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                if (zAwait) {
                    return (Location) atomicReference.get();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static final boolean h(Context context, Intent intent, k4.n nVar, k4.l lVar, boolean z7) {
        int iV;
        if (z7) {
            Uri data = intent.getData();
            try {
                i4.k.A.f13348c.getClass();
                iV = l4.g0.v(context, data);
                if (nVar != null) {
                    nVar.zzg();
                }
            } catch (ActivityNotFoundException e10) {
                wr.g(e10.getMessage());
                iV = 6;
            }
            if (lVar != null) {
                lVar.b(iV);
            }
            return iV == 5;
        }
        try {
            l4.b0.k("Launching an intent: " + intent.toURI());
            l4.g0 g0Var = i4.k.A.f13348c;
            l4.g0.l(context, intent);
            if (nVar != null) {
                nVar.zzg();
            }
            if (lVar != null) {
                lVar.a(true);
            }
            return true;
        } catch (ActivityNotFoundException e11) {
            wr.g(e11.getMessage());
            if (lVar != null) {
                lVar.a(false);
            }
            return false;
        }
    }

    public static final boolean i() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final boolean j(Context context, k4.c cVar, k4.n nVar, k4.l lVar) {
        String strConcat;
        int i10 = 0;
        if (cVar == null) {
            strConcat = "No intent data for launcher overlay.";
        } else {
            ge.a(context);
            boolean z7 = cVar.M;
            Intent intent = cVar.f13988u;
            if (intent != null) {
                return h(context, intent, nVar, lVar, z7);
            }
            Intent intent2 = new Intent();
            String str = cVar.f13982e;
            if (!TextUtils.isEmpty(str)) {
                String str2 = cVar.f13983f;
                boolean zIsEmpty = TextUtils.isEmpty(str2);
                Uri uri = Uri.parse(str);
                if (zIsEmpty) {
                    intent2.setData(uri);
                } else {
                    intent2.setDataAndType(uri, str2);
                }
                intent2.setAction("android.intent.action.VIEW");
                String str3 = cVar.f13984j;
                if (!TextUtils.isEmpty(str3)) {
                    intent2.setPackage(str3);
                }
                String str4 = cVar.f13985m;
                if (!TextUtils.isEmpty(str4)) {
                    String[] strArrSplit = str4.split("/", 2);
                    if (strArrSplit.length < 2) {
                        strConcat = "Could not parse component name from open GMSG: ".concat(str4);
                    } else {
                        intent2.setClassName(strArrSplit[0], strArrSplit[1]);
                    }
                }
                String str5 = cVar.f13986n;
                if (!TextUtils.isEmpty(str5)) {
                    try {
                        i10 = Integer.parseInt(str5);
                    } catch (NumberFormatException unused) {
                        wr.g("Could not parse intent flags.");
                    }
                    intent2.addFlags(i10);
                }
                ce ceVar = ge.I3;
                j4.q qVar = j4.q.f13781d;
                if (((Boolean) qVar.f13784c.a(ceVar)).booleanValue()) {
                    intent2.addFlags(268435456);
                    intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
                } else {
                    if (((Boolean) qVar.f13784c.a(ge.H3)).booleanValue()) {
                        l4.g0 g0Var = i4.k.A.f13348c;
                        l4.g0.x(context, intent2);
                    }
                }
                return h(context, intent2, nVar, lVar, z7);
            }
            strConcat = "Open GMSG did not contain a URL.";
        }
        wr.g(strConcat);
        return false;
    }

    @Override // w2.j
    public final Class a() {
        return InputStream.class;
    }

    @Override // i5.c
    public final int b(Context context, String str) {
        return i5.f.a(context, str);
    }

    @Override // c3.a
    public final s2.e0 c(s2.e0 e0Var, q2.n nVar) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((p2.e) ((b3.c) e0Var.get()).f1850b.f1849a.f1869a).f15899d.asReadOnlyBuffer();
        AtomicReference atomicReference = i3.c.f13284a;
        i3.b bVar = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new i3.b(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (bVar != null && bVar.f13282b == 0 && bVar.f13283c == bVar.f13281a.length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new z2.c0(bArrArray);
    }

    @Override // z2.g0
    public final void d(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // i5.c
    public final int e(Context context, String str, boolean z7) {
        return i5.f.d(context, str, z7);
    }

    @Override // i5.e
    public final i5.d f(Context context, String str, i5.c cVar) {
        int i10 = 0;
        switch (this.f18565b) {
            case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                i5.d dVar = new i5.d();
                int iB = cVar.b(context, str);
                dVar.f13373b = iB;
                if (iB != 0) {
                    dVar.f13375d = -1;
                } else {
                    int iE = cVar.e(context, str, true);
                    dVar.f13374c = iE;
                    if (iE != 0) {
                        dVar.f13375d = 1;
                    }
                }
                return dVar;
            case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                i5.d dVar2 = new i5.d();
                dVar2.f13373b = cVar.b(context, str);
                int iE2 = cVar.e(context, str, true);
                dVar2.f13374c = iE2;
                int i11 = dVar2.f13373b;
                if (i11 == 0) {
                    if (iE2 != 0) {
                    }
                    dVar2.f13375d = i10;
                    return dVar2;
                }
                i10 = i11;
                i10 = i10 >= iE2 ? -1 : 1;
                dVar2.f13375d = i10;
                return dVar2;
            default:
                i5.d dVar3 = new i5.d();
                dVar3.f13373b = cVar.b(context, str);
                int iE3 = cVar.e(context, str, true);
                dVar3.f13374c = iE3;
                int i12 = dVar3.f13373b;
                if (i12 == 0) {
                    if (iE3 != 0) {
                    }
                    dVar3.f13375d = i10;
                    return dVar3;
                }
                i10 = i12;
                i10 = iE3 >= i10 ? 1 : -1;
                dVar3.f13375d = i10;
                return dVar3;
        }
    }

    @Override // da.a
    public final Object get() {
        int i10 = 1;
        switch (this.f18565b) {
            case y4.g.ERROR /* 13 */:
                return new l2.b(Executors.newSingleThreadExecutor(), i10);
            case y4.g.INTERRUPTED /* 14 */:
                return Integer.valueOf(x3.o.f18944j);
            default:
                return new z3.c(i10);
        }
    }

    @Override // j3.a
    public final Object k() {
        return new ArrayList();
    }

    public boolean l(Activity activity, Configuration configuration) {
        return false;
    }

    public void m(Context context) {
    }

    public boolean n(Context context) {
        return false;
    }

    public int o(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    public int p(AudioManager audioManager) {
        return 0;
    }

    @Override // w2.j
    public final Object q(File file) {
        return new FileInputStream(file);
    }

    public void r(Activity activity) {
    }

    public int s(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    @Override // w2.v
    public final u v(a0 a0Var) {
        int i10 = 0;
        switch (this.f18565b) {
            case QueueFuseable.SYNC /* 1 */:
                return new d0(a0Var.c(Uri.class, AssetFileDescriptor.class), i10);
            case 2:
                return new d0(a0Var.c(Uri.class, InputStream.class), i10);
            default:
                return new d0(a0Var.c(l.class, InputStream.class), 1);
        }
    }

    @Override // w2.j
    public final void w(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // o5.c0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Handler handler = o5.x.f15799a;
        dq0.f0(handler);
        return handler;
    }

    public /* synthetic */ k(int i10) {
        this.f18565b = i10;
    }

    public /* synthetic */ k(int i10, int i11) {
        this.f18565b = i10;
    }
}