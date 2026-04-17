package c5;

import a5.h;
import a5.k;
import a5.s;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.ads.ic1;
import io.reactivex.internal.fuseable.QueueFuseable;
import p5.q;
import y4.l;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends g5.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2134u;

    public b(int i10) {
        this.f2134u = i10;
    }

    @Override // g5.a
    public final k a(Context context, Looper looper, h hVar, Object obj, y4.k kVar, l lVar) {
        k dVar;
        int i10 = this.f2134u;
        switch (i10) {
            case 3:
                Integer num = hVar.f338i;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", hVar.f330a);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new v5.a(context, looper, hVar, bundle, kVar, lVar);
            case 4:
                ic1.v(obj);
                throw null;
            default:
                switch (i10) {
                    case 0:
                        dVar = new d(context, looper, hVar, (s) obj, kVar, lVar);
                        break;
                    case QueueFuseable.SYNC /* 1 */:
                        dVar = new k5.b(context, looper, 300, hVar, kVar, lVar);
                        break;
                    case 2:
                        return new q(context, looper, hVar, kVar, lVar);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
                return dVar;
        }
    }
}