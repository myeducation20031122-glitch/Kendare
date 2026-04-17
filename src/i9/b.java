package i9;

import com.isprid.kendare.network.NetworkConfig;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class b implements Interceptor {
    public final Response intercept(Interceptor.Chain chain) {
        return NetworkConfig.b(chain);
    }
}