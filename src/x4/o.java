package x4;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import z4.u0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class o implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18976b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f18977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18978f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f18979j;

    public /* synthetic */ o(int i10, Object obj, Object obj2, boolean z7) {
        this.f18976b = i10;
        this.f18977e = z7;
        this.f18978f = obj;
        this.f18979j = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        MessageDigest messageDigest2 = null;
        int i10 = this.f18976b;
        Object obj = this.f18979j;
        Object obj2 = this.f18978f;
        boolean z7 = this.f18977e;
        switch (i10) {
            case 0:
                String str = (String) obj2;
                q qVar = (q) obj;
                int i11 = 0;
                Object[] objArr = new Object[5];
                objArr[0] = (z7 || !u.b(str, qVar, true, false).f19007a) ? "not allowed" : "debug cert rejected";
                objArr[1] = str;
                while (true) {
                    if (i11 < 2) {
                        try {
                            messageDigest = MessageDigest.getInstance("SHA-256");
                        } catch (NoSuchAlgorithmException unused) {
                        }
                        if (messageDigest == null) {
                            i11++;
                        } else {
                            messageDigest2 = messageDigest;
                        }
                    }
                }
                fc.t.k(messageDigest2);
                objArr[2] = e5.c.b(messageDigest2.digest(qVar.r3()));
                objArr[3] = Boolean.valueOf(z7);
                objArr[4] = "12451000.false";
                return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", objArr);
            default:
                if (z7) {
                    r7.m mVar = (r7.m) obj2;
                    mVar.getClass();
                    l4.z zVar = new l4.z(mVar, (a2.n) obj, 8);
                    ExecutorService executorService = r7.v.f16643a;
                    mVar.f16609l.execute(new u0(zVar, new x5.l(), 23));
                }
                return null;
        }
    }
}