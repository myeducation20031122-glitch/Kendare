package t5;

import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.internal.ads.zh1;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k5 extends t5 {

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f17466j;

    /* renamed from: m, reason: collision with root package name */
    public final zh1 f17467m;

    /* renamed from: n, reason: collision with root package name */
    public final zh1 f17468n;

    /* renamed from: t, reason: collision with root package name */
    public final zh1 f17469t;

    /* renamed from: u, reason: collision with root package name */
    public final zh1 f17470u;

    /* renamed from: w, reason: collision with root package name */
    public final zh1 f17471w;

    public k5(w5 w5Var) {
        super(w5Var);
        this.f17466j = new HashMap();
        q3 q3Var = ((b4) this.f15046b).f17250u;
        b4.g(q3Var);
        this.f17467m = new zh1(q3Var, "last_delete_stale", 0L);
        q3 q3Var2 = ((b4) this.f15046b).f17250u;
        b4.g(q3Var2);
        this.f17468n = new zh1(q3Var2, "backoff", 0L);
        q3 q3Var3 = ((b4) this.f15046b).f17250u;
        b4.g(q3Var3);
        this.f17469t = new zh1(q3Var3, "last_upload", 0L);
        q3 q3Var4 = ((b4) this.f15046b).f17250u;
        b4.g(q3Var4);
        this.f17470u = new zh1(q3Var4, "last_upload_attempt", 0L);
        q3 q3Var5 = ((b4) this.f15046b).f17250u;
        b4.g(q3Var5);
        this.f17471w = new zh1(q3Var5, "midnight_offset", 0L);
    }

    @Override // t5.t5
    public final boolean r() {
        return false;
    }

    public final Pair s(String str) {
        j5 j5Var;
        o();
        Object obj = this.f15046b;
        b4 b4Var = (b4) obj;
        b4Var.Q.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f17466j;
        j5 j5Var2 = (j5) map.get(str);
        if (j5Var2 != null && jElapsedRealtime < j5Var2.f17456c) {
            return new Pair(j5Var2.f17454a, Boolean.valueOf(j5Var2.f17455b));
        }
        long jU = b4Var.f17249t.u(str, a3.f17165b) + jElapsedRealtime;
        try {
            g4.a aVarA = g4.b.a(((b4) obj).f17234b);
            String str2 = aVarA.f13016a;
            boolean z7 = aVarA.f13017b;
            j5Var = str2 != null ? new j5(z7, str2, jU) : new j5(z7, "", jU);
        } catch (Exception e10) {
            i3 i3Var = b4Var.f17251w;
            b4.i(i3Var);
            i3Var.P.b(e10, "Unable to get advertising id");
            j5Var = new j5(false, "", jU);
        }
        map.put(str, j5Var);
        return new Pair(j5Var.f17454a, Boolean.valueOf(j5Var.f17455b));
    }

    public final String t(String str, boolean z7) throws NoSuchAlgorithmException {
        o();
        String str2 = (!((b4) this.f15046b).f17249t.y(null, a3.f17176g0) || z7) ? (String) s(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestX = b6.x();
        if (messageDigestX == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestX.digest(str2.getBytes())));
    }
}