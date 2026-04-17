package t5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.dq0;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b6 extends g4 {

    /* renamed from: t, reason: collision with root package name */
    public static final String[] f17259t = {"firebase_", "google_", "ga_"};

    /* renamed from: u, reason: collision with root package name */
    public static final String[] f17260u = {"_err"};

    /* renamed from: f, reason: collision with root package name */
    public SecureRandom f17261f;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicLong f17262j;

    /* renamed from: m, reason: collision with root package name */
    public int f17263m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f17264n;

    public b6(b4 b4Var) {
        super(b4Var);
        this.f17264n = null;
        this.f17262j = new AtomicLong(0L);
    }

    public static void C(y4 y4Var, Bundle bundle, boolean z7) {
        if (bundle != null && y4Var != null) {
            if (!bundle.containsKey("_sc") || z7) {
                String str = y4Var.f17690a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = y4Var.f17691b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", y4Var.f17692c);
                return;
            }
            z7 = false;
        }
        if (bundle != null && y4Var == null && z7) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void F(a6 a6Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        h0(i10, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        a6Var.a(str, bundle);
    }

    public static boolean Z(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean b0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean c0(String str) {
        fc.t.g(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean d0(Context context) {
        ActivityInfo receiverInfo;
        fc.t.k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean e0(Context context) {
        fc.t.k(context);
        return l0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean f0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            fc.t.k(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static byte[] g0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static final boolean h0(int i10, Bundle bundle) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    public static boolean k0(String str, String[] strArr) {
        fc.t.k(strArr);
        for (Object obj : strArr) {
            if (str == obj) {
                return true;
            }
            if (str != null && str.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean l0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static long s0(byte[] bArr) {
        fc.t.k(bArr);
        int length = bArr.length;
        int i10 = 0;
        fc.t.n(length > 0);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (bArr[i11] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    public static String w(String str, int i10, boolean z7) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z7) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    public static MessageDigest x() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList z(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", cVar.f17265b);
            bundle.putString("origin", cVar.f17266e);
            bundle.putLong("creation_timestamp", cVar.f17268j);
            bundle.putString("name", cVar.f17267f.f17697e);
            Object objH = cVar.f17267f.h();
            fc.t.k(objH);
            dq0.S0(bundle, objH);
            bundle.putBoolean("active", cVar.f17269m);
            String str = cVar.f17270n;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            q qVar = cVar.f17271t;
            if (qVar != null) {
                bundle.putString("timed_out_event_name", qVar.f17558b);
                p pVar = qVar.f17559e;
                if (pVar != null) {
                    bundle.putBundle("timed_out_event_params", pVar.h());
                }
            }
            bundle.putLong("trigger_timeout", cVar.f17272u);
            q qVar2 = cVar.f17273w;
            if (qVar2 != null) {
                bundle.putString("triggered_event_name", qVar2.f17558b);
                p pVar2 = qVar2.f17559e;
                if (pVar2 != null) {
                    bundle.putBundle("triggered_event_params", pVar2.h());
                }
            }
            bundle.putLong("triggered_timestamp", cVar.f17267f.f17698f);
            bundle.putLong("time_to_live", cVar.M);
            q qVar3 = cVar.N;
            if (qVar3 != null) {
                bundle.putString("expired_event_name", qVar3.f17558b);
                p pVar3 = qVar3.f17559e;
                if (pVar3 != null) {
                    bundle.putBundle("expired_event_params", pVar3.h());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final void A(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            i3 i3Var = ((b4) this.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.f17400w.b(Long.valueOf(j11), "Params already contained engagement");
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void B(Bundle bundle, int i10, String str, Object obj) {
        if (h0(i10, bundle)) {
            ((b4) this.f15046b).getClass();
            bundle.putString("_ev", w(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void D(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                b6 b6Var = ((b4) this.f15046b).O;
                b4.g(b6Var);
                b6Var.G(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void E(j3 j3Var, int i10) {
        Object obj = j3Var.f17443e;
        Iterator it = new TreeSet(((Bundle) obj).keySet()).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (c0(str) && (i11 = i11 + 1) > i10) {
                StringBuilder sbY = a0.h.y("Event can't contain more than ", i10, " params");
                b4 b4Var = (b4) this.f15046b;
                i3 i3Var = b4Var.f17251w;
                b4.i(i3Var);
                Bundle bundle = (Bundle) obj;
                i3Var.f17399u.c(b4Var.P.d((String) j3Var.f17441c), sbY.toString(), b4Var.P.b(bundle));
                h0(5, bundle);
                bundle.remove(str);
            }
        }
    }

    public final void G(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            Object obj2 = this.f15046b;
            i3 i3Var = ((b4) obj2).f17251w;
            b4.i(i3Var);
            i3Var.N.c(((b4) obj2).P.e(str), "Not putting event parameter. Invalid value type. name, type", simpleName);
        }
    }

    public final void H(com.google.android.gms.internal.measurement.l0 l0Var, boolean z7) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z7);
        try {
            l0Var.C2(bundle);
        } catch (RemoteException e10) {
            i3 i3Var = ((b4) this.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.f17400w.b(e10, "Error returning boolean value to wrapper");
        }
    }

    public final void I(com.google.android.gms.internal.measurement.l0 l0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            l0Var.C2(bundle);
        } catch (RemoteException e10) {
            i3 i3Var = ((b4) this.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.f17400w.b(e10, "Error returning bundle list to wrapper");
        }
    }

    public final void J(com.google.android.gms.internal.measurement.l0 l0Var, Bundle bundle) {
        try {
            l0Var.C2(bundle);
        } catch (RemoteException e10) {
            i3 i3Var = ((b4) this.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.f17400w.b(e10, "Error returning bundle value to wrapper");
        }
    }

    public final void K(com.google.android.gms.internal.measurement.l0 l0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            l0Var.C2(bundle);
        } catch (RemoteException e10) {
            i3 i3Var = ((b4) this.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.f17400w.b(e10, "Error returning byte array to wrapper");
        }
    }

    public final void L(com.google.android.gms.internal.measurement.l0 l0Var, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            l0Var.C2(bundle);
        } catch (RemoteException e10) {
            i3 i3Var = ((b4) this.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.f17400w.b(e10, "Error returning int value to wrapper");
        }
    }

    public final void M(com.google.android.gms.internal.measurement.l0 l0Var, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            l0Var.C2(bundle);
        } catch (RemoteException e10) {
            i3 i3Var = ((b4) this.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.f17400w.b(e10, "Error returning long value to wrapper");
        }
    }

    public final void N(String str, com.google.android.gms.internal.measurement.l0 l0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            l0Var.C2(bundle);
        } catch (RemoteException e10) {
            i3 i3Var = ((b4) this.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.f17400w.b(e10, "Error returning string value to wrapper");
        }
    }

    public final void O(String str, String str2, Bundle bundle, List list, boolean z7) {
        int iP0;
        String str3;
        int iT;
        if (bundle == null) {
            return;
        }
        b4 b4Var = (b4) this.f15046b;
        b4Var.getClass();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list == null || !list.contains(str4)) {
                iP0 = !z7 ? p0(str4) : 0;
                if (iP0 == 0) {
                    iP0 = o0(str4);
                }
            } else {
                iP0 = 0;
            }
            if (iP0 != 0) {
                B(bundle, iP0, str4, iP0 == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (Z(bundle.get(str4))) {
                    i3 i3Var = b4Var.f17251w;
                    b4.i(i3Var);
                    i3Var.N.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str4);
                    iT = 22;
                    str3 = str4;
                } else {
                    str3 = str4;
                    iT = T(str, str4, bundle.get(str4), bundle, list, z7, false);
                }
                if (iT != 0 && !"_ev".equals(str3)) {
                    B(bundle, iT, str3, bundle.get(str3));
                } else if (c0(str3) && !k0(str3, j4.f17451h) && (i10 = i10 + 1) > 0) {
                    i3 i3Var2 = b4Var.f17251w;
                    b4.i(i3Var2);
                    i3Var2.f17399u.c(b4Var.P.d(str), "Item cannot contain custom parameters", b4Var.P.b(bundle));
                    h0(23, bundle);
                }
                bundle.remove(str3);
            }
        }
    }

    public final boolean P(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        Object obj = this.f15046b;
        if (!zIsEmpty) {
            fc.t.k(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            b4 b4Var = (b4) obj;
            if (TextUtils.isEmpty(b4Var.f17238e)) {
                i3 i3Var = b4Var.f17251w;
                b4.i(i3Var);
                i3Var.f17399u.b(i3.y(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            b4 b4Var2 = (b4) obj;
            if (TextUtils.isEmpty(b4Var2.f17238e)) {
                i3 i3Var2 = b4Var2.f17251w;
                b4.i(i3Var2);
                i3Var2.f17399u.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        fc.t.k(str2);
        if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        }
        i3 i3Var3 = ((b4) obj).f17251w;
        b4.i(i3Var3);
        i3Var3.f17399u.b(i3.y(str2), "Invalid admob_app_id. Analytics disabled.");
        return false;
    }

    public final boolean Q(String str, int i10, String str2) {
        Object obj = this.f15046b;
        if (str2 == null) {
            i3 i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            i3Var.f17399u.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        i3 i3Var2 = ((b4) obj).f17251w;
        b4.i(i3Var2);
        i3Var2.f17399u.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    public final boolean R(String str, String[] strArr, String[] strArr2, String str2) {
        Object obj = this.f15046b;
        if (str2 == null) {
            i3 i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            i3Var.f17399u.b(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = f17259t;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                i3 i3Var2 = ((b4) obj).f17251w;
                b4.i(i3Var2);
                i3Var2.f17399u.c(str, "Name starts with reserved prefix. Type, name", str2);
                return false;
            }
        }
        if (strArr == null || !k0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && k0(str2, strArr2)) {
            return true;
        }
        i3 i3Var3 = ((b4) obj).f17251w;
        b4.i(i3Var3);
        i3Var3.f17399u.c(str, "Name is reserved. Type, name", str2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int T(String str, String str2, Object obj, Bundle bundle, List list, boolean z7, boolean z10) {
        int i10;
        int i11;
        String str3;
        String str4;
        g3 g3Var;
        int size;
        o();
        boolean Z = Z(obj);
        Object obj2 = this.f15046b;
        if (!Z) {
            i10 = 0;
        } else {
            if (!z10) {
                return 21;
            }
            if (!k0(str2, j4.f17450g)) {
                return 20;
            }
            b4 b4Var = (b4) obj2;
            i5 i5VarR = b4Var.r();
            i5VarR.o();
            i5VarR.p();
            if (i5VarR.x()) {
                b6 b6Var = ((b4) i5VarR.f15046b).O;
                b4.g(b6Var);
                if (b6Var.r0() < 200900) {
                    return 25;
                }
            }
            b4Var.getClass();
            boolean z11 = obj instanceof Parcelable[];
            if (z11) {
                size = ((Parcelable[]) obj).length;
            } else {
                if (obj instanceof ArrayList) {
                    size = ((ArrayList) obj).size();
                }
                i10 = 0;
            }
            if (size > 200) {
                i3 i3Var = b4Var.f17251w;
                b4.i(i3Var);
                i3Var.N.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                b4Var.getClass();
                if (z11) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i10 = 17;
            }
        }
        if (b0(str) || b0(str2)) {
            ((b4) obj2).getClass();
            i11 = 256;
        } else {
            ((b4) obj2).getClass();
            i11 = 100;
        }
        if (V("param", str2, i11, obj)) {
            return i10;
        }
        if (!z10) {
            return 4;
        }
        if (obj instanceof Bundle) {
            O(str, str2, (Bundle) obj, list, z7);
        } else if (obj instanceof Parcelable[]) {
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (!(parcelable instanceof Bundle)) {
                    i3 i3Var2 = ((b4) obj2).f17251w;
                    b4.i(i3Var2);
                    str3 = parcelable.getClass();
                    g3Var = i3Var2.N;
                    str4 = "All Parcelable[] elements must be of type Bundle. Value type, name";
                    g3Var.c(str3, str4, str2);
                    return 4;
                }
                O(str, str2, (Bundle) parcelable, list, z7);
            }
        } else {
            if (!(obj instanceof ArrayList)) {
                return 4;
            }
            ArrayList arrayList2 = (ArrayList) obj;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Object obj3 = arrayList2.get(i12);
                if (!(obj3 instanceof Bundle)) {
                    i3 i3Var3 = ((b4) obj2).f17251w;
                    b4.i(i3Var3);
                    str3 = obj3 != null ? obj3.getClass() : "null";
                    str4 = "All ArrayList elements must be of type Bundle. Value type, name";
                    g3Var = i3Var3.N;
                    g3Var.c(str3, str4, str2);
                    return 4;
                }
                O(str, str2, (Bundle) obj3, list, z7);
            }
        }
        return i10;
    }

    public final void U() {
        o();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                i3 i3Var = ((b4) this.f15046b).f17251w;
                b4.i(i3Var);
                i3Var.f17400w.a("Utils falling back to Random for random id");
            }
        }
        this.f17262j.set(jNextLong);
    }

    public final boolean V(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i10) {
                i3 i3Var = ((b4) this.f15046b).f17251w;
                b4.i(i3Var);
                i3Var.N.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean W(String str, String str2) {
        Object obj = this.f15046b;
        if (str2 == null) {
            i3 i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            i3Var.f17399u.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            i3 i3Var2 = ((b4) obj).f17251w;
            b4.i(i3Var2);
            i3Var2.f17399u.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                i3 i3Var3 = ((b4) obj).f17251w;
                b4.i(i3Var3);
                i3Var3.f17399u.c(str, "Name must start with a letter or _ (underscore). Type, name", str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                i3 i3Var4 = ((b4) obj).f17251w;
                b4.i(i3Var4);
                i3Var4.f17399u.c(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean X(String str, String str2) {
        Object obj = this.f15046b;
        if (str2 == null) {
            i3 i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            i3Var.f17399u.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            i3 i3Var2 = ((b4) obj).f17251w;
            b4.i(i3Var2);
            i3Var2.f17399u.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            i3 i3Var3 = ((b4) obj).f17251w;
            b4.i(i3Var3);
            i3Var3.f17399u.c(str, "Name must start with a letter. Type, name", str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                i3 i3Var4 = ((b4) obj).f17251w;
                b4.i(i3Var4);
                i3Var4.f17399u.c(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean Y(String str) {
        o();
        b4 b4Var = (b4) this.f15046b;
        if (g5.b.a(b4Var.f17234b).f883b.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        i3 i3Var = b4Var.f17251w;
        b4.i(i3Var);
        i3Var.P.b(str, "Permission not granted");
        return false;
    }

    public final boolean a0(Context context, String str) {
        i3 i3Var;
        String str2;
        Signature[] signatureArr;
        Object obj = this.f15046b;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoG = g5.b.a(context).g(64, str);
            if (packageInfoG == null || (signatureArr = packageInfoG.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            str2 = "Package name not found";
            i3Var.f17397n.b(e, str2);
            return true;
        } catch (CertificateException e11) {
            e = e11;
            i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            str2 = "Error obtaining certificate";
            i3Var.f17397n.b(e, str2);
            return true;
        }
    }

    public final int i0(String str) {
        boolean zEquals = "_ldl".equals(str);
        Object obj = this.f15046b;
        if (zEquals) {
            ((b4) obj).getClass();
            return androidx.recyclerview.widget.g1.FLAG_MOVED;
        }
        if ("_id".equals(str)) {
            ((b4) obj).getClass();
            return 256;
        }
        boolean zEquals2 = "_lgclid".equals(str);
        ((b4) obj).getClass();
        return zEquals2 ? 100 : 36;
    }

    public final Object j0(int i10, Object obj, boolean z7, boolean z10) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return w(obj.toString(), i10, z7);
        }
        if (!z10 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleV0 = v0((Bundle) parcelable);
                if (!bundleV0.isEmpty()) {
                    arrayList.add(bundleV0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int m0(Object obj, String str) {
        return V("_ldl".equals(str) ? "user property referrer" : "user property", str, i0(str), obj) ? 0 : 7;
    }

    public final int n0(String str) {
        if (!W("event", str)) {
            return 2;
        }
        if (!R("event", j4.f17444a, j4.f17445b, str)) {
            return 13;
        }
        ((b4) this.f15046b).getClass();
        return !Q("event", 40, str) ? 2 : 0;
    }

    public final int o0(String str) {
        if (!W("event param", str)) {
            return 3;
        }
        if (!R("event param", null, null, str)) {
            return 14;
        }
        ((b4) this.f15046b).getClass();
        return !Q("event param", 40, str) ? 3 : 0;
    }

    @Override // t5.g4
    public final boolean p() {
        return true;
    }

    public final int p0(String str) {
        if (!X("event param", str)) {
            return 3;
        }
        if (!R("event param", null, null, str)) {
            return 14;
        }
        ((b4) this.f15046b).getClass();
        return !Q("event param", 40, str) ? 3 : 0;
    }

    public final int q0(String str) {
        if (!W("user property", str)) {
            return 6;
        }
        if (!R("user property", j4.f17452i, null, str)) {
            return 15;
        }
        ((b4) this.f15046b).getClass();
        return !Q("user property", 24, str) ? 6 : 0;
    }

    public final int r0() {
        if (this.f17264n == null) {
            x4.g gVar = x4.g.f18964b;
            Context context = ((b4) this.f15046b).f17234b;
            gVar.getClass();
            this.f17264n = Integer.valueOf(x4.g.a(context) / com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS);
        }
        return this.f17264n.intValue();
    }

    public final Object s(Object obj, String str) {
        boolean zEquals = "_ev".equals(str);
        Object obj2 = this.f15046b;
        if (zEquals) {
            ((b4) obj2).getClass();
            return j0(256, obj, true, true);
        }
        boolean zB0 = b0(str);
        ((b4) obj2).getClass();
        return j0(zB0 ? 256 : 100, obj, false, true);
    }

    public final Object t(Object obj, String str) {
        boolean zEquals = "_ldl".equals(str);
        int iI0 = i0(str);
        return zEquals ? j0(iI0, obj, true, false) : j0(iI0, obj, false, false);
    }

    public final long t0() {
        long andIncrement;
        long j10;
        if (this.f17262j.get() != 0) {
            synchronized (this.f17262j) {
                this.f17262j.compareAndSet(-1L, 1L);
                andIncrement = this.f17262j.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f17262j) {
            long jNanoTime = System.nanoTime();
            ((b4) this.f15046b).Q.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i10 = this.f17263m + 1;
            this.f17263m = i10;
            j10 = jNextLong + i10;
        }
        return j10;
    }

    public final String u() {
        byte[] bArr = new byte[16];
        y().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Bundle u0(Uri uri, boolean z7, boolean z10) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    if (z7) {
                        queryParameter5 = uri.getQueryParameter("utm_id");
                        queryParameter6 = uri.getQueryParameter("dclid");
                    } else {
                        queryParameter5 = null;
                        queryParameter6 = null;
                    }
                    queryParameter7 = z10 ? uri.getQueryParameter("srsltid") : null;
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                }
                if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && ((!z7 || (TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6))) && (!z10 || TextUtils.isEmpty(queryParameter7)))) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("source", queryParameter2);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("medium", queryParameter3);
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("gclid", queryParameter4);
                }
                String queryParameter8 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("term", queryParameter8);
                }
                String queryParameter9 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString("content", queryParameter9);
                }
                String queryParameter10 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter10)) {
                    bundle.putString("aclid", queryParameter10);
                }
                String queryParameter11 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter11)) {
                    bundle.putString("cp1", queryParameter11);
                }
                String queryParameter12 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter12)) {
                    bundle.putString("anid", queryParameter12);
                }
                if (z7) {
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("campaign_id", queryParameter5);
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("dclid", queryParameter6);
                    }
                    String queryParameter13 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter13)) {
                        bundle.putString("source_platform", queryParameter13);
                    }
                    String queryParameter14 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter14)) {
                        bundle.putString("creative_format", queryParameter14);
                    }
                    String queryParameter15 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter15)) {
                        bundle.putString("marketing_tactic", queryParameter15);
                    }
                }
                if (z10 && !TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("srsltid", queryParameter7);
                }
                return bundle;
            } catch (UnsupportedOperationException e10) {
                i3 i3Var = ((b4) this.f15046b).f17251w;
                b4.i(i3Var);
                i3Var.f17400w.b(e10, "Install referrer url isn't a hierarchical URI");
            }
        }
        return null;
    }

    public final Bundle v0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objS = s(bundle.get(str), str);
                if (objS == null) {
                    Object obj = this.f15046b;
                    i3 i3Var = ((b4) obj).f17251w;
                    b4.i(i3Var);
                    i3Var.N.b(((b4) obj).P.e(str), "Param value can't be null");
                } else {
                    G(bundle2, str, objS);
                }
            }
        }
        return bundle2;
    }

    public final Bundle w0(String str, Bundle bundle, List list, boolean z7) {
        int iP0;
        int i10;
        List list2 = list;
        boolean zK0 = k0(str, j4.f17447d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        b4 b4Var = (b4) this.f15046b;
        int iR = b4Var.f17249t.r();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (list2 == null || !list2.contains(str2)) {
                iP0 = !z7 ? p0(str2) : 0;
                if (iP0 == 0) {
                    iP0 = o0(str2);
                }
            } else {
                iP0 = 0;
            }
            if (iP0 != 0) {
                B(bundle2, iP0, str2, iP0 == 3 ? str2 : null);
                bundle2.remove(str2);
                i10 = iR;
            } else {
                i10 = iR;
                int iT = T(str, str2, bundle.get(str2), bundle2, list, z7, zK0);
                if (iT == 17) {
                    B(bundle2, 17, str2, Boolean.FALSE);
                } else if (iT != 0 && !"_ev".equals(str2)) {
                    B(bundle2, iT, iT == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (c0(str2)) {
                    int i12 = i11 + 1;
                    if (i12 > i10) {
                        StringBuilder sbY = a0.h.y("Event can't contain more than ", i10, " params");
                        i3 i3Var = b4Var.f17251w;
                        b4.i(i3Var);
                        i3Var.f17399u.c(b4Var.P.d(str), sbY.toString(), b4Var.P.b(bundle));
                        h0(5, bundle2);
                        bundle2.remove(str2);
                    }
                    i11 = i12;
                }
            }
            iR = i10;
            list2 = list;
        }
        return bundle2;
    }

    public final q x0(String str, Bundle bundle, String str2, long j10, boolean z7) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (n0(str) != 0) {
            b4 b4Var = (b4) this.f15046b;
            i3 i3Var = b4Var.f17251w;
            b4.i(i3Var);
            i3Var.f17397n.b(b4Var.P.f(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleW0 = w0(str, bundle2, Collections.singletonList("_o"), true);
        if (z7) {
            bundleW0 = v0(bundleW0);
        }
        fc.t.k(bundleW0);
        return new q(str, new p(bundleW0), str2, j10);
    }

    public final SecureRandom y() {
        o();
        if (this.f17261f == null) {
            this.f17261f = new SecureRandom();
        }
        return this.f17261f;
    }
}