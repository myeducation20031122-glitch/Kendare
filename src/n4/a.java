package n4;

import android.content.Context;
import c4.r;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a {
    public abstract r getSDKVersionInfo();

    public abstract r getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<d3.d> list);

    public void loadAppOpenAd(f fVar, c cVar) {
        cVar.m(new w4.j(getClass().getSimpleName().concat(" does not support app open ads."), 7, "com.google.android.gms.ads"));
    }

    public void loadBannerAd(g gVar, c cVar) {
        cVar.m(new w4.j(getClass().getSimpleName().concat(" does not support banner ads."), 7, "com.google.android.gms.ads"));
    }

    public void loadInterscrollerAd(g gVar, c cVar) {
        cVar.m(new w4.j(getClass().getSimpleName().concat(" does not support interscroller ads."), 7, "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(i iVar, c cVar) {
        cVar.m(new w4.j(getClass().getSimpleName().concat(" does not support interstitial ads."), 7, "com.google.android.gms.ads"));
    }

    public void loadNativeAd(k kVar, c cVar) {
        cVar.m(new w4.j(getClass().getSimpleName().concat(" does not support native ads."), 7, "com.google.android.gms.ads"));
    }

    public void loadRewardedAd(m mVar, c cVar) {
        cVar.m(new w4.j(getClass().getSimpleName().concat(" does not support rewarded ads."), 7, "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(m mVar, c cVar) {
        cVar.m(new w4.j(getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), 7, "com.google.android.gms.ads"));
    }
}