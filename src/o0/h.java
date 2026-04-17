package o0;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.internal.measurement.l9;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class h implements t1.s, o3.h, x3.j, y6.z, p8.e, i8.a, u7.b, m7.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15548b;

    public /* synthetic */ h(int i10) {
        this.f15548b = i10;
    }

    @Override // m7.d
    public Object a(m7.s sVar) {
        switch (this.f15548b) {
            case 0:
                return TransportRegistrar.lambda$getComponents$0(sVar);
            case QueueFuseable.SYNC /* 1 */:
                return new g8.d((Context) sVar.a(Context.class), ((i7.g) sVar.a(i7.g.class)).d(), sVar.b(g8.e.class), sVar.c(p8.b.class));
            case 2:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(sVar);
            case 3:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(sVar);
            default:
                Set setB = sVar.b(p8.a.class);
                p8.c cVar = p8.c.f16071f;
                if (cVar == null) {
                    synchronized (p8.c.class) {
                        try {
                            cVar = p8.c.f16071f;
                            if (cVar == null) {
                                cVar = new p8.c(0);
                                p8.c.f16071f = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new p8.b(setB, cVar);
        }
    }

    @Override // x3.j
    public Object apply(Object obj) {
        switch (this.f15548b) {
            case 9:
                o3.c cVar = x3.l.f18936n;
                return (List) x3.l.h(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new h(13));
            case y4.g.DEVELOPER_ERROR /* 10 */:
                o3.c cVar2 = x3.l.f18936n;
                throw new y3.a("Timed out while trying to open db.", (Throwable) obj);
            case 11:
                Cursor cursor = (Cursor) obj;
                o3.c cVar3 = x3.l.f18936n;
                return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
            case 12:
                o3.c cVar4 = x3.l.f18936n;
                throw new y3.a("Timed out while trying to acquire the lock.", (Throwable) obj);
            case y4.g.ERROR /* 13 */:
                Cursor cursor2 = (Cursor) obj;
                o3.c cVar5 = x3.l.f18936n;
                ArrayList arrayList = new ArrayList();
                while (cursor2.moveToNext()) {
                    g.e eVarA = r3.i.a();
                    eVarA.N(cursor2.getString(1));
                    eVarA.O(a4.a.b(cursor2.getInt(2)));
                    String string = cursor2.getString(3);
                    eVarA.f12764f = string == null ? null : Base64.decode(string, 0);
                    arrayList.add(eVarA.k());
                }
                return arrayList;
            case y4.g.INTERRUPTED /* 14 */:
                Cursor cursor3 = (Cursor) obj;
                o3.c cVar6 = x3.l.f18936n;
                if (cursor3.moveToNext()) {
                    return Long.valueOf(cursor3.getLong(0));
                }
                return null;
            case y4.g.TIMEOUT /* 15 */:
                o3.c cVar7 = x3.l.f18936n;
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            case y4.g.CANCELED /* 16 */:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            default:
                Cursor cursor4 = (Cursor) obj;
                o3.c cVar8 = x3.l.f18936n;
                ArrayList arrayList2 = new ArrayList();
                int length = 0;
                while (cursor4.moveToNext()) {
                    byte[] blob = cursor4.getBlob(0);
                    arrayList2.add(blob);
                    length += blob.length;
                }
                byte[] bArr = new byte[length];
                int length2 = 0;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    byte[] bArr2 = (byte[]) arrayList2.get(i10);
                    System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                    length2 += bArr2.length;
                }
                return bArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // u7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(JsonReader jsonReader) throws IOException {
        int i10 = 0;
        switch (this.f15548b) {
            case 24:
                return u7.c.d(jsonReader);
            case 25:
                p5.g gVar = u7.c.f18296a;
                l9 l9Var = new l9(20);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    if (strNextName.equals("filename")) {
                        String strNextString = jsonReader.nextString();
                        if (strNextString == null) {
                            throw new NullPointerException("Null filename");
                        }
                        l9Var.f10881e = strNextString;
                    } else if (strNextName.equals("contents")) {
                        byte[] bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                        if (bArrDecode == null) {
                            throw new NullPointerException("Null contents");
                        }
                        l9Var.f10882f = bArrDecode;
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                String strConcat = ((String) l9Var.f10881e) == null ? " filename" : "";
                if (((byte[]) l9Var.f10882f) == null) {
                    strConcat = strConcat.concat(" contents");
                }
                if (strConcat.isEmpty()) {
                    return new t7.a0((String) l9Var.f10881e, (byte[]) l9Var.f10882f);
                }
                throw new IllegalStateException("Missing required properties:".concat(strConcat));
            case 26:
                return u7.c.b(jsonReader);
            case 27:
                return u7.c.b(jsonReader);
            case 28:
                p5.g gVar2 = u7.c.f18296a;
                o5.d dVar = new o5.d(14);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    switch (strNextName2) {
                        case "frames":
                            dVar.f15723j = u7.c.c(jsonReader, new u7.a(i10));
                            break;
                        case "name":
                            String strNextString2 = jsonReader.nextString();
                            if (strNextString2 == null) {
                                throw new NullPointerException("Null name");
                            }
                            dVar.f15721e = strNextString2;
                            break;
                        case "importance":
                            dVar.f15722f = Integer.valueOf(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return dVar.j();
            default:
                p5.g gVar3 = u7.c.f18296a;
                n8.s sVar = new n8.s(10);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName3 = jsonReader.nextName();
                    strNextName3.getClass();
                    switch (strNextName3) {
                        case "name":
                            String strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                throw new NullPointerException("Null name");
                            }
                            sVar.f15435b = strNextString3;
                            break;
                        case "size":
                            sVar.f15437f = Long.valueOf(jsonReader.nextLong());
                            break;
                        case "uuid":
                            sVar.f15438j = new String(Base64.decode(jsonReader.nextString(), 2), t7.p1.f17905a);
                            break;
                        case "baseAddress":
                            sVar.f15436e = Long.valueOf(jsonReader.nextLong());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return sVar.a();
        }
    }

    @Override // o3.h
    public void c(Exception exc) {
    }

    @Override // i8.a
    public void d(i8.c cVar) {
    }
}