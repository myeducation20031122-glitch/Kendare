package p5;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.internal.measurement.l9;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.firebase.components.ComponentDiscoveryService;
import com.isprid.kendare.ui.main.MainActivity;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import m.s3;
import o0.c1;
import o0.m2;
import org.json.JSONArray;
import org.json.JSONException;
import t5.a6;
import t5.b4;
import t5.g3;
import t5.i3;
import t5.k3;
import t5.v4;
import t5.w3;
import t5.w5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m implements z4.l, a6, k3, x5.g, o0.z, g6.a, l.m, x5.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15960b;

    /* renamed from: e, reason: collision with root package name */
    public Object f15961e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m() {
        this(ComponentDiscoveryService.class, 11);
        this.f15960b = 11;
    }

    public static boolean l(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String o(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // t5.a6
    public final void a(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            ((v4) this.f15961e).getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        v4 v4Var = (v4) this.f15961e;
        ((b4) v4Var.f15046b).Q.getClass();
        v4Var.u("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    @Override // t5.k3
    public final void b(String str, int i10, Throwable th, byte[] bArr, Map map) {
        ((w5) this.f15961e).j(str, i10, th, bArr, map);
    }

    @Override // z4.l
    public final /* synthetic */ void c(Object obj) {
        switch (this.f15960b) {
            case 0:
                break;
            default:
                ((o) this.f15961e).f15963f.mo22zzb();
                break;
        }
    }

    @Override // z4.l
    public final void d() {
    }

    public final boolean e(String str) {
        String strK = k(str);
        return "1".equals(strK) || Boolean.parseBoolean(strK);
    }

    @Override // l.m
    public final boolean f(l.o oVar, MenuItem item) {
        ViewPager2 viewPager2;
        int i10;
        q6.l lVar = (q6.l) this.f15961e;
        int i11 = q6.l.f16307n;
        lVar.getClass();
        Object obj = this.f15961e;
        if (((q6.l) obj).f16312m == null) {
            return false;
        }
        MainActivity mainActivity = (MainActivity) ((q6.l) obj).f16312m;
        mainActivity.getClass();
        Intrinsics.f(item, "item");
        int itemId = item.getItemId();
        if (itemId == 2131296717) {
            q.d dVar = mainActivity.f11667f;
            if (dVar != null) {
                ((ViewPager2) dVar.f16091m).b(0, false);
                return false;
            }
            Intrinsics.n("binding");
            throw null;
        }
        if (itemId == 2131296720) {
            q.d dVar2 = mainActivity.f11667f;
            if (dVar2 != null) {
                ((ViewPager2) dVar2.f16091m).b(1, false);
                return false;
            }
            Intrinsics.n("binding");
            throw null;
        }
        if (itemId == 2131296719) {
            q.d dVar3 = mainActivity.f11667f;
            if (dVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            viewPager2 = (ViewPager2) dVar3.f16091m;
            i10 = 2;
        } else {
            if (itemId != 2131296718) {
                return true;
            }
            q.d dVar4 = mainActivity.f11667f;
            if (dVar4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            viewPager2 = (ViewPager2) dVar4.f16091m;
            i10 = 3;
        }
        viewPager2.b(i10, false);
        return false;
    }

    public final Integer g(String str) {
        String strK = k(str);
        if (TextUtils.isEmpty(strK)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strK));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + o(str) + "(" + strK + ") into an int");
            return null;
        }
    }

    public final JSONArray h(String str) {
        String strK = k(str);
        if (TextUtils.isEmpty(strK)) {
            return null;
        }
        try {
            return new JSONArray(strK);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + o(str) + ": " + strK + ", falling back to default");
            return null;
        }
    }

    @Override // o0.z
    public final m2 i(View view, m2 m2Var) {
        AppBarLayout appBarLayout = (AppBarLayout) this.f15961e;
        appBarLayout.getClass();
        WeakHashMap weakHashMap = c1.f15515a;
        m2 m2Var2 = appBarLayout.getFitsSystemWindows() ? m2Var : null;
        if (!Objects.equals(appBarLayout.f11317t, m2Var2)) {
            appBarLayout.f11317t = m2Var2;
            appBarLayout.setWillNotDraw(!(appBarLayout.f11307a0 != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return m2Var;
    }

    public final String j(Resources resources, String str, String str2) {
        String[] strArr;
        String strK = k(str2);
        if (!TextUtils.isEmpty(strK)) {
            return strK;
        }
        String strK2 = k(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strK2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strK2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", o(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayH = h(str2.concat("_loc_args"));
        if (jSONArrayH == null) {
            strArr = null;
        } else {
            int length = jSONArrayH.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = jSONArrayH.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + o(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e10);
            return null;
        }
    }

    public final String k(String str) {
        Bundle bundle = (Bundle) this.f15961e;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (((Bundle) this.f15961e).containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public final void m(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((x6.j) this.f15961e).a(0);
    }

    public final Bundle n() {
        Bundle bundle = new Bundle((Bundle) this.f15961e);
        for (String str : ((Bundle) this.f15961e).keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    @Override // x5.g
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ((x5.h) this.f15961e).onCanceled();
    }

    public final void p(int i10, String str, List list, boolean z7, boolean z10) {
        g3 g3Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            i3 i3Var = ((b4) ((w3) this.f15961e).f15046b).f17251w;
            b4.i(i3Var);
            g3Var = i3Var.P;
        } else if (i11 == 1) {
            b4 b4Var = (b4) ((w3) this.f15961e).f15046b;
            if (z7) {
                i3 i3Var2 = b4Var.f17251w;
                b4.i(i3Var2);
                g3Var = i3Var2.f17398t;
            } else if (z10) {
                i3 i3Var3 = b4Var.f17251w;
                b4.i(i3Var3);
                g3Var = i3Var3.f17397n;
            } else {
                i3 i3Var4 = b4Var.f17251w;
                b4.i(i3Var4);
                g3Var = i3Var4.f17399u;
            }
        } else if (i11 == 3) {
            i3 i3Var5 = ((b4) ((w3) this.f15961e).f15046b).f17251w;
            b4.i(i3Var5);
            g3Var = i3Var5.Q;
        } else if (i11 != 4) {
            i3 i3Var6 = ((b4) ((w3) this.f15961e).f15046b).f17251w;
            b4.i(i3Var6);
            g3Var = i3Var6.O;
        } else {
            b4 b4Var2 = (b4) ((w3) this.f15961e).f15046b;
            if (z7) {
                i3 i3Var7 = b4Var2.f17251w;
                b4.i(i3Var7);
                g3Var = i3Var7.M;
            } else if (z10) {
                i3 i3Var8 = b4Var2.f17251w;
                b4.i(i3Var8);
                g3Var = i3Var8.f17400w;
            } else {
                i3 i3Var9 = b4Var2.f17251w;
                b4.i(i3Var9);
                g3Var = i3Var9.N;
            }
        }
        int size = list.size();
        if (size == 1) {
            g3Var.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            g3Var.c(list.get(0), str, list.get(1));
        } else if (size != 3) {
            g3Var.a(str);
        } else {
            g3Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public final s3 q() {
        a2.f fVar = (a2.f) this.f15961e;
        if (fVar == null) {
            throw new IllegalStateException(String.valueOf(a2.f.class.getCanonicalName()).concat(" must be set"));
        }
        s3 s3Var = new s3();
        s3Var.f14927b = s3Var;
        c7.f fVar2 = new c7.f(fVar);
        s3Var.f14928e = fVar2;
        d7.c cVarA = d7.b.a(new a5.x(fVar2, 11));
        s3Var.f14929f = cVarA;
        s3Var.f14930j = d7.b.a(new l9((d7.c) s3Var.f14928e, cVarA, 10));
        d7.c cVarA2 = d7.b.a(new c7.d((d7.c) s3Var.f14928e, 0));
        s3Var.f14931m = cVarA2;
        d7.c cVarA3 = d7.b.a(new o5.d((d7.c) s3Var.f14930j, cVarA2, (d7.c) s3Var.f14928e, 7));
        s3Var.f14932n = cVarA3;
        s3Var.f14933t = d7.b.a(new c7.d(cVarA3, 1));
        return s3Var;
    }

    @Override // l.m
    public final void s(l.o oVar) {
    }

    @Override // x5.c
    public final /* bridge */ /* synthetic */ Object then(x5.k kVar) {
        return null;
    }

    public final String toString() {
        switch (this.f15960b) {
            case y4.g.INTERRUPTED /* 14 */:
                return ((Field) this.f15961e).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m(int i10) {
        this.f15960b = 10;
    }

    public /* synthetic */ m(int i10, Object obj) {
        this.f15960b = i10;
        this.f15961e = obj;
    }

    public m(Bundle bundle) {
        this.f15960b = 13;
        this.f15961e = new Bundle(bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this(materialButtonToggleGroup, 7);
        this.f15960b = 7;
    }

    public m(com.onesignal.l lVar) {
        this.f15960b = 16;
        this.f15961e = lVar;
    }

    public /* synthetic */ m(Object obj, int i10) {
        this.f15960b = i10;
        this.f15961e = obj;
    }

    public m(Field field) {
        this.f15960b = 14;
        Objects.requireNonNull(field);
        this.f15961e = field;
    }
}