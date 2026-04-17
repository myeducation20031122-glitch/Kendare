package w4;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class k implements x5.c, x5.j {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ k f18679b = new k();

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k f18680e = new k();

    @Override // x5.c
    public Object then(x5.k kVar) throws IOException {
        if (kVar.j()) {
            return (Bundle) kVar.h();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(kVar.g());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(strValueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", kVar.g());
    }

    @Override // x5.j
    public x5.k then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i10 = b.f18648h;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            bundle = null;
        }
        return j4.i(bundle);
    }
}