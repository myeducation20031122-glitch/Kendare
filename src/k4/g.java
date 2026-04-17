package k4;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.internal.ads.bf;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.h01;
import com.google.android.gms.internal.ads.i9;
import com.google.android.gms.internal.ads.k8;
import com.google.android.gms.internal.ads.mr;
import com.google.android.gms.internal.ads.so;
import com.google.android.gms.internal.ads.un0;
import com.google.android.gms.internal.ads.vr;
import com.google.android.gms.internal.ads.wr;
import io.reactivex.internal.fuseable.QueueFuseable;
import j4.q;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import l4.g0;
import l4.p;
import z1.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13993b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13994c;

    public g(Context context) {
        this.f13994c = context;
    }

    private final void c() {
        boolean zB;
        try {
            zB = g4.b.b((Context) this.f13994c);
        } catch (IOException | IllegalStateException | x4.h e10) {
            wr.e("Fail to get isAdIdFakeForDebugLogging", e10);
            zB = false;
        }
        synchronized (vr.f9362b) {
            vr.f9363c = true;
            vr.f9364d = zB;
        }
        wr.g("Update ad debug logging enablement as " + zB);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01a5  */
    @Override // l4.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        BitmapDrawable bitmapDrawable;
        switch (this.f13993b) {
            case 0:
                d3.d dVar = i4.k.A.f13366u;
                h hVar = (h) this.f13994c;
                Bitmap bitmap = (Bitmap) ((Map) dVar.f12310f).get(Integer.valueOf(hVar.f13996f.R.f13329n));
                if (bitmap != null) {
                    Activity activity = hVar.f13995e;
                    i4.f fVar = hVar.f13996f.R;
                    if (fVar.f13327j) {
                        float f10 = fVar.f13328m;
                        if (f10 <= 0.0f || f10 > 25.0f) {
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                        } else {
                            try {
                                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                                RenderScript renderScriptCreate = RenderScript.create(activity);
                                ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                                Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                                Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                                scriptIntrinsicBlurCreate.setRadius(f10);
                                scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                                scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                                allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                            } catch (RuntimeException unused) {
                                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                            }
                        }
                    }
                    g0.f14590i.post(new m.k(this, bitmapDrawable, 21));
                    return;
                }
                return;
            case QueueFuseable.SYNC /* 1 */:
                c();
                return;
            default:
                mr mrVar = (mr) this.f13994c;
                Context context = mrVar.f6651e;
                String str = mrVar.f6652f.f10587b;
                un0 un0Var = new un0();
                un0Var.f9118f = context;
                un0Var.f9119j = str;
                un0Var.f9116b = (String) bf.f2979a.k();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                un0Var.f9117e = linkedHashMap;
                linkedHashMap.put("s", "gmob_sdk");
                ((Map) un0Var.f9117e).put("v", "3");
                ((Map) un0Var.f9117e).put("os", Build.VERSION.RELEASE);
                ((Map) un0Var.f9117e).put("api_v", Build.VERSION.SDK);
                Map map = (Map) un0Var.f9117e;
                i4.k kVar = i4.k.A;
                g0 g0Var = kVar.f13348c;
                map.put("device", g0.A());
                ((Map) un0Var.f9117e).put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
                ((Map) un0Var.f9117e).put("is_lite_sdk", true != g0.G(context) ? "0" : "1");
                k8 k8Var = kVar.f13359n;
                Context context2 = (Context) un0Var.f9118f;
                k8Var.getClass();
                h01 h01VarB = es.f4113a.b(new i9(context2, k8Var));
                try {
                    ((Map) un0Var.f9117e).put("network_coarse", Integer.toString(((so) h01VarB.get()).f8485j));
                    ((Map) un0Var.f9117e).put("network_fine", Integer.toString(((so) h01VarB.get()).f8486k));
                } catch (Exception e10) {
                    i4.k.A.f13352g.h("CsiConfiguration.CsiConfiguration", e10);
                }
                if (((Boolean) q.f13781d.f13784c.a(ge.O8)).booleanValue()) {
                    Map map2 = (Map) un0Var.f9117e;
                    g0 g0Var2 = i4.k.A.f13348c;
                    map2.put("is_bstar", true == g0.E(context) ? "1" : "0");
                }
                synchronized (((mr) this.f13994c).f6647a) {
                    try {
                        o oVar = i4.k.A.f13357l;
                        o.y(((mr) this.f13994c).f6654h, un0Var);
                    } catch (IllegalArgumentException e11) {
                        wr.h("Cannot config CSI reporter.", e11);
                    }
                }
                return;
        }
    }

    public g(mr mrVar) {
        this.f13994c = mrVar;
    }
}