package r4;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.ce;
import com.google.android.gms.internal.ads.ds;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.h8;
import com.google.android.gms.internal.ads.qr0;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.za0;
import g.u0;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l4.g0;
import l4.z;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16438a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f16439b;

    /* renamed from: c, reason: collision with root package name */
    public final h8 f16440c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16441d;

    /* renamed from: e, reason: collision with root package name */
    public final za0 f16442e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16443f;

    /* renamed from: g, reason: collision with root package name */
    public final ds f16444g = es.f4117e;

    /* renamed from: h, reason: collision with root package name */
    public final qr0 f16445h;

    public a(WebView webView, h8 h8Var, za0 za0Var, qr0 qr0Var) {
        this.f16439b = webView;
        Context context = webView.getContext();
        this.f16438a = context;
        this.f16440c = h8Var;
        this.f16442e = za0Var;
        ge.a(context);
        ce ceVar = ge.Y7;
        j4.q qVar = j4.q.f13781d;
        this.f16441d = ((Integer) qVar.f13784c.a(ceVar)).intValue();
        this.f16443f = ((Boolean) qVar.f13784c.a(ge.Z7)).booleanValue();
        this.f16445h = qr0Var;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            i4.k kVar = i4.k.A;
            kVar.f13355j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strG = this.f16440c.f5084b.g(this.f16438a, str, this.f16439b);
            if (this.f16443f) {
                kVar.f13355j.getClass();
                com.bumptech.glide.d.b0(this.f16442e, null, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strG;
        } catch (RuntimeException e10) {
            wr.e("Exception getting click signals. ", e10);
            i4.k.A.f13352g.h("TaggingLibraryJsInterface.getClickSignals", e10);
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i10) {
        if (i10 <= 0) {
            wr.d("Invalid timeout for getting click signals. Timeout=" + i10);
            return "";
        }
        try {
            return (String) es.f4113a.b(new z(2, this, str)).get(Math.min(i10, this.f16441d), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            wr.e("Exception getting click signals with timeout. ", e10);
            i4.k.A.f13352g.h("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e10);
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        g0 g0Var = i4.k.A.f13348c;
        String string = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        d3.d dVar = new d3.d(this, string);
        if (((Boolean) j4.q.f13781d.f13784c.a(ge.f4652b8)).booleanValue()) {
            this.f16444g.execute(new l0.a(this, bundle, dVar, 13, 0));
        } else {
            p8.c cVar = new p8.c(22);
            cVar.k(bundle);
            u0.x(this.f16438a, new c4.f(cVar), dVar);
        }
        return string;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            i4.k kVar = i4.k.A;
            kVar.f13355j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strD = this.f16440c.f5084b.d(this.f16438a, this.f16439b, null);
            if (this.f16443f) {
                kVar.f13355j.getClass();
                com.bumptech.glide.d.b0(this.f16442e, null, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strD;
        } catch (RuntimeException e10) {
            wr.e("Exception getting view signals. ", e10);
            i4.k.A.f13352g.h("TaggingLibraryJsInterface.getViewSignals", e10);
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            wr.d("Invalid timeout for getting view signals. Timeout=" + i10);
            return "";
        }
        try {
            return (String) es.f4113a.b(new m2.p(this, 5)).get(Math.min(i10, this.f16441d), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            wr.e("Exception getting view signals with timeout. ", e10);
            i4.k.A.f13352g.h("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e10);
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (!((Boolean) j4.q.f13781d.f13784c.a(ge.f4672d8)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        es.f4113a.execute(new m.k(this, str, 22));
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) throws JSONException {
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i10 = jSONObject.getInt("x");
            i11 = jSONObject.getInt("y");
            i12 = jSONObject.getInt("duration_ms");
            f10 = (float) jSONObject.getDouble("force");
            i13 = jSONObject.getInt("type");
        } catch (RuntimeException | JSONException e10) {
            e = e10;
        }
        try {
            this.f16440c.f5084b.a(MotionEvent.obtain(0L, i12, i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? -1 : 3 : 2 : 1 : 0, i10, i11, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e11) {
            e = e11;
            wr.e("Failed to parse the touch string. ", e);
            i4.k.A.f13352g.h("TaggingLibraryJsInterface.reportTouchEvent", e);
        } catch (JSONException e12) {
            e = e12;
            wr.e("Failed to parse the touch string. ", e);
            i4.k.A.f13352g.h("TaggingLibraryJsInterface.reportTouchEvent", e);
        }
    }
}