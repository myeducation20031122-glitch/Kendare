package g8;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13084b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f13085e;

    public /* synthetic */ c(d dVar, int i10) {
        this.f13084b = i10;
        this.f13085e = dVar;
    }

    private final String a() {
        String string;
        d dVar = this.f13085e;
        synchronized (dVar) {
            try {
                h hVar = (h) dVar.f13087a.get();
                ArrayList arrayListC = hVar.c();
                hVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < arrayListC.size(); i10++) {
                    a aVar = (a) arrayListC.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", aVar.f13082a);
                    jSONObject.put("dates", new JSONArray((Collection) aVar.f13083b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f13084b) {
            case 0:
                return a();
            default:
                d dVar = this.f13085e;
                synchronized (dVar) {
                    ((h) dVar.f13087a.get()).k(System.currentTimeMillis(), ((p8.b) dVar.f13089c.get()).a());
                }
                return null;
        }
    }
}