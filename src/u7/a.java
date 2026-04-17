package u7;

import android.util.JsonReader;
import android.util.Log;
import com.isprid.kendare.ui.main.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import n8.i;
import n8.n;
import o3.e;
import o5.d;
import t7.p1;
import x5.k;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class a implements b, e, x5.c, g7.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18295b;

    public /* synthetic */ a(int i10) {
        this.f18295b = i10;
    }

    public static void c(m2.e eVar) {
        int i10 = MainActivity.f11666w;
        Log.e("Consent", "Error: " + eVar.f15098c);
        n7.c.w("consent_form_error");
    }

    @Override // g7.b
    public final void a(m2.e eVar) {
        int i10 = MainActivity.f11666w;
        Log.e("Consent", "Load Form Error: " + eVar.f15098c);
        n7.c.w("load_form_error");
    }

    @Override // o3.e
    public final Object apply(Object obj) {
        switch (this.f18295b) {
            case 2:
                w7.a.f18703b.getClass();
                return c.f18296a.l((p1) obj).getBytes(Charset.forName("UTF-8"));
            default:
                o8.e eVar = (o8.e) obj;
                eVar.getClass();
                d dVar = n.f15427a;
                dVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    dVar.l(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // u7.b
    public final Object b(JsonReader jsonReader) {
        int i10 = this.f18295b;
        return c.a(jsonReader);
    }

    @Override // x5.c
    public final Object then(k kVar) {
        switch (this.f18295b) {
            case 3:
                Object obj = i.f15414c;
                return -1;
            default:
                Object obj2 = i.f15414c;
                return 403;
        }
    }
}