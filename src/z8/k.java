package z8;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19783a;

    public /* synthetic */ k(int i10) {
        this.f19783a = i10;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        switch (this.f19783a) {
            case 0:
                Intrinsics.f(view, "view");
                Intrinsics.f(url, "url");
                break;
            default:
                super.onPageFinished(view, url);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        switch (this.f19783a) {
            case QueueFuseable.SYNC /* 1 */:
                Intrinsics.f(view, "view");
                Intrinsics.f(url, "url");
                return true;
            default:
                return super.shouldOverrideUrlLoading(view, url);
        }
    }
}