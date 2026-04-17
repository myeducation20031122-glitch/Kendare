package q3;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final long f16234a;

    public u(long j10) {
        this.f16234a = j10;
    }

    public static u a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new u(Long.parseLong(jsonReader.nextString())) : new u(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            return this.f16234a == ((u) obj).f16234a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f16234a;
        return 1000003 ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return a0.h.x(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f16234a, "}");
    }
}