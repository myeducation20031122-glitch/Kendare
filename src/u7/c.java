package u7;

import a2.n;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.measurement.l9;
import d8.d;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import m.s3;
import o0.h;
import p5.g;
import t7.f0;
import t7.g0;
import t7.h0;
import t7.j0;
import t7.k0;
import t7.m0;
import t7.o0;
import t7.p1;
import t7.q0;
import t7.q1;
import t7.v;
import t7.w;
import t7.x;
import t7.y;
import t7.z;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final g f18296a;

    static {
        d dVar = new d();
        v.f17951a.a(dVar);
        dVar.f12356d = true;
        f18296a = new g(dVar);
    }

    public static m0 a(JsonReader jsonReader) throws IOException {
        q.d dVar = new q.d(10);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    dVar.f16090j = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    dVar.f16088e = strNextString;
                    break;
                case "pc":
                    dVar.f16087b = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    dVar.f16089f = jsonReader.nextString();
                    break;
                case "importance":
                    dVar.f16091m = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return dVar.e();
    }

    public static y b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        String strConcat = strNextString == null ? " key" : "";
        if (strNextString2 == null) {
            strConcat = strConcat.concat(" value");
        }
        if (strConcat.isEmpty()) {
            return new y(strNextString, strNextString2);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public static q1 c(JsonReader jsonReader, b bVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(bVar.b(jsonReader));
        }
        jsonReader.endArray();
        return new q1(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f0 d(JsonReader jsonReader) throws IOException {
        char c10;
        String strConcat;
        q.d dVar = new q.d(6);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName.hashCode()) {
                case -1335157162:
                    if (!strNextName.equals("device")) {
                        c10 = 65535;
                        break;
                    } else {
                        c10 = 0;
                        break;
                    }
                case 96801:
                    if (strNextName.equals("app")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (strNextName.equals("log")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (strNextName.equals("type")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (strNextName.equals("timestamp")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            if (c10 != 0) {
                String str = null;
                if (c10 == 1) {
                    jsonReader.beginObject();
                    h0 h0Var = null;
                    Integer numValueOf = null;
                    q1 q1VarC = null;
                    q1 q1VarC2 = null;
                    Boolean boolValueOf = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "background":
                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case "execution":
                                jsonReader.beginObject();
                                k0 k0VarI = null;
                                j0 j0VarE = null;
                                x xVarC = null;
                                q1 q1VarC3 = null;
                                q1 q1VarC4 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName3 = jsonReader.nextName();
                                    strNextName3.getClass();
                                    switch (strNextName3) {
                                        case "appExitInfo":
                                            android.support.v4.media.b bVar = new android.support.v4.media.b(12);
                                            jsonReader.beginObject();
                                            while (jsonReader.hasNext()) {
                                                String strNextName4 = jsonReader.nextName();
                                                strNextName4.getClass();
                                                switch (strNextName4) {
                                                    case "pid":
                                                        bVar.f487e = Integer.valueOf(jsonReader.nextInt());
                                                        break;
                                                    case "pss":
                                                        bVar.f490m = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case "rss":
                                                        bVar.f491n = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case "timestamp":
                                                        bVar.f492t = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case "processName":
                                                        String strNextString = jsonReader.nextString();
                                                        if (strNextString == null) {
                                                            throw new NullPointerException("Null processName");
                                                        }
                                                        bVar.f486b = strNextString;
                                                        break;
                                                    case "reasonCode":
                                                        bVar.f488f = Integer.valueOf(jsonReader.nextInt());
                                                        break;
                                                    case "traceFile":
                                                        bVar.f493u = jsonReader.nextString();
                                                        break;
                                                    case "importance":
                                                        bVar.f489j = Integer.valueOf(jsonReader.nextInt());
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            xVarC = bVar.c();
                                            break;
                                        case "threads":
                                            q1VarC3 = c(jsonReader, new h(28));
                                            break;
                                        case "signal":
                                            o5.d dVar2 = new o5.d(13);
                                            jsonReader.beginObject();
                                            while (jsonReader.hasNext()) {
                                                String strNextName5 = jsonReader.nextName();
                                                strNextName5.getClass();
                                                switch (strNextName5) {
                                                    case "address":
                                                        dVar2.f15723j = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case "code":
                                                        String strNextString2 = jsonReader.nextString();
                                                        if (strNextString2 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        dVar2.f15722f = strNextString2;
                                                        break;
                                                    case "name":
                                                        String strNextString3 = jsonReader.nextString();
                                                        if (strNextString3 == null) {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                        dVar2.f15721e = strNextString3;
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            k0VarI = dVar2.i();
                                            break;
                                        case "binaries":
                                            q1VarC4 = c(jsonReader, new h(29));
                                            break;
                                        case "exception":
                                            j0VarE = e(jsonReader);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                String strConcat2 = k0VarI == null ? " signal" : "";
                                if (q1VarC4 == null) {
                                    strConcat2 = strConcat2.concat(" binaries");
                                }
                                if (!strConcat2.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(strConcat2));
                                }
                                h0Var = new h0(q1VarC3, j0VarE, xVarC, k0VarI, q1VarC4);
                                break;
                            case "internalKeys":
                                q1VarC2 = c(jsonReader, new h(27));
                                break;
                            case "customAttributes":
                                q1VarC = c(jsonReader, new h(26));
                                break;
                            case "uiOrientation":
                                numValueOf = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    strConcat = h0Var == null ? " execution" : "";
                    if (numValueOf == null) {
                        strConcat = strConcat.concat(" uiOrientation");
                    }
                    if (!strConcat.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strConcat));
                    }
                    dVar.f16089f = new g0(h0Var, q1VarC, q1VarC2, boolValueOf, numValueOf.intValue());
                } else if (c10 == 2) {
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName6 = jsonReader.nextName();
                        strNextName6.getClass();
                        if (strNextName6.equals("content")) {
                            String strNextString4 = jsonReader.nextString();
                            if (strNextString4 == null) {
                                throw new NullPointerException("Null content");
                            }
                            str = strNextString4;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    strConcat = str == null ? " content" : "";
                    if (!strConcat.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strConcat));
                    }
                    dVar.f16091m = new o0(str);
                } else if (c10 == 3) {
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        throw new NullPointerException("Null type");
                    }
                    dVar.f16088e = strNextString5;
                } else if (c10 != 4) {
                    jsonReader.skipValue();
                } else {
                    dVar.f16087b = Long.valueOf(jsonReader.nextLong());
                }
            } else {
                v7.b bVar2 = new v7.b(6);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName7 = jsonReader.nextName();
                    strNextName7.getClass();
                    switch (strNextName7) {
                        case "batteryLevel":
                            bVar2.f18509b = Double.valueOf(jsonReader.nextDouble());
                            break;
                        case "batteryVelocity":
                            bVar2.f18510e = Integer.valueOf(jsonReader.nextInt());
                            break;
                        case "orientation":
                            bVar2.f18512j = Integer.valueOf(jsonReader.nextInt());
                            break;
                        case "diskUsed":
                            bVar2.f18514n = Long.valueOf(jsonReader.nextLong());
                            break;
                        case "ramUsed":
                            bVar2.f18513m = Long.valueOf(jsonReader.nextLong());
                            break;
                        case "proximityOn":
                            bVar2.f18511f = Boolean.valueOf(jsonReader.nextBoolean());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                dVar.f16090j = bVar2.b();
            }
        }
        jsonReader.endObject();
        return dVar.c();
    }

    public static j0 e(JsonReader jsonReader) throws IOException {
        int i10;
        q.d dVar = new q.d(9);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            i10 = 1;
            switch (strNextName) {
                case "frames":
                    dVar.f16089f = c(jsonReader, new a(i10));
                    break;
                case "reason":
                    dVar.f16088e = jsonReader.nextString();
                    break;
                case "type":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null type");
                    }
                    dVar.f16087b = strNextString;
                    break;
                case "causedBy":
                    dVar.f16090j = e(jsonReader);
                    break;
                case "overflowCount":
                    dVar.f16091m = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return dVar.d();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static w f(JsonReader jsonReader) throws IOException {
        char c10;
        Charset charset = p1.f17905a;
        android.support.v4.media.b bVar = new android.support.v4.media.b(11);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName.hashCode()) {
                case -2118372775:
                    if (!strNextName.equals("ndkPayload")) {
                        c10 = 65535;
                        break;
                    } else {
                        c10 = 0;
                        break;
                    }
                case -1962630338:
                    if (strNextName.equals("sdkVersion")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -911706486:
                    if (strNextName.equals("buildVersion")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 344431858:
                    if (strNextName.equals("gmpAppId")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (strNextName.equals("installationUuid")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1874684019:
                    if (strNextName.equals("platform")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1975623094:
                    if (strNextName.equals("displayVersion")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1984987798:
                    if (strNextName.equals("session")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    l9 l9Var = new l9(19);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            l9Var.f10881e = c(jsonReader, new h(25));
                        } else if (strNextName2.equals("orgId")) {
                            l9Var.f10882f = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str = ((q1) l9Var.f10881e) == null ? " files" : "";
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    bVar.f493u = new z((q1) l9Var.f10881e, (String) l9Var.f10882f);
                    break;
                case QueueFuseable.SYNC /* 1 */:
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    bVar.f486b = strNextString;
                    break;
                case 2:
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    bVar.f490m = strNextString2;
                    break;
                case 3:
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    bVar.f487e = strNextString3;
                    break;
                case 4:
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    bVar.f489j = strNextString4;
                    break;
                case y4.g.INVALID_ACCOUNT /* 5 */:
                    bVar.f488f = Integer.valueOf(jsonReader.nextInt());
                    break;
                case y4.g.RESOLUTION_REQUIRED /* 6 */:
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    bVar.f491n = strNextString5;
                    break;
                case y4.g.NETWORK_ERROR /* 7 */:
                    r5 r5Var = new r5(4);
                    r5Var.f7941e = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                r5Var.f7939c = Long.valueOf(jsonReader.nextLong());
                            case "identifier":
                                r5Var.f7938b = new String(Base64.decode(jsonReader.nextString(), 2), p1.f17905a);
                            case "endedAt":
                                r5Var.f7940d = Long.valueOf(jsonReader.nextLong());
                            case "device":
                                n nVar = new n(7);
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            nVar.f272m = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "manufacturer":
                                            String strNextString6 = jsonReader.nextString();
                                            if (strNextString6 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            nVar.f275u = strNextString6;
                                            break;
                                        case "ram":
                                            nVar.f270f = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "arch":
                                            nVar.f268b = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "diskSpace":
                                            nVar.f271j = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "cores":
                                            nVar.f269e = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "model":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            nVar.f274t = strNextString7;
                                            break;
                                        case "state":
                                            nVar.f273n = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "modelClass":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            nVar.f276w = strNextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                r5Var.f7945i = nVar.b();
                            case "events":
                                r5Var.f7946j = c(jsonReader, new h(24));
                            case "os":
                                g2.h hVar = new g2.h(11);
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            hVar.f13013f = strNextString9;
                                            break;
                                        case "jailbroken":
                                            hVar.f13014j = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "version":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            hVar.f13012e = strNextString10;
                                            break;
                                        case "platform":
                                            hVar.f13011b = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                r5Var.f7944h = hVar.e();
                            case "app":
                                s3 s3Var = new s3(12);
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6) {
                                        case "identifier":
                                            String strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            s3Var.f14927b = strNextString11;
                                            break;
                                        case "developmentPlatform":
                                            s3Var.f14932n = jsonReader.nextString();
                                            break;
                                        case "developmentPlatformVersion":
                                            s3Var.f14933t = jsonReader.nextString();
                                            break;
                                        case "version":
                                            String strNextString12 = jsonReader.nextString();
                                            if (strNextString12 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            s3Var.f14928e = strNextString12;
                                            break;
                                        case "installationUuid":
                                            s3Var.f14931m = jsonReader.nextString();
                                            break;
                                        case "displayVersion":
                                            s3Var.f14929f = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                r5Var.f7942f = s3Var.d();
                            case "user":
                                jsonReader.beginObject();
                                String strNextString13 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName7 = jsonReader.nextName();
                                    strNextName7.getClass();
                                    if (strNextName7.equals("identifier")) {
                                        strNextString13 = jsonReader.nextString();
                                        if (strNextString13 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                String str2 = strNextString13 == null ? " identifier" : "";
                                if (!str2.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str2));
                                }
                                r5Var.f7943g = new q0(strNextString13);
                            case "generator":
                                String strNextString14 = jsonReader.nextString();
                                if (strNextString14 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                r5Var.f7937a = strNextString14;
                            case "crashed":
                                r5Var.f7941e = Boolean.valueOf(jsonReader.nextBoolean());
                            case "generatorType":
                                r5Var.f7947k = Integer.valueOf(jsonReader.nextInt());
                            default:
                                jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    bVar.f492t = r5Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }

    public static w g(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                w wVarF = f(jsonReader);
                jsonReader.close();
                return wVarF;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }
}