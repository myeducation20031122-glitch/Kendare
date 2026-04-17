package r4;

import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.lf1;
import com.google.android.gms.internal.ads.sf1;
import com.google.android.gms.internal.ads.tb;
import com.google.android.gms.internal.ads.za0;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements lf1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16476a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16477b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f16476a = i10;
        this.f16477b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    @Override // com.google.android.gms.internal.ads.sf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb() {
        char c10;
        int i10 = this.f16476a;
        Object obj = this.f16477b;
        switch (i10) {
            case 0:
                String str = ((d) obj).f16475b;
                switch (str.hashCode()) {
                    case -1999289321:
                        if (!str.equals("NATIVE")) {
                            c10 = 65535;
                            break;
                        } else {
                            c10 = 2;
                            break;
                        }
                    case -1372958932:
                        if (str.equals("INTERSTITIAL")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 543046670:
                        if (str.equals("REWARDED")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1951953708:
                        if (str.equals("BANNER")) {
                            c10 = 0;
                            break;
                        }
                        break;
                }
                return c10 != 0 ? c10 != 1 ? c10 != 2 ? c10 != 3 ? tb.AD_INITIATER_UNSPECIFIED : tb.REWARD_BASED_VIDEO_AD : tb.AD_LOADER : tb.INTERSTITIAL : tb.BANNER;
            case QueueFuseable.SYNC /* 1 */:
                String lowerCase = ((d) obj).f16475b.toLowerCase(Locale.ROOT);
                dq0.X0(lowerCase);
                return lowerCase;
            case 2:
                d dVar = (d) obj;
                dVar.getClass();
                HashSet hashSet = new HashSet();
                hashSet.add(dVar.f16475b.toLowerCase(Locale.ROOT));
                return hashSet;
            default:
                return new j((za0) ((sf1) obj).zzb());
        }
    }
}