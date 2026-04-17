package e8;

import com.google.android.gms.internal.ads.yl0;
import com.google.android.gms.internal.measurement.l9;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements b8.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f12548f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final b8.c f12549g;

    /* renamed from: h, reason: collision with root package name */
    public static final b8.c f12550h;

    /* renamed from: i, reason: collision with root package name */
    public static final d8.a f12551i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f12552a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f12553b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f12554c;

    /* renamed from: d, reason: collision with root package name */
    public final b8.d f12555d;

    /* renamed from: e, reason: collision with root package name */
    public final h f12556e = new h(this);

    static {
        l9 l9VarA = b8.c.a("key");
        yl0 yl0VarH = yl0.h();
        yl0VarH.f10132e = 1;
        f12549g = r.c(yl0VarH, l9VarA);
        l9 l9VarA2 = b8.c.a("value");
        yl0 yl0VarH2 = yl0.h();
        yl0VarH2.f10132e = 2;
        f12550h = r.c(yl0VarH2, l9VarA2);
        f12551i = new d8.a(1);
    }

    public f(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, b8.d dVar) {
        this.f12552a = byteArrayOutputStream;
        this.f12553b = map;
        this.f12554c = map2;
        this.f12555d = dVar;
    }

    public static int i(b8.c cVar) {
        e eVar = (e) ((Annotation) cVar.f1971b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f12543a;
        }
        throw new b8.b("Field has no @Protobuf config");
    }

    @Override // b8.e
    public final b8.e a(b8.c cVar, Object obj) {
        g(cVar, obj, true);
        return this;
    }

    public final void b(b8.c cVar, int i10, boolean z7) {
        if (z7 && i10 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f1971b.get(e.class));
        if (eVar == null) {
            throw new b8.b("Field has no @Protobuf config");
        }
        a aVar = (a) eVar;
        int iOrdinal = aVar.f12544b.ordinal();
        int i11 = aVar.f12543a;
        if (iOrdinal == 0) {
            j(i11 << 3);
            j(i10);
        } else if (iOrdinal == 1) {
            j(i11 << 3);
            j((i10 << 1) ^ (i10 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            j((i11 << 3) | 5);
            this.f12552a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
        }
    }

    public final void c(b8.c cVar, long j10, boolean z7) throws IOException {
        if (z7 && j10 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f1971b.get(e.class));
        if (eVar == null) {
            throw new b8.b("Field has no @Protobuf config");
        }
        a aVar = (a) eVar;
        int iOrdinal = aVar.f12544b.ordinal();
        int i10 = aVar.f12543a;
        if (iOrdinal == 0) {
            j(i10 << 3);
            k(j10);
        } else if (iOrdinal == 1) {
            j(i10 << 3);
            k((j10 >> 63) ^ (j10 << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            j((i10 << 3) | 1);
            this.f12552a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j10).array());
        }
    }

    @Override // b8.e
    public final b8.e d(b8.c cVar, boolean z7) {
        b(cVar, z7 ? 1 : 0, true);
        return this;
    }

    @Override // b8.e
    public final b8.e e(b8.c cVar, int i10) {
        b(cVar, i10, true);
        return this;
    }

    @Override // b8.e
    public final b8.e f(b8.c cVar, long j10) throws IOException {
        c(cVar, j10, true);
        return this;
    }

    public final void g(b8.c cVar, Object obj, boolean z7) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z7 && charSequence.length() == 0) {
                return;
            }
            j((i(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f12548f);
            j(bytes.length);
            this.f12552a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                g(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                h(f12551i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z7 && dDoubleValue == 0.0d) {
                return;
            }
            j((i(cVar) << 3) | 1);
            this.f12552a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z7 && fFloatValue == 0.0f) {
                return;
            }
            j((i(cVar) << 3) | 5);
            this.f12552a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            c(cVar, ((Number) obj).longValue(), z7);
            return;
        }
        if (obj instanceof Boolean) {
            b(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z7);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z7 && bArr.length == 0) {
                return;
            }
            j((i(cVar) << 3) | 2);
            j(bArr.length);
            this.f12552a.write(bArr);
            return;
        }
        b8.d dVar = (b8.d) this.f12553b.get(obj.getClass());
        if (dVar != null) {
            h(dVar, cVar, obj, z7);
            return;
        }
        b8.f fVar = (b8.f) this.f12554c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f12556e;
            hVar.f12558a = false;
            hVar.f12560c = cVar;
            hVar.f12559b = z7;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            b(cVar, ((c) obj).a(), true);
        } else if (obj instanceof Enum) {
            b(cVar, ((Enum) obj).ordinal(), true);
        } else {
            h(this.f12555d, cVar, obj, z7);
        }
    }

    public final void h(b8.d dVar, b8.c cVar, Object obj, boolean z7) throws IOException {
        b bVar = new b();
        bVar.f12545b = 0L;
        try {
            OutputStream outputStream = this.f12552a;
            this.f12552a = bVar;
            try {
                dVar.a(obj, this);
                this.f12552a = outputStream;
                long j10 = bVar.f12545b;
                bVar.close();
                if (z7 && j10 == 0) {
                    return;
                }
                j((i(cVar) << 3) | 2);
                k(j10);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f12552a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void j(int i10) throws IOException {
        while (true) {
            long j10 = i10 & (-128);
            OutputStream outputStream = this.f12552a;
            if (j10 == 0) {
                outputStream.write(i10 & 127);
                return;
            } else {
                outputStream.write((i10 & 127) | 128);
                i10 >>>= 7;
            }
        }
    }

    public final void k(long j10) throws IOException {
        while (true) {
            long j11 = (-128) & j10;
            OutputStream outputStream = this.f12552a;
            if (j11 == 0) {
                outputStream.write(((int) j10) & 127);
                return;
            } else {
                outputStream.write((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
        }
    }
}