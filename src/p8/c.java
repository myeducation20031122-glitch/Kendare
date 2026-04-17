package p8;

import a5.u0;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.bumptech.glide.manager.l;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.gs;
import com.google.android.gms.internal.ads.h01;
import com.google.android.gms.internal.ads.qz0;
import com.google.android.gms.internal.ads.s5;
import com.google.android.gms.internal.ads.u5;
import h0.n;
import j4.b2;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import k5.i;
import m.e1;
import m.l3;
import m.t;
import o0.c1;
import o0.j2;
import o0.m2;
import o0.z;
import p0.j;
import p0.r;
import t5.j4;
import w2.a0;
import w2.g0;
import w2.h0;
import w2.u;
import w2.v;
import x5.h;
import x5.s;
import y1.k;
import y4.f;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class c implements l3, e1, z, n, l0.c, r, androidx.activity.result.b, v, w2.a, w2.c, g0, com.bumptech.glide.manager.n, s5, qz0, a5.c, x5.c, x5.e, h {

    /* renamed from: f, reason: collision with root package name */
    public static volatile c f16071f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16072b;

    /* renamed from: e, reason: collision with root package name */
    public Object f16073e;

    public c() {
        this.f16072b = 10;
        this.f16073e = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.d() : new androidx.emoji2.text.c();
    }

    @Override // w2.c
    public final Class a() {
        return InputStream.class;
    }

    public void b(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.s5
    public final void c(u5 u5Var) {
        ((gs) this.f16073e).b(u5Var);
    }

    @Override // l0.c
    public final void close() {
        Object obj = this.f16073e;
        if (((ContentProviderClient) obj) != null) {
            ((ContentProviderClient) obj).release();
        }
    }

    @Override // l0.c
    public final Cursor d(Uri uri, String[] strArr, String[] strArr2) {
        Object obj = this.f16073e;
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
        k kVar = (k) this.f16073e;
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = kVar.f19217m;
        if (viewPager2.U) {
            viewPager2.c(currentItem, true);
        }
        return true;
    }

    public void f(int i10) {
    }

    @Override // androidx.activity.result.b
    public final void g(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f16073e;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f564e;
        int i10 = com.google.android.gms.internal.play_billing.r.b(intent, "ProxyBillingActivityV2").f15097b;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f2193j;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = aVar.f563b;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.r.e("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
        proxyBillingActivityV2.finish();
    }

    public void h(int i10, float f10) {
    }

    @Override // o0.z
    public final m2 i(View view, m2 m2Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f16073e;
        if (!Objects.equals(coordinatorLayout.Q, m2Var)) {
            coordinatorLayout.Q = m2Var;
            boolean z7 = m2Var.d() > 0;
            coordinatorLayout.R = z7;
            coordinatorLayout.setWillNotDraw(!z7 && coordinatorLayout.getBackground() == null);
            j2 j2Var = m2Var.f15585a;
            if (!j2Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = coordinatorLayout.getChildAt(i10);
                    WeakHashMap weakHashMap = c1.f15515a;
                    if (childAt.getFitsSystemWindows() && ((c0.e) childAt.getLayoutParams()).f2016a != null && j2Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return m2Var;
    }

    @Override // w2.g0
    public final com.bumptech.glide.load.data.e j(Uri uri) {
        return new com.bumptech.glide.load.data.a((ContentResolver) this.f16073e, uri, 1);
    }

    public final void k(Bundle bundle) {
        b2 b2Var = (b2) this.f16073e;
        b2Var.getClass();
        b2Var.f13630b.putBundle(AdMobAdapter.class.getName(), bundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            ((b2) this.f16073e).f13632d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
    }

    @Override // h0.n
    public final int l(Object obj) {
        return ((g0.h) obj).f12955b;
    }

    @Override // w2.a
    public final com.bumptech.glide.load.data.k m(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.k(assetManager, str, 0);
    }

    @Override // h0.n
    public final boolean n(Object obj) {
        return ((g0.h) obj).f12956c;
    }

    @Override // w2.c
    public final Object o(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @Override // x5.h
    public final void onCanceled() {
        try {
            u0 u0Var = (u0) ((a5.n) this.f16073e);
            Parcel parcelT = u0Var.T();
            try {
                u0Var.f9703e.transact(2, parcelT, null, 1);
            } finally {
                parcelT.recycle();
            }
        } catch (RemoteException unused) {
        }
    }

    @Override // x5.e
    public final void onComplete(x5.k kVar) {
        Status status;
        z4.d dVar = (z4.d) this.f16073e;
        if (kVar.j()) {
            Status status2 = Status.f2478m;
            p5.c cVar = (p5.c) dVar;
            cVar.getClass();
            cVar.n0(status2);
            return;
        }
        if (((s) kVar).f19034d) {
            status = Status.f2481u;
        } else {
            Exception excG = kVar.g();
            status = excG instanceof f ? ((f) excG).f19238b : Status.f2479n;
        }
        ((p5.c) dVar).s0(status);
    }

    public p0.h p(int i10) {
        return null;
    }

    public p0.h q(int i10) {
        return null;
    }

    public final t r(ProviderInfo providerInfo, PackageManager packageManager) {
        String str = providerInfo.authority;
        String str2 = providerInfo.packageName;
        Signature[] signatureArrL = ((v6.e) this.f16073e).l(packageManager, str2);
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArrL) {
            arrayList.add(signature.toByteArray());
        }
        return new t(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
    }

    public final Set s() {
        Set setUnmodifiableSet;
        synchronized (((Set) this.f16073e)) {
            setUnmodifiableSet = Collections.unmodifiableSet((Set) this.f16073e);
        }
        return setUnmodifiableSet;
    }

    public boolean t(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override // x5.c
    public final Object then(x5.k kVar) {
        Exception exc;
        i iVar = (i) this.f16073e;
        if (kVar.j() || ((s) kVar).f19034d) {
            return kVar;
        }
        Exception excG = kVar.g();
        if (!(excG instanceof f)) {
            return kVar;
        }
        int i10 = ((f) excG).f19238b.f2482b;
        if (i10 == 43001 || i10 == 43002 || i10 == 43003 || i10 == 17) {
            return iVar.f14023b.a();
        }
        if (i10 == 43000) {
            exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
        } else {
            if (i10 != 15) {
                return kVar;
            }
            exc = new Exception("The operation to get app set ID timed out. Please try again later.");
        }
        return j4.h(exc);
    }

    public final String toString() {
        switch (this.f16072b) {
            case 18:
                return super.toString() + "{fragment=" + ((l) this.f16073e) + "}";
            default:
                return super.toString();
        }
    }

    @Override // w2.v
    public final u v(a0 a0Var) {
        switch (this.f16072b) {
            case g.TIMEOUT /* 15 */:
                return new w2.b((AssetManager) this.f16073e, this);
            default:
                return new h0(this);
        }
    }

    @Override // a5.c
    public final void x(x4.b bVar) {
        ((z4.n) this.f16073e).x(bVar);
    }

    @Override // com.google.android.gms.internal.ads.qz0
    /* renamed from: zza */
    public final h01 mo5zza() {
        r4.b bVar = (r4.b) this.f16073e;
        return (h01) bVar.s3(bVar.f16456f, null, "BANNER", null, null).L.zzb();
    }

    public c(int i10) {
        Object iVar;
        this.f16072b = i10;
        if (i10 == 9) {
            if (Build.VERSION.SDK_INT >= 26) {
                iVar = new j(this);
            } else {
                iVar = new p0.i(this);
            }
            this.f16073e = iVar;
            return;
        }
        if (i10 == 12) {
            this.f16073e = new HashMap();
            return;
        }
        switch (i10) {
            case g.REMOTE_EXCEPTION /* 19 */:
                this.f16073e = new ArrayList();
                break;
            case g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                break;
            case g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                this.f16073e = null;
                break;
            case g.RECONNECTION_TIMED_OUT /* 22 */:
                b2 b2Var = new b2();
                this.f16073e = b2Var;
                b2Var.f13632d.add("B3EEABB8EE11C2BE770B684D95219ECB");
                break;
            default:
                this.f16073e = new HashSet();
                break;
        }
    }

    public c(Context context, Uri uri) {
        this.f16072b = 7;
        this.f16073e = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.f16072b = i10;
        this.f16073e = obj;
    }
}