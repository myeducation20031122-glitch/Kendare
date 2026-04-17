package t5;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.measurement.h8;
import com.google.android.gms.internal.measurement.i8;
import com.google.android.gms.internal.measurement.u8;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n3 extends t5 {
    public static final void A(StringBuilder sb, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        x(i10 + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void B(StringBuilder sb, int i10, String str, com.google.android.gms.internal.measurement.s1 s1Var) {
        if (s1Var == null) {
            return;
        }
        x(i10, sb);
        sb.append(str);
        sb.append(" {\n");
        if (s1Var.r()) {
            int iW = s1Var.w();
            A(sb, i10, "comparison_type", iW != 1 ? iW != 2 ? iW != 3 ? iW != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (s1Var.t()) {
            A(sb, i10, "match_as_float", Boolean.valueOf(s1Var.q()));
        }
        if (s1Var.s()) {
            A(sb, i10, "comparison_value", s1Var.n());
        }
        if (s1Var.v()) {
            A(sb, i10, "min_comparison_value", s1Var.p());
        }
        if (s1Var.u()) {
            A(sb, i10, "max_comparison_value", s1Var.o());
        }
        x(i10, sb);
        sb.append("}\n");
    }

    public static int C(com.google.android.gms.internal.measurement.t2 t2Var, String str) {
        for (int i10 = 0; i10 < ((com.google.android.gms.internal.measurement.u2) t2Var.f11034e).i1(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.u2) t2Var.f11034e).v1(i10).p())) {
                return i10;
            }
        }
        return -1;
    }

    public static com.google.android.gms.internal.measurement.v4 I(com.google.android.gms.internal.measurement.v4 v4Var, byte[] bArr) throws com.google.android.gms.internal.measurement.e5 {
        com.google.android.gms.internal.measurement.o4 o4VarA;
        com.google.android.gms.internal.measurement.o4 o4Var = com.google.android.gms.internal.measurement.o4.f10918b;
        if (o4Var == null) {
            synchronized (com.google.android.gms.internal.measurement.o4.class) {
                try {
                    o4VarA = com.google.android.gms.internal.measurement.o4.f10918b;
                    if (o4VarA == null) {
                        o4VarA = com.google.android.gms.internal.measurement.s4.a();
                        com.google.android.gms.internal.measurement.o4.f10918b = o4VarA;
                    }
                } finally {
                }
            }
            o4Var = o4VarA;
        }
        v4Var.getClass();
        if (o4Var != null) {
            v4Var.d(bArr, bArr.length, o4Var);
            return v4Var;
        }
        v4Var.d(bArr, bArr.length, com.google.android.gms.internal.measurement.o4.a());
        return v4Var;
    }

    public static ArrayList M(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static boolean P(int i10, com.google.android.gms.internal.measurement.a5 a5Var) {
        if (i10 < a5Var.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) a5Var.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean R(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void U(com.google.android.gms.internal.measurement.k2 k2Var, String str, Long l10) {
        List listUnmodifiableList = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.l2) k2Var.f11034e).s());
        int i10 = 0;
        while (true) {
            if (i10 >= listUnmodifiableList.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.p2) listUnmodifiableList.get(i10)).q())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.o2 o2VarP = com.google.android.gms.internal.measurement.p2.p();
        o2VarP.j(str);
        if (l10 instanceof Long) {
            o2VarP.i(l10.longValue());
        }
        if (i10 < 0) {
            k2Var.k(o2VarP);
            return;
        }
        if (k2Var.f11035f) {
            k2Var.g();
            k2Var.f11035f = false;
        }
        com.google.android.gms.internal.measurement.l2.t((com.google.android.gms.internal.measurement.l2) k2Var.f11034e, i10, (com.google.android.gms.internal.measurement.p2) o2VarP.e());
    }

    public static final com.google.android.gms.internal.measurement.p2 s(com.google.android.gms.internal.measurement.l2 l2Var, String str) {
        for (com.google.android.gms.internal.measurement.p2 p2Var : l2Var.s()) {
            if (p2Var.q().equals(str)) {
                return p2Var;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable t(com.google.android.gms.internal.measurement.l2 l2Var, String str) {
        com.google.android.gms.internal.measurement.p2 p2VarS = s(l2Var, str);
        if (p2VarS == null) {
            return null;
        }
        if (p2VarS.H()) {
            return p2VarS.r();
        }
        if (p2VarS.F()) {
            return Long.valueOf(p2VarS.o());
        }
        if (p2VarS.D()) {
            return Double.valueOf(p2VarS.l());
        }
        if (p2VarS.n() <= 0) {
            return null;
        }
        com.google.android.gms.internal.measurement.b5<com.google.android.gms.internal.measurement.p2> b5VarS = p2VarS.s();
        ArrayList arrayList = new ArrayList();
        for (com.google.android.gms.internal.measurement.p2 p2Var : b5VarS) {
            if (p2Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.p2 p2Var2 : p2Var.s()) {
                    if (p2Var2.H()) {
                        bundle.putString(p2Var2.q(), p2Var2.r());
                    } else if (p2Var2.F()) {
                        bundle.putLong(p2Var2.q(), p2Var2.o());
                    } else if (p2Var2.D()) {
                        bundle.putDouble(p2Var2.q(), p2Var2.l());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void x(int i10, StringBuilder sb) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("  ");
        }
    }

    public static final String y(boolean z7, boolean z10, boolean z11) {
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append("Dynamic ");
        }
        if (z10) {
            sb.append("Sequence ");
        }
        if (z11) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final void z(StringBuilder sb, String str, com.google.android.gms.internal.measurement.y2 y2Var) {
        if (y2Var == null) {
            return;
        }
        x(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (y2Var.m() != 0) {
            x(4, sb);
            sb.append("results: ");
            int i10 = 0;
            for (Long l10 : y2Var.u()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb.append(", ");
                }
                sb.append(l10);
                i10 = i11;
            }
            sb.append('\n');
        }
        if (y2Var.o() != 0) {
            x(4, sb);
            sb.append("status: ");
            int i12 = 0;
            for (Long l11 : y2Var.w()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb.append(", ");
                }
                sb.append(l11);
                i12 = i13;
            }
            sb.append('\n');
        }
        if (y2Var.l() != 0) {
            x(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i14 = 0;
            for (com.google.android.gms.internal.measurement.j2 j2Var : y2Var.t()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb.append(", ");
                }
                sb.append(j2Var.r() ? Integer.valueOf(j2Var.l()) : null);
                sb.append(":");
                sb.append(j2Var.q() ? Long.valueOf(j2Var.m()) : null);
                i14 = i15;
            }
            sb.append("}\n");
        }
        if (y2Var.n() != 0) {
            x(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i16 = 0;
            for (com.google.android.gms.internal.measurement.a3 a3Var : y2Var.v()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb.append(", ");
                }
                sb.append(a3Var.s() ? Integer.valueOf(a3Var.m()) : null);
                sb.append(": [");
                Iterator it = a3Var.p().iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i19 = i18 + 1;
                    if (i18 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i18 = i19;
                }
                sb.append("]");
                i16 = i17;
            }
            sb.append("}\n");
        }
        x(3, sb);
        sb.append("}\n");
    }

    public final boolean D() {
        p();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((b4) this.f15046b).f17234b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final long E(byte[] bArr) throws NoSuchAlgorithmException {
        b4 b4Var = (b4) this.f15046b;
        b6 b6Var = b4Var.O;
        b4.g(b6Var);
        b6Var.o();
        MessageDigest messageDigestX = b6.x();
        if (messageDigestX != null) {
            return b6.s0(messageDigestX.digest(bArr));
        }
        i3 i3Var = b4Var.f17251w;
        b4.i(i3Var);
        i3Var.f17397n.a("Failed to get MD5");
        return 0L;
    }

    public final Bundle F(Map map, boolean z7) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z7) {
                ((i8) h8.f10811e.f10812b.zza()).getClass();
                ArrayList arrayList = (ArrayList) obj;
                if (((b4) this.f15046b).f17249t.y(null, a3.f17174f0)) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        arrayList2.add(F((Map) arrayList.get(i10), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        arrayList3.add(F((Map) arrayList.get(i11), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList3);
                }
            }
        }
        return bundle;
    }

    public final Parcelable G(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (b5.b unused) {
            i3 i3Var = ((b4) this.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.f17397n.a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final q H(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle bundleF = F(bVar.f10681c, true);
        String string = (!bundleF.containsKey("_o") || (obj = bundleF.get("_o")) == null) ? "app" : obj.toString();
        String strK0 = dq0.K0(bVar.f10679a, j4.f17444a, j4.f17446c);
        if (strK0 == null) {
            strK0 = bVar.f10679a;
        }
        return new q(strK0, new p(bundleF), string, bVar.f10680b);
    }

    public final String J(com.google.android.gms.internal.measurement.s2 s2Var) {
        StringBuilder sbN = ic1.n("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.u2 u2Var : s2Var.n()) {
            if (u2Var != null) {
                x(1, sbN);
                sbN.append("bundle {\n");
                if (u2Var.W0()) {
                    A(sbN, 1, "protocol_version", Integer.valueOf(u2Var.f1()));
                }
                u8.a();
                b4 b4Var = (b4) this.f15046b;
                if (b4Var.f17249t.y(null, a3.f17202t0) && u2Var.Z0()) {
                    A(sbN, 1, "session_stitching_token", u2Var.v());
                }
                A(sbN, 1, "platform", u2Var.t());
                if (u2Var.S0()) {
                    A(sbN, 1, "gmp_version", Long.valueOf(u2Var.n1()));
                }
                if (u2Var.d1()) {
                    A(sbN, 1, "uploading_gmp_version", Long.valueOf(u2Var.s1()));
                }
                if (u2Var.Q0()) {
                    A(sbN, 1, "dynamite_version", Long.valueOf(u2Var.l1()));
                }
                if (u2Var.N0()) {
                    A(sbN, 1, "config_version", Long.valueOf(u2Var.j1()));
                }
                A(sbN, 1, "gmp_app_id", u2Var.q());
                A(sbN, 1, "admob_app_id", u2Var.w1());
                A(sbN, 1, "app_id", u2Var.x1());
                A(sbN, 1, "app_version", u2Var.l());
                if (u2Var.j0()) {
                    A(sbN, 1, "app_version_major", Integer.valueOf(u2Var.K()));
                }
                A(sbN, 1, "firebase_instance_id", u2Var.p());
                if (u2Var.P0()) {
                    A(sbN, 1, "dev_cert_hash", Long.valueOf(u2Var.k1()));
                }
                A(sbN, 1, "app_store", u2Var.z1());
                if (u2Var.c1()) {
                    A(sbN, 1, "upload_timestamp_millis", Long.valueOf(u2Var.r1()));
                }
                if (u2Var.a1()) {
                    A(sbN, 1, "start_timestamp_millis", Long.valueOf(u2Var.q1()));
                }
                if (u2Var.R0()) {
                    A(sbN, 1, "end_timestamp_millis", Long.valueOf(u2Var.m1()));
                }
                if (u2Var.V0()) {
                    A(sbN, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(u2Var.p1()));
                }
                if (u2Var.U0()) {
                    A(sbN, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(u2Var.o1()));
                }
                A(sbN, 1, "app_instance_id", u2Var.y1());
                A(sbN, 1, "resettable_device_id", u2Var.u());
                A(sbN, 1, "ds_id", u2Var.o());
                if (u2Var.T0()) {
                    A(sbN, 1, "limited_ad_tracking", Boolean.valueOf(u2Var.h0()));
                }
                A(sbN, 1, "os_version", u2Var.s());
                A(sbN, 1, "device_model", u2Var.n());
                A(sbN, 1, "user_default_language", u2Var.w());
                if (u2Var.b1()) {
                    A(sbN, 1, "time_zone_offset_minutes", Integer.valueOf(u2Var.h1()));
                }
                if (u2Var.k0()) {
                    A(sbN, 1, "bundle_sequential_index", Integer.valueOf(u2Var.K0()));
                }
                if (u2Var.Y0()) {
                    A(sbN, 1, "service_upload", Boolean.valueOf(u2Var.i0()));
                }
                A(sbN, 1, "health_monitor", u2Var.r());
                if (u2Var.X0()) {
                    A(sbN, 1, "retry_counter", Integer.valueOf(u2Var.g1()));
                }
                if (u2Var.O0()) {
                    A(sbN, 1, "consent_signals", u2Var.m());
                }
                com.google.android.gms.internal.measurement.b5<com.google.android.gms.internal.measurement.c3> b5VarZ = u2Var.z();
                if (b5VarZ != null) {
                    for (com.google.android.gms.internal.measurement.c3 c3Var : b5VarZ) {
                        if (c3Var != null) {
                            x(2, sbN);
                            sbN.append("user_property {\n");
                            A(sbN, 2, "set_timestamp_millis", c3Var.B() ? Long.valueOf(c3Var.n()) : null);
                            A(sbN, 2, "name", b4Var.P.f(c3Var.p()));
                            A(sbN, 2, "string_value", c3Var.q());
                            A(sbN, 2, "int_value", c3Var.A() ? Long.valueOf(c3Var.m()) : null);
                            A(sbN, 2, "double_value", c3Var.z() ? Double.valueOf(c3Var.l()) : null);
                            x(2, sbN);
                            sbN.append("}\n");
                        }
                    }
                }
                com.google.android.gms.internal.measurement.b5<com.google.android.gms.internal.measurement.h2> b5VarX = u2Var.x();
                if (b5VarX != null) {
                    for (com.google.android.gms.internal.measurement.h2 h2Var : b5VarX) {
                        if (h2Var != null) {
                            x(2, sbN);
                            sbN.append("audience_membership {\n");
                            if (h2Var.u()) {
                                A(sbN, 2, "audience_id", Integer.valueOf(h2Var.l()));
                            }
                            if (h2Var.v()) {
                                A(sbN, 2, "new_audience", Boolean.valueOf(h2Var.t()));
                            }
                            z(sbN, "current_data", h2Var.n());
                            if (h2Var.w()) {
                                z(sbN, "previous_data", h2Var.o());
                            }
                            x(2, sbN);
                            sbN.append("}\n");
                        }
                    }
                }
                com.google.android.gms.internal.measurement.b5<com.google.android.gms.internal.measurement.l2> b5VarY = u2Var.y();
                if (b5VarY != null) {
                    for (com.google.android.gms.internal.measurement.l2 l2Var : b5VarY) {
                        if (l2Var != null) {
                            x(2, sbN);
                            sbN.append("event {\n");
                            A(sbN, 2, "name", b4Var.P.d(l2Var.r()));
                            if (l2Var.D()) {
                                A(sbN, 2, "timestamp_millis", Long.valueOf(l2Var.o()));
                            }
                            if (l2Var.C()) {
                                A(sbN, 2, "previous_timestamp_millis", Long.valueOf(l2Var.n()));
                            }
                            if (l2Var.B()) {
                                A(sbN, 2, "count", Integer.valueOf(l2Var.l()));
                            }
                            if (l2Var.m() != 0) {
                                u(sbN, 2, l2Var.s());
                            }
                            x(2, sbN);
                            sbN.append("}\n");
                        }
                    }
                }
                x(1, sbN);
                sbN.append("}\n");
            }
        }
        sbN.append("}\n");
        return sbN.toString();
    }

    public final String K(com.google.android.gms.internal.measurement.u1 u1Var) {
        StringBuilder sbN = ic1.n("\nproperty_filter {\n");
        if (u1Var.t()) {
            A(sbN, 0, "filter_id", Integer.valueOf(u1Var.l()));
        }
        A(sbN, 0, "property_name", ((b4) this.f15046b).P.f(u1Var.o()));
        String strY = y(u1Var.q(), u1Var.r(), u1Var.s());
        if (!strY.isEmpty()) {
            A(sbN, 0, "filter_type", strY);
        }
        w(sbN, 1, u1Var.m());
        sbN.append("}\n");
        return sbN.toString();
    }

    public final List L(com.google.android.gms.internal.measurement.a5 a5Var, List list) {
        int i10;
        ArrayList arrayList = new ArrayList(a5Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            Object obj = this.f15046b;
            if (iIntValue < 0) {
                i3 i3Var = ((b4) obj).f17251w;
                b4.i(i3Var);
                i3Var.f17400w.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue2 = num.intValue() / 64;
                if (iIntValue2 >= arrayList.size()) {
                    i3 i3Var2 = ((b4) obj).f17251w;
                    b4.i(i3Var2);
                    i3Var2.f17400w.c(num, "Ignoring bit index greater than bitSet size", Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue2, Long.valueOf(((Long) arrayList.get(iIntValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HashMap N(Bundle bundle, boolean z7) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            ((i8) h8.f10811e.f10812b.zza()).getClass();
            if (((b4) this.f15046b).f17249t.y(null, a3.f17174f0)) {
                if ((obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                    if (!z7) {
                        ArrayList arrayList = new ArrayList();
                        if (obj instanceof Parcelable[]) {
                            for (Parcelable parcelable : (Parcelable[]) obj) {
                                if (parcelable instanceof Bundle) {
                                    arrayList.add(N((Bundle) parcelable, false));
                                }
                            }
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList2 = (ArrayList) obj;
                            int size = arrayList2.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                Object obj2 = arrayList2.get(i10);
                                if (obj2 instanceof Bundle) {
                                    arrayList.add(N((Bundle) obj2, false));
                                }
                            }
                        } else if (obj instanceof Bundle) {
                            arrayList.add(N((Bundle) obj, false));
                        }
                        map.put(str, arrayList);
                    }
                } else if (obj == null) {
                    map.put(str, obj);
                }
            } else if ((obj instanceof Bundle[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (!z7) {
                }
            } else if (obj == null) {
            }
        }
        return map;
    }

    public final void O(com.google.android.gms.internal.measurement.o2 o2Var, Object obj) {
        if (o2Var.f11035f) {
            o2Var.g();
            o2Var.f11035f = false;
        }
        com.google.android.gms.internal.measurement.p2.v((com.google.android.gms.internal.measurement.p2) o2Var.f11034e);
        if (o2Var.f11035f) {
            o2Var.g();
            o2Var.f11035f = false;
        }
        com.google.android.gms.internal.measurement.p2.x((com.google.android.gms.internal.measurement.p2) o2Var.f11034e);
        if (o2Var.f11035f) {
            o2Var.g();
            o2Var.f11035f = false;
        }
        com.google.android.gms.internal.measurement.p2.z((com.google.android.gms.internal.measurement.p2) o2Var.f11034e);
        if (o2Var.f11035f) {
            o2Var.g();
            o2Var.f11035f = false;
        }
        com.google.android.gms.internal.measurement.p2.C((com.google.android.gms.internal.measurement.p2) o2Var.f11034e);
        if (obj instanceof String) {
            o2Var.k((String) obj);
            return;
        }
        if (obj instanceof Long) {
            o2Var.i(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (o2Var.f11035f) {
                o2Var.g();
                o2Var.f11035f = false;
            }
            com.google.android.gms.internal.measurement.p2.y((com.google.android.gms.internal.measurement.p2) o2Var.f11034e, dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            i3 i3Var = ((b4) this.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.f17397n.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.o2 o2VarP = com.google.android.gms.internal.measurement.p2.p();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.o2 o2VarP2 = com.google.android.gms.internal.measurement.p2.p();
                    o2VarP2.j(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        o2VarP2.i(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        o2VarP2.k((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        if (o2VarP2.f11035f) {
                            o2VarP2.g();
                            o2VarP2.f11035f = false;
                        }
                        com.google.android.gms.internal.measurement.p2.y((com.google.android.gms.internal.measurement.p2) o2VarP2.f11034e, dDoubleValue2);
                    }
                    if (o2VarP.f11035f) {
                        o2VarP.g();
                        o2VarP.f11035f = false;
                    }
                    com.google.android.gms.internal.measurement.p2.A((com.google.android.gms.internal.measurement.p2) o2VarP.f11034e, (com.google.android.gms.internal.measurement.p2) o2VarP2.e());
                }
                if (((com.google.android.gms.internal.measurement.p2) o2VarP.f11034e).n() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.p2) o2VarP.e());
                }
            }
        }
        if (o2Var.f11035f) {
            o2Var.g();
            o2Var.f11035f = false;
        }
        com.google.android.gms.internal.measurement.p2.B((com.google.android.gms.internal.measurement.p2) o2Var.f11034e, arrayList);
    }

    public final boolean Q(long j10, long j11) {
        if (j10 == 0 || j11 <= 0) {
            return true;
        }
        ((b4) this.f15046b).Q.getClass();
        return Math.abs(System.currentTimeMillis() - j10) > j11;
    }

    public final byte[] T(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            i3 i3Var = ((b4) this.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.f17397n.b(e10, "Failed to gzip content");
            throw e10;
        }
    }

    @Override // t5.t5
    public final boolean r() {
        return false;
    }

    public final void u(StringBuilder sb, int i10, com.google.android.gms.internal.measurement.b5 b5Var) {
        if (b5Var == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = b5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.p2 p2Var = (com.google.android.gms.internal.measurement.p2) it.next();
            if (p2Var != null) {
                x(i11, sb);
                sb.append("param {\n");
                A(sb, i11, "name", p2Var.G() ? ((b4) this.f15046b).P.e(p2Var.q()) : null);
                A(sb, i11, "string_value", p2Var.H() ? p2Var.r() : null);
                A(sb, i11, "int_value", p2Var.F() ? Long.valueOf(p2Var.o()) : null);
                A(sb, i11, "double_value", p2Var.D() ? Double.valueOf(p2Var.l()) : null);
                if (p2Var.n() > 0) {
                    u(sb, i11, p2Var.s());
                }
                x(i11, sb);
                sb.append("}\n");
            }
        }
    }

    public final void w(StringBuilder sb, int i10, com.google.android.gms.internal.measurement.p1 p1Var) {
        String str;
        if (p1Var == null) {
            return;
        }
        x(i10, sb);
        sb.append("filter {\n");
        if (p1Var.r()) {
            A(sb, i10, "complement", Boolean.valueOf(p1Var.q()));
        }
        if (p1Var.t()) {
            A(sb, i10, "param_name", ((b4) this.f15046b).P.e(p1Var.o()));
        }
        if (p1Var.u()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.w1 w1VarN = p1Var.n();
            if (w1VarN != null) {
                x(i11, sb);
                sb.append("string_filter {\n");
                if (w1VarN.t()) {
                    switch (w1VarN.u()) {
                        case QueueFuseable.SYNC /* 1 */:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            str = "PARTIAL";
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    A(sb, i11, "match_type", str);
                }
                if (w1VarN.s()) {
                    A(sb, i11, "expression", w1VarN.o());
                }
                if (w1VarN.r()) {
                    A(sb, i11, "case_sensitive", Boolean.valueOf(w1VarN.q()));
                }
                if (w1VarN.l() > 0) {
                    x(i10 + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : w1VarN.p()) {
                        x(i10 + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                x(i11, sb);
                sb.append("}\n");
            }
        }
        if (p1Var.s()) {
            B(sb, i10 + 1, "number_filter", p1Var.m());
        }
        x(i10, sb);
        sb.append("}\n");
    }
}