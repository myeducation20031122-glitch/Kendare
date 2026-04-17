package j4;

import com.google.android.gms.internal.ads.if0;
import com.google.android.gms.internal.ads.nk;
import com.google.android.gms.internal.ads.sr;
import com.google.android.gms.internal.ads.zr;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static final o f13771f = new o();

    /* renamed from: a, reason: collision with root package name */
    public final sr f13772a;

    /* renamed from: b, reason: collision with root package name */
    public final android.support.v4.media.b f13773b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13774c;

    /* renamed from: d, reason: collision with root package name */
    public final zr f13775d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f13776e;

    public o() throws NoSuchAlgorithmException {
        sr srVar = new sr();
        srVar.f8519a = -1.0f;
        if0 if0Var = new if0("com.google.android.gms.ads.AdManagerCreatorImpl");
        o2 o2Var = new o2(1);
        o2 o2Var2 = new o2(0);
        o2 o2Var3 = new o2(2);
        nk nkVar = new nk();
        o2 o2Var4 = new o2(4);
        o2 o2Var5 = new o2(3);
        android.support.v4.media.b bVar = new android.support.v4.media.b();
        bVar.f486b = if0Var;
        bVar.f487e = o2Var;
        bVar.f488f = o2Var2;
        bVar.f489j = o2Var3;
        bVar.f490m = nkVar;
        bVar.f491n = o2Var4;
        bVar.f492t = o2Var5;
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        zr zrVar = new zr(0, 231004000, true, false);
        Random random = new Random();
        this.f13772a = srVar;
        this.f13773b = bVar;
        this.f13774c = string;
        this.f13775d = zrVar;
        this.f13776e = random;
    }
}