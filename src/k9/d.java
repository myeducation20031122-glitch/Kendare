package k9;

import android.util.Log;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import c4.l;
import com.google.android.gms.ads.nativead.NativeAdView;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends c4.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14051b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14052e;

    public /* synthetic */ d(Object obj, int i10) {
        this.f14051b = i10;
        this.f14052e = obj;
    }

    @Override // c4.b
    public final void b(l lVar) {
        int i10 = this.f14051b;
        Object obj = this.f14052e;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                o5.c cVar = fVar.f14054f;
                if (cVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                NativeAdView nativeAdView = (NativeAdView) cVar.f15719m;
                Intrinsics.e(nativeAdView, "binding.nativeAdContainer");
                com.bumptech.glide.f.l(nativeAdView);
                o5.c cVar2 = fVar.f14054f;
                if (cVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                FrameLayout frameLayout = (FrameLayout) cVar2.f15717k;
                Intrinsics.e(frameLayout, "binding.frameNative");
                com.bumptech.glide.f.x(frameLayout);
                return;
            default:
                com.bumptech.glide.f.l((LinearLayout) obj);
                Log.e("Admob", "Banner failed: " + ((String) lVar.f18676c));
                return;
        }
    }

    @Override // c4.b
    public final void e() {
        switch (this.f14051b) {
            case QueueFuseable.SYNC /* 1 */:
                com.bumptech.glide.f.x((LinearLayout) this.f14052e);
                Log.e("Admob", "Banner loaded");
                break;
        }
    }
}