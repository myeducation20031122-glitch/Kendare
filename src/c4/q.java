package c4;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.wr;
import j4.h3;
import j4.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f2127a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2128b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final j f2129c;

    public q(u1 u1Var) {
        this.f2127a = u1Var;
        if (u1Var != null) {
            try {
                List<h3> listZzj = u1Var.zzj();
                if (listZzj != null) {
                    for (h3 h3Var : listZzj) {
                        j jVar = h3Var != null ? new j(h3Var) : null;
                        if (jVar != null) {
                            this.f2128b.add(jVar);
                        }
                    }
                }
            } catch (RemoteException e10) {
                wr.e("Could not forward getAdapterResponseInfo to ResponseInfo.", e10);
            }
        }
        u1 u1Var2 = this.f2127a;
        if (u1Var2 == null) {
            return;
        }
        try {
            h3 h3VarZzf = u1Var2.zzf();
            if (h3VarZzf != null) {
                this.f2129c = new j(h3VarZzf);
            }
        } catch (RemoteException e11) {
            wr.e("Could not forward getLoadedAdapterResponse to ResponseInfo.", e11);
        }
    }

    public final JSONObject a() throws JSONException {
        String strZzi;
        Bundle bundleZze;
        JSONObject jSONObject = new JSONObject();
        u1 u1Var = this.f2127a;
        String strZzg = null;
        if (u1Var != null) {
            try {
                strZzi = u1Var.zzi();
            } catch (RemoteException e10) {
                wr.e("Could not forward getResponseId to ResponseInfo.", e10);
            }
        } else {
            strZzi = null;
        }
        if (strZzi == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strZzi);
        }
        if (u1Var != null) {
            try {
                strZzg = u1Var.zzg();
            } catch (RemoteException e11) {
                wr.e("Could not forward getMediationAdapterClassName to ResponseInfo.", e11);
            }
        }
        if (strZzg == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strZzg);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f2128b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((j) it.next()).a());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        j jVar = this.f2129c;
        if (jVar != null) {
            jSONObject.put("Loaded Adapter Response", jVar.a());
        }
        if (u1Var != null) {
            try {
                bundleZze = u1Var.zze();
            } catch (RemoteException e12) {
                wr.e("Could not forward getResponseExtras to ResponseInfo.", e12);
            }
        } else {
            bundleZze = new Bundle();
        }
        if (bundleZze != null) {
            jSONObject.put("Response Extras", j4.o.f13771f.f13772a.f(bundleZze));
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}