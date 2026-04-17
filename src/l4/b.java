package l4;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ce;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.wr;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14549b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f14550e;

    public /* synthetic */ b(j jVar, int i10) {
        this.f14549b = i10;
        this.f14550e = jVar;
    }

    private final void a() throws ExecutionException, InterruptedException, TimeoutException {
        j jVar = this.f14550e;
        jVar.getClass();
        i4.k kVar = i4.k.A;
        m2.d dVar = kVar.f13358m;
        Context context = jVar.f14606a;
        String str = jVar.f14609d;
        String str2 = jVar.f14610e;
        dVar.getClass();
        ce ceVar = ge.S3;
        j4.q qVar = j4.q.f13781d;
        String strK = m2.d.k(context, dVar.l(context, (String) qVar.f13784c.a(ceVar), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strK)) {
            wr.b("Not linked for in app preview.");
        } else {
            try {
                JSONObject jSONObject = new JSONObject(strK.trim());
                String strOptString = jSONObject.optString("gct");
                dVar.f15094g = jSONObject.optString("status");
                if (((Boolean) qVar.f13784c.a(ge.M7)).booleanValue()) {
                    boolean z7 = "0".equals((String) dVar.f15094g) || "2".equals((String) dVar.f15094g);
                    dVar.e(z7);
                    kVar.f13352g.c().a(!z7 ? "" : str);
                }
                synchronized (dVar.f15093f) {
                    dVar.f15090c = strOptString;
                }
                if ("2".equals((String) dVar.f15094g)) {
                    wr.b("Creative is not pushed for this device.");
                    m2.d.f(context, "There was no creative pushed from DFP to the device.", false, false);
                    return;
                } else if ("1".equals((String) dVar.f15094g)) {
                    wr.b("The app is not linked for creative preview.");
                    dVar.c(context, str, str2);
                    return;
                } else {
                    if ("0".equals((String) dVar.f15094g)) {
                        wr.b("Device is linked for in app preview.");
                        m2.d.f(context, "The device is successfully linked for creative preview.", false, true);
                        return;
                    }
                    return;
                }
            } catch (JSONException e10) {
                wr.h("Fail to get in app preview response json.", e10);
            }
        }
        m2.d.f(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
    }

    @Override // java.lang.Runnable
    public final void run() throws ExecutionException, InterruptedException, TimeoutException {
        switch (this.f14549b) {
            case 0:
                a();
                return;
            case QueueFuseable.SYNC /* 1 */:
                j jVar = this.f14550e;
                jVar.c(jVar.f14606a);
                return;
            case 2:
                j jVar2 = this.f14550e;
                jVar2.getClass();
                m2.d dVar = i4.k.A.f13358m;
                Context context = jVar2.f14606a;
                String str = jVar2.f14609d;
                String str2 = jVar2.f14610e;
                String str3 = jVar2.f14611f;
                boolean zI = dVar.i();
                boolean zG = dVar.g(context, str, str2);
                synchronized (dVar.f15093f) {
                    dVar.f15091d = zG;
                }
                if (!dVar.i()) {
                    dVar.c(context, str, str2);
                    return;
                }
                if (!zI && !TextUtils.isEmpty(str3)) {
                    dVar.d(context, str2, str3, str);
                }
                wr.b("Device is linked for debug signals.");
                m2.d.f(context, "The device is successfully linked for troubleshooting.", false, true);
                return;
            case 3:
                j jVar3 = this.f14550e;
                jVar3.c(jVar3.f14606a);
                return;
            case 4:
                j jVar4 = this.f14550e;
                jVar4.getClass();
                i4.k.A.f13358m.b(jVar4.f14606a);
                return;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                j jVar5 = this.f14550e;
                jVar5.getClass();
                i4.k.A.f13358m.b(jVar5.f14606a);
                return;
            default:
                j jVar6 = this.f14550e;
                jVar6.f14612g = 4;
                jVar6.b();
                return;
        }
    }
}