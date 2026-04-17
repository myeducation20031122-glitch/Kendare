package g8;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.p0;
import androidx.lifecycle.z0;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.gms.internal.measurement.n3;
import g.u0;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import l.o;
import l.z;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.l;
import q2.n;
import s2.d0;
import s2.k;
import w2.a0;
import w2.j;
import w2.u;
import w2.v;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class e implements z, i1.a, j1.d, p.a, j3.a, u2.a, v2.c, v, q2.c, j, l, ErrorReporter, t2.d {

    /* renamed from: b, reason: collision with root package name */
    public static e f13092b;

    public e(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        jSONObject.optString("priceCurrencyCode");
        jSONObject.optString("offerIdToken").getClass();
        jSONObject.optString("offerId").getClass();
        jSONObject.optString("purchaseOptionId").getClass();
        jSONObject.optInt("offerType");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i10));
            }
        }
        com.google.android.gms.internal.play_billing.f.p(arrayList);
        if (jSONObject.has("fullPriceMicros")) {
            jSONObject.optLong("fullPriceMicros");
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
        if (jSONObjectOptJSONObject != null) {
            new e(jSONObjectOptJSONObject, 20);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
        if (jSONObjectOptJSONObject2 != null) {
            new v6.e(jSONObjectOptJSONObject2, 22);
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
        int i11 = 21;
        if (jSONObjectOptJSONObject3 != null) {
            new v6.e(jSONObjectOptJSONObject3, i11);
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
        if (jSONObjectOptJSONObject4 != null) {
            new e(jSONObjectOptJSONObject4, i11);
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
        if (jSONObjectOptJSONObject5 == null) {
            return;
        }
        jSONObjectOptJSONObject5.getString("rentalPeriod");
        jSONObjectOptJSONObject5.optString("rentalExpirationPeriod").getClass();
    }

    public static z0 A() {
        if (z0.f1276f == null) {
            z0.f1276f = new z0();
        }
        z0 z0Var = z0.f1276f;
        Intrinsics.c(z0Var);
        return z0Var;
    }

    public static Path C(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        return path;
    }

    public static /* synthetic */ void x(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "unresolvedSuperClasses";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        if (i10 != 2) {
            objArr[2] = "reportIncompleteHierarchy";
        } else {
            objArr[2] = "reportCannotInferVisibility";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static o1.e y(o1.f owner) {
        Intrinsics.f(owner, "owner");
        return new o1.e(owner);
    }

    public static p0 z(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new p0();
            }
            HashMap map = new HashMap();
            for (String key : bundle2.keySet()) {
                Intrinsics.e(key, "key");
                map.put(key, bundle2.get(key));
            }
            return new p0(map);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = parcelableArrayList.get(i10);
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
        }
        return new p0(linkedHashMap);
    }

    public KeyListener B(KeyListener keyListener) {
        return keyListener;
    }

    public boolean D(Spannable spannable) {
        return false;
    }

    public InputConnection E(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection;
    }

    public void F(boolean z7) {
    }

    public void G(boolean z7) {
    }

    public void H(boolean z7) {
    }

    public void I(n3 n3Var, float f10) {
        s.a aVar = (s.a) ((Drawable) n3Var.f10909e);
        boolean useCompatPadding = ((CardView) n3Var.f10910f).getUseCompatPadding();
        boolean preventCornerOverlap = ((CardView) n3Var.f10910f).getPreventCornerOverlap();
        if (f10 != aVar.f16672e || aVar.f16673f != useCompatPadding || aVar.f16674g != preventCornerOverlap) {
            aVar.f16672e = f10;
            aVar.f16673f = useCompatPadding;
            aVar.f16674g = preventCornerOverlap;
            aVar.b(null);
            aVar.invalidateSelf();
        }
        if (!((CardView) n3Var.f10910f).getUseCompatPadding()) {
            n3Var.E(0, 0, 0, 0);
            return;
        }
        s.a aVar2 = (s.a) ((Drawable) n3Var.f10909e);
        float f11 = aVar2.f16672e;
        float f12 = aVar2.f16668a;
        int iCeil = (int) Math.ceil(s.b.a(f11, f12, ((CardView) n3Var.f10910f).getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(s.b.b(f11, f12, ((CardView) n3Var.f10910f).getPreventCornerOverlap()));
        n3Var.E(iCeil, iCeil2, iCeil, iCeil2);
    }

    public void J() {
    }

    @Override // w2.j
    public Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // p.a
    public Object apply(Object obj) {
        return null;
    }

    @Override // t2.d
    public Bitmap b(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // t2.d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // l.z
    public void d(o oVar, boolean z7) {
    }

    @Override // u2.a
    public void e(q2.j jVar, k kVar) {
    }

    @Override // q2.l
    public void f(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // t2.d
    public Bitmap g(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // q2.c
    public boolean h(Object obj, File file, n nVar) {
        try {
            i3.c.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }

    @Override // u2.a
    public File i(q2.j jVar) {
        return null;
    }

    public void j(AbstractClassDescriptor abstractClassDescriptor, ArrayList arrayList) {
        if (abstractClassDescriptor != null) {
            return;
        }
        x(0);
        throw null;
    }

    @Override // j3.a
    public Object k() {
        return new d0();
    }

    @Override // l.z
    public boolean l(o oVar) {
        return false;
    }

    @Override // i1.a
    public CharSequence m(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        return TextUtils.isEmpty(listPreference.j()) ? listPreference.f1287b.getString(2131886812) : listPreference.j();
    }

    @Override // v2.c
    public void o(Throwable th) {
        if (Log.isLoggable("GlideExecutor", 6)) {
            Log.e("GlideExecutor", "Request threw uncaught throwable", th);
        }
    }

    @Override // t2.d
    public void p(int i10) {
    }

    @Override // w2.j
    public Object q(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // j1.d
    public void r() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void s(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor != null) {
            return;
        }
        x(2);
        throw null;
    }

    @Override // t2.d
    public void t() {
    }

    @Override // j1.d
    public void u(int i10, Object obj) {
        String str;
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case y4.g.NETWORK_ERROR /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // w2.v
    public u v(a0 a0Var) {
        return new w2.e(new u0(this, 20), 0);
    }

    @Override // w2.j
    public void w(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    public /* synthetic */ e(JSONObject jSONObject, int i10) throws JSONException {
        if (i10 != 21) {
            jSONObject.getInt("percentageDiscount");
        } else {
            jSONObject.getLong("preorderReleaseTimeMillis");
            jSONObject.getLong("preorderPresaleEndTimeMillis");
        }
    }
}