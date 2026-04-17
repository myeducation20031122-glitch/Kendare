package t5;

import android.text.TextUtils;
import java.util.LinkedHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v3 extends t.f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w3 f17638f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(w3 w3Var) {
        super(20);
        this.f17638f = w3Var;
    }

    @Override // t.f
    public final Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        com.google.android.gms.internal.measurement.b2 b2Var;
        String str = (String) obj;
        fc.t.g(str);
        w3 w3Var = this.f17638f;
        w3Var.p();
        fc.t.g(str);
        boolean z7 = false;
        if (!TextUtils.isEmpty(str) && (b2Var = (com.google.android.gms.internal.measurement.b2) w3Var.f17656u.getOrDefault(str, null)) != null && b2Var.l() != 0) {
            z7 = true;
        }
        if (!z7) {
            return null;
        }
        if (!w3Var.f17656u.containsKey(str) || w3Var.f17656u.getOrDefault(str, null) == null) {
            w3Var.u(str);
        } else {
            w3Var.w(str, (com.google.android.gms.internal.measurement.b2) w3Var.f17656u.getOrDefault(str, null));
        }
        v3 v3Var = w3Var.M;
        synchronized (v3Var) {
            linkedHashMap = new LinkedHashMap(v3Var.f16982a);
        }
        return (com.google.android.gms.internal.measurement.g0) linkedHashMap.get(str);
    }
}