package g2;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.emoji2.text.e0;
import androidx.lifecycle.b0;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.h3;
import com.google.android.gms.internal.measurement.k9;
import com.google.android.gms.internal.measurement.l9;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.o3;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import l.d0;
import l.o;
import l.v;
import l1.p;
import l1.t;
import n8.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p5.m;
import t.k;
import t5.b4;
import t5.i3;
import t5.q3;
import t7.p0;
import v.i;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h implements k.a, t3.b {

    /* renamed from: m, reason: collision with root package name */
    public static h f13010m;

    /* renamed from: b, reason: collision with root package name */
    public Object f13011b;

    /* renamed from: e, reason: collision with root package name */
    public Object f13012e;

    /* renamed from: f, reason: collision with root package name */
    public Object f13013f;

    /* renamed from: j, reason: collision with root package name */
    public Object f13014j;

    public h(int i10) {
        if (i10 == 7) {
            this.f13014j = Collections.emptyList();
            return;
        }
        if (i10 != 8) {
            if (i10 != 11) {
                this.f13011b = new v.e(256, 0);
                this.f13012e = new v.e(256, 0);
                this.f13013f = new v.e(256, 0);
                this.f13014j = new i[32];
                return;
            }
            return;
        }
        d3.d dVar = new d3.d(28);
        this.f13011b = dVar;
        s sVar = new s((s) null, dVar);
        this.f13013f = sVar;
        this.f13012e = sVar.i();
        b0 b0Var = new b0(2);
        this.f13014j = b0Var;
        ((s) this.f13013f).n("require", new k9(b0Var));
        b0 b0Var2 = (b0) this.f13014j;
        b0Var2.f1199a.put("internal.platform", h1.f10807b);
        ((s) this.f13013f).n("runtime.counter", new com.google.android.gms.internal.measurement.g(Double.valueOf(0.0d)));
    }

    public static synchronized h i(Context context, l2.a aVar) {
        try {
            if (f13010m == null) {
                h hVar = new h();
                Context applicationContext = context.getApplicationContext();
                hVar.f13011b = new a(applicationContext, aVar);
                hVar.f13012e = new b(applicationContext, aVar);
                hVar.f13013f = new f(applicationContext, aVar);
                hVar.f13014j = new g(applicationContext, aVar);
                f13010m = hVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13010m;
    }

    @Override // k.a
    public final boolean a(k.b bVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f13011b).onActionItemClicked(h(bVar), new v((Context) this.f13012e, (j0.b) menuItem));
    }

    @Override // k.a
    public final boolean b(k.b bVar, o oVar) {
        return ((ActionMode.Callback) this.f13011b).onPrepareActionMode(h(bVar), j(oVar));
    }

    @Override // k.a
    public final boolean c(k.b bVar, o oVar) {
        return ((ActionMode.Callback) this.f13011b).onCreateActionMode(h(bVar), j(oVar));
    }

    @Override // k.a
    public final void d(k.b bVar) {
        ((ActionMode.Callback) this.f13011b).onDestroyActionMode(h(bVar));
    }

    public final p0 e() {
        String strF = ((Integer) this.f13011b) == null ? " platform" : "";
        if (((String) this.f13012e) == null) {
            strF = strF.concat(" version");
        }
        if (((String) this.f13013f) == null) {
            strF = a0.h.F(strF, " buildVersion");
        }
        if (((Boolean) this.f13014j) == null) {
            strF = a0.h.F(strF, " jailbroken");
        }
        if (strF.isEmpty()) {
            return new p0(((Integer) this.f13011b).intValue(), (String) this.f13012e, (String) this.f13013f, ((Boolean) this.f13014j).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strF));
    }

    public final void f(String str) {
        ((p) this.f13011b).b();
        q1.g gVarA = ((t) this.f13013f).a();
        if (str == null) {
            gVarA.d(1);
        } else {
            gVarA.e(1, str);
        }
        ((p) this.f13011b).c();
        try {
            gVarA.f();
            ((p) this.f13011b).h();
        } finally {
            ((p) this.f13011b).f();
            ((t) this.f13013f).c(gVarA);
        }
    }

    public final void g() {
        ((p) this.f13011b).b();
        q1.g gVarA = ((t) this.f13014j).a();
        ((p) this.f13011b).c();
        try {
            gVarA.f();
            ((p) this.f13011b).h();
        } finally {
            ((p) this.f13011b).f();
            ((t) this.f13014j).c(gVarA);
        }
    }

    @Override // da.a
    public final Object get() {
        Context context = (Context) ((da.a) this.f13011b).get();
        x3.d dVar = (x3.d) ((da.a) this.f13012e).get();
        w3.b bVar = (w3.b) ((da.a) this.f13013f).get();
        return new w3.d(context, dVar, bVar);
    }

    public final k.f h(k.b bVar) {
        int size = ((ArrayList) this.f13013f).size();
        for (int i10 = 0; i10 < size; i10++) {
            k.f fVar = (k.f) ((ArrayList) this.f13013f).get(i10);
            if (fVar != null && fVar.f13892b == bVar) {
                return fVar;
            }
        }
        k.f fVar2 = new k.f((Context) this.f13012e, bVar);
        ((ArrayList) this.f13013f).add(fVar2);
        return fVar2;
    }

    public final Menu j(o oVar) {
        Menu menu = (Menu) ((k) this.f13014j).getOrDefault(oVar, null);
        if (menu != null) {
            return menu;
        }
        d0 d0Var = new d0((Context) this.f13012e, oVar);
        ((k) this.f13014j).put(oVar, d0Var);
        return d0Var;
    }

    public final void k(i2.g gVar) {
        ((p) this.f13011b).b();
        ((p) this.f13011b).c();
        try {
            ((l1.b) this.f13012e).e(gVar);
            ((p) this.f13011b).h();
        } finally {
            ((p) this.f13011b).f();
        }
    }

    public final x5.s l(Callable callable) {
        x5.s sVarE;
        synchronized (this.f13013f) {
            sVarE = ((x5.k) this.f13012e).e((Executor) this.f13011b, new l9(14, this, callable));
            this.f13012e = sVarE.e((Executor) this.f13011b, new m(this, 12));
        }
        return sVarE;
    }

    public final x5.s m(Callable callable) {
        x5.s sVarF;
        synchronized (this.f13013f) {
            sVarF = ((x5.k) this.f13012e).f((Executor) this.f13011b, new l9(14, this, callable));
            this.f13012e = sVarF.e((Executor) this.f13011b, new m(this, 12));
        }
        return sVarF;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4 A[Catch: NumberFormatException | JSONException -> 0x00ac, NumberFormatException | JSONException -> 0x00ac, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x00ac, blocks: (B:10:0x002d, B:32:0x0077, B:32:0x0077, B:33:0x008c, B:33:0x008c, B:34:0x0098, B:34:0x0098, B:35:0x00a4, B:35:0x00a4), top: B:49:0x002d, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle n() throws JSONException {
        char c10;
        if (((Bundle) this.f13013f) == null) {
            String string = ((q3) this.f13014j).s().getString((String) this.f13011b, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode == 100) {
                                if (string3.equals("d")) {
                                    c10 = 1;
                                }
                                if (c10 == 0) {
                                }
                            } else if (iHashCode != 108) {
                                c10 = (iHashCode == 115 && string3.equals("s")) ? (char) 0 : (char) 65535;
                                if (c10 == 0) {
                                    bundle.putString(string2, jSONObject.getString("v"));
                                } else if (c10 == 1) {
                                    bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                                } else if (c10 != 2) {
                                    i3 i3Var = ((b4) ((q3) this.f13014j).f15046b).f17251w;
                                    b4.i(i3Var);
                                    i3Var.f17397n.b(string3, "Unrecognized persisted bundle type. Type");
                                } else {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                }
                            } else {
                                if (string3.equals("l")) {
                                    c10 = 2;
                                }
                                if (c10 == 0) {
                                }
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            i3 i3Var2 = ((b4) ((q3) this.f13014j).f15046b).f17251w;
                            b4.i(i3Var2);
                            i3Var2.f17397n.a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f13013f = bundle;
                } catch (JSONException unused2) {
                    i3 i3Var3 = ((b4) ((q3) this.f13014j).f15046b).f17251w;
                    b4.i(i3Var3);
                    i3Var3.f17397n.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f13013f) == null) {
                this.f13013f = (Bundle) this.f13012e;
            }
        }
        return (Bundle) this.f13013f;
    }

    public final n o(s sVar, h3... h3VarArr) {
        n nVarD = n.f10899l;
        for (h3 h3Var : h3VarArr) {
            nVarD = o3.d(h3Var);
            o3.q((s) this.f13013f);
            if ((nVarD instanceof com.google.android.gms.internal.measurement.o) || (nVarD instanceof com.google.android.gms.internal.measurement.m)) {
                nVarD = ((d3.d) this.f13011b).j(sVar, nVarD);
            }
        }
        return nVarD;
    }

    public final void p(Bundle bundle) throws JSONException {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor editorEdit = ((q3) this.f13014j).s().edit();
        if (bundle.size() == 0) {
            editorEdit.remove((String) this.f13011b);
        } else {
            String str2 = (String) this.f13011b;
            JSONArray jSONArray = new JSONArray();
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str3);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            str = "s";
                        } else if (obj instanceof Long) {
                            str = "l";
                        } else if (obj instanceof Double) {
                            str = "d";
                        } else {
                            i3 i3Var = ((b4) ((q3) this.f13014j).f15046b).f17251w;
                            b4.i(i3Var);
                            i3Var.f17397n.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONObject.put("t", str);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        i3 i3Var2 = ((b4) ((q3) this.f13014j).f15046b).f17251w;
                        b4.i(i3Var2);
                        i3Var2.f17397n.b(e10, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str2, jSONArray.toString());
        }
        editorEdit.apply();
        this.f13013f = bundle;
    }

    public h(Typeface typeface, y0.b bVar) {
        int i10;
        int i11;
        this.f13014j = typeface;
        this.f13011b = bVar;
        this.f13013f = new androidx.emoji2.text.b0(1024);
        y0.b bVar2 = (y0.b) this.f13011b;
        int iA = bVar2.a(6);
        if (iA != 0) {
            int i12 = iA + bVar2.f19189a;
            i10 = ((ByteBuffer) bVar2.f19192d).getInt(((ByteBuffer) bVar2.f19192d).getInt(i12) + i12);
        } else {
            i10 = 0;
        }
        this.f13012e = new char[i10 * 2];
        y0.b bVar3 = (y0.b) this.f13011b;
        int iA2 = bVar3.a(6);
        if (iA2 != 0) {
            int i13 = iA2 + bVar3.f19189a;
            i11 = ((ByteBuffer) bVar3.f19192d).getInt(((ByteBuffer) bVar3.f19192d).getInt(i13) + i13);
        } else {
            i11 = 0;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            e0 e0Var = new e0(this, i14);
            y0.a aVarC = e0Var.c();
            int iA3 = aVarC.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarC.f19192d).getInt(iA3 + aVarC.f19189a) : 0, (char[]) this.f13012e, i14 * 2);
            g5.a.b("invalid metadata codepoint length", e0Var.b() > 0);
            ((androidx.emoji2.text.b0) this.f13013f).a(e0Var, 0, e0Var.b() - 1);
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f13011b = obj;
        this.f13012e = obj2;
        this.f13013f = obj3;
        this.f13014j = obj4;
    }
}