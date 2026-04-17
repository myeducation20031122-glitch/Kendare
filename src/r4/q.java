package r4;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.af;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.ar0;
import com.google.android.gms.internal.ads.bf1;
import com.google.android.gms.internal.ads.c01;
import com.google.android.gms.internal.ads.ce;
import com.google.android.gms.internal.ads.eo1;
import com.google.android.gms.internal.ads.er0;
import com.google.android.gms.internal.ads.es0;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.h01;
import com.google.android.gms.internal.ads.ho0;
import com.google.android.gms.internal.ads.hr;
import com.google.android.gms.internal.ads.l2;
import com.google.android.gms.internal.ads.pf1;
import com.google.android.gms.internal.ads.ta0;
import com.google.android.gms.internal.ads.v;
import com.google.android.gms.internal.ads.vf1;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.za0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q implements c01 {

    /* renamed from: b, reason: collision with root package name */
    public long f16506b;

    /* renamed from: e, reason: collision with root package name */
    public final Object f16507e;

    /* renamed from: f, reason: collision with root package name */
    public Object f16508f;

    /* renamed from: j, reason: collision with root package name */
    public Object f16509j;

    /* renamed from: m, reason: collision with root package name */
    public Object f16510m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f16511n;

    public q(v vVar) {
        this.f16511n = vVar;
        this.f16507e = new ho0(32);
        l2 l2Var = new l2(0L);
        this.f16508f = l2Var;
        this.f16509j = l2Var;
        this.f16510m = l2Var;
    }

    public static l2 c(l2 l2Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= l2Var.f6222e) {
            l2Var = (l2) l2Var.f6224j;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (l2Var.f6222e - j10));
            byteBuffer.put(((eo1) l2Var.f6223f).f4098a, l2Var.c(j10), iMin);
            i10 -= iMin;
            j10 += iMin;
            if (j10 == l2Var.f6222e) {
                l2Var = (l2) l2Var.f6224j;
            }
        }
        return l2Var;
    }

    public static l2 d(l2 l2Var, long j10, byte[] bArr, int i10) {
        while (j10 >= l2Var.f6222e) {
            l2Var = (l2) l2Var.f6224j;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (l2Var.f6222e - j10));
            System.arraycopy(((eo1) l2Var.f6223f).f4098a, l2Var.c(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += iMin;
            if (j10 == l2Var.f6222e) {
                l2Var = (l2) l2Var.f6224j;
            }
        }
        return l2Var;
    }

    public static l2 e(l2 l2Var, vf1 vf1Var, c4.h hVar, ho0 ho0Var) {
        long j10;
        ByteBuffer byteBuffer;
        if (vf1Var.a(1073741824)) {
            long j11 = hVar.f2116e;
            int iR = 1;
            ho0Var.b(1);
            l2 l2VarD = d(l2Var, j11, ho0Var.f5202a, 1);
            long j12 = j11 + 1;
            byte b7 = ho0Var.f5202a[0];
            int i10 = b7 & 128;
            int i11 = b7 & 127;
            pf1 pf1Var = vf1Var.f9298c;
            byte[] bArr = pf1Var.f7393a;
            if (bArr == null) {
                pf1Var.f7393a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z7 = i10 != 0;
            l2Var = d(l2VarD, j12, pf1Var.f7393a, i11);
            long j13 = j12 + i11;
            if (z7) {
                ho0Var.b(2);
                l2Var = d(l2Var, j13, ho0Var.f5202a, 2);
                j13 += 2;
                iR = ho0Var.r();
            }
            int[] iArr = pf1Var.f7396d;
            if (iArr == null || iArr.length < iR) {
                iArr = new int[iR];
            }
            int[] iArr2 = pf1Var.f7397e;
            if (iArr2 == null || iArr2.length < iR) {
                iArr2 = new int[iR];
            }
            if (z7) {
                int i12 = iR * 6;
                ho0Var.b(i12);
                l2Var = d(l2Var, j13, ho0Var.f5202a, i12);
                j13 += i12;
                ho0Var.e(0);
                for (int i13 = 0; i13 < iR; i13++) {
                    iArr[i13] = ho0Var.r();
                    iArr2[i13] = ho0Var.q();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = hVar.f2115b - ((int) (j13 - hVar.f2116e));
            }
            z zVar = (z) hVar.f2117f;
            int i14 = es0.f4119a;
            byte[] bArr2 = zVar.f10313b;
            byte[] bArr3 = pf1Var.f7393a;
            pf1Var.f7398f = iR;
            pf1Var.f7396d = iArr;
            pf1Var.f7397e = iArr2;
            pf1Var.f7394b = bArr2;
            pf1Var.f7393a = bArr3;
            int i15 = zVar.f10312a;
            pf1Var.f7395c = i15;
            int i16 = zVar.f10314c;
            pf1Var.f7399g = i16;
            int i17 = zVar.f10315d;
            pf1Var.f7400h = i17;
            MediaCodec.CryptoInfo cryptoInfo = pf1Var.f7401i;
            cryptoInfo.numSubSamples = iR;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i15;
            if (es0.f4119a >= 24) {
                bf1 bf1Var = pf1Var.f7402j;
                bf1Var.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = bf1Var.f2985b;
                a2.l.u(pattern, i16, i17);
                a2.l.v(bf1Var.f2984a, pattern);
            }
            long j14 = hVar.f2116e;
            int i18 = (int) (j13 - j14);
            hVar.f2116e = j14 + i18;
            hVar.f2115b -= i18;
        }
        if (vf1Var.a(268435456)) {
            ho0Var.b(4);
            l2 l2VarD2 = d(l2Var, hVar.f2116e, ho0Var.f5202a, 4);
            int iQ = ho0Var.q();
            hVar.f2116e += 4;
            hVar.f2115b -= 4;
            vf1Var.e(iQ);
            l2Var = c(l2VarD2, hVar.f2116e, vf1Var.f9299d, iQ);
            hVar.f2116e += iQ;
            int i19 = hVar.f2115b - iQ;
            hVar.f2115b = i19;
            ByteBuffer byteBuffer2 = vf1Var.f9302g;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i19) {
                vf1Var.f9302g = ByteBuffer.allocate(i19);
            } else {
                vf1Var.f9302g.clear();
            }
            j10 = hVar.f2116e;
            byteBuffer = vf1Var.f9302g;
        } else {
            vf1Var.e(hVar.f2115b);
            j10 = hVar.f2116e;
            byteBuffer = vf1Var.f9299d;
        }
        return c(l2Var, j10, byteBuffer, hVar.f2115b);
    }

    public final void a(long j10) {
        l2 l2Var;
        if (j10 != -1) {
            while (true) {
                l2Var = (l2) this.f16508f;
                if (j10 < l2Var.f6222e) {
                    break;
                }
                v vVar = (v) this.f16511n;
                eo1 eo1Var = (eo1) l2Var.f6223f;
                synchronized (vVar) {
                    eo1[] eo1VarArr = (eo1[]) vVar.f9192d;
                    int i10 = vVar.f9191c;
                    vVar.f9191c = i10 + 1;
                    eo1VarArr[i10] = eo1Var;
                    vVar.f9190b--;
                    vVar.notifyAll();
                }
                l2 l2Var2 = (l2) this.f16508f;
                l2Var2.f6223f = null;
                l2 l2Var3 = (l2) l2Var2.f6224j;
                l2Var2.f6224j = null;
                this.f16508f = l2Var3;
            }
            if (((l2) this.f16509j).f6221b < l2Var.f6221b) {
                this.f16509j = l2Var;
            }
        }
    }

    public final int b(int i10) {
        eo1 eo1Var;
        l2 l2Var = (l2) this.f16510m;
        if (((eo1) l2Var.f6223f) == null) {
            v vVar = (v) this.f16511n;
            synchronized (vVar) {
                try {
                    int i11 = vVar.f9190b + 1;
                    vVar.f9190b = i11;
                    int i12 = vVar.f9191c;
                    if (i12 > 0) {
                        eo1[] eo1VarArr = (eo1[]) vVar.f9192d;
                        int i13 = i12 - 1;
                        vVar.f9191c = i13;
                        eo1Var = eo1VarArr[i13];
                        eo1Var.getClass();
                        eo1VarArr[i13] = null;
                    } else {
                        eo1Var = new eo1(new byte[65536]);
                        eo1[] eo1VarArr2 = (eo1[]) vVar.f9192d;
                        int length = eo1VarArr2.length;
                        if (i11 > length) {
                            vVar.f9192d = (eo1[]) Arrays.copyOf(eo1VarArr2, length + length);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            l2 l2Var2 = new l2(((l2) this.f16510m).f6222e);
            l2Var.f6223f = eo1Var;
            l2Var.f6224j = l2Var2;
        }
        return Math.min(i10, (int) (((l2) this.f16510m).f6222e - this.f16506b));
    }

    @Override // com.google.android.gms.internal.ads.c01
    public final void zza(Throwable th) {
        i4.k kVar = i4.k.A;
        kVar.f13355j.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f16506b;
        String message = th.getMessage();
        kVar.f13352g.h("SignalGeneratorImpl.generateSignals", th);
        b bVar = (b) this.f16511n;
        com.bumptech.glide.d.b0(bVar.Q, bVar.f16460n, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(jCurrentTimeMillis)));
        er0 er0VarZ3 = b.z3((h01) this.f16507e, (hr) this.f16508f);
        if (((Boolean) af.f2702e.k()).booleanValue() && er0VarZ3 != null) {
            ar0 ar0Var = (ar0) this.f16510m;
            ar0Var.M(th);
            ar0Var.K(false);
            er0VarZ3.a(ar0Var);
            er0VarZ3.g();
        }
        try {
            ((ar) this.f16509j).m("Internal error. " + message);
        } catch (RemoteException e10) {
            wr.e("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.c01
    /* renamed from: zzb */
    public final void mo28zzb(Object obj) {
        ar0 ar0Var;
        h hVar = (h) obj;
        er0 er0VarZ3 = b.z3((h01) this.f16507e, (hr) this.f16508f);
        ce ceVar = ge.f4857w6;
        j4.q qVar = j4.q.f13781d;
        if (((Boolean) qVar.f13784c.a(ceVar)).booleanValue()) {
            i4.k kVar = i4.k.A;
            kVar.f13355j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f16506b;
            Object obj2 = this.f16511n;
            try {
                try {
                    if (hVar == null) {
                        ((ar) this.f16509j).r1(null, null, null);
                        b bVar = (b) obj2;
                        com.bumptech.glide.d.b0(bVar.Q, bVar.f16460n, "sgs", new Pair("rid", "-1"));
                        ((ar0) this.f16510m).K(true);
                        if (!((Boolean) af.f2702e.k()).booleanValue() || er0VarZ3 == null) {
                            return;
                        }
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(hVar.f16483b);
                            String strOptString = jSONObject.optString("request_id", "");
                            if (TextUtils.isEmpty(strOptString)) {
                                wr.g("The request ID is empty in request JSON.");
                                ((ar) this.f16509j).m("Internal error: request ID is empty in request JSON.");
                                b bVar2 = (b) obj2;
                                com.bumptech.glide.d.b0(bVar2.Q, bVar2.f16460n, "sgf", new Pair("sgf_reason", "rid_missing"));
                                ar0 ar0Var2 = (ar0) this.f16510m;
                                ar0Var2.j("Request ID empty");
                                ar0Var2.K(false);
                                if (!((Boolean) af.f2702e.k()).booleanValue() || er0VarZ3 == null) {
                                    return;
                                }
                            } else {
                                b bVar3 = (b) obj2;
                                b.r3(bVar3, strOptString, hVar.f16483b, bVar3.f16460n);
                                Bundle bundle = hVar.f16484c;
                                b bVar4 = (b) obj2;
                                if (bVar4.V && bundle != null && bundle.getInt(bVar4.X, -1) == -1) {
                                    b bVar5 = (b) obj2;
                                    bundle.putInt(bVar5.X, bVar5.Y.get());
                                }
                                b bVar6 = (b) obj2;
                                if (bVar6.U && bundle != null && TextUtils.isEmpty(bundle.getString(bVar6.W))) {
                                    if (TextUtils.isEmpty(((b) obj2).f16450a0)) {
                                        b bVar7 = (b) obj2;
                                        ((b) obj2).f16450a0 = kVar.f13348c.r(bVar7.f16456f, bVar7.Z.f10587b);
                                    }
                                    b bVar8 = (b) obj2;
                                    bundle.putString(bVar8.W, bVar8.f16450a0);
                                }
                                ((ar) this.f16509j).r1(hVar.f16482a, hVar.f16483b, bundle);
                                b bVar9 = (b) obj2;
                                za0 za0Var = bVar9.Q;
                                ta0 ta0Var = bVar9.f16460n;
                                Pair[] pairArr = new Pair[2];
                                pairArr[0] = new Pair("tqgt", String.valueOf(jCurrentTimeMillis));
                                String str = "na";
                                if (((Boolean) qVar.f13784c.a(ge.f4662c8)).booleanValue()) {
                                    try {
                                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                                    } catch (JSONException e10) {
                                        wr.e("Error retrieving JSONObject from the requestJson, ", e10);
                                    }
                                }
                                pairArr[1] = new Pair("tpc", str);
                                com.bumptech.glide.d.b0(za0Var, ta0Var, "sgs", pairArr);
                                ((ar0) this.f16510m).K(true);
                                if (!((Boolean) af.f2702e.k()).booleanValue() || er0VarZ3 == null) {
                                    return;
                                }
                            }
                        } catch (JSONException e11) {
                            wr.g("Failed to create JSON object from the request string.");
                            ((ar) this.f16509j).m("Internal error for request JSON: " + e11.toString());
                            b bVar10 = (b) obj2;
                            com.bumptech.glide.d.b0(bVar10.Q, bVar10.f16460n, "sgf", new Pair("sgf_reason", "request_invalid"));
                            ar0 ar0Var3 = (ar0) this.f16510m;
                            ar0Var3.M(e11);
                            ar0Var3.K(false);
                            i4.k.A.f13352g.h("SignalGeneratorImpl.generateSignals.onSuccess", e11);
                            if (!((Boolean) af.f2702e.k()).booleanValue() || er0VarZ3 == null) {
                                return;
                            }
                        }
                    }
                } catch (RemoteException e12) {
                    ar0 ar0Var4 = (ar0) this.f16510m;
                    ar0Var4.M(e12);
                    ar0Var4.K(false);
                    wr.e("", e12);
                    i4.k.A.f13352g.h("SignalGeneratorImpl.generateSignals.onSuccess", e12);
                    if (!((Boolean) af.f2702e.k()).booleanValue() || er0VarZ3 == null) {
                        return;
                    }
                }
                ar0Var = (ar0) this.f16510m;
            } catch (Throwable th) {
                if (((Boolean) af.f2702e.k()).booleanValue() && er0VarZ3 != null) {
                    er0VarZ3.a((ar0) this.f16510m);
                    er0VarZ3.g();
                }
                throw th;
            }
        } else {
            try {
                ((ar) this.f16509j).m("QueryInfo generation has been disabled.");
            } catch (RemoteException e13) {
                wr.d("QueryInfo generation has been disabled.".concat(e13.toString()));
            }
            if (!((Boolean) af.f2702e.k()).booleanValue() || er0VarZ3 == null) {
                return;
            }
            ar0Var = (ar0) this.f16510m;
            ar0Var.j("QueryInfo generation has been disabled.");
            ar0Var.K(false);
        }
        er0VarZ3.a(ar0Var);
        er0VarZ3.g();
    }

    public q(b bVar, h01 h01Var, hr hrVar, ar arVar, ar0 ar0Var, long j10) {
        this.f16511n = bVar;
        this.f16507e = h01Var;
        this.f16508f = hrVar;
        this.f16509j = arVar;
        this.f16510m = ar0Var;
        this.f16506b = j10;
    }
}