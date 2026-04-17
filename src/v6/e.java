package v6;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;
import androidx.emoji2.text.f0;
import androidx.fragment.app.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.y0;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.android.gms.internal.ads.as0;
import com.google.android.gms.internal.ads.bs0;
import com.google.android.gms.internal.ads.c01;
import com.google.android.gms.internal.ads.d0;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.ds0;
import com.google.android.gms.internal.ads.fs0;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.if0;
import com.google.android.gms.internal.ads.is0;
import com.google.android.gms.internal.ads.jb1;
import com.google.android.gms.internal.ads.kz;
import com.google.android.gms.internal.ads.l40;
import com.google.android.gms.internal.ads.lk;
import com.google.android.gms.internal.ads.ls0;
import com.google.android.gms.internal.ads.n31;
import com.google.android.gms.internal.ads.ne0;
import com.google.android.gms.internal.ads.ns0;
import com.google.android.gms.internal.ads.rv0;
import com.google.android.gms.internal.ads.s31;
import com.google.android.gms.internal.ads.s91;
import com.google.android.gms.internal.ads.sr0;
import com.google.android.gms.internal.ads.ss0;
import com.google.android.gms.internal.ads.te0;
import com.google.android.gms.internal.ads.tr0;
import com.google.android.gms.internal.ads.un0;
import com.google.android.gms.internal.ads.ur0;
import com.google.android.gms.internal.ads.uv0;
import com.google.android.gms.internal.ads.vr0;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.xr0;
import com.google.android.gms.internal.ads.yr0;
import com.google.android.gms.internal.ads.zr0;
import com.google.android.gms.internal.play_billing.e3;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import l4.b0;
import m.s3;
import org.json.JSONException;
import org.json.JSONObject;
import w2.a0;
import w2.v;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class e implements i1.a, j1.d, p1.c, o3.e, v2.c, v, b1, lk, c01, jb1, uv0, n31, s91, ReceiverValue {

    /* renamed from: e, reason: collision with root package name */
    public static e f18415e;

    /* renamed from: f, reason: collision with root package name */
    public static e f18416f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18417b;

    public /* synthetic */ e() {
        this.f18417b = 16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A(View view, h5.a aVar) {
        if (((Boolean) j4.q.f13781d.f13784c.a(ge.f4718i4)).booleanValue() && dq0.f3751e.f3498e) {
            Object objR3 = h5.b.r3(aVar);
            if (objR3 instanceof sr0) {
                ur0 ur0Var = (ur0) ((sr0) objR3);
                if (ur0Var.f9147f || ((View) ur0Var.f9144c.get()) == view) {
                    return;
                }
                ur0Var.f9144c = new ss0(view);
                is0 is0Var = ur0Var.f9145d;
                is0Var.getClass();
                is0Var.f5451b = System.nanoTime();
                is0Var.f5452c = 1;
                Collection<ur0> collectionUnmodifiableCollection = Collections.unmodifiableCollection(as0.f2795c.f2796a);
                if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
                    return;
                }
                for (ur0 ur0Var2 : collectionUnmodifiableCollection) {
                    if (ur0Var2 != ur0Var && ((View) ur0Var2.f9144c.get()) == view) {
                        ur0Var2.f9144c.clear();
                    }
                }
            }
        }
    }

    public static boolean C(Context context) {
        if (!((Boolean) j4.q.f13781d.f13784c.a(ge.f4718i4)).booleanValue()) {
            wr.g("Omid flag is disabled");
            return false;
        }
        d0 d0Var = dq0.f3751e;
        if (d0Var.f3498e) {
            return true;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Application Context cannot be null");
        }
        if (!d0Var.f3498e) {
            d0Var.f3498e = true;
            fs0 fs0VarA = fs0.a();
            fs0VarA.getClass();
            fs0VarA.f4419d = new zr0(new Handler(), applicationContext, fs0VarA);
            bs0 bs0Var = bs0.f3082j;
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(bs0Var);
            }
            WindowManager windowManager = ls0.f6371a;
            ls0.f6373c = applicationContext.getResources().getDisplayMetrics().density;
            ls0.f6371a = (WindowManager) applicationContext.getSystemService("window");
            ds0.f3788e.f3789b = applicationContext.getApplicationContext();
        }
        return d0Var.f3498e;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vr0 D(String str) {
        char c10;
        int iHashCode = str.hashCode();
        if (iHashCode != -382745961) {
            if (iHashCode != 112202875) {
                c10 = (iHashCode == 714893483 && str.equals("nativeDisplay")) ? (char) 1 : (char) 65535;
            } else if (str.equals("video")) {
                c10 = 2;
            }
        } else if (str.equals("htmlDisplay")) {
            c10 = 0;
        }
        if (c10 == 0) {
            return vr0.HTML_DISPLAY;
        }
        if (c10 == 1) {
            return vr0.NATIVE_DISPLAY;
        }
        if (c10 != 2) {
            return null;
        }
        return vr0.VIDEO;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xr0 E(String str) {
        char c10;
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                c10 = (iHashCode == 1988248512 && str.equals("onePixel")) ? (char) 2 : (char) 65535;
            } else if (str.equals("definedByJavascript")) {
                c10 = 1;
            }
        } else if (str.equals("beginToRender")) {
            c10 = 0;
        }
        return c10 != 0 ? c10 != 1 ? c10 != 2 ? xr0.UNSPECIFIED : xr0.ONE_PIXEL : xr0.DEFINED_BY_JAVASCRIPT : xr0.BEGIN_TO_RENDER;
    }

    public static yr0 F(String str) {
        return "native".equals(str) ? yr0.NATIVE : "javascript".equals(str) ? yr0.JAVASCRIPT : yr0.NONE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(Activity activity, androidx.lifecycle.m event) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(event, "event");
        if (activity instanceof androidx.lifecycle.t) {
            androidx.lifecycle.o lifecycle = ((androidx.lifecycle.t) activity).getLifecycle();
            if (lifecycle instanceof androidx.lifecycle.v) {
                ((androidx.lifecycle.v) lifecycle).e(event);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0088, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0072 A[EDGE_INSN: B:91:0x0072->B:48:0x0072 BREAK  A[LOOP:2: B:49:0x0074->B:60:0x008b, LOOP_LABEL: LOOP:2: B:49:0x0074->B:60:0x008b], EDGE_INSN: B:94:0x0072->B:48:0x0072 BREAK  A[LOOP:2: B:49:0x0074->B:60:0x008b]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a8 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean n(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z7) {
        int iMin;
        Object obj = androidx.emoji2.text.l.f866j;
        if (editable == null || inputConnection == null || i10 < 0 || i11 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z7) {
            int iMax = Math.max(i10, 0);
            int length = editable.length();
            if (selectionStart < 0 || length < selectionStart || iMax < 0) {
                selectionStart = -1;
                int iMax2 = Math.max(i11, 0);
                iMin = editable.length();
                if (selectionEnd < 0 && iMin >= selectionEnd && iMax2 >= 0) {
                    loop2: while (true) {
                        boolean z10 = false;
                        while (true) {
                            if (iMax2 == 0) {
                                iMin = selectionEnd;
                                break loop2;
                            }
                            if (selectionEnd >= iMin) {
                                if (z10) {
                                    break loop2;
                                }
                            } else {
                                char cCharAt = editable.charAt(selectionEnd);
                                if (z10) {
                                    break;
                                }
                                if (!Character.isSurrogate(cCharAt)) {
                                    iMax2--;
                                    selectionEnd++;
                                } else {
                                    if (Character.isLowSurrogate(cCharAt)) {
                                        break loop2;
                                    }
                                    selectionEnd++;
                                    z10 = true;
                                }
                            }
                        }
                        iMax2--;
                        selectionEnd++;
                    }
                    iMin = -1;
                    return selectionStart == -1 ? false : false;
                }
                iMin = -1;
                if (selectionStart == -1 || iMin == -1) {
                }
            } else {
                loop0: while (true) {
                    boolean z11 = false;
                    while (true) {
                        if (iMax == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart >= 0) {
                            char cCharAt2 = editable.charAt(selectionStart);
                            if (z11) {
                                break;
                            }
                            if (!Character.isSurrogate(cCharAt2)) {
                                iMax--;
                            } else {
                                if (Character.isHighSurrogate(cCharAt2)) {
                                    break loop0;
                                }
                                z11 = true;
                            }
                        } else {
                            if (z11) {
                                break;
                            }
                            selectionStart = 0;
                        }
                    }
                    iMax--;
                }
                selectionStart = -1;
                int iMax22 = Math.max(i11, 0);
                iMin = editable.length();
                if (selectionEnd < 0) {
                    iMin = -1;
                    if (selectionStart == -1) {
                    }
                }
            }
        } else {
            selectionStart = Math.max(selectionStart - i10, 0);
            iMin = Math.min(selectionEnd + i11, editable.length());
        }
        f0[] f0VarArr = (f0[]) editable.getSpans(selectionStart, iMin, f0.class);
        if (f0VarArr == null || f0VarArr.length <= 0) {
            return false;
        }
        for (f0 f0Var : f0VarArr) {
            int spanStart = editable.getSpanStart(f0Var);
            int spanEnd = editable.getSpanEnd(f0Var);
            selectionStart = Math.min(spanStart, selectionStart);
            iMin = Math.max(spanEnd, iMin);
        }
        int iMax3 = Math.max(selectionStart, 0);
        int iMin2 = Math.min(iMin, editable.length());
        inputConnection.beginBatchEdit();
        editable.delete(iMax3, iMin2);
        inputConnection.endBatchEdit();
        return true;
    }

    public static void p(Activity activity) {
        Intrinsics.f(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            m0.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new m0());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new n0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static h5.b z(String str, WebView webView, String str2, int i10, int i11, String str3) {
        String strValueOf;
        String str4;
        String strConcat;
        if (!((Boolean) j4.q.f13781d.f13784c.a(ge.f4718i4)).booleanValue()) {
            return null;
        }
        d0 d0Var = dq0.f3751e;
        if (!d0Var.f3498e) {
            return null;
        }
        String str5 = "Google";
        if (TextUtils.isEmpty("Google")) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        l40 l40Var = new l40(str5, 2, str);
        yr0 yr0VarF = F("javascript");
        vr0 vr0VarD = D(a0.h.f(i11));
        yr0 yr0Var = yr0.NONE;
        if (yr0VarF == yr0Var) {
            strConcat = "Omid html session error; Unable to parse impression owner: javascript";
        } else {
            if (vr0VarD == null) {
                strValueOf = a0.h.K(i11);
                str4 = "Omid html session error; Unable to parse creative type: ";
            } else {
                yr0 yr0VarF2 = F(str2);
                if (vr0VarD != vr0.VIDEO || yr0VarF2 != yr0Var) {
                    s3 s3Var = new s3(l40Var, webView, str3, tr0.HTML);
                    un0 un0VarD = un0.D(vr0VarD, E(a0.h.g(i10)), yr0VarF, yr0VarF2);
                    if (d0Var.f3498e) {
                        return new h5.b(new ur0(un0VarD, s3Var));
                    }
                    throw new IllegalStateException("Method called before OM SDK activation");
                }
                strValueOf = String.valueOf(str2);
                str4 = "Omid html session error; Video events owner unknown for video creative: ";
            }
            strConcat = str4.concat(strValueOf);
        }
        wr.g(strConcat);
        return null;
    }

    public void B(h5.a aVar) {
        if (((Boolean) j4.q.f13781d.f13784c.a(ge.f4718i4)).booleanValue() && dq0.f3751e.f3498e) {
            Object objR3 = h5.b.r3(aVar);
            if (objR3 instanceof sr0) {
                ur0 ur0Var = (ur0) ((sr0) objR3);
                if (ur0Var.f9146e) {
                    return;
                }
                ur0Var.f9146e = true;
                as0 as0Var = as0.f2795c;
                boolean z7 = as0Var.f2797b.size() > 0;
                as0Var.f2797b.add(ur0Var);
                if (!z7) {
                    fs0 fs0VarA = fs0.a();
                    fs0VarA.getClass();
                    bs0 bs0Var = bs0.f3082j;
                    bs0Var.f3085f = fs0VarA;
                    bs0Var.f3083b = true;
                    bs0Var.f3084e = false;
                    bs0Var.a();
                    ns0.f6900g.getClass();
                    ns0.b();
                    zr0 zr0Var = (zr0) fs0VarA.f4419d;
                    zr0Var.f10594c = zr0Var.a();
                    zr0Var.b();
                    zr0Var.f10592a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, zr0Var);
                }
                dq0.T0(ur0Var.f9145d.a(), "setDeviceVolume", Float.valueOf(fs0.a().f4416a));
                ur0Var.f9145d.c(ur0Var, ur0Var.f9142a);
            }
        }
    }

    public KotlinType a() {
        switch (this.f18417b) {
            case 0:
                throw new IllegalStateException("This method should not be called");
            case QueueFuseable.SYNC /* 1 */:
                throw new IllegalStateException("This method should not be called");
            default:
                throw new IllegalStateException("This method should not be called");
        }
    }

    @Override // o3.e
    public Object apply(Object obj) {
        return ((e3) obj).b();
    }

    @Override // com.google.android.gms.internal.ads.s91
    public /* bridge */ /* synthetic */ Object c(String str, Provider provider) {
        switch (this.f18417b) {
            case 26:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 27:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 28:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            default:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
        }
    }

    @Override // androidx.lifecycle.b1
    public y0 create(Class cls) {
        switch (this.f18417b) {
            case 0:
                return new a1(true);
            default:
                return new g1.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.n31
    public byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        if0 if0Var = new if0(bArr, 0);
        int length = bArr3.length;
        if (length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 16);
        if0Var.h(byteBufferAllocate, bArr2, bArr3, bArr4);
        return byteBufferAllocate.array();
    }

    @Override // com.google.android.gms.internal.ads.uv0
    public /* synthetic */ rv0 e(kz kzVar, CharSequence charSequence) {
        return new rv0(this, kzVar, charSequence, 1);
    }

    @Override // p1.c
    public p1.d f(p1.b bVar) {
        return new q1.e(bVar.f15866a, bVar.f15867b, bVar.f15868c, bVar.f15869d);
    }

    public InputFilter[] i(InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }

    public ProviderInfo k(ResolveInfo resolveInfo) {
        throw new IllegalStateException("Unable to get provider info prior to API 19");
    }

    public Signature[] l(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // i1.a
    public CharSequence m(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        editTextPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.f1287b.getString(2131886812);
        }
        return null;
    }

    @Override // v2.c
    public void o(Throwable th) {
        switch (this.f18417b) {
            case 26:
                return;
            default:
                throw new RuntimeException("Request threw uncaught throwable", th);
        }
    }

    public boolean q() {
        return false;
    }

    @Override // j1.d
    public void r() {
    }

    public List s(PackageManager packageManager, Intent intent) {
        return Collections.emptyList();
    }

    public void t(boolean z7) {
    }

    @Override // j1.d
    public void u(int i10, Object obj) {
    }

    @Override // w2.v
    public w2.u v(a0 a0Var) {
        return new w2.e(new p8.c(this, 16), 0);
    }

    public void w(boolean z7) {
    }

    public void x() {
    }

    public TransformationMethod y(TransformationMethod transformationMethod) {
        return transformationMethod;
    }

    @Override // com.google.android.gms.internal.ads.n31
    public int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.lk
    public JSONObject zzb(Object obj) throws JSONException {
        ne0 ne0Var = (ne0) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) j4.q.f13781d.f13784c.a(ge.Q7)).booleanValue()) {
            jSONObject2.put("ad_request_url", ne0Var.f6802c.f7797f);
            jSONObject2.put("ad_request_post_body", ne0Var.f6802c.f7794c);
        }
        jSONObject2.put("base_url", ne0Var.f6802c.f7793b);
        jSONObject2.put("signals", ne0Var.f6801b);
        te0 te0Var = ne0Var.f6800a;
        jSONObject3.put("body", te0Var.f8737c);
        jSONObject3.put("headers", j4.o.f13771f.f13772a.g(te0Var.f8736b));
        jSONObject3.put("response_code", te0Var.f8735a);
        jSONObject3.put("latency", te0Var.f8738d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", ne0Var.f6802c.f7799h);
        return jSONObject;
    }

    public /* synthetic */ e(int i10) {
        this.f18417b = i10;
    }

    @Override // com.google.android.gms.internal.ads.c01
    public void zza(Throwable th) {
        b0.k("Notification of cache hit failed.");
    }

    public /* synthetic */ e(int i10, int i11) {
        this.f18417b = i10;
    }

    @Override // androidx.lifecycle.b1
    public y0 create(Class cls, f1.b bVar) {
        switch (this.f18417b) {
        }
        return create(cls);
    }

    public /* synthetic */ e(int i10, Object obj) {
        this.f18417b = i10;
    }

    public /* synthetic */ e(JSONObject jSONObject, int i10) throws JSONException {
        this.f18417b = i10;
        if (i10 != 22) {
            jSONObject.getInt("maximumQuantity");
            jSONObject.getInt("remainingQuantity");
        } else {
            jSONObject.getLong("startTimeMillis");
            jSONObject.getLong("endTimeMillis");
        }
    }

    @Override // com.google.android.gms.internal.ads.c01
    /* renamed from: zzb, reason: collision with other method in class */
    public /* synthetic */ void mo28zzb(Object obj) {
        b0.k("Notification of cache hit successful.");
    }

    @Override // com.google.android.gms.internal.ads.n31
    public byte[] zzb() {
        return s31.f8287k;
    }
}