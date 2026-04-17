package i4;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.i8;
import com.google.android.gms.internal.ads.sr;
import com.google.android.gms.internal.ads.wr;
import com.isprid.kendare.ui.info.AboutAppActivity;
import com.isprid.kendare.ui.info.PrivacyPolicy;
import com.isprid.kendare.ui.services.ArticleInfoActivity;
import com.isprid.kendare.util.LollipopFixedWebView;
import io.reactivex.internal.fuseable.QueueFuseable;
import j4.o;
import j4.w;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import m.s3;
import o5.f0;
import o5.n;
import q3.l;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13334b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f13333a = i10;
        this.f13334b = obj;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        switch (this.f13333a) {
            case QueueFuseable.SYNC /* 1 */:
                n nVar = (n) this.f13334b;
                int i10 = n.f15770j;
                if (str != null && str.startsWith("consent://")) {
                    nVar.f15772e.f(str);
                    break;
                }
                break;
            default:
                super.onLoadResource(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        int i10 = this.f13333a;
        Object obj = this.f13334b;
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                n nVar = (n) obj;
                if (nVar.f15773f) {
                    return;
                }
                Log.d("UserMessagingPlatform", "Wall html loaded.");
                nVar.f15773f = true;
                return;
            case 2:
                AboutAppActivity aboutAppActivity = (AboutAppActivity) obj;
                l lVar = aboutAppActivity.f11661f;
                if (lVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                LollipopFixedWebView lollipopFixedWebView = (LollipopFixedWebView) lVar.f16199l;
                Intrinsics.e(lollipopFixedWebView, "binding.webViewAppInfo");
                com.bumptech.glide.f.x(lollipopFixedWebView);
                l lVar2 = aboutAppActivity.f11661f;
                if (lVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ProgressBar progressBar = (ProgressBar) lVar2.f16190c;
                Intrinsics.e(progressBar, "binding.appInfoLoading");
                com.bumptech.glide.f.l(progressBar);
                return;
            case 3:
                PrivacyPolicy privacyPolicy = (PrivacyPolicy) obj;
                android.support.v4.media.b bVar = privacyPolicy.f11664f;
                if (bVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ScrollView scrollView = (ScrollView) bVar.f490m;
                Intrinsics.e(scrollView, "binding.scroll");
                com.bumptech.glide.f.x(scrollView);
                android.support.v4.media.b bVar2 = privacyPolicy.f11664f;
                if (bVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                LinearLayout linearLayout = (LinearLayout) bVar2.f488f;
                Intrinsics.e(linearLayout, "binding.llPanel");
                com.bumptech.glide.f.l(linearLayout);
                android.support.v4.media.b bVar3 = privacyPolicy.f11664f;
                if (bVar3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                TextView textView = (TextView) bVar3.f492t;
                Intrinsics.e(textView, "binding.txtNotFound");
                com.bumptech.glide.f.l(textView);
                android.support.v4.media.b bVar4 = privacyPolicy.f11664f;
                if (bVar4 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ProgressBar progressBar2 = (ProgressBar) bVar4.f489j;
                Intrinsics.e(progressBar2, "binding.pbLoading");
                com.bumptech.glide.f.l(progressBar2);
                return;
            case 4:
                ArticleInfoActivity articleInfoActivity = (ArticleInfoActivity) obj;
                s3 s3Var = articleInfoActivity.f11681f;
                if (s3Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ScrollView scrollView2 = (ScrollView) s3Var.f14931m;
                Intrinsics.e(scrollView2, "binding.scroll");
                com.bumptech.glide.f.x(scrollView2);
                s3 s3Var2 = articleInfoActivity.f11681f;
                if (s3Var2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                LinearLayout linearLayout2 = (LinearLayout) s3Var2.f14930j;
                Intrinsics.e(linearLayout2, "binding.llPanel");
                com.bumptech.glide.f.l(linearLayout2);
                s3 s3Var3 = articleInfoActivity.f11681f;
                if (s3Var3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                TextView textView2 = (TextView) s3Var3.f14929f;
                Intrinsics.e(textView2, "binding.txtNotFound");
                com.bumptech.glide.f.l(textView2);
                return;
            default:
                super.onPageFinished(webView, str);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        switch (this.f13333a) {
            case QueueFuseable.SYNC /* 1 */:
                o5.j jVar = (o5.j) ((n) this.f13334b).f15772e.f492t;
                f0 f0Var = new f0(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i10), str2, str));
                o5.i iVar = (o5.i) jVar.f15754i.getAndSet(null);
                if (iVar != null) {
                    iVar.a(f0Var.a());
                    break;
                }
                break;
            default:
                super.onReceivedError(webView, i10, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f13333a) {
            case QueueFuseable.SYNC /* 1 */:
                String string = webResourceRequest.getUrl().toString();
                n nVar = (n) this.f13334b;
                int i10 = n.f15770j;
                if (string == null || !string.startsWith("consent://")) {
                    return false;
                }
                nVar.f15772e.f(string);
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public /* synthetic */ h(n nVar) {
        this.f13333a = 1;
        this.f13334b = nVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i10 = this.f13333a;
        int iL = 0;
        Object obj = this.f13334b;
        switch (i10) {
            case 0:
                j jVar = (j) obj;
                if (str.startsWith(jVar.c())) {
                    return false;
                }
                if (str.startsWith("gmsg://noAdLoaded")) {
                    w wVar = jVar.f13343t;
                    if (wVar != null) {
                        try {
                            wVar.d(dq0.M1(3, null, null));
                        } catch (RemoteException e10) {
                            wr.i("#007 Could not call remote method.", e10);
                        }
                    }
                    w wVar2 = jVar.f13343t;
                    if (wVar2 != null) {
                        try {
                            wVar2.zze(3);
                        } catch (RemoteException e11) {
                            e = e11;
                            wr.i("#007 Could not call remote method.", e);
                            jVar.r3(iL);
                            return true;
                        }
                    }
                    jVar.r3(iL);
                } else {
                    if (str.startsWith("gmsg://scriptLoadFailed")) {
                        w wVar3 = jVar.f13343t;
                        if (wVar3 != null) {
                            try {
                                wVar3.d(dq0.M1(1, null, null));
                            } catch (RemoteException e12) {
                                wr.i("#007 Could not call remote method.", e12);
                            }
                        }
                        w wVar4 = jVar.f13343t;
                        if (wVar4 != null) {
                            try {
                                wVar4.zze(0);
                            } catch (RemoteException e13) {
                                e = e13;
                                wr.i("#007 Could not call remote method.", e);
                                jVar.r3(iL);
                                return true;
                            }
                        }
                    } else {
                        boolean zStartsWith = str.startsWith("gmsg://adResized");
                        Context context = jVar.f13340j;
                        if (zStartsWith) {
                            w wVar5 = jVar.f13343t;
                            if (wVar5 != null) {
                                try {
                                    wVar5.zzi();
                                } catch (RemoteException e14) {
                                    wr.i("#007 Could not call remote method.", e14);
                                }
                            }
                            String queryParameter = Uri.parse(str).getQueryParameter("height");
                            if (!TextUtils.isEmpty(queryParameter)) {
                                try {
                                    sr srVar = o.f13771f.f13772a;
                                    iL = sr.l(context, Integer.parseInt(queryParameter));
                                } catch (NumberFormatException unused) {
                                }
                            }
                        } else if (!str.startsWith("gmsg://")) {
                            w wVar6 = jVar.f13343t;
                            if (wVar6 != null) {
                                try {
                                    wVar6.zzc();
                                    ((j) obj).f13343t.zzh();
                                } catch (RemoteException e15) {
                                    wr.i("#007 Could not call remote method.", e15);
                                }
                            }
                            if (jVar.f13344u != null) {
                                Uri uriA = Uri.parse(str);
                                try {
                                    uriA = jVar.f13344u.a(uriA, context, null, null);
                                } catch (i8 e16) {
                                    wr.h("Unable to process ad data", e16);
                                }
                                str = uriA.toString();
                            }
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(str));
                            context.startActivity(intent);
                        }
                    }
                    jVar.r3(iL);
                }
                return true;
            case QueueFuseable.SYNC /* 1 */:
                n nVar = (n) obj;
                int i11 = n.f15770j;
                if (str == null || !str.startsWith("consent://")) {
                    return false;
                }
                nVar.f15772e.f(str);
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f13333a) {
            case 0:
                j jVar = (j) this.f13334b;
                w wVar = jVar.f13343t;
                if (wVar != null) {
                    try {
                        wVar.d(dq0.M1(1, null, null));
                    } catch (RemoteException e10) {
                        wr.i("#007 Could not call remote method.", e10);
                    }
                }
                w wVar2 = jVar.f13343t;
                if (wVar2 != null) {
                    try {
                        wVar2.zze(0);
                        break;
                    } catch (RemoteException e11) {
                        wr.i("#007 Could not call remote method.", e11);
                        return;
                    }
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }
}