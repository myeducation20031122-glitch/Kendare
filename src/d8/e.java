package d8;

import android.util.Base64;
import android.util.JsonWriter;
import b8.f;
import b8.g;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements b8.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12357a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f12358b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f12359c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f12360d;

    /* renamed from: e, reason: collision with root package name */
    public final b8.d f12361e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12362f;

    public e(Writer writer, HashMap map, HashMap map2, a aVar, boolean z7) {
        this.f12358b = new JsonWriter(writer);
        this.f12359c = map;
        this.f12360d = map2;
        this.f12361e = aVar;
        this.f12362f = z7;
    }

    @Override // b8.e
    public final b8.e a(b8.c cVar, Object obj) throws IOException {
        h(obj, cVar.f1970a);
        return this;
    }

    @Override // b8.g
    public final g b(String str) throws IOException {
        i();
        this.f12358b.value(str);
        return this;
    }

    @Override // b8.g
    public final g c(boolean z7) throws IOException {
        i();
        this.f12358b.value(z7);
        return this;
    }

    @Override // b8.e
    public final b8.e d(b8.c cVar, boolean z7) throws IOException {
        String str = cVar.f1970a;
        i();
        JsonWriter jsonWriter = this.f12358b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(z7);
        return this;
    }

    @Override // b8.e
    public final b8.e e(b8.c cVar, int i10) throws IOException {
        String str = cVar.f1970a;
        i();
        JsonWriter jsonWriter = this.f12358b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(i10);
        return this;
    }

    @Override // b8.e
    public final b8.e f(b8.c cVar, long j10) throws IOException {
        String str = cVar.f1970a;
        i();
        JsonWriter jsonWriter = this.f12358b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(j10);
        return this;
    }

    public final e g(Object obj) {
        JsonWriter jsonWriter = this.f12358b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    g(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        h(entry.getValue(), (String) key);
                    } catch (ClassCastException e10) {
                        throw new b8.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            b8.d dVar = (b8.d) this.f12359c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            f fVar = (f) this.f12360d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                i();
                jsonWriter.value(strName);
                return this;
            }
            jsonWriter.beginObject();
            this.f12361e.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            i();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                jsonWriter.value(r7[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                long j10 = jArr[i10];
                i();
                jsonWriter.value(j10);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                jsonWriter.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                jsonWriter.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i10 < length5) {
                g(numberArr[i10]);
                i10++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i10 < length6) {
                g(objArr[i10]);
                i10++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e h(Object obj, String str) throws IOException {
        boolean z7 = this.f12362f;
        JsonWriter jsonWriter = this.f12358b;
        if (z7) {
            if (obj != null) {
                i();
                jsonWriter.name(str);
                g(obj);
            }
            return this;
        }
        i();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            g(obj);
        }
        return this;
    }

    public final void i() {
        if (!this.f12357a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}