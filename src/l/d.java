package l;

import android.content.Context;
import android.view.MenuItem;
import com.google.android.gms.internal.ads.b91;
import com.google.android.gms.internal.ads.ba1;
import com.google.android.gms.internal.ads.c61;
import com.google.android.gms.internal.ads.c71;
import com.google.android.gms.internal.ads.d31;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.e81;
import com.google.android.gms.internal.ads.g11;
import com.google.android.gms.internal.ads.g4;
import com.google.android.gms.internal.ads.g71;
import com.google.android.gms.internal.ads.g81;
import com.google.android.gms.internal.ads.g91;
import com.google.android.gms.internal.ads.h11;
import com.google.android.gms.internal.ads.h61;
import com.google.android.gms.internal.ads.hd1;
import com.google.android.gms.internal.ads.i51;
import com.google.android.gms.internal.ads.i81;
import com.google.android.gms.internal.ads.i91;
import com.google.android.gms.internal.ads.j91;
import com.google.android.gms.internal.ads.k91;
import com.google.android.gms.internal.ads.ka1;
import com.google.android.gms.internal.ads.l91;
import com.google.android.gms.internal.ads.m41;
import com.google.android.gms.internal.ads.m91;
import com.google.android.gms.internal.ads.mn0;
import com.google.android.gms.internal.ads.n31;
import com.google.android.gms.internal.ads.n61;
import com.google.android.gms.internal.ads.n71;
import com.google.android.gms.internal.ads.n91;
import com.google.android.gms.internal.ads.oq;
import com.google.android.gms.internal.ads.p31;
import com.google.android.gms.internal.ads.p71;
import com.google.android.gms.internal.ads.q31;
import com.google.android.gms.internal.ads.q91;
import com.google.android.gms.internal.ads.r41;
import com.google.android.gms.internal.ads.r71;
import com.google.android.gms.internal.ads.s31;
import com.google.android.gms.internal.ads.sm0;
import com.google.android.gms.internal.ads.t31;
import com.google.android.gms.internal.ads.t61;
import com.google.android.gms.internal.ads.t71;
import com.google.android.gms.internal.ads.t91;
import com.google.android.gms.internal.ads.un0;
import com.google.android.gms.internal.ads.v11;
import com.google.android.gms.internal.ads.v31;
import com.google.android.gms.internal.ads.v71;
import com.google.android.gms.internal.ads.v91;
import com.google.android.gms.internal.ads.w51;
import com.google.android.gms.internal.ads.x11;
import com.google.android.gms.internal.ads.y61;
import com.google.android.gms.internal.ads.y81;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public Object f14305a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14306b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14307c;

    public d(Context context) {
        this.f14305a = context;
    }

    public static boolean l(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean n(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void c();

    public abstract Object d(int i10, int i11);

    public abstract t.b e();

    public abstract int f();

    public abstract int g(Object obj);

    public abstract int h(Object obj);

    public abstract void i(Object obj, Object obj2);

    public abstract void j(int i10);

    public abstract Object k(int i10, Object obj);

    public final MenuItem m(MenuItem menuItem) {
        if (!(menuItem instanceof j0.b)) {
            return menuItem;
        }
        j0.b bVar = (j0.b) menuItem;
        if (((t.k) this.f14306b) == null) {
            this.f14306b = new t.k();
        }
        MenuItem menuItem2 = (MenuItem) ((t.k) this.f14306b).getOrDefault(bVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        v vVar = new v((Context) this.f14305a, bVar);
        ((t.k) this.f14306b).put(bVar, vVar);
        return vVar;
    }

    public final Object[] o(int i10, Object[] objArr) {
        int iF = f();
        if (objArr.length < iF) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iF);
        }
        for (int i11 = 0; i11 < iF; i11++) {
            objArr[i11] = d(i11, i10);
        }
        if (objArr.length > iF) {
            objArr[iF] = null;
        }
        return objArr;
    }

    public hd1 p() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract int q();

    public abstract ba1 r(ka1 ka1Var);

    public abstract String s();

    public abstract void t(ba1 ba1Var);

    public int u() {
        return 1;
    }

    public final Object v(ba1 ba1Var, Class cls) throws GeneralSecurityException {
        Object sm0Var;
        Object r41Var;
        m41 m41Var = (m41) ((Map) this.f14306b).get(cls);
        if (m41Var == null) {
            throw new IllegalArgumentException(a0.h.w("Requested primitive class ", cls.getCanonicalName(), " not supported."));
        }
        int i10 = 1;
        switch (((v11) m41Var).f9209b) {
            case 0:
                c61 c61Var = (c61) ba1Var;
                return new n91((t91) new x11(1).v(c61Var.y(), t91.class), (h11) new i51().v(c61Var.z(), h11.class), c61Var.z().z().v());
            case QueueFuseable.SYNC /* 1 */:
                h61 h61Var = (h61) ba1Var;
                return new i91(h61Var.A().a(), h61Var.z().v());
            case 2:
                n61 n61Var = (n61) ba1Var;
                return new j91(n61Var.z().a(), n61Var.y().v());
            case 3:
                return new k91(((t61) ba1Var).y().a(), 0);
            case 4:
                return new d31(((y61) ba1Var).y().a());
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return new k91(((g71) ba1Var).y().a(), 1);
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                g11.a(((y81) ba1Var).y().x());
                throw null;
            case y4.g.NETWORK_ERROR /* 7 */:
                g11.a(((b91) ba1Var).y().x());
                throw null;
            case 8:
                return new k91(((g91) ba1Var).y().a(), 2);
            case 9:
                return new l91(((c71) ba1Var).y().a());
            case y4.g.DEVELOPER_ERROR /* 10 */:
                p71 p71Var = (p71) ba1Var;
                n71 n71VarW = p71Var.y().w();
                t71 t71VarY = n71VarW.y();
                ECPrivateKey eCPrivateKeyK2 = dq0.k2(p71Var.z().a(), dq0.l1(t71VarY.z()));
                a0.g gVar = new a0.g(n71VarW.v().x());
                byte[] bArrA = t71VarY.x().a();
                String strI0 = dq0.I0(t71VarY.A());
                dq0.I1(n71VarW.B());
                sm0Var = new sm0(eCPrivateKeyK2, bArrA, strI0, gVar);
                break;
            case 11:
                r71 r71Var = (r71) ba1Var;
                n71 n71VarW2 = r71Var.w();
                t71 t71VarY2 = n71VarW2.y();
                int iL1 = dq0.l1(t71VarY2.z());
                byte[] bArrA2 = r71Var.A().a();
                byte[] bArrA3 = r71Var.B().a();
                ECParameterSpec eCParameterSpecZ2 = dq0.z2(iL1);
                ECPoint eCPoint = new ECPoint(new BigInteger(1, bArrA2), new BigInteger(1, bArrA3));
                v31.b(eCPoint, eCParameterSpecZ2.getCurve());
                return new m91((ECPublicKey) ((KeyFactory) q91.f7680f.f7681a.zza("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecZ2)), t71VarY2.x().a(), dq0.I0(t71VarY2.A()), dq0.I1(n71VarW2.B()), new a0.g(n71VarW2.v().x()));
            case 12:
                g81 g81Var = (g81) ba1Var;
                if (!g81Var.D()) {
                    throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
                }
                if (!g81Var.y().E()) {
                    throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
                }
                if (g81Var.z().m() == 0) {
                    throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
                }
                e81 e81VarW = g81Var.y().w();
                q31 q31VarG0 = dq0.G0(e81VarW);
                oq oqVarQ1 = dq0.q1(e81VarW);
                n31 n31VarJ = dq0.J(e81VarW);
                int iZ = e81VarW.z();
                int i11 = iZ - 2;
                if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
                    throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(dq0.O(iZ)));
                }
                int iZ2 = g81Var.y().w().z() - 2;
                if (iZ2 == 1) {
                    byte[] bArrA4 = g81Var.z().a();
                    r41Var = new r41(bArrA4, dq0.F1(bArrA4));
                } else {
                    if (iZ2 != 2 && iZ2 != 3 && iZ2 != 4) {
                        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                    }
                    byte[] bArrA5 = g81Var.z().a();
                    byte[] bArrA6 = g81Var.y().A().a();
                    int iZ3 = g81Var.y().w().z();
                    byte[] bArr = s31.f8277a;
                    int i12 = iZ3 - 2;
                    if (i12 != 2) {
                        if (i12 == 3) {
                            i10 = 2;
                        } else {
                            if (i12 != 4) {
                                throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                            }
                            i10 = 3;
                        }
                    }
                    ECPublicKey eCPublicKeyR2 = dq0.r2(dq0.z2(i10), bArrA6);
                    ECPrivateKey eCPrivateKeyK22 = dq0.k2(bArrA5, i10);
                    dq0.R1(eCPrivateKeyK22, eCPublicKeyR2);
                    v31.b(eCPublicKeyR2.getW(), eCPrivateKeyK22.getParams().getCurve());
                    r41Var = new t31(bArrA5, bArrA6);
                }
                un0 un0Var = new un0();
                un0Var.f9116b = r41Var;
                un0Var.f9117e = q31VarG0;
                un0Var.f9119j = oqVarQ1;
                un0Var.f9118f = n31VarJ;
                return un0Var;
            case y4.g.ERROR /* 13 */:
                i81 i81Var = (i81) ba1Var;
                if (i81Var.A().m() == 0) {
                    throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
                }
                e81 e81VarW2 = i81Var.w();
                sm0Var = new p31(i81Var, dq0.G0(e81VarW2), dq0.q1(e81VarW2), dq0.J(e81VarW2));
                break;
            case y4.g.INTERRUPTED /* 14 */:
                w51 w51Var = (w51) ba1Var;
                return new v91(new g4(w51Var.z().a()), w51Var.y().v());
            default:
                v71 v71Var = (v71) ba1Var;
                int iZ4 = v71Var.z().z();
                SecretKeySpec secretKeySpec = new SecretKeySpec(v71Var.A().a(), "HMAC");
                int iV = v71Var.z().v();
                int i13 = iZ4 - 2;
                if (i13 == 1) {
                    return new v91(new mn0("HMACSHA1", secretKeySpec), iV);
                }
                if (i13 == 2) {
                    return new v91(new mn0("HMACSHA384", secretKeySpec), iV);
                }
                if (i13 == 3) {
                    return new v91(new mn0("HMACSHA256", secretKeySpec), iV);
                }
                if (i13 == 4) {
                    return new v91(new mn0("HMACSHA512", secretKeySpec), iV);
                }
                if (i13 == 5) {
                    return new v91(new mn0("HMACSHA224", secretKeySpec), iV);
                }
                throw new GeneralSecurityException("unknown hash");
        }
        return sm0Var;
    }

    public d(Class cls, m41... m41VarArr) {
        this.f14305a = cls;
        HashMap map = new HashMap();
        for (int i10 = 0; i10 <= 0; i10++) {
            m41 m41Var = m41VarArr[i10];
            boolean zContainsKey = map.containsKey(m41Var.f6433a);
            Class cls2 = m41Var.f6433a;
            if (zContainsKey) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cls2.getCanonicalName())));
            }
            map.put(cls2, m41Var);
        }
        this.f14307c = m41VarArr[0].f6433a;
        this.f14306b = Collections.unmodifiableMap(map);
    }
}