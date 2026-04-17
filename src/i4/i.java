package i4;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.h8;
import com.google.android.gms.internal.ads.i8;
import com.google.android.gms.internal.ads.ve;
import com.google.android.gms.internal.ads.wr;
import com.isprid.kendare.ui.premium.PremiumActivity;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;
import t7.z0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13335a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13336b;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        int i10 = this.f13335a;
        Object obj = this.f13336b;
        switch (i10) {
            case 0:
                try {
                    j jVar = (j) obj;
                    jVar.f13344u = (h8) jVar.f13339f.get(1000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                    wr.h("", e10);
                }
                j jVar2 = (j) obj;
                jVar2.getClass();
                Uri.Builder builder = new Uri.Builder();
                builder.scheme("https://").appendEncodedPath((String) ve.f9291d.k());
                v7.b bVar = jVar2.f13341m;
                builder.appendQueryParameter("query", (String) bVar.f18512j);
                builder.appendQueryParameter("pubId", (String) bVar.f18510e);
                builder.appendQueryParameter("mappver", (String) bVar.f18514n);
                Map map = (Map) bVar.f18511f;
                for (String str : map.keySet()) {
                    builder.appendQueryParameter(str, (String) map.get(str));
                }
                Uri uriBuild = builder.build();
                h8 h8Var = jVar2.f13344u;
                if (h8Var != null) {
                    try {
                        uriBuild = h8.c(uriBuild, h8Var.f5084b.e(jVar2.f13340j));
                    } catch (i8 e11) {
                        wr.h("Unable to process ad data", e11);
                    }
                }
                return a0.h.G(jVar2.c(), "#", uriBuild.getEncodedQuery());
            default:
                t9.g gVar = (t9.g) obj;
                Date date = t9.g.N;
                String str2 = gVar.h() + ".products.restored.v1_0";
                Context contextG = gVar.g();
                SharedPreferences sharedPreferences = contextG.getSharedPreferences(contextG.getPackageName() + "_preferences", 0);
                if (sharedPreferences != null && sharedPreferences.getBoolean(str2, false)) {
                    return Boolean.FALSE;
                }
                gVar.w(null);
                return Boolean.TRUE;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        int i10 = this.f13335a;
        Object obj2 = this.f13336b;
        switch (i10) {
            case 0:
                String str = (String) obj;
                WebView webView = ((j) obj2).f13342n;
                if (webView == null || str == null) {
                    return;
                }
                webView.loadUrl(str);
                return;
            default:
                t9.g gVar = (t9.g) obj2;
                int i11 = 1;
                gVar.f18078w = true;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i12 = 0;
                t9.e eVar = gVar.f18074m;
                if (zBooleanValue) {
                    String str2 = gVar.h() + ".products.restored.v1_0";
                    Context contextG = gVar.g();
                    SharedPreferences sharedPreferences = contextG.getSharedPreferences(contextG.getPackageName() + "_preferences", 0);
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putBoolean(str2, true);
                        editorEdit.commit();
                    }
                    if (eVar != null) {
                        PremiumActivity premiumActivity = (PremiumActivity) eVar;
                        t9.g gVar2 = premiumActivity.f11677t;
                        if (gVar2 == null) {
                            Intrinsics.n("bp");
                            throw null;
                        }
                        t9.a aVar = gVar2.f18072f;
                        aVar.getClass();
                        Iterator it = new ArrayList(aVar.f18058e.keySet()).iterator();
                        while (it.hasNext()) {
                            Log.e("PremiumActivity", "Owned Managed Product: " + ((String) it.next()));
                        }
                        t9.g gVar3 = premiumActivity.f11677t;
                        if (gVar3 == null) {
                            Intrinsics.n("bp");
                            throw null;
                        }
                        t9.a aVar2 = gVar3.f18073j;
                        aVar2.getClass();
                        Iterator it2 = new ArrayList(aVar2.f18058e.keySet()).iterator();
                        while (it2.hasNext()) {
                            Log.e("PremiumActivity", "Owned Subscription: " + ((String) it2.next()));
                        }
                    }
                }
                if (eVar != null) {
                    PremiumActivity premiumActivity2 = (PremiumActivity) eVar;
                    premiumActivity2.f11678u = true;
                    if (!u9.c.a(premiumActivity2)) {
                        z0.i(premiumActivity2, "Network connection not available.");
                        return;
                    }
                    p9.c cVar = premiumActivity2.M;
                    if (cVar == null) {
                        Intrinsics.n("viewModel");
                        throw null;
                    }
                    cVar.f16082c.add(cVar.f16081b.getPurchasePlans().subscribeOn(Schedulers.io()).doOnSubscribe(new m9.d(new p9.b(cVar, i12), 6)).subscribe(new m9.d(new p9.b(cVar, i11), 7), new m9.d(new p9.b(cVar, 2), 8)));
                    return;
                }
                return;
        }
    }

    public i(t9.g gVar) {
        this.f13336b = gVar;
    }

    public /* synthetic */ i(t9.g gVar, int i10) {
        this(gVar);
    }
}