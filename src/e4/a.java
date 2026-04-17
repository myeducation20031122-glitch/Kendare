package e4;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import c4.f;
import com.google.android.gms.internal.ads.fb;
import com.google.android.gms.internal.ads.hc0;
import com.google.android.gms.internal.ads.vn;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p5.g;
import t5.b4;
import t5.b6;
import t5.i3;
import t5.q3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12519b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12521f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Serializable f12522j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f12523m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f12524n;

    public /* synthetic */ a(Context context, String str, f fVar, hc0 hc0Var) {
        this.f12519b = 0;
        this.f12521f = context;
        this.f12522j = str;
        this.f12523m = fVar;
        this.f12520e = 1;
        this.f12524n = hc0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        List<ResolveInfo> listQueryIntentActivities;
        int i10 = this.f12519b;
        Object obj = this.f12523m;
        Serializable serializable = this.f12522j;
        Object obj2 = this.f12521f;
        switch (i10) {
            case 0:
                Context context = (Context) obj2;
                try {
                    new fb(context, (String) serializable, ((f) obj).f2103a, this.f12520e, (hc0) this.f12524n).a();
                    break;
                } catch (IllegalStateException e10) {
                    vn.a(context).c("AppOpenAd.load", e10);
                    return;
                }
            default:
                Exception exc = (Exception) serializable;
                byte[] bArr = (byte[]) obj;
                b4 b4Var = (b4) ((g) ((l.g) obj2).f14325m).f15951b;
                b6 b6Var = b4Var.O;
                int i11 = this.f12520e;
                i3 i3Var = b4Var.f17251w;
                if (i11 == 200 || i11 == 204) {
                    if (exc == null) {
                        q3 q3Var = b4Var.f17250u;
                        b4.g(q3Var);
                        q3Var.T.a(true);
                        if (bArr == null || bArr.length == 0) {
                            b4.i(i3Var);
                            i3Var.P.a("Deferred Deep Link response empty.");
                            break;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(new String(bArr));
                                String strOptString = jSONObject.optString("deeplink", "");
                                String strOptString2 = jSONObject.optString("gclid", "");
                                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                                if (TextUtils.isEmpty(strOptString)) {
                                    b4.i(i3Var);
                                    i3Var.P.a("Deferred Deep Link is empty.");
                                } else {
                                    b4.g(b6Var);
                                    Object obj3 = b6Var.f15046b;
                                    if (TextUtils.isEmpty(strOptString) || (listQueryIntentActivities = ((b4) obj3).f17234b.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0)) == null || listQueryIntentActivities.isEmpty()) {
                                        b4.i(i3Var);
                                        i3Var.f17400w.c(strOptString2, "Deferred Deep Link validation failed. gclid, deep link", strOptString);
                                    } else {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("gclid", strOptString2);
                                        bundle.putString("_cis", "ddp");
                                        b4Var.S.w("auto", "_cmp", bundle);
                                        if (!TextUtils.isEmpty(strOptString)) {
                                            try {
                                                SharedPreferences.Editor editorEdit = ((b4) obj3).f17234b.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                                editorEdit.putString("deeplink", strOptString);
                                                editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                                if (editorEdit.commit()) {
                                                    ((b4) obj3).f17234b.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                                }
                                            } catch (RuntimeException e11) {
                                                i3 i3Var2 = ((b4) obj3).f17251w;
                                                b4.i(i3Var2);
                                                i3Var2.f17397n.b(e11, "Failed to persist Deferred Deep Link. exception");
                                            }
                                        }
                                    }
                                }
                                break;
                            } catch (JSONException e12) {
                                b4.i(i3Var);
                                i3Var.f17397n.b(e12, "Failed to parse the Deferred Deep Link response. exception");
                                return;
                            }
                        }
                    }
                } else if (i11 == 304) {
                    i11 = 304;
                    if (exc == null) {
                    }
                }
                b4.i(i3Var);
                i3Var.f17400w.c(Integer.valueOf(i11), "Network Request for Deferred Deep Link failed. response, exception", exc);
                break;
        }
    }

    public /* synthetic */ a(l.g gVar, int i10, IOException iOException, byte[] bArr, Map map) {
        this.f12519b = 1;
        this.f12521f = gVar;
        this.f12520e = i10;
        this.f12522j = iOException;
        this.f12523m = bArr;
        this.f12524n = map;
    }
}