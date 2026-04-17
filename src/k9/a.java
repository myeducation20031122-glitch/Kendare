package k9;

import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.d0;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.vh;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.ym;
import com.google.android.gms.internal.ads.zm;
import com.isprid.kendare.network.util.Resource;
import com.isprid.kendare.network.util.ResourceState;
import j4.n2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class a implements d0, q4.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f14046b;

    @Override // q4.b
    public final void a(zm zmVar) {
        String strC;
        String strZzp;
        String strZzp2;
        vh vhVar = zmVar.f10528a;
        int i10 = f.O;
        f this$0 = this.f14046b;
        Intrinsics.f(this$0, "this$0");
        View viewInflate = this$0.getLayoutInflater().inflate(2131492937, (ViewGroup) null);
        Intrinsics.d(viewInflate, "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAdView");
        NativeAdView nativeAdView = (NativeAdView) viewInflate;
        nativeAdView.setHeadlineView(nativeAdView.findViewById(2131296345));
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(2131296347));
        nativeAdView.setIconView(nativeAdView.findViewById(2131296343));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(2131296344));
        View headlineView = nativeAdView.getHeadlineView();
        Intrinsics.d(headlineView, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) headlineView;
        try {
            strC = vhVar.c();
        } catch (RemoteException e10) {
            wr.e("", e10);
            strC = null;
        }
        textView.setText(strC);
        MediaView mediaView = nativeAdView.getMediaView();
        if (mediaView != null) {
            try {
            } catch (RemoteException e11) {
                wr.e("", e11);
            }
            n2 n2Var = vhVar.zzj() != null ? new n2(vhVar.zzj()) : null;
            mediaView.setMediaContent(n2Var);
        }
        ym ymVar = zmVar.f10530c;
        if (ymVar != null) {
            View iconView = nativeAdView.getIconView();
            Intrinsics.d(iconView, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) iconView).setImageDrawable(ymVar.f10136b);
            View iconView2 = nativeAdView.getIconView();
            if (iconView2 != null) {
                com.bumptech.glide.f.x(iconView2);
            }
        } else {
            View iconView3 = nativeAdView.getIconView();
            if (iconView3 != null) {
                com.bumptech.glide.f.l(iconView3);
            }
        }
        try {
            strZzp = vhVar.zzp();
        } catch (RemoteException e12) {
            wr.e("", e12);
            strZzp = null;
        }
        if (strZzp != null) {
            View callToActionView = nativeAdView.getCallToActionView();
            Intrinsics.d(callToActionView, "null cannot be cast to non-null type android.widget.Button");
            Button button = (Button) callToActionView;
            try {
                strZzp2 = vhVar.zzp();
            } catch (RemoteException e13) {
                wr.e("", e13);
                strZzp2 = null;
            }
            button.setText(strZzp2);
            View callToActionView2 = nativeAdView.getCallToActionView();
            if (callToActionView2 != null) {
                com.bumptech.glide.f.x(callToActionView2);
            }
        } else {
            View callToActionView3 = nativeAdView.getCallToActionView();
            if (callToActionView3 != null) {
                com.bumptech.glide.f.l(callToActionView3);
            }
        }
        nativeAdView.setNativeAd(zmVar);
        o5.c cVar = this$0.f14054f;
        if (cVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((NativeAdView) cVar.f15719m).removeAllViews();
        o5.c cVar2 = this$0.f14054f;
        if (cVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((NativeAdView) cVar2.f15719m).addView(nativeAdView);
        o5.c cVar3 = this$0.f14054f;
        if (cVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        NativeAdView nativeAdView2 = (NativeAdView) cVar3.f15719m;
        Intrinsics.e(nativeAdView2, "binding.nativeAdContainer");
        com.bumptech.glide.f.x(nativeAdView2);
        o5.c cVar4 = this$0.f14054f;
        if (cVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FrameLayout frameLayout = (FrameLayout) cVar4.f15717k;
        Intrinsics.e(frameLayout, "binding.frameNative");
        com.bumptech.glide.f.l(frameLayout);
    }

    @Override // androidx.lifecycle.d0
    public final void onChanged(Object obj) {
        Resource it = (Resource) obj;
        int i10 = f.O;
        f this$0 = this.f14046b;
        Intrinsics.f(this$0, "this$0");
        Intrinsics.e(it, "it");
        ResourceState state = it.getState();
        if (Intrinsics.a(state, ResourceState.LOADING.INSTANCE)) {
            return;
        }
        if (Intrinsics.a(state, ResourceState.SUCCESS.INSTANCE)) {
            try {
                this$0.l();
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        if (!Intrinsics.a(state, ResourceState.ERROR.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        n7.c.w("server_connect_fail");
        Log.e("HomeFragment", "Fail to load about");
    }
}