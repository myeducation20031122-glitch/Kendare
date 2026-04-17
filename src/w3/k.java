package w3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.android.libraries.places.api.model.PlaceTypes;
import g.v0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import m.s3;
import o5.y;
import q3.a0;
import q3.f0;
import q3.g0;
import q3.h0;
import q3.i0;
import q3.o;
import q3.p;
import q3.q;
import q3.r;
import q3.s;
import q3.v;
import q3.x;
import q3.z;
import r3.n;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18634a;

    /* renamed from: b, reason: collision with root package name */
    public final s3.g f18635b;

    /* renamed from: c, reason: collision with root package name */
    public final x3.d f18636c;

    /* renamed from: d, reason: collision with root package name */
    public final m f18637d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f18638e;

    /* renamed from: f, reason: collision with root package name */
    public final y3.c f18639f;

    /* renamed from: g, reason: collision with root package name */
    public final z3.a f18640g;

    /* renamed from: h, reason: collision with root package name */
    public final z3.a f18641h;

    /* renamed from: i, reason: collision with root package name */
    public final x3.c f18642i;

    public k(Context context, s3.g gVar, x3.d dVar, m mVar, Executor executor, y3.c cVar, z3.a aVar, z3.a aVar2, x3.c cVar2) {
        this.f18634a = context;
        this.f18635b = gVar;
        this.f18636c = dVar;
        this.f18637d = mVar;
        this.f18638e = executor;
        this.f18639f = cVar;
        this.f18640g = aVar;
        this.f18641h = aVar2;
        this.f18642i = cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0395, code lost:
    
        r24 = r3;
        r25 = r9;
        r14.f14932n = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x03a0, code lost:
    
        if (((java.lang.Long) r14.f14927b) != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x03a2, code lost:
    
        r22 = " requestTimeMs";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x03a4, code lost:
    
        r1 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x03aa, code lost:
    
        if (((java.lang.Long) r14.f14928e) != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03ac, code lost:
    
        r1 = r1.concat(" requestUptimeMs");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x03b6, code lost:
    
        if (r1.isEmpty() == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x03b8, code lost:
    
        r4.add(new q3.t(((java.lang.Long) r14.f14927b).longValue(), ((java.lang.Long) r14.f14928e).longValue(), (q3.y) r14.f14929f, (java.lang.Integer) r14.f14930j, (java.lang.String) r14.f14931m, (java.util.List) r14.f14932n, (q3.i0) r14.f14933t));
        r1 = r20;
        r2 = r21;
        r3 = r24;
        r9 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0407, code lost:
    
        throw new java.lang.IllegalStateException("Missing required properties:".concat(r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(r3.i iVar, int i10) {
        s3.h hVar;
        x3.l lVar;
        s3.a aVar;
        String str;
        s3.a aVar2;
        int i11;
        Object objApply;
        String str2;
        String str3;
        x3.l lVar2;
        android.support.v4.media.b bVar;
        int i12;
        final k kVar = this;
        final r3.i iVar2 = iVar;
        s3.h hVarA = kVar.f18635b.a(iVar2.f16409a);
        long jMax = 0;
        while (true) {
            final int i13 = 0;
            y3.b bVar2 = new y3.b(kVar) { // from class: w3.g

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ k f18622e;

                {
                    this.f18622e = kVar;
                }

                @Override // y3.b
                public final Object execute() {
                    int i14 = i13;
                    final r3.i iVar3 = iVar2;
                    k kVar2 = this.f18622e;
                    switch (i14) {
                        case 0:
                            final x3.l lVar3 = (x3.l) kVar2.f18636c;
                            lVar3.getClass();
                            final int i15 = 0;
                            return Boolean.valueOf(((Boolean) lVar3.c(new x3.j() { // from class: x3.g
                                /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
                                /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
                                @Override // x3.j
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object apply(Object obj) {
                                    ListIterator listIterator;
                                    int i16 = i15;
                                    r3.i iVar4 = iVar3;
                                    l lVar4 = lVar3;
                                    switch (i16) {
                                        case 0:
                                            lVar4.getClass();
                                            Long lB = l.b((SQLiteDatabase) obj, iVar4);
                                            return lB == null ? Boolean.FALSE : (Boolean) l.h(lVar4.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lB.toString()}), new o0.h(16));
                                        default:
                                            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                                            a aVar3 = lVar4.f18940j;
                                            ArrayList arrayListD = lVar4.d(sQLiteDatabase, iVar4, aVar3.f18914b);
                                            for (o3.d dVar : o3.d.values()) {
                                                if (dVar != iVar4.f16411c) {
                                                    int size = aVar3.f18914b - arrayListD.size();
                                                    if (size <= 0) {
                                                        HashMap map = new HashMap();
                                                        StringBuilder sb = new StringBuilder("event_id IN (");
                                                        for (int i17 = 0; i17 < arrayListD.size(); i17++) {
                                                            sb.append(((b) arrayListD.get(i17)).f18918a);
                                                            if (i17 < arrayListD.size() - 1) {
                                                                sb.append(',');
                                                            }
                                                        }
                                                        sb.append(')');
                                                        l.h(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new e0.g(map, 9));
                                                        listIterator = arrayListD.listIterator();
                                                        while (listIterator.hasNext()) {
                                                            b bVar3 = (b) listIterator.next();
                                                            if (map.containsKey(Long.valueOf(bVar3.f18918a))) {
                                                                s3 s3VarC = bVar3.f18920c.c();
                                                                long j10 = bVar3.f18918a;
                                                                for (k kVar3 : (Set) map.get(Long.valueOf(j10))) {
                                                                    s3VarC.a(kVar3.f18934a, kVar3.f18935b);
                                                                }
                                                                listIterator.set(new b(j10, bVar3.f18919b, s3VarC.c()));
                                                            }
                                                        }
                                                        return arrayListD;
                                                    }
                                                    g.e eVarA = r3.i.a();
                                                    eVarA.N(iVar4.f16409a);
                                                    eVarA.O(dVar);
                                                    eVarA.f12764f = iVar4.f16410b;
                                                    arrayListD.addAll(lVar4.d(sQLiteDatabase, eVarA.k(), size));
                                                }
                                            }
                                            HashMap map2 = new HashMap();
                                            StringBuilder sb2 = new StringBuilder("event_id IN (");
                                            while (i17 < arrayListD.size()) {
                                            }
                                            sb2.append(')');
                                            l.h(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new e0.g(map2, 9));
                                            listIterator = arrayListD.listIterator();
                                            while (listIterator.hasNext()) {
                                            }
                                            return arrayListD;
                                    }
                                }
                            })).booleanValue());
                        default:
                            final x3.l lVar4 = (x3.l) kVar2.f18636c;
                            lVar4.getClass();
                            final int i16 = 1;
                            return (Iterable) lVar4.c(new x3.j() { // from class: x3.g
                                /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
                                /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
                                @Override // x3.j
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object apply(Object obj) {
                                    ListIterator listIterator;
                                    int i162 = i16;
                                    r3.i iVar4 = iVar3;
                                    l lVar42 = lVar4;
                                    switch (i162) {
                                        case 0:
                                            lVar42.getClass();
                                            Long lB = l.b((SQLiteDatabase) obj, iVar4);
                                            return lB == null ? Boolean.FALSE : (Boolean) l.h(lVar42.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lB.toString()}), new o0.h(16));
                                        default:
                                            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                                            a aVar3 = lVar42.f18940j;
                                            ArrayList arrayListD = lVar42.d(sQLiteDatabase, iVar4, aVar3.f18914b);
                                            for (o3.d dVar : o3.d.values()) {
                                                if (dVar != iVar4.f16411c) {
                                                    int size = aVar3.f18914b - arrayListD.size();
                                                    if (size <= 0) {
                                                        HashMap map2 = new HashMap();
                                                        StringBuilder sb2 = new StringBuilder("event_id IN (");
                                                        for (int i17 = 0; i17 < arrayListD.size(); i17++) {
                                                            sb2.append(((b) arrayListD.get(i17)).f18918a);
                                                            if (i17 < arrayListD.size() - 1) {
                                                                sb2.append(',');
                                                            }
                                                        }
                                                        sb2.append(')');
                                                        l.h(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new e0.g(map2, 9));
                                                        listIterator = arrayListD.listIterator();
                                                        while (listIterator.hasNext()) {
                                                            b bVar3 = (b) listIterator.next();
                                                            if (map2.containsKey(Long.valueOf(bVar3.f18918a))) {
                                                                s3 s3VarC = bVar3.f18920c.c();
                                                                long j10 = bVar3.f18918a;
                                                                for (k kVar3 : (Set) map2.get(Long.valueOf(j10))) {
                                                                    s3VarC.a(kVar3.f18934a, kVar3.f18935b);
                                                                }
                                                                listIterator.set(new b(j10, bVar3.f18919b, s3VarC.c()));
                                                            }
                                                        }
                                                        return arrayListD;
                                                    }
                                                    g.e eVarA = r3.i.a();
                                                    eVarA.N(iVar4.f16409a);
                                                    eVarA.O(dVar);
                                                    eVarA.f12764f = iVar4.f16410b;
                                                    arrayListD.addAll(lVar42.d(sQLiteDatabase, eVarA.k(), size));
                                                }
                                            }
                                            HashMap map22 = new HashMap();
                                            StringBuilder sb22 = new StringBuilder("event_id IN (");
                                            while (i17 < arrayListD.size()) {
                                            }
                                            sb22.append(')');
                                            l.h(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb22.toString(), null, null, null, null), new e0.g(map22, 9));
                                            listIterator = arrayListD.listIterator();
                                            while (listIterator.hasNext()) {
                                            }
                                            return arrayListD;
                                    }
                                }
                            });
                    }
                }
            };
            x3.l lVar3 = (x3.l) kVar.f18639f;
            boolean zBooleanValue = ((Boolean) lVar3.f(bVar2)).booleanValue();
            z3.a aVar3 = kVar.f18640g;
            if (!zBooleanValue) {
                k kVar2 = kVar;
                r3.i iVar3 = iVar2;
                SQLiteDatabase sQLiteDatabaseA = lVar3.a();
                lVar3.e(new e0.g(sQLiteDatabaseA, 8), new o0.h(12));
                try {
                    long jA = ((z3.c) aVar3).a() + jMax;
                    x3.l lVar4 = (x3.l) kVar2.f18636c;
                    lVar4.getClass();
                    lVar4.c(new x3.f(jA, iVar3));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            }
            final int i14 = 1;
            Iterable iterable = (Iterable) lVar3.f(new y3.b(kVar) { // from class: w3.g

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ k f18622e;

                {
                    this.f18622e = kVar;
                }

                @Override // y3.b
                public final Object execute() {
                    int i142 = i14;
                    final r3.i iVar32 = iVar2;
                    k kVar22 = this.f18622e;
                    switch (i142) {
                        case 0:
                            final x3.l lVar32 = (x3.l) kVar22.f18636c;
                            lVar32.getClass();
                            final int i15 = 0;
                            return Boolean.valueOf(((Boolean) lVar32.c(new x3.j() { // from class: x3.g
                                /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
                                /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
                                @Override // x3.j
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object apply(Object obj) {
                                    ListIterator listIterator;
                                    int i162 = i15;
                                    r3.i iVar4 = iVar32;
                                    l lVar42 = lVar32;
                                    switch (i162) {
                                        case 0:
                                            lVar42.getClass();
                                            Long lB = l.b((SQLiteDatabase) obj, iVar4);
                                            return lB == null ? Boolean.FALSE : (Boolean) l.h(lVar42.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lB.toString()}), new o0.h(16));
                                        default:
                                            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                                            a aVar32 = lVar42.f18940j;
                                            ArrayList arrayListD = lVar42.d(sQLiteDatabase, iVar4, aVar32.f18914b);
                                            for (o3.d dVar : o3.d.values()) {
                                                if (dVar != iVar4.f16411c) {
                                                    int size = aVar32.f18914b - arrayListD.size();
                                                    if (size <= 0) {
                                                        HashMap map22 = new HashMap();
                                                        StringBuilder sb22 = new StringBuilder("event_id IN (");
                                                        for (int i17 = 0; i17 < arrayListD.size(); i17++) {
                                                            sb22.append(((b) arrayListD.get(i17)).f18918a);
                                                            if (i17 < arrayListD.size() - 1) {
                                                                sb22.append(',');
                                                            }
                                                        }
                                                        sb22.append(')');
                                                        l.h(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb22.toString(), null, null, null, null), new e0.g(map22, 9));
                                                        listIterator = arrayListD.listIterator();
                                                        while (listIterator.hasNext()) {
                                                            b bVar3 = (b) listIterator.next();
                                                            if (map22.containsKey(Long.valueOf(bVar3.f18918a))) {
                                                                s3 s3VarC = bVar3.f18920c.c();
                                                                long j10 = bVar3.f18918a;
                                                                for (k kVar3 : (Set) map22.get(Long.valueOf(j10))) {
                                                                    s3VarC.a(kVar3.f18934a, kVar3.f18935b);
                                                                }
                                                                listIterator.set(new b(j10, bVar3.f18919b, s3VarC.c()));
                                                            }
                                                        }
                                                        return arrayListD;
                                                    }
                                                    g.e eVarA = r3.i.a();
                                                    eVarA.N(iVar4.f16409a);
                                                    eVarA.O(dVar);
                                                    eVarA.f12764f = iVar4.f16410b;
                                                    arrayListD.addAll(lVar42.d(sQLiteDatabase, eVarA.k(), size));
                                                }
                                            }
                                            HashMap map222 = new HashMap();
                                            StringBuilder sb222 = new StringBuilder("event_id IN (");
                                            while (i17 < arrayListD.size()) {
                                            }
                                            sb222.append(')');
                                            l.h(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb222.toString(), null, null, null, null), new e0.g(map222, 9));
                                            listIterator = arrayListD.listIterator();
                                            while (listIterator.hasNext()) {
                                            }
                                            return arrayListD;
                                    }
                                }
                            })).booleanValue());
                        default:
                            final x3.l lVar42 = (x3.l) kVar22.f18636c;
                            lVar42.getClass();
                            final int i16 = 1;
                            return (Iterable) lVar42.c(new x3.j() { // from class: x3.g
                                /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
                                /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
                                @Override // x3.j
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object apply(Object obj) {
                                    ListIterator listIterator;
                                    int i162 = i16;
                                    r3.i iVar4 = iVar32;
                                    l lVar422 = lVar42;
                                    switch (i162) {
                                        case 0:
                                            lVar422.getClass();
                                            Long lB = l.b((SQLiteDatabase) obj, iVar4);
                                            return lB == null ? Boolean.FALSE : (Boolean) l.h(lVar422.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lB.toString()}), new o0.h(16));
                                        default:
                                            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                                            a aVar32 = lVar422.f18940j;
                                            ArrayList arrayListD = lVar422.d(sQLiteDatabase, iVar4, aVar32.f18914b);
                                            for (o3.d dVar : o3.d.values()) {
                                                if (dVar != iVar4.f16411c) {
                                                    int size = aVar32.f18914b - arrayListD.size();
                                                    if (size <= 0) {
                                                        HashMap map222 = new HashMap();
                                                        StringBuilder sb222 = new StringBuilder("event_id IN (");
                                                        for (int i17 = 0; i17 < arrayListD.size(); i17++) {
                                                            sb222.append(((b) arrayListD.get(i17)).f18918a);
                                                            if (i17 < arrayListD.size() - 1) {
                                                                sb222.append(',');
                                                            }
                                                        }
                                                        sb222.append(')');
                                                        l.h(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb222.toString(), null, null, null, null), new e0.g(map222, 9));
                                                        listIterator = arrayListD.listIterator();
                                                        while (listIterator.hasNext()) {
                                                            b bVar3 = (b) listIterator.next();
                                                            if (map222.containsKey(Long.valueOf(bVar3.f18918a))) {
                                                                s3 s3VarC = bVar3.f18920c.c();
                                                                long j10 = bVar3.f18918a;
                                                                for (k kVar3 : (Set) map222.get(Long.valueOf(j10))) {
                                                                    s3VarC.a(kVar3.f18934a, kVar3.f18935b);
                                                                }
                                                                listIterator.set(new b(j10, bVar3.f18919b, s3VarC.c()));
                                                            }
                                                        }
                                                        return arrayListD;
                                                    }
                                                    g.e eVarA = r3.i.a();
                                                    eVarA.N(iVar4.f16409a);
                                                    eVarA.O(dVar);
                                                    eVarA.f12764f = iVar4.f16410b;
                                                    arrayListD.addAll(lVar422.d(sQLiteDatabase, eVarA.k(), size));
                                                }
                                            }
                                            HashMap map2222 = new HashMap();
                                            StringBuilder sb2222 = new StringBuilder("event_id IN (");
                                            while (i17 < arrayListD.size()) {
                                            }
                                            sb2222.append(')');
                                            l.h(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2222.toString(), null, null, null, null), new e0.g(map2222, 9));
                                            listIterator = arrayListD.listIterator();
                                            while (listIterator.hasNext()) {
                                            }
                                            return arrayListD;
                                    }
                                }
                            });
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte[] bArr = iVar2.f16410b;
            if (hVarA == null) {
                y.g(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar2 = new s3.a(3, -1L);
                hVar = hVarA;
                lVar = lVar3;
            } else {
                ArrayList<r3.h> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((x3.b) it.next()).f18920c);
                }
                String str4 = "proto";
                int i15 = 5;
                if (bArr != null) {
                    x3.c cVar = kVar.f18642i;
                    Objects.requireNonNull(cVar);
                    u3.a aVar4 = (u3.a) lVar3.f(new e0.g(cVar, i15));
                    s3 s3Var = new s3(3);
                    s3Var.f14932n = new HashMap();
                    s3Var.f14930j = Long.valueOf(((z3.c) aVar3).a());
                    s3Var.f14931m = Long.valueOf(((z3.c) kVar.f18641h).a());
                    s3Var.f14927b = "GDT_CLIENT_METRICS";
                    o3.c cVar2 = new o3.c("proto");
                    aVar4.getClass();
                    o5.d dVar = n.f16421a;
                    dVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        dVar.l(aVar4, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    s3Var.f(new r3.l(cVar2, byteArrayOutputStream.toByteArray()));
                    arrayList.add(((p3.d) hVarA).a(s3Var.c()));
                }
                d3.d dVar2 = new d3.d(4);
                dVar2.f12309e = arrayList;
                dVar2.f12310f = bArr;
                p3.d dVar3 = (p3.d) hVarA;
                HashMap map = new HashMap();
                for (r3.h hVar2 : arrayList) {
                    String str5 = hVar2.f16402a;
                    if (map.containsKey(str5)) {
                        ((List) map.get(str5)).add(hVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar2);
                        map.put(str5, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    r3.h hVar3 = (r3.h) ((List) entry.getValue()).get(0);
                    s3.h hVar4 = hVarA;
                    s3 s3Var2 = new s3(2);
                    s3Var2.f14933t = i0.f16182b;
                    s3Var2.f14927b = Long.valueOf(((z3.c) dVar3.f15933f).a());
                    s3Var2.f14928e = Long.valueOf(((z3.c) dVar3.f15932e).a());
                    Iterator it3 = it2;
                    d3.d dVar4 = new d3.d(1);
                    dVar4.f12309e = x.f16237b;
                    q3.m mVar = new q3.m(Integer.valueOf(hVar3.b("sdk-version")), hVar3.a("model"), hVar3.a("hardware"), hVar3.a("device"), hVar3.a("product"), hVar3.a("os-uild"), hVar3.a("manufacturer"), hVar3.a("fingerprint"), hVar3.a("locale"), hVar3.a(PlaceTypes.COUNTRY), hVar3.a("mcc_mnc"), hVar3.a("application_build"));
                    dVar4.f12310f = mVar;
                    s3Var2.f14929f = new o((x) dVar4.f12309e, mVar);
                    try {
                        s3Var2.f14930j = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                    } catch (NumberFormatException unused2) {
                        s3Var2.f14931m = (String) entry.getKey();
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = ((List) entry.getValue()).iterator();
                    while (true) {
                        str2 = "";
                        if (!it4.hasNext()) {
                            break;
                        }
                        r3.h hVar5 = (r3.h) it4.next();
                        Iterator it5 = it4;
                        r3.l lVar5 = hVar5.f16404c;
                        o3.c cVar3 = lVar5.f16418a;
                        boolean zEquals = cVar3.equals(new o3.c(str4));
                        byte[] bArr2 = lVar5.f16419b;
                        if (zEquals) {
                            bVar = new android.support.v4.media.b(1);
                            bVar.f491n = bArr2;
                            str3 = str4;
                        } else {
                            str3 = str4;
                            if (cVar3.equals(new o3.c("json"))) {
                                String str6 = new String(bArr2, Charset.forName("UTF-8"));
                                bVar = new android.support.v4.media.b(1);
                                bVar.f486b = str6;
                            } else {
                                lVar2 = lVar3;
                                String strM = y.m("CctTransportBackend");
                                if (Log.isLoggable(strM, 5)) {
                                    Log.w(strM, String.format("Received event of unsupported encoding %s. Skipping...", cVar3));
                                }
                                it4 = it5;
                                str4 = str3;
                                lVar3 = lVar2;
                            }
                        }
                        bVar.f487e = Long.valueOf(hVar5.f16405d);
                        bVar.f490m = Long.valueOf(hVar5.f16406e);
                        String str7 = (String) hVar5.f16407f.get("tz-offset");
                        bVar.f492t = Long.valueOf(str7 == null ? 0L : Long.valueOf(str7).longValue());
                        d3.d dVar5 = new d3.d(3);
                        dVar5.f12309e = (g0) g0.f16163b.get(hVar5.b("net-type"));
                        f0 f0Var = (f0) f0.f16159b.get(hVar5.b("mobile-subtype"));
                        dVar5.f12310f = f0Var;
                        bVar.f493u = new v((g0) dVar5.f12309e, f0Var);
                        Integer num = hVar5.f16403b;
                        if (num != null) {
                            bVar.f488f = num;
                        }
                        Integer num2 = hVar5.f16408g;
                        if (num2 != null) {
                            d3.d dVar6 = new d3.d(2);
                            v0 v0Var = new v0(21);
                            lVar2 = lVar3;
                            new p8.c(20).f16073e = num2;
                            q qVar = new q(num2);
                            v0Var.f12909e = qVar;
                            r rVar = new r(qVar);
                            dVar6.f12309e = rVar;
                            z zVar = z.f16239b;
                            dVar6.f12310f = zVar;
                            bVar.f489j = new p(rVar, zVar);
                        } else {
                            lVar2 = lVar3;
                        }
                        String strF = ((Long) bVar.f487e) == null ? " eventTimeMs" : "";
                        if (((Long) bVar.f490m) == null) {
                            strF = strF.concat(" eventUptimeMs");
                        }
                        if (((Long) bVar.f492t) == null) {
                            strF = a0.h.F(strF, " timezoneOffsetSeconds");
                        }
                        if (!strF.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strF));
                        }
                        arrayList4.add(new s(((Long) bVar.f487e).longValue(), (Integer) bVar.f488f, (a0) bVar.f489j, ((Long) bVar.f490m).longValue(), (byte[]) bVar.f491n, (String) bVar.f486b, ((Long) bVar.f492t).longValue(), (h0) bVar.f493u));
                        it4 = it5;
                        str4 = str3;
                        lVar3 = lVar2;
                    }
                }
                hVar = hVarA;
                lVar = lVar3;
                q3.n nVar = new q3.n(arrayList3);
                URL urlB = dVar3.f15931d;
                if (bArr != null) {
                    try {
                        p3.a aVarA = p3.a.a(bArr);
                        str = aVarA.f15921b;
                        if (str == null) {
                            str = null;
                        }
                        String str8 = aVarA.f15920a;
                        if (str8 != null) {
                            urlB = p3.d.b(str8);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new s3.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    p3.b bVar3 = new p3.b(urlB, nVar, str);
                    e0.g gVar = new e0.g(dVar3, 2);
                    int i16 = 5;
                    do {
                        objApply = gVar.apply(bVar3);
                        p3.c cVar4 = (p3.c) objApply;
                        URL url = cVar4.f15926b;
                        if (url != null) {
                            y.g(url, "CctTransportBackend", "Following redirect to: %s");
                            bVar3 = new p3.b(cVar4.f15926b, bVar3.f15923b, bVar3.f15924c);
                        } else {
                            bVar3 = null;
                        }
                        if (bVar3 == null) {
                            break;
                        } else {
                            i16--;
                        }
                    } while (i16 >= 1);
                    p3.c cVar5 = (p3.c) objApply;
                    int i17 = cVar5.f15925a;
                    if (i17 == 200) {
                        aVar2 = new s3.a(1, cVar5.f15927c);
                    } else {
                        if (i17 >= 500 || i17 == 404) {
                            aVar = new s3.a(2, -1L);
                        } else if (i17 == 400) {
                            try {
                                aVar = new s3.a(4, -1L);
                            } catch (IOException e10) {
                                e = e10;
                                y.h("CctTransportBackend", "Could not make request to the backend", e);
                                i11 = 2;
                                aVar2 = new s3.a(2, -1L);
                                i12 = aVar2.f16834a;
                                if (i12 != i11) {
                                }
                            }
                        } else {
                            aVar = new s3.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e11) {
                    e = e11;
                }
            }
            i11 = 2;
            i12 = aVar2.f16834a;
            if (i12 != i11) {
                lVar.f(new h(this, iterable, iVar, jMax));
                ((d) this.f18637d).a(iVar, i10 + 1, true);
                return;
            }
            x3.l lVar6 = lVar;
            lVar6.f(new i(0, this, iterable));
            if (i12 == 1) {
                jMax = Math.max(jMax, aVar2.f16835b);
                if (bArr != null) {
                    lVar6.f(new e0.g(this, 4));
                }
            } else if (i12 == 4) {
                HashMap map2 = new HashMap();
                Iterator it6 = iterable.iterator();
                while (it6.hasNext()) {
                    String str9 = ((x3.b) it6.next()).f18920c.f16402a;
                    map2.put(str9, !map2.containsKey(str9) ? 1 : Integer.valueOf(((Integer) map2.get(str9)).intValue() + 1));
                }
                lVar6.f(new i(1, this, map2));
            }
            kVar = this;
            iVar2 = iVar;
            hVarA = hVar;
        }
    }
}