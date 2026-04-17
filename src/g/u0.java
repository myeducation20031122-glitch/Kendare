package g;

import android.content.ClipData;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.viewpager2.widget.ViewPager2;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.ff;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.it0;
import com.google.android.gms.internal.ads.mu0;
import com.google.android.gms.internal.ads.qr;
import com.google.android.gms.internal.ads.sn;
import com.google.android.gms.internal.ads.wi1;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import m.l3;
import m.n2;
import m.s3;
import o0.a2;
import o0.b2;
import o0.c2;
import o0.d2;
import o0.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u0 implements n2, l.m, h0.n, l0.c, o0.f, j1.d, p0.r, androidx.activity.result.b, j3.a, w2.c, w2.v, w2.g0, t3.b, it0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12902b;

    /* renamed from: e, reason: collision with root package name */
    public Object f12903e;

    public static void x(Context context, c4.f fVar, d3.d dVar) {
        c4.a aVar = c4.a.f2091b;
        ge.a(context);
        if (((Boolean) ff.f4308j.k()).booleanValue()) {
            if (((Boolean) j4.q.f13781d.f13784c.a(ge.K8)).booleanValue()) {
                qr.f7819b.execute(new l.g(context, aVar, fVar, dVar, 7, 0));
                return;
            }
        }
        new sn(context, aVar, fVar.f2103a, 0).n(dVar);
    }

    public final void A(mu0 mu0Var) {
        HashMap map;
        String str;
        m2.b bVar = (m2.b) this.f12903e;
        bVar.getClass();
        String str2 = mu0Var.f6674b;
        if (!TextUtils.isEmpty(str2)) {
            if (!((Boolean) j4.q.f13781d.f13784c.a(ge.R8)).booleanValue()) {
                bVar.f15077a = str2;
            }
        }
        int i10 = mu0Var.f6673a;
        switch (i10) {
            case 8152:
                map = new HashMap();
                str = "onLMDOverlayOpened";
                break;
            case 8153:
                map = new HashMap();
                str = "onLMDOverlayClicked";
                break;
            case 8154:
            case 8156:
            case 8158:
            case 8159:
            default:
                return;
            case 8155:
                map = new HashMap();
                str = "onLMDOverlayClose";
                break;
            case 8157:
                bVar.f15077a = null;
                bVar.f15078b = null;
                bVar.f15079c = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap map2 = new HashMap();
                map2.put("error", String.valueOf(i10));
                bVar.d("onLMDOverlayFailedToOpen", map2);
                return;
        }
        bVar.d(str, map);
    }

    @Override // w2.c
    public final Class a() {
        return ByteBuffer.class;
    }

    @Override // o0.f
    public final ClipData b() {
        return ((ContentInfo) this.f12903e).getClip();
    }

    @Override // com.google.android.gms.internal.ads.it0
    public final void c(int i10, long j10) {
        ((i4.e) this.f12903e).f13322u.c(i10, System.currentTimeMillis() - j10);
    }

    @Override // l0.c
    public final void close() {
        Object obj = this.f12903e;
        if (((ContentProviderClient) obj) != null) {
            ((ContentProviderClient) obj).release();
        }
    }

    @Override // l0.c
    public final Cursor d(Uri uri, String[] strArr, String[] strArr2) {
        Object obj = this.f12903e;
        if (((ContentProviderClient) obj) == null) {
            return null;
        }
        try {
            return ((ContentProviderClient) obj).query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override // p0.r
    public final boolean e(View view) {
        y1.k kVar = (y1.k) this.f12903e;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = kVar.f19217m;
        if (viewPager2.U) {
            viewPager2.c(currentItem, true);
        }
        return true;
    }

    @Override // l.m
    public final boolean f(l.o oVar, MenuItem menuItem) {
        l3 l3Var;
        switch (this.f12902b) {
            case 3:
                m.r rVar = ((ActionMenuView) this.f12903e).f667g0;
                if (rVar != null) {
                    v0 v0Var = (v0) rVar;
                    if (!((Toolbar) v0Var.f12909e).f739m0.a(menuItem) && ((l3Var = ((Toolbar) v0Var.f12909e).f742o0) == null || !((w0) ((p8.c) l3Var).f16073e).f12912b.onMenuItemSelected(0, menuItem))) {
                    }
                }
                break;
            default:
                l.m mVar = ((Toolbar) this.f12903e).f750u0;
                if (mVar == null || !mVar.f(oVar, menuItem)) {
                }
                break;
        }
        return false;
    }

    @Override // androidx.activity.result.b
    public final void g(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f12903e;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f564e;
        int i10 = com.google.android.gms.internal.play_billing.r.b(intent, "ProxyBillingActivityV2").f15097b;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f2192f;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = aVar.f563b;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.r.e("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // da.a
    public final Object get() {
        String packageName = ((Context) ((da.a) this.f12903e).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // o0.f
    public final int h() {
        return ((ContentInfo) this.f12903e).getSource();
    }

    @Override // com.google.android.gms.internal.ads.it0
    public final void i(int i10, String str, long j10) {
        ((i4.e) this.f12903e).f13322u.d(i10, System.currentTimeMillis() - j10, null, null, str);
    }

    @Override // w2.g0
    public final com.bumptech.glide.load.data.e j(Uri uri) {
        return new com.bumptech.glide.load.data.a((ContentResolver) this.f12903e, uri, 0);
    }

    @Override // j3.a
    public final Object k() {
        switch (this.f12902b) {
            case 18:
                s3 s3Var = (s3) this.f12903e;
                return new s2.u((v2.d) s3Var.f14927b, (v2.d) s3Var.f14928e, (v2.d) s3Var.f14929f, (v2.d) s3Var.f14930j, (s2.v) s3Var.f14931m, (s2.x) s3Var.f14932n, (n0.c) s3Var.f14933t);
            default:
                try {
                    return new u2.k(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e10) {
                    throw new RuntimeException(e10);
                }
        }
    }

    @Override // h0.n
    public final int l(Object obj) {
        return ((l0.i) obj).f14455c;
    }

    @Override // m.n2
    public final void m(l.o oVar, l.q qVar) {
        ((l.i) this.f12903e).f14339t.removeCallbacksAndMessages(null);
        int size = ((l.i) this.f12903e).f14341w.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (oVar == ((l.h) ((l.i) this.f12903e).f14341w.get(i10)).f14328b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        ((l.i) this.f12903e).f14339t.postAtTime(new l.g(this, i11 < ((l.i) this.f12903e).f14341w.size() ? (l.h) ((l.i) this.f12903e).f14341w.get(i11) : null, qVar, oVar, 0), oVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // h0.n
    public final boolean n(Object obj) {
        return ((l0.i) obj).f14456d;
    }

    @Override // w2.c
    public final Object o(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    @Override // o0.f
    public final int p() {
        return ((ContentInfo) this.f12903e).getFlags();
    }

    @Override // m.n2
    public final void q(l.o oVar, MenuItem menuItem) {
        ((l.i) this.f12903e).f14339t.removeCallbacksAndMessages(oVar);
    }

    @Override // j1.d
    public final void r() {
        j1.e.f13550b.r();
    }

    @Override // l.m
    public final void s(l.o oVar) {
        switch (this.f12902b) {
            case 3:
                l.m mVar = ((ActionMenuView) this.f12903e).f662b0;
                if (mVar != null) {
                    mVar.s(oVar);
                    break;
                }
                break;
            default:
                m.o oVar2 = ((Toolbar) this.f12903e).f723b.W;
                if (oVar2 == null || !oVar2.e()) {
                    Iterator it = ((Toolbar) this.f12903e).f739m0.f15611b.iterator();
                    while (it.hasNext()) {
                        ((androidx.fragment.app.q0) ((o0.t) it.next())).f1082a.s(oVar);
                    }
                }
                l.m mVar2 = ((Toolbar) this.f12903e).f750u0;
                if (mVar2 != null) {
                    mVar2.s(oVar);
                    break;
                }
                break;
        }
    }

    @Override // o0.f
    public final ContentInfo t() {
        return (ContentInfo) this.f12903e;
    }

    public final String toString() {
        switch (this.f12902b) {
            case y4.g.NETWORK_ERROR /* 7 */:
                return "ContentInfoCompat{" + ((ContentInfo) this.f12903e) + "}";
            default:
                return super.toString();
        }
    }

    @Override // j1.d
    public final void u(int i10, Object obj) {
        j1.e.f13550b.u(i10, obj);
        ((ProfileInstallReceiver) this.f12903e).setResultCode(i10);
    }

    @Override // w2.v
    public final w2.u v(w2.a0 a0Var) {
        switch (this.f12902b) {
            case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new w2.e((v0) this.f12903e, 1);
            case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
            default:
                return new x2.a((v0) this.f12903e);
            case 23:
                return new w2.y((Resources) this.f12903e, a0Var.c(Uri.class, InputStream.class));
            case 24:
                return new w2.h0(this);
        }
    }

    public final m2 w() {
        return ((d2) this.f12903e).b();
    }

    public final ImageHeaderParser$ImageType y(q2.f fVar) {
        try {
            return fVar.d((InputStream) this.f12903e);
        } finally {
            ((InputStream) this.f12903e).reset();
        }
    }

    public final void z(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m2.j jVar = (m2.j) it.next();
            if (!"play_pass_subs".equals(jVar.f15111b)) {
                hashSet.add(jVar.f15111b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        this.f12903e = com.google.android.gms.internal.play_billing.f.p(arrayList);
    }

    public u0(int i10) {
        Handler handler;
        Handler handlerB;
        this.f12902b = i10;
        if (i10 == 8) {
            int i11 = Build.VERSION.SDK_INT;
            this.f12903e = i11 >= 30 ? new c2() : i11 >= 29 ? new b2() : new a2();
            return;
        }
        if (i10 != 13) {
            if (i10 == 25) {
                this.f12903e = new v0();
                return;
            }
            if (i10 == 21) {
                this.f12903e = new v0(this, 15);
                return;
            } else if (i10 != 22) {
                this.f12903e = new ArrayDeque();
                return;
            } else {
                this.f12903e = new HashMap();
                return;
            }
        }
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handlerB = n.d.b(mainLooper);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (IllegalAccessException e10) {
                e = e10;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handlerB = handler;
                this.f12903e = handlerB;
            } catch (InstantiationException e11) {
                e = e11;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handlerB = handler;
                this.f12903e = handlerB;
            } catch (NoSuchMethodException e12) {
                e = e12;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handlerB = handler;
                this.f12903e = handlerB;
            } catch (InvocationTargetException e13) {
                Throwable cause = e13.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException(cause);
                }
                throw ((Error) cause);
            }
            handlerB = handler;
        }
        this.f12903e = handlerB;
    }

    public u0(Context context, Uri uri) {
        this.f12902b = 6;
        this.f12903e = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public u0(ContentInfo contentInfo) {
        this.f12902b = 7;
        contentInfo.getClass();
        this.f12903e = wi1.g(contentInfo);
    }

    public u0(TextView textView) {
        this.f12902b = 10;
        if (textView == null) {
            throw new NullPointerException("textView cannot be null");
        }
        this.f12903e = new z0.i(textView);
    }

    public /* synthetic */ u0(Object obj, int i10) {
        this.f12902b = i10;
        this.f12903e = obj;
    }

    public u0(m2 m2Var) {
        this.f12902b = 8;
        int i10 = Build.VERSION.SDK_INT;
        this.f12903e = i10 >= 30 ? new c2(m2Var) : i10 >= 29 ? new b2(m2Var) : new a2(m2Var);
    }
}