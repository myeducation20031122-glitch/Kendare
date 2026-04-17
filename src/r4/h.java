package r4;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f16482a;

    /* renamed from: b, reason: collision with root package name */
    public String f16483b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f16484c = new Bundle();

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(JsonReader jsonReader) throws IOException {
        char c10;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? "" : strNextName;
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -995427962) {
                c10 = (iHashCode == -271442291 && strNextName.equals("signal_dictionary")) ? (char) 1 : (char) 65535;
            } else if (strNextName.equals("params")) {
                c10 = 0;
            }
            if (c10 == 0) {
                strNextString = jsonReader.nextString();
            } else if (c10 != 1) {
                jsonReader.skipValue();
            } else {
                map = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    map.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            }
        }
        this.f16482a = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f16484c.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }
}