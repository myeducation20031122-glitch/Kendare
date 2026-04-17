package q8;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16317a;

    public /* synthetic */ k(int i10) {
        this.f16317a = i10;
    }

    public static p f(y8.a aVar, int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 5) {
            return new s(aVar.u());
        }
        if (i11 == 6) {
            return new s(new s8.i(aVar.u()));
        }
        if (i11 == 7) {
            return new s(Boolean.valueOf(aVar.m()));
        }
        if (i11 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(kc.r.t(i10)));
        }
        aVar.s();
        return q.f16335b;
    }

    public static void g(p pVar, y8.b bVar) throws IOException {
        if (pVar == null || (pVar instanceof q)) {
            bVar.j();
            return;
        }
        boolean z7 = pVar instanceof s;
        if (z7) {
            if (!z7) {
                throw new IllegalStateException("Not a JSON Primitive: " + pVar);
            }
            s sVar = (s) pVar;
            Serializable serializable = sVar.f16337b;
            if (serializable instanceof Number) {
                bVar.p(sVar.a());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.r(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(sVar.e()));
                return;
            } else {
                bVar.q(sVar.e());
                return;
            }
        }
        boolean z10 = pVar instanceof o;
        if (z10) {
            bVar.b();
            if (!z10) {
                throw new IllegalStateException("Not a JSON Array: " + pVar);
            }
            Iterator it = ((o) pVar).f16334b.iterator();
            while (it.hasNext()) {
                g((p) it.next(), bVar);
            }
            bVar.e();
            return;
        }
        boolean z11 = pVar instanceof r;
        if (!z11) {
            throw new IllegalArgumentException("Couldn't write " + pVar.getClass());
        }
        bVar.c();
        if (!z11) {
            throw new IllegalStateException("Not a JSON Object: " + pVar);
        }
        Iterator it2 = ((s8.k) ((r) pVar).f16336b.entrySet()).iterator();
        while (((s8.l) it2).hasNext()) {
            Map.Entry entry = (Map.Entry) ((s8.j) it2).next();
            bVar.g((String) entry.getKey());
            g((p) entry.getValue(), bVar);
        }
        bVar.f();
    }

    @Override // q8.a0
    public final Object b(y8.a aVar) throws IOException, NumberFormatException {
        p oVar;
        p oVar2;
        switch (this.f16317a) {
            case 0:
                return e(aVar);
            case QueueFuseable.SYNC /* 1 */:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.j()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.o()));
                    } catch (NumberFormatException e10) {
                        throw new t(e10);
                    }
                }
                aVar.e();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            case 2:
                return e(aVar);
            case 3:
                return e(aVar);
            case 4:
                return e(aVar);
            case y4.g.INVALID_ACCOUNT /* 5 */:
                if (aVar.w() == 9) {
                    aVar.s();
                    return null;
                }
                String strU = aVar.u();
                if (strU.length() == 1) {
                    return Character.valueOf(strU.charAt(0));
                }
                StringBuilder sbA = a0.h.A("Expecting character, got: ", strU, "; at ");
                sbA.append(aVar.h(true));
                throw new t(sbA.toString());
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                int iW = aVar.w();
                if (iW != 9) {
                    return iW == 8 ? Boolean.toString(aVar.m()) : aVar.u();
                }
                aVar.s();
                return null;
            case y4.g.NETWORK_ERROR /* 7 */:
                if (aVar.w() == 9) {
                    aVar.s();
                    return null;
                }
                String strU2 = aVar.u();
                try {
                    return new BigDecimal(strU2);
                } catch (NumberFormatException e11) {
                    StringBuilder sbA2 = a0.h.A("Failed parsing '", strU2, "' as BigDecimal; at path ");
                    sbA2.append(aVar.h(true));
                    throw new t(sbA2.toString(), e11);
                }
            case 8:
                if (aVar.w() == 9) {
                    aVar.s();
                    return null;
                }
                String strU3 = aVar.u();
                try {
                    return new BigInteger(strU3);
                } catch (NumberFormatException e12) {
                    StringBuilder sbA3 = a0.h.A("Failed parsing '", strU3, "' as BigInteger; at path ");
                    sbA3.append(aVar.h(true));
                    throw new t(sbA3.toString(), e12);
                }
            case 9:
                if (aVar.w() != 9) {
                    return new s8.i(aVar.u());
                }
                aVar.s();
                return null;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                if (aVar.w() != 9) {
                    return new StringBuilder(aVar.u());
                }
                aVar.s();
                return null;
            case 11:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 12:
                if (aVar.w() != 9) {
                    return new StringBuffer(aVar.u());
                }
                aVar.s();
                return null;
            case y4.g.ERROR /* 13 */:
                if (aVar.w() == 9) {
                    aVar.s();
                    return null;
                }
                String strU4 = aVar.u();
                if ("null".equals(strU4)) {
                    return null;
                }
                return new URL(strU4);
            case y4.g.INTERRUPTED /* 14 */:
                if (aVar.w() == 9) {
                    aVar.s();
                    return null;
                }
                try {
                    String strU5 = aVar.u();
                    if ("null".equals(strU5)) {
                        return null;
                    }
                    return new URI(strU5);
                } catch (URISyntaxException e13) {
                    throw new m7.p(e13);
                }
            case y4.g.TIMEOUT /* 15 */:
                if (aVar.w() != 9) {
                    return InetAddress.getByName(aVar.u());
                }
                aVar.s();
                return null;
            case y4.g.CANCELED /* 16 */:
                if (aVar.w() == 9) {
                    aVar.s();
                    return null;
                }
                String strU6 = aVar.u();
                try {
                    return UUID.fromString(strU6);
                } catch (IllegalArgumentException e14) {
                    StringBuilder sbA4 = a0.h.A("Failed parsing '", strU6, "' as UUID; at path ");
                    sbA4.append(aVar.h(true));
                    throw new t(sbA4.toString(), e14);
                }
            case y4.g.API_NOT_CONNECTED /* 17 */:
                String strU7 = aVar.u();
                try {
                    return Currency.getInstance(strU7);
                } catch (IllegalArgumentException e15) {
                    StringBuilder sbA5 = a0.h.A("Failed parsing '", strU7, "' as Currency; at path ");
                    sbA5.append(aVar.h(true));
                    throw new t(sbA5.toString(), e15);
                }
            case 18:
                if (aVar.w() == 9) {
                    aVar.s();
                    return null;
                }
                aVar.b();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (aVar.w() != 4) {
                    String strQ = aVar.q();
                    int iO = aVar.o();
                    if ("year".equals(strQ)) {
                        i11 = iO;
                    } else if ("month".equals(strQ)) {
                        i12 = iO;
                    } else if ("dayOfMonth".equals(strQ)) {
                        i13 = iO;
                    } else if ("hourOfDay".equals(strQ)) {
                        i14 = iO;
                    } else if ("minute".equals(strQ)) {
                        i15 = iO;
                    } else if ("second".equals(strQ)) {
                        i16 = iO;
                    }
                }
                aVar.f();
                return new GregorianCalendar(i11, i12, i13, i14, i15, i16);
            case y4.g.REMOTE_EXCEPTION /* 19 */:
                if (aVar.w() == 9) {
                    aVar.s();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.u(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                int iW2 = aVar.w();
                if (iW2 == 0) {
                    throw null;
                }
                int i17 = iW2 - 1;
                if (i17 == 0) {
                    aVar.a();
                    oVar = new o();
                } else if (i17 != 2) {
                    oVar = null;
                } else {
                    aVar.b();
                    oVar = new r();
                }
                if (oVar == null) {
                    return f(aVar, iW2);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (aVar.j()) {
                        String strQ2 = oVar instanceof r ? aVar.q() : null;
                        int iW3 = aVar.w();
                        if (iW3 == 0) {
                            throw null;
                        }
                        int i18 = iW3 - 1;
                        if (i18 == 0) {
                            aVar.a();
                            oVar2 = new o();
                        } else if (i18 != 2) {
                            oVar2 = null;
                        } else {
                            aVar.b();
                            oVar2 = new r();
                        }
                        boolean z7 = oVar2 != null;
                        if (oVar2 == null) {
                            oVar2 = f(aVar, iW3);
                        }
                        if (oVar instanceof o) {
                            ((o) oVar).f16334b.add(oVar2);
                        } else {
                            ((r) oVar).f16336b.put(strQ2, oVar2);
                        }
                        if (z7) {
                            arrayDeque.addLast(oVar);
                            oVar = oVar2;
                        }
                    } else {
                        if (oVar instanceof o) {
                            aVar.e();
                        } else {
                            aVar.f();
                        }
                        if (arrayDeque.isEmpty()) {
                            return oVar;
                        }
                        oVar = (p) arrayDeque.removeLast();
                    }
                }
            case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                BitSet bitSet = new BitSet();
                aVar.a();
                int iW4 = aVar.w();
                int i19 = 0;
                while (iW4 != 2) {
                    int iB = v.h.b(iW4);
                    if (iB == 5 || iB == 6) {
                        int iO2 = aVar.o();
                        if (iO2 != 0) {
                            if (iO2 != 1) {
                                StringBuilder sbY = a0.h.y("Invalid bitset value ", iO2, ", expected 0 or 1; at path ");
                                sbY.append(aVar.h(true));
                                throw new t(sbY.toString());
                            }
                            bitSet.set(i19);
                        } else {
                            continue;
                        }
                    } else {
                        if (iB != 7) {
                            throw new t("Invalid bitset value type: " + kc.r.t(iW4) + "; at path " + aVar.h(false));
                        }
                        if (aVar.m()) {
                            bitSet.set(i19);
                        }
                    }
                    i19++;
                    iW4 = aVar.w();
                }
                aVar.e();
                return bitSet;
            case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                return d(aVar);
            case 23:
                return d(aVar);
            case 24:
                return e(aVar);
            case 25:
                return e(aVar);
            case 26:
                return e(aVar);
            case 27:
                try {
                    return new AtomicInteger(aVar.o());
                } catch (NumberFormatException e16) {
                    throw new t(e16);
                }
            default:
                return new AtomicBoolean(aVar.m());
        }
    }

    @Override // q8.a0
    public final void c(y8.b bVar, Object obj) {
        int i10 = this.f16317a;
        int i11 = 0;
        switch (i10) {
            case 0:
                h(bVar, (Number) obj);
                return;
            case QueueFuseable.SYNC /* 1 */:
                bVar.b();
                int length = ((AtomicIntegerArray) obj).length();
                while (i11 < length) {
                    bVar.n(r7.get(i11));
                    i11++;
                }
                bVar.e();
                return;
            case 2:
                h(bVar, (Number) obj);
                return;
            case 3:
                h(bVar, (Number) obj);
                return;
            case 4:
                h(bVar, (Number) obj);
                return;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                Character ch = (Character) obj;
                bVar.q(ch != null ? String.valueOf(ch) : null);
                return;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                bVar.q((String) obj);
                return;
            case y4.g.NETWORK_ERROR /* 7 */:
                bVar.p((BigDecimal) obj);
                return;
            case 8:
                bVar.p((BigInteger) obj);
                return;
            case 9:
                bVar.p((s8.i) obj);
                return;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                StringBuilder sb = (StringBuilder) obj;
                bVar.q(sb != null ? sb.toString() : null);
                return;
            case 11:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 12:
                StringBuffer stringBuffer = (StringBuffer) obj;
                bVar.q(stringBuffer != null ? stringBuffer.toString() : null);
                return;
            case y4.g.ERROR /* 13 */:
                URL url = (URL) obj;
                bVar.q(url != null ? url.toExternalForm() : null);
                return;
            case y4.g.INTERRUPTED /* 14 */:
                URI uri = (URI) obj;
                bVar.q(uri != null ? uri.toASCIIString() : null);
                return;
            case y4.g.TIMEOUT /* 15 */:
                InetAddress inetAddress = (InetAddress) obj;
                bVar.q(inetAddress != null ? inetAddress.getHostAddress() : null);
                return;
            case y4.g.CANCELED /* 16 */:
                UUID uuid = (UUID) obj;
                bVar.q(uuid != null ? uuid.toString() : null);
                return;
            case y4.g.API_NOT_CONNECTED /* 17 */:
                bVar.q(((Currency) obj).getCurrencyCode());
                return;
            case 18:
                if (((Calendar) obj) == null) {
                    bVar.j();
                    return;
                }
                bVar.c();
                bVar.g("year");
                bVar.n(r7.get(1));
                bVar.g("month");
                bVar.n(r7.get(2));
                bVar.g("dayOfMonth");
                bVar.n(r7.get(5));
                bVar.g("hourOfDay");
                bVar.n(r7.get(11));
                bVar.g("minute");
                bVar.n(r7.get(12));
                bVar.g("second");
                bVar.n(r7.get(13));
                bVar.f();
                return;
            case y4.g.REMOTE_EXCEPTION /* 19 */:
                Locale locale = (Locale) obj;
                bVar.q(locale != null ? locale.toString() : null);
                return;
            case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                g((p) obj, bVar);
                return;
            case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                BitSet bitSet = (BitSet) obj;
                bVar.b();
                int length2 = bitSet.length();
                while (i11 < length2) {
                    bVar.n(bitSet.get(i11) ? 1L : 0L);
                    i11++;
                }
                bVar.e();
                return;
            case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                Boolean bool = (Boolean) obj;
                switch (i10) {
                    case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                        bVar.o(bool);
                        return;
                    default:
                        bVar.q(bool != null ? bool.toString() : "null");
                        return;
                }
            case 23:
                Boolean bool2 = (Boolean) obj;
                switch (i10) {
                    case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                        bVar.o(bool2);
                        return;
                    default:
                        bVar.q(bool2 != null ? bool2.toString() : "null");
                        return;
                }
            case 24:
                h(bVar, (Number) obj);
                return;
            case 25:
                h(bVar, (Number) obj);
                return;
            case 26:
                h(bVar, (Number) obj);
                return;
            case 27:
                bVar.n(((AtomicInteger) obj).get());
                return;
            default:
                bVar.r(((AtomicBoolean) obj).get());
                return;
        }
    }

    public final Boolean d(y8.a aVar) throws IOException {
        switch (this.f16317a) {
            case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                int iW = aVar.w();
                if (iW != 9) {
                    return Boolean.valueOf(iW == 6 ? Boolean.parseBoolean(aVar.u()) : aVar.m());
                }
                aVar.s();
                return null;
            default:
                if (aVar.w() != 9) {
                    return Boolean.valueOf(aVar.u());
                }
                aVar.s();
                return null;
        }
    }

    public final Number e(y8.a aVar) throws IOException {
        switch (this.f16317a) {
            case 0:
                if (aVar.w() != 9) {
                    return Long.valueOf(aVar.p());
                }
                aVar.s();
                return null;
            case 2:
                if (aVar.w() == 9) {
                    aVar.s();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.p());
                } catch (NumberFormatException e10) {
                    throw new t(e10);
                }
            case 3:
                if (aVar.w() != 9) {
                    return Float.valueOf((float) aVar.n());
                }
                aVar.s();
                return null;
            case 4:
                if (aVar.w() != 9) {
                    return Double.valueOf(aVar.n());
                }
                aVar.s();
                return null;
            case 24:
                if (aVar.w() == 9) {
                    aVar.s();
                    return null;
                }
                try {
                    int iO = aVar.o();
                    if (iO <= 255 && iO >= -128) {
                        return Byte.valueOf((byte) iO);
                    }
                    StringBuilder sbY = a0.h.y("Lossy conversion from ", iO, " to byte; at path ");
                    sbY.append(aVar.h(true));
                    throw new t(sbY.toString());
                } catch (NumberFormatException e11) {
                    throw new t(e11);
                }
            case 25:
                if (aVar.w() == 9) {
                    aVar.s();
                    return null;
                }
                try {
                    int iO2 = aVar.o();
                    if (iO2 <= 65535 && iO2 >= -32768) {
                        return Short.valueOf((short) iO2);
                    }
                    StringBuilder sbY2 = a0.h.y("Lossy conversion from ", iO2, " to short; at path ");
                    sbY2.append(aVar.h(true));
                    throw new t(sbY2.toString());
                } catch (NumberFormatException e12) {
                    throw new t(e12);
                }
            default:
                if (aVar.w() == 9) {
                    aVar.s();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.o());
                } catch (NumberFormatException e13) {
                    throw new t(e13);
                }
        }
    }

    public final void h(y8.b bVar, Number number) throws IOException {
        switch (this.f16317a) {
            case 0:
                if (number != null) {
                    bVar.q(number.toString());
                    break;
                } else {
                    bVar.j();
                    break;
                }
            case 2:
                if (number != null) {
                    bVar.n(number.longValue());
                    break;
                } else {
                    bVar.j();
                    break;
                }
            case 3:
                if (number != null) {
                    if (!(number instanceof Float)) {
                        number = Float.valueOf(number.floatValue());
                    }
                    bVar.p(number);
                    break;
                } else {
                    bVar.j();
                    break;
                }
            case 4:
                if (number != null) {
                    bVar.m(number.doubleValue());
                    break;
                } else {
                    bVar.j();
                    break;
                }
            case 24:
                if (number != null) {
                    bVar.n(number.byteValue());
                    break;
                } else {
                    bVar.j();
                    break;
                }
            case 25:
                if (number != null) {
                    bVar.n(number.shortValue());
                    break;
                } else {
                    bVar.j();
                    break;
                }
            default:
                if (number != null) {
                    bVar.n(number.intValue());
                    break;
                } else {
                    bVar.j();
                    break;
                }
        }
    }
}