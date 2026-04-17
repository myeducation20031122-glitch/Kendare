package i9;

import androidx.emoji2.text.v;
import com.isprid.kendare.network.NetworkConfig;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class a implements Authenticator, f8.a {
    public /* synthetic */ a(v vVar) {
    }

    public Request authenticate(Route route, Response response) {
        return NetworkConfig.a(route, response);
    }
}